import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        radixSort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void radixSort(int[] arr){
        int max = getMax(arr);

        for(int exp=1; max/exp>0; exp*=10){
            count(arr,exp);
        }

    }

    public static int getMax(int[] arr){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void count(int[] arr, int exp){
        int n = arr.length;
        int[] output = new int[n];
        int[] cnt = new int[10];

        for(int i=0; i<n; i++){
            int digit = (arr[i]/exp) % 10;
            cnt[digit]++;
        }

        for(int i=1; i<10; i++){
            cnt[i] += cnt[i-1];
        }

        for(int i=n-1; i>=0; i--){
            int digit = (arr[i]/exp) % 10;
            output[cnt[digit]-1] = arr[i];
            cnt[digit]--;
        }

        for(int i=0; i<n; i++){
            arr[i] = output[i];
        }

    }
}