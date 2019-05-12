package by.htp.hometasks.linprod.zadachi;

import java.util.Scanner;

public class Zadacha8 {

    // - Вычислить значение выражения по формуле (все переменные принимают действительные значения): 𝑏 + √𝑏2 + 4𝑎𝑐 2𝑎 − 𝑎3𝑐 + 𝑏−2

    public static void main(String[] arg) {

        double b;
        double a;
        double c;

        int Power2 = - 2;
        int Power3 = 3;

        b = enterDouble("enter b: ");
        a = enterDouble("enter a: ");
        c = enterDouble("enter c: ");

        double n = b*b + (4*a*c);
        double z = Math.sqrt(n);


        double rez;

        rez = ((b + n )/(2* a) ) - Math.pow(a,Power3) + Math.pow(b, Power2) ;

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

