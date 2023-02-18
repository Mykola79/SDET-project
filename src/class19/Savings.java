package class19;

class Savings extends BankAccount {

    double profit;

    void takeProfit(){
        System.out.println("Profit method from Savings class");}



    public static void main(String[] args) {

        BankAccount ba=new BankAccount();

        ba.accountNumber=4635876437856l;
        ba.money=1000;

        System.out.println(ba.accountNumber);
        System.out.println(ba.money);



        Checking check=new Checking();

        check.accountNumber=5765;
        check.money=780;
        check.interest=0;

        check.deposit();
        check.transfer();


        Savings save=new Savings();

        save.accountNumber=32454545;
        save.money=324;
        save.profit=324;

        save.deposit();
        save.takeProfit();


    }

}
