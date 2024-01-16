create database bootcamp_exercise3;
show databases;
use bootcamp_exercise3;

create table customer (
	id integer primary key,
    customer_name varchar(25),
    city_id integer,
    customer_address varchar(255),
    contact_person varchar(255),
    email varchar(128),
    phone varchar(128)
    -- foreign key (city_id) references order1(id) 
);