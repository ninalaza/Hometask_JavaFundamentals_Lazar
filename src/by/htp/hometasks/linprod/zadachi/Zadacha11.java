package by.htp.hometasks.linprod.zadachi;

import java.util.Scanner;

public class Zadacha11 {public static void main(String[] arg) {

    double a;
    double b;


    a = enterDouble("enter a: ");
    b = enterDouble("enter b: ");


    double S;

    S = a * b / 2;

    double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));


    double P;

    P = a + b + c ;

    System.out.println("S = " + S);
    System.out.println("P = " + P);

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

