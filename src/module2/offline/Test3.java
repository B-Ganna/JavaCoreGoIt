package module2.offline;


public class Test3 {
    static double withdraw(double balance, double withdrawal) {
        double comission = 1.5;
        return balance - withdrawal - comission;
    }

    public static void main(String[] args) {
        double balance = 100;
        double withdrowal = 30.5;

        double afetrWithdraw = withdraw(balance, withdrowal);


        if (withdraw(balance, withdrowal) >= 0) {
            System.out.println("ok");
            System.out.println(afetrWithdraw);
        } else {
            System.out.println("no");
        }

    }
}
