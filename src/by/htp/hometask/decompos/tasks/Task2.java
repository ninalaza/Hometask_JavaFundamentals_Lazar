package by.htp.hometask.decompos.tasks;

public class Task2 {
//    Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего
//общего кратного двух натуральных чисел:
//    НОК(А,В) = НОД А(ВА,В)   

    public static void main(String[] arg) {
        int a;
        a = 34;
        int b;
        b = 28;
        int nod;
        int nok;

        if (a > b) {
            nod = nodNum(a, b);

        } else {
            nod = nodNum(b, a);

        }
        System.out.println(nod);

        nok = nokNum(a, b);

        System.out.println(nod);

    }

    public static int nodNum(int a, int b) {

        int k = a % b;
        if (k == 0) {
            return b;

        } else
            return k;
    }

    public static int nokNum(int a, int b) {

        return a / nodNum(a, b) * b;
    }
}