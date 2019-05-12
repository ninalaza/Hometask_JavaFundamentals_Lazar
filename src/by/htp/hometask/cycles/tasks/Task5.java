package by.htp.hometask.cycles.tasks;

public class Task5 {
    //С помощью оператора while напишите программу определения суммы всех нечетных
    //чисел в диапазоне от 1 до 99 включительно.

    public static void main(String[] arg) {

        int a;
        a = 0;
        int sum;
        sum = 0;

        while (a < 99) {

            a = a + 1;
            sum = sum + a;

        }
        System.out.println(sum);
    }
}
