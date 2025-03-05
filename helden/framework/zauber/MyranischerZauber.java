/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.zauber;

import helden.framework.OOoO.A;
import helden.framework.OOoO.K;
import helden.framework.OOoO.L;
import helden.framework.OOoO.if;
import helden.framework.OOoO.o00O;
import helden.framework.oooo.b_0;
import helden.framework.oooo.l_0;
import helden.framework.oooo.oooo_1;
import helden.framework.oooo.s_0;
import helden.framework.settings.Settings;
import helden.framework.zauber.Zauber;
import java.util.ArrayList;
import java.util.HashMap;

public class MyranischerZauber
extends Zauber {
    private static ArrayList<MyranischerZauber> \u00f8\u00d3\u00d5000;
    private static ArrayList<MyranischerZauber> O\u00d4\u00d5000;
    private static ArrayList<MyranischerZauber> \u00f5\u00d3\u00d5000;
    private static HashMap<String, MyranischerZauber> StringsuperObject;
    private static ArrayList<K> nullsuperObject;
    private L o\u00d4\u00d5000;

    public static ArrayList<MyranischerZauber> getEZauber() {
        if (\u00f5\u00d3\u00d5000 == null) {
            \u00f5\u00d3\u00d5000 = new ArrayList();
            for (MyranischerZauber myranischerZauber : MyranischerZauber.getMyranischeZauber()) {
                if (!myranischerZauber.getZauberArt().equals((Object)L.o00000)) continue;
                \u00f5\u00d3\u00d5000.add(myranischerZauber);
            }
        }
        return \u00f5\u00d3\u00d5000;
    }

    public static s_0 getKatFuerMerkmal(L l2, o00O o00O2) {
        switch (l2) {
            case o00000: {
                if (o00O2.equals(o00O.OO0000)) {
                    return s_0.\u00f600000;
                }
                if (o00O2.equals(o00O.\u00d8\u00d40000)) {
                    return s_0.\u00f500000;
                }
                return s_0.o00000;
            }
            case \u00d500000: {
                return s_0.\u00f600000;
            }
        }
        return null;
    }

    public static ArrayList<MyranischerZauber> getMyranischeZauber() {
        return \u00f8\u00d3\u00d5000;
    }

    public static l_0 getTalentprobe(o00O o00O2) {
        switch (o00O2.void()) {
            case o00000: {
                return new l_0(b_0.whilewhilesuper, b_0.newwhilesuper, b_0.\u00d5\u00f4\u00d2000);
            }
            case \u00d400000: {
                return new l_0(b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.\u00d5\u00f4\u00d2000);
            }
            case \u00d500000: {
                return new l_0(b_0.whilewhilesuper, b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000);
            }
            case \u00d800000: {
                return new l_0(b_0.whilewhilesuper, b_0.newwhilesuper, b_0.\u00f8\u00f4\u00d2000);
            }
            case \u00f500000: {
                return new l_0(b_0.whilewhilesuper, b_0.whilewhilesuper, b_0.\u00d5\u00f4\u00d2000);
            }
        }
        return new l_0(b_0.o\u00f5\u00d2000, b_0.o\u00f5\u00d2000, b_0.o\u00f5\u00d2000);
    }

    public static ArrayList<MyranischerZauber> getWZauber() {
        if (O\u00d4\u00d5000 == null) {
            O\u00d4\u00d5000 = new ArrayList();
            for (MyranischerZauber myranischerZauber : MyranischerZauber.getMyranischeZauber()) {
                if (!myranischerZauber.getZauberArt().equals((Object)L.\u00d500000)) continue;
                O\u00d4\u00d5000.add(myranischerZauber);
            }
        }
        return O\u00d4\u00d5000;
    }

    public static MyranischerZauber getZauber(o00O o00O2, L l2) {
        return StringsuperObject.get(l2.toString() + o00O2.toString());
    }

    public static MyranischerZauber getZauber(String string) {
        MyranischerZauber myranischerZauber = StringsuperObject.get(string);
        if (myranischerZauber == null) {
            throw new RuntimeException("Zauber " + string + " nicht gefunden!");
        }
        return myranischerZauber;
    }

    public static void init() {
        if (\u00f8\u00d3\u00d5000 != null) {
            return;
        }
        ArrayList<MyranischerZauber> arrayList = new ArrayList<MyranischerZauber>();
        arrayList.add(new MyranischerZauber(o00O.\u00f6O0000, L.o00000));
        arrayList.add(new MyranischerZauber(o00O.\u00d4O0000, L.o00000));
        arrayList.add(new MyranischerZauber(o00O.\u00d800000, L.o00000));
        arrayList.add(new MyranischerZauber(o00O.\u00d2\u00d20000, L.o00000));
        arrayList.add(new MyranischerZauber(o00O.super, L.o00000));
        arrayList.add(new MyranischerZauber(o00O.\u00d4\u00d20000, L.o00000));
        arrayList.add(new MyranischerZauber(o00O.OO0000, L.o00000));
        arrayList.add(new MyranischerZauber(o00O.\u00d2\u00d50000, L.o00000));
        arrayList.add(new MyranischerZauber(o00O.\u00d8\u00d20000, L.o00000));
        arrayList.add(new MyranischerZauber(o00O.\u00f6\u00d20000, L.o00000));
        arrayList.add(new MyranischerZauber(o00O.class, L.o00000));
        arrayList.add(new MyranischerZauber(o00O.supernew, L.o00000));
        arrayList.add(new MyranischerZauber(o00O.O\u00d20000, L.o00000));
        arrayList.add(new MyranischerZauber(o00O.\u00f4\u00d30000, L.o00000));
        arrayList.add(new MyranischerZauber(o00O.intnew, L.o00000));
        arrayList.add(new MyranischerZauber(o00O.\u00d3o0000, L.o00000));
        arrayList.add(new MyranischerZauber(o00O.\u00d4\u00d40000, L.o00000));
        arrayList.add(new MyranischerZauber(o00O.\u00d2\u00d30000, L.o00000));
        arrayList.add(new MyranischerZauber(o00O.\u00f8O0000, L.o00000));
        arrayList.add(new MyranischerZauber(o00O.\u00f4o0000, L.o00000));
        arrayList.add(new MyranischerZauber(o00O.\u00f8o0000, L.o00000));
        arrayList.add(new MyranischerZauber(o00O.\u00d8O0000, L.o00000));
        arrayList.add(new MyranischerZauber(o00O.superString, L.o00000));
        arrayList.add(new MyranischerZauber(o00O.\u00f8\u00d30000, L.o00000));
        arrayList.add(new MyranischerZauber(o00O.publicObject, L.o00000));
        arrayList.add(new MyranischerZauber(o00O.\u00f6\u00d30000, L.o00000));
        arrayList.add(new MyranischerZauber(o00O.\u00f6o0000, L.o00000));
        arrayList.add(new MyranischerZauber(o00O.\u00d8\u00d30000, L.o00000));
        arrayList.add(new MyranischerZauber(o00O.\u00d2\u00d40000, L.o00000));
        arrayList.add(new MyranischerZauber(o00O.\u00f8\u00d40000, L.o00000));
        arrayList.add(new MyranischerZauber(o00O.\u00f4\u00d20000, L.o00000));
        arrayList.add(new MyranischerZauber(o00O.\u00d8\u00d40000, L.o00000));
        arrayList.add(new MyranischerZauber(o00O.O\u00d50000, L.o00000));
        arrayList.add(new MyranischerZauber(o00O.\u00d3\u00d40000, L.o00000));
        arrayList.add(new MyranischerZauber(o00O.\u00f6O0000, L.\u00d500000));
        arrayList.add(new MyranischerZauber(o00O.\u00d4O0000, L.\u00d500000));
        arrayList.add(new MyranischerZauber(o00O.\u00d800000, L.\u00d500000));
        arrayList.add(new MyranischerZauber(o00O.\u00d2\u00d20000, L.\u00d500000));
        arrayList.add(new MyranischerZauber(o00O.super, L.\u00d500000));
        arrayList.add(new MyranischerZauber(o00O.\u00d4\u00d20000, L.\u00d500000));
        arrayList.add(new MyranischerZauber(o00O.int, L.\u00d500000));
        arrayList.add(new MyranischerZauber(o00O.\u00d6\u00d30000, L.\u00d500000));
        arrayList.add(new MyranischerZauber(o00O.ObjectObject, L.\u00d500000));
        arrayList.add(new MyranischerZauber(o00O.\u00d2\u00d50000, L.\u00d500000));
        arrayList.add(new MyranischerZauber(o00O.\u00d8\u00d20000, L.\u00d500000));
        arrayList.add(new MyranischerZauber(o00O.\u00f6\u00d20000, L.\u00d500000));
        arrayList.add(new MyranischerZauber(o00O.class, L.\u00d500000));
        arrayList.add(new MyranischerZauber(o00O.supernew, L.\u00d500000));
        arrayList.add(new MyranischerZauber(o00O.O\u00d20000, L.\u00d500000));
        arrayList.add(new MyranischerZauber(o00O.\u00f4\u00d30000, L.\u00d500000));
        arrayList.add(new MyranischerZauber(o00O.intnew, L.\u00d500000));
        arrayList.add(new MyranischerZauber(o00O.\u00d3o0000, L.\u00d500000));
        arrayList.add(new MyranischerZauber(o00O.\u00d4\u00d40000, L.\u00d500000));
        arrayList.add(new MyranischerZauber(o00O.\u00d2\u00d30000, L.\u00d500000));
        arrayList.add(new MyranischerZauber(o00O.\u00f8O0000, L.\u00d500000));
        arrayList.add(new MyranischerZauber(o00O.\u00f4o0000, L.\u00d500000));
        arrayList.add(new MyranischerZauber(o00O.\u00f8o0000, L.\u00d500000));
        arrayList.add(new MyranischerZauber(o00O.\u00d8O0000, L.\u00d500000));
        arrayList.add(new MyranischerZauber(o00O.superString, L.\u00d500000));
        arrayList.add(new MyranischerZauber(o00O.\u00f8\u00d30000, L.\u00d500000));
        arrayList.add(new MyranischerZauber(o00O.publicObject, L.\u00d500000));
        arrayList.add(new MyranischerZauber(o00O.\u00f6\u00d30000, L.\u00d500000));
        arrayList.add(new MyranischerZauber(o00O.\u00f6o0000, L.\u00d500000));
        arrayList.add(new MyranischerZauber(o00O.\u00d8\u00d30000, L.\u00d500000));
        arrayList.add(new MyranischerZauber(o00O.\u00d2\u00d40000, L.\u00d500000));
        arrayList.add(new MyranischerZauber(o00O.\u00f8\u00d40000, L.\u00d500000));
        arrayList.add(new MyranischerZauber(o00O.\u00f4\u00d20000, L.\u00d500000));
        arrayList.add(new MyranischerZauber(o00O.O\u00d50000, L.\u00d500000));
        arrayList.add(new MyranischerZauber(o00O.\u00d3\u00d40000, L.\u00d500000));
        \u00f8\u00d3\u00d5000 = arrayList;
        StringsuperObject = new HashMap();
        for (MyranischerZauber myranischerZauber : arrayList) {
            StringsuperObject.put(myranischerZauber.toString(), myranischerZauber);
        }
    }

    public static boolean zauberExists(String string) {
        MyranischerZauber myranischerZauber = StringsuperObject.get(string);
        return myranischerZauber != null;
    }

    public MyranischerZauber(o00O o00O2, L l2) {
        super(l2.toString() + o00O2.toString(), MyranischerZauber.getKatFuerMerkmal(l2, o00O2), MyranischerZauber.getTalentprobe(o00O2), new o00O[]{o00O2}, new oooo_1("MyMa", 0), "");
        this.o\u00d4\u00d5000 = l2;
        if (nullsuperObject == null) {
            nullsuperObject = new ArrayList();
            Settings settings = Settings.getSettingByName("Myranor");
            for (K k2 : K.\u00d400000()) {
                if (!settings.contains(k2)) continue;
                nullsuperObject.add(k2);
            }
        }
        for (K k3 : nullsuperObject) {
            this.addVerbreitung(k3, 4);
        }
        this.\u00d6\u00d60000();
    }

    public if getSphare() {
        return this.getMerkmale(null)[0].void();
    }

    public L getZauberArt() {
        return this.o\u00d4\u00d5000;
    }

    private void \u00d6\u00d60000() {
        switch (this.o\u00d4\u00d5000) {
            case \u00d500000: {
                this.addSpezialisierungen("Geist/Inspiration");
                this.addSpezialisierungen("Genius/Inspiration");
                this.addSpezialisierungen("Archon/Inspiration");
                this.addSpezialisierungen("Geist/Invokation");
                this.addSpezialisierungen("Genius/Invokation");
                this.addSpezialisierungen("Archon/Invokation");
                break;
            }
            case o00000: {
                for (A a2 : A.o00000()) {
                    this.addSpezialisierungen(a2.toString());
                }
                break;
            }
        }
    }
}

