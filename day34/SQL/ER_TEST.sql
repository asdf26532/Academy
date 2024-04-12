-- 1. 각 테이블 시퀀스 생성
create sequence student_seq
    start with 202401
    increment by 1
    minvalue 202401
    maxvalue 999999999999999999
    nocache;
    
create sequence class_seq
    start with 100
    increment by 100
    minvalue 100
    maxvalue 999999999999999999
    nocache;
    
-- 2. ER 처럼 테이블 생성
create table student (
    idx         number          default student_seq.nextval,
    name        varchar2(50),
    grade       number,
    gender      varchar2(6),
    email       varchar2(100)   not null,
    
    constraint student_idx primary key(idx),
    constraint student_email unique(email),
    constraint student_gender check(gender in ('남', '여'))
);

create table class (
    idx     number          default class_seq.nextval,
    name    varchar2(60)    not null,
    c_date  date,
    total   number,
    
    constraint class_idx primary key(idx),
    constraint class_name unique(name)
);

create table student_class (
    stu_idx     number      not null,
    cls_idx     number      not null,
    
    constraint stu_idx foreign key(stu_idx) references student(idx),
    constraint cls_idx foreign key(cls_idx) references class(idx)
);










