package edu.nju.githubstatistics.controller;

import edu.nju.githubstatistics.model.GithubRepoInfo;
import edu.nju.githubstatistics.service.GithubRepoInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: Bright Chan
 * @date: 2021/4/1 17:23
 * @description: GithubRepoInfoController
 */

@RestController
public class GithubRepoInfoController {

    @Resource
    private GithubRepoInfoService githubRepoInfoService;

    @GetMapping("/query")
    public List<GithubRepoInfo> query() {
        return githubRepoInfoService.query();
    }
}
