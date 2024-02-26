
package aboneprojesi;


public class Abone {
    public String isim;
    public int bakiye;
    
    public String sehir;
    
    public void doğalgazKullan(int miktar){
        if((this.bakiye-miktar)<0){
            System.out.println("Yeterli bakiyeniz yok");
            
        }
        else{
            this.bakiye= this.bakiye-miktar;
        }
        if(this.bakiye<=0){
            System.out.println("Bakiyeniz bitmiştir.Kredi limiti =120tl");
        }
        else{
            System.out.println("Yeni bakiye: "+bakiye);
        }
        
    }
    public void bakiyeOgren(){
        System.out.println("Bakiye: "+bakiye);
    }
}
