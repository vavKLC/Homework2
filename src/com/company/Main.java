package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      // String humburger = stats(11, 15);
      //  System.out.println(humburger);
        System.out.println(stats(11,20));
        System.out.println(stats(32,-10));
        System.out.println(stats(29,-5));
        System.out.println(stats(47,23));
        System.out.println(stats(9,7));
    }

    public static String stats(int humanAge, int temperature) {
        if (humanAge >= 20 && humanAge <= 45 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять";
        } else if (humanAge < 20 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять 2";
        } else if (humanAge > 45 && temperature >= -10 && temperature <= 25) {
            return "Можно идти гулять 3";
        } else {
            return "оставайтесь дома";
        }
    }

}


