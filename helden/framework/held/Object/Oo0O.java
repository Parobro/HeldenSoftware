/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.Object;

import helden.framework.A.A;
import helden.framework.C.I;
import helden.framework.C.public;
import helden.framework.D.OOOo;
import helden.framework.D.P;
import helden.framework.OoOO.U;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.K;
import helden.framework.held.L;
import helden.framework.held.T;
import helden.framework.int.OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.int.super;
import helden.framework.oooo.b_0;
import helden.framework.zauber.KonkreterZauber;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public final class Oo0O {
    public static String o00000(K k2, K k3, boolean bl, String string) {
        boolean iterator4;
        Object object;
        Iterator<public> iterator;
        Object object2;
        int oo0O;
        int arrayList2;
        Object object32;
        A a2;
        Object object4;
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList<A> arrayList = new ArrayList<A>();
        T t = k2.\u00f8O0000();
        Iterator<voidsuper> iterator2 = k2.\u00f8O0000().super();
        T t2 = k3.\u00f8O0000();
        while (iterator2.hasNext()) {
            object4 = iterator2.next();
            if (!t2.\u00d300000(object4)) {
                stringBuffer.append("Talent entfernt: " + ((U)object4).toString() + "\n");
                if (!bl) continue;
                a2 = new A("Talent entfernt", ((U)object4).toString(), string);
                arrayList.add(a2);
                continue;
            }
            try {
                int n3;
                int n4 = t.\u00f400000(object4);
                if (n4 == (n3 = t2.\u00f400000(object4))) continue;
                stringBuffer.append("Talentwert " + object4 + " ge\u00e4ndert: " + n4 + " => " + n3);
                stringBuffer.append("\n");
                if (!bl) continue;
                a2 = new A("Talent steigern", ((U)object4).toString(), string);
                arrayList.add(a2);
                a2.o00000("" + n4, "" + n3);
            }
            catch (Exception exception) {}
        }
        object4 = k3.\u00f8O0000().super();
        while (object4.hasNext()) {
            voidsuper voidsuper2 = (voidsuper)object4.next();
            if (t.\u00d300000(voidsuper2)) continue;
            try {
                int n5 = t2.\u00f400000(voidsuper2);
                if (bl) {
                    a2 = new A("Talent aktivieren", voidsuper2.toString(), string);
                    arrayList.add(a2);
                    if (n5 != 0) {
                        a2 = new A("Talent steigern", voidsuper2.toString(), string);
                        a2.o00000("0", "" + n5);
                        arrayList.add(a2);
                    }
                }
                stringBuffer.append("Talent " + voidsuper2 + " hinzugef\u00fcgt: Wert: " + n5);
                stringBuffer.append("\n");
            }
            catch (Exception exception) {}
        }
        L l2 = k2.\u00d5o0000();
        Iterator<KonkreterZauber> iterator3 = l2.\u00d200000().iterator();
        L l3 = k3.\u00d5o0000();
        while (iterator3.hasNext()) {
            KonkreterZauber konkreterZauber = iterator3.next();
            if (!l3.\u00d300000(konkreterZauber)) {
                stringBuffer.append("Zauber entfernt: " + konkreterZauber.toString() + "\n");
                if (!bl) continue;
                a2 = new A("Zauber entfernt", konkreterZauber.toString(), string);
                arrayList.add(a2);
                continue;
            }
            try {
                int n6;
                int n7 = l2.\u00d400000(konkreterZauber);
                if (n7 == (n6 = l2.\u00d400000(konkreterZauber))) continue;
                stringBuffer.append("Zauberwert " + konkreterZauber + " ge\u00e4ndert: " + n7 + " => " + n6);
                stringBuffer.append("\n");
                if (!bl) continue;
                a2 = new A("Zauber steigern", konkreterZauber.toString(), string);
                a2.o00000("" + n7, "" + n6);
                arrayList.add(a2);
            }
            catch (Exception exception) {}
        }
        for (KonkreterZauber konkreterZauber : l3.\u00d200000()) {
            if (!l2.\u00d300000(konkreterZauber)) {
                try {
                    int n8 = l3.\u00d400000(konkreterZauber);
                    stringBuffer.append("Zauber " + konkreterZauber + " hinzugef\u00fcgt: Wert: " + n8);
                    stringBuffer.append("\n");
                    if (bl) {
                        a2 = new A("Zauber aktivieren", konkreterZauber.toString(), string);
                        arrayList.add(a2);
                        if (n8 != 0) {
                            a2 = new A("Zauber steigern", konkreterZauber.toString(), string);
                            a2.o00000("0", "" + n8);
                            arrayList.add(a2);
                        }
                    }
                }
                catch (Exception exception) {
                    // empty catch block
                }
                if (!l3.\u00d200000(konkreterZauber)) continue;
                if (bl) {
                    a2 = new A("Hauszauber ver\u00e4ndert", konkreterZauber.toString(), string);
                    a2.o00000("false", "true");
                    arrayList.add(a2);
                }
                stringBuffer.append("Zauber " + konkreterZauber + " ist Hauszauber");
                stringBuffer.append("\n");
                continue;
            }
            if (l3.\u00d200000(konkreterZauber) == l2.\u00d200000(konkreterZauber)) continue;
            if (l3.\u00d200000(konkreterZauber)) {
                stringBuffer.append("Zauber " + konkreterZauber + " ist nun Hauszauber");
                stringBuffer.append("\n");
                if (bl) {
                    a2 = new A("Hauszauber ver\u00e4ndert", konkreterZauber.toString(), string);
                    a2.o00000("false", "true");
                    arrayList.add(a2);
                }
            } else {
                if (bl) {
                    a2 = new A("Hauszauber ver\u00e4ndert", konkreterZauber.toString(), string);
                    a2.o00000("true", "false");
                    arrayList.add(a2);
                }
                stringBuffer.append("Zauber " + konkreterZauber + " ist kein Hauszauber mehr");
            }
            stringBuffer.append("\n");
        }
        OOOo oOOo = k2.\u00f5O0000();
        OOOo oOOo2 = k3.\u00f5O0000();
        for (Object object5 : oOOo) {
            if (oOOo2.\u00d200000(((P)object5).toString())) continue;
            stringBuffer.append("Sonderfertigkeit entfernt: " + ((P)object5).toString() + "\n");
            if (!bl) continue;
            a2 = new A("Sonderfertigkeit entfernt", ((P)object5).toString(), string);
            arrayList.add(a2);
        }
        for (Object object5 : oOOo2) {
            if (oOOo.\u00d200000(((P)object5).toString())) continue;
            stringBuffer.append("Sonderfertigkeit hinzugef\u00fcgt: " + ((P)object5).toString() + "\n");
            if (!bl) continue;
            a2 = new A("Sonderfertigkeit hinzugef\u00fcgt", ((P)object5).toString(), string);
            arrayList.add(a2);
        }
        for (Map.Entry object6 : k3.\u00d3\u00d30000().\u00d800000().entrySet()) {
            object32 = (b_0)object6.getKey();
            arrayList2 = (Integer)object6.getValue();
            oo0O = k2.\u00d3\u00d30000().OO0000((b_0)object32);
            if (oo0O == arrayList2) continue;
            stringBuffer.append("Eigenschaft (Start)" + object32 + " " + oo0O + " => " + arrayList2 + "\n");
            if (!bl) continue;
            a2 = new A("Start-Eigenschaft steigern", ((U)object32).toString(), string);
            a2.o00000("" + oo0O, "" + arrayList2);
            arrayList.add(a2);
        }
        for (Object object32 : k2.\u00d3\u00d30000().\u00d200000()) {
            arrayList2 = k2.\u00d3\u00d30000().do((b_0)object32);
            if (arrayList2 == (oo0O = k3.\u00d3\u00d30000().do((b_0)object32))) continue;
            stringBuffer.append("Eigenschaft " + object32 + " " + arrayList2 + " => " + oo0O + "\n");
            if (!bl) continue;
            a2 = new A("Eigenschaft steigern", ((U)object32).toString(), string);
            a2.o00000("" + arrayList2, "" + oo0O);
            arrayList.add(a2);
        }
        if (k2.o\u00d30000() != k3.o\u00d30000()) {
            stringBuffer.append("Abenteuerpunkte " + k2.o\u00d30000() + " => " + k3.o\u00d30000() + "\n");
            if (bl) {
                a2 = new A("Abenteuerpunkte", "gesamt", string);
                a2.o00000("" + k2.o\u00d30000(), "" + k3.o\u00d30000());
                arrayList.add(a2);
            }
        }
        if (k2.\u00d400000() != k3.\u00d400000()) {
            stringBuffer.append("verf\u00fcgabre Abenteuerpunkte " + k2.\u00d400000() + " => " + k3.\u00d400000() + "\n");
            if (bl) {
                a2 = new A("Abenteuerpunkte", "verf\u00fcgbar", string);
                a2.o00000("" + k2.\u00d400000(), "" + k3.\u00d400000());
                arrayList.add(a2);
                a2.\u00d300000(k3.\u00d400000() - k2.\u00d400000());
            }
        }
        if (!k2.o\u00d20000().getID().equals(k3.o\u00d20000().getID())) {
            stringBuffer.append("Rasse ver\u00e4ndert " + k2.o\u00d20000() + " => " + k3.o\u00d20000() + "\n");
            if (bl) {
                a2 = new A("Rasse", "", string);
                a2.o00000(k2.o\u00d20000().toString(), k3.o\u00d20000().toString());
                arrayList.add(a2);
            }
        }
        if (!k2.\u00f800000().getID().equals(k3.\u00f800000().getID())) {
            stringBuffer.append("Kultur ver\u00e4ndert " + k2.\u00f800000() + " => " + k3.\u00f800000() + "\n");
            if (bl) {
                a2 = new A("Kultur", "", string);
                a2.o00000(k2.\u00f800000().toString(), k3.\u00f800000().toString());
                arrayList.add(a2);
            }
        }
        object32 = k2.nullsuper();
        ArrayList<super> arrayList3 = k3.nullsuper();
        for (oo0O = 0; oo0O < 3; ++oo0O) {
            object2 = null;
            iterator = null;
            if (((ArrayList)object32).size() > oo0O) {
                object2 = (super)((ArrayList)object32).get(oo0O);
            }
            if (arrayList3.size() > oo0O) {
                iterator = arrayList3.get(oo0O);
            }
            if (object2 == null && iterator != null) {
                if (bl) {
                    a2 = new A("Profession", "Nr " + (oo0O + 1), string);
                    a2.o00000("", ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)((Object)iterator)).toString());
                    arrayList.add(a2);
                }
                stringBuffer.append("Profession hinzugef\u00fcgt " + iterator + "\n");
            }
            if (object2 != null && iterator == null) {
                if (bl) {
                    a2 = new A("Profession", "Nr " + (oo0O + 1), string);
                    a2.o00000(((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object2).toString(), "");
                    arrayList.add(a2);
                }
                stringBuffer.append("Profession entfernt " + object2 + "\n");
            }
            if (object2 == null || iterator == null || ((super)object2).getID().toString().equals(((super)((Object)iterator)).getID().toString())) continue;
            if (bl) {
                a2 = new A("Profession", "Nr " + (oo0O + 1), string);
                a2.o00000(((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object2).toString(), ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)((Object)iterator)).toString());
                arrayList.add(a2);
            }
            stringBuffer.append("Profession entfernt " + ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object2).toString() + "\n");
            stringBuffer.append("Profession hinzugef\u00fcgt " + ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)((Object)iterator)).toString() + "\n");
        }
        helden.framework.C.Oo0O oo0O2 = k2.\u00d500000();
        oo0O2.o00000(2);
        object2 = k3.\u00d500000();
        ((helden.framework.C.Oo0O)object2).o00000(2);
        iterator = oo0O2.\u00d500000();
        while (iterator.hasNext()) {
            object = (public)iterator.next();
            iterator4 = ((helden.framework.C.Oo0O)object2).o00000((public)object) && ((helden.framework.C.Oo0O)object2).\u00d300000((I)object).oO0000().equals(((public)object).oO0000());
            if (iterator4) continue;
            stringBuffer.append("Vorteil entfernt: " + ((public)object).oO0000() + "\n");
            if (!bl) continue;
            a2 = new A("Vor-/Nachteil entfernt", ((public)object).oO0000(), string);
            arrayList.add(a2);
        }
        iterator = ((helden.framework.C.Oo0O)object2).\u00d500000();
        while (iterator.hasNext()) {
            object = iterator.next();
            iterator4 = oo0O2.o00000((public)object) && oo0O2.\u00d300000((I)object).oO0000().equals(((public)object).oO0000());
            if (iterator4) continue;
            stringBuffer.append("Vorteil hinzugef\u00fcgt: " + ((public)object).oO0000() + "\n");
            if (!bl) continue;
            a2 = new A("Vor-/Nachteil hinzugef\u00fcgt", ((public)object).oO0000(), string);
            arrayList.add(a2);
        }
        oo0O2.o00000(2);
        ((helden.framework.C.Oo0O)object2).o00000(2);
        object = A.for();
        Iterator iterator5 = arrayList.iterator();
        while (iterator5.hasNext()) {
            ((A)iterator5.next()).o00000((Integer)object, string);
        }
        k3.\u00d8O0000().addAll(arrayList);
        return stringBuffer.toString();
    }

    private Oo0O() {
    }
}

