package by.htp.hometask.massive.tasks;

import java.util.Random;
import java.util.Scanner;

public class Task9 {
    //Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший
    //элементы


    public static void main(String[] arg) {

        int n;
        n = enterInt("Enter n: ");

        int[] mas = new int[n];

        Random rm = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rm.nextInt(800);
        }

        int max;
        max = 0;
        int min;
        min = 0;


        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > mas[max]) {
                mas[max] = mas[i];
                max = i;
                ;
            }
            if (mas[i] < mas[min]) {
                mas[min] = mas[i];
                min = i;
            }
        }

        int temp;
        temp = mas[max];
        mas[max] = mas[min];
        mas[min] = temp;

        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
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


