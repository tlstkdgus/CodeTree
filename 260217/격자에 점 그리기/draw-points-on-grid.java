import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][n];
        for(int i=0; i<m; i++){
            int r = sc.nextInt()-1;
            int c = sc.nextInt()-1;
            arr[r][c] = 1;
        }

        int num = 1;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j] == 1){
                    System.out.print(num + " ");
                    num++;
                }else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }   
    }
}