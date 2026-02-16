import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];
        for(int j=0; j<n; j++){
            for(int k=0; k<m; k++){
                arr1[j][k] = sc.nextInt();
            }
        }
        for(int j=0; j<n; j++){
            for(int k=0; k<m; k++){
                arr2[j][k] = sc.nextInt();
            }
        }

        for(int j=0; j<n; j++){
            for(int k=0; k<m; k++){
                if(arr1[j][k] != arr2[j][k]){
                    System.out.print(1 + " ");
                }else{
                    System.out.print(0 + " ");
                }                
            }
            System.out.println();
        }
    }
}