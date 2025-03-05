/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.heilari;

import helden.framework.C.I;
import helden.framework.C.Oo0O;
import helden.framework.C.public;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.OOoO.K;
import helden.framework.OoOO.E;
import helden.framework.OoOO.U;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.int.N;
import helden.framework.oOoO.void;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.o00o_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import java.util.ArrayList;
import java.util.Vector;

public class Heilari
extends N {
    private Oo0O \u00f8\u00d6\u00f6000 = new Oo0O();
    private int whileifclass = 0;
    private I o\u00d8\u00f6000;
    private I O\u00d8\u00f6000;
    private Boolean ififclass;

    public Heilari() {
        super("Heilari", 7);
        this.createPseudoVorteile();
        this.ififclass = null;
    }

    public void createPseudoVorteile() {
        String string = "\u00dcbernat\u00fcrliche Begabungen: " + Zauber.\u00f8o\u00d4000 + ", " + Zauber.\u00f8\u00f8\u00d4000 + ", " + Zauber.returnwhilenew;
        this.o\u00d8\u00f6000 = new I(string, 0);
        string = "Meisterhandwerk: " + voidsuper.\u00d5\u00d5\u00d6000 + ", " + voidsuper.\u00f5\u00f5\u00d6000 + ", " + voidsuper.o\u00d5\u00d6000;
        this.O\u00d8\u00f6000 = new I(string, 0);
    }

    @Override
    public int getAnzahlVerbilligteSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public int getAnzahlVorteilAuswahlen() {
        return 2;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Beutel mit Kr\u00e4utern und hochwertiges Besteck");
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 8;
    }

    public I getMh() {
        return this.O\u00d8\u00f6000;
    }

    public Boolean getMhGewaehlt() {
        return this.ififclass;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 11;
        }
        if (b_02.equals(b_0.newwhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 13;
        }
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 4;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00d2\u00d6\u00d2000.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(E.nullsuperString, 3);
        k_02.\u00d200000(E.\u00f5\u00d3\u00d8000, 2);
        k_02.\u00d200000(E.\u00f4\u00d6\u00d8000, 2);
        k_02.\u00d200000(E.\u00d5\u00d6\u00d8000, 1);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00d2\u00d8000, 1);
        k_02.\u00d200000(voidsuper.\u00d4\u00f8\u00d5000, 4);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 4);
        k_02.\u00d200000(voidsuper.\u00d40\u00d6000, 1);
        k_02.\u00d200000(voidsuper.O\u00f6\u00d5000, 1);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, 5);
        k_02.\u00d200000(voidsuper.\u00d30\u00d8000, 4);
        k_02.\u00d200000(voidsuper.StringclassObject, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d6\u00d5000, 1);
        k_02.\u00d200000(voidsuper.StringvoidObject, 1);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d3\u00d8000, 2);
        k_02.\u00d200000(voidsuper.oo\u00d6000, 1);
        k_02.\u00d200000(voidsuper.o\u00d5\u00d6000, 5);
        k_02.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00f6\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00f5o\u00d6000, 2);
        k_02.\u00d200000(voidsuper.oO\u00d6000, 1);
        k_02.\u00d200000(voidsuper.\u00f4\u00d5\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00f5\u00f5\u00d6000, 6);
        k_02.\u00d200000(voidsuper.StringObjectObject, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d5\u00d6000, 6);
        k_02.\u00d200000(voidsuper.\u00d3\u00d8\u00d5000, 1);
        k_02.\u00d200000(voidsuper.o\u00f6\u00d6000, 5);
        k_02.\u00d200000(voidsuper.\u00d4\u00d4\u00d5000, 1);
        k_02.\u00d200000(voidsuper.ififObject, 1);
        k_02.\u00d200000(voidsuper.returnifObject, 1);
        return k_02;
    }

    public I getUb() {
        return this.o\u00d8\u00f6000;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f5\u00f4o000);
        arrayList.add(I.O\u00f4O000);
        arrayList.add(I.whilereturn);
        return arrayList;
    }

    @Override
    public void getVerbilligteSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<for> arrayList = new ArrayList<for>();
                arrayList.add(new for(while.\u00f6o\u00d5000));
                arrayList.add(new for(while.\u00d2\u00d4O000));
                return new void(this.getProfession(), arrayList, 1);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.\u00d30\u00f5000));
        if (super.getGewaehlteVerbilligteSonderfertigkeiten() != null) {
            arrayList.addAll(super.getGewaehlteVerbilligteSonderfertigkeiten());
        }
        return arrayList;
    }

    @Override
    public o00o_0 getVorteilAuswahl(int n) {
        if (this.whileifclass == 0) {
            ++this.whileifclass;
            ArrayList<public> arrayList = new ArrayList<public>();
            arrayList.add(public.\u00d400000(this.o\u00d8\u00f6000, 3));
            arrayList.add(public.\u00d400000(this.O\u00d8\u00f6000, 3));
            return new o00o_0(this.getProfession(), arrayList, 1);
        }
        if (this.whileifclass == 1) {
            ++this.whileifclass;
            if (!this.ififclass.booleanValue()) {
                return o00o_0.o00000(this.getProfession(), helden.framework.C.K.o00000(this.getZauber()), 2);
            }
            return o00o_0.o00000(this.getProfession(), helden.framework.C.K.\u00d200000(this.getTalenteFuerAuswahl()), 2);
        }
        throw new c_1();
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.o\u00f4o000));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00d5\u00d3O000));
        oo0O.new(this.\u00f8\u00d6\u00f6000);
        return oo0O;
    }

    public Vector<KonkreterZauber> getZauber() {
        Vector<KonkreterZauber> vector = new Vector<KonkreterZauber>(28);
        vector.add(this.getZauber(Zauber.\u00d5\u00d8\u00d3000));
        vector.add(this.getZauber(Zauber.\u00f4\u00f6\u00d4000));
        vector.add(this.getZauber(Zauber.\u00d40\u00d4000));
        vector.add(this.getZauber(Zauber.O\u00d2\u00d5000));
        vector.add(this.getZauber(Zauber.\u00d8\u00d5\u00d3000));
        vector.add(this.getZauber(Zauber.o\u00f6\u00d4000));
        vector.add(this.getZauber(Zauber.\u00d3\u00d2\u00d5000));
        return vector;
    }

    public void setMhGewaehlt(Boolean bl) {
        this.ififclass = bl;
    }

    @Override
    protected K getRepraesentation(Zauber zauber) {
        return K.\u00d400000;
    }

    protected ArrayList<U> getTalenteFuerAuswahl() {
        ArrayList<U> arrayList = new ArrayList<U>();
        arrayList.add(voidsuper.\u00d3\u00f4\u00d6000);
        arrayList.add(voidsuper.\u00d5\u00d3\u00d8000);
        arrayList.add(voidsuper.\u00f5o\u00d6000);
        arrayList.add(voidsuper.\u00f4\u00d5\u00d6000);
        arrayList.add(voidsuper.StringObjectObject);
        arrayList.add(voidsuper.o\u00f6\u00d6000);
        return arrayList;
    }
}

