package class29;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {

        ArrayList<String>makeup=new ArrayList<>();

        makeup.add("Lipstica");
        makeup.add("Lipstice");
        makeup.add("Lipstick");
        makeup.add("Lipstice");
        makeup.add("Lipstick");

       for (int i=0;i<makeup.size();i++){
           String make=makeup.get(i);

           if(make.contains("a")||make.contains("e")){
               makeup.set(i,"water");
           }
       }
        System.out.println(makeup);
    }
}
