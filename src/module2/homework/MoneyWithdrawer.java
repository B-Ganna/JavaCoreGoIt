package module2.homework;


public class MoneyWithdrawer {

    static double comissionPercent = 0.05;

    static String withdrawMoney(double balance, double withdrawal) {
        double balanceAfterWithdrawal = balance - withdrawal - (withdrawal * comissionPercent);
        if (balanceAfterWithdrawal >= 0) {
            return "OK " + withdrawal * comissionPercent + " " + balanceAfterWithdrawal;
        } else {
            return "NO";
        }
    }
}

