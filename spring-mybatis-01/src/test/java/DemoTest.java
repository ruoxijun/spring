import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ruoxijun.mapper.UserMapper;
import ruoxijun.pojo.User;
import ruoxijun.utils.GetSqlSession;

import java.util.List;

public class DemoTest {
    @Test
    public void getUserList(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = (UserMapper) context.getBean("userMapper");
        userMapper.getUserList();
    }
}
