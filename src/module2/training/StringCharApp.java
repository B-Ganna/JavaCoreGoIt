package module2.training;


public class StringCharApp {
    public static void main(String[] args) {
        String habr = "habrahabr";
        int length = habr.length();
        char searchChar = 'h';
        boolean isFound = false;
        for (int i = 0; i < length; ++i) {
            if (habr.charAt(i) == searchChar) {
                isFound = true;
                break;
            }
        }
        System.out.println(message(isFound));
        System.out.println(message(habr.indexOf(searchChar) != 1));

    }

    private static String message(boolean b) {
        return "Your char had " + (b ? "" : "n't") + " been found";

    }
}
