package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inpStream = new FileInputStream(bufferedReader.readLine());
        Scanner scanner = new Scanner(inpStream);
        while (scanner.hasNext()){
            Object i = scanner.nextLine();
            System.out.println(i);
        }
        bufferedReader.close();
        inpStream.close();
    }


}