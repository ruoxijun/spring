import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ruoxijun.service.UserService;

public class UserTest {
    @Test
    public void functionOne(){
        ApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        // 因为返回的是代理类，所以这里只能使用接口类型接受对象
        UserService userService = (UserService) context.getBean("userService");
        userService.add();
    }
}
