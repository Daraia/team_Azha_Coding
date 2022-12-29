package week1_javaCodingTask;

public class FINRA2 {

    public static void main(String[] args) {

        int n = 0;
        String result = "";

        for (n = 1; n<= 30; n++){
            result = (n % 3 ==0 && n % 5 == 0)? "FINRA" :( n % 5 == 0)? "RA" :(n % 3 == 0)?"FIN":" Invalid";

            System.out.println(result);
        }
    }
}
