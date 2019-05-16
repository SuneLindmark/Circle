import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        int[] data;
        System.out.println("hur många observationer har du gjort?");
        int antal;
        Scanner tgb = new Scanner(System.in);
        antal = tgb.nextInt();
        data = new int[antal];
        
        System.out.println("Mata in dina värden:");
        for (int i = 0 ; i < antal ; i++) {
            data[i] = tgb.nextInt();
        }


    }
}