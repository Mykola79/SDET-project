package class20;

import java.util.concurrent.Callable;

public class Sport {

    String name, country;                       //1

    Sport(String name, String country) {        //2

        this.name = name;                       //3
        this.country = country;}

        public void display(){
            System.out.println(name + " " + country);     //4
        }
    }



class Cricket extends Sport{

    String helmet;                              //1

    Cricket(String name, String country, String helmet){    //2

        super(name, country);                               //3
        this.helmet=helmet;

    }
    }


    class Football extends Sport{

    String team;                                        //1
    int numberOfPlayers;

    Football(String name, String country, String team, int numberOfPlayers){        //2

        super(name, country);                                           //3
        this.team=team;
        this.numberOfPlayers=numberOfPlayers;}

        void displayTeam(){
            System.out.println(team+" consists of "+numberOfPlayers+" players");}           //4



        public static void main(String[] args) {

            Cricket cr=new Cricket("Cricket","Pakistan", "Green Helmet");
            cr.display();

            Football fot=new Football("Soccer", "Argentina", "Oliver's",12);
            fot.display();
            fot.displayTeam();

        }

        }





