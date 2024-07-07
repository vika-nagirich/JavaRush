package com.javarush.task.task13.task1319;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));

        while (true) {
            String line = bufferedReader.readLine();
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            if (line.equals("exit")) {
                break;
            }

        }

        bufferedWriter.close();
        bufferedReader.close();

    }

}