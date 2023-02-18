package class17;

public class ConstraktorStudentPlusTester {

    String id;
    String name;
    int age;
    double weight;



    ConstraktorStudentPlusTester(String sId, String sName, int sAge, double sWeight) {
        id = sId;
        name = sName;
        age = sAge;
        weight = sWeight;}


        void printInfo () {
            System.out.println(id + " " + name + " " + age + " " + weight);
        }





    public static void main(String[] args) {

        ConstraktorStudentPlusTester student1 = new ConstraktorStudentPlusTester("123", "Zafar", 29, 56);

        student1.printInfo();


        ConstraktorStudentPlusTester student2=new ConstraktorStudentPlusTester("456","Saud",45,55);

        student2.printInfo();

    }

}