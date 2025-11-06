import java.util.Scanner;

class Division {

    public static void main(String[] args) {

        int a;
        boolean nulldivision=false;
        int b;
        int i = 0;
        int rest = 0;
        int division = 0;
        boolean negResult = false;
        Scanner scn = new Scanner(System.in);

        System.out.println("gib erst a dann b ein");
      
        a = scn.nextInt();
        b = scn.nextInt();

        if(a==0){
            nulldivision=true;
            rest=0;
        }
        else if(b==0){
            System.out.println("durch null zu teilen ist nicht definiert");
        }

        if (a < 0) {

            a = -a;
            if (b < 0) {

                b = -b;
            }else {

                negResult = true;
        } 
        }
        else {
        	if(b<0) {
        		b = -b;
        		negResult = true;
        	}
        }
        
        final int bf = b;

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
