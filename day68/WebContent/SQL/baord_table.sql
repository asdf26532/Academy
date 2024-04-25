create sequence board_seq 
    start with 10001
    increment by 1
    minvalue 10001
    maxvalue 999999999999999999999
    nocache;
    
create table board(
    idx         number          default board_seq.nextval,
    title       varchar2(150)   default '제목 없음' not null,
    contents    clob            default '내용 없음' not null,
    v_count     number          default 0,
    w_date      date            default sysdate,
    user_idx    number,
    
    constraint board_idx primary key(idx),
    constraint board_uidx foreign key(user_idx) references account(idx) on delete set null
);

drop table board;