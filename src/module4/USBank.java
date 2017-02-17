package module4;


public class USBank extends Bank {
    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int limit;
        if (getCurrency() == Currency.USD) limit = 1000;
        else limit = 1200;

        return limit;
    }

    @Override
    int getLimitOfFunding() {
        int limit;
        if (getCurrency() == Currency.EUR) limit = 10_000;
        else limit = 0;
        return limit;
    }

    @Override
    int getMonthlyRate() {
        int rate;
        if (getCurrency() == Currency.USD) rate = 1;
        else rate = 2;
        return rate;
    }

    @Override
    int getCommission(int summ) {
        int comission = 0;
        if (getCurrency() == Currency.USD) {
            if (summ > 1000) comission = 5;
            else comission = 7;
        } else if (getCurrency() == Currency.EUR) {
            if (summ > 1000) comission = 6;
            else comission = 8;
        }
        return comission;
    }
}
