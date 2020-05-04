# 常见函数
# 1.concat拼接字符串
SELECT CONCAT("hello",first_name,last_name) 备注 
FROM employees

# 2.length获取长度
SELECT LENGTH(first_name),first_name
FROM employees

# 3.char_length 获取字符个数
SELECT CHAR_LENGTH(first_name),first_name
FROM employees

# 4.substring截取子串

SELECT SUBSTRING('kajfhskhfkhakj',3,7)

# 5.instr获取字符第一次出现的索引

SELECT INSTR('hellokjsdfagkhhelloksdfkahhello','hello')

# 6.TRIM去掉前后指定的字符

SELECT TRIM('   大哥 二哥 都是 我哥     ') AS a;
SELECT TRIM(' ' FROM '   大哥 二哥 都是 我哥     ') AS b;

# 7.左填充 lpad/右填充 rpad
SELECT LPAD('大哥',4,'二哥');

SELECT RPAD('大哥',4,'三哥');

# 8.大写upper/小写lower

# 查询员工表姓名：要求：首字符大写， 其他字符小写，名所有字符大写，且姓和名之间用_分割，最后别名OUTPUT

SELECT CONCAT(UPPER(SUBSTR(`first_name`,1,1)),LOWER(SUBSTR(`first_name`,2)),'_',UPPER(`first_name`)) OUTPUT
FROM employees;

# 9.strcmp比较两个字符大小

SELECT STRCMP('321','123');

# 10.left/right截取子串

SELECT LEFT('武林外传',1)

SELECT RIGHT('武林外传',1)
