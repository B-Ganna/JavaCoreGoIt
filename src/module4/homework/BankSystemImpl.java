package module4.homework;


public class BankSystemImpl implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {
        Bank userBank = user.getBank();
        double comission = userBank.getCommission(amount);
        if (userBank.getLimitOfWithdrawal() >= amount + amount * comission) {
            double balanceAfterWithdrawal = user.getBalance() - amount - amount * comission;
            user.setBalance(balanceAfterWithdrawal);
        }
    }

    @Override
    public void fundUser(User user, int amount) {
        Bank userBank = user.getBank();
        if (userBank.getLimitOfFunding() >= amount || userBank.getLimitOfFunding() == 0) {
            double newBalance = user.getBalance() + amount;
            user.setBalance(newBalance);
        }
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        Bank userBank = fromUser.getBank();
        if (userBank.getLimitOfFunding() >= amount || userBank.getLimitOfFunding() == 0) {
            fromUser.setBalance(fromUser.getBalance() - amount - amount * fromUser.getBank().getCommission(amount));
        }
        toUser.setBalance(toUser.getBalance() + amount);
    }

    @Override
    public void paySalary(User user) {
        user.setBalance(user.getBalance() + user.getSalary());
        user.setMonthsOfEmployment(user.getMonthsOfEmployment() + 1);

    }
}
