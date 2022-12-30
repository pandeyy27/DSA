public class ratInAMaze {
    public static boolean ratInAMazeSol(int a[][], boolean vis[][], int i, int j) {

        int n = a.length;
        // Base conditions
        if (i >= n || j >= n || a[i][j] == 0 || vis[i][j]) {
            return false;
        }
        // Base condition for successfully reached
        if (i == n - 1 && j == n - 1)
            return true;

        // Mark this cell as visited
        vis[i][j] = true;

        // check if a path is possible from down
        if (ratInAMazeSol(a, vis, i + 1, j))
            return true;

        // check if a path is possible from right
        if (ratInAMazeSol(a, vis, i, j + 1))
            return true;

        // Mark this cell as unvisited & Backtrack
        vis[i][j] = false;

        // backtrack
        return false;
    }

    public static void main(String[] args) {
        int a[][] = {
                { 1, 1, 0, 1 },
                { 1, 1, 1, 1 },
                { 0, 0, 1, 0 },
                { 1, 1, 0, 1 } };

        boolean vis[][] = new boolean[a.length][a.length];

        boolean isPathPossible = ratInAMazeSol(a, vis, 0, 0);

        System.out.println(isPathPossible);
    }
}