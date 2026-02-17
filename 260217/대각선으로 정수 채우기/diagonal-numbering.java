import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        int num = 1; 
        for(int i=0; i<n+m-1 ; i++){
            int r, c; 
            if(i<m){
                r = 0;
                c = i;
            }else{
                r = i-m+1;
                c = m-1;
            }

            while(r<n && c>=0){
              arr[r][c] = num++;
              r++;
              c--; 
            }

        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }   
    }
}