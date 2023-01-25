package class13;

public class Task1 {
    public static void main(String[] args) {

        //create a string and if the string id not empty perform the following;
        //if the string has an odd number of characters and has 3 or more
        //characters
        String str="hello";
        if(!str.isEmpty()){if(str.length()%2!=0 && str.length()>3){
            int middle=str.length()/2;
            System.out.println(str.charAt(middle));}
        }
    }
}
