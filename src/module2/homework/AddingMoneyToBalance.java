package module2.homework;


public class AddingMoneyToBalance {
    static String fundBalances(String[] owners, String name, double[] balances, double fund) {
        for (int i = 0; i < balances.length; i++) {
            if (owners[i].equals(name)) {

                balances[i] += fund;
                return name + " " + (int)balances[i];
            }
        }
        return"Owner not found!";
    }
}

