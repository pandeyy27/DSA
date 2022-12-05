// WAP to print frequency of elements in a sorted array
public class frequency {
    static void output(int a[]) {
        int count = 1;
        for (int i = 1; i < a.length; i++) {

            if (a[i] == a[i - 1]) {
                count++;
            } else {
                System.out.println("Frequency of " + a[i - 1] + " is " + count);
                count = 1;
            }
        }
        System.out.println("Frequency of " + a[a.length - 1] + " is " + count); //Exclusively for last element in the array
    }

    public static void main(String[] args) {
        int a[] = { 2, 3, 4, 4, 4, 5, 5, 5, 5, 6, 6 };
        output(a);
    }
}