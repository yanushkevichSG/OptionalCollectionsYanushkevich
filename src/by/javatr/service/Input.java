package by.javatr.service;

import java.util.Scanner;

public class Input {
    private static Scanner sc;

    public static double getDoubleFromIn() {
        sc = new Scanner(System.in);
        double a = 0.0;
        while(!sc.hasNextDouble())
        {
            sc.next();
        }
        a = sc.nextDouble();

        return a;
    }

    public static int getIntFromIn() {
        sc = new Scanner(System.in);
        int a = 0;
        while(!sc.hasNextInt())
        {
            sc.next();
        }
        a = sc.nextInt();

        return a;
    }

    public static String getStringFromIn() {
        sc = new Scanner(System.in);
        String a = null;
        while(!sc.hasNextLine()) {
            sc.next();
        }

        a = sc.nextLine();

        return a;

    }
}
