package by.htp.hometask.vetvlnie.zadachi;

public class Task9 {
    //Найти сумму квадратов первых ста чисел

    public static void main(String[] arg) {

        double a;
        a = 0;
        double sum;
        sum = 0;

        while (a < 100) {
            a++;
            sum = sum + Math.pow(a, 2);
        }
        System.out.print(sum);
    }
}
