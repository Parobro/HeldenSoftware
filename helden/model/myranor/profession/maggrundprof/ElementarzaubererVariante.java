/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.maggrundprof;

import helden.framework.C.I;
import helden.framework.C.M;
import helden.framework.C.Oo0O;
import helden.framework.D.K;
import helden.framework.D.OoOO.privatesuper;
import helden.framework.D.P;
import helden.framework.D.Q;
import helden.framework.D.for;
import helden.framework.OOoO.A;
import helden.framework.OOoO.O;
import helden.framework.OOoO.R;
import helden.framework.OOoO.if;
import helden.framework.OOoO.o00O;
import helden.framework.OoOO.N;
import helden.framework.OoOO.interface;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.Object.floatsuper;
import helden.framework.oooo.a.b_0;
import helden.framework.oooo.a.oooo_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.zauber.ZauberMitWertUndHZ;
import helden.gui.erschaffung.werkzeug.KostenArt;
import helden.gui.erschaffung.werkzeug.KostenEntry;
import helden.model.myranor.profession.varianten.MagieVarianten;
import java.util.ArrayList;
import java.util.Vector;

public class ElementarzaubererVariante
extends MagieVarianten {
    protected o00O \u00d3\u00f8\u00f4O00;
    protected Boolean \u00d4\u00f8\u00f4O00;

    private static int \u00f600000(boolean bl) {
        if (bl) {
            return 11;
        }
        return 7;
    }

    private static String o00000(o00O o00O2, boolean bl) {
        String string = o00O2.toString().substring(11);
        string = string.substring(0, string.length() - 1);
        if (bl) {
            return string + " (Z)";
        }
        return string + " (H)";
    }

    public ElementarzaubererVariante(o00O o00O2, boolean bl) {
        super("Elementarzauberer " + ElementarzaubererVariante.o00000(o00O2, bl), "Elementarzaubererin " + ElementarzaubererVariante.o00000(o00O2, bl), ElementarzaubererVariante.\u00f600000(bl), false);
        this.\u00d3\u00f8\u00f4O00 = o00O2;
        this.\u00d4\u00f8\u00f4O00 = bl;
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 2;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 3;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(I.o\u00f60000);
        return arrayList;
    }

    @Override
    public int getMinimalEigenschaftswert(helden.framework.oooo.b_0 b_02) {
        if (b_02.equals(helden.framework.oooo.b_0.void("MU"))) {
            return 12;
        }
        if (b_02.equals(helden.framework.oooo.b_0.void("KL"))) {
            return 12;
        }
        if (b_02.equals(helden.framework.oooo.b_0.void("CH"))) {
            return 13;
        }
        if (b_02.equals(helden.framework.oooo.b_0.void("KO"))) {
            return 11;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public Vector<KostenArt> getPunktePools(floatsuper floatsuper2) {
        Vector<KostenArt> vector = super.getPunktePools(floatsuper2);
        vector.add(new KostenArt("Elementar-Pool", this.toString()){

            @Override
            public boolean darfGenutztWerden(Object object, KostenEntry.kostenBereich kostenBereich2) {
                if (!(object instanceof Q) || !KostenEntry.kostenBereich.class.equals((Object)kostenBereich2)) {
                    return false;
                }
                Q q = (Q)object;
                if (!(q.\u00d4\u00d30000() instanceof privatesuper)) {
                    return false;
                }
                R r = (R)q.\u00d8\u00d30000();
                O o = (O)r.o00000(0);
                return o.\u00f4\u00d80000().equals(ElementarzaubererVariante.this.\u00d3\u00f8\u00f4O00);
            }

            @Override
            public Vector<KostenEntry.kostenBereich> getNutzbareBereiche() {
                Vector<KostenEntry.kostenBereich> vector = super.getNutzbareBereiche();
                vector.add(KostenEntry.kostenBereich.class);
                return vector;
            }

            @Override
            public int getVerfuegbarePunkte() {
                return 150;
            }

            @Override
            public Boolean verbilligteSFKostennutzen() {
                return false;
            }
        });
        return vector;
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Antimagie"));
                arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", A.privatesuper.toString()));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
            case 1: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Verwandlung"));
                arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Verh\u00fcllung"));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
        }
        return super.getSonderfertigkeitAuswahl(n);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", A.\u00d8O0000.toString()));
        arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Elementare Manifestation"));
        arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Elementare Reinheit"));
        arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", A.oO0000.toString()));
        arrayList.add(K.o00000(voidsuper.\u00f5\u00f5\u00d5000, "Elementarismus"));
        arrayList.add(helden.framework.d.oooo_0.o00000("Quellenkenntnis", this.\u00d3\u00f8\u00f4O00.toString()));
        if (this.\u00d4\u00f8\u00f4O00.booleanValue()) {
            arrayList.add(helden.framework.d.oooo_0.o00000("Instruktion", "Hellsicht"));
            arrayList.add(helden.framework.d.oooo_0.o00000("Gro\u00dfe Meditation"));
        }
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
                arrayList.add(N.floatsuper().\u00d200000("St\u00e4be"));
                arrayList.add(N.floatsuper().\u00d200000("Bastardst\u00e4be"));
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.addAll(this.getSetting().get(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                arrayList.remove(this.getProfession().getMuttersprache());
                int[] nArray = new int[]{6};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Menschenkenntnis"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberreden"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Orientierung"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Wildnisleben"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Magiekunde"), 6);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Philosophie"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechnen"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sagen und Legenden"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sternkunde"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Malen/Zeichnen"), 4);
        if (this.\u00d3\u00f8\u00f4O00.equals(o00O.\u00d800000)) {
            k_02.\u00d200000(voidsuper.\u00d50\u00d8000, 5);
        }
        if (this.\u00d3\u00f8\u00f4O00.equals(o00O.super)) {
            k_02.\u00d200000(voidsuper.\u00d5\u00d5\u00d6000, 4);
        }
        if (this.\u00d3\u00f8\u00f4O00.equals(o00O.\u00d4O0000)) {
            k_02.\u00d200000(voidsuper.returnprivateObject, 4);
        }
        return k_02;
    }

    @Override
    public ArrayList<oooo_0> getVerallgemeinteListenAuswahlen() {
        oooo_0 oooo_02;
        ArrayList<oooo_0> arrayList = new ArrayList<oooo_0>();
        if (this.\u00d3\u00f8\u00f4O00.equals(o00O.\u00d800000)) {
            oooo_02 = new oooo_0(1, this);
            arrayList.add(oooo_02);
            oooo_02.o00000(new b_0((Object)new interface(voidsuper.forObjectObject, 1)));
            oooo_02.o00000(new b_0((Object)new interface(voidsuper.\u00f5\u00d8\u00d5000, 1)));
        }
        if (this.\u00d3\u00f8\u00f4O00.equals(o00O.\u00d2\u00d20000)) {
            oooo_02 = new oooo_0(1, this);
            arrayList.add(oooo_02);
            oooo_02.o00000(new b_0((Object)new interface(voidsuper.\u00f4\u00f4\u00d6000, 3)));
            oooo_02.o00000(new b_0((Object)new interface(voidsuper.oO\u00d8000, 3)));
        }
        if (this.\u00d3\u00f8\u00f4O00.equals(o00O.super)) {
            oooo_02 = new oooo_0(1, this);
            arrayList.add(oooo_02);
            oooo_02.o00000(new b_0((Object)new interface(voidsuper.\u00d5\u00d3\u00d8000, 3)));
            oooo_02.o00000(new b_0((Object)new interface(voidsuper.\u00d4\u00f6\u00d6000, 3)));
        }
        oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        oooo_02.o00000(new b_0(new ZauberMitWertUndHZ(this.getZauber("E:" + this.\u00d3\u00f8\u00f4O00.toString()), 8, true), new ZauberMitWertUndHZ(this.getZauber("W:" + this.\u00d3\u00f8\u00f4O00.toString()), 6, false)));
        oooo_02.o00000(new b_0(new ZauberMitWertUndHZ(this.getZauber("E:" + this.\u00d3\u00f8\u00f4O00.toString()), 7, false), new ZauberMitWertUndHZ(this.getZauber("W:" + this.\u00d3\u00f8\u00f4O00.toString()), 7, true)));
        oooo_02 = new oooo_0(2, this);
        arrayList.add(oooo_02);
        for (o00O o00O2 : o00O.\u00d2O0000()) {
            if (o00O2.equals(this.\u00d3\u00f8\u00f4O00) || o00O2.equals(this.\u00d3\u00f8\u00f4O00.\u00d500000())) continue;
            oooo_02.o00000(new b_0(new ZauberMitWertUndHZ(this.getZauber("E:" + o00O2.toString()), 4, false), new ZauberMitWertUndHZ(this.getZauber("W:" + o00O2.toString()), 4, false)));
        }
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        if (this.\u00d4\u00f8\u00f4O00.booleanValue()) {
            arrayList.addAll(for.\u00d200000("Elementarharmonisierte Aura"));
        }
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        if (this.\u00d4\u00f8\u00f4O00.booleanValue()) {
            oo0O.\u00d300000(helden.framework.C.K.o00000(I.forsupersuper));
        } else {
            oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00f5\u00d8o000));
        }
        if (this.\u00d3\u00f8\u00f4O00.equals(o00O.\u00f6O0000)) {
            oo0O.\u00d300000(helden.framework.C.K.o00000(I.nullObjectsuper));
        }
        if (this.\u00d3\u00f8\u00f4O00.equals(o00O.\u00d4\u00d20000)) {
            oo0O.\u00d300000(helden.framework.C.K.o00000(I.o\u00d3O000));
        }
        M m = (M)helden.framework.C.K.o00000(I.o\u00f60000);
        m.\u00d2o0000();
        m.o00000(new R(new Object[]{if.o00000, new Integer(1)}));
        oo0O.\u00d300000(m);
        return oo0O;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }

    @Override
    protected int getUmfangFormelPool() {
        return 50;
    }
}

