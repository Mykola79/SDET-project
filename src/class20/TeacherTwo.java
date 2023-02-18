package class20;

public class TeacherTwo {
    /*Write a Java program called Teacher.  Identify features/attributes and 4 behaviour of that Class.
     Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own features
      and behaviour. Test all 4 classes
     */
    String name;
    String id;
    int experienceOfWork;
    String schoolName;

    TeacherTwo(String name, String id, int experienceOfWork, String schoolName) {
        this.name = name;
        this.id = id;
        this.experienceOfWork = experienceOfWork;
        this.schoolName = schoolName;
    }

    void teacherName() {
        System.out.println("The teacher's name is " + name);
    }

    void teacherId() {
        System.out.println("id is " + id);
    }

    void teacherExperience() {
        System.out.println("Experience of work " + experienceOfWork);
    }

    void teacherSchoolName() {
        System.out.println("The name of the school is " + schoolName);
    }
}
   class MathTeacher2 extends TeacherTwo {

       String name;
       String id;
       int experienceOfWork;
       String schoolName;



       MathTeacher2(String name, String id, int experienceOfWork, String schoolName) {

           super(name, id, experienceOfWork, schoolName);
           this.name = name;
           this.id = id;
           this.experienceOfWork = experienceOfWork;
       }

       void mathTeacherName() {
           System.out.println("MathTeacher's name is " + name);
       }
   }


       class ChemistryTeacher2 extends TeacherTwo {
           String name;
           String id;
           int experienceOfWork;
           String schoolName;

           ChemistryTeacher2(String name, String id, int experienceOfWork, String schoolName) {

               super(name, id, experienceOfWork, schoolName);
               this.name = name;
               this.id = id;
               this.experienceOfWork = experienceOfWork;
           }

           void chemistryWorkExperience() {
               System.out.println("The experience is " + experienceOfWork);
           }
       }


       class PianoTeacher2 extends TeacherTwo {
               String name;
               String id;
               int experienceOfWork;
               String schoolName;

               PianoTeacher2(String name, String id, int experienceOfWork, String schoolName) {

                   super(name, id, experienceOfWork, schoolName);
                   this.name = name;
                   this.id = id;
                   this.schoolName = schoolName;
               }

               void pianoTeacherId() {
                   System.out.println("The id is " + id);}


           public static void main(String[] args) {

        ChemistryTeacher2 chemTeach=new ChemistryTeacher2("Peter","#123",5,"Bor");


        chemTeach.chemistryWorkExperience();

        System.out.println("His name is "+chemTeach.name);



        MathTeacher2 math2=new MathTeacher2("Rose", "#234", 7,"Bor");

               math2.mathTeacherName();


               System.out.println("Rose's id is "+(math2.id));
           }

           }











