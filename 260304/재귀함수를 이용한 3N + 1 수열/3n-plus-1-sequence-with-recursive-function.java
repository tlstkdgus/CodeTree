import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(code(n));
    }

    public static int code(int n) {
        if (n == 1) return 0; 

        if (n % 2 == 0) {
            return 1 + code(n / 2);      
        } else {
            return 1 + code(n * 3 + 1);  
    }
}
}