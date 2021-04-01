package edu.nju.githubstatistics.dao.impl;

import edu.nju.githubstatistics.dao.GithubRepoInfoDao;
import edu.nju.githubstatistics.model.GithubRepoInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: Bright Chan
 * @date: 2021/4/1 17:18
 * @description: GithubRepoInfoDaoImpl
 */

@Repository
public class GithubRepoInfoDaoImpl extends BaseDaoImpl<GithubRepoInfo> implements GithubRepoInfoDao {

    @Override
    public List<GithubRepoInfo> query() {
        String hql = "";
        return getResultsByHQL(hql);
    }
}
