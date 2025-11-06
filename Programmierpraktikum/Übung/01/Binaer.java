import java.util.Scanner;
import java.util.ArrayList;

public class Binaer {
    public static void main(String[] args) {

        //initieierung aller benötigter variablen
        String input;
        int i = 0;
        double num=0;
        double ergebniss=0;
        double dezimal = 0;
        boolean yn = true;0

        //Scanner und arrays werden definiert
        Scanner scn = new Scanner(System.in);
        ArrayList<Double> ez = new ArrayList<>();
        ez.add(1.0);ez.add(0.0);
        
        
        System.out.println("Gib eine Binaerzahl ein");
        input = scn.next();
        
        /*jedes element des string wird geteilt durch eine while schleife
          diese laueft so lange wie i kleiner der größe des strings ist */
        while (i < input.length()) {
            
            /*input wird von einem string erst in einen char getrennt und
             dieser in seinem asci code umgewandelt dieser wird in num gespeichrt*/
            num=input.charAt(i)-'0';
            
            //ueberprueft ob der input wirklich nur 0 oder 1 enthaelt
            if (!ez.contains(num)) {
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
        
        //gibt nur das ergebinissaus wenn es sich um eine binaere zahl handelt
        if (yn==true){
            System.out.println(input+" in binärschreibweise ist " + (int) ergebniss +" in dezimalschreibweise");
        }
        scn.close();
    }
}
