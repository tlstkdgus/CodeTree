import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(isMagicNumber(n)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        }

    public static boolean isMagicNumber(int n){
        if(n%2 !=0){
            return false;
        }

        int ten = n/10;
        int one = n%10;
        int sum = ten+one;
        return sum%5 ==0;
    }
}