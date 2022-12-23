public class towerOfHanoi {

    static void towerOfHanoiSolution(int n, char from, char to, char aux) {
        if (n == 0)
            return;

        towerOfHanoiSolution(n - 1, from, aux, to);
        System.out.println("Move " + n + " from " + from + " to " + to);
        towerOfHanoiSolution(n - 1, aux, to, from);
    }

    public static void main(String[] args) {
        towerOfHanoiSolution(3, 'A', 'C', 'B');
    }
}