-- 1. student 테이블을 생성
-- 열 정보)
-- idx      학번  기본키
-- name     이름  null(x)
-- score    점수  기본값 0
-- address  주소  null(x)
create table student (
    idx         number,
    name        varchar2(20)    not null,
    score       number          default 0,
    address     varchar2(60)    not null,
    
    constraint student_idx primary key(idx)
);

select * from student;

-- 2. student 테이블에 데이터를 기입하며 제약 조건 테스트
-- pk 테스트
insert into student values(100, '홍길동', default, '부산 광역시 해운대구');

-- null 테스트
insert into student values(101, null, default, '부산 광역시 해운대구');

-- insert시 지정하지 않은 열은 null이 기입된다
insert into 
    student(idx, name)
    values(102, '김민수');
    
-- insert시 지정하지 않은 열에 default가 설정되면 그 값이 채워진다
insert into
    student(idx, name, address)
    values(103, '박민지', '서울 특별시 종로구');