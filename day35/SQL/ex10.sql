-- 연습)
-- student 테이블에서 한 학생의 정보를 가져온다
-- 국 영 수 점수의 합계 평균이 60점 이상이면 합격
-- 학생의 점수와 합격 여부를 student_test 테이블에 저장

create table student_test (
    idx     number,
    name    varchar2(20),
    avg     number,
    pass    varchar2(10)
);

declare
    v_idx       number;
    v_name      varchar2(20);
    v_kor       number;
    v_eng       number;
    v_mat       number;
    v_avg       number;
    v_result    varchar2(20) := '불합격';
begin
    select * into v_idx, v_name, v_kor, v_eng, v_mat
        from student
        where idx = 20240111;
        
    v_avg := (v_kor + v_eng + v_mat) / 3;
    v_avg := round(v_avg, 1);
        
    if v_avg >= 60 then
        v_result := '합격';
    end if;
    
    insert into student_test 
        values(v_idx, v_name, v_avg, v_result);
        
    dbms_output.put_line('실행 완료');
end;