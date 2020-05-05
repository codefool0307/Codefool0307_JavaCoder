# sql92非等值连接（大体理解就是不再使用=）
# 查询员工的工资和工资级别
SELECT e.`salary`,j.`job_title`
FROM employees e,jobs j
WHERE salary BETWEEN `min_salary` AND `max_salary`;
ORDER BY e.salary DESC;

# sql92 自连接（大体理解为内部审查）
SELECT e.`last_name`,m.`manager_id`
FROM `employees` e,`employees` m
WHERE e.`employee_id`=m.`manager_id`