package class17;

public class Task3 {
    /*    Create a method that will accept a String as a parameter
and return a new String that consist only of vowels.
Method should be available inside the class only
where it was declared and executed by calling its name.*/

    //return type>String
    //Method name>onlyVowels
    //parameters>String inputStr

    //System.out.println

     private static String getOnlyVowels(String inputStr){
        return inputStr.replaceAll("[AEIOUYaeiovy]","");

        //AEIOUYaeiovy
        //Asghar>Aa
    }
    public static void main(String[] args) {


        System.out.println(Task3.getOnlyVowels("Asghar"));


    }


    }


