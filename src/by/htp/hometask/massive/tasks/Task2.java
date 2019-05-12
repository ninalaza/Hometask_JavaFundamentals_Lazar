package by.htp.hometask.massive.tasks;

import java.util.Random;

public class Task2 {
    //  -В целочисленной последовательности есть нулевые элементы. Создать массив из номеров
    //этих элементов.
    public static void main(String[] arg) {
        int[] mas1 = new int[50];


        Random rm = new Random();
        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = rm.nextInt(800);
        }
        for (int i = 0; i < mas1.length; i++) {
            if (mas1[i] == 0) {
                int[] mas2 = {i};

            }

        }

         System.out.print (mas1);

    }
}