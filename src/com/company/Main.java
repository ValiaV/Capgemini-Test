import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        final String POUND = "\u00A3";

        String apple = "Apple";
        String orange = "Orange";

        int sum = 0;

        for (int i =0; i<args.length; i++){
            if (args[i].equals(apple)){
                sum += 60; //add pence
            } else if (args[i].equals(orange)){
                sum += 25; //add pence
            }
        }
        Integer pounds = sum/100;
        Integer pence = sum%100;
        System.out.println( "£"+ pounds + "." + pence);

    }
}
