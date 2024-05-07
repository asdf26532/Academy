create sequence reply_seq 
    start with 101
    increment by 1
    minvalue 101
    maxvalue 99999999999999999999999999999
    nocache;

create table reply (
    idx         number      default reply_seq.nextval,
    b_idx       number      not null,
    u_idx       number      not null,
    contents    clob        default '내용 없음',
    w_date      date        default sysdate,
    
    constraint reply_idx primary key(idx),
    constraint reply_bidx foreign key(b_idx) references board(idx) on delete cascade,
    constraint reply_uidx foreign key(u_idx) references account(idx) on delete cascade
);

drop table reply;