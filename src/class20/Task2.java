package class20;

public class Task2 {

    static void method(String str1){
        System.out.println("Method with one string "+str1);}

    static void method(String str1, String str2){
        System.out.println("Method with two strings "+str1+" and "+str2);
    }

    static void method(String str1, String str2, String str3){
        System.out.println("Method with three strings "+str1+" and "+str2+" and "+str3);}



    public static void main(String[] args) {

        method("Java");
        method("Python","java");

        Task2 task2=new Task2();

        task2.method("Google","Chrome","Yandex");
    }
    }

