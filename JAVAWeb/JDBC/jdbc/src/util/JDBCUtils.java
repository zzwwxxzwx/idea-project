package util;

import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.*;
import java.util.Properties;

//JDBC工具类
public class JDBCUtils {
    private static String url;
    private static String user;
    private static String password;
    private static String driver;
    //静态代码块，使得文件只需要读取一次，即随类的加载而加载
    static {
        try {
            //读取资源文件，获取值
            //1.创建Properties集合类
            Properties pro = new Properties();

            //2.加载文件
//            pro.load(new FileReader("src/jdbc.properties"));//该方法不行
            //获取src路径下文件的方式---->ClassLoader类加载器
            ClassLoader classLoader = JDBCUtils.class.getClassLoader();
            URI res = classLoader.getResource("jdbc.properties").toURI();//URL为统一资源定位符
            String path = res.getPath();
//            String path1 = URLDecoder.decode(path,"utf-8");
//            System.out.println(path);
            pro.load(new FileReader(path));

            //3.获取数据，赋值
            url= pro.getProperty("url");
            user = pro.getProperty("user");
            password = pro.getProperty("password");
            driver=pro.getProperty("driver");
            Class.forName(driver);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    //获取连接
    //return连接对象
    public static Connection getConnection() throws SQLException {//不传递参数，保证工具类通用性:通过配置文件
        return DriverManager.getConnection(url,user,password);
    }

    //释放资源
    public static void close(Statement stmt, Connection conn){
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


    public static void close(ResultSet rs,Statement stmt, Connection conn){
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
