import io.github.ruoxijun.pojo.Hello;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloTest {
    @Test
    public void hello() {
        /**
         * 通过bean文件(xml)获取Spring上下文对象，
         * 可传入多个bean文件用“,”分隔。
         * 将传入的所用bean文件中的bean实例化为对象，
         * 并存入容器了，等待被调用。
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        // 通过 getBean 方法取出对象，并且返回的是Object类型
        System.out.println(context.getBean("hi1"));

        // getBean 传入bean的id（或则别名）作为参数，获取对应的对象
        Hello hello1 = (Hello) context.getBean("hello"); // id 获取
        // 参2传入对象对应类型的类对象，将返回对应类型
        Hello hello2 =context.getBean("Hello",Hello.class); // 别名获取
        System.out.println(hello1+"\n"+hello2);

        // getBean同一个bean拿到的就是同一个对象
        System.out.println(hello1==hello2);
    }
}
