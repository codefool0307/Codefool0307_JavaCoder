#sql99外连接

USE girls;
# 查询所有女神的记录，以及对应的男神名，如果没有对应的男神，则显示null
SELECT b.*,bo.*
FROM beauty b 
LEFT JOIN boys bo ON b.`boyfriend_id`=bo.`id`
ORDER BY boyfriend_id DESC;

# 查询哪个女神没有男朋友

SELECT b.*
FROM beauty b
LEFT JOIN boys bo ON b.`boyfriend_id`=bo.`id`
WHERE `boyfriend_id` IS NULL