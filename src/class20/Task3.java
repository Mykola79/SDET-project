package class20;

public class Task3 {
    private void method(String str1){
        System.out.println("Method with one string");

    }private void method(String str1, String str2){
        System.out.println("Method with two strings");

    }private void method(String str1,String str2,String str3){
        System.out.println("Method with three strings ");}

    public static void main(String[] args) {

        Task3 task3=new Task3();


        task3.method("java");
        task3.method("Python","java");

    }
}
