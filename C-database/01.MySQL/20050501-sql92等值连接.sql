#sql92链接，只有内连接

USE girls

# 1.引入：
# 查询女神名对应的男神名

SELECT `name`,`boyName`
FROM `beauty`,`boys`
WHERE `beauty`.`boyfriend_id`=`boys`.`id`;

# 2.起别名

# 查询员工名、工种号、工种名
SELECT e.`last_name`,e.`job_id`,j.`job_title`
FROM `employees` e,`jobs` j
WHERE e.`job_id`=j.`job_id`

# 3.两个表顺序进行调换
SELECT e.`last_name`,e.`job_id`,j.`job_title`
FROM `jobs` j,`employees` e
WHERE e.`job_id`=j.`job_id`

# 4.加入筛选
# 查询有奖金的员工名、部门名
SELECT e.`last_name`,d.`department_name`,e.`commission_pct`
FROM `employees` e,`departments` d
WHERE e.`department_id`=d.`department_id`
AND `commission_pct` IS NOT NULL

# 5.分组 
# 查询每个城市的部门个数
SELECT l.city ,COUNT(*)
FROM `locations` l,`departments` d
WHERE l.`location_id`=d.`location_id`
GROUP BY city

# 6.实现三表连接

# 查询员工名、部门名和所在的城市
SELECT e.`last_name`,d.`department_name`,l.city
FROM `employees` e,`departments` d,`locations` l
WHERE e.`department_id`=d.`department_id` 
AND d.`location_id`=l.`location_id`