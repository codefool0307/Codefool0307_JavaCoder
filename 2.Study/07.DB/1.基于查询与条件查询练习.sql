# 练习1
SELECT `salary`,`last_name`
FROM `employees`
WHERE `commission_pct` IS NULL AND `salary`<18000;

# 练习2
SELECT *
FROM `employees`
WHERE job_id!='IT' AND `salary`=12000;


# 练习3
DESC `departments`;


# 练习4
SELECT DISTINCT(`department_id`)
FROM `departments`
ORDER BY `department_id` ASC;

# 练习5
