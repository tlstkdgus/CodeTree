import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        int m = sc.nextInt();  
        
        int[] posA = new int[1000001];  
        int[] posB = new int[1000001];  
        
        int timeA = 1;  
        
        
        for (int i = 0; i < n; i++) {
            char dir = sc.next().charAt(0);
            int t = sc.nextInt();
            
            for (int j = 0; j < t; j++) {
                if (dir == 'R') {
                    posA[timeA] = posA[timeA - 1] + 1;
                } else {  
                    posA[timeA] = posA[timeA - 1] - 1;
                }
                timeA++;
            }
        }
        
        int timeB = 1;  
        
        for (int i = 0; i < m; i++) {
            char dir = sc.next().charAt(0);
            int t = sc.nextInt();
            
            for (int j = 0; j < t; j++) {
                if (dir == 'R') {
                    posB[timeB] = posB[timeB - 1] + 1;
                } else {  
                    posB[timeB] = posB[timeB - 1] - 1;
                }
                timeB++;
            }
        }
        
        int answer = -1;
        for (int i = 1; i < timeA && i < timeB; i++) {
            if (posA[i] == posB[i]) {
                answer = i;
                break;
            }
        }
        
        System.out.println(answer);
        sc.close();
    }
}