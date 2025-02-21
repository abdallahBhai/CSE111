package Assignment1;
import java.util.Arrays;
import java.util.Scanner;;
public class task5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("what is the length of the array do you want?");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("put a number");
            arr[i]=sc.nextInt();
         
        }
        System.out.println("The original array "+Arrays.toString(arr));   
        int left=0;
        int right=arr.length-1;
        int temp;
        while (left<right) {
            
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
        }
        System.out.println("The reversed array is: "+Arrays.toString(arr));
    }
}
