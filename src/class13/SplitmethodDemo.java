package class13;

public class SplitmethodDemo {
    public static void main(String[] args) {
        String str="I like java. I write a lot of code daily. I am from batch 15.";
        String [] strArr=str.split("[.?!]");
        System.out.println(strArr.length);
        System.out.println(strArr[2].trim());

        //working with arrays we use length. With String we use length();*/

        System.out.println("***********************");

        String str1="I like java. I write a lot of code daily. I am from batch 15.";

        String newStr[]=str1.split("[.]");
        System.out.println(newStr.length);
       System.out.println(newStr[4].trim());
    }
}
