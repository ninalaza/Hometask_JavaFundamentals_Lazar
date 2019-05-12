package by.htp.hometask.massiv_massiv.tasks;

public class Task1 {
    //1. Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке была
    //ровно одна единица, и вывести на экран


    public static void main(String[] arg) {


        int[][] array = new int[][]{
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1},
                {1, 0, 0}};


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
}



