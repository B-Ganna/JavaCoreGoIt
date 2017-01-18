package module2.training;


public class StringFormatApp {
    public static void main(String[] args) {
        String formatString = "We are printing double variable (%f), string ('%s') and integer variable (%d).";
        System.out.println(String.format(formatString, 2.3, "habr", 10));
    }
}
