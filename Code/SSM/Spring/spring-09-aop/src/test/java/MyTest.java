import com.test.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void MyTest01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = context.getBean("userService", UserService.class);

        userService.add();

    }
}
