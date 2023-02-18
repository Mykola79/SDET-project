package class20;

public class Teacher {
    /*Write a Java program called Teacher.  Identify features/attributes and 4 behaviours of that Class. Create
     3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have their own features/attributes and
      behaviours. Test all 4 classes*/

    String teacherName;
    String teacherId;

        public void homeWork(){
        System.out.println("Homeworks make students perfect!!!!");}

        protected void grade(){
                System.out.println("grade does not matter");
    }
        void scholarShip(){
        System.out.println("Students will get scholarship");}

        private void extraPoint(){
        System.out.println("All students attend the class will get extra point");
    }
}

    class MathTeacher extends Teacher {
        String subject;
        String grade;

        void excellent() {
            System.out.println("This class is excellent");
        }
    }
    class ChemistryTeacher extends Teacher{
        String homework;
        String grade;

        void science(){
            System.out.println("Chemistry class is fun");}}


class PianoTeacher extends Teacher {
    String classic;
    String schedule;

    void happy() {
        System.out.println("This class makes students happy");}




            public static void main(String[] args) {

                Teacher tc = new Teacher();
                tc.teacherName = "Barbara";
                tc.teacherId = "123";

                System.out.println("This is principal " + tc.teacherName);
                //tc.extraPoint();                                                              this is private


                MathTeacher mt = new MathTeacher();

                mt.teacherName = "Luna";
                mt.teacherId = "M221";
                mt.subject = "Math";

                System.out.println("Teacher " + mt.teacherName + " teach " + mt.subject);

                mt.excellent();                                  //comes from child class
                mt.homeWork();                                  //comes from the parent


            }}














