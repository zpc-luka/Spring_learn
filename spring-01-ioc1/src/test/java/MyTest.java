import com.zpc.dao.UserDaoMysqlImpl;
import com.zpc.service.UserServiceImp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void Test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImp userServiceImpl = (UserServiceImp) context.getBean("UserService");

        userServiceImpl.getUser();
    }
}
