import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                grid[i][j] = sc.nextInt();
        boolean[][] visited = new boolean[n][m];

        if(grid[0][0] == 0){
            System.out.println(0);
            return;
        }
        BFS();
    }

    public static void BFS() {
        //상, 하 , 좌, 우
        int[] dr = new int[]{-1,1,0,0};
        int[] dc = new int[]{0,0,-1,1};

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0});
        visited[0][0] = true;

        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            int r = cur[0];
            int c = cur[1];

            if(r == N-1 && c== M-1){
                System.out.println(1);
                return;
            }

            for(int d=0; d<4; d++){
                int nr = r + dr[d];
                int nc = c + dc[d];
            }

            if(nr<0 || nr >=n || nc<0 || nc>= M) continue;
            if(grid[nr][nc] == 0) continue;
            if(visited[nr][nc]) continue;

            visited[nr][nc] = true;
            queue.add(new int[]{nr, nc});


    }
}