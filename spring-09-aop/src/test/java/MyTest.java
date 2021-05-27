import com.zpc.service.UserService;
import com.zpc.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void Test () {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //动态代理代理的是接口  注意点
        UserService userService = context.getBean("userService", UserService.class);

        userService.add();
    }
}
