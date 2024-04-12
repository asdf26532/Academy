-- sum() : 지정 열 각 행의 합계를 반환
-- avg() : 평균을 반환
select idx, name, position, dep_name, salary from employee;

-- 전 직원 연봉 합계
select sum(salary) as sum, avg(salary) as avg from employee;

-- round(실수, 자리수)는 반올림 함수
select round(avg(salary), 2) as avg from employee;

-- 그룹별
select dep_name, sum(salary) as sum
    from employee
    group by dep_name;
    
-- max(), min() : 지정 열 각 행의 최대/최소를 반환
select max(salary), min(salary) from employee;

select dep_name, max(salary), min(salary) 
    from employee
    group by dep_name;

select * from employee;

-- 연습)
-- 성별로 구분해서 인원수, 각 연봉의 합계, 평균, 최대, 최소를 출력
-- 단, 성별이 null인 사람은 제외하고 합계 연봉이 높은 순으로 출력
select gender, count(*), sum(salary), avg(salary), max(salary), min(salary)
    from employee
    where gender is not null
    group by gender
    order by sum(salary) desc;


