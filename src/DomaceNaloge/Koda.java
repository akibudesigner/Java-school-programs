package DomaceNaloge;

public class Koda {

    /* Naloga 14
    Napiši metodo kodiraj(niz), ki niz (ki vsebuje le črke angleške abecede) pretvori v niz tako, da vsako črko angleške abecede nadomesti z nizom,
    ki predstavlja zaporedno številko velike črke v angleški abecedi. 'A' in 'a' nadomestiti z "01" ter 'B' in 'b' z "02",…, 'Z' in 'z' s "26").
    Napiši tudi metodo dekodiraj(niz), ki zakodiran niz pretvori spet v prvotno obliko. Primer: Metoda kodiraj(niz) pretvori niz "ABCabc" v "010203010203",
    metoda dekodiraj(niz) pa ta niz pretvori ponovno v "abcabc". Pogoj: Napiši metodo vnesiNiz(), ki je tipa void in uporabnika prosi,
    če lahko vnese poljuben niz, ki bo zakodiran in metodo izpisKode(niz), ki izpiše novo nastalo kodo v obliki “Niz ABCabc se je zakodiral v 010203010203”.
    Metode dekodiraj(niz), izpisKode(niz) in vnseiNiz() obvezno napiši v nekem novem razredu.
     */

    public static void main(String[] args) {
        Metode.vnesiNiz();
    }

    public static String kodiraj(String niz) {
        String kodirano = "";
        int koda = 0;
        for (int i = 0; i < niz.length(); i++) {
            int ascii = niz.charAt(i);
            if(ascii >= 65 && ascii <= 90)
                koda = ascii-64;
            else if(ascii >= 97 && ascii <= 122)
                koda = ascii-96;
            kodirano += (koda >= 1 && koda <= 9 ? "0" : "")+String.valueOf(koda);
        }
        return kodirano;
    }
}
