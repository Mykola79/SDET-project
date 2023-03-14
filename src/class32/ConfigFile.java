package class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFile {
    public static void main(String[] args) {

        String path = "Files/config.properties";


        try {
            FileInputStream fileInputStream = new FileInputStream(path);

            Properties properties = new Properties();
            properties.load(fileInputStream);

            System.out.println(properties.getProperty("user"));
        }catch (FileNotFoundException e){
            System.out.println("Something went wrong");
        }catch (NullPointerException e){
            System.out.println("You are trying to call a method on Null object");
        }catch (IOException e){
            System.out.println("IO Exception occurred");
        }
    }
}