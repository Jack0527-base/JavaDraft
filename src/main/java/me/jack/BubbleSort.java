package me.jack;

public class BubbleSort {
    public static void bubbleSort() {
        int[] arr1 = {1, -2, 3, 5, -1};
        int[] arr2 = {1, -2, 3, -8, 5, 1};
        int[] arr3 = {1, -2, 3, -2, 5, 1};

        System.out.println("Maxsum=" + maxSum(arr1));
        System.out.println("Maxsum=" + maxSum(arr2));
        System.out.println("Maxsum=" + maxSum(arr3));
    }

    public static int maxSum(int[] arr) {
        int max = arr[0];
        int currentMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            max = Math.max(max, currentMax);
        }

        return max;
    }
}
