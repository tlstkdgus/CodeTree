import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[10];
        int count = 0;
        for(int i=0; i<10; i++){
            arr[i] = sc.next();
            count += arr[i].length();
        }
        System.out.println(count);
    }
}