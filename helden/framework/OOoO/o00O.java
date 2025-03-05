/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.OOoO;

import helden.framework.OOoO.if;
import helden.framework.OoOO.X;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class o00O
implements Comparable<Object> {
    private static Map<String, o00O> interface = new HashMap<String, o00O>();
    private static Map<String, o00O> O\u00d40000 = new HashMap<String, o00O>();
    private static Map<String, o00O> \u00f4O0000 = new HashMap<String, o00O>();
    public static final o00O \u00d300000 = new o00O("an", "Antimagie", "Anti", 2, _o.Object);
    public static final o00O \u00d2O0000 = new o00O("be", "Beschw\u00f6rung", "Besw", 2, _o.Object);
    public static final o00O \u00f8\u00d20000 = new o00O("da", "D\u00e4monisch", "D\u00e4mo", 3, _o.Object);
    public static final o00O do = new o00O("dg", "D\u00e4monisch (Agrimoth)", "D\u00e4mo (Agm)", 1, _o.Object);
    public static final o00O \u00d3\u00d20000 = new o00O("dm", "D\u00e4monisch (Amazeroth)", "D\u00e4mo (Amz)", 1, _o.Object);
    public static final o00O interfacenew = new o00O("ds", "D\u00e4monisch (Asfaloth)", "D\u00e4mo (Asf)", 1, _o.Object);
    public static final o00O \u00d2o0000 = new o00O("dh", "D\u00e4monisch (Belhalhar)", "D\u00e4mo (Blh)", 1, _o.Object);
    public static final o00O Objectsuper = new o00O("db", "D\u00e4monisch (Belzhorash)", "D\u00e4mo (Blz)", 1, _o.Object);
    public static final o00O \u00d3\u00d50000 = new o00O("dl", "D\u00e4monisch (Blakharaz)", "D\u00e4mo (Blk)", 1, _o.Object);
    public static final o00O \u00f800000 = new o00O("do", "D\u00e4monisch (Lolgramoth)", "D\u00e4mo (Lol)", 1, _o.Object);
    public static final o00O \u00f600000 = new o00O("dt", "D\u00e4monisch (Thargunitoth)", "D\u00e4mo (Tar)", 1, _o.Object);
    public static final o00O \u00d6o0000 = new o00O("ei", "Eigenschaften", "Eign", 2, _o.Object);
    public static final o00O classnew = new o00O("es", "Einfluss", "Einfl", 2, _o.Object);
    public static final o00O \u00f4\u00d40000 = new o00O("el", "Elementar", "Elem", 3, _o.Object);
    public static final o00O \u00d4\u00d20000 = new o00O("ee", "Elementar (Eis)", "Elem (Eis)", 1, _o.\u00d400000, if.o00000);
    public static final o00O \u00d800000 = new o00O("er", "Elementar (Erz)", "Elem (Erz)", 1, _o.\u00d400000, if.o00000);
    public static final o00O \u00f6O0000 = new o00O("ef", "Elementar (Feuer)", "Elem (Feu)", 1, _o.\u00d400000, if.o00000);
    public static final o00O super = new o00O("eh", "Elementar (Humus)", "Elem (Hum)", 1, _o.\u00d400000, if.o00000);
    public static final o00O \u00d2\u00d20000 = new o00O("eu", "Elementar (Luft)", "Elem (Luf)", 1, _o.\u00d400000, if.o00000);
    public static final o00O \u00d4O0000 = new o00O("ew", "Elementar (Wasser)", "Elem (Was)", 1, _o.\u00d400000, if.o00000);
    public static final o00O O\u00d30000 = new o00O("fo", "Form", "Form", 2, _o.Object);
    public static final o00O \u00d4\u00d30000 = new o00O("ge", "Geisterwesen", "Geis", 1, _o.Object);
    public static final o00O publicsuper = new o00O("he", "Heilung", "Heil", 1, _o.Object);
    public static final o00O Oo0000 = new o00O("hl", "Hellsicht", "Hell", 2, _o.Object);
    public static final o00O floatObject = new o00O("hb", "Herbeirufung", "Rufe", 1, _o.Object);
    public static final o00O \u00d8o0000 = new o00O("hr", "Herrschaft", "Herr", 2, _o.Object);
    public static final o00O \u00d600000 = new o00O("il", "Illusion", "Illu", 1, _o.Object);
    public static final o00O OO0000 = new o00O("kr", "Kraft", "Krft", 2, _o.\u00d400000, if.o00000);
    public static final o00O voidObject = new o00O("li", "Limbus", "Limb", 3, _o.Object);
    public static final o00O \u00d6O0000 = new o00O("me", "Metamagie", "Meta", 3, _o.Object);
    public static final o00O \u00d200000 = new o00O("ob", "Objekt", "Objk", 2, _o.Object);
    public static final o00O \u00d400000 = new o00O("sc", "Schaden", "Scha", 1, _o.Object);
    public static final o00O \u00f6\u00d40000 = new o00O("te", "Telekinese", "Tele", 1, _o.Object);
    public static final o00O floatsuper = new o00O("tp", "Temporal", "Temp", 3, _o.Object);
    public static final o00O \u00f400000 = new o00O("um", "Umwelt", "Umwt", 2, _o.Object);
    public static final o00O \u00d6\u00d40000 = new o00O("ve", "Verst\u00e4ndigung", "Vers", 1, _o.Object);
    public static final o00O \u00d2\u00d50000 = new o00O("ag", "Aggression", "Aggr", 1, _o.o00000, if.\u00d400000);
    public static final o00O \u00d8\u00d20000 = new o00O("bi", "Begierde", "Begi", 1, _o.o00000, if.\u00d400000);
    public static final o00O \u00f6\u00d20000 = new o00O("en", "Endg\u00fcltigkeit", "Endg", 1, _o.o00000, if.\u00d400000);
    public static final o00O class = new o00O("eg", "Erfolg", "erfo", 1, _o.o00000, if.\u00d400000);
    public static final o00O supernew = new o00O("ek", "Erkenntnis", "Erke", 1, _o.o00000, if.\u00d400000);
    public static final o00O O\u00d20000 = new o00O("fr", "Freiheit", "Frei", 1, _o.o00000, if.\u00d400000);
    public static final o00O \u00f4\u00d30000 = new o00O("ha", "Harmonie", "Harm", 1, _o.o00000, if.\u00d400000);
    public static final o00O intnew = new o00O("ke", "Kreativit\u00e4t", "Krea", 1, _o.o00000, if.\u00d400000);
    public static final o00O \u00d3o0000 = new o00O("wa", "Wahnsinn", "Wahn", 1, _o.o00000, if.\u00d400000);
    public static final o00O \u00d4\u00d40000 = new o00O("za", "Zauberei", "Zaub", 1, _o.o00000, if.\u00d400000);
    public static final o00O \u00d2\u00d30000 = new o00O("ty", "Tyakaar", "Tyak", 1, _o.o00000, if.\u00d500000);
    public static final o00O \u00f8O0000 = new o00O("ca", "Carafai", "Cara", 1, _o.o00000, if.\u00d500000);
    public static final o00O \u00f4o0000 = new o00O("ga", "Galkuzul", "Galk", 1, _o.o00000, if.\u00d500000);
    public static final o00O \u00f8o0000 = new o00O("th", "Thesephai", "Thes", 1, _o.o00000, if.\u00d500000);
    public static final o00O \u00d8O0000 = new o00O("av", "Avastada", "Avas", 1, _o.o00000, if.\u00d500000);
    public static final o00O superString = new o00O("dk", "Dya'Khol", "DyaK", 1, _o.o00000, if.\u00d500000);
    public static final o00O \u00f8\u00d30000 = new o00O("ir", "Iryabaar", "Irya", 1, _o.o00000, if.\u00d500000);
    public static final o00O publicObject = new o00O("na", "Naggarach", "Nagg", 1, _o.o00000, if.\u00d500000);
    public static final o00O \u00f6o0000 = new o00O("kh", "Khalyanar", "Khal", 1, _o.o00000, if.\u00d500000);
    public static final o00O \u00f6\u00d30000 = new o00O("gh", "Ghorgumor", "Ghor", 1, _o.o00000, if.\u00d500000);
    public static final o00O \u00d8\u00d30000 = new o00O("xo", "Xolovar", "Xolo", 1, _o.o00000, if.\u00d500000);
    public static final o00O \u00d2\u00d40000 = new o00O("mi", "Mishkarya", "Mish", 1, _o.o00000, if.\u00d500000);
    public static final o00O \u00f8\u00d40000 = new o00O("aa", "Aggari", "Agga", 1, _o.o00000, if.\u00d500000);
    public static final o00O \u00f4\u00d20000 = new o00O("dy", "Darcalya", "Darc", 1, _o.o00000, if.\u00d500000);
    public static final o00O O\u00d50000 = new o00O("et", "Eskates", "Eska", 1, _o.o00000, if.\u00d500000);
    public static final o00O \u00d3\u00d40000 = new o00O("ab", "Abgrund", "Abgr", 1, _o.o00000, if.\u00d500000);
    public static final o00O ObjectObject = new o00O("to", "Totenwesen", "ToWe", 1, _o.o00000, if.\u00f500000);
    public static final o00O int = new o00O("fe", "Feen", "Feen", 1, _o.o00000, if.\u00d800000);
    public static final o00O \u00d6\u00d30000 = new o00O("ti", "Tiergeister", "TiGe", 1, _o.o00000, if.\u00d800000);
    public static final o00O \u00d8\u00d40000 = new o00O("ze", "Zeit", "Zeit", 1, _o.o00000, if.\u00f400000);
    private static Map<String, o00O[]> donew = new HashMap<String, o00O[]>();
    private String \u00d4o0000;
    private String \u00d3\u00d30000;
    private String voidsuper;
    private int \u00d6\u00d20000;
    private if \u00d3O0000;

    public static o00O[] o00000(String string) {
        o00O[] o00OArray = donew.get(string);
        if (o00OArray == null) {
            int n = string.length() / 2;
            o00OArray = new o00O[n];
            for (int i2 = 0; i2 < n; ++i2) {
                String string2 = string.substring(2 * i2, 2 * i2 + 2);
                o00OArray[i2] = interface.get(string2);
                if (o00OArray[i2] != null) continue;
                throw new IllegalArgumentException(string2 + " ist ung\u00fcltig");
            }
            donew.put(string, o00OArray);
        }
        return o00OArray;
    }

    public static List<o00O> o00000() {
        ArrayList<o00O> arrayList = new ArrayList<o00O>(\u00f4O0000.values());
        Collections.sort(arrayList);
        return arrayList;
    }

    public static o00O \u00d200000(String string) {
        o00O o00O2 = \u00f4O0000.get(string);
        if (o00O2 == null) {
            throw new X(string + " gibt es nicht.");
        }
        return o00O2;
    }

    public static ArrayList<o00O> OO0000() {
        ArrayList<o00O> arrayList = new ArrayList<o00O>();
        arrayList.add(\u00f8O0000);
        arrayList.add(\u00d8O0000);
        arrayList.add(superString);
        arrayList.add(\u00f8\u00d30000);
        arrayList.add(\u00f6\u00d30000);
        arrayList.add(\u00d8\u00d30000);
        arrayList.add(publicObject);
        arrayList.add(\u00f8\u00d40000);
        arrayList.add(\u00d2\u00d30000);
        arrayList.add(\u00f6o0000);
        arrayList.add(\u00f8o0000);
        arrayList.add(\u00f4o0000);
        arrayList.add(\u00d2\u00d40000);
        arrayList.add(\u00f4\u00d20000);
        return arrayList;
    }

    public static ArrayList<o00O> \u00d2O0000() {
        ArrayList<o00O> arrayList = new ArrayList<o00O>();
        arrayList.add(\u00d4\u00d20000);
        arrayList.add(\u00d800000);
        arrayList.add(\u00f6O0000);
        arrayList.add(super);
        arrayList.add(\u00d2\u00d20000);
        arrayList.add(\u00d4O0000);
        return arrayList;
    }

    public static ArrayList<o00O> \u00f400000() {
        ArrayList<o00O> arrayList = new ArrayList<o00O>();
        arrayList.add(\u00d4\u00d20000);
        arrayList.add(\u00d800000);
        arrayList.add(\u00f6O0000);
        arrayList.add(super);
        arrayList.add(\u00d2\u00d20000);
        arrayList.add(\u00d4O0000);
        arrayList.add(publicObject);
        arrayList.add(\u00f8\u00d40000);
        arrayList.add(\u00d2\u00d30000);
        arrayList.add(\u00f6o0000);
        arrayList.add(\u00f8o0000);
        arrayList.add(\u00f4o0000);
        return arrayList;
    }

    public static List<o00O> public() {
        ArrayList<o00O> arrayList = new ArrayList<o00O>(O\u00d40000.values());
        Collections.sort(arrayList);
        return arrayList;
    }

    public static ArrayList<o00O> \u00f500000() {
        ArrayList<o00O> arrayList = new ArrayList<o00O>();
        arrayList.add(\u00d2\u00d50000);
        arrayList.add(\u00d8\u00d20000);
        arrayList.add(\u00f6\u00d20000);
        arrayList.add(o00O.class);
        arrayList.add(supernew);
        arrayList.add(O\u00d20000);
        arrayList.add(\u00f4\u00d30000);
        arrayList.add(intnew);
        arrayList.add(\u00d3o0000);
        arrayList.add(\u00d4\u00d40000);
        return arrayList;
    }

    public static Iterator<o00O> Object() {
        ArrayList<o00O> arrayList = new ArrayList<o00O>(\u00f4O0000.values());
        Collections.sort(arrayList);
        return arrayList.iterator();
    }

    public static Iterator<o00O> \u00d200000() {
        ArrayList<o00O> arrayList = new ArrayList<o00O>(interface.values());
        Collections.sort(arrayList);
        return arrayList.iterator();
    }

    private o00O(String string, String string2, String string3, int n, _o _o2) {
        this.\u00d4o0000 = string2;
        this.\u00d3\u00d30000 = string3;
        this.\u00d6\u00d20000 = n;
        this.voidsuper = string;
        this.\u00d3O0000 = if.\u00f400000;
        switch (_o2) {
            case o00000: {
                O\u00d40000.put(string, this);
                break;
            }
            case Object: {
                interface.put(string, this);
                break;
            }
            case \u00d400000: {
                interface.put(string, this);
                O\u00d40000.put(string, this);
            }
        }
        \u00f4O0000.put(string2, this);
    }

    private o00O(String string, String string2, String string3, int n, _o _o2, if if_) {
        this(string, string2, string3, n, _o2);
        this.\u00d3O0000 = if_;
    }

    @Override
    public int compareTo(Object object) {
        return this.toString().compareTo(object.toString());
    }

    public boolean equals(Object object) {
        if (object == null || !(object instanceof o00O)) {
            return false;
        }
        return this.toString().equals(object.toString());
    }

    public String float() {
        return this.\u00d3\u00d30000;
    }

    public String \u00d600000() {
        return this.voidsuper;
    }

    public o00O \u00d500000() {
        if (this == \u00d4\u00d20000) {
            return super;
        }
        if (this == super) {
            return \u00d4\u00d20000;
        }
        if (this == \u00f6O0000) {
            return \u00d4O0000;
        }
        if (this == \u00d4O0000) {
            return \u00f6O0000;
        }
        if (this == \u00d2\u00d20000) {
            return \u00d800000;
        }
        if (this == \u00d800000) {
            return \u00d2\u00d20000;
        }
        throw new IllegalArgumentException(this.\u00d4o0000 + " ist kein Element.");
    }

    public if void() {
        return this.\u00d3O0000;
    }

    public int oO0000() {
        return this.\u00d6\u00d20000;
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    public boolean \u00f600000() {
        return this.float().startsWith("D\u00e4mo") && this.float().endsWith(")");
    }

    public boolean \u00d400000() {
        return this.float().startsWith("Elem") && this.float().endsWith(")");
    }

    public String toString() {
        return this.\u00d4o0000;
    }

    private static enum _o {
        Object,
        o00000,
        \u00d400000;

    }
}

