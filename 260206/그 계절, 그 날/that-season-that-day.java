import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        if(isS(y,m,d)){
            if(m>=3 && m<=5){
                System.out.println("Spring");
            }else if(m>=6 && m<=8){
                System.out.println("Summer");
            }else if(m>=9 && m<=11){
                System.out.println("Fall");
            }else if(m == 12 || m == 1 || m == 2){
                System.out.println("Winter");
            }
        }else{
            System.out.println("-1");
        }

    }

    public static boolean isS(int y, int m, int d){
        if(m>12 || m<1){
            return false;
        }

        int[] md;
        if(isY(y)){
            md = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        }else{
            md = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        }

        if(d>md[m]){
            return false;
        }

        return true;

        
    }

    public static boolean isY(int y){
        if(y%400 == 0){
            return true;
        }

        if(y%100 == 0){
            return false;
        }
        
        if(y%4 == 0){
            return true;
        }

        return false;
    }
}