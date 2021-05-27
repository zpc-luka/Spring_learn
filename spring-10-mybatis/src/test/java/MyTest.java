import com.zpc.dao.UserMapper;
import com.zpc.dao.UserMapperImpl2;
import com.zpc.pojo.User;
import com.zpc.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {

    @Test
    public void Test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);           //这边好像使用了多态
        List<User> users = userMapper.selectUser();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void Test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper2 = context.getBean("UserMapper2", UserMapper.class);

        List<User> users = userMapper2.selectUser();

        for (User user : users) {
            System.out.println(user);
        }
    }

}
