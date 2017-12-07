package com.challenge.service;

import com.challenge.factory.ApplicationFactory;
import com.challenge.processing.StringManipulation;
import com.challenge.util.FunctionUtils;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static com.challenge.constants.StringConstants.CSV_FILE_HEADER;
import static com.challenge.util.FileUtils.getInputLines;
import static com.challenge.util.FileUtils.writePalindromeResultWithHeader;
import static java.lang.System.lineSeparator;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class StringManipulationService {

    /**
     * This service method process the palindrome csv and emits the output to a different csv file containing
     * information if a given word is palindrome or not
     */
    public void processPalindromeCSV() throws IOException {
        StringManipulation stringManipulator = ApplicationFactory.getStringManipulation();
        List<String> cleanStrings =
                getInputLines()
                        .map(stringManipulator::cleanString)
                        .collect(toList());
        String[] sortedCleanStrings = stringManipulator.sort(cleanStrings.toArray(new String[cleanStrings.size()]));
        String palindromeResult = Arrays.stream(sortedCleanStrings)
                .map(FunctionUtils.getWordToPalindromeFunction(stringManipulator))
                .collect(joining(lineSeparator()));
        writePalindromeResultWithHeader(palindromeResult, CSV_FILE_HEADER);
    }
}
