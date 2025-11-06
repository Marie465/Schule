import java.util.ArrayList;
import java.util.Scanner;
	/**
	 * Führt zwei verschiedene Operationen zur String-Manipulation durch:
	 * 1. Entfernt alle Vokale aus einem eingegebenen Satz.
	 * 2. Zerlegt einen zweiten eingegebenen Satz iterativ, indem in jedem Schritt
	 * die erste Hälfte des aktuellen Strings ausgegeben wird, bis der String nur noch
	 * ein Zeichen enthält.
	 *
	 * @author Marie Papsdorf
	 * @version 1.0
	 * @since 2025-11-06
	 */
class Zeichenkette {
    public static void main(String[] args) {

    	String satz; // Der erste eingegebene Satz
        String satz1; // Der zweite eingegebene Satz für die Halbierungs-Operation
        int i = 0; // Allgemeine Zählvariable (Index)
        int a = 1; // Zähler für die Schritte der Halbierungs-Operation
        String ergebniss = ""; // Speichert das Ergebnis (ohne Vokale) oder die aktuelle Teilzeichenkette

        ArrayList<String> Vokale = new ArrayList<>();// Liste der Vokale (a, e, i, o, u)
        ArrayList<String> Satz = new ArrayList<>();// Temporäre Liste zur Speicherung der Nicht-Vokale oder der ersten Hälfte
        Scanner scn = new Scanner(System.in);

        Vokale.add("a");
        Vokale.add("e");
        Vokale.add("i");
        Vokale.add("o");
        Vokale.add("u");

        System.out.println("Gib einen satz ein:");
        System.out.println("");
        satz = scn.nextLine();
        /**
         * --- Operation 1 ---
         * Iteriert durch den ersten Satz und fügt alle Zeichen, die keine Vokale
         * (unabhängig von der Groß-/Kleinschreibung) sind, der Liste 'Satz' hinzu.
         */

        while (i < satz.length()) {
            if (!Vokale.contains(("" + satz.charAt(i)).toLowerCase())) {
                Satz.add("" + satz.charAt(i));
            }
            i++;
        }

        i = 0;
        
        /**
         * Führt die Zeichen aus der Liste 'Satz' (die Nicht-Vokale) zu einem String zusammen.
         */

        while (i < Satz.size()) {
            ergebniss += "" + Satz.get(i);
            i++;
        }
        System.out.println(ergebniss);
        System.out.println("");
        System.out.println("Gib einen weiteren satz ein:");
        System.out.println("");
        satz1 = scn.nextLine();

        i = 0;

        boolean ende = false;
        /**
         * --- Operation 2: Iterative Halbierung des zweiten Satzes ---
         * löscht den vorherigen temporär gespeicherten satz für den neuen halbierten
         * 
         * Zerlegt den zweiten Satz iterativ, indem in jedem Schritt die erste Hälfte
         * des aktuellen Strings ermittelt, ausgegeben und als Basis für den nächsten
         * Schritt verwendet wird
         */

        Satz.removeAll(Satz);

        ergebniss = "";

        while (ende != true) {
        	/**
        	 * überprüft ob der satz nicht nur ein leerer string ist und halbiert ihn daraufhin 
        	 * wenn nur noch ein leerer string da ist wird die schleife beendet
        	 */

            if (satz1.length() > 1) {

                while (i < Math.round((satz1.length() / 2.0))) {
                    Satz.add("" + satz1.charAt(i));
                    ergebniss += "" + Satz.get(i);
                    i++;
                }

                Satz.removeAll(Satz);
                System.out.println(a + "." + ergebniss);
                i = 0;
                satz1 = ergebniss;
                ergebniss = "";
                a++;
            } else {
                ende = true;
            }
        }
        scn.close();
    }
}
