import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ruoxijun.config.Config;
import ruoxijun.pojo.User;

public class MyTest {
    @Test
    public void getUser(){
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        User user = (User) context.getBean("user");
        System.out.println(user);
    }
}
