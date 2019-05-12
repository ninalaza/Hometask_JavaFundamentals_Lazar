package by.htp.hometask.massive.tasks;

import java.util.Random;
import java.util.Scanner;

public class Task5 {
    //Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных
    //чисел этой последовательности. Если таких чисел нет, то вывести сообщение об этом факте.
    public static void main(String[] arg) {
        int n;
        n = enterInt("enter n:");


        int[] mas = new int[n];
        Random rm = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rm.nextInt(800);
        }

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 == 0) {
                int[] mas2 = {mas[i]};
                for (int j = 0; j < mas2.length; j++) {
                    System.out.println(mas2[j]);
                }
            } else if(mas[i] % 2 != 0){
                System.out.println("Such numbers are absent");

            }
        }

    }
    public static int enterInt(String message) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print(message);

        while (!sc.hasNextInt()) {
            System.out.print(message);
            sc.next();

        }
        a = sc.nextInt();
        return a;

    }
}
