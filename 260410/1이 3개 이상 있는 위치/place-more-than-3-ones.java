import java.util.Scanner;

public class Main {
    static int board[][];
    static int N;

    public static boolean inRange(int x, int y){
        return (0 <= x && x < N && y >= 0 && y < N);
    }

    static int[] dx = new int[]{-1, 1, 0, 0};
    static int[] dy = new int[]{0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        board = new int[N][N];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                board[i][j] = sc.nextInt();
            }
        }

        int answer = 0; 

        for(int j = 0; j < N; j++){
            for(int k = 0; k < N; k++){
                int cnt = 0; 

                for(int i = 0; i < 4; i++){
                    int nx = j + dx[i];
                    int ny = k + dy[i];

                    if(inRange(nx, ny) && board[nx][ny] == 1) {
                        cnt++;
                    }
                }

                if(cnt >= 3) {
                    answer++;
                }
            }
        }

        System.out.println(answer);
        sc.close();
    }
}