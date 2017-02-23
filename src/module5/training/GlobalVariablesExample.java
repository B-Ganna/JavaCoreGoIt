package module5.training;

public class GlobalVariablesExample {
    static int a;

    {
        //code block
    }

    public static void main(String[] args) {
        test();
        a = 11;
    }

    protected static void test() {
        a = 10;
        System.out.println("Hi there " + a + " people");
    }

    protected static void test1() {
        a = 6;
        System.out.println("Hi there " + a + " people");
    }
}
