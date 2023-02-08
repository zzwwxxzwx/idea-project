package test;

import junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    /*
        初始化方法：
        用于申请资源，所有测试方法执行前先执行该方法
     */
    @Before
    public void init() {
        System.out.println("init...");
    }

    /*
        释放资源方法：
        在所有测试方法执行完之后，都会执行该方法
     */
    @After
    public void close(){
        System.out.println("close...");
    }

    @Test
    public void testAdd() {
        Calculator c = new Calculator();
        int result = c.add(1, 2);
        System.out.println("add...");
        Assert.assertEquals(3, result);
    }

    @Test
    public void testSub() {
        Calculator c = new Calculator();
        int result = c.sub(1, 2);
        System.out.println("sub...");
        Assert.assertEquals(-1, result);
    }
}
