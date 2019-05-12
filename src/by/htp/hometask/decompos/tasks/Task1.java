package by.htp.hometask.decompos.tasks;

public class Task1 {

    public static void main(String[] arg) {
        double x1, x2;
        x1 = 2;
        x2 = -3;
        double y1, y2;
        y1 = 1;
        y2 = 1;
        double z1, z2;
        z1 = -6;
        z2 = 5;
        double p;
        double s;
        double a;
        double b;
        double c;

        a = tirangleSide(x1, x2, y1, y2);
        b = tirangleSide(y1, y2, z1, z2);
        c = tirangleSide(x1, x2, z1, z2);

        p = (a + b + c) / 2;

        s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static double tirangleSide(double x1, double x2, double y1, double y2) {

        double side;
        double temp;
        temp = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        side = Math.abs(temp);
        return side;
    }


}