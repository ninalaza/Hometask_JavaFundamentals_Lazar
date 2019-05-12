package by.htp.hometasks.linprod.zadachi;

import java.util.Scanner;

public class Zadacha12 {
    // -  Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2).

    public static void main(String[] arg) {

        double x1;
        double x2;
        double y1;
        double y2;

        x1 = enterDouble("enter x1: ");
        x2 = enterDouble("enter x2: ");
        y1 = enterDouble("enter y1: ");
        y2 = enterDouble("enter y2: ");

        double tempo1 = Math.pow(x2-x1, 2);
        double tempo2 = Math.pow(y2-y1,2);
        double tempo3 = Math.sqrt(tempo1+tempo2);


        double rez;

        rez = Math.abs(tempo3);

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
