-- 교수 테이블을 작성
create sequence professor_seq 
    start with 102401
    increment by 1
    minvalue 102401
    maxvalue 999999999999999999999999
    nocache;

create table professor (
    idx     number          default professor_seq.nextval,
    name    varchar2(50)    not null,
    gender  varchar2(6),
    email   varchar2(100)   not null,
    
    constraint professor_idx primary key(idx),
    constraint professor_email unique(email),
    constraint professor_gender check(gender in ('남', '여'))
);

insert into professor values(default, '이진철', '남', 'lee@naver.com');
insert into professor values(default, '박선희', '여', 'hee@naver.com');
commit;