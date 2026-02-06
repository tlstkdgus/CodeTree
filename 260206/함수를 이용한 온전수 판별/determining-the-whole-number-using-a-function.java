import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
    
        int count = 0;
        for(int i=A; i<=B; i++){
            if(isOnjunsu(i)){
                count++;
            }
        }
        System.out.println(count);

    }

    public static boolean isOnjunsu(int N){

        if(N%2 == 0){
            return false;
        }
        if(N%10 == 5){
            return false;
        }
        if(N%3 == 0 && N%9 !=0){
            return false;
        }

        return true;
    }
}