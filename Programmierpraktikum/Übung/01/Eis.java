/**
 * Programm welches den benutzer nach eissorte und anzahl an kugeln fragt
 * und den endpreis berechnet und ausgibt
 *
 * @author Marie Papsdorf
 * @version 1.0
 * @since 2025-11-06
 */

import java.util.HashMap;
import java.util.Scanner;
class Eis {
    public static void main(String[] args) {
    
        String sorte = "";
        int kugeln;
        String yn = "ja";
        int Insgesamt = 0;
        
        HashMap<String, Integer> sorten = new HashMap<>();
        Scanner scn = new Scanner(System.in);
        
        sorten.put("SCHOKO", 1);
        sorten.put("ERDBEER", 2);
        sorten.put("ZITRONE", 3);
        
        
        while (yn.toUpperCase().equals("JA")){
        /**
         * @param
         * die eissorte wird abgefragt und und mit möglichen abgeglichen    
         */
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
            /**
             * @return wenn eissorte nicht bekannt ist werden vorhandene sorten angegeben
             */

            else{
                System.out.println("Wir haben leider kein " + sorte +" Wir haben aber " + sorten.keySet() );
            }
        }
        scn.close();
    }
}     
