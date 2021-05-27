import com.zpc.pojo.Hello;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test() {
        // 获取Spring的上下文对象
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //我们的对象都在Spring中管理了， 我们要使用， 直接去里面取就可以了
        Hello hello = (Hello)context.getBean("hello");

        hello.show();
    }
}
