package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo5DDL {
    public static void main(String[] args) {
        Statement stmt = null;
        Connection conn = null;

        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.建立连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3","root","root");
            //3.定义sql
            String sql = "create table student(id int ,name varchar(20))";
            //4.获取sql执行对象
            stmt=conn.createStatement();
            //5.执行sql
            int count =stmt.executeUpdate(sql);
            //6.处理结果
            System.out.println(count);//返回只会是0
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(stmt!=null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
