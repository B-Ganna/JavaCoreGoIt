package module4.homework;


public class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int limit;
        if (getCurrency() == Currency.USD) limit = 100;
        else limit = 150;

        return limit;
    }

    @Override
    int getLimitOfFunding() {
        int limit;
        if (getCurrency() == Currency.EUR) limit = 5000;
        else limit = 10_000;
        return limit;
    }

    @Override
    int getMonthlyRate() {
        int rate;
        if (getCurrency() == Currency.USD) rate = 1;
        else rate = 0;
        return rate;
    }

    @Override
    double getCommission(int summ) {
        double comission = 0;
        if (getCurrency() == Currency.USD) {
            if (summ < 1000) comission = 0.03;
            else comission = 0.05;
        } else if (getCurrency() == Currency.EUR) {
            if (summ < 1000) comission = 0.1;
            else comission = 0.11;
        }
        return comission;
    }
}
