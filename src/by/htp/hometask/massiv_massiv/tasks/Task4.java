package by.htp.hometask.massiv_massiv.tasks;

import java.util.Random;

public class Task4 {

//Дана матрица. Вывести на экран первую и последнюю строки.


    public static void main(String[] arg) {

        int[][] array = new int[5][5];

        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rnd.nextInt(9);
            }
        }

        for (int j = 0; j < array[1].length; j++) {
            System.out.print(array[1][j] + " ");
        }
        System.out.println(" ");

        for (int j = 0; j < array[4].length; j++) {
            System.out.print(array[4][j] + " ");
        }
    }
}



