package Assignment1;
import java.util.Scanner;;
public class task4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("put your word");
        String word=sc.nextLine();
        String result="";
        for (int i = 0; i < word.length(); i++) {
            char c=word.charAt(i);
            result=result+ (char)(c-1);
        }
        System.out.println("your word has been changed to "+result);

    }
}
