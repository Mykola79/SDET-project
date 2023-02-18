package class16;

public class Task3 {
    //3) Create a method that will print whether given String is palindrome or not.

    //return type =>void
    //name ispalindrome
    //parameters=>String inputStr


    public static void main(String[] args) {

        String str="dad";

        StringBuilder st=new StringBuilder(str);

        st.reverse();

        String reversedStr=st.toString();

        if(str.equals(reversedStr)){
            System.out.println(str+" is palindrome");
        }else{
            System.out.println(str+"Not is palindrome");}
        }
    }


    //public static void main(String[] args) {
        //Task3 task3=new Task3();
        // String result=  task3.isPalindrome("Kaya"); can't assign void methods to variables
        //  System.out.println(task3.isPalindrome("Kaya")); can't use void methods in PrintLn
        //task3.isPalindrome("kaya");





