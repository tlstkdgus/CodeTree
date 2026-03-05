import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int sum =0;
        for(int i=0; i<str.length(); i++){
            for(int j=1; j<str.length(); j++){
                if(i<j && str.charAt(i) == '(' && str.charAt(j) == ')'){
                    sum++;
                }
            }
        }

        System.out.println(sum);

    }
}