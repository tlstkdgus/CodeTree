import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        
        for(int i=0; i<n-1; i++){
            for(int k=0; k<n-1-i; k++){
                if(arr[k]>arr[k+1]){
                    int tmp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = tmp;
                }
            }
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}