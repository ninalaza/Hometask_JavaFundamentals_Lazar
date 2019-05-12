package by.htp.hometasks.linprod.zadachi;

import java.util.Scanner;

public class Zadacha30 {
    // - Три сопротивления R1 R2, и R3 соединены параллельно. Найдите сопротивление
    //соединения.
    public static void main(String[] arg) {
        double r1;
        double r2;
        double r3;

        double r;


        r1 = enterDouble("entrer R1:");
        r2 = enterDouble("enter R2:");
        r3 = enterDouble("enter R3:");

        r = 1 / ((1 / r1) + (1 / r2) + (1 / r3));

        System.out.println("R = " + r);

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
