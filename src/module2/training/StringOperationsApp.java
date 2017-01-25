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
        System.out.println(first + "\n" + second + "\n" + third);

        //String to int

        String string = "10";
        int firstString = Integer.parseInt(string);
        int secondString = Integer.valueOf(string);

        //other operations
        String someString = "habrahabr";
        char[] chars = {'h', 'a', 'b', 'r', 'a', 'h', 'h', 'a', 'b', 'r'};
        String newSomeString = new String(chars);
        System.out.println(newSomeString);

        // charAt()
        //returns index of array's symbol
        String s = "I will learn Java";
        char result1 = s.charAt(8);
        char result2 = s.charAt(5);
        System.out.println(result1 + "\n" + result2);

        //compareTo()
        //compares current string to another object
        Integer x = 5;
        System.out.println(x.compareTo(3));
        System.out.println(x.compareTo(5));
        System.out.println(x.compareTo(7));

        //compareTo()
        //compares two Strings
        String s1 = "I will learn Java";
        String s2 = "I will learn Java";
        String s3 = "I will learn PHP";
        int result = s1.compareTo(s2);
        System.out.println(result);
        result = s1.compareTo(s3);
        System.out.println(result);
        result = s2.compareTo(s3);
        System.out.println(result);

        //compareToIgoreCase()
        //compares two Strings, ignoring case
        String ss1 = "I will learn Java";
        String ss2 = "I will learn Java";
        String ss3 = "I will learn PHP";
        int resultt = ss1.compareToIgnoreCase(ss2);
        System.out.println(resultt);
        result = ss1.compareToIgnoreCase(ss3);
        System.out.println(resultt);
        result = ss2.compareToIgnoreCase(ss3);
        System.out.println(resultt);

        //concat()
        //adds one string to the end of another
        String sss1 = "I will learn Java";
        System.out.println(sss1.concat(" very well"));

        //contentEquals()
        //returns true if buffer string is the same consequence
        String str1 = "Добро пожаловать на ProgLang.su";
        String str2 = "Сайт для изучения программирования";
        StringBuffer str3 = new StringBuffer("Добро пожаловать на ProgLang.su");
        StringBuffer str4 = new StringBuffer("Сайт для изучения программирования");
        System.out.println(str1.contentEquals(str3));
        System.out.println(str1.contentEquals(str4));

        //copyValueOf()
        //copies string as consiquence of chars in an array
        char[] Str1 = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
        String Str2 = "";
        Str2 = Str2.copyValueOf(Str1);
        System.out.println(Str2);
        Str2 = Str2.copyValueOf(Str1, 2, 6);
        System.out.println(Str2);


    }
}
