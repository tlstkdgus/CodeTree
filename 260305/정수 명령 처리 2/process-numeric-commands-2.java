import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<n; i++){
            String order = sc.next();
            if(order.equals("push")){
                int num = sc.nextInt();
                q.add(num);
            }else if(order.equals("pop")){
                System.out.println(q.poll());
            }else if(order.equals("size")){
                System.out.println(q.size());
            }else if(order.equals("empty")){
                System.out.println((q.isEmpty() ? 1 : 0));
            }else if(order.equals("front")){
                System.out.println(q.peek());
            }
        }
    }
}