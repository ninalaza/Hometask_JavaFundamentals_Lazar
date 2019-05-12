package by.htp.hometask.cycles.tasks;

import java.util.Scanner;

public class Task16 {
    //Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10)
    public static void main(String[] arg) {

        long sum=1;
        long result = 1;


        for(int i=2; i<=10; i++){
            sum+=i;
            result*= sum;
        }
        System.out.println(result);
    }
}



