import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][2];
        int[][] b = new int[m][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i][0] = sc.nextInt();
            b[i][1] = sc.nextInt();
        }
       
       int[] posA = new int[1000001];
       int[] posB = new int[1000001];

       int timeA = 1;

       for (int i = 0; i < n; i++) {
            int v = a[i][0];  
            int t = a[i][1];  
            
            for (int j = 0; j < t; j++) {
                posA[timeA] = posA[timeA - 1] + v;
                timeA++;
            }
        }
       int timeB = 1;
       for (int i = 0; i < m; i++) {
            int v = b[i][0];  
            int t = b[i][1];  
            
            for (int j = 0; j < t; j++) {
                posB[timeB] = posB[timeB - 1] + v;
                timeB++;
            }
        }   

        int maxTime = Math.max(timeA, timeB) -1;
        int changeCount = 0;
        int previousLeader = 0;

        for(int i=1; i<=maxTime; i++){
            int currentLeader;

            if(posA[i]>posB[i]){
                currentLeader = 1;
            }else if(posA[i]<posB[i]){
                currentLeader = 2;
            }else{
                currentLeader = 0;
            }

            if(previousLeader!=0 && currentLeader!= 0 && previousLeader!=currentLeader ){
                changeCount++;
            }

            if(currentLeader!=0){
                previousLeader = currentLeader;
            }
        }

        System.out.println(changeCount);

    }
}