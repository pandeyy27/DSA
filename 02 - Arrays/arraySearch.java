// WAP to search an elelment in an array

public class arraySearch {

    public static void main(String[] args) {

        int a[] = { 2, 1, 4, 6, 5 };
        int key = 5;
        int res = -1;
        // search for key
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                res = i;
                break;
            }
        }
        if (res == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Value found at index " + res);
        }
    }
}