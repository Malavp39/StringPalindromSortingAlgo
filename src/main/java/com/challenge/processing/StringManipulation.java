package com.challenge.processing;

public class StringManipulation {

    private static final int MIN_LOWER_CASE = 0x61;

    private static final int MAX_LOWER_CASE = 0x7A;

    private static final int MIN_UPPER_CASE = 0x41;

    private static final int MAX_UPPER_CASE = 0x5A;

    private static final int LOWER_TO_UPPER_CASE_OFFSET = 0x20;

    /**
     * This method sorts the given string array of words using 3 way partition quick sort.
     *
     * @param words String array of words to be sorted
     * @return the same String[] object with elements sorted in natural order.
     */
    public String[] sort(String[] words) {
        sort(words, 0, words.length - 1);
        return words;
    }

    /**
     * This method is used to check if a word is palindrome. It will only consider alphabetic character and ignore non
     * alphabetic characters. Also the method will be case insensitive. For instance, call to isPalindrome("Nan"),
     * isPalindrome("N!@#an"), isPalindrome("NaN21321") will return true.
     *
     * @param word String word to be checked for being palindrome.
     * @return boolean true if it is palindrome else false.
     */
    public boolean isPalindrome(String word) {
        char[] upperCaseAlphabets = cleanString(word).toCharArray();
        return !isEmpty(upperCaseAlphabets) && isPalindrome(upperCaseAlphabets);
    }

    /**
     * This method removes all the non-alphabetical characters from a given string and converts all the characters to
     * uppercase.
     *
     * @param str String to be cleaned
     * @return String containing alphabetic characters only
     */
    public String cleanString(String str) {
        char[] input = str.toCharArray();
        char[] upperCaseAlphabets = new char[getAlphabetCount(input)];
        int index = 0;
        for (char c : str.toCharArray())
            if (isAlphabet(c))
                upperCaseAlphabets[index++] = toUpperCase(c);
        return new String(upperCaseAlphabets);
    }

    /**
     * The recursive method which is used to sort the given array until all the elements are sorted.
     *
     * @param words String array to be sorted
     * @param low   int index value of first element of array
     * @param high  int index value of last element of array
     */
    private static void sort(String[] words, int low, int high) {
        if (high <= low) return;
        int lessThan = low, greaterThan = high;
        String pivot = words[low];
        int i = low;
        while (i <= greaterThan) {
            int compareTo = words[i].compareTo(pivot);
            if (compareTo < 0) swap(words, lessThan++, i++);
            else if (compareTo > 0) swap(words, i, greaterThan--);
            else i++;
        }
        sort(words, low, lessThan - 1);
        sort(words, greaterThan + 1, high);
    }

    /**
     * This method is used as a helper method to swap the elements of a given array using provided index position.
     *
     * @param words String array of words whose ith and jth elements are to be swapped
     * @param i     int index position, the element at which will be swapped to jth index position
     * @param j     int index position, the element at which will be swapped to ith index position
     */
    private static void swap(String[] words, int i, int j) {
        String swap = words[i];
        words[i] = words[j];
        words[j] = swap;
    }

    /**
     * This method is used to check if a word is palindrome. It will only consider alphabetic character and ignore non
     * alphabetic characters. Also the method will be case insensitive. For instance, call to isPalindrome("Nan"),
     * isPalindrome("N!@#an"), isPalindrome("NaN21321") will return true.
     *
     * @param upperCaseAlphabets char array containing chars to be checked for being palindrome.
     * @return boolean true if char array is palindrome or else false.
     */
    private boolean isPalindrome(char[] upperCaseAlphabets) {
        int length = upperCaseAlphabets.length;
        for (int i = 0; i < length / 2; i++) {
            if (upperCaseAlphabets[i] != upperCaseAlphabets[length - i - 1])
                return false;
        }
        return true;
    }

    /**
     * This method is used to determine whether a given char array is empty or not.
     *
     * @param upperCaseAlphabets char array containing alphabets
     * @return boolean true if it is empty or else false
     */
    private boolean isEmpty(char[] upperCaseAlphabets) {
        return upperCaseAlphabets.length == 0;
    }

    /**
     * This method is used to get the count of the characters which are alphabetic for a given character array
     *
     * @param inputChars char array with any kind of character
     * @return int count of the alphabetic characters in inputChars
     */
    private int getAlphabetCount(char[] inputChars) {
        int count = 0;
        for (char c : inputChars)
            if (isAlphabet(c))
                count++;
        return count;
    }

    /**
     * This method is used to convert the given lowercase character to uppercase. If the character is already in
     * uppercase then it is returned as it is.
     *
     * @param c alphabetic character which is needed to be converted to uppercase
     * @return char the upper case representation of given input character
     */
    private char toUpperCase(char c) {
        return isUpperCaseAlphabet(c) ? c : (char) (c - LOWER_TO_UPPER_CASE_OFFSET);
    }

    /**
     * This method is used to determine whether a given character is alphabetic or not.
     *
     * @param c int representation of a character
     * @return boolean true if given character value is alphabetic or else false.
     */
    private boolean isAlphabet(int c) {
        return isLowerCaseAlphabet(c) || isUpperCaseAlphabet(c);
    }

    /**
     * This method is used to determine whether a given character an uppercase alphabet or not.
     *
     * @param c int representation of a character
     * @return boolean true if the alphabetic character is uppercase or else false
     */
    private boolean isUpperCaseAlphabet(int c) {
        return MIN_UPPER_CASE <= c && MAX_UPPER_CASE >= c;
    }

    /**
     * This method is used to determine whether a given character an lowercase alphabet or not.
     *
     * @param c int representation of a character
     * @return boolean true if the alphabetic character is lowercase or else false
     */
    private boolean isLowerCaseAlphabet(int c) {
        return MIN_LOWER_CASE <= c && MAX_LOWER_CASE >= c;
    }
}
