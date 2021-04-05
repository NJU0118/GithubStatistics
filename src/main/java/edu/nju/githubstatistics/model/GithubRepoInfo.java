package edu.nju.githubstatistics.model;

import java.util.Date;

/**
 * @author: Bright Chan
 * @date: 2021/4/1 17:00
 * @description: GithubRepoInfo
 */


public class GithubRepoInfo {

    private int infoId;

    private String fullName;

    private String language;

    private boolean nonPublic;

    private boolean fork;

    private boolean hasDescription;

    private boolean hasLicense;

    private int size;

    private int starCount;

    private Date createdAt;

    public GithubRepoInfo() {
    }

    public GithubRepoInfo(int infoId, String fullName, String language,
                          boolean nonPublic, boolean fork, boolean hasDescription,
                          boolean hasLicense, int size, int starCount, Date createdAt) {
        this.infoId = infoId;
        this.fullName = fullName;
        this.language = language;
        this.nonPublic = nonPublic;
        this.fork = fork;
        this.hasDescription = hasDescription;
        this.hasLicense = hasLicense;
        this.size = size;
        this.starCount = starCount;
        this.createdAt = createdAt;
    }

    public int getInfoId() {
        return infoId;
    }

    public void setInfoId(int infoId) {
        this.infoId = infoId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean isNonPublic() {
        return nonPublic;
    }

    public void setNonPublic(boolean nonPublic) {
        this.nonPublic = nonPublic;
    }

    public boolean isFork() {
        return fork;
    }

    public void setFork(boolean fork) {
        this.fork = fork;
    }

    public boolean isHasDescription() {
        return hasDescription;
    }

    public void setHasDescription(boolean hasDescription) {
        this.hasDescription = hasDescription;
    }

    public boolean isHasLicense() {
        return hasLicense;
    }

    public void setHasLicense(boolean hasLicense) {
        this.hasLicense = hasLicense;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getStarCount() {
        return starCount;
    }

    public void setStarCount(int starCount) {
        this.starCount = starCount;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
