import com.zpc.pojo.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void Test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        Person person = context.getBean("person", Person.class);

        System.out.println(person);

    }
}
