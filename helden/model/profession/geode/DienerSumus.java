/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.geode;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.public;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.o00o_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.model.profession.geode.Geode;
import java.util.ArrayList;

public class DienerSumus
extends Geode {
    public DienerSumus() {
        super("Diener Sumus", 15);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 2;
    }

    @Override
    public int getAnzahlVorteilAuswahlen() {
        return 1;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Diener Sumus";
        }
        return "Dienerin Sumus";
    }

    @Override
    public helden.framework.OOoO.K getRepraesentation(Zauber zauber) {
        return super.getRepraesentation(zauber);
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 1: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(oooo_0.o00000(while.\u00f8\u00f6\u00d4000.toString()));
                arrayList.add(oooo_0.o00000(while.\u00f6\u00d8O000.toString()));
                arrayList.add(oooo_0.o00000(while.Stringwhilesuper.toString()));
                arrayList.add(oooo_0.o00000(while.nullreturnnew.toString()));
                arrayList.add(oooo_0.o00000(while.\u00d5\u00f4\u00f4000.toString()));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
        }
        return super.getSonderfertigkeitAuswahl(n);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00d2\u00d2\u00f4000.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.o\u00d5\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00f6\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d8\u00d5\u00d5000, 2);
        k_02.\u00d200000(voidsuper.\u00f4\u00d5\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00f5\u00f5\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d5\u00d6000, 3);
        k_02.\u00d200000(this.getZauber(Zauber.thispublicnew), 5);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f8\u00f5\u00d4000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f5\u00d4\u00d4000), 7);
        k_02.\u00d200000(this.getZauber(Zauber.O\u00d5\u00d3000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.o\u00f6\u00d4000), 7);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d4o\u00d3000), 6);
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
        k_02.\u00d200000(this.getZauber(Zauber.\u00d8\u00d6\u00d3000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d5\u00d8\u00d3000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.newfornew), 3);
        k_02.\u00d200000(this.getZauber(Zauber.O\u00d2\u00d4000), 4);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d8\u00d3\u00d4000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.ifthisObject), 4);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d5\u00d5\u00d4000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f8o\u00d5000), 2);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d3o\u00d4000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f5\u00f8\u00d4000), 2);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.Stringwhilenew));
        return arrayList;
    }

    @Override
    public o00o_0 getVorteilAuswahl(int n) {
        ArrayList<public> arrayList = new ArrayList<public>(2);
        arrayList.add(K.o00000(I.o\u00d5O000, "Geld", 5));
        arrayList.add(K.o00000(I.o\u00d5O000, "weltliche Autorit\u00e4ten", 5));
        return new o00o_0(this.getProfession(), arrayList, 1);
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.iffornew, helden.framework.OOoO.K.\u00f4\u00d20000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00f6\u00d3000, helden.framework.OOoO.K.\u00f4\u00d20000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.O\u00d2\u00d5000, helden.framework.OOoO.K.\u00f4\u00d20000, ""));
        return waehlbareZauber;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        super.setzeHauszauber(arrayList);
        arrayList.add(this.getZauber(Zauber.thispublicnew));
        arrayList.add(this.getZauber(Zauber.\u00f8\u00f5\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00f5\u00d4\u00d4000));
        arrayList.add(this.getZauber(Zauber.O\u00d5\u00d3000));
        arrayList.add(this.getZauber(Zauber.o\u00f6\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00d4o\u00d3000));
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
    }
}

