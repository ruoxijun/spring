package ruoxijun.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;


@Data

@Component
public class People {
    private Cat cat;
    private Dog dog;
    private String name;
}
