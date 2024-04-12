-- 연습)
-- emp 테이블에서 사원 번호 20240106인 사원의 연차를 출력

declare 
    v_name      varchar2(20);
    v_hdate     date;
    v_result    number;
begin
    select name, h_date
        into v_name, v_hdate
        from emp
        where idx = 20240106;
        
    v_result := trunc((sysdate - v_hdate) / 356);

    dbms_output.put_line(v_name || '님은 ' || v_result || '년차 입니다');
end;