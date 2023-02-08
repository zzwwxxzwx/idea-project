package jdbc;

import util.JDBCUtils;

import java.sql.*;
import java.util.Scanner;

/*
	* 需求：
		1. 通过键盘录入用户名和密码
		2. 判断用户是否登录成功
			* select * from user where username = "" and password = "";
			* 如果这个sql有查询结果，则成功，反之，则失败
 */

public class JdbcDemo10工具类练习登录安全版 {
    public boolean login(String username, String  password) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        if (username == null || password == null) {
            return false;
        }
        //连接数据库判断是否登录成功
        //1.获取数据库连接

        try {
            conn = JDBCUtils.getConnection();
            //2.定义sql
            String sql = "select  * from user where username = ? and password = ?";
            //3.获取执行sql的对象
            pstmt = conn.prepareStatement(sql);
            //给?赋值
            pstmt.setString(1,username);
            pstmt.setString(2,password);
            //4.执行查询,不需要传递sql
            rs = pstmt.executeQuery();
            //5.判断
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(rs, pstmt, conn);
        }
        return false;
    }

    public static void main(String[] args) {
        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户");
        String username = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();
        //2.调用方法
        boolean flag = new JdbcDemo10工具类练习登录安全版().login(username, password);
        //3.判断结果，输出语句
        if (flag) {
            System.out.println("登录成功");
        } else {
            System.out.println("用户名或密码错误");
        }
    }
}
