package module2.homework;



public class WithdrawerFromAccount {

    static double comissionPercent = 0.05;

    static String fundBalances(String[] owners, String name, double[] balances, double withdrawal) {
        for (int i = 0; i < balances.length; i++) {
            if (owners[i].equals(name)) {
                if (balances[i] > withdrawal) {
                    balances[i] -= withdrawal * (1 + comissionPercent);
                    return name + " " + (int)withdrawal + " " + (int)balances[i];
                } else {
                    return "NO";
                }
            }
        }
        return "Owner not found";

    }


}
