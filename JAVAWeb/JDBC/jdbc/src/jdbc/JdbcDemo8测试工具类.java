package jdbc;

import domain.Emp;
import util.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JdbcDemo8测试工具类 {
    public List<Emp> findAll2(){

        Statement stmt = null;
        Connection conn = null;
        ResultSet rs =null;
        List<Emp> list  = null;
        try {
//            //1.注册驱动
//            Class.forName("com.mysql.jdbc.Driver");
//            //2.建立连接
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3","root","root");
            conn = JDBCUtils.getConnection();
            //3.定义sql
            String sql = "select  * from  emp";
            //4.获取sql执行对象
            stmt=conn.createStatement();
            //5.执行sql
            rs = stmt.executeQuery(sql);
            //6.便利结果集
            Emp emp = null;
            list  = new ArrayList<Emp>();
            while(rs.next()){
                //获取数据
                int id = rs.getInt("id");
                String ename = rs.getString("ename");
                int job_id =rs.getInt("job_id");
                int mgr=rs.getInt("mgr");
                Date joindate = rs.getDate("joindate");
                double salary =rs.getDouble("salary");
                double bonus =rs.getDouble("bonus");
                int dept_id = rs.getInt("dept_id");
                emp = new Emp(id,ename,job_id,mgr,joindate,salary,bonus,dept_id);
                list.add(emp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs,stmt,conn);
//            if(rs!=null){
//                try {
//                    rs.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//            if(stmt!=null){
//                try {
//                    stmt.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//            if(conn!=null){
//                try {
//                    conn.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
        }

        return list;
    }

    public static void main(String[] args) {
        List<Emp> list= new JdbcDemo8测试工具类().findAll2();
        System.out.println(list);
        System.out.println(list.size());
    }
}
