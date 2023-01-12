package class2;

public class Variables {
    public static void main(String[] args) {
        /*
        Below the line is reserving a box in the computer memory.
        We are calling it box if we need the information that we are storing inside the box
        we can simply say to the computer give the contents of box1.
        int=> what type of data we want to store
        box1=> is the name of the box
        = sign will take whatever we write after it and will store it inside the box1
        10> what we are storing inside the box
         */
        int box1=10;
        // if are printing something from a box we don't need ""
        System.out.println(box1); //bring the contents of box1 and print them on the console
        /* To store whole numbers we have(Numbers without decimals points) we have 4 different types of boxes
        for example 10 20 100000 3300000
       */
        byte box2=127; //range for byte is from -128 to 127 if we need to store larger numbers we should try short
        byte box3=-128;
        short box4=32767;
        short box5=-3256;
        int biggerBox=123456484; // most common type of box. Whole numbers
        long maxBox=16938768436l;

        //reserve a box which can hold the number 10000 call it myBox and print its values on console
        short myBox=10000;
        System.out.println(myBox);
    }
}
