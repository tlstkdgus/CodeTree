import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int count = 0;
        for(int i=a; i<=b; i++){
            if(isS(i)){
                count++;
            }
        }

        System.out.println(count);
    }

    public static boolean isS(int N){
        if(N < 2){
            return false;
        }
        
        for(int i=2; i<N; i++){  
            if(N % i == 0){
                return false;
            }
        }
        
        int sum = 0;
        int temp = N;
        while(temp > 0){
            sum += temp % 10;
            temp /= 10;
        }
        
        if(sum % 2 != 0){
            return false;
        }
        
        return true;
    }
}