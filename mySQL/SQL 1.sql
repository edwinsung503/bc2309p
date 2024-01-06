-- it is notation to mark comments
use sys; -- login in database
create table students (
	student_id INT PRIMARY KEY, -- integer, Primary Key: The values in this column must be unique
    first_name VARCHAR(50), -- String
    last_name VARCHAR(50), -- String
    birthdate DATE, -- localdate
    gpa DECIMAL(3,2), -- double 
    is_active BOOLEAN -- boolean
);

select * from students;
-- Insert Approach 1: with column name you can skip column by this approach
insert into students (student_id, first_name, last_name, birthdate, gpa, is_active)
values (1, 'John', 'Wong', '2000-12-23', 3.23, true);

insert into students (student_id, first_name, last_name, birthdate, gpa, is_active)
values(2,'Edwin', 'Sung', '2012-01-22',3.2, true);

insert into students (student_id, first_name, last_name, birthdate, gpa, is_active)
values(3,'Mary','Choi','2022-03-22',4,true);

insert into students (student_id, first_name, last_name, birthdate, gpa, is_active)
values(4,'Mary','Choi','2022-03-22',4,0);

insert into students (student_id, first_name, last_name, birthdate, gpa, is_active)
values(5,'Mary','Choi','2022-03-22',4,2);

insert into students (student_id, first_name,  birthdate, gpa, is_active)
values(7,'Mary','2022-03-22',4,2);

select * from students; -- * refer all column

-- Approach 2 : without column name (with all column values)
insert into students values (6,'Peter','Chan','2012-12-22',4,2);

-- 
update students set gpa = 3.95 where first_name = 'John';
update students set is_active =false, birthdate = '1999-01-02' where last_name = 'Wong' and gpa > 3; -- support 'or' as well

select * from students ;
delete from students where student_id = 3;

delete from students where gpa >= 3.0 and is_active = 0;
delete from students where is_active = true; -- true 1 ; false 0

truncate table students; -- cannot roll back / delete all data from students ;

select * from students ;
-- DISTINCT
insert into students (student_id, first_name, last_name, birthdate, gpa, is_active)
values (1, 'John', 'Wong', '2000-12-23', 3.23, true);

insert into students (student_id, first_name, last_name, birthdate, gpa, is_active)
values (3, 'John', 'Wong', '2000-12-23', 3.23, true);

insert into students (student_id, first_name, last_name, birthdate, gpa, is_active)
values(2,'Edwin', 'Sung', '2012-01-22',3.2, true);

select distinct first_name from students;

-- count() is to count the number of rows of result set
select count(first_name) from students; -- 3
select count(student_id) from students; -- 3
select 1 from students ; -- select those row and show how to present 
-- no of row 受 where 影響
select count(1) from students; -- 3
select 10 from students where gpa >=2.0; -- 3 return 3 rows (with a column value 10)
select count(10) from students where gpa > 3.2; -- 2
select count(10) from students where gpa > 3.0; -- 3

-- alter table add
alter table students add column JOIN_DATE date; -- NULL_values for existing records
select * from students;
update students set join_date = '1990-01-01';

insert into students (student_id, first_name, last_name, birthdate, gpa, is_active,join_date)
values (4, 'Jenny', 'Wong', '2000-12-23', 3.23, true,'2000-12-31');

insert into students (student_id, first_name, last_name, birthdate, gpa, is_active,join_date)
values(5,'Peter', 'Sung', '2012-01-22',3.2, true,'2005-12-31');

-- between and 
select * from students where join_date between '2000-12-31' and '2006-12-31'; -- inclusive
select * from students where join_date >= '2000-12-31' and join_date <= '2006-12-31';

-- upper , lower
select upper(first_name) as upper_first_name, last_name, lower(last_name) as lower_last_name from students;
select upper(first_name) as ufn, upper(last_name) as uln, s.* from students s;

-- Crossover : upper() vs count()
-- upper() cannot be used with count() at the same time
-- count() is an aggregated function
select upper(first_name), count(first_name) from students;

-- avg()
select avg(gpa) from students;
select avg(gpa) from students where join_date >= '2000-01-01';
select avg(gpa) as average_gpa, count(1) number_of_students from students;

-- min() / max(), aggregated function
select min(gpa) from students;
select max(gpa) from students;
select avg(gpa) as average_gpa, count(1) number_of_students, min(gpa) as min_gpa,max(gpa) as max_gpa from students;
-- select -> for loop 咁做法

-- Find the first_name and last_name of the person who has min. gpa
-- sub-query
-- select min(gpa) from students; -- 3.2

insert into students (student_id, first_name, last_name, birthdate, gpa, is_active,join_date)
values(6,'Peter', 'Sung', '2012-01-22',1.2, true,'2005-12-31');

select first_name, last_name,gpa from students where gpa = (select min(gpa) from students);

-- length()
-- select length(first_name), first_name from students;
select length(first_name) as Word_Length, first_name, concat(first_name,' ' ,last_name) as Full_Name from students;

select length(first_name)
, first_name
, concat(first_name,' ' ,last_name) as Full_Name
, length(concat(first_name,' ' ,last_name)) as length_full_name
from students;

-- instr() -> java : index of()
-- java: indexOf() [0,,,,n], not found : -1
-- Mysql: by default ignore case
select * from students;
select s.first_name
, instr(s.first_name, 'P') -- 1st occurence index of the 'P'
, instr(s.first_name, 'e') -- 1st occurence index of the 'e'
, instr(s.first_name, 'J') -- 1st occurence index of the 'J'
, instr(s.first_name, 'Jenny') > 0 as is_jenny -- 有Jenny
from students s;

-- non-aggregated functions can be used in select clause and where clause
select * from students where length(first_name) < 5;
select * from students where concat(first_name,' ' ,last_name)  = 'John WOng';
-- we can  re-calculate the vale of the result set
select gpa * 1.1 from students where concat(first_name, ' ', last_name) = 'John Wong';

-- Like % (Wild card)
select * from students where concat(first_name, ' ', last_name) like '%Wong'; -- Any character is allowed to match

insert into students (student_id, first_name, last_name, birthdate, gpa, is_active,join_date)
values(7,'abcabc', 'aaabbbsss', '2012-01-22',1.2, true,'2005-12-31');

insert into students (student_id, first_name, last_name, birthdate, gpa, is_active,join_date)
values(8,'abcdefabc', 'aaasss', '2012-01-22',1.2, true,'2005-12-31');

insert into students (student_id, first_name, last_name, birthdate, gpa, is_active,join_date)
values(9,'abcdefabc', 'faaasssf', '2012-01-22',1.2, true,'2005-12-31');

select * from students;

select * from students where last_name like 'aaa%sss';
select * from students where last_name like '%aaasss';
select * from students where last_name like '%aaa%sss%';

-- not equals; <> or !=
select * from students where last_name <> 'Wong'; -- preferable
select * from students where last_name != 'Wong';
select * from students where last_name = 'Wong';

-- 'is null' or 'is not null' in where clause
insert into students (student_id, first_name, last_name, birthdate, gpa, is_active,join_date)
values(10,'Eric', 'Chan', '2012-01-22',1.2, true,'2005-12-31');

select * from students where birthdate is null;
select * from students where birthdate is not null;

select s.* from students s;
select distinct join_date, birthdate from students; -- 要2個item 都唔同先係唔同
-- 好似 select concat(join_date, birthdate) 個結果都唔同先叫唔同


-- Modify column definition
alter table students modify column first_name varchar(100);
-- alter table students modify column first_name varchar(4); -- Not ok , existing records with value > 4

alter table students add dummy datetime;

alter table students drop column dummy;


create table books(
	id integer not null,
	name varchar(100),
    color varchar(10),
    price decimal(7,2) -- 99999.99 is max value you can store
);

insert into books (id, name, color, price) values(1,'ABC','RED',10.0);
insert into books (id, name, color, price) values(2,'BCD','RED',20.5);
insert into books (id, name, color, price) values(3,'AAA','YELLOW',40.9);
insert into books (id, name, color, price) values(4,'DDD','BLUE',5.3);
insert into books (id, name, color, price) values(5,'DDA','BLACK',4.3);
select * from books;

-- GROUP BY
-- 1. The number of record in the result set based on how many groups were formed finally
-- 2. When you use "group by" , you can only select the "group" as the column(s) as well as aggregated function
select color, count(1),ROUND(AVG(price), 2), max(price) from books group by color ;
-- select name, count(1), avg(price), max(price) from books group by color ; -- cannot 
select color, count(1),avg(price), max(price), sum(id) from books group by color ;

-- Aggregated functions: sum(), avg(), max(), min(), count()
select avg(price), sum(price) / count(1) as average_price from books;
-- Where --> Group By
select color, count(1) from books where color in ('RED','BLUE') group by color;

-- where -> group by -> having
-- having:after the grouping, you add another criteria to fileter out some of the group(s)
select color, avg(price)
from books 
where color in ('RED','BLUE') 
group by color 
having count(1) >=2;

-- find the color of the book, where color group of the book with average price -> 10.0
-- After grouping, you can filter the records inside the group
-- You can only filter out the whole groups
select color
from books
group by color
having avg(price) >=10;

-- JOIN(CUSTOMER1, ORDER1, ITEM)
create table customer(
	id integer primary key,
    c_name varchar(50) not null,
    email varchar(40),
    phone varchar(20)
);

create table order1(
	id integer primary key,
    order_datetime datetime not null,
    delivery_addr varchar(100),
    order_amount decimal(10,2),
    customer_id integer,
    foreign key (customer_id) references customer(id) 
    -- Constriant： ensure the customer_id (order) exists in customer table's id
    
);

create table item(
	id integer primary key,
    item_desc varchar(50),
    item_unit_price decimal(10,2),
    item_quatity integer not null,
    item_amount decimal(10,2),
    order_id integer,
    foreign key (order_id) references order1(id) 
    -- ensure the order_id (item1) exists in order1 table's id
);
-- drop table customer;
-- drop table order1 ;
-- drop table item;
-- 要delete 左item 先因為有foreign key -> 唔可以order 入面有孤兒仔出現
-- 2 customers
-- 2 orders per customers
-- 2 items per orders
delete from item;
delete from order1;
delete from customer;


insert into customer (id, c_name, email, phone) 
values(2,'John','john@yahoo.com','21219432');
insert into order1 (id, order_datetime,delivery_addr, order_amount,customer_id) 
values (12,'2020-01-22','taiwai',1.0,2);
insert into order1 (id, order_datetime,delivery_addr, order_amount,customer_id) 
values (13,'2020-02-22','taiwai',2.0,2);
insert into item (id, item_desc, item_unit_price, item_quatity, item_amount,order_id) 
values (121,'iphone 13', 1000.0, 2,2000,12);
insert into item (id, item_desc, item_unit_price, item_quatity, item_amount,order_id) 
values (122,'iphone 14', 2400.0, 1,2400,12);
insert into item (id, item_desc, item_unit_price, item_quatity, item_amount,order_id) 
values (123,'iphone 13', 1000.0, 2,2000,13);
insert into item (id, item_desc, item_unit_price, item_quatity, item_amount,order_id) 
values (124,'iphone 14', 2400.0, 1,2400,13);

insert into customer (id, c_name, email, phone) 
values(1,'Edwin','edwin@yahoo.com','21219418');
insert into order1 (id, order_datetime,delivery_addr, order_amount,customer_id) 
values (14,'2020-02-22','shatin',3.0,1);
insert into order1 (id, order_datetime,delivery_addr, order_amount,customer_id) 
values (15,'2020-01-22','shatin',4.0,1);
insert into item (id, item_desc, item_unit_price, item_quatity, item_amount,order_id) 
values (125,'iphone 13', 1000.0, 1,2000,14);
insert into item (id, item_desc, item_unit_price, item_quatity, item_amount,order_id) 
values (126,'iphone 14', 2400.0, 1,2400,14);
insert into item (id, item_desc, item_unit_price, item_quatity, item_amount,order_id) 
values (127,'iphone 13', 1000.0, 1,2000,15);
insert into item (id, item_desc, item_unit_price, item_quatity, item_amount,order_id) 
values (128,'iphone 14', 2400.0, 1,2400,15);

update item set item_amount = item_unit_price * item_quatity;
select * from order1;

-- join (inner join)
-- customer - 2 rows
-- order - 4 rows

select c.*, o.* from customer c, order1 o ; -- 8 rows (4 X 2)
-- Approach 1 (inner join)
select c.*, o.* 
from customer c, order1 o 
where c.id = o.customer_id; -- 用where filter 走4條

select c.id, c.c_name, c.phone, c.email,o.delivery_addr, o.order_amount, i.item_desc, i.item_amount
from customer c, order1 o , item i
where c.id = o.customer_id
and o.id = i.order_id;

-- Approcah 2 (inner join)
select c.*, o.*
from customer c inner join order1 o on c.id = customer_id; -- 命令佢點Join

select c.id, c.c_name, c.phone, c.email,o.delivery_addr, o.order_amount, i.item_desc, i.item_amount
from customer c 
	inner join order1 o on c.id = o.customer_id
    inner join item i on o.id = i.order_id
;

-- Left join
insert into customer (id, c_name, email, phone) 
values (3,'Peggy Chan','peggychan@yahoo.com','21219411');

-- final all customers with his order hitories, including those who has no orders
-- For those who has no order, you can just leave the order/ item data as null

-- 以左邊為以歸
select c.*, o.* 
from customer c left join order1 o on c.id = o.customer_id;

-- Right join
select c.*, o.* 
from order1 o right join customer c on c.id = o.customer_id;

select c.id, c.c_name, c.phone, c.email,o.delivery_addr, o.order_amount, i.item_desc, i.item_amount
from customer c 
left join order1 o on c.id = o.customer_id
left join  item i on o.id = i.order_id  ;

-- Approach 2 sub-query -> sub titile 
select c.*, order_item_table.*
from customer c left join
(select o.id ,o.customer_id
from order1 o, item i
where o.id = i.order_id) as order_item_table 
on c.id = order_item_table.customer_id;

-- Approach 3 common table - recommend approach
With 
	order_item_table as (select o.id as order_id, o.customer_id, o.delivery_addr, o.order_amount
						from order1 o, item i
						where o.id = i.order_id)
select c.*, oi.*
from customer c left join order_item_table oi on c.id - oi.customer_id;

select * from item;

CREATE DATABASE BOOTCAMP_EXERCISE1;
use BOOTCAMP_EXERCISE1;
-- Exists
use sys;
select * from customer;
select * from order1;
-- Find the name of the customers, who are having orders
select c_name 
from customer c
where exists (select 1 from order1 d where d.customer_id = c.id);

-- Find the name of the customers, who has no orders
select c_name 
from customer c
where not exists (select 1 from order1 d where d.customer_id = c.id);

-- find the name of the customer(s), who has 3 or above orders
insert into order1 (id, order_datetime,delivery_addr, order_amount,customer_id) 
values (22,now(),'taiwai',1000.2,2);

insert into order1 (id, order_datetime,delivery_addr, order_amount,customer_id) 
values (23,now(),'taiwai',100.2,2);

insert into order1 (id, order_datetime,delivery_addr, order_amount,customer_id) 
values (1,now(),'taiwai',100.2,2);

insert into order1 (id, order_datetime,delivery_addr, order_amount,customer_id) 
values (1,now(),'taiwai',1100.2,2);

select c.id, c.c_name as name , count(1) as no_of_orders
from customer c 
left join order1 o
on c.id = o.customer_id
group by c.id
having count(1) >= 3; -- id 已refernce unique 因為id set 為unique key
-- having 係X 走個group

-- join -> 可以拎到order data
-- exist -> 無order data
with order_count_table as  (
		select o.customer_id , count(1) as no_of_orders
		from order1 o 
		group by o.customer_id)
select c.c_name
from customer c
where exists (select 1 from order_count_table oc where oc.customer_id = c.id and oc.no_of_orders >=3);

CREATE VIEW customer_details AS
SELECT c.id,CONCAT(c_name, ' ',email) AS c_info
FROM customer c;

select * from customer_details; -- cannot insert, update, delete on a 
-- so, when we insert, update, delete on customer1, the result should reflect in the view as well.

use sys;
select * from customers o
where not exists (select 1 from orders o where o.customer_id =c.id); 
