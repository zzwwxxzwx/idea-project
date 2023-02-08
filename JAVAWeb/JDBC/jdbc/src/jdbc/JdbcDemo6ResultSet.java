package jdbc;

import java.sql.*;

public class JdbcDemo6ResultSet {
    public static void main(String[] args) {
        Statement stmt = null;
        Connection conn = null;
        ResultSet rs =null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.建立连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3","root","root");
            //3.定义sql
            String sql = "select  * from  account";
            //4.获取sql执行对象
            stmt=conn.createStatement();
            //5.执行sql
            rs = stmt.executeQuery(sql);
            //6.处理结果

            //6.1 让游标向下移动一行
            while(rs.next()){
                //6.2 获取数据
                int id = rs.getInt(1);
                String name = rs.getString(2);
                double balance = rs.getDouble(3);
                System.out.println(id+"---"+name+"---"+balance);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
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
