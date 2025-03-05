/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.maggrundprof;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.OoOO.N;
import helden.framework.OoOO.interface;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.model.myranor.profession.varianten.MagieVarianten;
import java.util.ArrayList;

public class ArkanerKuenstlerVariante
extends MagieVarianten {
    private int whilethisfloat;

    public ArkanerKuenstlerVariante(String string, String string2, int n, boolean bl, int n2) {
        super(string, string2, n, bl);
        this.whilethisfloat = n2;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 5;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        return arrayList;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.void("KL"))) {
            return 12;
        }
        if (b_02.equals(b_0.void("CH"))) {
            return 13;
        }
        if (b_02.equals(b_0.void("IN"))) {
            return 13;
        }
        if (b_02.equals(b_0.void("FF"))) {
            return 11;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000("Instruktion", "Beseelung der Quelle"));
        arrayList.add(oooo_0.o00000("Instruktion", "Kontrolle \u00fcber Element"));
        arrayList.add(oooo_0.o00000("Instruktion", "Elementare Reinheit"));
        arrayList.add(oooo_0.o00000("Meister der Improvisation"));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(N.floatsuper().\u00d200000("Dolche"));
                arrayList.add(N.floatsuper().\u00d200000("Hiebwaffen"));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"));
                arrayList.add(N.floatsuper().\u00d200000("Singen"));
                arrayList.add(N.floatsuper().\u00d200000("Tanzen"));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(N.floatsuper().\u00d200000("Baukunst"));
                arrayList.add(N.floatsuper().\u00d200000("Gesteinskunde"));
                arrayList.add(N.floatsuper().\u00d200000("Magiekunde"));
                arrayList.add(N.floatsuper().\u00d200000("Mechanik"));
                arrayList.add(N.floatsuper().\u00d200000("Philosophie"));
                arrayList.add(N.floatsuper().\u00d200000("Rechnen"));
                arrayList.add(N.floatsuper().\u00d200000("Sagen und Legenden"));
                arrayList.add(N.floatsuper().\u00d200000("Sternkunde"));
                arrayList.removeAll(this.getProfession().getGewaehlteTalente());
                int[] nArray = new int[]{5, 3};
                return new m_0(arrayList, nArray);
            }
            case 3: {
                arrayList.addAll(this.getTalente());
                arrayList.removeAll(this.getProfession().getGewaehlteTalente());
                int[] nArray = this.whilethisfloat == 1 ? new int[]{5, 4} : new int[]{4};
                return new m_0(arrayList, nArray);
            }
            case 4: {
                arrayList.addAll(this.getSetting().get(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.remove(this.getProfession().getMuttersprache());
                int[] nArray = new int[]{5};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    public ArrayList<oo0o_0> getTalente() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        arrayList.add(N.floatsuper().\u00d200000("Schauspielerei"));
        arrayList.add(N.floatsuper().\u00d200000("Schriftlicher Ausdruck"));
        arrayList.add(N.floatsuper().\u00d200000("Sich verkleiden"));
        arrayList.add(N.floatsuper().\u00d200000("Feinmechanik"));
        arrayList.add(N.floatsuper().\u00d200000("Glaskunst"));
        arrayList.add(N.floatsuper().\u00d200000("Holzbearbeitung"));
        arrayList.add(N.floatsuper().\u00d200000("Lederarbeiten"));
        arrayList.add(N.floatsuper().\u00d200000("Malen/Zeichnen"));
        arrayList.add(N.floatsuper().\u00d200000("Musizieren"));
        arrayList.add(N.floatsuper().\u00d200000("Schneidern"));
        arrayList.add(N.floatsuper().\u00d200000("Steinmetz"));
        arrayList.add(voidsuper.StringfloatObject);
        arrayList.add(N.floatsuper().\u00d200000("T\u00e4towieren"));
        arrayList.add(N.floatsuper().\u00d200000("T\u00f6pfern"));
        arrayList.add(N.floatsuper().\u00d200000("Zimmermann"));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Etikette"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lehren"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Menschenkenntnis"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberreden"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Geschichtswissen"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heraldik"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechnen"), 2);
        return k_02;
    }

    @Override
    public ArrayList<helden.framework.oooo.a.oooo_0> getVerallgemeinteListenAuswahlen() {
        helden.framework.oooo.a.b_0 b_02;
        ArrayList<helden.framework.oooo.a.oooo_0> arrayList = new ArrayList<helden.framework.oooo.a.oooo_0>();
        helden.framework.oooo.a.oooo_0 oooo_02 = new helden.framework.oooo.a.oooo_0(1, this);
        arrayList.add(oooo_02);
        for (oo0o_0 oo0o_02 : this.getTalente()) {
            oooo_02.o00000(new helden.framework.oooo.a.b_0(new interface(oo0o_02, 7), K.o00000(I.while.toString(), oo0o_02)));
        }
        if (this.whilethisfloat == 2) {
            oooo_02 = new helden.framework.oooo.a.oooo_0(1, this);
            arrayList.add(oooo_02);
            for (oo0o_0 oo0o_02 : this.getTalente()) {
                b_02 = new helden.framework.oooo.a.b_0(new interface(oo0o_02, 5), K.o00000(I.while.toString(), oo0o_02));
                b_02.o00000(Bedingung.hatNicht(oo0o_02, (Integer)7));
                oooo_02.o00000(b_02);
            }
        }
        oooo_02 = new helden.framework.oooo.a.oooo_0(1, this);
        arrayList.add(oooo_02);
        for (oo0o_0 oo0o_02 : this.getTalente()) {
            for (P p2 : oooo_0.o00000(oo0o_02)) {
                b_02 = new helden.framework.oooo.a.b_0((Object)p2, Bedingung.hat(oo0o_02, (Integer)7));
                oooo_02.o00000(b_02);
            }
        }
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        return oo0O;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

