package Assignment1;

import java.util.Scanner;


public class task1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sum=0;
        int min=999999;
        int max=-999999;
        int counter=0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Write a number");
            int num=sc.nextInt();
            if (num>0&&num%2!=0) {
                sum+=num;
                counter++;
                
                if (num>max) {
                    max=num;
                }
                if (num<min) {
                    min=num;
                }
            }

        }
        int avg=sum/counter;

       System.out.println("Sum of the number are "+sum); 
       System.out.println("The minimum number is "+min); 
       System.out.println("The maximum number is "+max); 
       System.out.println("Avg of the number are "+avg); 
        
    }
    
}
