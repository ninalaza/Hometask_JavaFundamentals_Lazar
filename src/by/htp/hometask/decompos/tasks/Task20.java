package by.htp.hometask.decompos.tasks;

import java.util.Scanner;

public class Task20 {
    //Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр
    //и т.д. Сколько таких действий надо произвести, чтобы получился нуль? Для решения
    //задачи использовать декомпозицию


    public static void main(String[] args) {

        int v = setValue();

        System.out.println("Result is: " + count(v));
    }

    static int setValue() {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        int v;

        System.out.println("Enter positive number");
        do {
            if (flag) {
                System.out.println("Incorrct value, try again");
            }
            v = sc.nextInt();

            System.out.println(v);

            flag = true;
        } while (v <= 0);

        return v;

    }

    static int count(int v) {

        int counter = 0;

        while (v != 0) {
            v -= countSum(v);
            counter++;
        }

        return counter;
    }

    static int countSum(int v) {

        int sum = 0;

        while (v != 0) {
            sum += (v % 10);
            v /= 10;
        }
        return sum;
    }
}
