package class2;

import java.util.Date;

public class HomeworkTask5 {
    public static void main(String[] args) {
        float width = 5.0f;
        float height = 8.0f;

        System.out.println("The perimeter of a rectangle with width "+width+" and height "+height+" is equal to "
                +(width+width+height+height)+" and the area is "+(width*height));

        Date now = new Date();
        System.out.println(new Date());
        String message = "Hello \"World\""+"!!";
        System.out.println(message.toCharArray());
        System.out.println(message);

    }
}
