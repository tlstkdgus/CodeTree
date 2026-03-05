import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> dq = new ArrayDeque<>();
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            String order = sc.next();
            if(order.equals("push_front")){
                int num = sc.nextInt();
                dq.addFirst(num);
            }else if(order.equals("push_back")){
                int num = sc.nextInt();
                dq.addLast(num);
            }else if(order.equals("pop_front")){
                System.out.println(dq.pollFirst());
            }else if(order.equals("pop_back")){
                System.out.println(dq.pollLast());
            }else if(order.equals("size")){
                System.out.println(dq.size());
            }else if(order.equals("empty")){
                System.out.println((dq.isEmpty()? 1 : 0));
            }else if(order.equals("front")){
                System.out.println(dq.peekFirst());
            }else if(order.equals("back")){
                System.out.println(dq.peekLast());
            }
        }
    }
}