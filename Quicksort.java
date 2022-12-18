import java.util.*;


public class Quicksort {
 
    public static void main(String[] args) {
        final int Max_Data=50000;
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[Max_Data];
        int count;
        for(count=0;sc.hasNextInt();count++)
        {
            arr[count]=sc.nextInt();
        } 
        quickSort(arr, 0, count-1);
        //System.out.println(Arrays.toString(arr));
        for(int i=0;i<count;i++)
        {
            System.out.print(arr[i]+" ");
        }
       
        sc.close();
    }
 
    public static void quickSort(int[] arr, int start, int end){
 
        int partition = partition(arr, start, end);
 
        if(partition-1>start) {
            quickSort(arr, start, partition - 1);
        }
        if(partition+1<end) {
            quickSort(arr, partition + 1, end);
        }
    }
 
    public static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
 
        for(int i=start; i<end; i++){
            if(arr[i]<pivot){
                int temp= arr[start];
                arr[start]=arr[i];
                arr[i]=temp;
                start++;
            }
        }
 
        int temp = arr[start];
        arr[start] = pivot;
        arr[end] = temp;
 
        return start;
    }
    
}