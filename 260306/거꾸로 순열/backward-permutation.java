import java.util.Scanner;
public class Main {

    static int n;
    static boolean[] visited;
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        visited = new boolean[n+1];
        recur(0);
    }

    public static void recur(int depth){
        if(depth==n){
            for(int i=0; i<n; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for(int i=n; i>0; i--){
            if(!visited[i]){
                visited[i] = true;
                arr[depth] = i;
                recur(depth+1);
                visited[i] = false;
            }
        }
    }
}