package com.challenge.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import static com.challenge.constants.FileConstants.INPUT_FILE_PATH;
import static com.challenge.constants.FileConstants.OUTPUT_FILE_PATH;

public final class FileUtils {

    private FileUtils() {

    }

    public static void writePalindromeResultWithHeader(String fileContent, String fileHeader) throws IOException {
        createFile(OUTPUT_FILE_PATH);
        Files.write(Paths.get(OUTPUT_FILE_PATH), fileHeader.concat(fileContent).getBytes());
    }

    public static Stream<String> getInputLines() throws IOException {
        return Files.lines(Paths.get(INPUT_FILE_PATH));
    }

    private static File createFile(String path) {
        try {
            deleteAlreadyExistingClassFile(path);
            return Files.createFile(Paths.get(path)).toFile();
        } catch (IOException ioe) {
            throw new RuntimeException(ioe);
        }
    }

    private static void deleteAlreadyExistingClassFile(String path) throws IOException {
        Files.deleteIfExists(Paths.get(path));
    }
}