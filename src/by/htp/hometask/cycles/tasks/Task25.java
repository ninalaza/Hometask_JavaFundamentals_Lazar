package by.htp.hometask.cycles.tasks;

import java.util.Scanner;

public class Task25 {
// Требуется определить факториал числа, которое ввел пользователь

    public static  void main (String[] arg) {

        int a;
        a = enterInt("enter a");
        int rez;
        rez = 1;

        for (int i = 1; i <= a; i++) {

               rez = rez * (i);
        }

 System.out.println(rez);
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


