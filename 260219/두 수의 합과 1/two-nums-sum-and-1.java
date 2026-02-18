import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        String ans = Integer.toString(sum);
        int count = 0;
        for(int i=0; i<ans.length();i++){
            if(ans.charAt(i) == '1'){
                count++;
            }
        }
        System.out.println(count);
    }
}