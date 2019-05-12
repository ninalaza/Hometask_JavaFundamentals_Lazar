package by.htp.hometasks.linprod.zadachi;

import java.util.Scanner;

public class Zadacha9 {

    // - Вычислить значение выражения по формуле (все переменные принимают действительные значения): 𝑎 𝑐 ∗ 𝑏 𝑑 − 𝑎𝑏 − 𝑐 𝑐𝑑

    public static void main(String[] arg) {

        double b;
        double a;
        double c;
        double d;


        b = enterDouble("enter b: ");
        a = enterDouble("enter a: ");
        c = enterDouble("enter c: ");
        d = enterDouble("enter d: ");



        double rez;

        rez = ((a * b) - ((a * b) - c))/ (c*d);

        System.out.println("result = " + rez);

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



