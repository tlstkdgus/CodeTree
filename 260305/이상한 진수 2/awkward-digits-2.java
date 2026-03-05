import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        int max = 0;
        for(int i=0; i<a.length(); i++){
            char[] arr = a.toCharArray();
            if(arr[i] == '0'){
                arr[i] = '1';
            }else{
                arr[i] = '0';
            }

            int num = Integer.parseInt(new String(arr), 2);
            max = Math.max(max, num);
            
        }

        System.out.println(max);
    }
}