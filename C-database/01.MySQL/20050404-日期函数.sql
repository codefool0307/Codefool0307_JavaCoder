# 日期函数

# 1.now

SELECT NOW()

#2. curdate

SELECT CURDATE();

#3. curtime

SELECT CURTIME();

#4. datediff

SELECT DATEDIFF('1900-01-01','1949-10-01')

# 5. date_format

SELECT DATE_FORMAT('1900-01-01','%Y年%M月%d日')

# 6.str_to_date 按照制定个是解析日期

SELECT STR_TO_DATE('3/14 1898','%m/%d %Y')