import java.util.ArrayList;
import java.util.Scanner;
import java.util.LinkedList;
class Eis {
    public static void main(String[] args) {
    	
       // Initialiesierung benötigter Variablen
        String sorte = "";
        int kugeln;
        String yn = "ja";
        int Insgesamt = 0;
        
        //Listen mit Information zu Vorhandenen Eissorten werden definiert arr eissorten arr1 kugel preis
        ArrayList arr = new ArrayList();
        LinkedList arr1 = new LinkedList();
        
        Scanner scn = new Scanner(System.in);
        
        //Vorhandene Elemente werden geordnet der liste hinzugefügt bedeutet index 0 arr ist die eissorte und arr1 der preis in €  
        arr.add("SCHOKO"); arr.add("ERDBEER"); arr.add("ZITRONE");
        arr1.add(1); arr1.add(2); arr1.add(3);
        
        
        while (yn.toUpperCase().equals("JA")){
            
            System.out.println("Welches eis möchtest du? [Erdbeer, Schocko, Zitrone]");
            sorte = scn.next();
            
            if (arr.contains(sorte.toUpperCase())){
            
                System.out.println("Wieviele kugeln möchtest du?");
                kugeln = scn.nextInt();
                int preis = kugeln * (int) arr1.get(arr.indexOf(sorte.toUpperCase()));
                Insgesamt = Insgesamt + preis;
                System.out.println("Möchtest du noch mehr? [ja/fertig]");
                yn = scn.next();
            
                if(yn.toUpperCase().equals("FERTIG")){
                    System.out.println("Das wären Dann " + Insgesamt + "€");
                    break;
                    } 
            
            }
        
            else{
                System.out.println("Wir haben leider kein " + sorte +" Wir haben aber " + arr.get(0) + ", " + arr.get(1)+" oder "+ arr.get(2));
            }
        }
        scn.close();
    }
}     
