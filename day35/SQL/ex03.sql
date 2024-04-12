-- 연습)
-- student 테이블에서 idx가 20240101인 학생 정보를 콘솔에 출력
declare
    v_idx   number;
    v_name  varchar2(10);
    v_kor   number;
    v_eng   number;
    v_mat   number;
begin
    select *
        into v_idx, v_name, v_kor, v_eng, v_mat
        from student
        where idx = 20240101;
        
    dbms_output.put_line('idx = ' || v_idx);
    dbms_output.put_line('이름 = ' || v_name);
    dbms_output.put_line('국어 = ' || v_kor);
    dbms_output.put_line('영어 = ' || v_eng);
    dbms_output.put_line('수학 = ' || v_mat);
end;