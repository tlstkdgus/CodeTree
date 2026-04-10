import java.util.Scanner;

public class Main {
    static int N;
    static int M;
    static int board[][];
    // 우, 하, 좌, 상
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int dir = 0;
    
    public static boolean inRange(int x, int y){
        return (0 <= x && x < N && 0 <= y && y < M);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        board = new int[N][M];

        int x = 0; 
        int y = 0; 

        for(int i = 1; i <= N * M; i++){
            board[x][y] = i;

            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if(!inRange(nx, ny) || board[nx][ny] != 0) {
                dir = (dir + 1) % 4; 
                
                nx = x + dx[dir];
                ny = y + dy[dir];
            }

            x = nx;
            y = ny;
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}