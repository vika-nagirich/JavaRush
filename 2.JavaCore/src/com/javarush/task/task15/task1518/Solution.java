package com.javarush.task.task15.task1518;

/* 
Статики и котики
*/

public class Solution {
    static public class Cat{
       public String name;
    }
    public static Cat cat;
    static {
        Solution.cat = new Cat();
        cat.name = "Бася";
        System.out.println(cat.name);
    }
    public static void main(String[] args) {

    }
}
