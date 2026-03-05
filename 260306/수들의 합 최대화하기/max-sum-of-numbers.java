import java.util.Scanner;

public class Main {

    static int N;
    static int[][] grid;
    static boolean[] visited;
    static int max = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        grid = new int[N][N];
        visited = new boolean[N];

        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                grid[i][j] = sc.nextInt();

        recur(0, 0);
        System.out.println(max);
    }

    static void recur(int num, int sum) {
        if (num == N) {
            max = Math.max(max, sum);
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                recur(num + 1, sum + grid[num][i]);
                visited[i] = false;
            }
        }
    }
}