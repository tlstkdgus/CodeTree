import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][n];
        for(int i=0; i<m; i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            arr[a][b] = 1;
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
            }
        }
    }
