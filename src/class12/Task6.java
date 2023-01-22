package class12;

public class Task6 {
    public static void main(String[] args) {

        String[][] countries={{"USA", "Canada", "Mexico"},
                {"Brazil", "Argentina", "Peru"}};

        int sum=0;

        for(int i=0; i< countries.length; i++){for (int j=0; j< countries[i].length; j++ ){
            System.out.println(countries[i][j]+" ");sum++;}

            System.out.println();}
        System.out.println(sum);

        System.out.println("*************************");

        int counter=0;
        for (String country[]: countries){for(String contry2: country){
            System.out.print(contry2+" ");counter++;}
            System.out.println();

        }
        System.out.println(counter);
    }
}