import com.test.entity.User;
import com.test.mapper.Impl.UserMapperImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void myTest01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapperImpl userMapper = context.getBean("userMapper", UserMapperImpl.class);
        List<User> users = userMapper.getAll();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
