package edu.nju.githubstatistics.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Bright Chan
 * @date: 2021/4/2 19:17
 * @description: StarCount
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StarCount {

    /**
     * 0 <= star_count <= 10
     */
    private int level0Count;

    /**
     * 11 <= star_count <= 100
     */
    private int level1Count;

    /**
     * 101 <= star_count <= 1000
     */
    private int level2Count;

    /**
     * star_count >= 1001
     */
    private int level3Count;

    private String year;
}
