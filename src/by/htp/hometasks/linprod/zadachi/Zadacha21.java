package by.htp.hometasks.linprod.zadachi;

import java.util.Scanner;

public class Zadacha21 {

    public static void main(String[] arg) {

        //   Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами дробную и целую части числа и вывести полученное значение числа.
        //
        double x;

        x = enterDouble("enter r (nnn.ddd format): ");

        int y;

        y = (int) x;

        x = x * 1000;
        x = x - (y * 1000);

        int z = (int) x;

        String rez;
        rez = z + "." + y;

        System.out.println(rez);

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

