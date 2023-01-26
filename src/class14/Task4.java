package class14;

public class Task4 {
    public static void main(String[] args) {
        // How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever

        /*StringBuilder str=new StringBuilder("This is sentence i want to reverse");
        System.out.println(str.reverse());
        String newStr=str.toString();*/

        String str2="This is sentence i want to reverse";
        String arr[]=str2.split(" ");
        //for (String word: arr) {}*/

        String word="This";
        for(int i=word.length()-1; i>=0; i--){
            System.out.print(word.charAt(i));}

        System.out.println(" ");
    }
}
