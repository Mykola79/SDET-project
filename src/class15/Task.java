package class15;

import java.util.SortedMap;

public class Task {
    /*Create a method createEmail(). Based on values of users name, lastName and email type, your method should return
     complete email Address. Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com or
     */
    String createEmail(String firstName, String lastName, String emailType){
        return firstName+lastName+"@"+emailType+".com";}


    public static void main(String[] args) {
        Task task=new Task();

        System.out.println(task.createEmail("jhon.", "snow", "gmail" ));
    }
}
