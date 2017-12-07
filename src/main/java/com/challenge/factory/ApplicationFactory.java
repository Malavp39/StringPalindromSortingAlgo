package com.challenge.factory;

import com.challenge.processing.StringManipulation;
import com.challenge.service.StringManipulationService;

/**
 * Factory class to do dependency injection by providing required beans by having static factory methods.
 */
public final class ApplicationFactory {

    private ApplicationFactory() {

    }

    public static StringManipulationService getStringManipulationService() {
        return new StringManipulationService();
    }

    public static StringManipulation getStringManipulation() {
        return new StringManipulation();
    }
}
