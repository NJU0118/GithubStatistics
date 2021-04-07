package edu.nju.githubstatistics.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author: Bright Chan
 * @date: 2021/4/1 17:00
 * @description: GithubRepoInfo
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
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
}
