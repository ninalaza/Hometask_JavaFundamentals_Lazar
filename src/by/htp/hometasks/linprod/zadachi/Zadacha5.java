package by.htp.hometasks.linprod.zadachi;

import java.util.Scanner;

public class Zadacha5 {

    public static void main(String[] arg) {

        double a ;
        double b ;

        a = enterDouble("enter a: ");

        b = enterDouble("enter b: ");

        double temp = a + b;

        double z;

        z = temp / 2;

        System.out.println("z = " + z);

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


