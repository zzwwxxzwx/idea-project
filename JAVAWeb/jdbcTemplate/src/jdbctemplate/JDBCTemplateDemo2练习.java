package jdbctemplate;

import domain.Emp;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import utils.JDBCUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Map;

/*
		* 需求：
			1. 修改emp1号数据的 salary 为 10000
			2. 添加一条记录
			3. 删除刚才添加的记录
			4. 查询id为1的记录，将其封装为Map集合
			5. 查询所有记录，将其封装为List
			6. 查询所有记录，将其封装为Emp对象的List集合
			7. 查询总记录数
 */

public class JDBCTemplateDemo2练习 {
    //1.获取JDBCTemplate对象
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

//    1. 修改emp1号数据的 salary 为 10000
    @Test
    public void test1(){
        //2.定义sql
        String sql = "update emp set salary = 10000 where id = 1001";
        //3.执行sql
        int count = template.update(sql);
        System.out.println(count);
    }


//    2. 添加一条记录
    @Test
    public void test2(){

        //2.定义sql
        String sql = "insert into emp(id,ename,dept_id) values (?,?,?)";
        //3.执行sql
        int count =template.update(sql,1015,"郭靖",10);
        System.out.println(count);
    }


//    3. 删除刚才添加的记录
    @Test
    public void test3(){

        //2.定义sql
        String sql = "delete from emp where id = ?";
        //3.执行sql
        int count =template.update(sql,1015);
        System.out.println(count);
    }


//    4. 查询id为1的记录，将其封装为Map集合
    //该结果长度只能为1
    @Test
    public void test4(){
        //2.定义sql
        String sql = "select * from  emp where  id = ? ";
        //3.执行sql
        Map<String,Object> map=template.queryForMap(sql,1001);
        System.out.println(map);
    }


//    5. 查询所有记录，将其封装为List
    @Test
    public void test5(){
        //2.定义sql
        String sql = "select * from  emp ";
        //3.执行sql
        List<Map<String, Object>> list = template.queryForList(sql);
        for (Map<String, Object> stringObjectMap:list){
            System.out.println(stringObjectMap);
        }
    }


//    6. 查询所有记录，将其封装为Emp对象的List集合
    /*传统方法
    @Test
    public void test6(){
        //2.定义sql
        String sql = "select * from  emp ";
        //3.执行sql
        List<Emp> list = template.query(sql, new RowMapper<Emp>() {
            @Override
            public Emp mapRow(ResultSet rs, int i) throws SQLException {
                int id = rs.getInt("id");
                String ename = rs.getString("ename");
                int job_id = rs.getInt("job_id");
                int mgr = rs.getInt("mgr");
                Date joindate = rs.getDate("joindate");
                double salary = rs.getDouble("salary");
                double bonus = rs.getDouble("bonus");
                int dept_id = rs.getInt("dept_id");
                return new Emp(id, ename, job_id, mgr, joindate, salary, bonus, dept_id);
            }
        });
        for (Emp emp:list){
            System.out.println(emp);
        }
    }
    */

    //新方法
    @Test
    public void test6_2(){
        String sql = "select * from  emp ";
        List<Emp> list = template.query(sql, new BeanPropertyRowMapper<Emp>(Emp.class));
        for (Emp emp : list) {
            System.out.println(emp);
        }
    }

//    7. 查询总记录数
    @Test
    public void test7(){
        String sql = "select count(id) from  emp ";
        Long total = template.queryForObject(sql, Long.class);
        System.out.println(total);
    }
}
