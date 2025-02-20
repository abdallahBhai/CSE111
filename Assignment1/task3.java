package Assignment1;
import java.util.Scanner;
public class task3 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Put your first word");

    String firstWord=sc.nextLine();
    System.out.println("Put your last word");
    String lastWord=sc.nextLine();
    String word= firstWord+" "+ lastWord;
    // int num=word(int);
    int sum=0;
    for (int i = 0; i < word.length(); i++) {
        sum+=(int)word.charAt(i);
    }
    System.out.println(word);
    System.out.println(sum);

}                                     
}
