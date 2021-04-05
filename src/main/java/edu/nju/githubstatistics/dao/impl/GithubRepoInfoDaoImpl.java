package edu.nju.githubstatistics.dao.impl;

import edu.nju.githubstatistics.dao.BaseDao;
import edu.nju.githubstatistics.dao.GithubRepoInfoDao;
import edu.nju.githubstatistics.dto.*;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * @author: Bright Chan
 * @date: 2021/4/1 17:18
 * @description: GithubRepoInfoDaoImpl
 */

@Repository
public class GithubRepoInfoDaoImpl extends BaseDao implements GithubRepoInfoDao {

    @Override
    public DescriptionCount queryDescriptionCount(Date startTime, Date endTime) {
        Map<String, Object> condition = getQueryCondition(startTime, endTime);

        DescriptionCount res = new DescriptionCount();
        if (startTime == null) {
            res.setYear(null);
        }
        else {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(startTime);
            res.setYear(calendar.get(Calendar.YEAR) + "");
        }
        try {
            condition.put("description", 1);
            int hasDescription = sqlSession.selectOne(
                    "edu.nju.githubstatistics.github_repo_info.query_description_count", condition);
            condition.put("description", 0);
            int noDescription = sqlSession.selectOne(
                    "edu.nju.githubstatistics.github_repo_info.query_description_count", condition);
            res.setHasDescriptionCount(hasDescription);
            res.setNoDescriptionCount(noDescription);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public LanguageCount queryLanguageCount(Date startTime, Date endTime) {
        Map<String, Object> condition = getQueryCondition(startTime, endTime);

        LanguageCount res = new LanguageCount();
        if (startTime == null) {
            res.setYear(null);
        }
        else {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(startTime);
            res.setYear(calendar.get(Calendar.YEAR) + "");
        }
        try {
            List<LanguageCountRow> list = sqlSession.selectList(
                    "edu.nju.githubstatistics.github_repo_info.query_language_count", condition);
            res.setRows(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public LicenseCount queryLicenseCount(Date startTime, Date endTime) {
        Map<String, Object> condition = getQueryCondition(startTime, endTime);

        LicenseCount res = new LicenseCount();
        if (startTime == null) {
            res.setYear(null);
        }
        else {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(startTime);
            res.setYear(calendar.get(Calendar.YEAR) + "");
        }
        try {
            condition.put("license", 1);
            int hasLicense = sqlSession.selectOne(
                    "edu.nju.githubstatistics.github_repo_info.query_license_count", condition);
            condition.put("license", 0);
            int noLicense = sqlSession.selectOne(
                    "edu.nju.githubstatistics.github_repo_info.query_license_count", condition);
            res.setHasLicenseCount(hasLicense);
            res.setNoLicenseCount(noLicense);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public SizeCount querySizeCount(Date startTime, Date endTime) {
        Map<String, Object> condition = getQueryCondition(startTime, endTime);

        SizeCount res = new SizeCount();
        if (startTime == null) {
            res.setYear(null);
        }
        else {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(startTime);
            res.setYear(calendar.get(Calendar.YEAR) + "");
        }
        try {
            condition.put("startSize", 0);
            condition.put("endSize", 100);
            int level0Count = sqlSession.selectOne(
                    "edu.nju.githubstatistics.github_repo_info.query_size_count", condition);
            res.setLevel0Count(level0Count);

            condition.put("startSize", 101);
            condition.put("endSize", 1000);
            int level1Count = sqlSession.selectOne(
                    "edu.nju.githubstatistics.github_repo_info.query_size_count", condition);
            res.setLevel1Count(level1Count);

            condition.put("startSize", 1001);
            condition.put("endSize", 10000);
            int level2Count = sqlSession.selectOne(
                    "edu.nju.githubstatistics.github_repo_info.query_size_count", condition);
            res.setLevel2Count(level2Count);

            condition.put("startSize", 10001);
            condition.remove("endSize");
            int level3Count = sqlSession.selectOne(
                    "edu.nju.githubstatistics.github_repo_info.query_size_count", condition);
            res.setLevel3Count(level3Count);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public StarCount queryStarCount(Date startTime, Date endTime) {
        Map<String, Object> condition = getQueryCondition(startTime, endTime);

        StarCount res = new StarCount();
        if (startTime == null) {
            res.setYear(null);
        }
        else {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(startTime);
            res.setYear(calendar.get(Calendar.YEAR) + "");
        }
        try {
            condition.put("startStar", 0);
            condition.put("endStar", 10);
            int level0Count = sqlSession.selectOne(
                    "edu.nju.githubstatistics.github_repo_info.query_star_count", condition);
            res.setLevel0Count(level0Count);

            condition.put("startStar", 11);
            condition.put("endStar", 100);
            int level1Count = sqlSession.selectOne(
                    "edu.nju.githubstatistics.github_repo_info.query_star_count", condition);
            res.setLevel1Count(level1Count);

            condition.put("startStar", 101);
            condition.put("endStar", 1000);
            int level2Count = sqlSession.selectOne(
                    "edu.nju.githubstatistics.github_repo_info.query_star_count", condition);
            res.setLevel2Count(level2Count);

            condition.put("startStar", 1001);
            condition.remove("endStar");
            int level3Count = sqlSession.selectOne(
                    "edu.nju.githubstatistics.github_repo_info.query_star_count", condition);
            res.setLevel3Count(level3Count);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    private Map<String, Object> getQueryCondition(Date startTime, Date endTime) {
        Map<String, Object> condition = new HashMap<>();
        condition.put("startTime", startTime);
        condition.put("endTime", endTime);
        return condition;
    }
}
