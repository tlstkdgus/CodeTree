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

        mergeSort(0,n-1);

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int low, int high){
        if (low >= high) return;

        int mid = (low + high)/2;
        mergeSort(low, mid);
        mergeSort(mid+1, high);
        merge(low, mid, high);
    }

    public static void merge(int left, int mid, int right){
        int[] tmp = new int[right - left +1];
        int i = left;
        int j = mid+1;
        int k = 0;

        while(i<=mid && j<=right){
            if(arr[i]<=arr[j]){
                tmp[k] = arr[i];
                k++;
                i++;
            }else{
                tmp[k] = arr[j];
                k++;
                j++;
            }
        }
        while(i<=mid){
            tmp[k] = arr[i];
            k++;
            i++; 
        }
        while(j<=right){
            tmp[k] = arr[j];
            k++;
            j++;
        }

        for(int l=0; l<tmp.length; l++){
            arr[left+l] = tmp[l];
        }
    }
    
}