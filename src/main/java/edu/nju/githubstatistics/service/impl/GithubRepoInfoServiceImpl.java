package edu.nju.githubstatistics.service.impl;

import edu.nju.githubstatistics.dao.GithubRepoInfoDao;
import edu.nju.githubstatistics.model.GithubRepoInfo;
import edu.nju.githubstatistics.service.GithubRepoInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: Bright Chan
 * @date: 2021/4/1 17:21
 * @description: GithubRepoInfoServiceImpl
 */

@Service
@Transactional
public class GithubRepoInfoServiceImpl implements GithubRepoInfoService {

    @Resource
    private GithubRepoInfoDao githubRepoInfoDao;

    @Override
    public List<GithubRepoInfo> query() {
        return githubRepoInfoDao.query();
    }
}
