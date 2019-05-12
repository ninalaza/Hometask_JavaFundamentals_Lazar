package by.htp.hometask.vetvlnie.zadachi;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] arg) {
        //-Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести на экран
        //цифру 7, в противном случае – цифру 8.

        double x;
        double y;
        x = enterDouble("Enter x:");
        y = enterDouble("Enter y:");

        if (x < y) {
            System.out.println("7");
        } else {
            System.out.println("8");
        }

    }

    public static double enterDouble(String message) {

        double a;

        Scanner sc = new Scanner(System.in);

        System.out.print(message);
        while (!sc.hasNextDouble()) {
            sc.next();

            System.out.print(message);
        }
        a = sc.nextDouble();
        return a;
    }
    }