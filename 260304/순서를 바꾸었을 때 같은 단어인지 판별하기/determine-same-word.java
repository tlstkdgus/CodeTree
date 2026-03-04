import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        Arrays.sort(w1);
        Arrays.sort(w2);

        System.out.println((check(w1, w2)? "Yes" : "No"));

    }

    public static boolean check(char[] w1, char[] w2){
        if(w1.length != w2.length){
            return false;
        }
        for(int i=0; i< w1.length; i++){
            if(w1[i]!=w2[i]){
                return false;
                }
            }
        
        return true;
    }
}