/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.maggrundprof;

import helden.framework.C.I;
import helden.framework.D.F;
import helden.framework.D.K;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.void;
import helden.framework.D.while;
import helden.framework.OOoO.L;
import helden.framework.OOoO.Objectsuper;
import helden.framework.OOoO.R;
import helden.framework.OOoO.o00O;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.oooo.a.b_0;
import helden.framework.oooo.a.oooo_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.zauber.KonkreterZauber;
import helden.model.myranor.profession.varianten.MagieVarianten;
import java.util.ArrayList;

public class MetamagierVariante
extends MagieVarianten {
    public MetamagierVariante() {
        super("Metamagier", "Metamagierin", 0, false);
    }

    public MetamagierVariante(String string, String string2, int n, boolean bl) {
        super(string, string2, n, bl);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 4;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(I.o\u00f60000);
        arrayList.add(helden.framework.C.K.o00000("Stubenhocker"));
        return arrayList;
    }

    @Override
    public int getMinimalEigenschaftswert(helden.framework.oooo.b_0 b_02) {
        if (b_02.equals(helden.framework.oooo.b_0.void("MU"))) {
            return 12;
        }
        if (b_02.equals(helden.framework.oooo.b_0.void("KL"))) {
            return 13;
        }
        if (b_02.equals(helden.framework.oooo.b_0.void("IN"))) {
            return 13;
        }
        if (b_02.equals(helden.framework.oooo.b_0.void("CH"))) {
            return 12;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<helden.framework.oooo.b_0> getModifikationen() {
        k_0<helden.framework.oooo.b_0> k_02 = super.getModifikationen();
        k_02.o00000(helden.framework.oooo.b_0.\u00f4\u00f5\u00d2000, 2);
        return k_02;
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Analyse"));
                arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Bann der Quelle"));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
        }
        return super.getSonderfertigkeitAuswahl(n);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Antimagie"));
        arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Beseelung der Quelle"));
        arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Metamagie"));
        arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Transfer"));
        arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Wahrnehmung der Quelle"));
        arrayList.add(helden.framework.d.oooo_0.o00000("Gro\u00dfbeschw\u00f6rung"));
        arrayList.add(K.o00000(voidsuper.\u00f5\u00f5\u00d5000, "Metamagie"));
        arrayList.add(helden.framework.d.oooo_0.o00000("Quellenkenntnis", "Zauberei"));
        if (this.istRepBestimmt()) {
            arrayList.add(K.o00000(this.getZauber("E:Zauberei"), "Metamagie"));
        }
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d8O0000));
                arrayList.remove(voidsuper.\u00f5\u00f5\u00d5000);
                arrayList.remove(voidsuper.\u00f4\u00f6\u00d5000);
                arrayList.remove(voidsuper.thisintObject);
                arrayList.remove(voidsuper.\u00f5\u00d2\u00d6000);
                arrayList.remove(voidsuper.\u00d3\u00d6\u00d5000);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.remove(this.getProfession().getMuttersprache());
                int[] nArray = new int[]{5};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f600000));
                int[] nArray = new int[]{5};
                return new m_0(arrayList, nArray);
            }
            case 3: {
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.super));
                arrayList.remove(voidsuper.\u00d3\u00f4\u00d5000);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Selbstbeherrschung"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lehren"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberreden"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Magiekunde"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Mechanik"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Philosophie"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechnen"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sternkunde"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Malen/Zeichnen"), 3);
        k_02.\u00d200000(this.getZauber("E:Zauberei"), 7);
        k_02.\u00d200000(this.getZauber("E:Kraft"), 5);
        return k_02;
    }

    @Override
    public ArrayList<oooo_0> getVerallgemeinteListenAuswahlen() {
        P p2;
        b_0 b_02;
        ArrayList<oooo_0> arrayList = new ArrayList<oooo_0>();
        oooo_0 oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        ArrayList<o00O> arrayList2 = new ArrayList<o00O>();
        arrayList2.add(o00O.supernew);
        arrayList2.add(o00O.\u00f8\u00d30000);
        this.addZauber(oooo_02, arrayList2, L.o00000, 5);
        this.removeGewaehlte(oooo_02);
        oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        arrayList2 = new ArrayList();
        arrayList2.addAll(o00O.public());
        this.addZauber(oooo_02, arrayList2, L.\u00d500000, 3);
        this.addZauber(oooo_02, arrayList2, L.o00000, 4);
        this.removeGewaehlte(oooo_02);
        oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        for (Objectsuper iterator : Objectsuper.o00000()) {
            Object object = (F)helden.framework.d.oooo_0.o00000(while.o\u00d3\u00f6000);
            ((F)object).new(new R(iterator, new Integer(1)));
            F f2 = (F)helden.framework.d.oooo_0.o00000(while.o\u00d3\u00f6000);
            f2.new(new R(iterator, new Integer(2)));
            b_02 = new b_0(for.o00000((P)object).get(0), for.o00000(f2).get(0));
            oooo_02.o00000(b_02);
        }
        oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        void void_ = (void)helden.framework.d.oooo_0.o00000(while.\u00d5\u00d8O000);
        for (Object object : void_.\u00f8\u00d30000()) {
            p2 = helden.framework.d.oooo_0.o00000(while.\u00d5\u00d8O000, (String)object);
            b_02 = new b_0((Object)p2, Bedingung.hatNicht(p2));
            oooo_02.o00000(b_02);
        }
        oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        for (Object object : void_.\u00f8\u00d30000()) {
            p2 = helden.framework.d.oooo_0.o00000(while.\u00d5\u00d8O000, (String)object);
            b_02 = new b_0((Object)for.o00000(p2).get(0), Bedingung.hatNicht(p2));
            oooo_02.o00000(b_02);
        }
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.addAll(for.\u00d200000("Kombinationszauberei"));
        return arrayList;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        super.setzeHauszauber(arrayList);
        arrayList.add(this.getZauber("E:Zauberei"));
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }

    @Override
    protected int getUmfangFormelPool() {
        return 200;
    }
}

