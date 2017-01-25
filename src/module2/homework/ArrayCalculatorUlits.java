package module2.homework;


import java.util.Arrays;

public class ArrayCalculatorUlits {


    static int sumIntElements(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }

    static double sumDoubleElements(double[] array) {
        double sum = 0;
        for (double element : array) {
            sum += element;
        }
        return sum;
    }

    static int findMinInt(int[] array) {
        int min = Arrays.stream(array).min().getAsInt();
        return min;
    }

    static double findMinDouble(double[] array) {
        double min = Arrays.stream(array).min().getAsDouble();
        return min;
    }

    static int findMaxInt(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
        }
        return max;
    }

    static double findMaxDouble(double[] array) {
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
        }
        return max;
    }

    static int findMaxPositiveInt(int[] array) {
        int max = 0;
        for (int element : array) {
            if (element > 0 && max < element)
                max = element;
        }
        return max;
    }

    static double findMaxPositiveDouble(double[] array) {
        double max = 0;
        for (double element : array) {
            if (element > 0 && max < element)
                max = element;
        }
        return max;
    }

    static int multInt(int[] array) {
        int mult = 1;
        for (int element : array) {
            mult *= element;
        }
        return mult;
    }

    static double multDouble(double[] array) {
        double mult = 1;
        for (double element : array) {
            mult *= element;
        }
        return mult;
    }

    static int[] modulusInt(int[] array) {
        int modFirst = Math.abs(array[0]);
        int modLast = Math.abs(array[array.length - 1]);
        int[] newArray = {modFirst, modLast};

        return newArray;
    }

    static double[] modulusDouble(double[] array) {
        double modFirst = Math.abs(array[0]);
        double modLast = Math.abs(array[array.length - 1]);
        double[] newArray = {modFirst, modLast};

        return newArray;
    }

    static int secondLargestInt(int[] array) {
        int largest = array[0];
        int secondLargest = array[0];
        for (int element : array) {
            if (element > largest) {
                secondLargest = largest;
                largest = element;
            } else if (element > secondLargest)
                secondLargest = element;
        }
        return secondLargest;
    }

    static double secondLargestDouble(double[] array) {
        double largest = array[0];
        double secondLargest = array[0];
        for (double element : array) {
            if (element > largest) {
                secondLargest = largest;
                largest = element;
            } else if (element > secondLargest)
                secondLargest = element;
        }
        return secondLargest;
    }


}
