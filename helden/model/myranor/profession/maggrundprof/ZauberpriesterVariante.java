/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.maggrundprof;

import helden.framework.C.I;
import helden.framework.D.K;
import helden.framework.D.P;
import helden.framework.OOoO.L;
import helden.framework.OOoO.o00O;
import helden.framework.OoOO.N;
import helden.framework.OoOO.interface;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.a.b_0;
import helden.framework.oooo.a.oooo_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.zauber.MyranischerZauber;
import helden.framework.zauber.ZauberMitWertUndHZ;
import helden.model.myranor.profession.varianten.MagieVarianten;
import java.util.ArrayList;

public class ZauberpriesterVariante
extends MagieVarianten {
    public ZauberpriesterVariante(String string, String string2, int n, boolean bl) {
        super(string, string2, n, bl);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 4;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 4;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(helden.framework.C.K.o00000("Prophezeien"));
        arrayList.add(helden.framework.C.K.o00000("Vom Schicksal beg\u00fcnstigt"));
        arrayList.add(helden.framework.C.K.o00000("Prinzipientreue"));
        return arrayList;
    }

    @Override
    public int getMinimalEigenschaftswert(helden.framework.oooo.b_0 b_02) {
        if (b_02.equals(helden.framework.oooo.b_0.void("MU"))) {
            return 11;
        }
        if (b_02.equals(helden.framework.oooo.b_0.void("KL"))) {
            return 12;
        }
        if (b_02.equals(helden.framework.oooo.b_0.void("CH"))) {
            return 13;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<helden.framework.oooo.b_0> getModifikationen() {
        k_0<helden.framework.oooo.b_0> k_02 = super.getModifikationen();
        k_02.o00000(helden.framework.oooo.b_0.\u00f5\u00f5\u00d2000, 1);
        k_02.o00000(helden.framework.oooo.b_0.\u00d8\u00f5\u00d2000, 1);
        return k_02;
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Verh\u00fcllung"));
                arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Wahrnehmung der Quelle"));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
            case 1: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Geistillusion"));
                arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Illusion"));
                arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Kommunikation"));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
            case 2: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Transfer"));
                arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Kommunikation"));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
            case 3: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Kontrolle \u00fcber Element"));
                arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Kontrolle \u00fcber Gef\u00fchle"));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
        }
        return super.getSonderfertigkeitAuswahl(n);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Beseelung der Quelle"));
        arrayList.add(helden.framework.d.oooo_0.o00000("Eiserner Wille I"));
        arrayList.add(K.o00000(voidsuper.oo\u00d6000, "eigener Kult"));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(N.floatsuper().\u00d200000("Geografie"));
                arrayList.add(N.floatsuper().\u00d200000("Geschichtswissen"));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(N.floatsuper().\u00d200000("Pflanzenkunde"));
                arrayList.add(N.floatsuper().\u00d200000("Tierkunde"));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.remove(this.getProfession().getMuttersprache());
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f600000));
                int[] nArray = new int[]{5};
                return new m_0(arrayList, nArray);
            }
            case 3: {
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.super));
                arrayList.remove(voidsuper.StringObjectObject);
                int[] nArray = new int[]{2, 2};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lehren"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Menschenkenntnis"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sich verkleiden"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberreden"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberzeugen"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("G\u00f6tter und Kulte"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Magiekunde"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Philosophie"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechnen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sternkunde"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heilkunde: Seele"), 3);
        return k_02;
    }

    @Override
    public ArrayList<oooo_0> getVerallgemeinteListenAuswahlen() {
        ArrayList<oooo_0> arrayList = new ArrayList<oooo_0>();
        oooo_0 oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        oooo_02.o00000(new b_0((Object)new interface(voidsuper.\u00d4\u00d8\u00d6000, 2)));
        oooo_02.o00000(new b_0((Object)new interface(voidsuper.newnewObject, 2)));
        oooo_02.o00000(new b_0((Object)new interface(voidsuper.privateObjectObject, 4)));
        oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        for (MyranischerZauber myranischerZauber : MyranischerZauber.getMyranischeZauber()) {
            b_0 b_02;
            if (myranischerZauber.hatMerkmal(o00O.OO0000, null) || myranischerZauber.hatMerkmal(o00O.\u00d8\u00d40000, null)) continue;
            if (myranischerZauber.toString().startsWith("E:")) {
                b_02 = new b_0((Object)new ZauberMitWertUndHZ(this.getZauber(myranischerZauber), 7, true));
                oooo_02.o00000(b_02);
                continue;
            }
            b_02 = new b_0((Object)new ZauberMitWertUndHZ(this.getZauber(myranischerZauber), 5, true));
            oooo_02.o00000(b_02);
        }
        oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        ArrayList<o00O> arrayList2 = new ArrayList();
        arrayList2.addAll(o00O.OO0000());
        arrayList2.addAll(o00O.\u00f500000());
        this.addZauber(oooo_02, arrayList2, L.o00000, 6);
        this.addZauber(oooo_02, arrayList2, L.\u00d500000, 5);
        this.removeGewaehlte(oooo_02);
        oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        arrayList2 = new ArrayList<o00O>();
        arrayList2.addAll(o00O.\u00d2O0000());
        arrayList2.add(o00O.ObjectObject);
        arrayList2.add(o00O.\u00d6\u00d30000);
        this.addZauber(oooo_02, arrayList2, L.\u00d500000, 5);
        this.addZauber(oooo_02, arrayList2, L.o00000, 6);
        this.removeGewaehlte(oooo_02);
        oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        arrayList2 = new ArrayList();
        arrayList2.addAll(o00O.public());
        this.addZauber(oooo_02, arrayList2, L.\u00d500000, 3);
        this.addZauber(oooo_02, arrayList2, L.o00000, 4);
        this.removeGewaehlte(oooo_02);
        return arrayList;
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

