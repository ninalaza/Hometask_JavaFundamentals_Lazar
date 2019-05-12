package by.htp.hometask.massive.tasks;

import java.util.Random;
import java.util.Scanner;

public class Task7 {
    // - Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены,
    //большие данного Z, этим числом. Подсчитать количество замен.


    public static void main(String[] arg) {

        int n;
        n = enterInt("Enter n: ");

        int z;
        z = enterInt("Enter z:");

        int sum = 0;
        int[] mas = new int[n];

        Random rm = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rm.nextInt(800);
        }


        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > z) {
                mas[i] = z;
            }
            if (mas[i] == z) {
                sum = sum + 1;
            }
        }
        System.out.println("number" + sum);
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

