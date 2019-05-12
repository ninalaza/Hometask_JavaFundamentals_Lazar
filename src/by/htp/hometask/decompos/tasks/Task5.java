package by.htp.hometask.decompos.tasks;

import java.util.Scanner;

public class Task5 {
    //Написать метод(методы) для нахождения суммы большего и меньшего из трех чисел

    public static void main(String[] arg) {

        int a;
        a = enterInt("enter a: ");

        int b;
        b = enterInt("enter b: ");

        int c;
        c = enterInt("enter c: ");

        System.out.println(findSum(a,b,c));

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

    public static int findSum(int a, int b, int c) {

        int[] mas = {a, b, c};
        int min = 0;
        int max = 0;
        int sum;

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
            }
            if (mas[i] < min) {
                min = mas[i];

            }
        }
        sum = min + max;
        return sum;

    }

}

