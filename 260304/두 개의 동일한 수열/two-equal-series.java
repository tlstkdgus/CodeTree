import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
       int[] A = new int[n];
       int[] B = new int[n];

       for(int i=0; i<n; i++){
        A[i] = sc.nextInt();
       }
       for(int i=0; i<n; i++){
        B[i] = sc.nextInt();
       }

       Arrays.sort(A);
       Arrays.sort(B);

        System.out.println((check(A,B)? "Yes": "No"));
       
    }

    public static boolean check(int[] a, int[] b){
        for(int i=0; i<a.length; i++){
            if(a[i]!=b[i]){
                return false;
            }
       }
       return true;
    }
}