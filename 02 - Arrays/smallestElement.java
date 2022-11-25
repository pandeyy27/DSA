import java.util.*;

class smallestElement {
    public static int output(int arr[]) {
        int n = arr.length;

        int min = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of N");
        int n = input.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println(output(arr));

        input.close();
    }
}