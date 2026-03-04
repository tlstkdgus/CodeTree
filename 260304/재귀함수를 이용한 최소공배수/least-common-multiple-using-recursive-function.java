import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println(lcm(n - 1, arr));
    }

    public static int lcm(int n, int[] arr) {
        if (n == 0) 
            return arr[0];  
        return lcmTwo(lcm(n - 1, arr), arr[n]);  
    }

    public static int lcmTwo(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static int gcd(int a, int b) {
        if (b == 0) 
            return a;
        return gcd(b, a % b);
    }
}