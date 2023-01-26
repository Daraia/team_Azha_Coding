package Week5_JavaCodingTask;

public class StringUnique2 {
    public static void main(String[] args) {

    String str = "AAABBBCCCDEF";

    String unique = "";

        for (int j = 0; j < str.length(); j++) {


            char ch = str.charAt(j);
            int frequency = 0;

            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == ch){
                    frequency++;
                }
            }
            if(frequency == 1){
                unique+= ch;

            }
        }
        System.out.println(unique);
    }
}
/*
String -- Find the unique
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */