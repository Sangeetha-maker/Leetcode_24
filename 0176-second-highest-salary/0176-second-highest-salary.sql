/*
select Max(salary) as SecondHighestSalary
from
(
    select salary,
    dense_rank() over (order by salary desc) as rnk
    from Employee
)t
where rnk = 2;
*/

select(
select 
distinct salary
from Employee
order by salary desc
limit 1 offset 1
) as SecondHighestSalary 
