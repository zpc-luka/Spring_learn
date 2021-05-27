import com.zpc.pojo.User;
import com.zpc.pojo.UserT;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void myTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user1 = (User)context.getBean("userNew");
        UserT user2 = (UserT)context.getBean("userT2");
        UserT user3 = (UserT)context.getBean("u2");
        user1.show();
        user2.show();
        user3.show();
        System.out.println(user2 == user3);

    }
}
