package class20;

public class UserClass {
    /*Write program: userClass  that has a constructor that initializes instance
    variable name and mobile number. Create a subclass  userInfo that will have
    user address variable and it also being initialized through constructor call.
    Print users name, mobile number and address in userDetails method.
    Test your code.*/
    String name;
    String mobileNumber;

    UserClass(String name, String mobileNumber){

    this.name=name;
    this.mobileNumber=mobileNumber;}}




    class UserInfo extends UserClass{

    String userAddress;

    UserInfo(String name, String mobileNumber, String userAddress){

        super(name, mobileNumber);
        this.userAddress=userAddress;}

        void userDetailes(){System.out.println("The name is "+name);
            System.out.println("The mobile number is "+mobileNumber);
            System.out.println("The address is "+userAddress);
    }

}
    class Verizon{Verizon(){super();}
        public static void main(String[] args) {



            UserInfo usi = new UserInfo("Mico","646-456-3567", "Brooklyn");
                    usi.userDetailes();
        }
    }
