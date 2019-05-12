package by.htp.hometasks.linprod.zadachi;

import java.util.Scanner;

public class Zadacha4 {

    public static void main(String[] arg) {
        //z = ( (a – 3 ) * b / 2) + c.


        double a ;
        double b ;
        double c ;

        double z;

        a = enterDouble("enter a: ");

       b = enterDouble("enter b: ");
        c = enterDouble("enter c: ");

        double temp = a - 3;


        z = (temp * b / 2) + c;

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
