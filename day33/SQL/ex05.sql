-- 정규화
-- - 하나의 테이블에 모든 정보를 저장하다 보면 중복되는 데이터가 생기게 된다
-- - 이러한 테이블 최소의 단위로 나누어서 저장하는 방식 정규화라고 한다
create sequence emp_seq 
    start with 20240101
    increment by 1
    minvalue 20240101
    maxvalue 999999999999999999999999
    nocache;

-- 1. employee 테이블에서 부서 정보를 제외한 정보만 저장
create table emp (
    idx         number          default emp_seq.nextval,
    name        varchar2(30)    not null,
    position    varchar2(10)    not null,
    gender      varchar2(6),
    birth       date            not null,
    h_date      date            not null,
    phone       varchar2(15)    not null,
    email       varchar2(60)    not null,
    salary      number          not null,
    dep_idx     number,
    
    constraint emp2_pk_idx primary key(idx),
    constraint emp2_ck_gender check(gender in ('남', '여')),
    -- constraint emp2_fk_depidx foreign key(dep_idx) references dep(idx)
);

-- employee 테이블에서 사원 정보만 emp에 복사
insert into emp(idx, name, position, gender, birth, h_date, phone, email, salary)
    select idx, name, position, gender, birth, h_date, phone, email, salary 
        from employee order by idx;
        
select * from emp order by idx;

create sequence dep_seq
    start with 100
    increment by 100
    minvalue 100
    maxvalue 999999999999999999
    nocache;

-- employee 테이블에서 부서의 정보만 dep에 저장
create table dep (
    idx         number          default dep_seq.nextval,
    dep_name    varchar2(30)    not null,
    dep_create  date            not null,
    dep_phone   varchar2(15)    not null,
    dep_email   varchar2(60)    not null,
    
    constraint dep_pk_idx primary key(idx)
);

select idx, name, position, dep_name, dep_create, dep_phone, dep_email from employee order by dep_name;

-- employee 테이블에서 조회한 부서 정보를 dep 테이블에 insert
insert into dep(dep_name, dep_create, dep_phone, dep_email)
    select distinct dep_name, dep_create, dep_phone, dep_email 
        from employee;

select * from dep;
select name, dep_name from employee;
