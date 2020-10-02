package ruoxijun.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Data
// 组件，等价于：<bean id="cat" class="ruoxijun.pojo.cat"/>
@Component
@Scope("singleton")
public class Cat {
    // 属性注入,等价于：<property name="name" value="猫"/>
    @Value("猫")
    private String name;
}
