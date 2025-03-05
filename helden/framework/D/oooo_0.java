/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.d;

import helden.framework.D.F;
import helden.framework.D.H;
import helden.framework.D.K;
import helden.framework.D.OOOo;
import helden.framework.D.Object.D;
import helden.framework.D.Object.new;
import helden.framework.D.P;
import helden.framework.D.Q;
import helden.framework.D.void;
import helden.framework.D.while;
import helden.framework.Einstellungen;
import helden.framework.OOoO.R;
import helden.framework.OOoO.Y;
import helden.framework.OoOO.N;
import helden.framework.held.Object.private;
import helden.framework.held.persistenz.ModsDatenParser;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.JOptionPane;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from helden.framework.D.OoOo
 */
public final class oooo_0 {
    private static HashMap<String, P> \u00d200000;
    private static OOOo super;

    public static OOOo Object() {
        if (super == null) {
            try {
                super = new.o00000();
            }
            catch (Exception exception) {
                System.out.println(exception.toString());
                exception.printStackTrace();
            }
        }
        return super;
    }

    public static P o00000(H h2) {
        return oooo_0.o00000(h2.toString());
    }

    public static P o00000(H h2, String string) {
        return oooo_0.o00000(h2.toString(), string);
    }

    public static P o00000(String string) {
        oooo_0.\u00f600000();
        P p2 = \u00d200000.get(string);
        P p3 = null;
        try {
            if (p2 == null) {
                if (Einstellungen.getInstance().isTestMode()) {
                    JOptionPane.showMessageDialog(null, "Unbekannte Sonderfertigkeit: " + string, "Fehler", -1);
                }
                throw new RuntimeException("Unbekannte Sonderfertigkeit: " + string);
            }
            p3 = (P)p2.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            private.\u00d200000(cloneNotSupportedException.getMessage(), "alle");
        }
        return p3;
    }

    public static P o00000(String string, R r) {
        F f2 = (F)oooo_0.o00000(string.toString());
        f2.\u00d3\u00d40000();
        f2.new(r);
        return f2;
    }

    public static P o00000(String string, String string2) {
        void void_ = (void)oooo_0.o00000(string.toString());
        void_.\u00d500000(string2);
        return void_;
    }

    public static ArrayList<P> o00000() {
        ArrayList<P> arrayList = new ArrayList<P>();
        for (P p2 : super) {
            if (!p2.\u00f5O0000()) continue;
            arrayList.add(p2);
        }
        return arrayList;
    }

    public static HashMap<String, P> \u00f500000() {
        oooo_0.\u00f600000();
        return \u00d200000;
    }

    public static ArrayList<P> \u00d600000() {
        ArrayList<P> arrayList = new ArrayList<P>();
        for (P p2 : oooo_0.\u00f500000().values()) {
            if (!p2.\u00d4o0000()) continue;
            arrayList.add(p2);
        }
        return arrayList;
    }

    public static ArrayList<P> \u00d500000() {
        return D.o00000();
    }

    public static P o00000(P p2) {
        P p3 = null;
        if (p2 instanceof Q) {
            Q q = (Q)p2;
            p3 = oooo_0.o00000(q.\u00d4\u00d30000().\u00f500000());
        } else {
            p3 = oooo_0.o00000(p2.toString());
        }
        return p3;
    }

    public static ArrayList<P> \u00f400000() {
        return oooo_0.Object().\u00d8O0000();
    }

    public static ArrayList<P> void() {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(super.o00000(while.\u00d6oo000.toString()));
        arrayList.add(super.o00000(while.\u00f6\u00d2\u00d2000.toString()));
        arrayList.add(super.o00000(while.\u00f5\u00d4\u00f4000.toString()));
        arrayList.add(super.o00000(while.returnclassObject.toString()));
        arrayList.add(super.o00000(while.ifinterface.toString()));
        arrayList.add(super.o00000(while.\u00f8\u00d8\u00d3000.toString()));
        return arrayList;
    }

    public static ArrayList<P> o00000(oo0o_0 oo0o_02) {
        N.floatsuper();
        ArrayList<P> arrayList = new ArrayList<P>();
        ArrayList<String> arrayList2 = oo0o_02.getSpezialisierungen();
        if (arrayList2 != null) {
            for (String string : arrayList2) {
                K k2 = K.o00000(oo0o_02, string);
                arrayList.add(k2);
            }
        }
        return arrayList;
    }

    public static ArrayList<P> \u00d200000(oo0o_0 oo0o_02) {
        oooo_0.\u00f600000();
        KonkreterZauber konkreterZauber = (KonkreterZauber)oo0o_02;
        ArrayList<P> arrayList = new ArrayList<P>();
        ArrayList<String> arrayList2 = konkreterZauber.getSpezialisierungen();
        if (arrayList2 != null) {
            for (String string : arrayList2) {
                K k2 = K.new(oo0o_02, string, true);
                if (\u00d200000.get(k2.toString()) == null) {
                    \u00d200000.put(k2.toString(), k2);
                }
                arrayList.add(k2);
            }
        }
        return arrayList;
    }

    public static ArrayList<P> \u00d200000() {
        ArrayList<P> arrayList = oooo_0.void();
        arrayList.add(super.o00000(while.nullnewnew.toString()));
        arrayList.add(super.o00000(while.\u00d8\u00d3\u00f4000.toString()));
        arrayList.add(super.o00000(while.Stringnull.toString()));
        arrayList.add(super.o00000(while.\u00d2O\u00f5000.toString()));
        arrayList.add(super.o00000(while.\u00f5\u00d5\u00d4000.toString()));
        arrayList.add(super.o00000(while.\u00f50O000.toString()));
        return arrayList;
    }

    private static synchronized void \u00f600000() {
        if (\u00d200000 == null) {
            \u00d200000 = new HashMap();
            for (P p2 : oooo_0.Object()) {
                \u00d200000.put(p2.\u00f500000(), p2);
            }
            Iterator<P> iterator = oooo_0.Object().null();
            while (iterator.hasNext()) {
                P p2;
                p2 = iterator.next();
                \u00d200000.put(p2.toString(), p2);
            }
            oooo_0.\u00d400000();
        }
    }

    private static void \u00d400000() {
        FilenameFilter filenameFilter;
        File file = new File(Einstellungen.getInstance().getPfade().getPfad("mods") + "/Formel");
        File[] fileArray = file.listFiles(filenameFilter = new FilenameFilter(){

            public boolean accept(File file, String string) {
                return string.toLowerCase().endsWith(".xml");
            }
        });
        if (fileArray != null) {
            for (File file2 : fileArray) {
                Y y2 = ModsDatenParser.getInstance().einlesenFormel(file2);
                if (y2.Objectreturn()) continue;
                y2.\u00f6\u00d80000();
            }
        }
    }

    private oooo_0() {
    }
}

