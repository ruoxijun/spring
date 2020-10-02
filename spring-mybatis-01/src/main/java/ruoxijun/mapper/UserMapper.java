package ruoxijun.mapper;

import ruoxijun.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> getUserList();
    int insertUser(User user);
    int deleteUser(int id);
}
