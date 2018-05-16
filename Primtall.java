import static javax.swing.JOptionPane.*;
import java.lang.Math.*;
import java.util.ArrayList;

class Primtall {
    public static void main(String[] args) {
        String[] muligheter = {"Finn faktorer", "Avslutt"};
        boolean nyttTall = true;
        do {
            int valg = showOptionDialog(null, "Hva \u00f8nsker du \u00e5 gj\u00f8re?" , "Primtallsfaktorisering", DEFAULT_OPTION, PLAIN_MESSAGE, null, muligheter, muligheter[0]);
            if (valg == 0) {
                finnFaktorer();
            } else {
                nyttTall = false;
            }
        } while (nyttTall);
    }

    public static void finnFaktorer() {
        int tall = 5;
        ArrayList<Integer> faktorer = new ArrayList<>();
        try {
            tall = Integer.parseInt(showInputDialog("Skriv inn heltallet du \u00f8nsker \u00e5 faktorisere"));
        } catch (Exception ex) {
            showMessageDialog(null, ex);
            return;
        }
        faktorer = faktoriser(tall);
        showMessageDialog(null, faktorer);
    }

    public static ArrayList<Integer> faktoriser(int tall) {
        ArrayList<Integer> faktorer = new ArrayList<>();
        ArrayList<Integer> primtall = new ArrayList<>();
        primtall = hentPrimtall((int) Math.ceil(tall / 2));
        boolean ikkeEn = tall != 1;

        if (primtall.size() > 0) {
            while (ikkeEn) {
                boolean ikkeEndret = true;
                for (int verdi : primtall) {
                    if (tall % verdi == 0) {
                        faktorer.add(verdi);
                        tall = (int) (tall / verdi);
                        ikkeEn = tall != 1;
                        ikkeEndret = false;
                        break;
                    }
                }
                if (ikkeEndret) {
                    faktorer.add(tall);
                    ikkeEn = false;
                }
            }
        }
        return faktorer;
    }

    public static ArrayList<Integer> hentPrimtall(int tall) {
        ArrayList<Integer> liste = new ArrayList<>();
        liste.add(2);
        if (tall > 2) {
            for (int i = 2; i < tall; i++) {
                boolean erPrimtall = true;
                for (int primtall : liste) {
                    if (i % primtall == 0) {
                        erPrimtall = false;
                        break;
                    }
                }
                if (erPrimtall) {
                    liste.add(i);
                }
                if (i % 10000 == 0) {
                    System.out.println(i);
                }
            }
        }
        return liste;
    }
}
