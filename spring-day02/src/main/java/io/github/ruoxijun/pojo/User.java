package io.github.ruoxijun.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String name; // 字符串类型
    private Address address; // 对象（引用类型）
    private String[] arrs; // 数组
    private List<String> list;
    private Map<String,String> map;
    private Set<String> set;
    private Properties pro; // Hashtable的子类
    private String empty; // 空指针
}
