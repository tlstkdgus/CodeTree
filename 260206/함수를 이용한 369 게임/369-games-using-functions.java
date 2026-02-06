import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(countNumbers(A,B));
    }

    public static int countNumbers(int A, int B){
        int count = 0;
        for(int i = A; i<=B ; i++){
            if(isThird(i)){
                count++;
            }
        }
        return count;
    }
    public static boolean isThird(int N){

        if(N%3 ==0){
            return true;
        }
        while(N>0){
            int one = N%10;
            if(one == 3 || one == 6 || one == 9){
                return true;
            }
            N/=10;
        }
        return false;
    }

}