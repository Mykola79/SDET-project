package class5;

public class LogicalOperators2 {
    public static void main(String[] args) {

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);

        System.out.println(false || true | false | false);

        boolean boughtCho = true;
        boolean boughFlowers=true;
        if(boughtCho || boughFlowers){
            System.out.println("I am happy");}else{
            System.out.println("I am sad");}


        boolean wifi = true;
        boolean fiveG=true;

        if(wifi || fiveG) {
            System.out.println("You are good for browsing the internet");
        }else{
            System.out.println("Either connect to wifi or to 5G");}
    }}
