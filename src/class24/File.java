package class24;

public abstract class File {
        int size;

    File(int size){
        this.size=size;}

    abstract void open();
        void edit(){
        System.out.println("Edit file");}
        void close(){
        System.out.println("Close file");}
    }



    class JavaFile extends File{

    JavaFile(int size){
        super(size);
    }
        void open(){
        System.out.println("openning file in Intellig");
    }
        void edit(){
        System.out.println("Edit file in ItelliG");}
    }



    class WordFile extends File {
        WordFile(int size) {
            super(size);
        }

        void open() {
            System.out.println("Oepening the file in Microsoft word");
        }
    }





    class PDFFile extends File {
        PDFFile(int size) {

            super(size);
        }
        void open() {
            System.out.println("Opening the file in acrobat reader");
        }





        public static void main(String[] args) {

        File[] files={new JavaFile(1024)
                    ,new WordFile(25),new PDFFile(50)};

            for (int i = 0; i < files.length ; i++) {
                File file=files[i];
                file.open();
                file.edit();
                file.close();
            }
        }}
