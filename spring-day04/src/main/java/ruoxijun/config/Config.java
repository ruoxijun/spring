package ruoxijun.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import ruoxijun.pojo.User;

@Configuration
@ComponentScan("ruoxijun")
//@Import(Config.class)
public class Config {
//    @Bean
//    public User user(){
//        return new User();
//    }
}
