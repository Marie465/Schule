import java.util.ArrayList;
import java.util.Scanner;

class Zeichenkette {
    public static void main(String[] args) {

        String satz;
        String satz1;
        int i = 0;
        int a = 1;
        String ergebniss = "";

        ArrayList<String> Vokale = new ArrayList<>();
        ArrayList<String> Satz = new ArrayList<>();
        Scanner scn = new Scanner(System.in);

        Vokale.add("a");
        Vokale.add("e");
        Vokale.add("i");
        Vokale.add("o");
        Vokale.add("u");

        System.out.println("Gib einen satz ein:");
        System.out.println("");
        satz = scn.nextLine();

        while (i < satz.length()) {
            if (!Vokale.contains(("" + satz.charAt(i)).toLowerCase())) {
                Satz.add("" + satz.charAt(i));
            }
            i++;
        }

        i = 0;

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

        Satz.removeAll(Satz);

        ergebniss = "";

        while (ende != true) {

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
