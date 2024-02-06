package com.javarush.task.pro.task15.task1504;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/*
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             var inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
             var outputStream = Files.newOutputStream(Paths.get(scanner.nextLine()))
        ) {
            byte[] inByte = inputStream.readAllBytes();
            byte[] outByte = new byte[inByte.length];
            for (int i = 0; i < inByte.length; i += 2) {
                if (i < inByte.length - 1) {
                    outByte[i] = inByte[i + 1];
                    outByte[i + 1] = inByte[i];
                } else {
                    outByte[i] = inByte[i];
                }
            }
            outputStream.write(outByte);
        } catch (IOException e) {
            System.out.println("Что-то не так пошло" + e);
        }

    }
}

