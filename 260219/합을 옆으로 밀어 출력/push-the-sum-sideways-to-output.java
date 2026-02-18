import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0; i<n; i++){
            sum+= sc.nextInt();
        }
        String ans = Integer.toString(sum);
        if (ans== "0"){
            System.out.println(0);
        }else{
            String result = ans.substring(1)+ ans.charAt(0);
            System.out.print(result);
        }
        
    }
}