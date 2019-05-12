package by.htp.hometask.massiv_massiv.tasks;

import java.util.Random;

public class Task2 {
    //Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из [0,
    //9]

    public static void main(String[] arg) {

        int[][] array = new int[2][3];

        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rnd.nextInt(9);
            }
        }
        for (int i = 0; i < array.length; i++, System.out.println()) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
    }
}
