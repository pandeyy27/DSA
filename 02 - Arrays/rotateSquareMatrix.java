// Rotate a square matrix 90 degree clockwise

public class rotateSquareMatrix {

    static void transpose(int a[][]) {
        System.out.println();

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int swap = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = swap;
            }
        }
    }

    static void rotate(int a[][]) {
        transpose(a);
        int n = a.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int swap = a[i][j];
                a[i][j] = a[i][n - j - 1];
                a[i][n - j - 1] = swap;
            }
        }
    }

    static void printMatrix(int a[][]) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int a[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        printMatrix(a);
        rotate(a);
        printMatrix(a);
    }
}