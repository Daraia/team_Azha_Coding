package week2_javaCodingTask;

public class PrintConsecutiveNumbers {

    public static void main(String[] args) {


        int n =50;

        for (int i = 1; i <= 25 ; i++) {
            if(i%2==0){
                System.out.println("Codility");
            }
            if(i % 3 == 0){
                System.out.println("Test");
            }
            if(i % 5 ==0){
                System.out.println("Coders");
            }
            if(i %2 ==0 && i% 3 == 0){
                System.out.println("CodilityTest");
            }
            if(i % 2 == 0 && i % 5 == 0){
                System.out.println("CodilityCoders");
            }
            if(i % 2 ==0 && i % 3 == 0 && i % 5 == 0){
                System.out.println("CodilityTestCoders");
            }
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("TestCoders");
            }
            if(!(i%2 == 0 || i%3 == 0 || i%5 == 0)){
                System.out.println(i);
            }


        }
    }



}
