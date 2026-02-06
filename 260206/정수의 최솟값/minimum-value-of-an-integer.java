import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
    
        System.out.println(small(a,b,c));
    }

    public static int small(int a, int b, int c){
        int result = 0;
        if(a<=b && a<=c){
            result = a;
        }else if (b<=a && b<=c){
            result = b;
        }else if (c<=a && c<=b){
            result = c;
        }
        return result;
    }
}