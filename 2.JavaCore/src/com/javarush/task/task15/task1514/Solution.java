package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(2.3, "first");
        labels.put(5.1, "second");
        labels.put(6.5, "third");
        labels.put(8.2, "fourth");
        labels.put(7.4, "fifth");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
