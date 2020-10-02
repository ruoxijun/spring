import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ruoxijun.pojo.People;

public class My {
    @Test
    public void MyTest(){
        ApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContext.xml");
        People people = (People) context.getBean("people");
        System.out.println(people);
    }
}
