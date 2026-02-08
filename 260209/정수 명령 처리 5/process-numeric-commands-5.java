import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            String cmd = sc.next();

            if(cmd.equals("push_back")){
                int value = sc.nextInt();
                list.add(value);
            }else if(cmd.equals("size")){
                System.out.println(list.size());
            }else if(cmd.equals("pop_back")){
                list.remove(list.size()-1);
            }else if(cmd.equals("get")){
                int idx = sc.nextInt();
                System.out.println(list.get(idx-1));
            }
        }
        sc.close();
        

    }
}