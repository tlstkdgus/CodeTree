import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(num(n));
    }

    public static int num(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }

        return num(n/3) + num(n-1);
    }
}