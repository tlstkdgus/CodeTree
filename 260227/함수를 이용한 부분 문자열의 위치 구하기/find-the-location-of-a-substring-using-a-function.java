import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String pattern = sc.next();
        
        int result = findIndex(text, pattern);
        System.out.println(result);
    }
    
    public static int findIndex(String text, String pattern) {
        for (int i = 0; i <= text.length() - pattern.length(); i++) {
            boolean found = true;
            
            for (int j = 0; j < pattern.length(); j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    found = false;
                    break;
                }
            }
            
            if (found) {
                return i;
            }
        }
        
        return -1;
    }
}