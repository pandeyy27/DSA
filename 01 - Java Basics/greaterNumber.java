// WAP to find the numbers greater than the average of the numbers of a given array

class greaterNumber {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 4, 17, 7, 25, 3, 100 };
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println("Sum: " + sum);
        float avg = sum / a.length;
        System.out.println("Avg: " + avg);
        System.out.println("Numbers greater than avg are:");
        for (int i = 0; i < a.length; i++) {
            if (avg < a[i]) {
                System.out.println(a[i]);
            }
        }
    }
}