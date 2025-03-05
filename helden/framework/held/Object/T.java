/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.Object;

import helden.framework.C.I;
import helden.framework.C.M;
import helden.framework.D.F;
import helden.framework.D.H;
import helden.framework.D.J;
import helden.framework.D.OOOo;
import helden.framework.D.OoOO.U;
import helden.framework.D.OoOO.V;
import helden.framework.D.OoOO.privatesuper;
import helden.framework.D.OoOO.whilesuper;
import helden.framework.D.P;
import helden.framework.D.Q;
import helden.framework.D.for;
import helden.framework.D.public;
import helden.framework.D.void;
import helden.framework.D.while;
import helden.framework.HeldenMath;
import helden.framework.OOoO.A;
import helden.framework.OOoO.B;
import helden.framework.OOoO.OoOoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.OOoO.R;
import helden.framework.OOoO.o0Oo;
import helden.framework.OoOO.D;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.AbstraktBedingung;
import helden.framework.bedingungen.Bedingung;
import helden.framework.d.oooo_0;
import helden.framework.d.oooo_3;
import helden.framework.held.K;
import helden.framework.held.Object.floatsuper;
import helden.framework.held.Object.private;
import helden.framework.int.do;
import helden.framework.oooo.o0oo_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.oooo.s_0;
import helden.framework.settings.Setting;
import helden.framework.settings.Settings;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import helden.gui.erschaffung.werkzeug.HEW2SF;
import java.util.ArrayList;
import java.util.HashMap;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class T {
    private floatsuper o00000;
    private K \u00d200000;
    private boolean \u00d800000;
    private HEW2SF \u00d300000;
    private ArrayList<String> \u00d500000;
    private HashMap<String, D> \u00d600000;
    private boolean String = false;

    public static OOOo o00000(Setting setting) {
        Settings settings = Settings.getSettingsBySetting(setting);
        OOOo oOOo = new OOOo();
        for (P p2 : oooo_0.Object()) {
            if (!settings.contains(p2) || p2.\u00f8O0000()) continue;
            oOOo.o00000(p2);
        }
        return oOOo;
    }

    public T(K k2, boolean bl) {
        this.\u00d200000 = k2;
        this.\u00d800000 = bl;
        this.\u00d500000 = new ArrayList();
        this.\u00d600000 = new HashMap();
        this.o00000 = new floatsuper(k2);
    }

    public T(K k2, boolean bl, HEW2SF hEW2SF) {
        this(k2, bl);
        this.\u00d300000 = hEW2SF;
    }

    public void \u00d300000(P p2) {
        if (!this.\u00d500000.contains(J.super(p2))) {
            this.\u00d500000.add(J.super(p2));
        }
    }

    public boolean \u00d800000(P p2) {
        return this.o00000.Object(p2.\u00f5o0000());
    }

    public OOOo o00000(ArrayList<String> arrayList) {
        this.o00000.o00000(true);
        int n = 9999;
        OOOo oOOo = new OOOo();
        ArrayList<Object> arrayList2 = new ArrayList<Object>();
        ArrayList<String> arrayList3 = new ArrayList<String>();
        ArrayList<String> arrayList4 = new ArrayList<String>();
        if (arrayList != null) {
            arrayList4.addAll(arrayList);
        }
        ArrayList<Object> arrayList5 = new ArrayList<Object>();
        for (Object object2 : oooo_0.Object()) {
            if (arrayList4.contains(((P)object2).toString())) continue;
            arrayList2.add(object2);
        }
        while (arrayList2.size() > 0) {
            Object object;
            arrayList5.addAll(arrayList2);
            if (arrayList5.size() >= n) {
                Object object2;
                object2 = "Unklar-Liste wird nicht k\u00fcrzer";
                object = arrayList4.iterator();
                while (object.hasNext()) {
                    object2 = (String)object2 + "Unmoeglich: " + (String)object.next() + "\n";
                }
                object = arrayList3.iterator();
                while (object.hasNext()) {
                    object2 = (String)object2 + "Moeglich: " + (String)object.next() + "\n";
                }
                for (P p2 : arrayList5) {
                    object2 = (String)object2 + "Unklar: " + p2 + "\n";
                }
                helden.framework.held.object.oooo_0.\u00f500000((String)object2);
                this.o00000.o00000(false);
                this.String = true;
                break;
            }
            n = arrayList5.size();
            arrayList2.clear();
            for (Object object2 : arrayList5) {
                object = this.o00000.o00000(((P)object2).\u00f5o0000(), arrayList3, arrayList4);
                if (((Enum)object).equals((Object)floatsuper._o.Object)) {
                    arrayList3.add(((P)object2).\u00f500000());
                    oOOo.o00000((P)object2);
                }
                if (((Enum)object).equals((Object)floatsuper._o.\u00d400000)) {
                    arrayList4.add(((P)object2).\u00f500000());
                }
                if (!((Enum)object).equals((Object)floatsuper._o.o00000)) continue;
                arrayList2.add(object2);
            }
            arrayList5.clear();
        }
        this.o00000.o00000(false);
        return oOOo;
    }

    public OOOo \u00d200000(ArrayList<String> arrayList) {
        int n = 9999;
        OOOo oOOo = new OOOo();
        ArrayList<Object> arrayList2 = new ArrayList<Object>();
        ArrayList<String> arrayList3 = new ArrayList<String>();
        ArrayList<String> arrayList4 = new ArrayList<String>();
        if (arrayList != null) {
            arrayList4.addAll(arrayList);
        }
        ArrayList<Object> arrayList5 = new ArrayList<Object>();
        for (Object object2 : oooo_0.Object()) {
            if (arrayList4.contains(((P)object2).toString())) continue;
            arrayList2.add(object2);
        }
        while (arrayList2.size() > 0) {
            Object object;
            arrayList5.addAll(arrayList2);
            if (arrayList5.size() >= n) {
                Object object2;
                object2 = "Unklar-Liste wird nicht k\u00fcrzer";
                object = arrayList4.iterator();
                while (object.hasNext()) {
                    object2 = (String)object2 + "Unmoeglich: " + (String)object.next() + "\n";
                }
                object = arrayList3.iterator();
                while (object.hasNext()) {
                    object2 = (String)object2 + "Moeglich: " + (String)object.next() + "\n";
                }
                for (P p2 : arrayList5) {
                    object2 = (String)object2 + "Unklar: " + p2 + "\n";
                }
                helden.framework.held.object.oooo_0.\u00f500000((String)object2);
                this.String = true;
                break;
            }
            n = arrayList5.size();
            arrayList2.clear();
            for (Object object2 : arrayList5) {
                object = this.o00000.o00000(((P)object2).\u00f5o0000(), arrayList3, arrayList4);
                if (((Enum)object).equals((Object)floatsuper._o.Object)) {
                    arrayList3.add(((P)object2).\u00f500000());
                    oOOo.o00000((P)object2);
                }
                if (((Enum)object).equals((Object)floatsuper._o.\u00d400000)) {
                    arrayList4.add(((P)object2).\u00f500000());
                }
                if (!((Enum)object).equals((Object)floatsuper._o.o00000)) continue;
                arrayList2.add(object2);
            }
            arrayList5.clear();
        }
        return oOOo;
    }

    public D \u00d600000(P p2) {
        if (p2 instanceof helden.framework.D.K) {
            helden.framework.D.K k2 = (helden.framework.D.K)p2;
            String string = "";
            string = k2.privatesuper() ? "Zauberspezialisierung" : "Talentspezialisierung";
            return this.\u00d600000.get(string);
        }
        return this.\u00d600000.get(p2.toString());
    }

    public OOOo o00000(Settings settings, Boolean bl) {
        OOOo oOOo = new OOOo();
        for (P p2 : this.o00000((ArrayList<String>)null)) {
            if (!settings.contains(p2) || p2.\u00f8O0000() || bl.booleanValue() && !this.\u00d800000(p2)) continue;
            oOOo.o00000(p2);
        }
        for (P p2 : this.\u00d200000.\u00f5O0000()) {
            oOOo.\u00d200000(p2);
        }
        oOOo.o00000(helden.framework.D.K.o00000(voidsuper.\u00d8\u00d5\u00d5000, ""));
        return oOOo;
    }

    public OOOo o00000(boolean bl) {
        Object object2;
        OOOo oOOo = new OOOo();
        ArrayList<String> arrayList = new ArrayList<String>();
        for (Object object2 : oooo_0.Object()) {
            if (((P)object2).new() && !this.\u00d200000.\u00f5O0000().\u00d200000(((P)object2).toString())) {
                arrayList.add(((P)object2).toString());
            }
            if (!((P)object2).\u00d500000() || this.\u00d200000.\u00f5O0000().\u00d200000(((P)object2).toString())) continue;
            arrayList.add(((P)object2).toString());
        }
        OOOo oOOo2 = this.o00000(arrayList);
        object2 = oOOo2.iterator();
        while (object2.hasNext()) {
            P p2 = (P)object2.next();
            if (p2.o00000(this.o00000) < 4 || p2.\u00f8O0000() || p2.new()) continue;
            oOOo.o00000(p2);
        }
        if (bl) {
            for (P p2 : this.\u00d200000.\u00f5O0000()) {
                if (oOOo.\u00d200000(p2.toString())) continue;
                oOOo.o00000(p2);
            }
        }
        for (P p2 : oooo_0.Object()) {
            if (oOOo.\u00d200000(p2.toString()) || !this.\u00d200000.\u00d300000(p2) && !this.\u00d200000.new(p2)) continue;
            oOOo.o00000(p2);
        }
        oOOo.\u00d300000(while.\u00d2\u00d6o000.toString());
        oOOo.\u00d300000(while.o\u00f8\u00f5000.toString());
        return oOOo;
    }

    public OOOo o00000(Settings settings) {
        OOOo oOOo = new OOOo();
        for (P p2 : oooo_0.Object()) {
            if (p2.o00000((floatsuper)null) < 1 || !settings.contains(p2) || p2.\u00f8O0000() || !this.\u00d800000(p2)) continue;
            oOOo.o00000(p2);
        }
        for (P p2 : this.\u00d200000.\u00f5O0000()) {
            oOOo.\u00d200000(p2);
        }
        return oOOo;
    }

    public OOOo \u00d200000() {
        OOOo oOOo = new OOOo();
        ArrayList<String> arrayList = new ArrayList<String>();
        OOOo oOOo2 = this.o00000(arrayList);
        for (P p2 : oOOo2) {
            if (p2.\u00f8O0000()) continue;
            oOOo.o00000(p2);
        }
        return oOOo;
    }

    public void String(OOOo oOOo) {
        for (P p2 : oOOo) {
            if (!p2.return()) continue;
            this.\u00d200000(p2.toString(), oOOo, "Eigeboren");
        }
    }

    public boolean o00000() {
        return this.String;
    }

    public boolean o00000(P p2) {
        return this.\u00d500000.contains(J.super(p2));
    }

    public boolean \u00d500000(P p2) {
        for (for for_ : this.\u00d200000.thisObject()) {
            if (p2 instanceof void) {
                void void_ = (void)p2;
                if (!void_.\u00f500000().equals(for_.getBezeichner())) continue;
                for (Object t : for_.getAuswahlen()) {
                    for (Object t2 : void_.\u00f8\u00d30000()) {
                        if (!t.toString().equals(t2.toString())) continue;
                        return true;
                    }
                }
                continue;
            }
            if (!for_.toString().equals(p2.toString())) continue;
            return true;
        }
        return p2.\u00f800000() || p2.equals(while.iffloatObject) || p2.equals(while.\u00d2\u00d6\u00d6000) || p2.equals(while.returnfloatObject) || p2.equals(while.\u00d3\u00d5\u00d6000) || p2.equals(while.StringthisString) || p2.equals(while.\u00d3\u00d6\u00d2000) || p2.equals(while.\u00f8\u00d5\u00d6000) || p2.equals(while.\u00f6\u00d5\u00d6000) || p2.equals(while.privatenullObject) || p2.equals(while.StringforObject) || p2.equals(while.Stringnewclass) || p2.equals(while.privatenullsuper) || p2.equals(while.\u00d8\u00d2\u00f4000) || p2.equals(while.privateforObject);
    }

    public boolean \u00d200000(P p2) {
        return this.o00000.o00000(p2.\u00f5o0000());
    }

    public void \u00d600000(OOOo oOOo) {
        Object object52;
        Object object2;
        Object object322;
        for (Object object322 : oOOo) {
            ((P)object322).o00000();
        }
        if (!this.\u00d200000.oo0000()) {
            this.o00000(while.o\u00f8\u00d3000, oOOo, 50, "Nicht magiebegabt");
        }
        if (this.\u00d200000.o00000(while.\u00f8\u00d8o000)) {
            this.o00000(while.\u00d30\u00f5000, oOOo, 150, "Blutopfer");
        }
        if (this.\u00d200000.o00000(while.\u00d30\u00f5000)) {
            this.o00000(while.\u00f8\u00d8o000, oOOo, 50, "Blutmagie");
        }
        if (this.\u00d200000.o00000(while.privatenullsuper)) {
            this.o00000(while.\u00f5\u00f5\u00f6000, oOOo, 250, "Zauberkontrolle");
        }
        if (this.\u00d200000.o00000(while.\u00d3O\u00f4000)) {
            this.o00000(while.\u00f5\u00f5\u00f6000, oOOo, 150, "Meisterliche Zauberkontrolle II");
        }
        if (!this.\u00d200000.oo0000()) {
            this.o00000(while.newpublic, oOOo, 50, "Nicht magiebegabt");
        }
        if (this.\u00d200000.o00000(I.\u00f5\u00d60000) || this.\u00d200000.new(while.\u00d8\u00d6\u00d5000.toString())) {
            this.o00000(while.nullfor, oOOo, 0, "");
        }
        if (this.\u00d200000.o00000(I.\u00d4\u00d6O000)) {
            this.o00000(while.Stringprivate, oOOo, 100, "" + I.\u00d4\u00d6O000.toString());
            this.o00000(while.\u00d5O\u00d4000, oOOo, 150, "" + I.\u00d4\u00d6O000.toString());
            this.o00000(while.\u00d2O\u00d4000, oOOo, 150, "" + I.\u00d4\u00d6O000.toString());
        }
        if (this.\u00d200000.o00000(Setting.\u00f600000)) {
            this.o00000(while.o\u00d4\u00f5000, oOOo, 200, "");
            this.o00000(while.\u00f8\u00d2\u00d2000, oOOo, 200, "");
            this.o00000(while.\u00f6\u00f6O000, oOOo, 250, "");
        }
        if (this.\u00d200000.new(while.newObjectsuper.toString())) {
            this.o00000(while.\u00d2\u00d3\u00d6000, oOOo, 75, "ZZHermetisches");
        }
        if (this.\u00d200000.new(while.newinterfacesuper.toString())) {
            this.o00000(while.o\u00f5\u00d3000, oOOo, 50, "BK Niedere D\u00e4monen");
        }
        if (this.\u00d200000.o00000(I.\u00d3oo000)) {
            object2 = (M)this.\u00d200000.\u00d500000().\u00d300000(I.\u00d3oo000);
            object322 = ((helden.framework.C.private)object2).intsuper().iterator();
            while (object322.hasNext()) {
                object52 = (String)object322.next();
                for (Object object4 : oOOo) {
                    if (!((P)object4).toString().startsWith((String)object52)) continue;
                    this.\u00d200000(((P)object4).toString(), oOOo, "BEGABUNG F\u00dcR GK");
                }
            }
        }
        if (this.\u00d200000.o00000(I.\u00f50\u00d2000)) {
            this.o00000(while.\u00d8\u00f8\u00f4000.toString(), oOOo, 5.0f, "Zwergenwuchs");
            this.o00000(while.nullStringString.toString(), oOOo, 5.0f, "Zwergenwuchs");
            this.o00000(while.\u00d50o000.toString(), oOOo, 5.0f, "Zwergenwuchs");
            this.o00000(while.\u00d3\u00d4\u00f5000.toString(), oOOo, 0.5f, "Zwergenwuchs");
        }
        if (this.\u00d200000.o00000(I.ifnullsuper)) {
            this.\u00d200000(while.\u00f6\u00d6\u00d5000.toString(), oOOo, "BEIDHAENDIG");
            this.\u00d200000(while.newObjectObject.toString(), oOOo, "BEIDHAENDIG");
            this.\u00d200000(while.\u00d5\u00d4\u00d4000.toString(), oOOo, "BEIDHAENDIG");
            this.\u00d200000(while.\u00d3o\u00d6000.toString(), oOOo, "BEIDHAENDIG");
            this.\u00d200000(while.\u00d2o\u00d6000.toString(), oOOo, "BEIDHAENDIG");
            this.\u00d200000(while.oo\u00d6000.toString(), oOOo, "BEIDHAENDIG");
            this.o00000(while.o\u00f8\u00f4000.toString(), oOOo, "BEIDHAENDIG");
            this.o00000(while.\u00f5\u00f4\u00d5000.toString(), oOOo, "BEIDHAENDIG");
            this.o00000(while.\u00d8\u00f4\u00d5000.toString(), oOOo, "BEIDHAENDIG");
            this.o00000(while.\u00f8\u00d3\u00d8000.toString(), oOOo, "BEIDHAENDIG");
            this.o00000(while.\u00f6\u00d3\u00d8000.toString(), oOOo, "BEIDHAENDIG");
            this.o00000(while.\u00d60\u00d2000.toString(), oOOo, "BEIDHAENDIG");
            this.o00000(while.\u00d8\u00d8\u00d8000.toString(), oOOo, "BEIDHAENDIG");
            this.o00000(while.\u00d2o\u00f4000.toString(), oOOo, "BEIDHAENDIG");
        }
        if (this.\u00d200000.o00000(I.\u00f4\u00d6O000)) {
            this.String(oOOo);
        }
        if (this.\u00d200000.o00000(I.\u00f5\u00d8o000)) {
            this.\u00d300000(while.\u00d3\u00d6\u00d2000.toString(), oOOo, "HZ");
        }
        if (this.\u00d200000.o00000(I.o\u00d50000)) {
            this.o00000(while.\u00f6\u00d6\u00d5000.toString(), oOOo, "LINKSHAENDER");
            this.o00000(while.newObjectObject.toString(), oOOo, "LINKSHAENDER");
            this.o00000(while.\u00d5\u00d4\u00d4000.toString(), oOOo, "LINKSHAENDER");
            this.o00000(while.\u00d3o\u00d6000.toString(), oOOo, "LINKSHAENDER");
            this.o00000(while.\u00d2o\u00d6000.toString(), oOOo, "LINKSHAENDER");
            this.o00000(while.oo\u00d6000.toString(), oOOo, "LINKSHAENDER");
        }
        if (this.\u00d200000.o00000(I.whilereturnsuper)) {
            this.\u00d200000(while.iffloatObject.toString(), oOOo, "SCHLANGENMENSCH");
            this.\u00d200000(while.\u00d2\u00d6\u00d6000.toString(), oOOo, "SCHLANGENMENSCH");
            this.\u00d200000(while.returnfloatObject.toString(), oOOo, "SCHLANGENMENSCH");
            this.\u00d200000(while.\u00d6\u00f6\u00f5000.toString(), oOOo, "SCHLANGENMENSCH");
            this.\u00d200000(while.\u00f6\u00f5o000.toString(), oOOo, "SCHLANGENMENSCH");
            this.\u00d200000(while.\u00d2o\u00d8000.toString(), oOOo, "SCHLANGENMENSCH");
            this.\u00d200000(while.\u00f5\u00d6O000.toString(), oOOo, "SCHLANGENMENSCH");
            this.\u00d200000(while.\u00d8\u00d80000.toString(), oOOo, "SCHLANGENMENSCH");
            this.\u00d200000(while.\u00d20o000.toString(), oOOo, "SCHLANGENMENSCH");
            this.\u00d200000(while.newint.toString(), oOOo, "SCHLANGENMENSCH");
        }
        if (this.\u00d200000.o00000(I.whileString)) {
            this.\u00d200000(while.o\u00f6\u00f6000.toString(), oOOo, "Schwache Ausstrahlung");
        }
        if (this.\u00d200000.o00000(I.\u00d3\u00d3O000)) {
            this.\u00d300000(while.\u00f8\u00f8\u00d8000.toString(), oOOo, "Stubenhocker");
        }
        if (this.\u00d200000.new(while.\u00d8\u00d2\u00d8000.toString())) {
            this.\u00d200000(while.\u00d3o\u00d5000.toString(), oOOo, "Verbotene Pforten");
        }
        if (this.\u00d200000.new(while.o\u00d6\u00d5000.toString())) {
            this.\u00d200000(while.\u00f6\u00f8\u00d2000.toString(), oOOo, "MK Beschw\u00f6rung");
        }
        if (this.\u00d200000.new(while.\u00d5\u00d8\u00f4000.toString()) || this.\u00d200000.new(while.oO\u00d8000.toString())) {
            this.\u00d200000(while.o\u00d3o000.toString(), oOOo, "MK Metmagie / Objekt");
            this.\u00d200000(while.\u00f8\u00f5\u00d6000.toString(), oOOo, "MK Metmagie / Objekt");
        }
        if (this.\u00d200000.new(while.\u00d5\u00d8\u00f4000.toString()) || this.\u00d200000.new(while.\u00d6\u00d5O000.toString())) {
            this.\u00d200000(while.\u00d2\u00d6\u00f5000.toString(), oOOo, "MK MM / TEMP");
            this.\u00d200000(while.\u00f8\u00d5\u00f5000.toString(), oOOo, "MK MM / TEMP");
        }
        if (this.\u00d200000.new(while.oO\u00d8000.toString())) {
            this.\u00d200000(while.privateprivateObject.toString(), oOOo, "MK Obj");
        }
        if (this.\u00d200000.new(while.fornullsuper.toString())) {
            this.\u00d200000(while.privatenullsuper.toString(), oOOo, "RP Elf");
        }
        if (this.\u00d200000.new(while.\u00d5\u00d8\u00f4000.toString())) {
            this.\u00d200000(while.ifdosuper.toString(), oOOo, "MK Metamagie");
            this.\u00d200000(while.returnObjectnew.toString(), oOOo, "MK Metamagie");
            this.\u00d200000(while.\u00d3\u00f5\u00d8000.toString(), oOOo, "MK Metamagie");
            this.\u00d200000(while.\u00d8\u00d2\u00f4000.toString(), oOOo, "MK Metamagie");
            this.\u00d200000(while.privateforObject.toString(), oOOo, "MK Metamagie");
        } else if (this.\u00d200000.\u00f5O0000().oO0000() > 2) {
            this.\u00d200000(while.returnObjectnew.toString(), oOOo, ">2 MK");
        } else if (this.\u00d200000.\u00f5O0000().\u00f8O0000() > 1) {
            this.\u00d200000(while.returnObjectnew.toString(), oOOo, ">1 Rep");
        }
        if (this.\u00d200000.new(while.\u00f8\u00f6\u00d2000.toString()) || this.o00000.Object((AbstraktBedingung)Bedingung.hatSfAuswahl(while.\u00d3\u00f5\u00f6000, o0Oo.\u00d5O0000))) {
            this.\u00d200000(while.\u00d6\u00d8\u00f4000.toString(), oOOo, "MK Kraft");
            this.\u00d200000(while.whilesuperclass.toString(), oOOo, "MK Kraft");
        }
        if (this.\u00d200000.new(while.\u00d8\u00d4\u00d5000.toString()) || this.\u00d200000.new(while.\u00f8\u00f6\u00d2000.toString()) || this.\u00d200000.new(while.\u00d5\u00d8\u00f4000.toString())) {
            this.\u00d200000(while.\u00d3\u00f5\u00d4000.toString(), oOOo, "MK HS/K/MM");
        }
        if (this.\u00d200000.o00000(I.\u00f8\u00d6o000)) {
            this.\u00d300000(while.\u00f8\u00d5\u00d6000.toString(), oOOo, "ASTRALERBLOCK");
            this.\u00d300000(while.\u00f6\u00d5\u00d6000.toString(), oOOo, "ASTRALERBLOCK");
            this.\u00d300000(while.\u00d3\u00d6\u00d2000.toString(), oOOo, "ASTRALERBLOCK");
        }
        if (this.\u00d200000.o00000(I.\u00d8\u00f6O000)) {
            object2 = (M)this.\u00d200000.\u00d500000().\u00d300000(I.\u00d8\u00f6O000);
            object322 = ((helden.framework.C.private)object2).intsuper().iterator();
            while (object322.hasNext()) {
                object52 = (P)object322.next();
                if (!oOOo.\u00d200000(((P)object52).toString())) continue;
                this.\u00d200000(((P)object52).toString(), oOOo, "BEGABUNG F\u00dcR RITUAL");
            }
        }
        if (this.\u00d200000.o00000(I.\u00d3\u00f40000)) {
            object2 = (M)this.\u00d200000.\u00d500000().\u00d300000(I.\u00d3\u00f40000);
            object322 = ((helden.framework.C.private)object2).intsuper().iterator();
            while (object322.hasNext()) {
                object52 = (A)object322.next();
                if (!oOOo.\u00d200000(while.\u00d3\u00f4\u00d6000.toString())) continue;
                V v = (V)oOOo.o00000(while.\u00d3\u00f4\u00d6000.toString());
                v.o00000(object52, HeldenMath.haelfte(v.return(object52)));
            }
        }
        if (this.\u00d200000.new(while.\u00d5\u00d8\u00f4000.toString()) || this.\u00d200000.\u00d5o0000().super(Zauber.nullpublicnew, (helden.framework.OOoO.K)null, (String)null, 14)) {
            this.\u00d200000(while.\u00f6\u00f5\u00f4000.toString(), oOOo, "MK MM / Arcanovi > 14");
        }
        int n = 0;
        if (this.\u00d200000.o00000(I.\u00d4oo000) || this.\u00d200000.new(while.\u00f8\u00f6\u00d5000.toString()) || this.\u00d200000.new(while.\u00d8O\u00d4000.toString())) {
            n = 75;
        }
        if (this.\u00d200000.o00000(I.\u00d4oo000) && (this.\u00d200000.new(while.\u00f8\u00f6\u00d5000.toString()) || this.\u00d200000.new(while.\u00d8O\u00d4000.toString()))) {
            n = 38;
        }
        if (n > 0) {
            object322 = oOOo.iterator();
            while (object322.hasNext()) {
                object52 = (P)object322.next();
                if (!(object52 instanceof U)) continue;
                this.o00000((P)object52, n, "Soziale Anpassungsf\u00e4higkeit / Nadnusgef\u00e4lliges Wissen");
            }
        }
        if (this.\u00d200000.\u00f5O0000().\u00d5O0000()) {
            this.\u00d800000(oOOo);
        }
        this.\u00d500000(oOOo);
        if (this.\u00d200000.new(while.\u00d3O\u00d6000.toString())) {
            this.o00000(while.o\u00d40000, oOOo, 20, "Block");
        }
        if (!this.\u00d200000.new(while.o\u00d6\u00d3000.toString())) {
            this.String(while.\u00f8\u00d6\u00d5000.toString(), oOOo, "Falsche RK");
            this.String(while.o0\u00f8000.toString(), oOOo, "Falsche RK");
            this.String(while.newvoidString.toString(), oOOo, "Falsche RK");
            this.String(while.\u00f5\u00d3\u00f5000.toString(), oOOo, "Falsche RK");
            this.String(while.\u00f5\u00d5\u00d6000.toString(), oOOo, "Falsche RK");
            this.String(while.forreturnObject.toString(), oOOo, "Falsche RK");
            this.String(while.private.toString(), oOOo, "Falsche RK");
            this.String(while.\u00d6o\u00d4000.toString(), oOOo, "Falsche RK");
            this.String(while.\u00d20\u00d6000.toString(), oOOo, "Falsche RK");
        }
        if (!this.\u00d200000.new(while.\u00f5\u00d8\u00d2000.toString())) {
            this.String(while.\u00f5\u00d8\u00f4000.toString(), oOOo, "Falsche RK");
            this.String(while.\u00d2\u00d4\u00f5000.toString(), oOOo, "Falsche RK");
            this.String(while.\u00d3\u00d5\u00d4000.toString(), oOOo, "Falsche RK");
            this.String(while.\u00d2\u00d3o000.toString(), oOOo, "Falsche RK");
            this.String(while.Stringreturnnew.toString(), oOOo, "Falsche RK");
            this.String(while.\u00f50\u00f6000.toString(), oOOo, "Falsche RK");
            this.String(while.thisreturnString.toString(), oOOo, "Falsche RK");
            this.String(while.\u00d5\u00d2\u00d2000.toString(), oOOo, "Falsche RK");
            this.String(while.newinterfacenew.toString(), oOOo, "Falsche RK");
        }
        if (!this.\u00d200000.new(while.\u00d2\u00d2\u00d3000.toString())) {
            this.String(while.\u00d2\u00d4\u00f4000.toString(), oOOo, "Falsche RK");
            this.String(while.oO\u00f8000.toString(), oOOo, "Falsche RK");
            this.String(while.\u00f5oo000.toString(), oOOo, "Falsche RK");
            this.String(while.newpublicString.toString(), oOOo, "Falsche RK");
            this.String(while.newdo.toString(), oOOo, "Falsche RK");
            this.String(while.whilefloatnew.toString(), oOOo, "Falsche RK");
            this.String(while.\u00d3\u00f4o000.toString(), oOOo, "Falsche RK");
        }
        if (!this.\u00d200000.new(while.forfornew.toString())) {
            this.String(while.\u00d5O\u00d2000.toString(), oOOo, "Falsche RK");
            this.String(while.\u00d2\u00d3\u00f4000.toString(), oOOo, "Falsche RK");
            this.String(while.\u00d2\u00d5\u00d6000.toString(), oOOo, "Falsche RK");
            this.String(while.\u00d6Oo000.toString(), oOOo, "Falsche RK");
            this.String(while.\u00d2\u00f5o000.toString(), oOOo, "Falsche RK");
            this.String(while.\u00d3o\u00d3000.toString(), oOOo, "Falsche RK");
        }
        if (!this.\u00d200000.new(while.forfornew.toString()) && !this.\u00d200000.new(while.\u00d2\u00d2\u00d3000.toString())) {
            this.String(while.\u00d5O\u00f5000.toString(), oOOo, "");
        }
        if (this.\u00d200000.o00000(I.privatesuper) || this.\u00d200000.o00000(I.\u00d8O\u00d2000)) {
            this.o00000(while.\u00f6\u00f8o000, oOOo, 50, "Tierempathie");
        }
        if (this.\u00d200000.new(while.forifclass.toString())) {
            this.o00000(while.newfloatObject.toString(), oOOo, 0.25f, "Empathisches Band");
            this.o00000(while.o\u00d6\u00f6000.toString(), oOOo, 0.25f, "Empathisches Band");
            this.o00000(while.\u00d2\u00d8\u00d5000.toString(), oOOo, 0.25f, "Empathisches Band");
            this.o00000(while.\u00f5\u00d6\u00f5000.toString(), oOOo, 0.25f, "Empathisches Band");
            this.o00000(while.\u00d30\u00d5000.toString(), oOOo, 0.25f, "Empathisches Band");
            this.o00000(while.\u00f8O\u00f5000.toString(), oOOo, 0.25f, "Empathisches Band");
            this.o00000(while.newvoidObject.toString(), oOOo, 0.25f, "Empathisches Band");
            this.o00000(while.\u00f6\u00f4\u00d5000.toString(), oOOo, 0.25f, "Empathisches Band");
            this.o00000(while.\u00f6\u00f6\u00d5000.toString(), oOOo, 0.25f, "Empathisches Band");
            this.o00000(while.\u00f8\u00d3\u00f5000.toString(), oOOo, 0.25f, "Empathisches Band");
            this.o00000(while.thisreturnclass.toString(), oOOo, 0.25f, "Empathisches Band");
        }
        this.o00000(oOOo);
        if (this.\u00d200000.o00000(I.o\u00d6o000) || this.\u00d200000.o00000(I.\u00d3\u00d3o000) || this.\u00d200000.new(I.returnfor)) {
            object322 = oOOo.iterator();
            while (object322.hasNext()) {
                object52 = (P)object322.next();
                boolean bl = false;
                if (((P)object52).\u00f8O0000()) {
                    Object object4;
                    object4 = (helden.framework.D.K)object52;
                    bl = ((helden.framework.D.K)object4).o\u00d30000().getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f400000);
                }
                if (!((P)object52).\u00f400000() && !bl) continue;
                this.o00000((P)object52, 0.75f, "AA(Krieger)");
            }
        }
        if (this.\u00d200000.o00000(I.thisintsuper) && ((M)(object322 = (M)this.\u00d200000.\u00d500000().\u00d300000(I.thisintsuper))).\u00f400000("Elementaren") && oOOo.\u00d200000(while.\u00d6\u00d2\u00f4000.toString())) {
            object52 = (helden.framework.D.OoOO.F)oOOo.o00000(while.\u00d6\u00d2\u00f4000.toString());
            for (Object object4 : ((void)object52).\u00f8\u00d30000()) {
                ((void)object52).o00000((Object)object4, ((void)object52).return(object4) - 200);
            }
        }
        this.\u00d200000(oOOo);
        if (this.\u00d200000.o00000(I.\u00d50\u00d2000)) {
            for (Object object52 : oOOo) {
                if (!((P)object52).privatesuper() || ((P)object52).\u00f4O0000() || ((P)object52).new()) continue;
                boolean bl = floatsuper.\u00d200000(((P)object52).\u00f5o0000());
                boolean bl2 = this.o00000.o00000((AbstraktBedingung)((P)object52).\u00f5o0000());
                if ((!bl || !bl2) && bl) continue;
                if (object52 instanceof void) {
                    P p2 = (void)object52;
                    for (Object object6 : ((void)p2).\u00f8\u00d30000()) {
                        int n2 = ((void)p2).return(object6);
                        int n3 = HeldenMath.dreiviertel(n2);
                        ((void)p2).o00000(object6, n3);
                    }
                    continue;
                }
                int n4 = ((P)object52).o\u00d20000();
                int n5 = HeldenMath.dreiviertel(n4);
                ((P)object52).o00000(n5, "AA(Magier)");
            }
            this.o00000(while.\u00d8\u00d3\u00d2000.toString(), oOOo, 1.5f, "AA(Magier)");
            this.o00000(while.\u00d6\u00d3\u00d2000.toString(), oOOo, 1.5f, "AA(Magier)");
            this.o00000(while.\u00d5\u00d3\u00d2000.toString(), oOOo, 1.5f, "AA(Magier)");
        }
        if (this.\u00d200000.new(while.\u00d8\u00d3\u00d4000.toString())) {
            for (Object object52 : oOOo) {
                whilesuper whilesuper2;
                if (!(object52 instanceof whilesuper) || !(whilesuper2 = (whilesuper)object52).o\u00d60000().equals(OoOoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d600000) && !whilesuper2.o\u00d60000().equals(OoOoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.o00000) && !whilesuper2.o\u00d60000().equals(OoOoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d6O0000) && !whilesuper2.o\u00d60000().equals(OoOoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d500000)) continue;
                whilesuper2.o00000(null, 0.5f);
            }
        }
        if (this.\u00d200000.o00000(I.\u00d80O000)) {
            object322 = (M)this.\u00d200000.\u00d500000().\u00d300000(I.\u00d80O000);
            object52 = ((helden.framework.C.private)object322).intsuper().iterator();
            while (object52.hasNext()) {
                A a2 = (A)object52.next();
                if (!oOOo.\u00d200000(while.\u00d3\u00f4\u00d6000.toString())) continue;
                V v = (V)oOOo.o00000(while.\u00d3\u00f4\u00d6000.toString());
                v.o00000(a2, 2 * v.return(a2));
            }
        }
        if (!this.\u00d200000.new(while.privatenullObject.toString())) {
            for (Object object52 : oOOo) {
                if (!((P)object52).\u00f800000()) continue;
                this.o00000((P)object52, ((P)object52).o\u00d20000() * 2, "Sippenlos");
            }
        }
        this.\u00d300000(oOOo);
        this.null(oOOo);
        object322 = this.\u00d200000.privatesuper();
        if (object322 != null && ((do)object322).\u00d5\u00d3O000() && oOOo.\u00d200000((String)(object52 = ((do)object322).intfloat()))) {
            P p3 = oOOo.o00000((String)object52);
            p3.new(p3.o\u00d20000() - 50 * ((do)object322).\u00d6\u00d3O000());
        }
        for (String string : this.\u00d500000) {
            for (P p2 : oOOo) {
                if (!J.super(p2).equals(string)) continue;
                this.o00000(p2, 0.5f, "SE");
            }
        }
        for (for for_ : this.\u00d200000.thisObject()) {
            this.o00000(oOOo, for_, "Durch RKP");
        }
        if (this.\u00d200000.new(while.\u00d8\u00d8\u00d8000.toString()) && oOOo.\u00d200000(while.newObjectObject.toString())) {
            object52 = oOOo.o00000(while.newObjectObject.toString());
            int n6 = 100;
            if (this.\u00d200000.o00000(I.ifnullsuper)) {
                n6 = 75;
            }
            this.o00000((P)object52, ((P)object52).o\u00d20000() - n6, "Tod Von Links, ggf Beidhaendig");
        }
        if (this.\u00d200000.o00000(I.newreturn)) {
            for (P p4 : oOOo) {
                if (this.\u00d600000(p4) != null && this.\u00d600000(p4).equals(D.\u00d200000)) continue;
                if (p4 instanceof void) {
                    void void_ = (void)p4;
                    boolean bl = false;
                    for (for for_ : this.\u00d200000.thisObject()) {
                        if (!void_.\u00f500000().equals(for_.getBezeichner())) continue;
                        for (Object t : for_.getAuswahlen()) {
                            for (Object t2 : void_.\u00f8\u00d30000()) {
                                if (!t.toString().equals(t2.toString())) {
                                    int n4 = void_.return(t2) + HeldenMath.haelfte(void_.return(t2));
                                    void_.o00000(t2, n4);
                                }
                                bl = true;
                            }
                        }
                    }
                    if (bl) continue;
                    this.o00000((P)void_, 1.5f, "Elfische Weltsicht");
                    continue;
                }
                if (this.\u00d500000(p4)) continue;
                int n8 = p4.o\u00d20000() + HeldenMath.haelfte(p4.o\u00d20000());
                p4.o00000(n8, "Elfische Weltsicht");
            }
        }
        for (P p5 : this.\u00d200000.\u00f5O0000()) {
            for (H h2 : p5.O\u00d20000()) {
                if (!oOOo.\u00d200000(h2.toString())) continue;
                this.o00000(h2, oOOo, 0, "");
            }
        }
    }

    public void String(P p2) {
        this.\u00d500000.remove(J.super(p2));
    }

    public void o00000(P p2, D d2) {
        if (p2 instanceof helden.framework.D.K) {
            helden.framework.D.K k2 = (helden.framework.D.K)p2;
            String string = "";
            string = k2.privatesuper() ? "Zauberspezialisierung" : "Talentspezialisierung";
            this.\u00d600000.put(string, d2);
        } else {
            this.\u00d600000.put(p2.toString(), d2);
        }
    }

    public void \u00d800000(OOOo oOOo) {
        P p2 = null;
        for (P p3 : this.\u00d200000.\u00f5O0000().private().getListe()) {
            if (!p3.\u00f5O0000()) continue;
            if (p2 == null) {
                p2 = p3;
                continue;
            }
            if (this.\u00d300000 == null || !this.\u00d300000.isAuto(p3)) continue;
            p2 = p3;
            break;
        }
        if (p2 == null) {
            return;
        }
        for (P p3 : oOOo) {
            if (!p3.\u00f5O0000() || p3.o00000(p2)) continue;
            p3.o00000(100, "Zweite Gel\u00e4ndekunde");
        }
    }

    public void \u00d500000(OOOo oOOo) {
        Object t = null;
        block0: for (P p2 : this.\u00d200000.\u00f5O0000().private().getListe()) {
            if (!(p2 instanceof helden.framework.D.OoOO.D)) continue;
            if (t == null) {
                t = ((void)p2).\u00f4\u00d30000();
            }
            for (Object t2 : ((void)p2).nullObject()) {
                P p3 = oooo_0.o00000(while.\u00d30\u00d2000, t2.toString());
                if (this.\u00d300000 == null || !this.\u00d300000.isAuto(p3)) continue;
                t = t2;
                continue block0;
            }
        }
        if (t == null) {
            return;
        }
        for (P p2 : oOOo) {
            if (!(p2 instanceof helden.framework.D.OoOO.D)) continue;
            void void_ = (void)p2;
            void_.\u00d400000(100);
            void_.o00000(t, 150);
        }
    }

    private void String(String string, OOOo oOOo, String string2) {
        if (oOOo.\u00d200000(string)) {
            P p2 = oOOo.o00000(string);
            this.o00000(p2, 1.5f, string2);
        }
    }

    private void o00000(helden.framework.D.K k2, int n) {
        oo0o_0 oo0o_02 = k2.o\u00d30000();
        s_0 s_02 = oo0o_02 instanceof KonkreterZauber ? this.\u00d200000.\u00d5o0000().\u00d300000(oo0o_02, this.\u00d200000, false) : this.\u00d200000.\u00f8O0000().class(oo0o_02, this.\u00d200000, this.\u00d800000);
        int n2 = n * 20 * o0oo_0.super(s_02);
        k2.o00000();
        k2.o00000(n2, "Basiskosten f\u00fcr " + n + ". TS; (AF " + o0oo_0.super(s_02) + ")");
    }

    private void null(OOOo oOOo) {
        if (this.\u00d200000.o00000(I.\u00d4\u00d5o000) || this.\u00d200000.o00000(I.OO\u00d2000)) {
            boolean bl = this.\u00d200000.o00000(I.\u00d4\u00d5o000);
            float f2 = 0.5f;
            if (bl) {
                f2 = 0.75f;
            }
            for (P p2 : oOOo) {
                boolean bl2 = false;
                if (p2.\u00f8O0000()) {
                    helden.framework.D.K k2 = (helden.framework.D.K)p2;
                    boolean bl3 = bl2 = k2.o\u00d30000().istZauber() || k2.o\u00d30000().getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d8O0000);
                }
                if (p2.\u00d400000() != 1 && !p2.toString().startsWith(while.\u00d2o\u00f5000.toString()) && !p2.equals(while.\u00f8\u00f6\u00d5000) && !p2.equals(while.\u00d8O\u00d4000) && !J.super(while.\u00d30\u00d2000, p2) && p2.\u00d400000() != 7 && !p2.equals(while.\u00d3o\u00d5000.toString()) && !p2.\u00d4O0000().equals("Dolch") && !p2.\u00f800000() && !p2.\u00d4O0000().equals("Fluch") && !p2.toString().startsWith("Zaubertanz") && !p2.equals(while.\u00d3\u00f5\u00d5000.toString()) && !p2.equals(while.\u00f6\u00f8\u00d2000.toString()) && !p2.equals(while.\u00d6\u00f5\u00d4000.toString()) && !p2.equals(while.\u00d3\u00f5\u00d4000.toString()) && !p2.equals(while.\u00d3\u00d3\u00f6000.toString()) && p2.\u00d400000() != 12 && !p2.new() && !p2.\u00d4\u00d20000() && !p2.equals(while.\u00d60O000.toString()) && !p2.equals(while.\u00f6\u00f6\u00f6000.toString()) && !p2.equals(while.privateifObject.toString()) && !p2.toString().startsWith("Zibilja-Ritual") && !p2.\u00d500000() && !p2.\u00d3O0000() && !bl2 && !(p2 instanceof privatesuper) && !J.super(while.o\u00d3\u00f6000, p2) && !p2.equals(while.o\u00d8\u00d2000) && !J.super(while.newvoidclass, p2) && !J.super(while.\u00d2o\u00d2000, p2) && !J.super(while.o\u00f4\u00d5000, p2) && !J.super(while.\u00d8\u00f6\u00d2000, p2) && !J.super(while.\u00f8\u00d3\u00d4000, p2) && !J.super(while.\u00f6\u00d6\u00d2000, p2) && !J.super(while.\u00d3\u00d2\u00d6000, p2)) continue;
                this.o00000(p2, f2, "GG/EG " + f2);
            }
        }
    }

    private void o00000(OOOo oOOo) {
        HashMap<oo0o_0, ArrayList<String>> hashMap = this.\u00d200000.\u00f5O0000().\u00d500000();
        for (helden.framework.D.K k2 : oOOo.String()) {
            int n = 1;
            ArrayList<String> arrayList = hashMap.get(k2.o\u00d30000());
            if (arrayList != null) {
                n += arrayList.size();
            }
            this.o00000(k2, n);
            if (this.\u00d800000 || this.\u00d600000(k2) == null || !this.\u00d600000(k2).equals(D.\u00d500000)) continue;
            k2.o00000(k2.o\u00d20000() * 2, "Selbststudium");
        }
    }

    private void o00000(String string, OOOo oOOo, String string2) {
        if (oOOo.\u00d200000(string)) {
            P p2 = oOOo.o00000(string);
            this.o00000(p2, 0.75f, string2);
        }
    }

    private void \u00d200000(String string, OOOo oOOo, String string2) {
        if (oOOo.\u00d200000(string)) {
            P p2 = oOOo.o00000(string);
            this.o00000(p2, 0.5f, string2);
        }
    }

    private void \u00d200000(OOOo oOOo) {
        int n = this.\u00d200000.\u00f5O0000().\u00f8O0000();
        int n2 = 0;
        if (n == 1) {
            n2 = this.\u00d200000.o00000(I.forsupersuper) ? 2000 : 3000;
        }
        if (n == 2) {
            n2 = 4000;
        }
        if (n > 2) {
            n2 = 9999;
        }
        for (P p2 : oOOo) {
            if (!p2.\u00f4O0000() || this.\u00d200000.new(p2.toString())) continue;
            if (p2.equals(while.\u00f8\u00f5\u00d3000) && this.\u00d200000.new(while.\u00d3\u00d2\u00d5000.toString())) {
                n2 = HeldenMath.dreiviertel(n2);
            }
            if (p2.equals(while.\u00d3\u00d2\u00d5000) && this.\u00d200000.new(while.\u00f8\u00f5\u00d3000.toString())) {
                n2 = HeldenMath.dreiviertel(n2);
            }
            if (p2.equals(while.\u00f6\u00f6o000) && this.\u00d200000.new(while.StringwhileString.toString())) {
                n2 = HeldenMath.dreiviertel(n2);
            }
            if (p2.equals(while.\u00f8O\u00f6000) && this.\u00d200000.new(while.StringwhileString.toString())) {
                n2 = HeldenMath.haelfte(n2);
            }
            if (p2.equals(while.StringwhileString) && this.\u00d200000.new(while.\u00f8O\u00f6000.toString())) {
                n2 = HeldenMath.dreiviertel(n2);
            }
            p2.new(n2);
        }
    }

    private void \u00d300000(OOOo oOOo) {
        ArrayList<ArrayList<H>> arrayList = new ArrayList<ArrayList<H>>();
        for (P p2 : this.\u00d200000.\u00f5O0000()) {
            int n;
            ArrayList<H> arrayList2;
            if (!(p2 instanceof public) && !(p2 instanceof oooo_3) || (arrayList2 = B.o00000().o00000(p2.toString())) == null || arrayList.contains(arrayList2)) continue;
            arrayList.add(arrayList2);
            int n2 = 0;
            int n3 = 0;
            String string = "";
            for (n = 0; n < arrayList2.size(); ++n) {
                if (!this.\u00d200000.new(arrayList2.get(n).toString())) continue;
                n2 = n;
                n3 = this.\u00d200000.\u00f5O0000().o00000(arrayList2.get(n).toString()).newnew();
                string = arrayList2.get(n).toString() + " vorhanden!";
            }
            for (n = 0; n < n2; ++n) {
                this.o00000(arrayList2.get(n), oOOo, 0, string);
            }
            for (n = n2 + 1; n < arrayList2.size(); ++n) {
                String string2 = arrayList2.get(n).toString();
                if (!oOOo.\u00d200000(string2)) continue;
                this.o00000(arrayList2.get(n), oOOo, oOOo.o00000(string2).o\u00d20000() - n3, string);
            }
        }
        if (this.\u00d200000.\u00f5O0000().\u00d200000(while.Stringnull.toString()) || this.\u00d200000.\u00f5O0000().\u00d200000(while.whileclassString.toString()) || this.\u00d200000.\u00f5O0000().\u00d200000(while.\u00d8\u00f8\u00d8000.toString())) {
            this.o00000(while.Stringnull, oOOo, 0);
            this.o00000(while.whileclassString, oOOo, 0);
            this.o00000(while.\u00d8\u00f8\u00d8000, oOOo, 0);
        } else {
            this.o00000(while.Stringnull, oOOo, 50);
            this.o00000(while.whileclassString, oOOo, 100);
            this.o00000(while.\u00d8\u00f8\u00d8000, oOOo, 150);
        }
        if (this.\u00d200000.\u00f5O0000().\u00d200000(while.\u00d3\u00f5O000.toString()) || this.\u00d200000.\u00f5O0000().\u00d200000(while.\u00d3\u00d2\u00d8000.toString()) || this.\u00d200000.\u00f5O0000().\u00d200000(while.o\u00d2\u00d8000.toString()) || this.\u00d200000.\u00f5O0000().\u00d200000(while.\u00f8o\u00d8000.toString())) {
            this.o00000(while.\u00d3\u00d2\u00d8000, oOOo, 0);
            this.o00000(while.o\u00d2\u00d8000, oOOo, 0);
            this.o00000(while.\u00f8o\u00d8000, oOOo, 0);
        } else {
            this.o00000(while.\u00d3\u00f5O000, oOOo, 50);
            this.o00000(while.\u00d3\u00d2\u00d8000, oOOo, 100);
            this.o00000(while.o\u00d2\u00d8000, oOOo, 200);
            this.o00000(while.\u00f8o\u00d8000, oOOo, 250);
        }
        if (this.\u00d200000.\u00f5O0000().\u00d200000(while.\u00d5\u00d8\u00d6000.toString()) || this.\u00d200000.\u00f5O0000().\u00d200000(while.returnpublicObject.toString())) {
            this.o00000(while.\u00d5\u00d8\u00d6000, oOOo, 0);
            this.o00000(while.returnpublicObject, oOOo, 0);
        } else {
            this.o00000(while.\u00d5\u00d8\u00d6000, oOOo, 150);
            this.o00000(while.returnpublicObject, oOOo, 200);
        }
        if (this.\u00d200000.\u00f5O0000().\u00d200000(while.\u00f6\u00f6\u00d6000.toString()) || this.\u00d200000.\u00f5O0000().\u00d200000(while.newintString.toString())) {
            this.o00000(while.\u00f6\u00f6\u00d6000, oOOo, 0);
            this.o00000(while.newintString, oOOo, 0);
        } else {
            this.o00000(while.\u00f6\u00f6\u00d6000, oOOo, 150);
            this.o00000(while.newintString, oOOo, 200);
        }
        if (this.\u00d200000.\u00f5O0000().\u00d200000(while.\u00f8\u00d4\u00d6000.toString()) || this.\u00d200000.\u00f5O0000().\u00d200000(while.\u00d5\u00f5\u00d4000.toString())) {
            this.o00000(while.\u00f8\u00d4\u00d6000, oOOo, 0);
            this.o00000(while.\u00d5\u00f5\u00d4000, oOOo, 0);
        } else {
            this.o00000(while.\u00f8\u00d4\u00d6000, oOOo, 150);
            this.o00000(while.\u00d5\u00f5\u00d4000, oOOo, 200);
        }
        if (this.\u00d200000.\u00f5O0000().\u00d200000(while.\u00f8\u00f4\u00f6000.toString()) || this.\u00d200000.\u00f5O0000().\u00d200000(while.\u00d5o\u00d2000.toString()) || this.\u00d200000.\u00f5O0000().\u00d200000(while.ifintsuper.toString()) || this.\u00d200000.\u00f5O0000().\u00d200000(while.\u00d3o\u00d2000.toString())) {
            this.o00000(while.\u00d5o\u00d2000, oOOo, 0);
            this.o00000(while.ifintsuper, oOOo, 0);
            this.o00000(while.\u00d3o\u00d2000, oOOo, 0);
        } else {
            this.o00000(while.\u00f8\u00f4\u00f6000, oOOo, 50);
            this.o00000(while.\u00d5o\u00d2000, oOOo, 100);
            this.o00000(while.ifintsuper, oOOo, 150);
            this.o00000(while.\u00d3o\u00d2000, oOOo, 250);
        }
        if (this.\u00d200000.\u00f5O0000().\u00d200000(while.nullforclass.toString()) || this.\u00d200000.\u00f5O0000().\u00d200000(while.thisprivateString.toString())) {
            this.o00000(while.nullforclass, oOOo, 0);
            this.o00000(while.thisprivateString, oOOo, 0);
        } else {
            this.o00000(while.nullforclass, oOOo, 100);
            this.o00000(while.thisprivateString, oOOo, 150);
        }
        if (this.\u00d200000.\u00f5O0000().\u00d200000(while.\u00d3\u00d4\u00d2000.toString()) || this.\u00d200000.\u00f5O0000().\u00d200000(while.\u00f5\u00d20000.toString())) {
            this.o00000(while.\u00d3\u00d4\u00d2000, oOOo, 0);
            this.o00000(while.\u00f5\u00d20000, oOOo, 0);
        } else {
            this.o00000(while.\u00d3\u00d4\u00d2000, oOOo, 100);
            this.o00000(while.\u00f5\u00d20000, oOOo, 150);
        }
        if (this.\u00d200000.\u00f5O0000().\u00d200000(while.thiswhileclass.toString()) || this.\u00d200000.\u00f5O0000().\u00d200000(while.privatewhile.toString())) {
            this.o00000(while.thiswhileclass, oOOo, 0);
            this.o00000(while.privatewhile, oOOo, 0);
        } else {
            this.o00000(while.thiswhileclass, oOOo, 150);
            this.o00000(while.privatewhile, oOOo, 200);
        }
    }

    private void o00000(P p2, int n, String string) {
        if (p2 instanceof void) {
            void void_ = (void)p2;
            void_.new(n, string);
        } else {
            p2.o00000(n, string);
        }
    }

    private void o00000(H h2, OOOo oOOo, int n) {
        this.o00000(h2, oOOo, n, "");
    }

    private void o00000(H h2, OOOo oOOo, int n, String string) {
        if (oOOo.\u00d200000(h2.toString())) {
            this.o00000(oOOo.o00000(h2.toString()), n, string);
        }
    }

    private void o00000(P p2, float f2, String string) {
        if (p2 instanceof F) {
            F f3 = (F)p2;
            f3.o00000(null, f2);
        } else if (p2 instanceof void) {
            void void_ = (void)p2;
            void_.o00000(f2, string);
        } else {
            p2.o00000(Math.round(f2 * (float)p2.o\u00d20000()), string);
        }
    }

    private void o00000(String string, OOOo oOOo, float f2, String string2) {
        if (oOOo.\u00d200000(string)) {
            P p2 = oOOo.o00000(string);
            this.o00000(p2, f2, string2);
        }
    }

    private void o00000(OOOo oOOo, for for_, String string) {
        for (P p2 : oOOo) {
            P p3;
            if (p2 instanceof Q) {
                helden.framework.held.object.oooo_0.new("AuwahlSonderfertigkeit in SFVermittler! " + p2, "alle");
                continue;
            }
            if (p2 instanceof F) {
                if (!p2.\u00f500000().equals(for_.getBezeichner())) continue;
                p3 = (F)p2;
                for (Object t : for_.getAuswahlen()) {
                    ((F)p3).o00000((R)t, 0.5f);
                }
                continue;
            }
            if (p2 instanceof void) {
                if (!p2.\u00f500000().equals(for_.getBezeichner())) continue;
                p3 = (void)p2;
                for (Object t : for_.getAuswahlen()) {
                    Object t2 = ((void)p3).\u00f400000(t.toString());
                    if (t2 == null) {
                        ((void)p3).new(t, p3.o\u00d20000());
                        t2 = ((void)p3).\u00f400000(t.toString());
                    }
                    if (t2 == null) {
                        private.\u00d200000("'" + t.toString() + "' kann nicht zu " + ((void)p3).toString() + " hinzugef\u00fcgt werden", "alle");
                        continue;
                    }
                    ((void)p3).o00000(t2, HeldenMath.haelfte(((void)p3).return(t2)));
                }
                continue;
            }
            if (p2 instanceof helden.framework.D.K) {
                p3 = (helden.framework.D.K)p2;
                if (!for_.o00000() || !for_.Object().equals(((helden.framework.D.K)p3).o\u00d30000()) || !for_.getAuswahlen().contains(((helden.framework.D.K)p3).\u00f5\u00d20000())) continue;
                p2.o00000(HeldenMath.haelfte(p2.o\u00d20000()), string);
                continue;
            }
            if (!p2.\u00f500000().equals(for_.getBezeichner())) continue;
            p2.o00000(HeldenMath.haelfte(p2.o\u00d20000()), string);
        }
    }

    private void \u00d300000(String string, OOOo oOOo, String string2) {
        if (oOOo.\u00d200000(string)) {
            P p2 = oOOo.o00000(string);
            this.o00000(p2, 2.0f, string2);
        }
    }
}

