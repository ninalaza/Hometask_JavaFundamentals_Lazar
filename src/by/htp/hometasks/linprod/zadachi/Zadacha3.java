package by.htp.hometasks.linprod.zadachi;


import java.util.Scanner;

public class Zadacha3 {

    public static void main(String[] arg) {
        // Найдите  значение функции: z = 2 * x + ( y – 2 ) * 5.

        double x;
        double y;

        double z;

        x = enterDouble("enter x:");
        y = enterDouble("enter y:");
        double temp = y - 2;

        z = 2 * x + temp * 5;

        System.out.println("z =  " + z);
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


