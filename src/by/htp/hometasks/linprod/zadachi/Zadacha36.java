package by.htp.hometasks.linprod.zadachi;

import java.util.Scanner;

public class Zadacha36 {

    //Найти частное произведений четных и нечетных цифр четырехзначного числа
    public static void main(String[] arg) {
        int a;
        a = enterInt("entrer a:");

        int b;
        b = (int)(a/1000);

        int c;
        c = (int)((a-b*1000)/100);

        int d;
        d = (int)((a-b* 1000 - c * 100)/10);

        int e;
        e = (int)(a - b* 1000- c*100 - d * 10);


        int rez;
        rez = (c*e)/(b*d);

        System.out.println("Result = " + rez);

    }

    public static int enterInt(String message) {

        Scanner sc = new Scanner(System.in);

        int a;

        System.out.print(message);
        while (!sc.hasNextInt()) {
                sc.next();
            System.out.print(message);
        }
        a = sc.nextInt();
        return a;

    }
}
