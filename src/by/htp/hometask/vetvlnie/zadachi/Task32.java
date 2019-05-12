package by.htp.hometask.vetvlnie.zadachi;

import java.util.Scanner;

public class Task32 {
    // Написать программу, которая по заданным трем числам определяет, является ли сумма
    //каких-либо двух из них положительной.

    public static void main(String[] arg) {
        int n;
        int m;
        int k;


        n = enterInt("enter n: ");
        m = enterInt("enter m: ");
        k = enterInt("enter k:");

        if ((n + m) > 0 || (m + k) > 0 || (n + k) > 0) {
            System.out.println("Sum is positive");

        }

    }

    public static int enterInt(String message) {

        int a;

        Scanner sc = new Scanner(System.in);

        System.out.print(message);
        while (!sc.hasNextInt()) {
            sc.next();

            System.out.print(message);
        }

        a = sc.nextInt();

        return a;
    }
}
