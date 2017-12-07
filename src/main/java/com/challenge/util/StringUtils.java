package com.challenge.util;

import static com.challenge.constants.StringConstants.PALINDROME_WORD;

public final class StringUtils {

    public static String formatPalindromeWord(String word, boolean isPalindrome) {
        return String.format(PALINDROME_WORD, word, isPalindrome);
    }
}
