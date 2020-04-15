import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

public class Test {
    @Before
    public void start(){
        System.out.println("方法运行前");
    }
    @org.junit.Test
    public void test(){
        int c=7+6;
        Assert.assertEquals(2,c);
    }
    @After
    public void end(){
        System.out.println("方法结束");
    }
}
