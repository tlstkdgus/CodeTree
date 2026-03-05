import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        char[][] grid = new char[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }

        int answer = 0;

        for(int i=1; i<R; i++){
            for(int j=1; j<C; j++){
                for(int k = i+1; k<R-1; k++){
                    for(int q = j+1; q<C-1; q++){
                        if(grid[0][0]!= grid[i][j] && 
                        grid[i][j] != grid[k][q] && 
                        grid[k][q] !=grid[R-1][C-1]){
                            answer++;
                        }
                    }
                }
            }
        }
        System.out.println(answer);
    }
}