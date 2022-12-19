package com.skypro.homework8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static void task1() {
        System.out.println("Task 1");
        int[] first = {1, 2, 3};
        double[] second = {1.57, 7.654, 9.986};
        byte[] third = new byte[4];
        third[0] = 6;
        third[1] = 5;
        third[2] = 4;
        third[3] = 3;
        System.out.println("Create 3 massive");
    }

    private static void task2() {
        System.out.println("\nTask 2");
        int[] first = {1, 2, 3};
        double[] second = {1.57, 7.654, 9.986};
        byte[] third = new byte[4];
        third[0] = 6;
        third[1] = 5;
        third[2] = 4;
        third[3] = 3;
        System.out.println("first massive");
        System.out.println(Arrays.toString(first));
        for (int i = 0; i < first.length; i++) {
            System.out.print(first[i]);
            if (i < first.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("\nsecond massive");
        System.out.println(Arrays.toString(second));
        for (int i = 0; i < second.length; i++) {
            System.out.print(second[i]);
            if (i < first.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("\nthird massive");
        System.out.println(Arrays.toString(third));
        for (int i = 0; i < third.length; i++) {
            System.out.print(third[i]);
            if (i < first.length - 1) {
                System.out.print(", ");
            }
        }
    }

    private static void task3() {
        System.out.println("\n\nTask 3");
        int[] first = {1, 2, 3};
        double[] second = {1.57, 7.654, 9.986};
        byte[] third = new byte[4];
        third[0] = 6;
        third[1] = 5;
        third[2] = 4;
        third[3] = 3;
        System.out.println("first massive");
        for (int i = first.length - 1; i >= 0; i--) {
            System.out.print(first[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println("\nsecond massive");
        for (int i = second.length - 1; i >= 0; i--) {
            System.out.print(second[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println("\nthird massive");
        for (int i = third.length - 1; i >= 0; i--) {
            System.out.print(third[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
    }

    private static void task4() {
        System.out.println("\n\nTask 4");
        int[] first = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < first.length; i++) {
            if (first[i] % 2 != 0) {
                first[i] += 1;
            }
        }
        for (int i = 0; i < first.length; i++) {
            System.out.print(first[i]);
            if (i < first.length - 1) {
                System.out.print(", ");
            }

        }
    }

}
