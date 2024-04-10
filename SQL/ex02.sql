-- 제약 조건
-- 특정 열에 기입될 데이터를 제한

-- 1. primary key : 기본키
-- 테이블 당 한개만 지정 가능
-- 기본키인 열은 중복 데이터 및 null값 입력이 차단

-- 2. unique : 고유 제약
-- 테이블에 여러개 지정 가능
-- 기본키 외 중복을 막고 싶은 열에 지정
-- 단, null값이 입력됨

-- 3. not null : null 제약
-- 테이블에 여러개 지정 가능
-- 지정된 열은 null값 입력이 차단

-- 4. default : 기본값
-- 테이블에 여러개 지정 가능
-- 해당 열에 입력이 생략되는 경우 자동으로 기입될 값을 지정

create table account (
    idx         number,
    userid      varchar2(20)    not null,
    userpw      varchar2(20)    not null,
    nick        varchar2(60)    not null,
    email       varchar2(60),
    join_date   date            default sysdate,
    
    constraint account_idx primary key(idx),
    constraint account_userid unique(userid),
    constraint account_nick unique(nick)
);

drop table account;

insert into account values(1000, 'itbank', 'it', '아뱅', 'itbank@naver.com', '24/01/03');
-- 1번 실행 -> 성공
-- 2번 실생 -> 실패. 중복된 idx가 테이블에 적용되는 것을 방지

insert into account values(1001, 'naver', 'it', '네버', 'itbank@naver.com', '24/01/15');

insert into account values(1002, 'google', 'it', null, 'itbank@naver.com', '24/02/01');
-- nick 열은 not null 제약이 적용 중이라 null을 기입할 수 없다

insert into account values(1002, 'google', 'it', '9글', 'itbank@naver.com', default);

commit;

select * from account;
