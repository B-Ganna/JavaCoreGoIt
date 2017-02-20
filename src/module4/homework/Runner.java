package module4.homework;


public class Runner {
    public static void main(String[] args) {
        Bank usBank = new USBank(23123, "Ukraine", Currency.USD, 13, 400, 10, 2_000_000);
        Bank euBank = new EUBank(34536, "Germany", Currency.EUR, 47, 800, 12, 9_000_000);
        Bank chinaBank = new ChinaBank(34536, "China", Currency.USD, 39, 700, 15, 19_000_000);

        User userUs1 = new User(123123, "Vasya", 15_000, 27, "Vesna", 500, usBank);
        User userUs2 = new User(876787, "Oleg", 6_900, 7, "Vesna", 200, usBank);
        User userEu1 = new User(465466, "Galina", 18_340, 45, "Zima", 900, euBank);
        User userEu2 = new User(987876, "Roman", 22_600, 32, "Zima", 600, euBank);
        User userCh1 = new User(838383, "Svetlana", 11_340, 17, "Leto", 600, chinaBank);
        User userCh2 = new User(737474, "Rustam", 12_586, 47, "Leto", 800, chinaBank);

        BankSystem bankSystem = new BankSystemImpl();
        bankSystem.fundUser(userUs1, 3000);
        bankSystem.fundUser(userUs2, 7000);
        bankSystem.fundUser(userEu1, 13000);
        bankSystem.fundUser(userEu2, 5600);
        bankSystem.fundUser(userCh1, 6000);
        bankSystem.fundUser(userCh2, 2000);

        bankSystem.withdrawOfUser(userUs1, 700);
        bankSystem.withdrawOfUser(userUs2, 230);
        bankSystem.withdrawOfUser(userEu1, 2100);
        bankSystem.withdrawOfUser(userEu2, 800);
        bankSystem.withdrawOfUser(userCh1, 1800);
        bankSystem.withdrawOfUser(userCh2, 500);

        bankSystem.transferMoney(userEu1, userEu2, 200);
        bankSystem.transferMoney(userCh2, userCh1, 1600);

        bankSystem.paySalary(userUs1);
        bankSystem.paySalary(userUs2);
        bankSystem.paySalary(userEu1);
        bankSystem.paySalary(userEu2);
        bankSystem.paySalary(userCh1);
        bankSystem.paySalary(userCh2);

        System.out.println(userUs1);
        System.out.println(userUs2);
        System.out.println(userEu1);
        System.out.println(userEu2);
        System.out.println(userCh1);
        System.out.println(userCh2);


    }
}
