package by.htp.hometask.massive.tasks;

import java.util.Random;
import java.util.Scanner;
public class Task1 {


    public static void main(String[] arg) {
//В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны
//данному К.


        double mas[] = new double[5];

        Random rm = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rm.nextInt(800);
        }
        double k;

        k = enterDouble("Enter K:");
        double sum;
        sum = 0;


        for (int i = 0; i < mas.length; i++) {
                       if (mas[i] % k == 0) {

                sum = sum + mas[i];
            }

        }
        System.out.println(sum);
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