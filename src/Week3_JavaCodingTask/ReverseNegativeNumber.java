package Week3_JavaCodingTask;

public class ReverseNegativeNumber {

    public static void main(String[] args) {

    int number = -12345;
    int reverse = 0;
    int num = -1*number;

    while (num!=0){

        int digit = num%10;
        reverse = reverse*10+digit;
        num = num/10;
    }
    reverse = -1*reverse;
        System.out.println(reverse);

    }

}
