/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.settings;

import helden.framework.C.public;
import helden.framework.D.H;
import helden.framework.D.K;
import helden.framework.D.P;
import helden.framework.D.Q;
import helden.framework.D.for;
import helden.framework.D.o0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.D.void;
import helden.framework.E.F;
import helden.framework.OOoO.R;
import helden.framework.OOoO.o00O;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.OooO.C;
import helden.framework.d.oooo_0;
import helden.framework.held.Object.private;
import helden.framework.int.L;
import helden.framework.int.OooO;
import helden.framework.int.o0oo_0;
import helden.framework.int.super;
import helden.framework.namen.daten.Namengenerator;
import helden.framework.oooo.b_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.settings.Setting;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import helden.model.kultur.EigeneKultur;
import helden.model.profession.EigeneProfession;
import helden.model.rasse.EigeneRasse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;

public class Settings {
    public static final String \u00d200000 = "Myranor";
    private static ArrayList<Settings> \u00d300000;
    protected ArrayList<Setting> o00000 = new ArrayList();
    protected Setting String;

    public static Settings getAlleEchteSettings() {
        Settings settings = new Settings(Setting.o00000);
        for (Setting setting : Setting.values()) {
            if (setting.equals((Object)Setting.\u00d600000)) continue;
            settings.addIncludeSetting(setting);
        }
        return settings;
    }

    public static ArrayList<Settings> getHauptSettings() {
        ArrayList<Settings> arrayList = new ArrayList<Settings>();
        for (Settings settings : Settings.getSettings()) {
            if (!settings.isHauptsetting()) continue;
            try {
                arrayList.add((Settings)settings.clone());
            }
            catch (Exception exception) {
                helden.framework.held.object.oooo_0.o00000(exception);
            }
        }
        return arrayList;
    }

    public static Settings getSettingByName(String string) {
        Setting.initAll();
        if (string.equals("DSA 4.1 und Unter dem Westwind")) {
            Settings settings = Settings.getSettingByName("DSA4.1");
            settings.addIncludeSetting("Unter dem Westwind");
            settings.addIncludeSetting("Wege der Alchimie");
            return settings;
        }
        if (string.equals("DSA 4.1")) {
            Settings settings = Settings.getSettingByName("DSA4.1");
            settings.addIncludeSetting("Wege der Alchimie");
            return settings;
        }
        for (Settings settings : Settings.getSettings()) {
            if (!settings.getName().equals(string)) continue;
            try {
                return (Settings)settings.clone();
            }
            catch (Exception exception) {
                helden.framework.held.object.oooo_0.o00000(exception);
            }
        }
        private.\u00d200000("Setting " + string + " nicht gefunden!", "immer");
        return null;
    }

    public static synchronized ArrayList<Settings> getSettings() {
        if (\u00d300000 == null) {
            \u00d300000 = new ArrayList();
            for (Setting setting : Setting.getSettings()) {
                \u00d300000.add(new Settings(setting));
            }
        }
        return \u00d300000;
    }

    public static Settings getSettingsBySetting(Setting setting) {
        Setting.initAll();
        for (Settings settings : Settings.getSettings()) {
            if (!settings.o00000().contains((Object)setting)) continue;
            try {
                return (Settings)settings.clone();
            }
            catch (Exception exception) {
                helden.framework.held.object.oooo_0.o00000(exception);
            }
        }
        private.\u00d200000("Setting " + (Object)((Object)setting) + " nicht gefunden!", "immer");
        return null;
    }

    protected Settings(Setting setting) {
        this.String = setting;
    }

    public void addIncludeSetting(Setting setting) {
        this.o00000.add(setting);
    }

    public void addIncludeSetting(String string) {
        for (Setting setting : this.getOptionaleSettings()) {
            if (!setting.getName().equals(string) || this.o00000.contains((Object)setting)) continue;
            this.o00000.add(setting);
        }
    }

    public RESULT checkString(String string) {
        if (this.String.containsAsExcluded(string)) {
            return RESULT.o00000;
        }
        if (this.String.contains(string)) {
            return RESULT.Object;
        }
        for (Setting setting : this.o00000) {
            if (setting.containsAsExcluded(string)) {
                return RESULT.o00000;
            }
            if (!setting.contains(string)) continue;
            return RESULT.Object;
        }
        return RESULT.\u00d400000;
    }

    public boolean contains(F f2) {
        return this.checkString("G" + f2.OO0000()).equals((Object)RESULT.Object);
    }

    public boolean contains(OooO oooO2, helden.framework.int.P p2) {
        if (oooO2 instanceof EigeneKultur) {
            return true;
        }
        return this.o00000(oooO2.getID(), p2);
    }

    public boolean contains(o00O o00O2) {
        return this.checkString("M" + o00O2.toString()).equals((Object)RESULT.Object);
    }

    public boolean contains(Namengenerator namengenerator) {
        return this.checkString("NG" + namengenerator.getBezeichnung()).equals((Object)RESULT.Object);
    }

    public boolean contains(Object object) {
        if (object instanceof P) {
            return this.contains((P)object);
        }
        if (object instanceof KonkreterZauber) {
            return this.contains(((KonkreterZauber)object).getZauber());
        }
        if (object instanceof Zauber) {
            return this.contains((Zauber)object);
        }
        if (object instanceof voidsuper) {
            return this.contains((voidsuper)object);
        }
        if (object instanceof F) {
            return this.contains((F)object);
        }
        if (object instanceof o00O) {
            return this.contains((o00O)object);
        }
        if (object instanceof L) {
            L l2 = (L)object;
            helden.framework.int.P p2 = null;
            if (l2.getGewaehlteVarianten().size() > 0) {
                p2 = l2.getGewaehlteVarianten().get(0);
            }
            return this.contains(l2, p2);
        }
        if (object instanceof super) {
            super super_ = (super)object;
            helden.framework.int.P p3 = null;
            return this.contains(super_, p3);
        }
        if (object instanceof OooO) {
            OooO oooO2 = (OooO)object;
            helden.framework.int.P p4 = null;
            if (oooO2.getGewaehlteVarianten().size() > 0) {
                p4 = oooO2.getGewaehlteVarianten().get(0);
            }
            return this.contains(oooO2, p4);
        }
        if (object instanceof o0oo_0) {
            o0oo_0 o0oo_02 = (o0oo_0)object;
            helden.framework.int.P p5 = null;
            if (o0oo_02.getGewaehlteVarianten().size() > 0) {
                p5 = o0oo_02.getGewaehlteVarianten().get(0);
            }
            return this.contains(o0oo_02, p5);
        }
        if (object instanceof R) {
            R r = (R)object;
            for (int i2 = 0; i2 < r.o00000(); ++i2) {
                if (this.contains(r.o00000(i2))) continue;
                return false;
            }
            return true;
        }
        if (object instanceof b_0) {
            return true;
        }
        if (object instanceof Namengenerator) {
            return this.contains((Namengenerator)object);
        }
        return false;
    }

    public boolean contains(super super_, helden.framework.int.P p2) {
        if (super_ instanceof EigeneProfession) {
            return true;
        }
        return this.o00000(super_.getID(), p2);
    }

    public boolean contains(o0oo_0 o0oo_02, helden.framework.int.P p2) {
        if (o0oo_02 instanceof EigeneRasse) {
            return true;
        }
        return this.o00000(o0oo_02.getID(), p2);
    }

    public boolean contains(helden.framework.OOoO.K k2) {
        return this.checkString("R" + k2.toString()).equals((Object)RESULT.Object);
    }

    public boolean contains(P p2) {
        if (p2 instanceof Q) {
            Q q = (Q)p2;
            if (q.\u00d8\u00d30000() instanceof o0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO) {
                return this.checkString("S" + q.\u00d5\u00d30000() + "#*").equals((Object)RESULT.Object) || this.checkString("S" + q.\u00d5\u00d30000() + "#" + q.\u00d8\u00d30000()).equals((Object)RESULT.Object) || this.checkString("S" + q.\u00d5\u00d30000() + "#" + ((o0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)q.\u00d8\u00d30000()).new()).equals((Object)RESULT.Object);
            }
            return this.checkString("S" + q.\u00d5\u00d30000() + "#*").equals((Object)RESULT.Object) || this.checkString("S" + q.\u00d5\u00d30000() + "#" + q.\u00d8\u00d30000()).equals((Object)RESULT.Object) || this.checkString("S" + q.\u00d5\u00d30000()).equals((Object)RESULT.Object) && this.contains(q.\u00d8\u00d30000());
        }
        if (p2 instanceof void) {
            void void_ = (void)p2;
            return this.checkString("S" + void_.\u00f500000()).equals((Object)RESULT.Object);
        }
        if (p2 instanceof K) {
            return true;
        }
        return this.checkString("S" + p2.toString()).equals((Object)RESULT.Object);
    }

    public boolean contains(voidsuper voidsuper2) {
        return this.checkString("T" + voidsuper2.getID()).equals((Object)RESULT.Object);
    }

    public boolean contains(public public_) {
        return this.checkString("V" + public_.toString()).equals((Object)RESULT.Object) || this.checkString("V" + public_.toString() + "#*").equals((Object)RESULT.Object);
    }

    public boolean contains(Zauber zauber) {
        return this.checkString("Z" + zauber.toString()).equals((Object)RESULT.Object);
    }

    public boolean containsAuswahl(void void_, Object object) {
        return this.checkString("S" + void_.\u00f500000() + "#*").equals((Object)RESULT.Object) || this.checkString("S" + void_.\u00f500000() + "#" + object.toString()).equals((Object)RESULT.Object) || this.checkString("S" + void_.\u00f500000()).equals((Object)RESULT.Object) && this.contains(object);
    }

    public boolean containsAuswahl(public public_, Object object) {
        return this.contains(object) || this.checkString("V" + public_.\u00f4O0000() + "#*").equals((Object)RESULT.Object) || this.checkString("V" + public_.\u00f4O0000() + "#" + object.toString()).equals((Object)RESULT.Object);
    }

    public boolean equals(Object object) {
        if (!(object instanceof Settings)) {
            return false;
        }
        Settings settings = (Settings)object;
        return this.getName().equals(settings.getName());
    }

    public Collection<? extends oo0o_0> get(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1 ... oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1Array) {
        return N.floatsuper().super(this, oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1Array);
    }

    public String getBeschreibung() {
        return this.String.getBeschreibung();
    }

    public ArrayList<String> getBuecher() {
        return this.String.getBuecher();
    }

    public ArrayList<P> getGelaendekunden() {
        ArrayList<P> arrayList = new ArrayList<P>();
        for (P p2 : oooo_0.o00000()) {
            if (!this.contains(p2)) continue;
            arrayList.add(p2);
        }
        return arrayList;
    }

    public Setting getHauptSetting() {
        return this.String;
    }

    public ArrayList<Setting> getIncludedSettings() {
        return this.o00000;
    }

    public String getName() {
        return this.String.oo0000;
    }

    public ArrayList<Setting> getOptionaleSettings() {
        return this.String.getOptionaleSettings();
    }

    public ArrayList<P> getSF(H h2) {
        return this.getSF(h2.toString());
    }

    public ArrayList<P> getSF(String string) {
        P p2 = oooo_0.o00000(string);
        ArrayList<P> arrayList = new ArrayList<P>();
        if (p2 instanceof void) {
            void void_ = (void)p2;
            arrayList.addAll(void_.o00000(this));
        } else {
            arrayList.add(p2);
        }
        C.o00000(arrayList);
        return arrayList;
    }

    public ArrayList<for> getvSF(String string) {
        P p2 = oooo_0.o00000(string);
        ArrayList<for> arrayList = new ArrayList<for>();
        if (p2 instanceof void) {
            void void_ = (void)p2;
            for (Object t : void_.\u00f8\u00d30000()) {
                if (!this.containsAuswahl(void_, t)) continue;
                ArrayList<String> arrayList2 = new ArrayList<String>();
                arrayList2.add(t.toString());
                arrayList.add(new for(arrayList2, p2.\u00f500000(), false));
            }
        } else {
            arrayList.add(new for(string));
        }
        C.o00000(arrayList);
        return arrayList;
    }

    public int hashCode() {
        return this.getName().hashCode();
    }

    public boolean hatSetting(Setting setting) {
        return this.o00000().contains((Object)setting);
    }

    public boolean isHauptsetting() {
        return this.String.isHauptsetting();
    }

    public void removeIncludeSetting(String string) {
        for (Setting setting : this.String.getOptionaleSettings()) {
            if (!setting.getName().equals(string)) continue;
            this.o00000.remove((Object)setting);
        }
    }

    public String toString() {
        return this.String.oo0000;
    }

    public String toStringLong() {
        String string = this.String.oo0000;
        for (Setting setting : this.o00000) {
            string = string + "; " + (Object)((Object)setting);
        }
        return string;
    }

    protected Object clone() throws CloneNotSupportedException {
        Settings settings = new Settings(this.String);
        settings.o00000.addAll(this.o00000);
        return settings;
    }

    private boolean o00000(String string, helden.framework.int.P p2) {
        RESULT rESULT = this.String.checkModifizererRESULT(string, p2);
        if (rESULT.equals((Object)RESULT.Object)) {
            return true;
        }
        if (rESULT.equals((Object)RESULT.o00000)) {
            return false;
        }
        for (Setting setting : this.o00000) {
            rESULT = setting.checkModifizererRESULT(string, p2);
            if (rESULT.equals((Object)RESULT.Object)) {
                return true;
            }
            if (!rESULT.equals((Object)RESULT.o00000)) continue;
            return false;
        }
        return false;
    }

    private Vector<Setting> o00000() {
        Vector<Setting> vector = new Vector<Setting>();
        vector.add(this.String);
        vector.addAll(this.o00000);
        return vector;
    }

    public static enum RESULT {
        Object,
        o00000,
        \u00d400000;

    }
}

