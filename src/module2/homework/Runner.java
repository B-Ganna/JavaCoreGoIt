package module2.homework;


import java.util.Arrays;

import static module2.homework.ArrayCalculatorUlits.*;
import static module2.homework.MoneyWithdrawer.*;
import static module2.homework.WithdrawerFromAccount.*;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Homework 2.1");
        int[] intArray = {2, -5, 1, 7, 9, 5, -2, 8, 4, -10};
        double[] doubleArray = {-2.1, 5.6, -1.2, 7.9, 9.4, -5.6, 2.8, -8.8, 4.0, 10.2};
        System.out.println(sumIntElements(intArray));
        System.out.println(sumDoubleElements(doubleArray));
        System.out.println(findMinInt(intArray));
        System.out.println(findMinDouble(doubleArray));
        System.out.println(findMaxInt(intArray));
        System.out.println(findMaxDouble(doubleArray));
        System.out.println(findMaxPositiveInt(intArray));
        System.out.println(findMaxPositiveDouble(doubleArray));
        System.out.println(multInt(intArray));
        System.out.println(multDouble(doubleArray));
        System.out.println(Arrays.toString(modulusInt(intArray)));
        System.out.println(Arrays.toString(modulusDouble(doubleArray)));
        System.out.println(secondLargestInt(intArray));
        System.out.println(secondLargestDouble(doubleArray));
        System.out.println("-------------------------------------------------");
        System.out.println("Homework 2.2");
        double balance = 750;
        double withdrawal = 500;
        double comissionPercent = 0.05;
        double balanceAfterWithdrawal = withdrawMoney(balance, withdrawal, comissionPercent);
        if (balanceAfterWithdrawal >= 0) {
            System.out.println("OK " + " " + withdrawal * comissionPercent + " " + balanceAfterWithdrawal);
        } else {
            System.out.println("NO");
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Homework 2.3");
        double[] balances = {1200, 5250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Anna", "Jack", "Oww", "Lane"};
        String name = "Anna";
        withdrawal = 4500;
        System.out.println(fundBalances(ownerNames, name, balances, withdrawal));
        System.out.println("-------------------------------------------------");
        System.out.println("Homework 2.4");
        name = "Oww";
        double fund = 100;
        System.out.println(AddingMoneyToBalance.fundBalances(ownerNames, name, balances, fund));
    }
}
