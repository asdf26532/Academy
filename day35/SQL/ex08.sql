-- 연습)
-- person 테이블에서 아무 사람을 가져온다
-- 그 사람의 나이를 구해서 '성인/미성년자'를 구분해서 출력

declare
    v_name      varchar2(20);
    v_birth     date;
    v_age       number;
    v_result    varchar2(20) := '미성년자';
begin
    select name, birth
        into v_name, v_birth
        from person
        where name = '홍길동';
        
    v_age := extract(year from sysdate) - extract(year from v_birth);
    
    if v_age >= 19 then
        v_result := '성인';
    end if;
    
    dbms_output.put_line(v_name || '님은 ' || v_result || ' 입니다');    
end;