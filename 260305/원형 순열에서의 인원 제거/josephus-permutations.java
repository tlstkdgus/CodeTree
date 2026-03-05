import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=1; i<=n; i++){
            q.add(i);
        }

        while(q.size()!=1){
            for(int i=1; i<k; i++){
                q.add(q.peek());
                q.poll();
            }
            System.out.print(q.poll()+ " ");
        }
        System.out.print(q.poll());

    }
}