package week1_javaCodingTask;

public class dividingWithoutOperator2 {

    public static void main(String[] args) {

        int a = 20;
        int b = 5;

        /*
        c = a+b;
        c= 20+5;
        c=25;

        c = c-b;
        c = 25-5;
             c= 20;
        c=20-5;
            c=15;
        c = 15 -5;
            c = 10;
        c = 10-5;
            c = 5
        c = 5-5
            c = 0
        c = 0-5
            result false;
         */

        int result = 0;

        int c = a+b;

            while (c > b){
                c = c-b;
                result++;
            }
        System.out.println("The result is: "+result);
    }
}
/*
Write a method that can divide two numbers without using division operator
 */