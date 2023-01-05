package week2_javaCodingTask;

public class swapNumbers {

    public static void main(String[] args) {

        int num = 100;
        int divisibleBy3 = 0;
        int divisibleBy5 = 0;
        int divisibleBy15 = 0;


        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0 && i % 5 == 0 && i % 3 == 0) {

                System.out.print(i + ", ");
            }

        }
        System.out.println("\n");

            for (int j = 0; j <=100 ; j++) {
                if (j % 5 == 0 && j % 15 != 0) {
                        System.out.print(j + ", ");
                }

            }
        System.out.println("\n");

        for (int k = 0; k <= 100; k++) {
            if(k % 3 == 0 && k % 15 !=0){
                System.out.print(k+ ", ");
            }

        }

        }
    }




