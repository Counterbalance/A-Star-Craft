package com.codingame.astarcraft;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class TestAI {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        for (int y = 0; y < 10; ++y) {
            scanner.nextLine();
        }

        int mouseCount = scanner.nextInt();
        for (int i = 0; i < mouseCount; ++i) {
            scanner.nextInt();
            scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println(Files.readAllLines(Paths.get(System.getProperty("java.io.tmpdir"), "astarcraft-output")).get(0));
    }
}
