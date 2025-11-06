import java.util.Scanner;
import java.util.ArrayList;
/**
 * Binaer
 * Konvertiert eine als String eingegebene binäre Zahl in ihre entsprechende
 * Dezimalzahl. Die Klasse prüft die Eingabe auf Gültigkeit (nur '0' und '1')
 * und verwendet die Potenzreihe zur Berechnung der Dezimaldarstellung.
 *
 * @author Marie Papsdorf
 * @version 1.0
 * @since 2025-11-06
 */
public class Binaer {
    public static void main(String[] args) {

    	String input; // Die eingegebene Binärzahl als String
        int i = 0; // Zählvariable/Index für die Schleife
        double num = 0; // Temporäre Variable zur Speicherung des aktuellen Bits (0 oder 1)
        double ergebniss = 0; // Die kumulierte Dezimalzahl (Endergebnis)
        double dezimal = 0; // Der Dezimalwert des aktuell verarbeiteten Bits
        boolean yn = true; // Flag zur Gültigkeitsprüfung der Eingabe (true, solange nur 0/1 enthalten sind)

        Scanner scn = new Scanner(System.in);
        
        // Liste zur einfachen Überprüfung, ob der aktuelle Wert 1.0 oder 0.0 ist
        ArrayList<Double> binaer = new ArrayList<>();
        binaer.add(1.0);binaer.add(0.0);
        
        
        System.out.println("Gib eine Binaerzahl ein");
        input = scn.next();
        
        /*jedes element des string wird geteilt durch eine while schleife
          diese laueft so lange wie i kleiner der größe des strings ist */
        while (i < input.length()) {
            
            /*input wird von einem string erst in einen char getrennt und
             dieser in seinem asci code umgewandelt dieser wird in num gespeichrt*/
            num=input.charAt(i)-'0';
            
            //ueberprueft ob der input wirklich nur 0 oder 1 enthaelt
            if (!binaer.contains(num)) {
                yn = false;
                System.out.println("bitte gib nur null oder eins ein");
                break;
            }
            //wenn nur 0 und 1 enthalten sind wird die binaere zahl umgerechnet 
            else{
                dezimal = num * (Math.pow(2, input.length() - i - 1));
                ergebniss += dezimal;
            }
            i++;
        }
        
        //gibt nur das ergebiniss aus wenn es sich um eine binaere zahl handelt
        if (yn==true){
            System.out.println(input+" in binärschreibweise ist " + (int) ergebniss +" in dezimalschreibweise");
        }
        scn.close();
    }
}
