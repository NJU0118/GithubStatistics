package edu.nju.githubstatistics.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Bright Chan
 * @date: 2021/4/2 19:14
 * @description: DescriptionCount
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DescriptionCount {

    private int hasDescriptionCount;

    private int noDescriptionCount;

    private String year;
}
