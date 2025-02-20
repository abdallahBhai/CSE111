import java.util.Scanner; 
public class task2 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Put the first num");

        int num1=scan.nextInt();
        System.out.println("Put the last num");

        
        int num2=scan.nextInt();
        
        int primeNum=0;
        for (int i = num1; i <= num2; i++) {
            int counter=0;
            for (int j = 1; j <= num2; j++) {
                if (i%j==0) {
                    counter++;
                }
            }
            if (counter==2) {
           primeNum++;
                
            }
        }
        System.out.println(primeNum);
    }
}
