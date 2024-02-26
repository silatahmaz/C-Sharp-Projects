
package bedenkitleindeksi;
import java.util.Scanner;
public class Bedenkitleindeksi {

    
    public static void main(String[] args) {
         Scanner kb=new Scanner(System.in);
         String sonuc="FF";
       System.out.println("Bu program notunuzun harf notunu gösterir");
       System.out.println("Lütfen notunuzu giriniz:");
       int a=kb.nextInt();
       if(a>=90)
       {
           sonuc="AA";
       }
       else if(a<90 && a>=80)
       {
           sonuc="BB";
       }
       else if(a<80 && a>=70)
       {
           sonuc="CC";
       }
       else if(a<70 && a>=60)
       {
           sonuc="DD";
       }
       else
       {
           System.out.println("Bu dersten kaldınız");
       }
       System.out.println("Harf notunuz "+sonuc);
    }
    
}
