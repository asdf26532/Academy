-- 연습)
-- student 테이블에서 모든 학생의 정보를 가져와서
-- 국 영 수 점수의 합계 평균이 60점 이상이면 합격
-- 학생의 점수와 합격 여부를 student_test 테이블에 저장
declare
    cursor stu_cur is
        select * from student;
    
    v_avg     number;
    pass      varchar2(10);
begin
    for stu in stu_cur loop
        v_avg := (stu.kor + stu.eng + stu.mat) / 3;
        v_avg := round(v_avg, 1);
    
        if v_avg >= 60 then
            pass := '합격';
        else 
            pass := '불합격';
        end if;
    
        insert into student_test 
            values(stu.idx, stu.name, v_avg, pass);
    end loop;
    
    commit;
end;