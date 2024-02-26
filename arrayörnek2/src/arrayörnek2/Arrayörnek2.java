package arrayörnek2;
import java.util.Scanner;
public class Arrayörnek2 {
    public static void main(String[] args) {
       Scanner kb=new Scanner(System.in);
      int i;
       System.out.println("Kaç elemanlı bir dizi girmek istiyorsunuz");
       int n=kb.nextInt();
       int[] array=new int[n];
       int[] Y= new int[100];
       int j=0;
       System.out.println("Lütfen diziyi giriniz:");
       for(i=0;i<n;i++)
       {
           array[i]=kb.nextInt();
       }
       System.out.println("Arrayiniz:");
       for(i=0;i<n;i++)
       {
           System.out.println(array[i]);
       }
       System.out.println("Array de 2 ye bölünen değerler");
       for(i=0;i<n;i++)
       {
           if(array[i]%2==0)
           {
               Y[j]=array[i];
               j++;
           }
       }
       for(j=0;j<n;j++){if(Y[j]==0)
               break;
           System.out.println(Y[j]);
       }
    }
}
