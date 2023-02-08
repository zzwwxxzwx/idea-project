CREATE TABLE stu(
	id INT,
	NAME VARCHAR(20) NOT NULL -- name为非空
);
-- 删除name的非空约束
ALTER TABLE stu MODIFY NAME VARCHAR(20);
ALTER TABLE stu MODIFY NAME VARCHAR(20) NOT NULL;


SELECT * FROM stu;

DROP TABLE stu;

-- 唯一约束
CREATE TABLE stu(
	id INT,
	phone_number VARCHAR(20) UNIQUE -- 手机号
);

-- 表创建完后添加唯一约束
ALTER TABLE stu MODIFY phone_number VARCHAR(20) UNIQUE;

-- 删除唯一约束
ALTER TABLE stu MODIFY phone_number VARCHAR(20);-- 错误方法
ALTER TABLE stu DROP INDEX phone_number;


SELECT * FROM stu;


-- 主键约束
CREATE TABLE stu(
	id INT PRIMARY KEY, -- 给id添加主键约束
	NAME VARCHAR(20) 
);
-- 删除主键
ALTER TABLE stu MODIFY id INT; -- 错误方法
ALTER TABLE stu DROP PRIMARY KEY;

-- 表创建后，添加主键
ALTER TABLE stu MODIFY id INT PRIMARY KEY;


SELECT * FROM stu;


-- 自动增长
CREATE TABLE stu(
	id INT PRIMARY KEY AUTO_INCREMENT, -- 给id添加主键约束
	NAME VARCHAR(20)
);

INSERT INTO stu VALUES(NULL,'ccc');

-- 添加自动增长
ALTER TABLE stu MODIFY id INT AUTO_INCREMENT;
-- 删除自动增长
ALTER TABLE stu MODIFY id INT;

