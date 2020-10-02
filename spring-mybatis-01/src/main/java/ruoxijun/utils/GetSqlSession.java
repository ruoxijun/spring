package ruoxijun.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class GetSqlSession {
    private static SqlSessionFactory sqlsession;

    static {
        String resources="mybatis-config.xml";
        InputStream in = null;
        try {
            in = Resources.getResourceAsStream(resources);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlsession = new SqlSessionFactoryBuilder().build(in);
    }

    public static SqlSession get(){
        return sqlsession.openSession();
    }
}
