package DomaceNaloge;

import java.util.Scanner;

public class Metode {
    public static void vnesiNiz() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosim, vnesite poljubni niz. (Vsebovati mora samo angleske crke, brez presledkov!");
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
            dekodirano += (char)(Integer.valueOf(koda)+96);
        }
        return dekodirano;
    }

    public static void preveri(String niz) {
        for (int i = 0; i < niz.length(); i++) {
            if(niz.charAt(i) == ' ' || ((int)Character.toLowerCase(niz.charAt(i)) < 97 || (int)Character.toLowerCase(niz.charAt(i)) > 122)) {
                System.out.println("Niz mora imeti samo angleske crke in brez presledkov!");
                System.exit(0);
            }
        }
    }
}
