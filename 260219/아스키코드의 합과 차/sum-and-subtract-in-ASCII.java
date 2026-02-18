import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);
        
        int sum = (int)c1 + (int)c2;
        int sub = (int)c1 - (int)c2;
        if (sub < 0) {
            sub *= -1;
        }
        System.out.print(sum + " " + sub);
    }
}