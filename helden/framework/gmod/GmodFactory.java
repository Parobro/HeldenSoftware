/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.gmod;

import helden.framework.gmod.GMod;
import helden.framework.gmod.GModAtome;
import helden.framework.gmod.GModAuswahlen;
import helden.framework.gmod.impl.EigenschaftenSpaltenVerschiebung;
import helden.framework.gmod.impl.MerkmalSpaltenVerschiebung;
import helden.framework.gmod.impl.TalenteSpaltenVerschiebung;
import helden.framework.gmod.impl.ZauberSpaltenVerschiebung;
import helden.framework.held.object.oooo_0;
import java.util.ArrayList;
import java.util.HashMap;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class GmodFactory {
    private static boolean super = false;
    private static HashMap<String, ArrayList<GMod>> \u00d300000;
    private static ArrayList<GMod> \u00d200000;

    public static void addToHash(String string, ArrayList<GMod> arrayList) {
        \u00d300000.put(string, arrayList);
        \u00d200000.addAll(arrayList);
    }

    public static ArrayList<GMod> getEigenschaften() {
        ArrayList<GMod> arrayList = new ArrayList<GMod>();
        arrayList.add(new EigenschaftenSpaltenVerschiebung());
        return arrayList;
    }

    public static GMod getGmodName(String string) {
        for (GMod gMod : GmodFactory.getGMods()) {
            if (!gMod.getName().toString().equalsIgnoreCase(string)) continue;
            try {
                return (GMod)gMod.clone();
            }
            catch (CloneNotSupportedException cloneNotSupportedException) {
                oooo_0.\u00f500000("Kann GMOD nicht clonen: " + string);
                return null;
            }
        }
        oooo_0.\u00f500000("Kann GmodType " + string + " nicht finden!");
        return null;
    }

    public static ArrayList<GMod> getGMods() {
        if (!super) {
            GmodFactory.init();
        }
        return \u00d200000;
    }

    public static HashMap<String, ArrayList<GMod>> getGModsProKategorie() {
        if (!super) {
            GmodFactory.init();
        }
        return \u00d300000;
    }

    public static GModAuswahlen getKategorien(String string, int n, int n2) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i2 = n; i2 <= n2; ++i2) {
            if (i2 == 0) continue;
            arrayList.add(i2);
        }
        return new GModAuswahlen<Integer>(string, arrayList){

            public GModAtome<Integer> o00000(Integer n) {
                String string = "" + Math.abs(n);
                string = string + " Spalte";
                if (Math.abs(n) != 1) {
                    string = string + "n";
                }
                string = n < 0 ? string + " billger" : string + " teurer";
                return new GModAtome<Integer>(string, n);
            }
        };
    }

    public static GModAuswahlen<Integer> getStufen(String string, final String string2, Integer n, Integer n2, Integer n3) {
        Integer n4;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int n5 = 0;
        while ((n4 = Integer.valueOf(n + n3 * n5)) <= n2) {
            arrayList.add(n4);
            ++n5;
        }
        return new GModAuswahlen<Integer>(string, arrayList){

            public GModAtome<Integer> new(Integer n) {
                return new GModAtome<Integer>(String.format(string2, n), n);
            }
        };
    }

    public static ArrayList<GMod> getTalente() {
        ArrayList<GMod> arrayList = new ArrayList<GMod>();
        arrayList.add(new TalenteSpaltenVerschiebung());
        return arrayList;
    }

    public static ArrayList<GMod> getZauber() {
        ArrayList<GMod> arrayList = new ArrayList<GMod>();
        arrayList.add(new ZauberSpaltenVerschiebung());
        arrayList.add(new MerkmalSpaltenVerschiebung());
        return arrayList;
    }

    public static void init() {
        \u00d200000 = new ArrayList();
        \u00d300000 = new HashMap();
        GmodFactory.addToHash("Eigenschaften", GmodFactory.getEigenschaften());
        GmodFactory.addToHash("Talente", GmodFactory.getTalente());
        GmodFactory.addToHash("Zauber", GmodFactory.getZauber());
        super = true;
    }

    public static <T> GModAuswahlen<T> obj2Atome(String string, ArrayList<T> arrayList) {
        return new GModAuswahlen<T>(string, arrayList);
    }

    private GmodFactory() {
    }
}

