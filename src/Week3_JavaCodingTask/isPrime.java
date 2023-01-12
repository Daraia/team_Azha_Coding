package Week3_JavaCodingTask;

public class isPrime {

    public static void main(String[] args) {


        int num = 31;
        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
      if(isPrime){
          System.out.println(num + " is a Prime number");
      }else {
          System.out.println(num + " is not a prime number");
      }


    }
}








