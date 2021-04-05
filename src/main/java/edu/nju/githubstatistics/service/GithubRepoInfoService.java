package edu.nju.githubstatistics.service;

import edu.nju.githubstatistics.dto.*;

/**
 * @author: Bright Chan
 * @date: 2021/4/1 17:20
 * @description: GithubRepoInfoService
 */
public interface GithubRepoInfoService {

    DescriptionCount queryDescriptionCount(String year);

    LanguageCount queryLanguageCount(String year);

    LicenseCount queryLicenseCount(String year);

    SizeCount querySizeCount(String year);

    StarCount queryStarCount(String year);
}
