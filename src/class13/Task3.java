package class13;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*Write a program that reads two people's first
        names and if they are expecting boy or girl?
                Based on the input suggests a name for a baby:
        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? boy
        Suggested baby name: DANRY

        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? girl
        Suggested baby name: MAIEL*/

       String MomsName ="Mary";
       String DadsName="Daniel";
       String Expectation="boy";

       String Firsthalf="";
       String Secondhalf="";

       if(Expectation.equalsIgnoreCase("Girl")){Firsthalf=DadsName.substring(0,DadsName.length()/2);
           Secondhalf=MomsName.substring(MomsName.length()/2);
           System.out.println(Firsthalf+""+Secondhalf);}

       else{Firsthalf=MomsName.substring(0,MomsName.length()/2);
           Secondhalf=DadsName.substring(DadsName.length()/2);
           System.out.println(Firsthalf.toUpperCase()+""+Secondhalf.toUpperCase());}

    }
    }

