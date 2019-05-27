package by.htp.oop.task1;

public class Main {
    public static void main(String[] arg) {
        Bean bean;
        Logic logic = new Logic();

        bean = logic.scanValues();
        logic.print(bean);
        System.out.println(logic.maxValue(bean));

    }
}
