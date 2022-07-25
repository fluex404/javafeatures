package com.fluex404.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.DoubleToIntFunction;

public class FileMethodExample {
    public static void main(String[] args) throws IOException {
        Path file = Files.createTempFile( "techbeautiful", ".text");
        Path pathFile = Files.writeString(file, "kuda kuda kuda");

        String stringContent = Files.readString(pathFile);
        System.out.println(stringContent);
    }
}
