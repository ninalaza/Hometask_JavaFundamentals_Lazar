package by.htp.hometasks.linprod.zadachi;

import java.util.Scanner;

public class Zadacha27 {

    // - 27. Дано значение a. Не используя никаких функций и никаких операций, кроме умножения, получить значение а8 за три операции и  а10 за четыре операции.
    public static void main(String[] arg) {

        int n;
        n = enterInt("enter n: ");

        int a;
        a = n * n;

        int b;
        b = a * a;

        int c;
        c = b * b;

        int d;
        d = c * a;

        System.out.println(c);
        System.out.println(d);

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