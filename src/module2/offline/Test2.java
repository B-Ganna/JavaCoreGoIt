package module2.offline;


public class Test2 {
    public static void main(String[] args) {
        long[] array = {10, 30, 50, 42, 83, 91};
        int n = 50;
        long result = containsCount(array, n);
        if (result == 1) {
            System.out.println("yes");
        }
        if (result == 0) {
            System.out.println("no");
        }
        if (result > 1) {
            System.out.println(result);
        }


    }

    static long containsCount(long[] array, int n) {
        int k = 0;
        for (long item : array) {
            if (item == n) {
                k++;
            }

        }
        return k;
    }
}
