package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int first = Integer.parseInt(reader.readLine());
        int second = Integer.parseInt(reader.readLine());

        System.out.println(maxDEL(first, second));
    }
    public static Integer maxDEL(Integer first, Integer second){
        Integer minNum, maxNum;
        Integer ost;
        Integer del = 1;

        if (first < second){ minNum = first; maxNum = second;}
        else {minNum = second; maxNum = first;}
        while (true){
            ost = maxNum % minNum;
            if (ost == 0){
                del = minNum;
                break;
            }
            maxNum = minNum;
            minNum = ost;
        }
        return del;

    }
}
