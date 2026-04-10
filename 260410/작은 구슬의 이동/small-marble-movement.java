import java.util.Scanner;

public class Main {
    static int N;
    // 우(0), 하(1), 상(2), 좌(3)
    static int[] dx = {0, 1, -1, 0};
    static int[] dy = {1, 0, 0, -1};
    public static boolean inRange(int x, int y){
        return (1 <= x && x <= N && 1 <= y && y <= N);
    }

    public static int getDir(char D){
        if(D == 'R') return 0;
        if(D == 'D') return 1;
        if(D == 'U') return 2;
        if(D == 'L') return 3;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        int T = sc.nextInt();
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        char D = sc.next().charAt(0);
        
        int move = getDir(D);

        for(int i = 0; i < T; i++){
            int nx = x + dx[move];
            int ny = y + dy[move];

            if(!inRange(nx, ny)){
                move = 3 - move;
            } 

            else {
                x = nx;
                y = ny;
            }
        }

        System.out.println(x + " " + y);
        sc.close();
    }
}