package com.challenge;

import com.challenge.factory.ApplicationFactory;
import com.challenge.service.StringManipulationService;

/**
 * The entry point into the code challenge application.
 */
public class Application {

    public static void main(String[] args) throws Exception {
        StringManipulationService stringManipulationService = ApplicationFactory.getStringManipulationService();
        stringManipulationService.processPalindromeCSV();
        System.out.println("Please refresh project and check src/attd/ folder for result");
    }
}
