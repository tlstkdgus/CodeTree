import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int num = a*b*c;
        System.out.println(multiple(num));
    }

    public static int multiple(int num){
        if(num==0){
            return 0;
        }
        return multiple(num/10) + (num%10);
    }
}