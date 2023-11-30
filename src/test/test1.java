package test;

import java.util.Arrays;
import java.util.Scanner;

public class test1 {

    public static void transformArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("<Initializing test1>");
        System.out.print("Size of array : ");
        int n = scanner.nextInt();
        int[] inputArray = new int[n];
        System.out.println("Enter " + n + " numbers :");

        for(int i = 0; i < n; ++i) {
            inputArray[i] = scanner.nextInt();
        }

        scanner.close();
        int[] output = changeArray(inputArray);
        System.out.println("Input : " + Arrays.toString(inputArray));
        System.out.println("Output : " + Arrays.toString(output));
    }

    public static int[] changeArray(int[] arr) {
        int n = arr.length;
        int[] newArr = new int[n];

        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                if (i != j) {
                    newArr[i] += arr[j];
                }
            }
        }

        return newArr;
    }
}
