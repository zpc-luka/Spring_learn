import com.zpc.config.Config;
import com.zpc.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    @Test
    public void Test() {
        //如果完全使用了配置类方式去做，我们就只能通过AnnotationConfig 上下文来获取容器， 通过配置类的class加载
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        User user = context.getBean("getUser", User.class);
        System.out.println(user.hashCode());
    }

}
