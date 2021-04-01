package edu.nju.githubstatistics.service;

import edu.nju.githubstatistics.model.GithubRepoInfo;

import java.util.List;

/**
 * @author: Bright Chan
 * @date: 2021/4/1 17:20
 * @description: GithubRepoInfoService
 */
public interface GithubRepoInfoService {

    List<GithubRepoInfo> query();
}
