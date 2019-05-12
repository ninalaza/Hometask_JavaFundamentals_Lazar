package by.htp.hometask.cycles.tasks;

import java.util.Scanner;

public class Task9 {
    //Найти сумму квадратов первых ста чисел.
    public static void main(String arg[]) {

        int a;

        a = enterInt("enter number: ");
        int b = a + 100;
        int sum = 0;

        for (int i = a; i <= b; i++) {
            sum = sum + (i * i);

        }
        System.out.println(sum);
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
}

