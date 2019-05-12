package by.htp.hometask.decompos.tasks;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] arg) {
        //Вычислить площадь правильного шестиугольника со стороной а, используя метод
        //вычисления площади треугольника

       int side;
        side = enterInt("введите сторону шестиугольника: ");
        double s;
        s = 6 * sqTirangle(side);
        System.out.println("Площадь шестиугольника: " + s);
    }

    public static int enterInt(String message) {

        int a;

        Scanner sc = new Scanner(System.in);

        System.out.print(message);
        while (!sc.hasNextInt()) {
            sc.next();

            System.out.print(message);
        }

        a = sc.nextInt();

        return a;
    }

    public static double sqTirangle(double a) {


        double s;

        s = (Math.pow(a,2) * Math.sqrt(3))/4;

        return s;
    }

}