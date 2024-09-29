
import java.util.Arrays;
import java.util.Scanner;


public class ArraySort {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int Arr[] = new int[n];
       for(int i = 0; i < n; i++){
           Arr[i] = sc.nextInt();
       }
       Arrays.sort(Arr);
       System.out.println(Arrays.toString(Arr));
    }
}
