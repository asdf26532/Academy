-- 1. 절대값을 반환하는 함수
create or replace function abs(
    n       number
) return number as
    result  number;
begin
    result := n;

    if n < 0 then
        result := -n;
    end if;    
    
    return result;
end;

select abs(-5), abs(5) from dual;


-- 2. 전달된 수를 꺼꾸로 만들어 반환
create or replace function rev(
    src         number
) return number as
    num         number := src;
    result      number := 0;
begin
    while num != 0 loop
        result := result * 10 + mod(num, 10);
        num := trunc(num / 10);
    end loop;
    
    return result;
end;

select rev(123), rev(321) from dual;