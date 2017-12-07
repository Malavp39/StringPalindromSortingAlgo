package com.challenge.util;


import com.challenge.processing.StringManipulation;

import java.util.function.Function;

public final class FunctionUtils {

    private FunctionUtils() {

    }

    public static Function<String, String> getWordToPalindromeFunction(StringManipulation stringManipulator) {
        return cleanString -> StringUtils.formatPalindromeWord(cleanString, stringManipulator.isPalindrome(cleanString));
    }
}
