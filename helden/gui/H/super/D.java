/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.H.super;

import helden.framework.C.I;
import helden.framework.C.public;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.OoOO.U;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.K;
import helden.framework.held.object.o0oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_0;
import helden.framework.int.N;
import helden.framework.int.String;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.gui.A;
import helden.gui.H.super.E;
import helden.gui.h.super.oooo_1;
import helden.model.profession.Geweihter;
import helden.model.profession.geweihter.Kor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JOptionPane;

public class D
extends oooo_1 {
    public D(K k2, A a2) {
        super(k2, a2);
    }

    public int o00000(N n) {
        int n2 = 0;
        if (n.getVorteile().\u00d400000(I.\u00d3\u00f5O000) || n.getVorteile().\u00d400000(I.\u00d5\u00f5O000) || n.getVorteile().\u00d400000(I.\u00d4\u00f4O000) || n.getVorteile().\u00d400000(I.\u00d8\u00f8o000)) {
            n2 = 1000;
            if (this.new.\u00d500000().\u00d400000(I.\u00f5\u00d8o000)) {
                n2 = 1500;
            }
            if (this.new.\u00d500000().\u00d400000(I.forsupersuper)) {
                n2 = 2000;
            }
        } else {
            n2 = 700;
            if (this.new.\u00d500000().\u00d400000(I.\u00f5\u00d8o000)) {
                n2 = 1000;
            }
            if (this.new.\u00d500000().\u00d400000(I.forsupersuper)) {
                n2 = 1500;
            }
        }
        return n2;
    }

    @Override
    public void o00000() {
        Object object;
        Object object2;
        int n2 = 0;
        this.new = (K)this.o00000.\u00d2O0000();
        this.\u00d300000 = new o0oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_0(this.new);
        if (this.\u00d200000()) {
            return;
        }
        Geweihter geweihter = new Geweihter(this.new.\u00d300000(), this.new.\u00d800000().getMuttersprache(), this.new.\u00d800000().getMuttersprachenSchrift());
        ArrayList<N> arrayList = new ArrayList<N>();
        for (N n3 : geweihter.getAlleVarianten()) {
            if (!n3.getVorteile().\u00d400000(I.\u00d3\u00f5O000) && !n3.getVorteile().\u00d400000(I.\u00f8\u00d50000) && !n3.getVorteile().\u00d400000(I.\u00d8\u00f8o000) && !n3.getVorteile().\u00d400000(I.\u00d4\u00f4O000) && !n3.getVorteile().\u00d400000(I.\u00d5\u00f5O000)) continue;
            arrayList.add(n3);
        }
        Collections.sort(arrayList);
        N n = (N)this.o00000(arrayList, "\nBitte die Variante f\u00fcr die Sp\u00e4tweihe w\u00e4hlen:\n");
        if (n == null) {
            return;
        }
        geweihter.waehleVariante(n);
        if (n instanceof Kor) {
            E n4 = new E(this.new, this.o00000);
            n4.o00000(geweihter);
            return;
        }
        int n3 = this.o00000(n);
        if (this.new.o00000(while.\u00d3\u00f4\u00f5000)) {
            n3 -= 50;
        }
        if (this.new.\u00d400000() < n3) {
            String string = "Nicht gen\u00fcgend Abenteuerpunkte f\u00fcr die Sp\u00e4tweihe\n\n";
            string = string + "Notwending sind " + n3 + " AP\n";
            JOptionPane.showMessageDialog(null, string, "Nicht gen\u00fcgend AP", 2);
            return;
        }
        String string = "";
        Iterator<b_0> iterator = b_0.\u00d4\u00d60000();
        int n4 = 0;
        boolean bl = false;
        while (iterator.hasNext()) {
            object2 = iterator.next();
            if (object2.equals(b_0.\u00f5\u00f5\u00d2000)) {
                n4 = n.getMinimalEigenschaftswert((b_0)object2);
                continue;
            }
            int n5 = n.getMinimalEigenschaftswert((b_0)object2);
            if (object2.equals(b_0.\u00d5\u00f4\u00d2000) && n5 < 11) {
                bl = true;
                n5 = 11;
            }
            if (this.new.o00000((b_0)object2) >= n5) continue;
            string = string + ((U)object2).toString() + ": " + n5 + "\n";
        }
        if (!bl && this.new.o00000((b_0)(object2 = b_0.\u00d5\u00f4\u00d2000)) < 11) {
            string = string + ((U)object2).toString() + ": 11\n";
        }
        object2 = n.getTalentwerte(this.new.\u00d800000().getMuttersprache(), this.new.\u00d800000().getMuttersprachenSchrift(), 0);
        for (Map.Entry entry : ((k_0)object2).o00000().entrySet()) {
            object = (oo0o_0)entry.getKey();
            int n6 = entry.getValue();
            if (object == null || !((oo0o_0)object).istEchtesTalent() || !this.\u00d300000.\u00d300000((voidsuper)object, n6)) continue;
            string = string + ((U)object).toString() + ": " + n6 + "\n";
        }
        if (!string.equals("")) {
            string = "Die folgenden Voraussetzungen sind nicht erf\u00fcllt:\n\n" + string;
            JOptionPane.showMessageDialog(null, string, "Nicht erf\u00fcllte Voraussetzungen", 2);
            return;
        }
        geweihter.setGeschlecht(this.new.\u00d300000());
        this.new.\u00d800000().o00000(String._o.\u00d200000, geweihter);
        if (n.getVorteile().\u00d400000(I.\u00d3\u00f5O000) || n.getVorteile().\u00d400000(I.\u00d8\u00f8o000) || n.getVorteile().\u00d400000(I.\u00d4\u00f4O000) || n.getVorteile().\u00d400000(I.\u00d5\u00f5O000)) {
            n2 = 16;
            this.\u00d300000.o00000(while.o\u00d4\u00d4000.toString(), "Sp\u00e4tweihe");
        }
        if (n.getVorteile().\u00d400000(I.\u00f8\u00d50000)) {
            n2 = 8;
            this.\u00d300000.o00000(while.\u00d6\u00d8\u00d8000.toString(), "Sp\u00e4tweihe");
        }
        Iterator<public> iterator2 = n.getVorteile().\u00d500000();
        while (iterator2.hasNext()) {
            object = iterator2.next();
            if (!((public)object).toString().startsWith("Moralkodex")) continue;
            this.new.o00000((public)object, true);
        }
        for (P p2 : n.getSonderfertigkeiten()) {
            if (!p2.toString().startsWith("Liturgiekenntnis")) continue;
            this.\u00d300000.o00000(p2, "Sp\u00e4tweihe");
        }
        this.o00000(n2);
        if (this.new.o00000(b_0.\u00f5\u00f5\u00d2000) >= n4) {
            this.\u00d300000.\u00d200000(1, "Sp\u00e4tweihe");
        } else {
            this.\u00d300000.\u00d200000(n4 - this.new.o00000(b_0.\u00f5\u00f5\u00d2000), "Sp\u00e4tweihe");
        }
        this.\u00d300000.o00000(n3, "Sp\u00e4tweihe");
        this.o00000.\u00d800000();
    }
}

