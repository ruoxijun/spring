import io.github.ruoxijun.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void diTest(){
        ApplicationContext Context = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) Context.getBean("user");
        System.out.println(user);
    }
}
