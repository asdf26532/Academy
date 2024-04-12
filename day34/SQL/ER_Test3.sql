-- 수강 정보를 확인하자
-- 1. student와 student_class를 join
select A.*, B.* 
    from student A
    inner join student_class B
    on A.idx = B.stu_idx;

select * from student_class;

-- 2. class와 1번의 결과를 join (계속 아래 구문 쓰면 불편 -> view로 생성)
create view sign_Up as
    select B.*, A.name as class_name, a.c_date, a.total
        from class A
        inner join (select A.*, B.* 
                        from student A
                        inner join student_class B
                        on A.idx = B.stu_idx) B
        on A.idx = B.cls_idx;
        
-- 3. view도 당연히 그룹, 조건, 정렬 모두 가능
select class_name, count(*) from sign_up group by class_name;
select * from sign_up where class_name = 'C언어';