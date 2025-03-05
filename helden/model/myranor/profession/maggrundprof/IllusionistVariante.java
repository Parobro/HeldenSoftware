/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.maggrundprof;

import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.OOoO.if;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.zauber.MyranischerZauber;
import helden.framework.zauber.ZauberMitWertUndHZ;
import helden.model.myranor.profession.varianten.MagieVarianten;
import java.util.ArrayList;

public class IllusionistVariante
extends MagieVarianten {
    public IllusionistVariante(String string, String string2, int n, boolean bl) {
        super(string, string2, n, bl);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 9;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.void("MU"))) {
            return 12;
        }
        if (b_02.equals(b_0.void("KL"))) {
            return 12;
        }
        if (b_02.equals(b_0.void("IN"))) {
            return 12;
        }
        if (b_02.equals(b_0.void("CH"))) {
            return 13;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000("Instruktion", "Geistillusion"));
        arrayList.add(oooo_0.o00000("Instruktion", "Illusion"));
        arrayList.add(oooo_0.o00000("Instruktion", "Kontrolle \u00fcber Gef\u00fchle"));
        arrayList.add(oooo_0.o00000("Instruktion", "Verh\u00fcllung"));
        arrayList.add(oooo_0.o00000("Instruktion", "Wahrnehmung der Quelle"));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(N.floatsuper().\u00d200000("Raufen"));
                arrayList.add(N.floatsuper().\u00d200000("Ringen"));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(N.floatsuper().\u00d200000("Selbstbeherrschung"));
                arrayList.add(N.floatsuper().\u00d200000("Singen"));
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(N.floatsuper().\u00d200000("Bet\u00f6ren"));
                arrayList.add(N.floatsuper().\u00d200000("Etikette"));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 3: {
                arrayList.add(N.floatsuper().\u00d200000("Schauspielerei"));
                arrayList.add(N.floatsuper().\u00d200000("Sich verkleiden"));
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
            case 4: {
                arrayList.add(N.floatsuper().\u00d200000("Philosophie"));
                arrayList.add(N.floatsuper().\u00d200000("Rechtskunde"));
                arrayList.add(N.floatsuper().\u00d200000("Sternkunde"));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 5: {
                arrayList.add(N.floatsuper().\u00d200000("Fahrzeug lenken"));
                arrayList.add(N.floatsuper().\u00d200000("Falschspiel"));
                arrayList.add(N.floatsuper().\u00d200000("Handel"));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 6: {
                arrayList.add(N.floatsuper().\u00d200000("Kochen"));
                arrayList.add(N.floatsuper().\u00d200000("Stoffe f\u00e4rben"));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 7: {
                arrayList.add(N.floatsuper().\u00d200000("Malen/Zeichnen"));
                arrayList.add(N.floatsuper().\u00d200000("Musizieren"));
                int[] nArray = new int[]{4};
                return new m_0(arrayList, nArray);
            }
            case 8: {
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.remove(this.getProfession().getMuttersprache());
                int[] nArray = new int[]{5, 5};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.returnwhileObject, 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Menschenkenntnis"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberreden"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberzeugen"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Geografie"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Magiekunde"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sagen und Legenden"), 4);
        return k_02;
    }

    @Override
    public ArrayList<helden.framework.oooo.a.oooo_0> getVerallgemeinteListenAuswahlen() {
        helden.framework.oooo.a.b_0 b_02;
        ArrayList<helden.framework.oooo.a.oooo_0> arrayList = new ArrayList<helden.framework.oooo.a.oooo_0>();
        helden.framework.oooo.a.oooo_0 oooo_02 = new helden.framework.oooo.a.oooo_0(1, this);
        arrayList.add(oooo_02);
        for (MyranischerZauber myranischerZauber : MyranischerZauber.getEZauber()) {
            b_02 = new helden.framework.oooo.a.b_0((Object)new ZauberMitWertUndHZ(this.getZauber(myranischerZauber), 7, false));
            oooo_02.o00000(b_02);
        }
        oooo_02 = new helden.framework.oooo.a.oooo_0(2, this);
        arrayList.add(oooo_02);
        this.addWC(oooo_02, "E:(Un-)Element", 4);
        this.removeGewaehlte(oooo_02);
        oooo_02 = new helden.framework.oooo.a.oooo_0(2, this);
        arrayList.add(oooo_02);
        for (MyranischerZauber myranischerZauber : MyranischerZauber.getEZauber()) {
            if if_ = myranischerZauber.getSphare();
            if (!if_.equals((Object)if.\u00d500000) && !if_.equals((Object)if.\u00d400000)) continue;
            b_02 = new helden.framework.oooo.a.b_0((Object)new ZauberMitWertUndHZ(this.getZauber(myranischerZauber), 4, false));
            oooo_02.o00000(b_02);
        }
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.addAll(for.\u00d200000("Illusionszauberer"));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000("Eitelkeit"));
        oo0O.\u00d300000(K.o00000("Neugier"));
        return oo0O;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }

    @Override
    protected int getUmfangFormelPool() {
        return 220;
    }
}

