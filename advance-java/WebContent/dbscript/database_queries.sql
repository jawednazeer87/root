create database studentdb;

use studentdb;

create table user(
	id int(5) auto_increment primary key,
	firstName varchar(50) not null,
	lastName varchar(50),
	dob DATE,
	email varchar(50) not null,
	fatherName varchar(50),
	gender tinyint(1),
	country varchar(50)
);


create table address(
	id int(5) auto_increment primary key,
	userid int(5) not null,
	street varchar(50),
	city varchar(50),
	state varchar(50),
	country varchar(50),
	pincode varchar(50)
);

create table MoneyDetail(
	id int(5) auto_increment primary key,
	userid int(5) not null,
	balance double,
	createdate DATE,
	updatedate DATE
);

create table employeetwo(
	id int(5) auto_increment primary key,
	name varchar(50) not null,
	dob DATE,
	email varchar(50) not null,
	gender tinyint(1),
    joined_date DATE,
	release_date DATE,
    notice_period int(10),
    create_date timestamp,
	update_date timestamp
);

create table credit_card(
	cc_id int(5) auto_increment primary key,
	cc_num varchar(100) not null,
	holder_name varchar(100),
	expiry_date Date
);

create table employee(
	id int(5) auto_increment primary key,
	name varchar(45) not null,
	age int(5),
	salary varchar(45)
);	


create table employeefive(
	id int(5) auto_increment primary key,
	name varchar(45) not null,
	dob DATE,
	emailid varchar(50) not null,
	gender tinyint(1),
	joined_date DATE,
	release_date DATE,
	notice_period int(10),
	create_date DATE,
	update_date DATE
);	


INSERT INTO db1.address (userid, street, city, state, country, pincode) VALUES (13, 'loha pool', 'kolkata', 'wb', 'india', '700019');

