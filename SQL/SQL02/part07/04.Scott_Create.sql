ALTER SESSION SET NLS_LANGUAGE=American;

ALTER TABLE EMP DROP CONSTRAINT FK_DEPTNO;

ALTER TABLE EMP DROP CONSTRAINT PK_EMP;

ALTER TABLE DEPT DROP CONSTRAINT PK_DEPT;

DROP INDEX PK_DEPT;

DROP INDEX PK_EMP;

DROP TABLE SALGRADE;

DROP TABLE DEPT;

DROP TABLE EMP;

DROP TABLE BONUS;

CREATE TABLE SALGRADE (
	GRADE NUMBER,
         LOSAL NUMBER,
         HISAL NUMBER
);

CREATE TABLE DEPT (
	DEPTNO NUMBER(2),
        DNAME VARCHAR2(14),
        LOC VARCHAR2(13)
);

CREATE TABLE EMP (
	EMPNO NUMBER(4) NOT NULL,
        ENAME VARCHAR2(10),
        JOB VARCHAR2(9),
        MGR NUMBER(4),
        HIREDATE DATE,
        SAL NUMBER(7, 2),
        COMM NUMBER(7, 2),
        DEPTNO NUMBER(2)
);

CREATE TABLE BONUS (
	ENAME VARCHAR2(10),
         JOB   VARCHAR2(9),
         SAL   NUMBER,
         COMM  NUMBER
);

CREATE INDEX PK_DEPT ON DEPT (DEPTNO ASC);

CREATE INDEX PK_EMP ON EMP (EMPNO ASC);

ALTER TABLE EMP ADD CONSTRAINT PK_EMP PRIMARY KEY (EMPNO);

ALTER TABLE DEPT ADD CONSTRAINT PK_DEPT PRIMARY KEY (DEPTNO);

ALTER TABLE EMP ADD CONSTRAINT FK_DEPTNO FOREIGN KEY (DEPTNO)
	REFERENCES DEPT (DEPTNO)
	ON DELETE CASCADE;



-- 데이터 추가
INSERT INTO DEPT VALUES (10, 'ACCOUNTING', 'NEW YORK');
INSERT INTO DEPT VALUES (20, 'RESEARCH',   'DALLAS');
INSERT INTO DEPT VALUES (30, 'SALES',      'CHICAGO');
INSERT INTO DEPT VALUES (40, 'OPERATIONS', 'BOSTON');




INSERT INTO EMP VALUES
        (7369, 'SMITH',  'CLERK',     7902,
        TO_DATE('17-DEC-1980', 'DD-MON-YYYY'),  800, NULL, 20);
INSERT INTO EMP VALUES
        (7499, 'ALLEN',  'SALESMAN',  7698,
        TO_DATE('20-FEB-1981', 'DD-MON-YYYY'), 1600,  300, 30);
INSERT INTO EMP VALUES
        (7521, 'WARD',   'SALESMAN',  7698,
        TO_DATE('22-FEB-1981', 'DD-MON-YYYY'), 1250,  500, 30);
INSERT INTO EMP VALUES
        (7566, 'JONES',  'MANAGER',   7839,
        TO_DATE('2-APR-1981', 'DD-MON-YYYY'),  2975, NULL, 20);
INSERT INTO EMP VALUES
        (7654, 'MARTIN', 'SALESMAN',  7698,
        TO_DATE('28-SEP-1981', 'DD-MON-YYYY'), 1250, 1400, 30);
INSERT INTO EMP VALUES
        (7698, 'BLAKE',  'MANAGER',   7839,
        TO_DATE('1-MAY-1981', 'DD-MON-YYYY'),  2850, NULL, 30);
INSERT INTO EMP VALUES
        (7782, 'CLARK',  'MANAGER',   7839,
        TO_DATE('9-JUN-1981', 'DD-MON-YYYY'),  2450, NULL, 10);
INSERT INTO EMP VALUES
        (7788, 'SCOTT',  'ANALYST',   7566,
        TO_DATE('09-DEC-1982', 'DD-MON-YYYY'), 3000, NULL, 20);
INSERT INTO EMP VALUES
        (7839, 'KING',   'PRESIDENT', NULL,
        TO_DATE('17-NOV-1981', 'DD-MON-YYYY'), 5000, NULL, 10);
INSERT INTO EMP VALUES
        (7844, 'TURNER', 'SALESMAN',  7698,
        TO_DATE('8-SEP-1981', 'DD-MON-YYYY'),  1500,    0, 30);
INSERT INTO EMP VALUES
        (7876, 'ADAMS',  'CLERK',     7788,
        TO_DATE('12-JAN-1983', 'DD-MON-YYYY'), 1100, NULL, 20);
INSERT INTO EMP VALUES
        (7900, 'JAMES',  'CLERK',     7698,
        TO_DATE('3-DEC-1981', 'DD-MON-YYYY'),   950, NULL, 30);
INSERT INTO EMP VALUES
        (7902, 'FORD',   'ANALYST',   7566,
        TO_DATE('3-DEC-1981', 'DD-MON-YYYY'),  3000, NULL, 20);
INSERT INTO EMP VALUES
        (7934, 'MILLER', 'CLERK',     7782,
        TO_DATE('23-JAN-1982', 'DD-MON-YYYY'), 1300, NULL, 10);

INSERT INTO SALGRADE VALUES (1,  700, 1200);
INSERT INTO SALGRADE VALUES (2, 1201, 1400);
INSERT INTO SALGRADE VALUES (3, 1401, 2000);
INSERT INTO SALGRADE VALUES (4, 2001, 3000);
INSERT INTO SALGRADE VALUES (5, 3001, 9999);


COMMIT;

//==> 사번, 이름, 관리자사번 조회
SELECT
empno 사번, ename 이름, mgr 관리자사번
FROM emp
ORDER BY empno;


물리적으로 참조할 테이블이 없으니 논리적으로 자기자신을 참조하는 방법 self join
SELECT
e1.empno 사번, e1.ename, e2.empno 관리자사번,e2.ename 관리자이름
FROM emp e1, emp e2
WHERE e1.mgr = e2.empno(+)//(+)는 outer join으로 null이면 연산에서 제외되어 검색이 안되는데 그 것을 검색하여 잡기위함.
ORDER BY e1.empno;

?????????????????? 딱딱함
SELECT
name 이름, dept_id 부서, phone 사번
FROM c_emp
WHERE dept_id = 2;

SELECT
name 이름, dept_id 부서, phone 사번
FROM c_emp
WHERE dept_id = (SELECT
		 dept_id
		 FROM c_emp
		 WHERE name = '이순신');



SELECT
phone 사번, name 이름, salary
FROM c_emp
WHERE salary < (SELECT
		AVG(salary)
		FROM c_emp);


SELECT
name 이름, dept_id 부서아이디
FROM c_emp
WHERE dept_id IN (SELECT
		id
		FROM s_dept
		WHERE dept_name IN('총무부','영업부'));


//==> 논리적 오류가 있음
SELECT
name, salary, dept_id 
FROM c_emp
WHERE salary IN (SELECT
		 MIN(salary)
		 FROM c_emp
		 GROUP BY dept_id);


SELECT
name, salary, dept_id 
FROM c_emp
WHERE (salary,dept_id) IN (SELECT
			MIN(salary),dept_id
			FROM c_emp
			GROUP BY dept_id);


INLINE VIEW
SELECT
c.name, c.salary, c.dept_id
FROM c_emp c,(SELECT
		MIN(salary) min,dept_id
		FROM c_emp
		GROUP BY dept_id) vt
WHERE c.dept_id = vt.dept_id
	AND c.salary = vt.min;