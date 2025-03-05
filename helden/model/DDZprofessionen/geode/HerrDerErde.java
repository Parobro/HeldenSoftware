/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.geode;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.model.DDZprofessionen.geode.Geode;
import java.util.ArrayList;

public class HerrDerErde
extends Geode {
    public HerrDerErde() {
        super("Herr der Erde", 17);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 2;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Herr der Erde";
        }
        return "Herrin der Erde";
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 12;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public helden.framework.OOoO.K getRepraesentation(Zauber zauber) {
        return super.getRepraesentation(zauber);
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        ArrayList<P> arrayList = null;
        switch (n) {
            case 1: {
                arrayList = oooo_0.\u00d500000();
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
        }
        return super.getSonderfertigkeitAuswahl(n);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.\u00d30\u00d8000, 2);
        k_02.\u00d200000(voidsuper.StringclassObject, 3);
        k_02.\u00d200000(this.getZauber(Zauber.forintnew), 5);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f8\u00f5\u00d4000), 6);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f5\u00d8\u00d3000), 7);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d3O\u00d5000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f8o\u00d5000), 7);
        if (this.getProfession().getSonderfertigkeiten().\u00d200000(while.\u00f8\u00f6\u00d4000.toString())) {
            k_02.\u00d200000(this.getZauber(Zauber.whilenewnew), 5);
        }
        if (this.getProfession().getSonderfertigkeiten().\u00d200000(while.Stringwhilesuper.toString())) {
            k_02.\u00d200000(this.getZauber(Zauber.Oo\u00d4000), 5);
        }
        if (this.getProfession().getSonderfertigkeiten().\u00d200000(while.\u00f6\u00d8O000.toString())) {
            k_02.\u00d200000(this.getZauber(Zauber.\u00d8O\u00d3000), 5);
        }
        if (this.getProfession().getSonderfertigkeiten().\u00d200000(while.nullreturnnew.toString())) {
            k_02.\u00d200000(this.getZauber(Zauber.o\u00f6\u00d3000), 5);
        }
        if (this.getProfession().getSonderfertigkeiten().\u00d200000(while.\u00d5\u00f4\u00f4000.toString())) {
            k_02.\u00d200000(this.getZauber(Zauber.whileifnew), 5);
        }
        if (this.getProfession().getSonderfertigkeiten().\u00d200000(while.\u00d3\u00f5\u00d3000.toString())) {
            k_02.\u00d200000(this.getZauber(Zauber.\u00f5\u00f5\u00d3000), 5);
        }
        k_02.\u00d200000(this.getZauber(Zauber.newreturnnew), 4);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d40\u00d4000), 4);
        k_02.\u00d200000(this.getZauber(Zauber.O\u00d2\u00d4000), 4);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d5\u00f6\u00d3000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f4\u00f4\u00d3000), 4);
        k_02.\u00d200000(this.getZauber(Zauber.ifthisObject), 3);
        k_02.\u00d200000(this.getZauber(Zauber.nullinterfacesuper), 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d5\u00d5\u00d4000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d3o\u00d4000), 4);
        k_02.\u00d200000(this.getZauber(Zauber.ifStringnew), 2);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.\u00d8\u00f5\u00d8000));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        J j2 = (J)K.o00000(I.thisdo);
        j2.oO0000(5);
        oo0O.\u00d300000(j2);
        return oo0O;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.o\u00f4\u00d4000, helden.framework.OOoO.K.\u00f4\u00d20000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.O0\u00d5000, helden.framework.OOoO.K.\u00f4\u00d20000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.O\u00f6\u00d3000, helden.framework.OOoO.K.\u00f4\u00d20000, ""));
        return waehlbareZauber;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        super.setzeHauszauber(arrayList);
        arrayList.add(this.getZauber(Zauber.forintnew));
        arrayList.add(this.getZauber(Zauber.\u00f8\u00f5\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00f5\u00d8\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00d3O\u00d5000));
        arrayList.add(this.getZauber(Zauber.\u00f8o\u00d5000));
        if (this.getProfession().getSonderfertigkeiten().\u00d200000(while.\u00f8\u00f6\u00d4000.toString())) {
            arrayList.add(this.getZauber(Zauber.whilenewnew));
        }
        if (this.getProfession().getSonderfertigkeiten().\u00d200000(while.Stringwhilesuper.toString())) {
            arrayList.add(this.getZauber(Zauber.Oo\u00d4000));
        }
        if (this.getProfession().getSonderfertigkeiten().\u00d200000(while.\u00f6\u00d8O000.toString())) {
            arrayList.add(this.getZauber(Zauber.\u00d8O\u00d3000));
        }
        if (this.getProfession().getSonderfertigkeiten().\u00d200000(while.nullreturnnew.toString())) {
            arrayList.add(this.getZauber(Zauber.o\u00f6\u00d3000));
        }
        if (this.getProfession().getSonderfertigkeiten().\u00d200000(while.\u00d5\u00f4\u00f4000.toString())) {
            arrayList.add(this.getZauber(Zauber.whileifnew));
        }
        if (this.getProfession().getSonderfertigkeiten().\u00d200000(while.\u00d3\u00f5\u00d3000.toString())) {
            arrayList.add(this.getZauber(Zauber.\u00f5\u00f5\u00d3000));
        }
        arrayList.add(this.getZauber(Zauber.newreturnnew));
    }
}

