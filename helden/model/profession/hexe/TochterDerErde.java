/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.hexe;

import helden.framework.D.K;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.model.profession.hexe.BasisHexe;
import java.util.ArrayList;

public class TochterDerErde
extends BasisHexe {
    public TochterDerErde() {
        super("Tochter der Erde", 16);
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("haltbare Kr\u00e4uter (75D)");
        return arrayList;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Tochter der Erde";
        }
        return "Tochter der Erde";
    }

    @Override
    public int getMaximalSozialstatus() {
        return 7;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 3;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public helden.framework.OOoO.K getRepraesentation(Zauber zauber) {
        return helden.framework.OOoO.K.if;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.Stringwhilenew.toString()));
        arrayList.add(K.o00000(voidsuper.o\u00f6\u00d6000, "Tr\u00e4nke"));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.nullsuperString, -1);
        k_02.\u00d200000(E.\u00f5\u00d3\u00d8000, 2);
        k_02.\u00d200000(voidsuper.returnforObject, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, 3);
        k_02.\u00d200000(voidsuper.thisvoidObject, 3);
        k_02.\u00d200000(voidsuper.\u00d8\u00d5\u00d6000, 3);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d6\u00d5000, 2);
        k_02.\u00d200000(voidsuper.o\u00d5\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00f6\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d2\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00f4\u00d5\u00d6000, 3);
        k_02.\u00d200000(voidsuper.\u00f5\u00f5\u00d6000, 5);
        k_02.\u00d200000(voidsuper.StringObjectObject, 3);
        k_02.\u00d200000(voidsuper.\u00d5\u00d5\u00d6000, 5);
        k_02.\u00d200000(voidsuper.\u00d3\u00d8\u00d5000, 2);
        k_02.\u00d200000(voidsuper.o\u00f6\u00d6000, 4);
        k_02.\u00d200000(voidsuper.\u00d4\u00d4\u00d5000, 3);
        k_02.\u00d200000(voidsuper.\u00f5\u00d5\u00d6000, 1);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d5\u00d8\u00d3000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d8\u00f5\u00d3000), 4);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f4\u00d2\u00d3000), 7);
        k_02.\u00d200000(this.getZauber(Zauber.O\u00f5\u00d3000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.O\u00d5\u00d3000), 7);
        k_02.\u00d200000(this.getZauber(Zauber.o\u00f6\u00d4000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.returnwhilenew), 5);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d8\u00d6\u00d3000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.newfornew), 2);
        k_02.\u00d200000(this.getZauber(Zauber.O\u00d2\u00d4000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d8\u00d3\u00d4000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d3O\u00d3000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d5\u00f4\u00d3000), 2);
        k_02.\u00d200000(this.getZauber(Zauber.O\u00d2\u00d5000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d8\u00f5\u00d4000), 2);
        k_02.\u00d200000(this.getZauber(Zauber.ifprivatesuper), 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f8\u00f8\u00d4000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.o\u00f5\u00d4000), 2);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d8\u00f4\u00d4000), 2);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.\u00d2oO000));
        return arrayList;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.thispublicnew, helden.framework.OOoO.K.\u00f4\u00d20000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3o\u00d3000, helden.framework.OOoO.K.if, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00d5\u00d3000, helden.framework.OOoO.K.if, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.returnthisObject, helden.framework.OOoO.K.if, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f5\u00f8\u00d4000, helden.framework.OOoO.K.if, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4o\u00d5000, helden.framework.OOoO.K.if, ""));
        return waehlbareZauber;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        arrayList.add(this.getZauber(Zauber.\u00d5\u00d8\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00d8\u00f5\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00f4\u00d2\u00d3000));
        arrayList.add(this.getZauber(Zauber.O\u00f5\u00d3000));
        arrayList.add(this.getZauber(Zauber.O\u00d5\u00d3000));
        arrayList.add(this.getZauber(Zauber.o\u00f6\u00d4000));
        arrayList.add(this.getZauber(Zauber.returnwhilenew));
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

