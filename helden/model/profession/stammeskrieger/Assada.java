/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.stammeskrieger;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.int.N;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import java.util.ArrayList;

public class Assada
extends N {
    public Assada() {
        super("Assada", 21);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 1;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("erfahrenes Reitpferd");
        arrayList.add("ma\u00dfgeschneiderte bzw. prunkvolle Waffe");
        return arrayList;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return "Sahabiyat al'Qamar / Assada (Kriegerin)";
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(K.o00000("Ausdauernd"));
        arrayList.add(K.o00000("Autorit\u00e4tsgl\u00e4ubig"));
        arrayList.add(K.o00000("D\u00e4mmerungssicht"));
        arrayList.add(K.o00000("Gefahreninstinkt"));
        arrayList.add(K.o00000("Gl\u00fcck"));
        arrayList.add(K.o00000("Gutaussehend"));
        arrayList.add(K.o00000("Herausragender Sinn"));
        arrayList.add(K.o00000("Hohe Magieresistenz"));
        arrayList.add(K.o00000("Kampfrausch"));
        arrayList.add(K.o00000("Magiegesp\u00fcr"));
        arrayList.add(K.o00000("Monds\u00fcchtig"));
        arrayList.add(K.o00000("Schnelle Heilung"));
        arrayList.add(K.o00000("Schwer zu verzaubern"));
        arrayList.add(K.o00000("Vorurteile gegen"));
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 10;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.void("MU"))) {
            return 13;
        }
        if (b_02.equals(b_0.void("GE"))) {
            return 13;
        }
        if (b_02.equals(b_0.void("KO"))) {
            return 13;
        }
        if (b_02.equals(b_0.void("KK"))) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 5;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(oooo_0.o00000("Aufmerksamkeit"));
        arrayList.add(oooo_0.o00000("Gebirgskundig"));
        arrayList.add(oooo_0.o00000("Linkhand"));
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d3\u00d2000, "Lederharnisch"));
        arrayList.add(oooo_0.o00000("Schildkampf I"));
        arrayList.add(oooo_0.o00000("Wuchtschlag"));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.addAll(this.getSetting().get(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.super));
                int[] nArray = new int[]{1};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = new k_0<oo0o_0>();
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Bogen"), 4);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Dolche"), 4);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Raufen"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Ringen"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("S\u00e4bel"), 6);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Athletik"), 4);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Klettern"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Reiten"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Schleichen"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Schwimmen"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Selbstbeherrschung"), 5);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Sich verstecken"), 1);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Tanzen"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Etikette"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Lehren"), 5);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Menschenkenntnis"), -1);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("\u00dcberreden"), 1);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Fallen stellen"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("F\u00e4hrtensuchen"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Orientierung"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Wildnisleben"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Wettervorhersage"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Geschichtswissen"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("G\u00f6tter und Kulte"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Kriegskunst"), 4);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Magiekunde"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Rechnen"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Sagen und Legenden"), 4);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Tierkunde"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Sternkunde"), 2);
        k_02.\u00d200000(G.newwhileString, 2);
        k_02.\u00d200000(G.\u00f5\u00f6\u00f5000, 6);
        k_02.\u00d200000(G.\u00d3o\u00f5000, 5);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Heilkunde: Gift"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Heilkunde: Wunden"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Holzbearbeitung"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Kochen"), 1);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Lederarbeiten"), 2);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Malen/Zeichnen"), 3);
        k_02.\u00d200000(helden.framework.OoOO.N.floatsuper().\u00d200000("Schneidern"), 1);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.whilethissuper);
        arrayList.add(I.\u00f800000);
        arrayList.add(I.\u00d8Oo000);
        arrayList.add(I.\u00d3\u00f50000);
        arrayList.add(I.ifStringsuper);
        arrayList.add(I.Ooo000);
        arrayList.add(I.\u00d8\u00d6O000);
        arrayList.add(I.\u00f8\u00d2o000);
        arrayList.add(I.\u00d3Oo000);
        arrayList.add(I.newif);
        arrayList.add(I.\u00d8OO000);
        arrayList.add(I.privateclass);
        arrayList.add(I.privateObjectsuper);
        arrayList.add(I.newfor);
        arrayList.add(I.\u00d5\u00d40000);
        arrayList.add(I.OOO000);
        arrayList.add(I.\u00d3\u00d6o000);
        arrayList.add(I.\u00f40\u00d2000);
        arrayList.add(I.\u00f5\u00d6O000);
        arrayList.add(I.o\u00f8o000);
        arrayList.add(I.\u00d8\u00f50000);
        arrayList.add(I.\u00d4\u00f5o000);
        arrayList.add(I.\u00d3\u00d3O000);
        arrayList.add(I.\u00f4\u00f5o000);
        arrayList.add(I.\u00d3\u00d8o000);
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.addAll(for.\u00d200000("Kampfreflexe"));
        arrayList.addAll(for.\u00d200000("Finte"));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.\u00d5oo000, "", 10));
        oo0O.\u00d300000(K.o00000(I.\u00d3\u00d30000, "gegen\u00fcber dem Orden"));
        oo0O.\u00d300000(K.o00000(I.o\u00d5O000, "Geld", 5));
        oo0O.\u00d300000(K.o00000(I.o\u00d5O000, "G\u00f6tterwelt", 5));
        oo0O.\u00d300000(K.o00000(I.o\u00d5O000, "Feudalherrschaft", 5));
        return oo0O;
    }

    @Override
    public boolean istZeitaufwendig() {
        return true;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

