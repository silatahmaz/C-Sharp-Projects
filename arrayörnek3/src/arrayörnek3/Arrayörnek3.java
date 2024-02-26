package arrayörnek3;
import java.util.Scanner;
public class Arrayörnek3 {

    public static void main(String[] args) {
       Scanner kb=new Scanner(System.in);
       int i;
       int b=0;
       boolean test=true;
       
       System.out.println("Bu program girilen array in simetrik olup olmadığını test eder");
       System.out.println("Kaç elemanlı bir dizi girmek istiyorsunuz");
       int a=kb.nextInt();
       int[] x=new int[a];
       System.out.println("Lütfen diziyi giriniz:");
       for(i=0;i<a;i++)
       {
           x[i]=kb.nextInt();
       }
       
       for(i=a-1;i>0;i--)
       {
           if(x[i]==x[0+b])
           {
               b++;
           } 
           else {
               test=false;
               break;
           }
         
       }
       if(test)
       {
           System.out.println("Bu dizi simetriktir");
       }
       else
       {
           System.out.println("Bu dizi simetrik değildir");
       }
    }
    
}
