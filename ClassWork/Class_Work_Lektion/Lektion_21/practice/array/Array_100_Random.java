package Lektion_21.practice.array;

public class Array_100_Random {
    public static void main(String[] args) {
        //   Создайте массив из 100 случайных целых чисел в интервале от -10 до 10.
        //   Подсчитайте, сколько в этом массиве оказалось:
        // - положительных чисел;
        // - отрицательных чисел;
        // - четных чисел;
        // - нулей.

        int[] myArray = new int[10];

        int a = -10;
        int b = 10;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * (b - a + 1) + a);
        }
        printArray(myArray);
        System.out.println();
        System.out.print("Zero: ");
        System.out.println(zeroCount(myArray));
        System.out.print("Even: ");
        System.out.println(evenCount(myArray));
        System.out.print("Positive: ");
        System.out.println(positiveCount(myArray));
        System.out.print("Negative: ");
        System.out.println(negativeCount(myArray));


    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static int zeroCount(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        return count;
    }

    public static int positiveCount(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }
        return count;
    }

    public static int evenCount(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int negativeCount(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                count++;
            }
        }
        return count;
    }
}



