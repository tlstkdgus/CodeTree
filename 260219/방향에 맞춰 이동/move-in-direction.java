import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int y = 0;
        int[] dx = new int[]{-1, 0, 0, 1};
        int[] dy = new int[]{0, -1, 1, 0};
        for (int i = 0; i < n; i++) {
            char direction = sc.next().charAt(0);
            int distance = sc.nextInt();
            
            int dir = 0;
            if (direction == 'W'){
                dir = 0;
            }else if(direction == 'S'){
                dir = 1;
            }else if(direction == 'N'){
                dir = 2;
            }else if(direction == 'E'){
                dir = 3;
            }

            x += dx[dir] * distance;
            y += dy[dir] * distance;
        }

        System.out.print(x + " " +y);
    }
}