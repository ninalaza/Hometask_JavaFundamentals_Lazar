package by.htp.hometasks.linprod.zadachi;

import java.util.Scanner;

public class Zadacha22 {public static void main(String[] arg) {

    //   Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами дробную и целую части числа и вывести полученное значение числа.
    //
    int T;

    T = enterInt("enter T: ");

    int h;

    h = (int)(T/3600);

    int m;

    m = (int)((T-(h * 3600))/60);

    int s;

    s = T-(h *3600) -(m * 60);

    System.out.println( h + "ч" + m + "м" + s + "c") ;

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

