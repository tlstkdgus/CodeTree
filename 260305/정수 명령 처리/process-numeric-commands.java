import java.util.Scanner;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> s = new Stack<>();

        for(int i=0; i<n; i++){
            String order = sc.next();
            if(order.equals("push")){
                int num = sc.nextInt();
                s.push(num);
            }else if (order.equals("size")){
                System.out.println(s.size());
            }else if(order.equals("empty") ){
                if(s.size() == 0){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }else if(order.equals("pop")){
                System.out.println(s.pop());
            }else if (order.equals("top")){
                System.out.println(s.peek());
            }

        }
    }
}