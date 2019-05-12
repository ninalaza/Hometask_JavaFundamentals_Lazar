package by.htp.hometask.massive.tasks;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    //Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она
    //возрастающей.

    public static void main(String[] arg) {

        int n;
        n = enterInt("enter n: ");
        int[] mas = new int[n];

        Random rm = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rm.nextInt(800);
        }
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < mas[i + 1]) {

                System.out.println("Последовательность возрастающая");


            }
        }
    }

    public static int enterInt(String message) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println(message);

        }
        a = sc.nextInt();
        return a;

    }

}


