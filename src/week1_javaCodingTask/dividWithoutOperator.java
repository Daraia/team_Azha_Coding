package week1_javaCodingTask;

import java.util.Scanner;


public class dividWithoutOperator {

    public static void main(String[] args) {

    int a, b, c, result =0;


        Scanner input = new Scanner(System.in);

        System.out.println("Enter value of frist number a: ");

         a = input.nextInt();

        System.out.println("Enter value of second number B: ");

         b = input.nextInt();

         c = a+b;


            while (c > b){
                 c=(c-b);
                 result++;
            }
        System.out.println(" result is "+ result);
           }
}

/*
write a method that can divide 2 numbers without division operator.
 */