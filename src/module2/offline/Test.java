package module2.offline;


import java.util.Arrays;

public class Test {

    static int balancesSum(int[] balances) {
        int sum = 0;
        for (int balance : balances) {
            if (balance > 1000 && balance < 5000) {
                sum += balance;
            }
        }
        return sum;
    }

    static String[] ownerNames(int[] balances, String[] names) {
        int ownerCount = 0;
        for (int balance : balances) {
            if (balance > 1000) ownerCount++;
        }

        String[] result = new String[ownerCount];
        int index = 0;
        for (int i = 0; i < balances.length; i++) {

            if (balances[i] > 1000) {
                result[index] = names[i];
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String test = " ";

        int[] balances = {1234, 4674, 9585, 2525, 8221, 400, 586};
        String[] names = {"Jane", "Anna", "Jack", "Den", "Vova", "Serg", "Vera"};
        int[] balances1 = {1200, 4674, 9500, 2525, 8000, 400, 586};
        System.out.println(balancesSum(balances));
        System.out.println(balancesSum(balances1));
        System.out.println(Arrays.toString(ownerNames(balances, names)));

        //before optimization_1

        //int sum = 0;

       /* for (int i = 0; i < balances.length; i++) {
            if (balances[i] > 1000 && balances[i] < 5000) {
                sum += balances[i];
            }
        }*/

        //before optimization_1

        /*for (int balance : balances) {
            if (balance > 1000 && balance < 5000) {
                sum += balance;
            }
        }*/

    }


}
