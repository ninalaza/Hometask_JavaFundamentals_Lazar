package by.htp.hometask.massive.tasks;

import java.util.Random;
import java.util.Scanner;

public class Task6 {
// -Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой оси,
//содержащую все эти числа.

    public static void main(String[] arg) {

        int n = 10;

        int[] mas = new int[n];
        int a;
        a = mas[0];
        int b;
        b = mas[0];

        Random rm = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rm.nextInt(20);
        }

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < a) {
                a = mas[i];
            }
            if (mas[i] > b) {
                b = mas[i];
            }
        }

        System.out.println("min lenght" + (b - a));
    }



}



