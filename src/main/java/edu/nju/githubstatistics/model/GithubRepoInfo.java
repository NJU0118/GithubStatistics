package edu.nju.githubstatistics.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author: Bright Chan
 * @date: 2021/4/1 17:00
 * @description: GithubRepoInfo
 */

@Entity
@Table(name = "github_repo_info")
public class GithubRepoInfo {

    @Id
    @Column(name = "info_id")
    private int infoId;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "language")
    private String language;

    @Column(name = "private")
    private boolean nonPublic;

    @Column(name = "fork")
    private boolean fork;

    @Column(name = "has_description")
    private boolean hasDescription;

    @Column(name = "has_license")
    private boolean hasLicense;

    @Column(name = "size")
    private int size;

    @Column(name = "star_count")
    private int starCount;

    @Column(name = "created_at")
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
