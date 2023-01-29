package class16;

public class Students {

     String name; //name mutable/changes each student
    String ID;
   static int numberOfStudents; //static stays the same


    public static void main(String[] args) {

        Students nezir=new Students();

        nezir.name="Nezir";
        nezir.ID="1";
        nezir.numberOfStudents++;

        Students ardasher=new Students();

        ardasher.name="Ardasher";
        ardasher.ID="2";
        ardasher.numberOfStudents++;

        System.out.println(Students.numberOfStudents);
    }
}
