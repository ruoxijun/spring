package ruoxijun.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class User {
    @Value("若惜君")
    private String name;
}
