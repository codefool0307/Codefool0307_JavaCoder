# 分组查询
USE myemployees;
# 1.查询每个工种员工的平均工资
SELECT AVG(salary),job_id
FROM employees
GROUP BY `job_id`;

# 2.查询每个领导手下人数

SELECT COUNT(*),`manager_id`
FROM employees
WHERE manager_id IS NOT NULL
GROUP BY `manager_id`;

# 3.查询邮箱中包含a字符的每个部门的最高工资

SELECT MAX(salary) `department_id`
FROM employees
WHERE `email` LIKE "%a%"
GROUP BY `department_id`;

# 4.查询每个领导手下有奖金的员工的平均工资

SELECT AVG(salary) `manager_id`
FROM `employees`
WHERE `commission_pct` IS NOT NULL
GROUP BY `manager_id`

# 5. 查询哪个部门的员工个数>5
SELECT COUNT(*) ,`department_id`
FROM `employees`

GROUP BY `department_id`
HAVING COUNT(*)>5;

# 6.每个工种有奖金的员工的最高工资>12000的工种编号和最高工资
SELECT job_id,MAX(`salary`)
FROM `employees`
WHERE `commission_pct` IS NOT NULL
GROUP BY `job_id`
HAVING MAX(`salary`)>12000

# 7.按照多字段分组
# 7.1 查询每个工种每个部门的最低工资、并按最低工资排序

SELECT `job_id`,`department_id`,MIN(`salary`)
FROM `employees`
GROUP BY `job_id`,`department_id` 
ORDER BY MIN(`salary`) DESC


