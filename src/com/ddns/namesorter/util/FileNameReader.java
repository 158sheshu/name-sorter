package com.ddns.namesorter.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileNameReader {
    public List<String> readNames(String filePath) throws IOException {
        return Files.readAllLines(Path.of(filePath));
    }
}