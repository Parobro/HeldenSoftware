/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.kultur.optimatenhaeuser;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.oOoO.floatsuper;
import helden.framework.oooo.k_0;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.settings.Settings;
import helden.model.myranor.kultur.optimatenhaeuser.OptimatBasisVariante;
import java.util.ArrayList;
import java.util.List;

public class OptimatKouramnionVariante
extends OptimatBasisVariante {
    public OptimatKouramnionVariante() {
        super("Haus Kouramnion", "Haus Kouramnion", 6, false);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Bastardst\u00e4be"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Selbstbeherrschung"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberzeugen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heraldik"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Geschichtswissen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Kriegskunst"), 3);
        return k_02;
    }

    @Override
    public boolean wirdMutterspracheZurZeitsprache() {
        return true;
    }

    @Override
    public G getMuttersprache() {
        return G.o\u00d8\u00f5000;
    }

    @Override
    public List<o0oo_2> getAuswahlen(floatsuper floatsuper2) {
        List<o0oo_2> list = super.getAuswahlen(floatsuper2);
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        arrayList.add(N.floatsuper().\u00d200000("Baukunst"));
        arrayList.add(N.floatsuper().\u00d200000("Gesteinskunde"));
        arrayList.add(N.floatsuper().\u00d200000("H\u00fcttenkunde"));
        arrayList.add(N.floatsuper().\u00d200000("Mechanik"));
        int[] nArray = new int[]{2};
        list.add(new o0oo_2(floatsuper2, arrayList, nArray));
        arrayList = new ArrayList();
        arrayList.addAll(Settings.getSettingByName("Myranor").get(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
        arrayList.remove(this.getMuttersprache());
        int[] nArray2 = new int[]{2};
        list.add(new o0oo_2(floatsuper2, arrayList, nArray2));
        return list;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000("Prinzipientreue", "Mut, Ehrlichkeit, Schutz und Verteidigung des Imperiums"));
        return oo0O;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Eisern"));
        arrayList.add(K.o00000("Neugier"));
        arrayList.add(I.O\u00d5o000);
        return arrayList;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(K.o00000("Eitelkeit"));
        arrayList.add(K.o00000("Krankhafte Reinlichkeit"));
        return arrayList;
    }
}

