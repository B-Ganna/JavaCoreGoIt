package module2.homework;


public class MoneyWithdrawer {

    static double withdrawMoney(double balance, double withdrawal, double comissionPercent) {
       double comission = withdrawal * comissionPercent;
        return balance - withdrawal - comission;
    }

}
