import java.util.Scanner;

public class Main {
    // 북, 동, 남, 서 
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static int getDir(char c) {
        if (c == 'N') return 0;
        if (c == 'E') return 1;
        if (c == 'S') return 2;
        if (c == 'W') return 3;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int x = 0;
        int y = 0;
        int time = 0;
        int answer = -1; 

        for (int i = 0; i < n; i++) {
            char dir = sc.next().charAt(0);
            int dist = sc.nextInt();
            int moveDir = getDir(dir);

            for (int j = 0; j < dist; j++) {
                x += dx[moveDir];
                y += dy[moveDir];
                time++; 

                if (x == 0 && y == 0 && answer == -1) {
                    answer = time;
                }
            }
        }

        System.out.println(answer);
        sc.close();
    }
}