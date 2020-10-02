package ruoxijun.mapper;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import ruoxijun.pojo.User;

import java.util.List;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {
    @Override
    public List<User> getUserList() {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        mapper.insertUser(new User(6,"龙龙",20));
        mapper.deleteUser(6);
        return mapper.getUserList();
    }

    @Override
    public int insertUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).insertUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
}
