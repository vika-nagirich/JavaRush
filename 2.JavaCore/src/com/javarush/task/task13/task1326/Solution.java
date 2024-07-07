package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();

        List<Integer> evenNumbers = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(fileName);
             Scanner fileScanner = new Scanner(fis)) {

            while (fileScanner.hasNextInt()) {
                int number = fileScanner.nextInt();
                if (number % 2 == 0) {
                    evenNumbers.add(number);
                }
            }

        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
            return;
        }

        Collections.sort(evenNumbers);

        // Вывод на экран
        for (int num : evenNumbers) {
            System.out.println(num);
        }

    }
}