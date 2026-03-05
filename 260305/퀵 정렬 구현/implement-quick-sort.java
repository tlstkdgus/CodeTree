import java.util.Scanner;

public class Main {
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        quickSort(0, n-1);
        
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void quickSort(int low, int high){
        if(low>= high) return;

        int pivot = partition(low, high);
        quickSort(low, pivot-1);
        quickSort(pivot+1, high);
    }

    static int partition(int low, int high){
        int pivot = arr[high];
        int i = low-1;

        for(int j = low; j<high; j++){
            if(arr[j] <= pivot){
                i++;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }

        int tmp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = tmp;

        return i+1;
    }
}