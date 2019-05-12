package by.htp.hometask.vetvlnie.zadachi;

import java.util.Scanner;

public class Task12 {
    //Даны три действительных числа. Возвести в квадрат те из них, значения которых
    //неотрицательны, и в четвертую степень — отр

    public static void main(String arg[]) {
        double a;
        double b;
        double c;


        a = enterDouble("enter 1st number");
        b = enterDouble("enter 2d number");
        c = enterDouble("enter 3d number");


        if (a < 0) {
            a = Math.pow(a, 4);

            System.out.println(a);
        } else {
            a = Math.pow(a, 2);
            System.out.println(a);
        }

        if (b < 0) {
            b = Math.pow(b, 4);

            System.out.println(b);
        } else {
            b = Math.pow(b, 2);
            System.out.println(b);
        }

        if (c < 0) {
            c = Math.pow(c, 4);

            System.out.println(c);
        } else {
            c = Math.pow(c, 2);
            System.out.println(c);
        }


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
