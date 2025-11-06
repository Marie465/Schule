import java.util.HashMap;
import java.util.Scanner;
class Eis {
    public static void main(String[] args) {
    	
       // Initialiesierung benötigter Variablen
        String sorte = "";
        int kugeln;
        String yn = "ja";
        int Insgesamt = 0;
        
        //Listen mit Information zu Vorhandenen Eissorten werden definiert arr eissorten arr1 kugel preis
        HashMap<String, Integer> sorten = new HashMap<>();
        Scanner scn = new Scanner(System.in);
        
        //Vorhandene Elemente werden geordnet der liste hinzugefügt bedeutet index 0 arr ist die eissorte und arr1 der preis in €  
        sorten.put("SCHOKO", 1);
        sorten.put("ERDBEER", 2);
        sorten.put("ZITRONE", 3);
        
        
        while (yn.toUpperCase().equals("JA")){
            
            System.out.println("Welches eis möchtest du?"+sorten.keySet());
            sorte = scn.next();
            
            if (sorten.containsKey(sorte.toUpperCase())){
            
                System.out.println("Wieviele kugeln möchtest du?");
                kugeln = scn.nextInt();
                int preis = kugeln * (int) sorten.get(sorte.toUpperCase());
                Insgesamt = Insgesamt + preis;
                System.out.println("Möchtest du noch mehr? [ja/fertig]");
                yn = scn.next();
            
                if(yn.toUpperCase().equals("FERTIG")){
                    System.out.println("Das wären Dann " + Insgesamt + "€");
                    break;
                    } 
            
            }
        
            else{
                System.out.println("Wir haben leider kein " + sorte +" Wir haben aber " + sorten.keySet() );
            }
        }
        scn.close();
    }
}     
