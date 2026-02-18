import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[10];
        for(int i=0; i<10; i++){
            arr[i] = sc.next();
        }
        String answer = sc.next();
        int count = 0;
        for(int i=0; i<10; i++){
            if(arr[i].charAt(arr[i].length()-1) == answer.charAt(0)){
                System.out.println(arr[i]);
                count++;
            }
        }
        if(count == 0){
            System.out.println("None");
        }
    }
}