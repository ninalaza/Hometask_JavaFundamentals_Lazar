package by.htp.hometasks.linprod.zadachi;

import java.util.Scanner;

public class Zadacha37 {
    public static void main(String[] arg) {
        // Целое число N является четным двузначным числом

        int a;
        a = enterInt("Enter N:");

        if ((a % 2 == 0) && (a > 9) && (a < 100)) {

            System.out.println("True");
        } else {
            System.out.println("false");
        }


        // - Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его
        //последних цифр.

        double k;
        k = enterDouble("enter number ");

        int firstNumber;
        firstNumber = (int) k / 1000;

        int secondNumber;
        secondNumber = (int) ((k - firstNumber * 1000) / 100);

        int thirdNumber;
        thirdNumber = (int) ((k - firstNumber * 1000 - secondNumber * 100) / 10);

        int forthNumber;
        forthNumber = (int) (k - firstNumber * 1000 - secondNumber * 100 - thirdNumber * 10);

        if (firstNumber + secondNumber == thirdNumber + forthNumber) {
            System.out.println("true");
        } else {
            System.out.println("false");

        }


    }

    public static int enterInt(String message) {

        Scanner sc = new Scanner(System.in);

        int a;

        System.out.print(message);
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.print(message);
        }
        a = sc.nextInt();
        return a;

    }

    public static double enterDouble(String message) {

        Scanner sc = new Scanner(System.in);

        double a;

        System.out.print(message);
        while (!sc.hasNextDouble()) {
            sc.next();
            System.out.print(message);
        }
        a = sc.nextDouble();
        return a;

    }
}