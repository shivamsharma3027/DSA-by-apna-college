// package Backtracking;

//  import java.util.Arrays;

public class Arrays {
    public static void change(int[] arr,int i)
    {
        //System.out.println(i);
        if(i==arr.length-1)
        {
            arr[i]=i+1;
            arr[i]=arr[i]-2;
            return;
        }
        arr[i]=i+1;
        change(arr, i+1);
        arr[i]=arr[i]-2;
       // System.out.println(arr[i+1]);
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        change(arr, 0);
       System.out.println(Arrays.toString(arr));
    }
}
