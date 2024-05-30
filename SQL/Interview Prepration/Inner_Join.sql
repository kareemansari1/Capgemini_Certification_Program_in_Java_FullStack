SELECT * FROM demo.product;
select p.pname,p.pprice,c.cname from customer c inner join product p on p.pid=c.pid;