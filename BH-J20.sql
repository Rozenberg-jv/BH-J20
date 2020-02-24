create database bhj20;
use bhj20;

drop table employees;

create table employees (
	id int primary key auto_increment,
    `name` varchar(50) not null unique,
    date date default '2020-01-01',
    salary int CHECK (salary > 0),
    specialty varchar(50)
);

insert into employees value (null, 'Vasily', '2019-05-21', 1500, 'Developer');
insert into employees (name, salary, specialty) values
	('Bogdan', 2000, 'CTO'),
    ('Irina', 700, 'HR'),
    ('Olga', 1200, 'QA');
    
insert into employees value (null, 'Borislav', default, 1000, 'DevOps');
insert into employees value (null, 'Borislava', default, -1000, 'DevOps');
    
select name as 'Name', e.salary, name as ABC, name from employees e;
select * from employees where salary >= 1200 and specialty like '%o%';
select * from employees;

update employees set name = 'Igor' where name = 'Vasily';
update employees set date = '2020-01-30' where date is null;
update employees set salary = salary + 100 where specialty = 'QA';

delete from employees where name = 'Borislava';
-- truncate employees; 


