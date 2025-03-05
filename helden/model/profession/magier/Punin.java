/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.magier;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.framework.zauber.ZauberFabrik;
import helden.model.profession.magier.StandardMagierVariante;
import java.util.ArrayList;

public abstract class Punin
extends StandardMagierVariante {
    public Punin(String string, int n) {
        super(string, n);
        this.oO\u00d2O00 = "grau";
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.\u00d3\u00f8\u00f5000);
        this.setZweitLehrsprache(arrayList);
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(I.\u00d5\u00d6O000);
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 13;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.newwhilesuper)) {
            return 14;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 8;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        BedingungsVerknuepfung bedingungsVerknuepfung = super.getNotwendigeVoraussetzungen();
        bedingungsVerknuepfung.addBedingung(Bedingung.hatNicht(I.o\u00f5O000));
        return bedingungsVerknuepfung;
    }

    @Override
    public helden.framework.OOoO.K getRepraesentation(Zauber zauber) {
        return helden.framework.OOoO.K.\u00f8O0000;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, 3);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 2);
        k_02.\u00d200000(voidsuper.O0\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d8\u00d5\u00d6000, 4);
        k_02.\u00d200000(voidsuper.forpublicObject, 3);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d6000, -1);
        k_02.\u00d200000(voidsuper.\u00d5\u00d4\u00d6000, 4);
        k_02.\u00d200000(voidsuper.oo\u00d6000, 4);
        k_02.\u00d200000(voidsuper.\u00f5\u00f5\u00d5000, 8);
        k_02.\u00d200000(voidsuper.o\u00d5\u00d6000, 4);
        k_02.\u00d200000(voidsuper.thisintObject, 3);
        k_02.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 6);
        k_02.\u00d200000(voidsuper.\u00f4\u00d2\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00d3\u00d6\u00d5000, 4);
        k_02.\u00d200000(voidsuper.\u00d4\u00f6\u00d6000, 4);
        k_02.\u00d200000(G.newwhileString, 6);
        k_02.\u00d200000(G.\u00d5\u00f8\u00f4000, 5);
        k_02.\u00d200000(G.\u00d50\u00f5000, 5);
        k_02.\u00d200000(G.\u00f5\u00f6\u00f5000, 5);
        k_02.\u00d200000(G.\u00f4\u00d3\u00f5000, 4);
        k_02.\u00d200000(G.\u00d8\u00d8\u00f5000, 8);
        k_02.\u00d200000(G.\u00d3o\u00f5000, 5);
        k_02.\u00d200000(G.nullpublicString, 5);
        k_02.\u00d200000(G.\u00d40\u00f6000, 4);
        k_02.\u00d200000(G.\u00f8\u00f8\u00f4000, 5);
        k_02.\u00d200000(G.\u00d5\u00d4\u00f5000, 4);
        k_02.\u00d200000(voidsuper.\u00f5o\u00d6000, 6);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d5000, 4);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(I.\u00f4\u00d8O000);
        arrayList.add(I.o\u00f5O000);
        arrayList.add(I.ifreturn);
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        J j2 = (J)K.o00000(I.thisdo);
        j2.oO0000(7);
        oo0O.\u00d300000(j2);
        oo0O.\u00d300000(K.o00000(I.whilenewsuper, 1500));
        oo0O.\u00d300000(K.o00000(I.\u00d3\u00d3O000));
        oo0O.\u00d300000(K.o00000(I.\u00d3\u00d30000));
        oo0O.\u00d300000(K.o00000(I.o\u00d5O000, "gesellschaftliches Leben", 6));
        return oo0O;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = new WaehlbareZauber();
        waehlbareZauber.addAll(ZauberFabrik.getInstance().mindestVerbreitung(3, helden.framework.OOoO.K.\u00f8O0000, this.getSetting()));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.o\u00d3\u00d3000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00f8\u00d3000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00f8\u00d2000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.nullclassnew, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.privateintnew, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00d6\u00d4000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.o0\u00d4000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d5\u00f4\u00d4000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d5\u00d2\u00d5000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.O\u00d8\u00d3000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.O\u00d4\u00d3000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00f4\u00d4000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.nullvoidnew, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00f4\u00d3000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4O\u00d4000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.nullinterfacesuper, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f5\u00f5\u00d3000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3O\u00d3000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f40\u00d3000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d5\u00f8\u00d3000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d80\u00d3000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.whilenullnew, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00d5\u00d4000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.oO\u00d5000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f8o\u00d5000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.o\u00d5\u00d4000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.ififnew, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4o\u00d3000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00f5\u00d3000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3\u00d5\u00d3000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00d8\u00d3000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.OO\u00d4000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4o\u00d3000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.whilenewnew, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.Oo\u00d4000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.o\u00f6\u00d3000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8O\u00d3000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3\u00f6\u00d3000, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.returnreturnnew, helden.framework.OOoO.K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.returnfornew, helden.framework.OOoO.K.\u00f8O0000, ""));
        return waehlbareZauber;
    }
}

