package edu.nju.githubstatistics.dao;

import org.apache.ibatis.session.SqlSession;

import javax.annotation.Resource;

/**
 * @author: Bright Chan
 * @date: 2021/4/1 17:12
 * @description: BaseDao
 */
public class BaseDao {

    @Resource
    protected SqlSession sqlSession;

    public SqlSession getSqlSession() {
        return sqlSession;
    }

    public void setSqlSession(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }
}
