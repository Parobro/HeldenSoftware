/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.d;

import helden.framework.D.o0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.OoOO.G;
import java.util.ArrayList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from helden.framework.D.ooOO
 */
public final class oooo_2
extends o0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO {
    private static String[] \u00d300000 = new String[]{"#", "Amaunir", "Ashariel", "Ban'Bargui", "Bansumiter", "Baramunen", "G'Rolmur", "Hjaldinger (Myranor)", "Imperium", "Kentori", "Kynokephalen", "Leonir", "Loualil", "Lutraa", "Lyncil", "Minotauren", "Neristu", "Nyralische Babaren", "Pardir", "Ravesaran", "Risso", "Satyare", "Shingwa", "Shinoqi", "Tighrir", "Wolfalben", "Zwerge", "#Imperiale Gruppe", "Amazonen/Corybanten", "Anthalia", "Bestiare", "Cantera", "Centralis", "Corabenius", "Cranarenius", "Demelion", "Era'Sumu", "Gathiadda", "Gyldraland", "H\u00e6ldingard", "Harpalis", "Imperiale Ashariel", "Imperialisierte Neristu", "Karonios", "Koromanthia", "Kynokephalen", "Lakiadda", "Mayenios", "Narinion", "Ochobenius", "Ravesaran", "Rhacornos", "Sevantinius", "Serovia", "Tharpura", "Thyarkash", "Valantia", "Xarxaron", "#Bansumitische Gruppe", "Dralquabar", "Eshbathi", "Kerrishiter", "kerrishitische Yachjin", "Makshapuram", "Shindrabar", "Talaminas", "Te'Sumurru", "Tharpura", "Vinshina", "#Hjaldingsche Gruppe", "Cranarenius", "Gathiadda", "Gathonen", "Hjalbarden", "H\u00e6ldingard", "Lorthalion", "Serovia", "Utl\u00e4nder", "#Amaunische Gruppe", "Andramaunir", "Djamaunir", "Makshamaunir", "Makshapuram", "Nyamaunir", "S\u00f6ldner-Pardir", "Stadt-Amaunir", "Wald-Amaunir", "#Leonische Gruppe", "Arrhabasch", "Mhoronash", "Rhacornos", "Thyarkash", "#Pardische Gruppe", "Dschungel-Pardir", "Schneepardir", "S\u00f6ldner-Pardir", "#Kynokephalische Gruppe", "kerrishitische Yachjin", "Kynokephalen", "Myroskani", "Yachyach", "#Neristische Gruppe", "Imperialisierte Neristu", "Myralaar-Neristu", "Nerenith-Neristu", "#Ashariel-Gruppe", "Alamar-Ashariel", "Imperiale Ashariel", "#Satyarische Gruppe", "Bestiare", "Brasatauren", "Wilde Satyare", "#Wolfalbische Gruppe", "Seskira", "Skiresen", "Sqiraalingi", "Tkschoden", "#Rissotische Gruppe", "Risso'Ita", "Risso'Ma i Ti", "#", "Abishai", "Ban'Bargui", "Baramunen", "Drayd\u00e2lan", "G'Rolmur", "Kentori", "Loualil", "Lutraa", "Lyncil", "Minotauren", "Nequaner", "Nyralische Babaren", "Shingwa", "Shinoqi", "Tighrir", "Vesai", "Zwerge"};

    public static ArrayList<o0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> \u00d300000() {
        ArrayList<o0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> arrayList = new ArrayList<o0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO>();
        String string = "";
        for (String string2 : \u00d300000) {
            if (string2.startsWith("#")) {
                string = string2.substring(1);
                continue;
            }
            oooo_2 oooo_22 = new oooo_2(string2, string);
            if (arrayList.contains(oooo_22)) continue;
            arrayList.add(oooo_22);
        }
        return arrayList;
    }

    private static String new(String string, String string2) {
        String string3 = string2.isEmpty() ? string : string2 + ": " + string;
        return string3;
    }

    private static G[] o00000(String string, String string2) {
        if (string.equals("Amaunir") && string2.isEmpty()) {
            return new G[]{G.O\u00d2\u00f5000, G.thisclassclass};
        }
        if (string.equals("Ashariel") && string2.isEmpty()) {
            return new G[]{G.StringinterfaceString};
        }
        if (string.equals("Ban'Bargui") && string2.isEmpty()) {
            return new G[]{G.\u00f5\u00d6\u00f5000};
        }
        if (string.equals("Bansumiter") && string2.isEmpty()) {
            return new G[]{G.nullinterfaceString, G.ifwhileString, G.\u00d4\u00f8\u00f5000, G.O\u00f8\u00f5000, G.\u00f5\u00d3\u00f5000};
        }
        if (string.equals("Baramunen") && string2.isEmpty()) {
            return new G[]{G.forclassclass};
        }
        if (string.equals("G'Rolmur") && string2.isEmpty()) {
            return new G[]{G.\u00d80\u00f5000};
        }
        if (string.equals("Hjaldinger (Myranor)") && string2.isEmpty()) {
            return new G[]{G.o\u00f4\u00f5000};
        }
        if (string.equals("Imperium") && string2.isEmpty()) {
            return new G[]{G.o\u00d8\u00f5000, G.\u00d4\u00d6\u00f5000, G.o\u00f4\u00f5000, G.\u00f8\u00d6\u00f5000, G.\u00d3\u00f6\u00f5000, G.\u00d3\u00d5\u00f5000};
        }
        if (string.equals("Kentori") && string2.isEmpty()) {
            return new G[]{G.\u00f8\u00d6\u00f5000};
        }
        if (string.equals("Kynokephalen") && string2.isEmpty()) {
            return new G[]{G.\u00f5\u00f5\u00f5000};
        }
        if (string.equals("Leonir") && string2.isEmpty()) {
            return new G[]{G.\u00d3\u00f6\u00f4000};
        }
        if (string.equals("Loualil") && string2.isEmpty()) {
            return new G[]{G.\u00f8\u00d5\u00f5000};
        }
        if (string.equals("Lutraa") && string2.isEmpty()) {
            return new G[]{G.\u00f4\u00d5\u00f5000};
        }
        if (string.equals("Lyncil") && string2.isEmpty()) {
            return new G[]{G.\u00d4\u00f5\u00f5000};
        }
        if (string.equals("Minotauren") && string2.isEmpty()) {
            return new G[]{G.fordoString};
        }
        if (string.equals("Neristu") && string2.isEmpty()) {
            return new G[]{G.\u00f4O\u00f5000};
        }
        if (string.equals("Nyralische Babaren") && string2.isEmpty()) {
            return new G[]{G.forsuperclass, G.\u00d4\u00d6\u00f5000};
        }
        if (string.equals("Pardir") && string2.isEmpty()) {
            return new G[]{G.\u00f40\u00f5000};
        }
        if (string.equals("Ravesaran") && string2.isEmpty()) {
            return new G[]{G.\u00d3\u00d5\u00f5000};
        }
        if (string.equals("Risso") && string2.isEmpty()) {
            return new G[]{G.\u00f5\u00f8\u00f5000};
        }
        if (string.equals("Satyare") && string2.isEmpty()) {
            return new G[]{G.fordoString};
        }
        if (string.equals("Shingwa") && string2.isEmpty()) {
            return new G[]{G.\u00d8o\u00f5000};
        }
        if (string.equals("Shinoqi") && string2.isEmpty()) {
            return new G[]{G.whilethisclass};
        }
        if (string.equals("Tighrir") && string2.isEmpty()) {
            return new G[]{G.\u00f5o\u00f5000};
        }
        if (string.equals("Wolfalben") && string2.isEmpty()) {
            return new G[]{G.forinterfaceString};
        }
        if (string.equals("Zwerge") && string2.isEmpty()) {
            return new G[]{G.\u00f40\u00f6000};
        }
        return new G[]{G.privatesuperclass};
    }

    private oooo_2(String string, String string2) {
        super(oooo_2.new(string, string2), oooo_2.o00000(string, string2));
    }
}

