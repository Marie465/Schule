import java.util.Scanner;

/**
 * Führt eine ganzzahlige Division zweier eingegebener Zahlen (Dividend a und Divisor b)
 * ohne Verwendung der eingebauten Java-Operatoren '/' und '%' durch.
 * Es werden sowohl positive als auch negative Zahlen unterstützt, und die Division durch Null
 * wird behandelt.
 * Die Division wird durch wiederholte Subtraktion (implementiert als wiederholte Addition des Divisors
 * zur Zählung der Anzahl, wie oft er in den Dividenden passt) berechnet.
 *
 * @author Marie Papsdorf
 * @version 1.0
 * @since 2025-11-06
 */
class Division {

    public static void main(String[] args) {

    	int a; // Der Dividend
        boolean nulldivision = false; // Flag, falls a gleich 0 ist (wird für Rest-Behandlung benötigt)
        int b; // Der Divisor
        int i = 0; // Zähler für die Anzahl der Subtraktionen/Additionen (wird zum Quotienten)
        int rest = 0; // Der Rest der Division
        int division = 0; // Der Quotient der Division
        boolean negResult = false; // Flag, ob das Ergebnis negativ sein soll
        Scanner scn = new Scanner(System.in);

        System.out.println("gib erst a dann b ein");
      
        a = scn.nextInt();
        b = scn.nextInt();
        /**
         * Case a oder b == 0 behandlung
         */
        if(a==0){
            nulldivision=true;
            rest=0;
        }
        else if(b==0){
            System.out.println("durch null zu teilen ist nicht definiert");
        }
        
        /**
         * Vorzeichenbehandlung
         * Speichert das Vorzeichen des Ergebnisses und wandelt a und b in ihren positiven Wert um
         * für die Berechnung mittels wiederholter Subtraktion/Addition.
         */

        if (a < 0) {

            a = -a;
            if (b < 0) {

                b = -b;
            }else {

                negResult = true; // a negativ, b positiv -> Ergebnis negativ
        } 
        }
        else {
        	if(b<0) {
        		b = -b;
        		negResult = true; // a positiv, b negativ -> Ergebnis negativ
        	}
        }
        
        final int bf = b;
        
        /** Solange a (Dividend) größer oder gleich b (Divisor) ist,
         * wird b (Divisor) addiert, und der Zähler i erhöht.
         * Der Zähler i wird der Quotient.
         */ 

        if (a > b) {
        	
            while (a >= b) {

                b += bf;
                i++;
            }

            division = i;
            rest = a - (i*bf);

        } else if (a < b) {

            rest = b;
        } else {

            System.out.println("error");
        }
        //casehandling negatives ergebniss
        if (negResult == true) {

            division = -division;
            rest=-rest;
        }
        
        if (nulldivision==true){rest=0;}
      
        System.out.println("Division:"+division);
        System.out.println("Rest:"+rest);
        System.out.println("Division Vergleich:"+( Math.abs(division)==(a/bf)));
        System.out.println("Rest Vergleich:"+( Math.abs(rest)==(a%bf)));
        
        scn.close();
    }
}
