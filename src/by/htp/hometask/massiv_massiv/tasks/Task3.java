package by.htp.hometask.massiv_massiv.tasks;

import java.util.Random;

public class Task3 {
    //Дана матрица. Вывести на экран первый и последний столбцы

    public static void main(String[] arg) {

        int[][] array = new int[5][5];

        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rnd.nextInt(10);
            }
        }
        for (int i = 0; i < array.length; i++, System.out.println()) {

            System.out.print(array[i][1] + " ");
            System.out.print(array[i][4] + " ");
        }
    }
}


