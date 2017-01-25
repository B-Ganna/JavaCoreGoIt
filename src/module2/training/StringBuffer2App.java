package module2.training;


public class StringBuffer2App {
    public static void main(String[] args) {
        try {
            test(new StringBuffer(""));
            test(new StringBuilder(""));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

    private static void test(Appendable obj) throws Exception {
        long before = System.currentTimeMillis();
        for (int i = 0; i++ < 1e9; ) {
            obj.append("");
        }
        long after = System.currentTimeMillis();
        System.out.println(obj.getClass().getSimpleName() + ":" + (after - before) + "ms");
    }
}
