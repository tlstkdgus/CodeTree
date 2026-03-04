import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(num(n));
    }

    public static int num(int n){
        if(n<=0) return 0;
        if(n==1){
            return 2;
        }
        if(n==2){
            return 4;
        }

        return num(n-1) * num(n-2) % 100;
    }
}