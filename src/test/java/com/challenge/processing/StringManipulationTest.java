package com.challenge.processing;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class StringManipulationTest {

    private StringManipulation subject = new StringManipulation();

    @Test
    public void cleanString_WithAllUpperCaseLetterValue_ReturnsStringWithSameValue() {
        String input = "JAVA";
        String expected = "JAVA";
        String result = subject.cleanString(input);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void cleanString_WithAllLoweCaseStringValue_ReturnsStringWithAllUpperCaseWithSameValue() {
        String input = "java";
        String expected = "JAVA";
        String result = subject.cleanString(input);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void cleanString_WithAllLoweCaseStringValueAndNumericValue_ReturnsStringWithAllUpperCaseWithNoNumericValue
            () {
        String input = "java123";
        String expected = "JAVA";
        String result = subject.cleanString(input);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void
    cleanString_WithAllLoweCaseStringValueAndNumericValueAndBlankSpace_ReturnsStringWithAllUpperCaseWithNoNumericValueAndBlankSpace() {
        String input = "java  123";
        String expected = "JAVA";
        String result = subject.cleanString(input);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void
    cleanString_WithSpecialCharactersAndSpacesAndAlphabeticCharacter_ReturnsUpperCaseValueContainingAllAlphabets() {
        String input = "J 123 @!#@!#@!#  A  52425 123 V     a";
        String expected = "JAVA";
        String result = subject.cleanString(input);
        Assert.assertEquals(expected, result);
    }

    @Test(expected = NullPointerException.class)
    public void cleanString_WithNullValue_ThrowsNullPointerException() {
        subject.cleanString(null);
    }

    @Test
    public void isPalindrome_WithValidPalindrome_ReturnsTrue() {
        String input = "NAN";
        Assert.assertTrue(subject.isPalindrome(input));
    }

    @Test
    public void isPalindrome_WithValidPalindromeButCaseInsensitiveCharacters_ReturnsTrue() {
        String input = "naN";
        Assert.assertTrue(subject.isPalindrome(input));
    }

    @Test
    public void isPalindrome_WithValidPalindromeHavingSpecialCharacters_ReturnsTrue() {
        String input = "na!@#@!#N";
        Assert.assertTrue(subject.isPalindrome(input));
    }

    @Test
    public void isPalindrome_WithInvalidPalindrome_ReturnsFalse() {
        String input = "java";
        Assert.assertFalse(subject.isPalindrome(input));
    }

    @Test
    public void isPalindrome_WithAllUpperCasePalindrome_ReturnsTrue() {
        String input = "JAVAAVAJ";
        Assert.assertTrue(subject.isPalindrome(input));
    }

    @Test
    public void isPalindrome_WithSingleLetter_ReturnsFalse() {
        String input = " ";
        Assert.assertFalse("Empty space is not a palindrome", subject.isPalindrome(input));
    }

    @Test
    public void sort_WithArrayOfRandomLetterStrings_ReturnsSortedArray() {
        String[] input = {"z", "a", "c", "q", "t", "q", "a", "z"};
        String[] expected = {"a", "a", "c", "q", "q", "t", "z", "z"};
        String[] result = subject.sort(input);
        Assert.assertTrue(Arrays.equals(result, expected));
    }

    @Test
    public void sort_WithArrayOfRandomWordsWithTwoLetterStrings_ReturnsSortedArray() {
        String[] input = {"aa", "ba", "cc", "ab"};
        String[] expected = {"aa", "ab", "ba", "cc"};
        String[] result = subject.sort(input);
        Assert.assertTrue(Arrays.equals(result, expected));
    }

    @Test
    public void sort_WithSameWords_ReturnsSortedArray() {
        String[] input = {"java", "java", "java", "java"};
        String[] expected = {"java", "java", "java", "java"};
        String[] result = subject.sort(input);
        Assert.assertTrue(Arrays.equals(result, expected));
    }

    @Test
    public void sort_WithRandomWords_ReturnsSortedArray() {
        String[] input = {"she", "sells", "sea", "shells"};
        String[] expected = {"sea", "sells", "she", "shells"};
        String[] result = subject.sort(input);
        Assert.assertTrue(Arrays.equals(result, expected));
    }
}