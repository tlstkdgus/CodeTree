import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean ee = false;
        boolean ab = false;

        for(int i=0; i<str.length()-1; i++){
            if(str.substring(i,i+2).equals("ee")){
                ee = true;
            }
            if(str.substring(i,i+2).equals("ab")){
                ab = true;
            } 
        }

        System.out.print(ee ? "Yes" : "No");
        System.out.print(" ");
        System.out.print(ab ? "Yes" : "No");
    }
}