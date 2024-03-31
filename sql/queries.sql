
-- create
CREATE TABLE emp(
  workerid int primary key,
  workername varchar(20) not null,
  dept varchar(20) not null,
  salary int not null,
  DOJ date not null
);
-- exec sp_columns emp
-- insert
INSERT INTO emp(workerid,workername,dept,salary,DOJ) VALUES (1, 'Anil', 'Accounts',10000,'01-10-2020');
INSERT INTO emp(workerid,workername,dept,salary,DOJ) VALUES (2, 'Anu', 'Admin',11000,'01-10-2020');
INSERT INTO emp(workerid,workername,dept,salary,DOJ) VALUES (3, 'Anil Kumar', 'HR',5000,'03-11-2020');
INSERT INTO emp(workerid,workername,dept,salary,DOJ) VALUES (4, 'Anuradh', 'Marketing',12000,'11-12-2021');
INSERT INTO emp(workerid,workername,dept,salary,DOJ) VALUES (5, 'Anuradh Kumar', 'Establishment',8000,'01-01-2020');
INSERT INTO emp(workerid,workername,dept,salary,DOJ) VALUES (6, 'Anoop', 'Finance',10000,'01-01-1998');
INSERT INTO emp(workerid,workername,dept,salary,DOJ) VALUES (7, 'Anoop Kumar', 'Stores',9000,'01-01-2001');
INSERT INTO emp(workerid,workername,dept,salary,DOJ) VALUES (8, 'Adarsh', 'Security',7000,'01-1-2008');
-- -- fetch 
SELECT * FROM emp;
-- GO
update emp set workername ='Anil Prasad' where workername='Anil Kumar'
select * from emp;

update emp set salary=5500 where salary<6000
select * from emp;

select * from emp where salary=(select max(salary)from emp);

select * from emp where salary=(select min(salary) from emp);


