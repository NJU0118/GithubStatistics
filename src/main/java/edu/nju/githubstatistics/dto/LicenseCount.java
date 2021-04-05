package edu.nju.githubstatistics.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Bright Chan
 * @date: 2021/4/2 19:10
 * @description: LicenseCount
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LicenseCount {

    private int hasLicenseCount;

    private int noLicenseCount;

    private String year;
}
