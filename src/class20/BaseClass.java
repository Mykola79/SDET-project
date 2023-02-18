package class20;

public class BaseClass {
    String name="John";

    void hello(){
        System.out.println("Hello method from base line");}}




class Child extends BaseClass{

    String name="Jane";

    void callMe(){
        System.out.println(this.name);
        System.out.println(super.name);}

    void hello() {System.out.println("Hello methods from Child class");}

    void callingParentMethod(){
        hello();
        super.hello();
    }
}

    class TestingSuperKeyword{
        public static void main(String[] args) {

            Child child=new Child();

            child.callMe();

            child.callingParentMethod();
        }
    }


