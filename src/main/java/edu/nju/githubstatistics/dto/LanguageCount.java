package edu.nju.githubstatistics.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author: Bright Chan
 * @date: 2021/4/2 18:56
 * @description: LanguageCount
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LanguageCount {

    private List<LanguageCountRow> rows;

    private String year;
}
