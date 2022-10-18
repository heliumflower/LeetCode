package com.helium;

import java.util.Arrays;

/**
 * 描述：最长公共子序列
 *
 * @author gaoxu
 * @date 2022/10/17 23:02
 */
public class GX_1143_LongestCommonSubsequence {

    // text1 = "abcde", text2 = "ace"

    //"bsbininm"
    //"jmjkbkjkv"

    public static void main(String[] args) {
        GX_1143_LongestCommonSubsequence l = new GX_1143_LongestCommonSubsequence();
        // System.out.println(l.longestCommonSubsequence("bsbininm", "jmjkbkjkv"));
        System.out.println(l.longestCommonSubsequence("abcde", "ace"));
    }

    public int longestCommonSubsequence(String text1, String text2) {
        int max = 0;
        if (text1 == null || text2 == null) {
            return max;
        }
        int[][] m = new int[text1.length() + 1][text2.length() + 1];

        for (int i = 0; i < text1.length(); i++) {
            for (int j = 0; j < text2.length(); j++) {
                m[i + 1][j + 1] = Math.max(m[i + 1][j], m[i][j + 1]);
                if (text1.charAt(i) == text2.charAt(j)) {
                    m[i + 1][j + 1] = m[i][j] + 1;
                }
            }
        }

        for (int[] date : m) {
            System.out.println(Arrays.toString(date));
        }

        return m[text1.length()][text2.length()];
    }

}
