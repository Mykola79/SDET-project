package class16;

public class SyntaxEmployee {

    String name;
    String empID;
    double salary;
    static String CEO="Sumair";// static. is immutable

    public static void main(String[] args) {
        SyntaxEmployee emp1=new SyntaxEmployee();

        emp1.empID="#124";
        emp1.salary=10000;

        SyntaxEmployee emp2=new SyntaxEmployee();
        emp2.empID="324";
        emp2.salary=2324.323;

        System.out.println(emp1.empID);
        System.out.println(emp1.salary);
        System.out.println(emp1.CEO);

    }
}
