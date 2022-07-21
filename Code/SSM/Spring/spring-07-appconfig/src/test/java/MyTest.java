import com.test.config.MyConfig;
import com.test.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    @Test
    public void myTest01(){
        // 如果要完全通过配置类的方式使用，就只能通过AnnotationConfigApplicationContext上下文来获取容器，通过配置类class对象加载
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        User user = context.getBean("getUser", User.class);
        System.out.println(user);
    }
}
