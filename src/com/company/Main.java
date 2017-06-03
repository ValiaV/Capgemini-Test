
public class Main {

    public static void main(String[] args) {

        final String POUND = "\u00A3";

        String apple = "Apple";
        String orange = "Orange";

        int sum = 0;
        int apples = 0;
        int oranges = 0;

        for (int i =0; i<args.length; i++){
            if (args[i].equals(apple)){
                sum += 60; //add pence
                apples++;
            } else if (args[i].equals(orange)){
                sum += 25; //add pence
                oranges++;
            }
        }

        int offer_apples = apples/2;
        sum = sum - (offer_apples*60);

        int offer_oranges = oranges/3;
        sum = sum - (offer_oranges*25);

        Integer pounds = sum/100;
        Integer pence = sum%100;
        System.out.println( "£"+ pounds + "." + pence);

    }
}
