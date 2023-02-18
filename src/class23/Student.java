package class23;

public class Student {
    public void studies(){
        System.out.println("studying ...");
    }
    void doesHomeWork(){
        System.out.println("solving homework ...");
    }
    void practices(){
        System.out.println("practicing the skills ...");
    }
}

class CollegeStudent extends Student{
    @Override
    void practices() {
        System.out.println("College students must practice to get good grades");
    }
}


class SchoolStudent extends Student{
    @Override
    void practices() {
        System.out.println("School students must attend school");
    }
}


class StudentTester{ public static void main(String[] args) {

    Student[] allStudents = {new CollegeStudent(), new SchoolStudent()};

    for (Student students : allStudents) {

        students.studies();
        students.practices();
        students.doesHomeWork();
    }
}
}


