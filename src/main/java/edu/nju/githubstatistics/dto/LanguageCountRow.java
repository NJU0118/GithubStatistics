package edu.nju.githubstatistics.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Bright Chan
 * @date: 2021/4/5 19:59
 * @description: LanguageCountRow
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LanguageCountRow {

    private String language;

    private int count;
}
