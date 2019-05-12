package by.htp.hometask.cycles.tasks;

public class Task15 {
    //Вычислить : 1+2+4+8+...+ 2 в 10 степени

    public static void main(String[] arg) {

        double a;
        a = Math.pow(2, 10);
        int sum;
        sum = 0;

        for (int i = 1; i <= a; i++) {
            sum += i;

        }
        System.out.println(sum);

    }
}
