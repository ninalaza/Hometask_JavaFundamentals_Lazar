package by.htp.hometasks.linprod.zadachi;

import java.util.Scanner;

public class Zadacha16 {
    public static void main(String[] arg) {

        //  Найти произведение цифр заданного четырехзначного числа

        int d;
        d = enterInt("enter d: ");

        int n;
        n = (d / 1000);

        int m;
        m = (d - (n * 1000)) / 100;

        int k;
        k = (d - (n * 1000) - (m * 100)) / 10;

        int p;
        p = d - (n * 1000) - (m * 100) - (k * 10);

        int rez;
        rez = n * m * k * p;

        System.out.println("result = " + rez);

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


