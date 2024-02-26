
package loops;
import java.util.Scanner;
public class Loops {

   
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int i=0;
        int max;
        int b=1;
        System.out.println("This program displays the maximum of the given  integers");
        System.out.println("Enter 0 for exit");
        int a=kb.nextInt();
        max=a;
        while(b!=0)
        {
        b=kb.nextInt();
        if(b>100)
        {
            System.out.println("The grade must be between 0-100");
            continue;
        }
        
        if(b>max)
        {
            max=b;
        }
        }
        System.out.println("The maximum value is "+max);
    }
}
