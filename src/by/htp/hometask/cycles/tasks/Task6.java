package by.htp.hometask.cycles.tasks;

import java.util.Scanner;

public class Task6 {

    //Напишите программу, где пользователь вводит любое целое положительное число. А
    //программа суммирует все числа от 1 до введенного пользователем числа.

    public static void main(String[] arg) {

        int a;
        int sum = 0;
        a = enterInt();
        for (int i = 1; i <= a; i++) {
            sum = sum + i;
        }

        System.out.println(sum);

    }

    public static  int enterInt(){
        int a;
        boolean flag = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter positive number");
        do {
            if(flag){
                System.out.println("Incorrct value, try again");
            }
            a = sc.nextInt();
            flag = true;
        } while (!sc.hasNextInt() || a < 0);
        return a;
    }


}