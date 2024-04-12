-- 1. 학생 정보 기입
insert into 
    student(name, grade, gender, email) 
    values('홍길동', 0, '남', 'hong@naver.com');
    
insert into 
    student(name, grade, gender, email) 
    values('김민지', 0, '여', 'minji@naver.com');
    
insert into 
    student(name, grade, gender, email) 
    values('박철수', 0, '남', 'su@naver.com');
    
insert into 
    student(name, grade, gender, email) 
    values('이지민', 0, '여', 'jimin@naver.com');
    
insert into 
    student(name, grade, gender, email) 
    values('김수철', 0, '남', 'kim@naver.com');
    
    
-- 2. 과목 정보 기입
insert into class values(default, 'C언어', '24/02/01', 30);
insert into class values(default, 'C++', '24/02/01', 25);
insert into class values(default, 'C#', '24/02/01', 20);


-- 3. 수강 정보 기입
insert into student_class values(202401, 100); -- 홍길동 C언어
insert into student_class values(202401, 200); -- 홍길동 C++
insert into student_class values(202402, 200); -- 김민지 C++
insert into student_class values(202403, 100); -- 박철수 C언어
insert into student_class values(202404, 300); -- 이지민 C#
insert into student_class values(202405, 200); -- 김수철 C++

commit;
