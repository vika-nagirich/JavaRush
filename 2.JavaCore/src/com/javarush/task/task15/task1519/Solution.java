package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String key;
        while (!(key = bufferedReader.readLine()).equals("exit")) {
            try {
                if (key.contains(".")) {
                    print(Double.parseDouble(key));
                }
                else {
                int key2 = Integer.parseInt(key);
                if (key2 > 0 && key2 < 128) {
                    print((short) key2);
                }
                else print(key2);}
//                if (key2 <= 0 || key2 >= 128) {
//                    print(key2);
//                }
//                 else print(key);

            } catch (Exception e){
                print(key);
            }
        }
        bufferedReader.close();


}

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
