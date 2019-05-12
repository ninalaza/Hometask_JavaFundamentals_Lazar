package by.htp.hometasks.linprod.zadachi;

import java.util.Scanner;

public class Zadacha7 {

    public static void main(String[] arg) {
        // Дан прямоугольник, ширина которого в два раза меньше длины. Найти площадь прямоугольника

        double n;
        int Power = 2;

        n = enterDouble("enter n: "); // - ширина прямоугоьника


        double S;

        S = 2 * Math.pow(n ,Power) ;

        System.out.println("S = " + S);

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
