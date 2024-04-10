-- sequence : 시퀀스
-- Oracle DB에서 숫자를 증가 시켜주는 객체
-- 이를 활용해서 자동 증가 열로 자주 사용한다

create sequence account_seq
    start with 1000
    increment by 1
    minvalue 1000
    maxvalue 99999999999999999999999999
    nocache;
    
drop sequence account_seq;

alter table account modify idx number default account_seq.nextval;

insert into 
    account(userid, userpw, nick, email)
    values('kakao', '1234', '카카오', 'kakao@naver.com');
    
insert into 
    account(userid, userpw, nick, email)
    values('apple', 'watch', '애플', 'apple@icloud.com');
