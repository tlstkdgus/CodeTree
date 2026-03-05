import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int total = ((A-11)*60*24 + B*60 + C) - 11*60 -11;
        if(total<0){
            System.out.println(-1);
        }else{
            System.out.println(total);
        }
        }
}