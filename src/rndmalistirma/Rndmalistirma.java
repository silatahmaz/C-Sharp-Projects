
package rndmalistirma;
import java.util.Random;

public class Rndmalistirma {

    
    public static void main(String[] args) {
        int i;
        int dices;
        int dice;
        int counter=0;
       Random rnd=new Random();
       System.out.println("Küp atılıyor...");
       for(i=0;i<50;i++){
           dices=rnd.nextInt(6);
           dices=dices+1;
           
           dice=rnd.nextInt(6);
           dice=dice+1;
          if(dices==6 && dice==6)
           counter++;
       }
       System.out.println("6x6 gelme ihtimali "+counter);
    }
    
}
