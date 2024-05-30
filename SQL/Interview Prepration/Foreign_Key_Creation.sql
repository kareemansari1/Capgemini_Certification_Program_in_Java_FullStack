SELECT * FROM demo.product;
 create table customer(cid int primary key auto_increment,cname varchar(20),cdob date,pid int,foreign key(pid) references product(pid));
