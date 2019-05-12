package by.htp.hometasks.linprod.zadachi;

import java.util.Scanner;

public class Zadacha10 { // - Вычислить значение выражения по формуле (все переменные принимают действительные значения): 𝑠𝑖𝑛𝑥 + 𝑐𝑜𝑠𝑦 𝑐𝑜𝑠𝑥 − 𝑠𝑖𝑛𝑦 ∗ 𝑡𝑔 𝑥𝑦

    public static void main(String[] arg) {

        double x;
        double y;

        x = enterDouble("enter x: ");
       y = enterDouble("enter y: ");


       double tempo1 = Math.sin(x) + Math.cos(y);
       double tempo2 = Math.cos(x) - Math.sin(y);


        double rez;

        rez = tempo1/tempo2 * Math.tan(x*y);

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


