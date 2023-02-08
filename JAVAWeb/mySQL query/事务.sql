-- 创建数据表
CREATE TABLE account (
	id INT PRIMARY KEY AUTO_INCREMENT,
	NAME VARCHAR(10),
	balance DOUBLE
);
-- 添加数据
INSERT INTO account (NAME, balance) VALUES ('张三', 1000), ('李四', 1000);


UPDATE account SET balance = 1000;
SELECT * FROM account;


-- 开启事务
START TRANSACTION
-- 张三给李四转账500
-- 张三账户 -500
UPDATE account SET balance = balance-500 WHERE NAME = '张三';
-- 李四账户+500
UPDATE account SET balance = balance+500 WHERE NAME = '李四';

-- 发现执行没有问题，提交事务
COMMIT;
-- 发现错误，回滚事务
ROLLBACK;

SELECT @@autocommit; -- 1表示自动提交 0表示手动提交
SET @@autocommit=0;

SELECT @@tx_isolation;

SET GLOBAL TRANSACTION ISOLATION LEVEL READ COMMITTED;

SET GLOBAL TRANSACTION ISOLATION LEVEL REPEATABLE READ;

START TRANSACTION
