package module3.homework.task3_4;


public class UserTester {
    public static void main(String[] args) {
        User user = new User("Freya", 5000, 5, "RogaIKopita", 2000, "usd");
        user.paySalary();
        System.out.println(user.getBalance());
        System.out.println(user.withdraw(3000));
        System.out.println(user.companyNameLength());
        System.out.println(user.monthIncreaser(1));
    }
}
