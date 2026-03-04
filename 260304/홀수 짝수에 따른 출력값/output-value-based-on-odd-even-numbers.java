import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }

    public static int sum(int n) {
        if (n <= 0) return 0;  // 종료조건

        if (n % 2 == 1) {
            return n + sum(n - 2);
        } else {
            return n + sum(n - 2);
        }
    }
}
