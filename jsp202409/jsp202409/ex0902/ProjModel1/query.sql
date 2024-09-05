create table member(
	name varchar2(20) not null,
	tel varchar2(20) not null
);

insert into MEMBER values('a', '010');
insert into MEMBER values('b', '011');

select * from MEMBER;