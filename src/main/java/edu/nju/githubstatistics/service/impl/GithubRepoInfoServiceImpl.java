package edu.nju.githubstatistics.service.impl;

import edu.nju.githubstatistics.dao.GithubRepoInfoDao;
import edu.nju.githubstatistics.dto.*;
import edu.nju.githubstatistics.service.GithubRepoInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: Bright Chan
 * @date: 2021/4/1 17:21
 * @description: GithubRepoInfoServiceImpl
 */

@Service
public class GithubRepoInfoServiceImpl implements GithubRepoInfoService {

    @Resource
    private GithubRepoInfoDao githubRepoInfoDao;

    @Override
    public DescriptionCount queryDescriptionCount(String year) {
        Date start = null, end = null;
        try {
            start = getStartTime(year);
            end = getEndTime(year);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return githubRepoInfoDao.queryDescriptionCount(start, end);
    }

    @Override
    public LanguageCount queryLanguageCount(String year) {
        Date start = null, end = null;
        try {
            start = getStartTime(year);
            end = getEndTime(year);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return githubRepoInfoDao.queryLanguageCount(start, end);
    }

    @Override
    public LicenseCount queryLicenseCount(String year) {
        Date start = null, end = null;
        try {
            start = getStartTime(year);
            end = getEndTime(year);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return githubRepoInfoDao.queryLicenseCount(start, end);
    }

    @Override
    public SizeCount querySizeCount(String year) {
        Date start = null, end = null;
        try {
            start = getStartTime(year);
            end = getEndTime(year);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return githubRepoInfoDao.querySizeCount(start, end);
    }

    @Override
    public StarCount queryStarCount(String year) {
        Date start = null, end = null;
        try {
            start = getStartTime(year);
            end = getEndTime(year);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return githubRepoInfoDao.queryStarCount(start, end);
    }

    private Date getStartTime(String year) throws ParseException {
        if (yearNotValid(year)) return null;

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String start = year + "-01-01 00:00:00";
        return simpleDateFormat.parse(start);
    }

    private Date getEndTime(String year) throws ParseException {
        if (yearNotValid(year)) return null;

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String start = year + "-12-31 59:59:59";
        return simpleDateFormat.parse(start);
    }

    private boolean yearNotValid(String year) {
        if (year == null) return true;

        int index = 0, res = 0;
        for (char c : year.toCharArray()) {
            if (!Character.isDigit(c)) return true;
            res = res * 10 + (c - 48);
            index++;
            if (index > 4) return true;
        }
        return res < 2016 || res > 2020;
    }
}
