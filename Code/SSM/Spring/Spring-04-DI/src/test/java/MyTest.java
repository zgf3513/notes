import com.test.entity.Student;
import com.test.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("UserBeans.xml");
        User user = context.getBean("user2",User.class);
        User user2 = context.getBean("user2",User.class);
        System.out.println(user==user2);
        System.out.println(user2);
    }
}
