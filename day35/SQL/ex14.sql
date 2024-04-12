-- 무한 반복
declare
    v_num    number := 5;
begin
    Loop
        dbms_output.put_line('v_num = ' || v_num);
        
        -- 반복 종료 조건
        exit when v_num = 2;
        
        v_num := v_num - 1;
    end Loop;
end;