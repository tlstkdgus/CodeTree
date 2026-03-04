import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maximum(n, arr));
    }

    public static int maximum(int n, int[] arr) {
    if (n == 1) return arr[0];  
    return Math.max(arr[n-1], maximum(n-1, arr)); 
}
}