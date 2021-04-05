package edu.nju.githubstatistics.controller;

import edu.nju.githubstatistics.dto.*;
import edu.nju.githubstatistics.service.GithubRepoInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: Bright Chan
 * @date: 2021/4/1 17:23
 * @description: GithubRepoInfoController
 */

@RestController
public class GithubRepoInfoController {

    @Resource
    private GithubRepoInfoService githubRepoInfoService;

    @GetMapping("/description/count")
    public DescriptionCount getDescriptionCount(String year) {
        return githubRepoInfoService.queryDescriptionCount(year);
    }

    @GetMapping("/language/count")
    public LanguageCount getLanguageCount(String year) {
        return githubRepoInfoService.queryLanguageCount(year);
    }

    @GetMapping("/license/count")
    public LicenseCount getLicenseCount(String year) {
        return githubRepoInfoService.queryLicenseCount(year);
    }

    @GetMapping("/size/count")
    public SizeCount getSizeCount(String year) {
        return githubRepoInfoService.querySizeCount(year);
    }

    @GetMapping("/star/count")
    public StarCount getStarCount(String year) {
        return githubRepoInfoService.queryStarCount(year);
    }
}
