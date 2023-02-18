package class16;

public class Task4 {
    /*4)Create a method that will say Hello in different language based on the country that will pass when method
     is executed
     return type=>String void
     name= sayHello
     parameter = String countryName
     */
    String sayHello(String countryName){

        switch(countryName){
            case "USA":
                return "Hello"; //break is not needed when return is used

            case "Kazakhstan":
                return "Salem";

            case "Italy":
                return "Chio";

            case "China":
                return "Ni hao";

            default:
                return "Country not supported";
        }
    }
    public static void main(String[] args) {

        Task4 task4=new Task4();
        System.out.println(task4.sayHello("Italy"));

    }
}
