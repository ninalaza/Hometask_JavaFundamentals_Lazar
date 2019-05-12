package by.htp.hometask.decompos.tasks;

public class Task10 {

    //Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1
    //до 9.

    public static void main(String[] arg) {

        int res = 0;

        for (int i = 1; i <= 9; i++) {

            if (!isOdd(i)) {
                res += factorial(i);
            }
        }

        System.out.println("Factorial is: " + res);
    }

    static int factorial(int a) {
        if (a == 1) {
            return a;
        }

        int factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }
        return factorial;
    }

    static boolean isOdd(int value) {
        return (value % 2 == 0);
    }

}
