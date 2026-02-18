import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int ans1 = extractNum(str1);
        int ans2 = extractNum(str2);
        System.out.println(ans1 + ans2);
        
    }

    public static int extractNum(String str){
        String ans = "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch>='0' && ch<='9'){
                ans+= ch;
            }else{
                break;
            }
        }

        return(Integer.parseInt(ans));
    }
}