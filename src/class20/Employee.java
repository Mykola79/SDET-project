package class20;

public class Employee {
    /*2. Create an Employee class that will have variables and methods. Constructor that should initialize instance
     variables
Create 2 subclasses FullTime and PartTime Employees that should have own variables and methods.
Create a Tester Subclass from FullTime Employee and add some features and methods to the Tester Class.
Test your code!*/

    int id;
    int salary;
    String firstName;
    String lastName;

    Employee(int id, String firstName, String lastName) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void getId() {
        System.out.println(id);
    }

    void setFirstName() {
        System.out.println(firstName);
    }

    void getFirstName() {
        System.out.println(firstName);
    }

}

    class FulltimeEmployee extends Employee {
        int id;
        int salary;
        String firstName;
        String lastName;

        FulltimeEmployee(int id, String firstName, String lastName) {
            super(id, firstName, lastName);


            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        void getId() {
            System.out.println("My id is " + id);
        }

        void setFirstName() {
            System.out.println("This is my first name " + firstName);
        }

        void setLastName() {
            System.out.println("This is my last name " + lastName);
        }


    }


        class PartTimeEmployee extends Employee{

            int id;
            int salary;
            String firstName;
            String lastName;

            PartTimeEmployee(int id, String firstName, String lastName) {
                super(id, firstName, lastName);



                this.id = id;
                this.firstName = firstName;
                this.lastName = lastName;}

            void getId() {System.out.println(id);}

            void setFirstName() {System.out.println(firstName);}

            void getFirstName() {System.out.println(firstName);}
}



class EmployeeTester{


            public static void main(String[] args) {

                FulltimeEmployee fl=new FulltimeEmployee(123,"Mike","lopez");

                fl.getId();
                fl.setFirstName();
                fl.setLastName();
                fl.salary=254;
                System.out.println("The salary is "+fl.salary);

            }

        }
/*public class EmployeeTester{
    public static void main(String[] args) {
        Employee emp = new Employee(100, "Eswar", "Mahadev");
        emp.setSalary(20000);
        emp.getSalary();
        System.out.println(emp.toString());
        System.out.println("Salary After Raised by Percent: " + emp.raiseSalary(5));
    }
}


}*/
