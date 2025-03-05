/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.magier;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.oooo.b_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.model.profession.magier.StandardMagierVariante;
import java.util.ArrayList;

public abstract class AlAnfa
extends StandardMagierVariante {
    public AlAnfa(String string, int n) {
        super(string, n);
        this.oO\u00d2O00 = "schwarz";
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(I.privateclass);
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 13;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 11;
        }
        if (b_02.equals(b_0.newwhilesuper)) {
            return 13;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 7;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(I.\u00f5\u00f6o000);
        arrayList.add(I.\u00d3\u00d3O000);
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        J j2 = (J)K.o00000(I.O\u00f4O000);
        j2.oO0000(5);
        oo0O.\u00d300000(j2);
        oo0O.\u00d300000(K.o00000(I.whilenewsuper, 1000));
        oo0O.\u00d300000(K.o00000(I.\u00d3\u00d30000));
        return oo0O;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.remove(KonkreterZauber.getZauber(Zauber.O\u00d6\u00d4000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.remove(KonkreterZauber.getZauber(Zauber.ifthisObject, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.remove(KonkreterZauber.getZauber(Zauber.\u00d8\u00d2\u00d3000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.remove(KonkreterZauber.getZauber(Zauber.\u00f8\u00f4\u00d4000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.privateintnew, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d5\u00d2\u00d5000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f40\u00d3000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d80\u00d3000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00d3\u00d5000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.OO\u00d4000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00d2\u00d4000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f50\u00d5000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3\u00f6\u00d3000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.O\u00d4\u00d3000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d30\u00d3000, helden.framework.OOoO.K.\u00f8O0000, ""), 1);
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.returnfornew, helden.framework.OOoO.K.\u00f8O0000, ""), 1);
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00f5\u00d3000, helden.framework.OOoO.K.\u00f8O0000, ""), 1);
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.newifnew, helden.framework.OOoO.K.\u00f8O0000, ""), 1);
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.ififnew, helden.framework.OOoO.K.\u00f8O0000, ""), 1);
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f5\u00d4\u00d3000, helden.framework.OOoO.K.\u00f8O0000, ""), 1);
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00f8\u00d2000, helden.framework.OOoO.K.\u00f8O0000, ""), 1);
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.privateinterfacesuper, helden.framework.OOoO.K.\u00d8o0000, ""), 1);
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.nullvoidnew, helden.framework.OOoO.K.\u00f8O0000, ""), 1);
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.Stringsupernew, helden.framework.OOoO.K.\u00f8O0000, ""), 1);
        return waehlbareZauber;
    }
}

