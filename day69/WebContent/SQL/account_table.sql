create sequence account_seq 
    start with 1001
    increment by 1
    minvalue 1001
    maxvalue 999999999999999999999999
    nocache;

create table account (
    idx     number          default account_seq.nextval,
    userid  varchar2(20)    not null,
    userpw  varchar2(128)   not null,
    nick    varchar2(20)    not null,
    email   varchar2(80)    not null,
    j_date  date            default sysdate,
    
    constraint acc_idx primary key(idx),
    constraint acc_userid unique(userid),
    constraint acc_nick unique(nick),
    constraint acc_email unique(email)
);

drop table account;