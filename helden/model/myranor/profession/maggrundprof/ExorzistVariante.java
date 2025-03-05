/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.maggrundprof;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oOoO.void;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.MyranischerZauber;
import helden.framework.zauber.ZauberMitWertUndHZ;
import helden.model.myranor.profession.varianten.MagieVarianten;
import java.util.ArrayList;

public class ExorzistVariante
extends MagieVarianten {
    public ExorzistVariante(String string, String string2, int n, boolean bl) {
        super(string, string2, n, bl);
    }

    @Override
    public int getAnzahlVerbilligteSonderfertigkeitAuswahlen() {
        return 0;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Hohe Magieresistenz"));
        return arrayList;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.void("MU"))) {
            return 13;
        }
        if (b_02.equals(b_0.void("KL"))) {
            return 12;
        }
        if (b_02.equals(b_0.void("IN"))) {
            return 11;
        }
        if (b_02.equals(b_0.void("CH"))) {
            return 13;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        k_02.o00000(b_0.void("MR"), 1);
        return k_02;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000("Instruktion", "Antimagie"));
        arrayList.add(oooo_0.o00000("Instruktion", "Bann der Quelle"));
        arrayList.add(oooo_0.o00000("Instruktion", "Hellsicht"));
        arrayList.add(oooo_0.o00000("Instruktion", "Schutz vor Quelle"));
        arrayList.add(oooo_0.o00000("Instruktion", "Wahrnehmung der Quelle"));
        arrayList.add(oooo_0.o00000("Bannung"));
        arrayList.add(oooo_0.o00000("Eiserner Wille I"));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Dolche"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Raufen"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Ringen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Selbstbeherrschung"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Menschenkenntnis"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberzeugen"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Fesseln/Entfesseln"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("G\u00f6tter und Kulte"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Magiekunde"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechnen"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heilkunde: Seele"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Malen/Zeichnen"), 4);
        return k_02;
    }

    @Override
    public ArrayList<helden.framework.oooo.a.oooo_0> getVerallgemeinteListenAuswahlen() {
        helden.framework.oooo.a.b_0 b_02;
        ArrayList<helden.framework.oooo.a.oooo_0> arrayList = new ArrayList<helden.framework.oooo.a.oooo_0>();
        helden.framework.oooo.a.oooo_0 oooo_02 = new helden.framework.oooo.a.oooo_0(1, this);
        arrayList.add(oooo_02);
        this.addWC(oooo_02, "HE:Kraft", 7);
        this.addWC(oooo_02, "HE:Zauberei", 7);
        this.addWC(oooo_02, "HE:Iryabaar", 7);
        oooo_02 = new helden.framework.oooo.a.oooo_0(1, this);
        arrayList.add(oooo_02);
        this.addWC(oooo_02, "E:Kraft", 5);
        this.addWC(oooo_02, "E:Zauberei", 5);
        this.addWC(oooo_02, "E:Iryabaar", 5);
        this.removeGewaehlte(oooo_02);
        oooo_02 = new helden.framework.oooo.a.oooo_0(2, this);
        arrayList.add(oooo_02);
        for (MyranischerZauber myranischerZauber : MyranischerZauber.getMyranischeZauber()) {
            if (!myranischerZauber.toString().startsWith("E:")) continue;
            b_02 = new helden.framework.oooo.a.b_0((Object)new ZauberMitWertUndHZ(this.getZauber(myranischerZauber), 4, false));
            oooo_02.o00000(b_02);
        }
        this.removeGewaehlte(oooo_02);
        oooo_02 = new helden.framework.oooo.a.oooo_0(1, this);
        arrayList.add(oooo_02);
        for (MyranischerZauber myranischerZauber : MyranischerZauber.getWZauber()) {
            b_02 = new helden.framework.oooo.a.b_0((Object)new ZauberMitWertUndHZ(this.getZauber(myranischerZauber), 5, false));
            oooo_02.o00000(b_02);
        }
        this.removeGewaehlte(oooo_02);
        oooo_02 = new helden.framework.oooo.a.oooo_0(1, this);
        arrayList.add(oooo_02);
        for (MyranischerZauber myranischerZauber : MyranischerZauber.getWZauber()) {
            b_02 = new helden.framework.oooo.a.b_0((Object)new ZauberMitWertUndHZ(this.getZauber(myranischerZauber), 4, false));
            oooo_02.o00000(b_02);
        }
        this.removeGewaehlte(oooo_02);
        oooo_02 = new helden.framework.oooo.a.oooo_0(1, this);
        arrayList.add(oooo_02);
        for (MyranischerZauber myranischerZauber : MyranischerZauber.getWZauber()) {
            b_02 = new helden.framework.oooo.a.b_0((Object)new ZauberMitWertUndHZ(this.getZauber(myranischerZauber), 3, false));
            oooo_02.o00000(b_02);
        }
        this.removeGewaehlte(oooo_02);
        return arrayList;
    }

    @Override
    public void getVerbilligteSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<for> arrayList = new ArrayList<for>();
                ArrayList<P> arrayList2 = this.getProfession().getSetting().getGelaendekunden();
                for (int i2 = 0; i2 < arrayList2.size(); ++i2) {
                    arrayList.add(new for(P.new(arrayList2.get(i2).toString())));
                }
                return new void(this.getProfession(), arrayList, 1);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.addAll(for.\u00d200000("Bannklinge"));
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

