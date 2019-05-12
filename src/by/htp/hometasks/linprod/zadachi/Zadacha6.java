package by.htp.hometasks.linprod.zadachi;

import java.util.Scanner;

public class Zadacha6 {

    public static void main(String[] arg) {
        // Написать код для решения задачи. В n малых бидонах 80 л молока. Сколько литров молока в m больших бидонах, если в каждом большом бидоне на 12 л. больше, чем в малом


        int n;
        int m;

        n = enterInt("enter n: ");
        m = enterInt("enter m: ");


        double z;

        z = m * (12 + 80 / n);

        System.out.println("z = " + z);

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