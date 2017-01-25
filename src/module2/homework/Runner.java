package module2.homework;


import java.util.Arrays;

import static module2.homework.ArrayCalculatorUlits.*;

public class Runner {
    public static void main(String[] args) {
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


    }
}
