package by.htp.hometask.massive.tasks;

public class Task3 {
//    Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число встречается
//раньше - положительное или отрицательное

    public static void main(String[] arg) {

        int[] mas = {-1, 2, 2, 7, -2};

        for (int i = 0; i < mas.length; i++) {

            if (mas[0] > 0) {
                System.out.println("Positive");
             break;
            } else {
                System.out.println("Negative");
                break;
            }
        }
    }

}
