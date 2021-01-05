package com.javastart.comparableandcomparator.estates;

public class FileImportException extends RuntimeException {

    public FileImportException(String fileName) {
        super(String.format("Import of file: '%s' failed!", fileName));
    }
}
