
package firstrecurringcharacter;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class FirstRecurringCharacter {

   
    public static void main(String[] args) {
       Scanner kb=new Scanner(System.in);
       int i;
       System.out.println("Please enter the numbers of element you want to enter:");
       int a=kb.nextInt();
       int[] arr=new int[a];
       System.out.println("Please enter the elements of an array:");
       for(i=0;i<a;i++){
           arr[i]=kb.nextInt();
       }
       int result=findFirstDuplicate(arr);
       if(result!=-1){
           System.out.println("The first recurring character is: "+result);
       }
       else{
           System.out.println("The first recurring element is cannot find");
       }
}

   public static int findFirstDuplicate(int[] arr){
       int i,j;
       for(i=0;i<arr.length-1;i++){
           for(j=i+1;j<arr.length;j++){
               if(arr[i]==arr[j]){
                   return arr[i];
               }
           }
       }
       return -1;
   }


}

    
    

