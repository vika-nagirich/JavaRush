package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("fsdfs", 12.3);
        grades.put("fsd", 10.3);
        grades.put("fdfsdsf", 11.3);
        grades.put("ffsd", 9.6);
        grades.put("fdfd", 7.3);

    }
}
