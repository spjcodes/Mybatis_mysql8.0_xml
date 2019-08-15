package com.spj.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class GetSqlSessionFactor {

    public static SqlSession getSqlSession () {

        String filePath = "Resource/Mybatis_config.xml";
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
        SqlSessionFactory ssf = ssfb.build(reader);
        SqlSession session = ssf.openSession();
        return session;

    }
}
