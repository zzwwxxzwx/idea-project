CREATE TABLE student (
 id INT, -- 编号
 NAME VARCHAR(20), -- 姓名
 age INT, -- 年龄
 sex VARCHAR(5), -- 性别
 address VARCHAR(100), -- 地址
 math INT, -- 数学
 english INT -- 英语
);
INSERT INTO student(id,NAME,age,sex,address,math,english) VALUES (1,'马云',55,'男','
杭州',66,78),(2,'马化腾',45,'女','深圳',98,87),(3,'马景涛',55,'男','香港',56,77),(4,'柳岩
',20,'女','湖南',76,65),(5,'柳青',20,'男','湖南',86,NULL),(6,'刘德华',57,'男','香港',99,99),(7,'马德',22,'女','香港',99,99),(8,'德玛西亚',18,'男','南京',56,65);

SELECT * FROM student;

DROP TABLE student;

-- 查询 姓名和年龄
SELECT 
	NAME,	-- 姓名
	age	-- 年龄
FROM 
	student;-- 学生表
	
SELECT * FROM student;

SELECT address FROM student;

-- 去除重复的结果集
SELECT DISTINCT address FROM student;
SELECT DISTINCT NAME,address FROM student;


-- 计算 math 和 english分数之和
SELECT NAME,math,english,math+english FROM student;

-- 如果有null参与的运算，计算结果都为null
SELECT NAME,math,english,math+IFNULL(english,0) FROM student;

-- 起别名
SELECT NAME,math,english,math+IFNULL(english,0)AS 总分 FROM student;
SELECT NAME,math 数学,english 英语,math+IFNULL(english,0) 总分 FROM student;

-- 查询年龄大于等于20岁
SELECT * FROM student WHERE age>=20;

-- 查询年龄不等于20岁
SELECT * FROM student WHERE age!=20;
SELECT * FROM student WHERE age<>20;

-- 查询年龄大于等于20岁小于等于30岁
SELECT * FROM student WHERE age>=20 AND age<=30;
SELECT * FROM student WHERE age BETWEEN 20 AND 30;

-- 查询年龄22岁,18岁,25岁的信息
SELECT * FROM student WHERE age IN(22,18,25);
SELECT * FROM student WHERE age=22 OR age=18 OR age=25;

-- 查询英语成绩为null的
SELECT * FROM student WHERE english IS NULL;


-- 查询英语成绩不为null的
SELECT * FROM student WHERE english IS NOT NULL;

-- 查询姓马的有哪些 _为单个任意字符,%为任意个任意字符
SELECT * FROM student WHERE NAME LIKE '马%';

-- 查询第二个字为化的有哪些 
SELECT * FROM student WHERE NAME LIKE '_化%';

-- 查询为三个字的有哪些 
SELECT * FROM student WHERE NAME LIKE '___';

-- 查询包含德字的有哪些 
SELECT * FROM student WHERE NAME LIKE '%德%';



SELECT * FROM student ORDER BY math -- 默认升序排序ASC
SELECT * FROM student ORDER BY math DESC;

-- 按照数学成绩排名，数学成绩一样，则按照英语成绩排名
SELECT * FROM student ORDER BY math ASC, english DESC;


-- 聚合函数(会排除null值)
SELECT COUNT(NAME) FROM student;
SELECT COUNT(IFNULL(english,0)) FROM student;

SELECT COUNT(*)FROM student;

SELECT MAX(math) FROM student;
SELECT MIN(math) FROM student;

SELECT SUM(math)/COUNT(*) FROM student;
SELECT AVG(math) FROM student;


-- 分组查询
-- 按照性别分组，分别查询男、女同学的平均分
SELECT sex,AVG(math) FROM student GROUP BY sex;

-- 按照性别分组，分别查询男、女同学的平均分，分别的人数
SELECT sex,AVG(math),COUNT(id) FROM student GROUP BY sex;

-- 按照性别分组，分别查询男、女同学的平均分，分别的人数，分数低于70不参与分组
SELECT sex,AVG(math),COUNT(id) FROM student WHERE math>70 GROUP BY sex;

-- 按照性别分组，分别查询男、女同学的平均分，分别的人数，分数低于70不参与分组
-- 且分组后人数要大于2人
SELECT sex,AVG(math),COUNT(id) FROM student WHERE math>70 GROUP BY sex HAVING COUNT(id)>2;
SELECT sex,AVG(math),COUNT(id) 人数 FROM student WHERE math>70 GROUP BY sex HAVING 人数>2;

-- 分页查询
-- 每页显示三条记录
SELECT * FROM student LIMIT 0,3;-- 第一页
SELECT * FROM student LIMIT 3,3;-- 第二页
-- 公式：开始的索引=(当前的页码-1)*每页显示的条数


