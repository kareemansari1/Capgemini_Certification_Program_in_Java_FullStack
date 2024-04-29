package Array_Codes;

public class ArrayInAscendingOrder {

    public static void main(String[] args) {
        int arr[] = new int[] { 7, 3, 5, 49, 11, 44, 33, 22 };
        int temp = 0;

        System.out.println("Array in Original Position:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("Elements of Array in Ascending Order:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
