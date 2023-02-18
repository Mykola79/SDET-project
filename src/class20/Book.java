package class20;

public class Book {
    /*Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
    Instance variables are being initialized
    Both Constructors are being executed*/

    int pages;                                                  //1)
    String namesChapters;

    Book(int pages){                                            //2

        this.pages=pages;}                                           //3

    void countPages(){
        System.out.println("I have read "+pages+" pages");
    }

    String content;

    Book(String content){

        this.content=content;
    }
    void nameBook(){
        System.out.println("The name of the book is "+content);
    }

    public static void main(String[] args) {

        Book book2=new Book("Introduction");
        book2.nameBook();

        Book book3=new Book(55);
        book3.countPages();

    }



}



