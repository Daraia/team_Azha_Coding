package week1_javaCodingTask;

import java.util.Scanner;

public class FINRA {

    public static void main(String[] args) {

        int n = 0;

        for ( n = 1; n <=30; n++){
            if (n % 3 == 0 && n % 5 == 0){
                System.out.print("FINRA");

            }else if(n % 3 == 0){
                System.out.println("FR");

            }else if(n % 5 == 0){
                System.out.println("RA");
            }else{
                System.out.println(n);
            }

        }



        }
    }


