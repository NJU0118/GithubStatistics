package edu.nju.githubstatistics.dao;

import edu.nju.githubstatistics.model.GithubRepoInfo;

import java.util.List;

/**
 * @author: Bright Chan
 * @date: 2021/4/1 17:16
 * @description: GithubRepoInfoDao
 */
public interface GithubRepoInfoDao {

    List<GithubRepoInfo> query();
}
