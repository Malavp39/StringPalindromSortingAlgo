package com.benchmarks;

import com.challenge.processing.StringManipulation;

//To check performance 
public class BenchMark {

    private static final String[] SM_SORT_STRING_INPUT = {
    		"ONE", "TWO", "AA", "()*&^%$", "$%^&*(", "CC", "DDDD","JaVa", "AVAV",
            "ONE", "TWO", "AA", "()*&^%$", "$%^&*(", "CC", "DDDD", "JaVa", "AVAV",
            "ONE", "TWO", "AA", "()*&^%$", "$%^&*(", "CC", "DDDD", "JaVa", "AVAV",
            "ONE", "TWO", "AA", "()*&^%$", "$%^&*(", "CC", "DDDD", "JaVa", "AVAV",
            "ONE", "TWO", "AA", "()*&^%$", "$%^&*(", "CC", "DDDD", "JaVa", "AVAV",
            "ONE", "TWO", "AA", "()*&^%$", "$%^&*(", "CC", "DDDD", "JaVa", "AVAV",
            "ONE", "TWO", "AA", "()*&^%$", "$%^&*(", "CC", "DDDD", "JaVa", "AVAV",
            "ONE", "TWO", "AA", "()*&^%$", "$%^&*(", "CC", "DDDD", "JaVa", "AVAV",
            "ONE", "TWO", "AA", "()*&^%$", "$%^&*(", "CC", "DDDD", "JaVa", "AVAV",
            "ONE", "TWO", "AA", "()*&^%$", "$%^&*(", "CC", "DDDD", "JaVa", "AVAV",
            "ONE", "TWO", "AA", "()*&^%$", "$%^&*(", "CC", "DDDD", "JaVa", "AVAV",
            "ONE", "TWO", "AA", "()*&^%$", "$%^&*(", "CC", "DDDD", "JaVa", "AVAV",
            "Twenty century fox", "the hello", "random Str", "hmmmmm", "sdasdsa", "",
            "Twenty century fox", "the hello", "random Str", "hmmmmm", "sdasdsa", "",
            "Twenty century fox", "the hello", "random Str", "hmmmmm", "sdasdsa", "",
            "Twenty century fox", "the hello", "random Str", "hmmmmm", "sdasdsa", "",
            "Twenty century fox", "the hello", "random Str", "hmmmmm", "sdasdsa", "",
            "Twenty century fox", "the hello", "random Str", "hmmmmm", "sdasdsa", "",
            "Twenty century fox", "the hello", "random Str", "hmmmmm", "sdasdsa", "",
            "Twenty century fox", "the hello", "random Str", "hmmmmm", "sdasdsa", "",
            "Twenty century fox", "the hello", "random Str", "hmmmmm", "sdasdsa", "",
            "Twenty century fox", "the hello", "random Str", "hmmmmm", "sdasdsa", "",
            "Twenty century fox", "the hello", "random Str", "hmmmmm", "sdasdsa", "",
            "Twenty century fox", "the hello", "random Str", "hmmmmm", "sdasdsa", "",
            "Twenty century fox", "the hello", "random Str", "hmmmmm", "sdasdsa", "",
            "Twenty century fox", "the hello", "random Str", "hmmmmm", "sdasdsa", "",
            "Twenty century fox", "the hello", "random Str", "hmmmmm", "sdasdsa", "",
            "Twenty century fox", "the hello", "random Str", "hmmmmm", "sdasdsa", "",
            "Twenty century fox", "the hello", "random Str", "hmmmmm", "sdasdsa", "",
            "Twenty century fox", "the hello", "random Str", "hmmmmm", "sdasdsa", "",
            "Twenty century fox", "the hello", "random Str", "hmmmmm", "sdasdsa", "",
            "Twenty century fox", "the hello", "random Str", "hmmmmm", "sdasdsa", "",
            "Twenty century fox", "the hello", "random Str", "hmmmmm", "sdasdsa", "",
            "Twenty century fox", "the hello", "random Str", "hmmmmm", "sdasdsa", "",
            "Twenty century fox", "the hello", "random Str", "hmmmmm", "sdasdsa", "",
            "Twenty century fox", "the hello", "random Str", "hmmmmm", "sdasdsa", "",
            "Twenty century fox", "the hello", "random Str", "hmmmmm", "sdasdsa", "",
            "Twenty century fox", "the hello", "random Str", "hmmmmm", "sdasdsa", "",
            "Twenty century fox", "the hello", "random Str", "hmmmmm", "sdasdsa", "",
            "Twenty century fox", "the hello", "random Str", "hmmmmm", "sdasdsa", "",
            "Twenty century fox", "the hello", "random Str", "hmmmmm", "sdasdsa", "",
            "Twenty century fox", "the hello", "random Str", "hmmmmm", "sdasdsa", "",
            "Twenty century fox", "the hello", "random Str", "hmmmmm", "sdasdsa", ""};

    private static final StringManipulation STRING_MANIPULATION = new StringManipulation();

    public static void main(String[] args) {
        BenchMark benchMark = new BenchMark();
        benchMark.performCleanStringBenchmark();
        benchMark.performPalindromeBenchmark();
        benchMark.performSortStringBenchmark();
    }

    private void performSortStringBenchmark() {
        System.out.println("\n******* Sort string benchmark ********\n");
        long startTime = System.nanoTime();
        STRING_MANIPULATION.sort(SM_SORT_STRING_INPUT);
        long endTime = System.nanoTime();
        System.out.println(" total time: " + (endTime - startTime) + " nano seconds");
    }

    private void performCleanStringBenchmark() {
        System.out.println("******* Clean string benchmark ********\n");
        long startTime = System.nanoTime();
        for (String input : SM_SORT_STRING_INPUT) {
            STRING_MANIPULATION.cleanString(input);
        }
        long endTime = System.nanoTime();
        System.out.println(" total time: " + (endTime - startTime) + " nano seconds");
    }

    private void performPalindromeBenchmark() {
        System.out.println("\n******* Palindrome benchmark ********\n");
        long startTime = System.nanoTime();
        for (String input : SM_SORT_STRING_INPUT) {
            STRING_MANIPULATION.isPalindrome(input);
        }
        long endTime = System.nanoTime();
        System.out.println(" total time: " + (endTime - startTime) + " nano seconds");
    }
}
