/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.D;

import helden.framework.A.OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.C.I;
import helden.framework.D.H;
import helden.framework.D.oO0O;
import helden.framework.D.public;
import helden.framework.D.while;
import helden.framework.HeldenMath;
import helden.framework.OOoO.o00O;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.AbstraktBedingung;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.framework.d.oooo_1;
import helden.framework.held.Object.floatsuper;
import helden.framework.held.object.oooo_0;
import helden.framework.oooo.oo0o_0;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class P
extends while
implements Cloneable,
Comparable<Object> {
    public static final int \u00d6o\u00f8000 = 0;
    public static final int \u00d3\u00d2\u00f8000 = 1;
    public static final int \u00f5o\u00f8000 = 2;
    public static final int whilepublicclass = 3;
    public static final int o\u00d2\u00f8000 = 4;
    public static final int \u00f6O\u00f8000 = 5;
    public static final int \u00d5\u00d2\u00f8000 = 6;
    public static final int \u00f8o\u00f8000 = 7;
    public static final int ifpublicclass = 8;
    public static final int \u00d3O\u00f8000 = 9;
    public static final int \u00f6o\u00f8000 = 10;
    public static final int \u00d3o\u00f8000 = 11;
    public static final int \u00d2o\u00f8000 = 12;
    public static final int \u00d8o\u00f8000 = 13;
    private ArrayList<String> thisprivateclass;
    private String oo\u00f8000;
    private int \u00d6O\u00f8000;
    protected int \u00d5O\u00f8000;
    private PropertyChangeSupport newpublicclass;
    private int \u00d6\u00d2\u00f8000;
    private ArrayList<OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> \u00f8O\u00f8000;
    private String privatewhileclass;
    private ArrayList<helden.framework.OOoO.while<AbstraktBedingung, Integer>> \u00f5O\u00f8000;
    private BedingungsVerknuepfung \u00d2\u00d2\u00f8000;
    private List<H> \u00d8O\u00f8000;
    private List<Object> \u00d5o\u00f8000;
    private oo0o_0 returnpublicclass;
    private List<voidsuper> Stringprivateclass = new ArrayList<voidsuper>();

    public static P \u00d300000(String string, int n) {
        return new P(string, n, 0);
    }

    public static public o00000(String string, int n, H h2) {
        public public_ = new public(string, n, false);
        BedingungsVerknuepfung bedingungsVerknuepfung = new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000, Bedingung.hat(I.\u00f5\u00d60000), Bedingung.hat(while.\u00d8\u00d6\u00d5000));
        BedingungsVerknuepfung bedingungsVerknuepfung2 = new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.hat(I.forinterface), Bedingung.hat(while.o\u00f8\u00d4000), Bedingung.hat(voidsuper.o\u00d8\u00d6000, (Integer)(n * 3)));
        public_.o00000(new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.istMindestens(Bedingung.MagieLevel.o00000), new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000, bedingungsVerknuepfung, bedingungsVerknuepfung2)));
        public_.o00000(99);
        switch (n) {
            case 1: {
                public_.\u00d5O\u00f8000 = 300;
                break;
            }
            default: {
                public_.\u00d5O\u00f8000 = 100;
                bedingungsVerknuepfung2.addBedingung(Bedingung.hat(h2));
                bedingungsVerknuepfung.addBedingung(Bedingung.hat(h2));
            }
        }
        public_.o00000();
        return public_;
    }

    public static P if(String string, int n) {
        return new P(string, n, 8);
    }

    public static P \u00d400000(String string, int n) {
        return new P(string, n, 3);
    }

    public static P o00000(String string, int n) {
        return new P(string, n, 1);
    }

    public static P \u00f500000(String string, int n) {
        return new P(string, n, 11);
    }

    public static public o00000(String string, int n, boolean bl) {
        public public_ = new public(string, n, bl);
        public_.\u00f5o0000().addBedingung(Bedingung.istMindestens(Bedingung.MagieLevel.o00000));
        public_.\u00f5o0000().addBedingung(Bedingung.hatLkW(n * 3));
        for (int i2 = n; i2 < 8; ++i2) {
            int n2 = 0;
            if (i2 == 5) {
                n2 = -1;
            }
            if (i2 == 6) {
                n2 = -3;
            }
            if (i2 == 7) {
                n2 = -5;
            }
            if (n2 >= 0) continue;
            String string2 = "-- Grad: " + i2;
            if (i2 != n) {
                string2 = string2 + " (aufgestockt um Grad " + (i2 - n) + ")";
            }
            public_.o00000(public_.toString() + string2, 0, n2, 0, 0);
        }
        return public_;
    }

    public static P new(String string, int n) {
        return new P(string, n, 4);
    }

    public static P \u00f400000(String string, int n) {
        return new P(string, n, 13);
    }

    public static P \u00d500000(String string, int n) {
        return new P(string, n, 9);
    }

    public static oooo_1 o00000(String string, o00O o00O2) {
        return new oooo_1(string, o00O2);
    }

    public static P \u00d800000(String string, int n) {
        return new P(string, n, 2);
    }

    public static P \u00f800000(String string, int n) {
        return new P(string, n, 7);
    }

    public static P OO0000(String string, int n) {
        return new P(string, n, 5);
    }

    public static oO0O return(String string, int n) {
        oO0O oO0O2 = new oO0O(string, n, 12);
        return oO0O2;
    }

    public static H new(String string) {
        return new H(string);
    }

    protected P(int n, int n2) {
        this("", n, n2);
    }

    protected P(String string, int n, int n2) {
        this.o00000(string);
        this.\u00d6O\u00f8000 = n;
        this.\u00d5O\u00f8000 = n;
        this.\u00d6\u00d2\u00f8000 = n2;
        this.\u00d2\u00d2\u00f8000 = null;
        this.newpublicclass = new PropertyChangeSupport(this);
        this.\u00d8O\u00f8000 = new ArrayList<H>();
        this.\u00d5o\u00f8000 = new ArrayList<Object>();
        this.\u00f8O\u00f8000 = new ArrayList();
        this.\u00f5O\u00f8000 = new ArrayList();
        this.\u00d2\u00d2\u00f8000 = new BedingungsVerknuepfung(VerknuepfungsArt.o00000);
    }

    public void o00000(String string, int n, int n2, int n3, int n4) {
        OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = new OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO(string, n, true, n2, true, n3, true, "Verlust (Gesamt + Freie AP)", n4, true);
        this.\u00f8O\u00f8000.add(ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
    }

    public void new(PropertyChangeListener propertyChangeListener) {
        this.newpublicclass.addPropertyChangeListener(propertyChangeListener);
    }

    public void o00000(voidsuper voidsuper2) {
        this.Stringprivateclass.add(voidsuper2);
    }

    public void o00000(AbstraktBedingung abstraktBedingung, int n) {
        this.\u00f5O\u00f8000.add(new helden.framework.OOoO.while<AbstraktBedingung, Integer>(abstraktBedingung, new Integer(n)));
    }

    public void o00000(Object object) {
        this.\u00d5o\u00f8000.add(object);
    }

    public void o00000(H h2) {
        this.\u00d8O\u00f8000.add(h2);
    }

    public Object clone() throws CloneNotSupportedException {
        if (this.\u00f8O0000()) {
            throw new CloneNotSupportedException(this.oo\u00f8000);
        }
        P p2 = new P(this.oo\u00f8000, this.\u00d5O\u00f8000, this.\u00d6\u00d2\u00f8000);
        p2.o00000(this.\u00f5o0000());
        p2.\u00d8O\u00f8000 = this.O\u00d20000();
        p2.\u00d5o\u00f8000 = this.\u00d5\u00d20000();
        p2.returnpublicclass = this.\u00d5O0000();
        for (voidsuper voidsuper2 : this.Stringprivateclass) {
            p2.o00000(voidsuper2);
        }
        p2.\u00f8O\u00f8000 = new ArrayList<OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO>(this.\u00f8O\u00f8000);
        return p2;
    }

    @Override
    public int compareTo(Object object) {
        return this.toString().compareTo(object.toString());
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        return this.toString().equals(object.toString());
    }

    public boolean o00000(while while_) {
        if (while_ == null) {
            return false;
        }
        return this.toString().equals(while_.toString());
    }

    public ArrayList<OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> thissuper() {
        return this.\u00f8O\u00f8000;
    }

    public int \u00d400000() {
        return this.\u00d6\u00d2\u00f8000;
    }

    public String while() {
        switch (this.\u00d6\u00d2\u00f8000) {
            case 0: {
                return "";
            }
            case 1: {
                return "Gel\u00e4ndekunde";
            }
            case 2: {
                return "Kampf: Nahkampf";
            }
            case 3: {
                return "Kampf: Fernkampf";
            }
            case 4: {
                return "Magisch";
            }
            case 5: {
                return "Magisch: Repr\u00e4sentation";
            }
            case 6: {
                return "Magisch: Merkmalskenntnis";
            }
            case 7: {
                return "Magisch: Objektritual";
            }
            case 8: {
                return "Elfenlied";
            }
            case 9: {
                return "Kampf: Man\u00f6ver";
            }
            case 10: {
                return "Geweiht: Liturgie";
            }
            case 11: {
                return "Geweiht";
            }
            case 12: {
                return "Magisch: Schamanenritual";
            }
            case 13: {
                return "Magisch: Magische Lieder";
            }
        }
        return "Unbekannt (Art " + this.\u00d6\u00d2\u00f8000 + ")";
    }

    public BedingungsVerknuepfung \u00f5o0000() {
        return this.\u00d2\u00d2\u00f8000;
    }

    public List<voidsuper> oO0000() {
        return this.Stringprivateclass;
    }

    public int nullsuper() {
        Integer n = HeldenMath.durchFuenfzig(this.\u00d6O\u00f8000);
        if (n == 0 && this.\u00d6O\u00f8000 > 0) {
            n = 1;
        }
        return n;
    }

    public int o\u00d20000() {
        return this.\u00d6O\u00f8000;
    }

    public String \u00d3o0000() {
        StringBuffer stringBuffer = new StringBuffer(this.toString());
        stringBuffer.append(" (");
        stringBuffer.append(this.o\u00d20000());
        stringBuffer.append(" AP)");
        return stringBuffer.toString();
    }

    public String \u00d5o0000() {
        if (this.returnnew()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.\u00d4O0000());
            if (stringBuffer.length() > 0) {
                stringBuffer.append(": ");
            }
            stringBuffer.append(this.Stringsuper());
            return stringBuffer.toString();
        }
        return this.toString();
    }

    public String \u00f500000() {
        return this.oo\u00f8000;
    }

    public String \u00d4O0000() {
        if (this.oo\u00f8000.startsWith("Drui")) {
            return "Dolch";
        }
        if (this.oo\u00f8000.startsWith("Schale")) {
            return "Schale";
        }
        if (this.oo\u00f8000.startsWith("Schlange")) {
            return "Ring";
        }
        if (this.oo\u00f8000.startsWith("Schuppen")) {
            return "Schuppen";
        }
        if (this.oo\u00f8000.startsWith("Zauberzeichen")) {
            return "Zeichen";
        }
        if (this.oo\u00f8000.startsWith("Ritual")) {
            return "Ritual";
        }
        if (this.oo\u00f8000.startsWith("Runen")) {
            return "Runen";
        }
        if (this.oo\u00f8000.startsWith("Keulenritual")) {
            return "Keule";
        }
        if (this.oo\u00f8000.startsWith("Bannschwert")) {
            return "Bannschwert";
        }
        if (this.oo\u00f8000.startsWith("Gabe des Od")) {
            return "Od\u00fbn";
        }
        if (this.oo\u00f8000.startsWith("Trommelzauber")) {
            return "Trommel";
        }
        if (this.oo\u00f8000.startsWith("Kugel")) {
            return "Kugel";
        }
        if (this.oo\u00f8000.startsWith("Hexenfluch")) {
            return "Fluch";
        }
        if (this.oo\u00f8000.indexOf("zauber") < 0) {
            return "";
        }
        return this.oo\u00f8000.substring(0, this.oo\u00f8000.indexOf("zauber"));
    }

    public int newnew() {
        return this.\u00d5O\u00f8000;
    }

    public ArrayList<String> \u00d8o0000() {
        return this.thisprivateclass;
    }

    public int o00000(floatsuper floatsuper2) {
        if (this.\u00f5O\u00f8000.size() == 0) {
            return 99;
        }
        if (floatsuper2 == null) {
            int n = -99;
            for (helden.framework.OOoO.while<AbstraktBedingung, Integer> while_ : this.\u00f5O\u00f8000) {
                n = Math.max(n, while_.getWert2());
            }
            return n;
        }
        for (helden.framework.OOoO.while<AbstraktBedingung, Integer> while_ : this.\u00f5O\u00f8000) {
            if (while_.getWert1() != null && !floatsuper2.Object(while_.getWert1())) continue;
            return while_.getWert2();
        }
        return -1;
    }

    public ArrayList<helden.framework.OOoO.while<AbstraktBedingung, Integer>> forsuper() {
        return this.\u00f5O\u00f8000;
    }

    public List<Object> \u00d5\u00d20000() {
        return this.\u00d5o\u00f8000;
    }

    public List<H> O\u00d20000() {
        return this.\u00d8O\u00f8000;
    }

    public oo0o_0 \u00d5O0000() {
        return this.returnpublicclass;
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    public boolean \u00d300000(String string) {
        return this.toString().equals(string);
    }

    public boolean \u00f800000() {
        return this.\u00d6\u00d2\u00f8000 == 8;
    }

    public boolean \u00f4o0000() {
        return this.\u00d6\u00d2\u00f8000 == 3;
    }

    public boolean \u00d8O0000() {
        return this.toString().startsWith("Formel");
    }

    public boolean \u00f5O0000() {
        return this.\u00d6\u00d2\u00f8000 == 1;
    }

    public boolean return() {
        return this.toString().startsWith("Hexenfluch");
    }

    public boolean \u00f400000() {
        return this.\u00d6\u00d2\u00f8000 == 2 || this.\u00d6\u00d2\u00f8000 == 3 || this.\u00d6\u00d2\u00f8000 == 9;
    }

    public boolean \u00d300000() {
        return this.\u00d6\u00d2\u00f8000 == 10 || this.\u00d6\u00d2\u00f8000 == 11;
    }

    public boolean \u00d3O0000() {
        return this.\u00d6\u00d2\u00f8000 == 10;
    }

    public boolean \u00d500000() {
        return this.toString().startsWith("Liturgiekenntnis");
    }

    public boolean privatesuper() {
        return this.\u00d6\u00d2\u00f8000 == 4 || this.\u00d6\u00d2\u00f8000 == 8 || this.\u00d6\u00d2\u00f8000 == 13 || this.\u00d6\u00d2\u00f8000 == 6 || this.\u00d6\u00d2\u00f8000 == 5 || this.\u00d6\u00d2\u00f8000 == 7 || this.\u00d6\u00d2\u00f8000 == 12;
    }

    public boolean \u00f8o0000() {
        return this.\u00d6\u00d2\u00f8000 == 13;
    }

    public boolean \u00d4o0000() {
        return this.\u00d6\u00d2\u00f8000 == 9;
    }

    public boolean if() {
        return this.\u00d6\u00d2\u00f8000 == 6;
    }

    public boolean Oo0000() {
        return this.toString().startsWith("Merkmalskenntnis: Elementar (");
    }

    public boolean oo0000() {
        return this.\u00d6\u00d2\u00f8000 == 2;
    }

    public boolean OO0000() {
        return this.\u00d6\u00d2\u00f8000 == 7;
    }

    public boolean \u00f4O0000() {
        return this.\u00d6\u00d2\u00f8000 == 5;
    }

    public boolean returnnew() {
        return this.\u00d6\u00d2\u00f8000 == 7 || floatsuper.\u00d200000(this.\u00f5o0000()) && !(this instanceof public) || this.\u00d6\u00d2\u00f8000 == 12;
    }

    public boolean new() {
        return this.toString().startsWith("Ritualkenntnis: ");
    }

    public boolean \u00d4\u00d20000() {
        return this.toString().startsWith("Ritualkenntnis: ") && (this.toString().indexOf("Schamane") >= 0 || this.toString().indexOf("Schamanin") >= 0);
    }

    public boolean \u00f8O0000() {
        return false;
    }

    public boolean \u00d800000() {
        return this.o\u00d20000() < this.newnew();
    }

    public boolean \u00d3\u00d20000() {
        return this.oo0000() && this.toString().startsWith("Waffenloser Kampfstil:");
    }

    public void o00000(PropertyChangeListener propertyChangeListener) {
        this.newpublicclass.removePropertyChangeListener(propertyChangeListener);
    }

    @Override
    public void o00000() {
        this.\u00d6O\u00f8000 = this.\u00d5O\u00f8000;
        this.thisprivateclass = null;
    }

    public void o00000(BedingungsVerknuepfung bedingungsVerknuepfung) {
        this.\u00d2\u00d2\u00f8000 = bedingungsVerknuepfung;
    }

    public void new(int n) {
        this.o00000(n, "");
    }

    public void o00000(int n, String string) {
        int n2 = this.\u00d6O\u00f8000;
        this.\u00d6O\u00f8000 = n;
        this.newpublicclass.firePropertyChange("Kosten", n2, this.\u00d6O\u00f8000);
        if (this.thisprivateclass == null) {
            this.thisprivateclass = new ArrayList();
        }
        this.thisprivateclass.add(n2 + " => " + this.\u00d6O\u00f8000 + ": " + string);
    }

    public void o00000(int n) {
        if (this.\u00f5O\u00f8000.size() > 0) {
            oooo_0.\u00f500000("setVerbreitung wird mehrfach aufgerufen " + this.toString());
        }
        this.o00000(null, n);
    }

    public void o00000(ArrayList<helden.framework.OOoO.while<AbstraktBedingung, Integer>> arrayList) {
        this.\u00f5O\u00f8000 = arrayList;
    }

    public void o00000(oo0o_0 oo0o_02) {
        this.returnpublicclass = oo0o_02;
    }

    public String toString() {
        return this.privatewhileclass;
    }

    protected void o00000(String string) {
        this.oo\u00f8000 = string;
        this.privatewhileclass = string;
    }

    private String Stringsuper() {
        if (this.oo\u00f8000.indexOf(58) < 0) {
            return this.oo\u00f8000;
        }
        return this.oo\u00f8000.substring(this.oo\u00f8000.indexOf(58) + 2, this.oo\u00f8000.length());
    }
}

