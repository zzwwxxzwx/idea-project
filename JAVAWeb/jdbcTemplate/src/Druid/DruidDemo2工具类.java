package Druid;

import utils.JDBCUtils;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DruidDemo2工具类 {

    public static void main(String[] args) {
        //给ds3的account表添加一条记录
        PreparedStatement pstmt =null;
        Connection conn = null;
        try {
            //1.获取连接
            conn = JDBCUtils.getConnection();
            //2.定义sql
            String  sql = "insert into account values (null,?,?)";
            //3.获取pstmt对象
            pstmt = conn.prepareStatement(sql);
            //4.给?赋值
            pstmt.setString(1,"王五");
            pstmt.setDouble(2,3000);
            //5.执行sql
            pstmt.executeUpdate();
            System.out.println(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(pstmt,conn);
        }
    }


}
