import java.util.*;
public class ReverseArray {
    public static int Reverarr(int[] arr){
        int start =0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
        return start;
    }

    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        Reverarr(arr);
        System.out.println(Arrays.toString(arr));

    }
}
