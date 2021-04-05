package edu.nju.githubstatistics.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Bright Chan
 * @date: 2021/4/2 19:29
 * @description: SizeCount
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SizeCount {

    /**
     * 0 <= size_count <= 100
     */
    private int level0Count;

    /**
     * 101 <= size_count <= 1000
     */
    private int level1Count;

    /**
     * 1001 <= size_count <= 10000
     */
    private int level2Count;

    /**
     * size_count >= 10001
     */
    private int level3Count;

    private String year;
}
