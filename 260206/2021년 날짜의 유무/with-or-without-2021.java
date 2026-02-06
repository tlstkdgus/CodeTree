import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        
        if(isR(m,d)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    public static boolean isR(int m, int d){
        if(m<1 || m>12){
            return false;
        }

        if(d<1){
            return false;
        }

        int[] dM = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if(d>dM[m]){
            return false;
        }

        return true;
    }
}