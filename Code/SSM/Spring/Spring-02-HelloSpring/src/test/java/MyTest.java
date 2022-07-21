import com.test.entity.Hello;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        // 获取Spring上下文对象
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 我们的对象现在都在Spring中管理了，我们要使用注解去里面取出来进行了
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }
}