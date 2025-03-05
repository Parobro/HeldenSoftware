/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.G;

import helden.framework.C.I;
import helden.framework.D.while;
import helden.framework.held.Object.O0OO;
import helden.framework.int.N;
import helden.framework.int.P;
import helden.framework.int.String;
import helden.gui.G.D;
import helden.gui.g.c_0;
import helden.model.profession.Geweihter;
import java.util.ArrayList;
import javax.swing.JPanel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class O0oO
extends D {
    private c_0<P> \u00d8O0000;
    private ArrayList<P> \u00f4O0000;
    private ArrayList<P> thissuper;

    public O0oO(O0OO o0OO2) {
        super(o0OO2);
        this.do();
        N n = null;
        if (o0OO2.\u00d800000().\u00d800000().\u00d200000(String._o.\u00d200000) > 0) {
            n = ((Geweihter)o0OO2.\u00d800000().\u00d800000().Object(String._o.\u00d200000).get(0)).getKonkreteVariante();
        }
        this.\u00d8O0000 = new c_0();
        if (this.\u00d300000().new(while.o\u00d4\u00d4000.toString())) {
            this.\u00d8O0000.o00000(this.\u00f4O0000, this.super(n, this.\u00f4O0000));
        } else {
            this.\u00d8O0000.o00000(this.thissuper, this.super(n, this.thissuper));
        }
    }

    @Override
    public String \u00d200000() {
        return "W\u00e4hle Ausrichtung der Sp\u00e4tweihe:";
    }

    @Override
    public JPanel super() {
        return this.\u00d8O0000;
    }

    @Override
    public void class() {
        this.\u00d600000().\u00d8O0000();
    }

    @Override
    public boolean \u00d400000() {
        Geweihter geweihter = new Geweihter(this.\u00d300000().\u00d300000(), this.\u00d300000().\u00d800000().getMuttersprache(), this.\u00d300000().\u00d800000().getMuttersprachenSchrift());
        geweihter.waehleVariante(this.\u00d8O0000.new());
        this.\u00d600000().String(geweihter);
        return true;
    }

    private void do() {
        Geweihter geweihter = new Geweihter(this.\u00d300000().\u00d300000(), null, null);
        this.\u00f4O0000 = new ArrayList();
        this.thissuper = new ArrayList();
        for (N n : geweihter.getAlleVarianten()) {
            if (!this.\u00d600000().\u00f5O0000().contains(geweihter, (P)n)) continue;
            if (n.getVorteile().\u00d400000(I.\u00d3\u00f5O000) || n.getVorteile().\u00d400000(I.\u00d5\u00f5O000)) {
                this.\u00f4O0000.add(n);
            }
            if (!n.getVorteile().\u00d400000(I.\u00f8\u00d50000) && !n.getVorteile().\u00d400000(I.\u00d8\u00f8o000) && !n.getVorteile().\u00d400000(I.\u00d4\u00f4O000)) continue;
            this.thissuper.add(n);
        }
    }

    private P super(P p2, ArrayList<P> arrayList) {
        if (arrayList.size() == 0) {
            return null;
        }
        if (p2 == null) {
            return arrayList.get(0);
        }
        for (P p3 : arrayList) {
            if (!p2.toString().equals(p3.toString())) continue;
            return p3;
        }
        return arrayList.get(0);
    }
}

