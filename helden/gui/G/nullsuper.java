/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.G;

import helden.framework.C.I;
import helden.framework.C.Oo0O;
import helden.framework.D.while;
import helden.framework.Einstellungen;
import helden.framework.held.K;
import helden.framework.held.Object.O0OO;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.int.OooO;
import helden.framework.int.String;
import helden.gui.G.B;
import helden.gui.G.B.Object;
import helden.gui.G.D;
import helden.gui.G.M;
import helden.gui.G.O0oO;
import helden.gui.G.P;
import helden.gui.G.Q;
import helden.gui.G.String.C;
import helden.gui.G.V;
import helden.gui.G.i;
import helden.gui.G.ifsuper;
import helden.gui.G.int;
import helden.gui.G.j;
import helden.gui.G.ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.A;
import helden.gui.G.public;
import helden.gui.G.super;
import helden.gui.G.whilesuper;
import helden.gui.g.l_0;
import helden.gui.g.oooo_3;
import helden.model.profession.Lehrmeister;
import helden.model.profession.Magier;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class nullsuper {
    private static final int \u00d3o0000 = 1;
    private static final int \u00f8o0000 = 2;
    private static final int \u00f800000 = 3;
    private static final int \u00d200000 = 4;
    private static final int \u00f6o0000 = 5;
    private static final int oo0000 = 6;
    private static final int \u00f5O0000 = 7;
    private static final int String = 8;
    private static final int \u00f8O0000 = 9;
    private static final int \u00d8o0000 = 10;
    private static final int ifsuper = 11;
    private static final int \u00f5o0000 = 12;
    private static final int \u00f500000 = 13;
    private static final int o00000 = 14;
    private static final int \u00d6O0000 = 15;
    private static final int oO0000 = 16;
    private static final int for = 17;
    private static final int \u00d6o0000 = 19;
    private static final int \u00f6O0000 = 20;
    private static final int \u00d600000 = 21;
    private static final int \u00d3O0000 = 22;
    private static final int newsuper = 23;
    private static final int \u00d5o0000 = 24;
    private static final int \u00d300000 = 25;
    private static final int \u00d2O0000 = 26;
    private static final int \u00d2o0000 = 27;
    private int \u00d5O0000;
    private int \u00d8O0000;
    private int null;
    private Integer[] whilesuper;
    private Integer[] \u00f600000;
    private D \u00d800000;
    private O0OO \u00d500000;
    private HashMap<String, Integer> private;
    private HashMap<Integer, String> returnsuper;

    public nullsuper(O0OO o0OO2, boolean bl) {
        this.\u00d500000 = o0OO2;
        if (bl) {
            this.\u00d8O0000 = 5;
            o0OO2.o00000((Boolean)true);
        } else {
            this.\u00d8O0000 = 1;
            o0OO2.o00000((Boolean)false);
        }
        this.\u00f800000();
        Einstellungen.getInstance().resetFehler();
        this.\u00d200000(this.\u00d8O0000);
    }

    public boolean class() {
        this.\u00d200000(this.\u00d8O0000);
        while (this.\u00d800000 != null && this.super().\u00d400000() && !Einstellungen.getInstance().isFehler()) {
            if (!this.super(this.\u00d5O0000, true)) {
                this.\u00d800000.class();
            }
            this.\u00d300000();
        }
        return this.\u00d5O0000 == 25;
    }

    public boolean \u00d200000(String string) {
        Integer n = this.super(string);
        if (this.\u00d5O0000 != n && this.super().\u00d400000() && !Einstellungen.getInstance().isFehler()) {
            this.\u00d200000(n);
            while (!this.int()) {
                this.\u00d800000.class();
                this.\u00d300000();
            }
            return true;
        }
        return false;
    }

    public boolean \u00d400000() {
        return this.\u00d5O0000 != this.\u00d8O0000;
    }

    public D super() {
        return this.\u00d800000;
    }

    public String \u00f600000() {
        return this.super(this.\u00d5O0000);
    }

    public boolean int() {
        return this.super(this.\u00d5O0000, this.\u00d500000.\u00f8O0000());
    }

    public boolean super(Integer n, boolean bl) {
        K k2 = this.\u00d500000.\u00d800000();
        Oo0O oo0O = this.\u00d500000.\u00d800000().\u00d500000();
        switch (n) {
            case 5: {
                return true;
            }
            case 9: {
                if (!bl) {
                    return false;
                }
                return this.\u00d500000.\u00d800000().\u00f800000().hatMehrSprachenAuswahl();
            }
            case 27: {
                if (!bl) {
                    return false;
                }
                return this.\u00d500000.\u00d800000().\u00d4O0000().hatMehrSprachenAuswahl();
            }
            case 4: {
                if (!bl) {
                    return false;
                }
                return this.\u00d500000.\u00d800000().\u00d4O0000() == null || !this.\u00d500000.\u00d800000().\u00d4O0000().toString().equals("Professionslos");
            }
            case 3: {
                if (!bl) {
                    return false;
                }
                return this.\u00d500000.\u00d800000().\u00f800000() == null || !this.\u00d500000.\u00d800000().\u00f800000().toString().equals("Kulturlos");
            }
            case 2: {
                if (!bl) {
                    return false;
                }
                return this.\u00d500000.\u00d800000().o\u00d20000() == null || !this.\u00d500000.\u00d800000().o\u00d20000().toString().equals("Rassenlos");
            }
            case 22: {
                if (!bl) {
                    return false;
                }
                if (k2.o\u00d20000() == null) {
                    return false;
                }
                k2.o\u00d20000().ueberpruefeAufEinzelVariante();
                return k2.o\u00d20000().hatVariantenAuswahl();
            }
            case 23: {
                if (!bl) {
                    return false;
                }
                if (this.\u00d500000.oo0000() == null) {
                    return false;
                }
                this.\u00d500000.oo0000().ueberpruefeAufEinzelVariante();
                return this.\u00d500000.oo0000().hatVariantenAuswahl();
            }
            case 24: {
                if (!bl) {
                    return false;
                }
                if (k2.\u00f800000() == null) {
                    return false;
                }
                this.\u00f400000().\u00f800000().ueberpruefeAufEinzelVariante();
                return this.\u00f400000().\u00f800000().hatVariantenAuswahl();
            }
            case 13: {
                if (!bl) {
                    return false;
                }
                return k2.o00000(I.O\u00f60000);
            }
            case 14: {
                if (!bl) {
                    return false;
                }
                if (k2.o00000(I.O\u00f60000) && this.\u00d500000.newsuper() != null) {
                    this.\u00d500000.newsuper().ueberpruefeAufEinzelVariante();
                }
                return k2.o00000(I.O\u00f60000) && this.\u00d500000.newsuper() != null && this.\u00d500000.newsuper().hatVariantenAuswahl();
            }
            case 12: {
                return k2.oo0000();
            }
            case 21: {
                return k2.o00000(I.forsupersuper) || k2.o00000(I.\u00f5\u00d8o000);
            }
            case 19: {
                return false;
            }
            case 8: {
                return true;
            }
            case 10: {
                return oo0O.\u00d400000(I.newreturn);
            }
            case 16: {
                return k2.\u00d800000().hatProfession(Magier.class) != null || k2.\u00d800000().hatProfession(Lehrmeister.class) != null;
            }
            case 17: {
                return k2.\u00d800000().Object(String._o.\u00d800000).size() > 0;
            }
            case 26: {
                return k2.new(while.o\u00d4\u00d4000.toString()) || k2.new(while.\u00d6\u00d8\u00d8000.toString());
            }
        }
        return true;
    }

    public boolean \u00d600000() {
        return this.super((Integer)this.\u00d5O0000);
    }

    public boolean super(Integer n) {
        return n == 15;
    }

    public void \u00f800000() {
        this.whilesuper = new Integer[28];
        this.\u00f600000 = new Integer[28];
        this.whilesuper[1] = 5;
        this.whilesuper[5] = 2;
        this.whilesuper[2] = 22;
        this.whilesuper[22] = 3;
        this.whilesuper[3] = 24;
        this.whilesuper[24] = 9;
        this.whilesuper[9] = 4;
        this.whilesuper[4] = 23;
        this.whilesuper[23] = 27;
        this.whilesuper[27] = 13;
        this.whilesuper[13] = 14;
        this.whilesuper[14] = 6;
        this.whilesuper[6] = 7;
        this.whilesuper[7] = 8;
        this.whilesuper[8] = 26;
        this.whilesuper[26] = 16;
        this.whilesuper[16] = 17;
        this.whilesuper[17] = 11;
        this.whilesuper[11] = 20;
        this.whilesuper[20] = 19;
        this.whilesuper[19] = 10;
        this.whilesuper[10] = 12;
        this.whilesuper[12] = 21;
        this.whilesuper[21] = 15;
        this.whilesuper[15] = 25;
        for (int i2 = 0; i2 < this.whilesuper.length; ++i2) {
            Integer object = i2;
            Integer n = this.whilesuper[i2];
            if (object == null || n == null) continue;
            this.\u00f600000[n.intValue()] = object;
        }
        this.null = this.\u00d8O0000;
        this.private = new HashMap();
        this.returnsuper = new HashMap();
        this.private.put("Info", 1);
        this.private.put("Geschlecht/Setting", 5);
        this.private.put("Rasse", 2);
        this.private.put("Kultur", 3);
        this.private.put("Profession", 4);
        this.private.put("Eigenschaften", 6);
        this.private.put("Vor- und Nachteile", 7);
        this.private.put("Sonderfertigkeiten", 8);
        this.private.put("Kultur Sprachwahl", 9);
        this.private.put("Talentspezialisierungen", 20);
        this.private.put("Zauberspezialisierungen", 21);
        this.private.put("Profession Sprachwahl", 27);
        this.private.put("Talente", 11);
        this.private.put("Zauber", 12);
        this.private.put("Person", 15);
        this.private.put("Breitgef\u00e4cherte Bildung", 13);
        this.private.put("BGB Professionsvariante", 14);
        this.private.put("Leittalente", 10);
        this.private.put("Mirakelauswahl", 19);
        this.private.put("Kulturvariante", 24);
        this.private.put("Professionsvariante", 23);
        this.private.put("Rassenvariante", 22);
        this.private.put("Sp\u00e4tweihe", 26);
        this.private.put("Magische Weiterbildung (1)", 16);
        this.private.put("Magische Weiterbildung (2)", 17);
        for (Map.Entry<String, Integer> entry : this.private.entrySet()) {
            this.returnsuper.put(entry.getValue(), entry.getKey());
        }
    }

    public void \u00d800000() {
        this.null = 25;
    }

    public void super(JList jList) {
        DefaultListModel defaultListModel = (DefaultListModel)jList.getModel();
        defaultListModel.clear();
        int n = this.\u00d8O0000;
        while (true) {
            if (this.super(n, this.\u00d500000.\u00f8O0000())) {
                defaultListModel.addElement(this.super(n));
            }
            if (this.super((Integer)n) || n == this.null) break;
            n = this.whilesuper[n];
        }
        jList.setSelectedValue(this.super(this.\u00d5O0000), true);
    }

    public void \u00d300000() {
        if (this.super().\u00d400000() && !Einstellungen.getInstance().isFehler()) {
            do {
                Integer n = this.\u00d5O0000;
                this.\u00d5O0000 = this.whilesuper[this.\u00d5O0000];
                if (n == this.null) {
                    this.null = this.\u00d5O0000;
                }
                this.\u00d200000(this.\u00d5O0000);
                if (this.int()) continue;
                this.\u00d800000.class();
            } while (!this.int());
        }
    }

    public void \u00d200000() {
        if (this.super().\u00d400000() && !Einstellungen.getInstance().isFehler()) {
            do {
                this.\u00d5O0000 = this.\u00f600000[this.\u00d5O0000];
                this.\u00d200000(this.\u00d5O0000);
                if (this.int()) continue;
                this.\u00d800000.class();
            } while (!this.int());
        }
    }

    protected OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO \u00f400000() {
        return this.\u00d800000.\u00d300000();
    }

    private Integer super(String string) {
        return this.private.get(string);
    }

    private String super(int n) {
        String string = this.returnsuper.get(n);
        if (string == null) {
            string = "???";
        }
        return string;
    }

    private void \u00d200000(int n) {
        this.\u00d5O0000 = n;
        switch (n) {
            case 5: {
                this.\u00d800000 = new public(this.\u00d500000);
                break;
            }
            case 2: {
                this.\u00d800000 = new i(this.\u00d500000);
                break;
            }
            case 1: {
                this.\u00d800000 = new l_0(this.\u00d500000);
                break;
            }
            case 3: {
                this.\u00d800000 = new M(this.\u00d500000);
                break;
            }
            case 4: {
                this.\u00d800000 = new int(this.\u00d500000, 0);
                break;
            }
            case 13: {
                this.\u00d800000 = new int(this.\u00d500000, 1);
                break;
            }
            case 14: {
                this.\u00d800000 = new P(this.\u00d500000, this.\u00d500000.newsuper());
                break;
            }
            case 6: {
                this.\u00d800000 = new j(this.\u00d500000);
                break;
            }
            case 7: {
                this.\u00d800000 = new V(this.\u00d500000);
                break;
            }
            case 8: {
                this.\u00d800000 = new C(this.\u00d500000, true);
                break;
            }
            case 20: {
                this.\u00d800000 = new A(this.\u00d500000, true, false);
                break;
            }
            case 21: {
                this.\u00d800000 = new A(this.\u00d500000, false, true);
                break;
            }
            case 11: {
                this.\u00d800000 = new Q(this.\u00d500000);
                break;
            }
            case 12: {
                this.\u00d800000 = new Object(this.\u00d500000);
                break;
            }
            case 15: {
                this.\u00d800000 = new ifsuper(this.\u00d500000);
                break;
            }
            case 10: {
                this.\u00d800000 = new B(this.\u00d500000);
                break;
            }
            case 19: {
                this.\u00d800000 = new super(this.\u00d500000);
                break;
            }
            case 24: {
                OooO oooO2 = this.\u00f400000().\u00f800000();
                this.\u00d800000 = new P(this.\u00d500000, oooO2);
                break;
            }
            case 23: {
                this.\u00d800000 = new P(this.\u00d500000, this.\u00d500000.oo0000());
                break;
            }
            case 22: {
                this.\u00d800000 = new P(this.\u00d500000, this.\u00f400000().o\u00d20000());
                break;
            }
            case 26: {
                this.\u00d800000 = new O0oO(this.\u00d500000);
                break;
            }
            case 25: {
                this.\u00d800000 = null;
                break;
            }
            case 16: {
                this.\u00d800000 = new whilesuper(this.\u00d500000, 0);
                break;
            }
            case 17: {
                this.\u00d800000 = new whilesuper(this.\u00d500000, 1);
                break;
            }
            case 9: {
                this.\u00d800000 = new oooo_3(this.\u00d500000, this.\u00d500000.\u00d800000().\u00f800000());
                break;
            }
            case 27: {
                this.\u00d800000 = new oooo_3(this.\u00d500000, this.\u00d500000.\u00d800000().\u00d4O0000());
                break;
            }
            default: {
                this.\u00d800000 = null;
            }
        }
    }
}

