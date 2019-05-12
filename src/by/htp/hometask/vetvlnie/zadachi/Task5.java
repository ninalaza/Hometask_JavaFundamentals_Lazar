package by.htp.hometask.vetvlnie.zadachi;

import java.util.Scanner;

public class Task5 {
    //Составить программу: определения наименьшего из двух чисел а и b

    public static void main(String[] arg) {

        double a;
        double b;

        a = enterDouble("enter a: ");
        b = enterDouble("enter b: ");

        if (a < b) {

            System.out.println(a);
        } else {
            System.out.print(b);

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



