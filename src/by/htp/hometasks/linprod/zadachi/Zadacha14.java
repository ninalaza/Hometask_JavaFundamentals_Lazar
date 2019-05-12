package by.htp.hometasks.linprod.zadachi;

import java.util.Scanner;

public class Zadacha14 {

    public static void main(String[] arg) {

     //  Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.
    double r;

    r = enterDouble("enter r: ");

    double S;

    S = Math.PI * Math.pow(r,2);

    double P;

    P = 2* Math.PI * r;

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



