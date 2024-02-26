
package armstrongsayi;
import java.util.Scanner;

public class Armstrongsayi {

   
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int toplam=0;
        int c;
        int gecicisayi1;
      System.out.println("Bu program girilen sayının armstrong sayısı olup olmadığını hesaplar");
      System.out.println("Lütfen sayıyı giriniz");
      int a=kb.nextInt();
      System.out.println("Lütfen basamak sayısını giriniz:");
      int b=kb.nextInt();
      int gecicisayi=a;
      do{
        gecicisayi1=gecicisayi%10;
        toplam=(int) (toplam+Math.pow(gecicisayi1, b));
       gecicisayi=gecicisayi/10;
        
      } while(gecicisayi>0);
      if(toplam==a)
      {
          System.out.println("Bu sayı bir armstrong sayısıdır");
      }
      else{
          System.out.println("Bu sayı bir armstrong sayısı değildir");
      }
}
}