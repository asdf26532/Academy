-- 연습)
-- emp 테이블 모든 사원의 연봉을 10% 인상해서 적용하세요
declare
    v_salary    number;

    cursor emp_cur is
        select * from emp;
begin
    for cur in emp_cur loop
        v_salary := cur.salary * 1.1;
        
        update emp set salary = v_salary where idx = cur.idx;
    end loop;
    
    commit;
end;

update emp set salary = salary * 1.1;
rollback;