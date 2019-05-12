package by.htp.hometask.massive.tasks;

import java.util.Random;
import java.util.Scanner;

public class Task10 {
    //Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

    public static void main(String[] arg) {

        int n;

        n = enterInt("enter n: ");

        int[] mas = new int[n];

        Random rm = new Random();
        for (int i = 0; i < mas.length; i++) {

            mas[i] = rm.nextInt(800);
        }

        for (int i = 0; i < mas.length; i++) {

            if (mas[i] > i) {
                System.out.println(mas[i]);
            }
        }
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
}
