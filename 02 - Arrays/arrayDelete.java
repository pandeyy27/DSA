// WAP to delete an element from an array

class arrayDelete {
    public static void main(String[] args) {
        int a[] = { 2, 1, 4, 6, 5 };
        int del = 4;
        int n = a.length;

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (del == a[i]) {
                for (int j = i; j < n - 1; j++) {
                    a[j] = a[j + 1];
                }
                count += 1;
                break;
            }
        }

        if (count == 0) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element deleted");
            for (int i = 0; i < n - 1; i++) { // try to give condition as (i < n) and see the o/p
                System.out.print(a[i] + " ");
            }
        }
    }
}