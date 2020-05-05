# sql99语法

# 等值连接

# 查询员工名和部门名
SELECT e.`last_name`,j.`department_name`
FROM `employees` e JOIN `departments` j
ON e.`department_id` = j.`department_id`