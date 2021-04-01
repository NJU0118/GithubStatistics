package edu.nju.githubstatistics.dao;

import java.util.List;

/**
 * @author: Bright Chan
 * @date: 2021/4/1 17:12
 * @description: BaseDao
 */
public interface BaseDao<T> {

    List<T> getResultsByHQL(String hql);
}
