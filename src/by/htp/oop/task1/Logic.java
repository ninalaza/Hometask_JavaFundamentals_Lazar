package by.htp.oop.task1;

import java.util.Scanner;

public class Logic {


    public void print(Bean bean) {
        System.out.println(bean.toString());
    }

    public void changeFirstParam(Bean bean) {
        if (bean.getFirstParam() > 0) {
            bean.setFirstParam(bean.getFirstParam() + bean.getSecondParam());
        } else {
            bean.setFirstParam(bean.getFirstParam() + 1);

        }

    }

    public int summa(Bean bean) {
        int sum = bean.getFirstParam() + bean.getSecondParam();
        return sum;
    }

    public int maxValue(Bean bean) {

        if (bean.getFirstParam() > bean.getSecondParam()) {
            return bean.getFirstParam();
        } else {
            return bean.getSecondParam();
        }
    }

    public Bean scanValues() {
        Bean b = new Bean();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer value: ");
        b.setFirstParam(sc.nextInt());

        System.out.print("Enter second integer value: ");
        b.setSecondParam(sc.nextInt());
        return b;
    }
}
