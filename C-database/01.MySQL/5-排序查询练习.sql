# 练习
#1. 查询员工的姓名和部门号和年薪，按年薪降序 按姓名升序

SELECT `last_name`,`department_id`,`salary`*12*(1+IFNULL(`commission_pct`,'0')) AS 年薪
FROM `employees`
ORDER BY 年薪 DESC,`last_name` ASC;

#2. 选择工资不在 8000 到 17000 的员工的姓名和工资，按工资降序

SELECT `last_name`,`salary` 
FROM `employees`
ORDER BY `salary`<8000 OR `salary`>17000;

#3. 查询邮箱中包含 e 的员工信息，并先按邮箱的字节数降序，再按部门号升序

SELECT * FROM `employees` WHERE `email` LIKE '%e%' 
ORDER BY `email` DESC,`department_id` ASC;