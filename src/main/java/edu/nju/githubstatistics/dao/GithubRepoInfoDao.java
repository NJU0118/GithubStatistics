package edu.nju.githubstatistics.dao;

import edu.nju.githubstatistics.dto.*;

import java.util.Date;

/**
 * @author: Bright Chan
 * @date: 2021/4/1 17:16
 * @description: GithubRepoInfoDao
 */
public interface GithubRepoInfoDao {

    DescriptionCount queryDescriptionCount(Date startTime, Date endTime);

    LanguageCount queryLanguageCount(Date startTime, Date endTime);

    LicenseCount queryLicenseCount(Date startTime, Date endTime);

    SizeCount querySizeCount(Date startTime, Date endTime);

    StarCount queryStarCount(Date startTime, Date endTime);
}
