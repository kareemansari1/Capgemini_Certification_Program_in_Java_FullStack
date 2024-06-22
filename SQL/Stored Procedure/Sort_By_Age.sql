CREATE DEFINER=`root`@`localhost` PROCEDURE `sortByage`(in agefilter int)
BEGIN
select * from emp where eage=agefilter order by ename desc;
END