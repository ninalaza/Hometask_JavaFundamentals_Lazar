package by.htp.hometask.vetvlnie.zadachi;

import java.util.Scanner;

public class Task34 {
    //Составить программу, реализующую эпизод применения компьютера в книжном
    //магазине. Компьютер запрашивает стоимость книг, сумму денег, внесенную покупателем;
    //если сдачи не требуется, печатает на экране «спасибо»; если денег внесено больше, чем
    //необходимо, то печатает «возьмите сдачу» и указывает сумму сдачи; если денег
    //недостаточно, то печатает сообщение об этом и указывает размер недостающей суммы.
    public static void main(String arg[]) {
        double price;
        double cash;

        price = enterDouble("Enter price for book");
        cash = enterDouble("Enter amount of money from buyer");

        if (price == cash) {
            System.out.println("Thanks");
        } else if (price < cash) {
            System.out.println("Please, take your money" + (cash - price));
        } else {
            System.out.println("Please, add money" + (price - cash));
        }
    }

    public static double enterDouble(String message) {

        double a;

        Scanner sc = new Scanner(System.in);

        System.out.print(message);

        while (!sc.hasNextDouble()) {
            sc.next();

            System.out.print(message);
        }
        a = sc.nextDouble();
        return a;

    }
}
