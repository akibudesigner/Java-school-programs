package DomaceNaloge;

import java.util.Scanner;

public class Metode {
    public static void vnesiNiz() {
        Scanner scanner = new Scanner(System.in);
        String niz = scanner.nextLine();
        scanner.close();

        preveri(niz);

        izpisKode(niz);
    }

    public static void izpisKode(String niz) {
        String kodirano = Koda.kodiraj(niz);
        System.out.println("Niz "+niz+" se je zakodiral v "+kodirano+" (Dekodirano: "+dekodiraj(kodirano)+")");
    }

    public static String dekodiraj(String niz) {
        String dekodirano = "";
        for (int i = 0; i < niz.length(); i += 2) {
            String koda = niz.substring(i,i+2);
            if(koda.charAt(0) == '0') {
                dekodirano += (char)(Character.getNumericValue(koda.charAt(1))+96);
            } else {
                dekodirano += (char)(Integer.valueOf(koda)+96);
            }
        }
        return dekodirano;
    }

    public static void preveri(String niz) {
        boolean izhod = false;
        for (int i = 0; i < niz.length(); i++) {
            if(niz.charAt(i) == ' ' || ((int)niz.charAt(i) >= 65 && (int)niz.charAt(i) <= 90)) {
                izhod = true;
            }
        }
        if(izhod) {
            System.out.println("Niz mora imeti samo angleske crke!");
            System.exit(0);
        }
    }
}
