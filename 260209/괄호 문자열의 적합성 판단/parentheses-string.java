import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        Stack<Character> stack = new Stack<>();
        boolean isOk = true;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == '('){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    isOk= false;
                    break;
                }

                char open = stack.pop();

                if(ch==')' && open!='('){
                    isOk= false;
                    break;
                }
            }
        }

        int result = (isOk&& stack.isEmpty()) ? 1: 0;

        if(result == 1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

            
    }


}