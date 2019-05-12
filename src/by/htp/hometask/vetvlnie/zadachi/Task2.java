package by.htp.hometask.vetvlnie.zadachi;

import java.util.Scanner;

public class Task2 {

    public static void main(String arg[]) {
        // Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести на экран
        //слово «yes», в противном случае – слово «no»

        double a;
        double b;

        a = enterDouble("Enter 1st number:");
        b = enterDouble("Enter 2d number");

        if (a < b) {
            System.out.println("yes");
        } else {
            System.out.println("no");
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
