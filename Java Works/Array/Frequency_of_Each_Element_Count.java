package Array_Codes;

public class Frequency_of_Each_Element_Count {

    public static void main(String[] args) {
        int arr1[] = new int[] { 1, 2, 8, 3, 2, 2, 2, 5, 1 };
        int fr[] = new int[arr1.length];
        int visited = -1;

        for (int i = 0; i < arr1.length; i++) {
            int count = 1;

            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] == arr1[j] && fr[j] != visited) {
                    count++;
                    fr[j] = visited;
                }
            }

            if (fr[i] != visited) {
                fr[i] = count;
            }
        }

        System.out.println("----------------------");
        System.out.println("Element | Frequency");
        System.out.println("----------------------");

        for (int i = 0; i < arr1.length; i++) {
            if (fr[i] != visited) {
                System.out.println(" " + arr1[i] + " | " + fr[i]);
            }
        }

        System.out.println("-----------------------");
    }
}
