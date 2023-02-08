SELECT * FROM emp,dept;

-- 笛卡尔积A，B

-- 消除无用数据，即错误的对应关系


-- 查询所有员工信息和对应的部门信息
-- 隐式内连接
SELECT * FROM emp,dept WHERE emp.`dept_id`=dept.`id`;


-- 查询员工表的名称性别部门表的名称
SELECT emp.`name`, emp.`gender`, dept.`name` FROM emp,dept WHERE emp.`dept_id`=dept.`id`;

SELECT 
	t1.`name`,
	t1.`gender`,
	t2.`name`
FROM
	emp t1, dept t2
WHERE
	t1.`dept_id`=t2.`id`;

-- 显示内连接
SELECT * FROM emp INNER JOIN dept ON emp.`dept_id`=dept.`id`;
SELECT * FROM emp JOIN dept ON emp.`dept_id`=dept.`id`;



-- 查询所有员工信息，如果有部门则显示部门，没有则不显示
SELECT 
	t1.*,t2.`name`
FROM
	emp t1,dept t2
WHERE
	t1.`dept_id`=t2.`id`;-- 该方法没有部门的员工无法显示

-- 左外连接
SELECT t1.*,t2.`name` FROM emp t1 LEFT JOIN dept t2 ON t1.`dept_id` =t2.`id`;
-- 右外连接
SELECT t1.*,t2.`name` FROM emp t1 RIGHT JOIN dept t2 ON t1.`dept_id` =t2.`id`;
-- t1和t2交换后left改right结果相同


-- 子查询
-- 查询工资的员工信息
-- 1 查询最高的工资是多少 9000
SELECT MAX(salary) FROM emp;

-- 2 查询员工信息，并且工资等于9000的
SELECT * FROM emp WHERE emp.`salary` = 9000;


-- 一条sql完成操作
SELECT * FROM emp WHERE emp.`salary` = (SELECT MAX(salary) FROM emp);



-- 子查询不同情况

-- 单行单列(运算符: > >= < <= =)
-- 查询员工工资小于平均工资的人
SELECT * FROM emp WHERE emp.`salary`<(SELECT AVG(salary) FROM emp);


-- 多行单列(运算符: in)
-- 查询'财务部'和'市场部'所有员工信息
SELECT id FROM dept WHERE NAME='财务部'OR NAME='市场部';
SELECT * FROM emp WHERE dept_id=3 OR dept_id=2;

SELECT * FROM emp WHERE dept_id IN (3,2);
-- 子查询
SELECT * FROM emp WHERE dept_id IN (SELECT id FROM dept WHERE NAME='财务部'OR NAME='市场部');



-- 多行多列(子查询作为虚拟表来查询)
-- 查询员工入职日期是2011-11-11之后的员工信息和部门信息
SELECT * FROM emp WHERE emp.`join_date`>'2011-11-11';
SELECT * FROM dept t1, (SELECT * FROM emp WHERE emp.`join_date`>'2011-11-11') t2
WHERE t1.id= t2.dept_id ;

-- 普通内连接
SELECT * FROM emp t1,dept t2 WHERE t1.`dept_id`=t2.`id` AND t1.`join_date`>'2011-11-11';





	
	