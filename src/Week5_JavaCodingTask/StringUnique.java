package Week5_JavaCodingTask;

public class StringUnique {

    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i); //each character of the String str

            if(str.indexOf(each) == str.lastIndexOf(each)){

            unique+= each;
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