
import java.util.Scanner;

public class binarySearch{

    public static void BubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0;i < n - 1;i++){
            for(int j = 0;j < n - i - 1;j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
public static int BinarySearch(int[] arr,int target){
    int left = 0;
    int right = arr.length - 1;
    while(left <= right){
        int mid = left + (right - left) / 2;
        if(arr[mid] == target) return mid;
        else if(arr[mid] < target) left = mid + 1;
        else right = mid - 1;
    }
    return -1;
}

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter array size: ");
        System.out.print("\n");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = scan.nextInt();
        }
        System.out.print("Enter the target value: ");
        int target = scan.nextInt();
        BubbleSort(arr);
        int index = BinarySearch(arr , target);
        if(index == -1) System.out.println("Target Not found");
        else System.out.println(index);
        scan.close();
    }
}