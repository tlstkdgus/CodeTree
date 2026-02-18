import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[]{"apple", "banana", "grape", "blueberry","orange"};
        
        int count = 0;
        String str = sc.next();
        for(int i=0; i<arr.length; i++){
            if(str.charAt(0) == arr[i].charAt(2) || str.charAt(0) == arr[i].charAt(3)){
                System.out.println(arr[i]);
                count++;
            }
        }
        System.out.println(count);
    }
}