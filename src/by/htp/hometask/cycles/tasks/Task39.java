package by.htp.hometask.cycles.tasks;

public class Task39 {
    //В трехзначном числе зачеркнули старшую цифру. Когда полученное число умножили
    //на 7, то получили исходное число. Найти это число.

    public static void main(String[] arg) {

        int a;

        for (int i = 100; i < 1000; i++) {
            a = (i - ((int) i / 100 * 100)) * 7;
            if (a == i) {
                System.out.println(a);

            }
        }
    }


}
