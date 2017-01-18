package module2.training;


import java.util.ArrayList;
import java.util.Arrays;

public class StringOperationsApp {
    public static void main(String[] args) {

        // join method

        String hello = "Hello";
        String habr = "habr";
        String delim = ", ";
        System.out.println(String.join(delim, hello, habr));
        System.out.println(String.join(delim, new ArrayList<CharSequence>(Arrays.asList(hello, habr))));

        //int to String

        int integerVariable = 10;
        String first = integerVariable + "";
        String second = String.valueOf(integerVariable);
        String third = Integer.toString(integerVariable);

        //String to int



    }
}
