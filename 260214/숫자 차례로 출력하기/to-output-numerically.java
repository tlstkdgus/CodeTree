import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ascending(n);
        System.out.println();
        descending(n);
    }

    public static void ascending(int n){
        if (n==0){
            return;
        }

        ascending(n-1);
        System.out.print(n+" ");

    }

    public static void descending(int n){
        if (n==0){
            return;
        }
        System.out.print(n+" ");
        descending(n-1);
    }
}