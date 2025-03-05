/*
 * Decompiled with CFR 0.152.
 */
package helden.model.kultur;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.OOOo;
import helden.framework.D.OoOO.U;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.L;
import helden.framework.int.OooO;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.framework.oOoO.void;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.model.ProfessionenFabrik;
import helden.model.profession.Ausrufer;
import helden.model.profession.Barde;
import helden.model.profession.Bauer;
import helden.model.profession.Bordmagus;
import helden.model.profession.Domestik;
import helden.model.profession.Druide;
import helden.model.profession.Edelhandwerker;
import helden.model.profession.Entdecker;
import helden.model.profession.Fernhaendler;
import helden.model.profession.Fischer;
import helden.model.profession.Gardist;
import helden.model.profession.Gaukler;
import helden.model.profession.Geweihter;
import helden.model.profession.Godi;
import helden.model.profession.Grosswildjaeger;
import helden.model.profession.Haendler;
import helden.model.profession.Heilari;
import helden.model.profession.Hexe;
import helden.model.profession.Hirte;
import helden.model.profession.Jaeger;
import helden.model.profession.KaempferUdw;
import helden.model.profession.Krieger;
import helden.model.profession.Kundschafter;
import helden.model.profession.Magier;
import helden.model.profession.Prospektor;
import helden.model.profession.Rattenfaenger;
import helden.model.profession.Scharlatan;
import helden.model.profession.Schelm;
import helden.model.profession.Schiffer;
import helden.model.profession.Seefahrer;
import helden.model.profession.Soeldner;
import helden.model.profession.Soldat;
import helden.model.profession.WindUndWettermagus;
import java.util.ArrayList;

public class Thorwal
extends OooO {
    public static final P returnnewreturn = new P("Thorwal", 0, false);
    public static final P ifnewreturn = new P("Binnenland", 1, false);
    public static final P \u00d5\u00f4\u00f8000 = new P("Sippe (UdW)", 0, false);
    public static final P \u00f8\u00f4\u00f8000 = new P("Ottajasko (UdW)", 1, false);
    public static final P o\u00f5\u00f8000 = new P("S\u00f6ldnerottajasko Hammerfaust in Vinay/Brabak (UdW)", 0, false);
    public static final P \u00f5\u00f4\u00f8000 = new P("S\u00f6ldnerottajasko Hammerfaust in Askja/Regenwald (UdW)", 1, false);
    public static final P \u00f4\u00f4\u00f8000 = new P("S\u00f6ldnerottajasko Bannertr\u00e4ger in Drolsash/Drol (UdW)", 3, false);
    public static final P O\u00f5\u00f8000 = new P("S\u00f6ldnerottajasko Drachen von Llanka, heimatlos (UdW)", 0, false);
    public static final P \u00d4\u00f4\u00f8000 = new P("Sippe aus dem Binnenland (UdW)", 1, false);
    private int \u00d8\u00f4\u00f8000 = 0;

    public Thorwal() {
    }

    public Thorwal(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(E.\u00f4\u00d6\u00d8000, 2);
        this.setTalentwert(E.\u00f5\u00d3\u00d8000, 1);
        this.setTalentwert(E.\u00d5\u00d4\u00d8000, 2);
        this.setTalentwert(voidsuper.ifforObject, 1);
        this.setTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 1);
        this.setTalentwert(voidsuper.returnprivateObject, 3);
        this.setTalentwert(voidsuper.\u00d40\u00d6000, 3);
        this.setTalentwert(voidsuper.\u00d5\u00f6\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00f80\u00d6000, 3);
        this.setTalentwert(voidsuper.StringvoidObject, 3);
        this.setTalentwert(voidsuper.oo\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 4);
        this.setTalentwert(voidsuper.\u00d3\u00d6\u00d5000, 1);
        this.setTalentwert(voidsuper.thisclassObject, 2);
        this.setTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00d8\u00d8\u00d5000, 2);
        if (this.istVariante(ifnewreturn)) {
            this.addTalentwert(E.\u00f8\u00d5\u00d8000, 1);
            this.addTalentwert(voidsuper.ifforObject, 1);
            this.addTalentwert(voidsuper.\u00f8\u00f4\u00d6000, 1);
            this.addTalentwert(voidsuper.returnprivateObject, -1);
            this.addTalentwert(voidsuper.\u00f8\u00d8\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00d5\u00d6\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00f80\u00d6000, -2);
            this.addTalentwert(voidsuper.StringvoidObject, -1);
            this.addTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 2);
            this.removeTalent(voidsuper.\u00d8\u00d8\u00d5000);
            this.addTalentwert(voidsuper.thisclassObject, -1);
        }
        if (this.istVariante(\u00d5\u00f4\u00f8000)) {
            this.addTalentwert(E.\u00f5\u00d3\u00d8000, 1);
            this.addTalentwert(E.\u00f4\u00d6\u00d8000, 1);
            this.addTalentwert(voidsuper.newnewObject, 1);
            this.addTalentwert(voidsuper.oo\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00d4\u00f6\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 1);
            this.removeTalent(voidsuper.\u00d3\u00d6\u00d5000);
            this.addTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 1);
            this.addTalentwert(voidsuper.o\u00f6\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00d8\u00d8\u00d5000, -1);
        }
        if (this.istVariante(\u00f8\u00f4\u00f8000)) {
            this.addTalentwert(E.\u00f5\u00d3\u00d8000, 1);
            this.addTalentwert(E.\u00f4\u00d6\u00d8000, 2);
            this.addTalentwert(E.\u00d5\u00d4\u00d8000, 1);
            this.addTalentwert(E.\u00d3\u00d5\u00d8000, 1);
            this.addTalentwert(voidsuper.returnprivateObject, 1);
            this.addTalentwert(voidsuper.newnewObject, 1);
            this.addTalentwert(voidsuper.\u00d5\u00f6\u00d5000, 1);
            this.addTalentwert(voidsuper.StringvoidObject, 2);
            this.addTalentwert(voidsuper.\u00d40\u00d8000, 1);
            this.addTalentwert(voidsuper.\u00d3\u00d6\u00d5000, 1);
            this.addTalentwert(voidsuper.thisclassObject, 2);
            this.addTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00d8\u00d8\u00d5000, 1);
            this.addTalentwert(voidsuper.newreturnObject, 1);
        }
        if (this.istVariante(o\u00f5\u00f8000)) {
            this.addTalentwert(E.\u00f5\u00d3\u00d8000, 1);
            this.addTalentwert(voidsuper.StringvoidObject, 1);
            this.addTalentwert(voidsuper.\u00d40\u00d8000, 1);
            this.addTalentwert(voidsuper.thisclassObject, 1);
            this.addTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00d8\u00d8\u00d5000, 1);
            this.addTalentwert(voidsuper.O0\u00d6000, 1);
            this.addTalentwert(voidsuper.O\u00f6\u00d5000, 1);
            this.addTalentwert(voidsuper.forclassObject, 1);
            this.addTalentwert(voidsuper.oo\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00f5\u00d2\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00f8\u00f4\u00d5000, -1);
            this.addTalentwert(voidsuper.O\u00f4\u00d5000, 1);
        }
        if (this.istVariante(\u00f5\u00f4\u00f8000)) {
            this.addTalentwert(E.\u00f5\u00d3\u00d8000, 1);
            this.addTalentwert(E.\u00d3\u00d5\u00d8000, 1);
            this.addTalentwert(voidsuper.\u00f8\u00d8\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00d5\u00d6\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00d40\u00d8000, 1);
            this.addTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 1);
            this.addTalentwert(voidsuper.oo\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00f8\u00f4\u00d5000, -1);
            this.addTalentwert(G.\u00d5o\u00f5000, 4);
            this.addTalentwert(voidsuper.thisclassObject, 1);
            this.addTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 2);
            this.addTalentwert(voidsuper.\u00d8\u00d8\u00d5000, 1);
        }
        if (this.istVariante(\u00f4\u00f4\u00f8000)) {
            this.addTalentwert(E.\u00d4\u00d6\u00d8000, 1);
            this.addTalentwert(E.\u00f5\u00d3\u00d8000, 1);
            this.addTalentwert(voidsuper.O0\u00d6000, 1);
            this.addTalentwert(voidsuper.thisinterfaceObject, 1);
            this.addTalentwert(voidsuper.\u00d5\u00d4\u00d6000, 1);
            this.addTalentwert(voidsuper.oo\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00f5\u00d2\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00f8\u00f4\u00d5000, -1);
            this.addTalentwert(G.\u00d8\u00d8\u00f5000, 2);
        }
        if (this.istVariante(O\u00f5\u00f8000)) {
            this.addTalentwert(E.\u00f5\u00d3\u00d8000, 2);
            this.addTalentwert(E.thissuperString, 1);
            this.addTalentwert(voidsuper.\u00d40\u00d8000, 3);
            this.addTalentwert(voidsuper.thisclassObject, 2);
            this.addTalentwert(voidsuper.\u00d8\u00d8\u00d5000, 2);
            this.addTalentwert(voidsuper.\u00f5\u00f5\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00f5\u00d2\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00f8\u00f4\u00d5000, -1);
            this.addTalentwert(voidsuper.O\u00f4\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00d3\u00d6\u00d5000, 1);
            this.addTalentwert(G.whilewhileString, 4);
        }
        if (this.istVariante(\u00d4\u00f4\u00f8000)) {
            this.addTalentwert(E.\u00f5\u00d3\u00d8000, 1);
            this.addTalentwert(E.\u00f4\u00d6\u00d8000, 1);
            this.addTalentwert(E.\u00f8\u00d5\u00d8000, 1);
            this.addTalentwert(voidsuper.ifforObject, 1);
            this.addTalentwert(voidsuper.\u00f8\u00f4\u00d6000, 1);
            this.addTalentwert(voidsuper.returnprivateObject, -1);
            this.addTalentwert(voidsuper.newnewObject, 1);
            this.addTalentwert(voidsuper.\u00f8\u00d8\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00d5\u00d6\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00f80\u00d6000, -2);
            this.addTalentwert(voidsuper.StringvoidObject, -1);
            this.addTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 3);
            this.addTalentwert(voidsuper.\u00d8\u00d8\u00d5000, -3);
            this.addTalentwert(voidsuper.oo\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00d4\u00f6\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00d3\u00d6\u00d5000, -1);
            this.addTalentwert(voidsuper.thisclassObject, -1);
            this.addTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 1);
            this.addTalentwert(voidsuper.o\u00f6\u00d6000, 1);
        }
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.StringObject);
        arrayList.add(I.\u00f5O0000);
        arrayList.add(I.\u00f4\u00d8O000);
        arrayList.add(I.\u00d4\u00f8o000);
        arrayList.add(I.\u00d8\u00f6o000);
        arrayList.add(I.o\u00d8o000);
        arrayList.add(I.OO0000);
        arrayList.add(I.returnnewsuper);
        arrayList.add(I.\u00f8\u00d4O000);
        arrayList.add(I.\u00d3\u00d40000);
        arrayList.add(I.ifreturn);
        arrayList.add(I.newif);
        arrayList.add(I.\u00d50o000);
        arrayList.add(I.\u00d40O000);
        arrayList.add(I.newnew);
        arrayList.add(I.\u00d3\u00d30000);
        arrayList.add(I.O\u00d5o000);
        return arrayList;
    }

    @Override
    public String getID() {
        return "K37";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Thorwal";
    }

    @Override
    public int getMaximalSozialstatus() {
        return 10;
    }

    @Override
    public G getMuttersprache() {
        return G.\u00d8\u00d3\u00f5000;
    }

    @Override
    public ArrayList<String> getNamesGeneratorListen(floatsuper floatsuper2) {
        ArrayList<String> arrayList = super.getNamesGeneratorListen(floatsuper2);
        arrayList.add("Thorwalsche Namen");
        return arrayList;
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.\u00d8\u00f4\u00f8000) {
            case 0: {
                if (this.istVariante(o\u00f5\u00f8000)) {
                    arrayList.add(G.newwhileString);
                    arrayList.add(G.\u00d5o\u00f5000);
                    int[] nArray = new int[]{4};
                    ++this.\u00d8\u00f4\u00f8000;
                    return new o0oo_2(this, arrayList, nArray);
                }
                if (this.istVariante(O\u00f5\u00f8000)) {
                    arrayList.add(G.\u00d3o\u00f5000);
                    arrayList.add(G.\u00d8\u00d8\u00f5000);
                    int[] nArray = new int[]{3};
                    ++this.\u00d8\u00f4\u00f8000;
                    return new o0oo_2(this, arrayList, nArray);
                }
                if (this.istVariante(ifnewreturn)) {
                    arrayList.add(voidsuper.\u00d5\u00d2\u00d6000);
                    arrayList.add(voidsuper.\u00d8O\u00d8000);
                    arrayList.add(voidsuper.\u00f5\u00d8\u00d5000);
                    arrayList.add(voidsuper.\u00d3\u00d8\u00d5000);
                    arrayList.add(voidsuper.\u00d4\u00d4\u00d5000);
                    arrayList.add(voidsuper.returnifObject);
                    arrayList.add(voidsuper.\u00d5\u00d3\u00d6000);
                    arrayList.add(voidsuper.\u00f5\u00d5\u00d6000);
                    arrayList.add(voidsuper.newreturnObject);
                    int[] nArray = new int[]{1, 1};
                    ++this.\u00d8\u00f4\u00f8000;
                    return new o0oo_2(this, arrayList, nArray);
                }
                if (this.istVariante(\u00d5\u00f4\u00f8000)) {
                    arrayList.add(voidsuper.\u00d5\u00d2\u00d6000);
                    arrayList.add(voidsuper.\u00f5\u00d8\u00d5000);
                    arrayList.add(voidsuper.\u00d4\u00d4\u00d5000);
                    arrayList.add(voidsuper.returnifObject);
                    arrayList.add(voidsuper.\u00f5\u00f6\u00d5000);
                    arrayList.add(voidsuper.\u00f5\u00d5\u00d6000);
                    arrayList.add(voidsuper.newreturnObject);
                    arrayList.add(voidsuper.oo\u00d8000);
                    int[] nArray = new int[]{1, 1, 1};
                    ++this.\u00d8\u00f4\u00f8000;
                    return new o0oo_2(this, arrayList, nArray);
                }
                if (this.istVariante(\u00d4\u00f4\u00f8000)) {
                    arrayList.add(voidsuper.\u00d5\u00d2\u00d6000);
                    arrayList.add(voidsuper.\u00d8O\u00d8000);
                    arrayList.add(voidsuper.\u00f5\u00d8\u00d5000);
                    arrayList.add(voidsuper.\u00d3\u00d8\u00d5000);
                    arrayList.add(voidsuper.\u00d4\u00d4\u00d5000);
                    arrayList.add(voidsuper.returnifObject);
                    arrayList.add(voidsuper.\u00f5\u00f6\u00d5000);
                    arrayList.add(voidsuper.\u00d5\u00d3\u00d6000);
                    arrayList.add(voidsuper.\u00f5\u00d5\u00d6000);
                    arrayList.add(voidsuper.newreturnObject);
                    arrayList.add(voidsuper.oo\u00d8000);
                    int[] nArray = new int[]{1, 1, 1, 1, 1};
                    ++this.\u00d8\u00f4\u00f8000;
                    return new o0oo_2(this, arrayList, nArray);
                }
                if (!this.istVariante(\u00f8\u00f4\u00f8000)) break;
                arrayList.add(voidsuper.\u00d5\u00d2\u00d6000);
                arrayList.add(voidsuper.\u00f5\u00d8\u00d5000);
                arrayList.add(voidsuper.\u00d4\u00d4\u00d5000);
                arrayList.add(voidsuper.\u00f5\u00f6\u00d5000);
                arrayList.add(voidsuper.oo\u00d8000);
                int[] nArray = new int[]{1, 1};
                ++this.\u00d8\u00f4\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public void getNextVerbilligteSonderfertigkeitAuswahl() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.\u00f6o\u00d5000));
        arrayList.add(new for(while.\u00d50\u00d3000));
        return new void(this, arrayList, 1);
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        L l2;
        ArrayList<super> arrayList = new ArrayList<super>();
        if (!this.istVariante(returnnewreturn) && !this.istVariante(ifnewreturn)) {
            l2 = new KaempferUdw(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
            l2.clearMoeglicheVarianten();
            arrayList.remove(l2);
            if (this.istVariante(\u00d5\u00f4\u00f8000) || this.istVariante(\u00d4\u00f4\u00f8000)) {
                l2.addMoeglicheVariante(((KaempferUdw)l2).getSippe());
                l2.addMoeglicheVariante(((KaempferUdw)l2).getSeefahrerSippe());
                l2.addMoeglicheVariante(((KaempferUdw)l2).getRobbenjaegerSippe());
            } else {
                l2.addMoeglicheVariante(((KaempferUdw)l2).getOttajasko());
                l2.addMoeglicheVariante(((KaempferUdw)l2).getSeefahrerOttajasko());
                l2.addMoeglicheVariante(((KaempferUdw)l2).getRobbenjaegerOttajasko());
                if (this.istVariante(returnnewreturn)) {
                    l2.addMoeglicheVariante(((KaempferUdw)l2).getSippe());
                    l2.addMoeglicheVariante(((KaempferUdw)l2).getSeefahrerSippe());
                    l2.addMoeglicheVariante(((KaempferUdw)l2).getRobbenjaegerSippe());
                }
            }
            arrayList.add(l2);
        }
        l2 = new Krieger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        arrayList.remove(l2);
        l2.addMoeglicheVariante(((Krieger)l2).getThorwal());
        l2.addMoeglicheVariante(((Krieger)l2).getThorwalFotskari());
        l2.addMoeglicheVariante(((Krieger)l2).getThorwalBogskari());
        l2.addMoeglicheVariante(((Krieger)l2).getThorwalHerverkmader());
        l2.addMoeglicheVariante(((Krieger)l2).getThorwalMangskari());
        l2.addMoeglicheVariante(((Krieger)l2).getThorwalRiddari());
        l2.addMoeglicheVariante(((Krieger)l2).getThorwalSjahskari());
        l2.addMoeglicheVariante(((Krieger)l2).getPrem2());
        arrayList.add(l2);
        Soldat soldat = new Soldat(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        soldat.addMoeglicheVariante(soldat.getThinskari());
        arrayList.add(soldat);
        Soeldner soeldner = new Soeldner(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        soeldner.addMoeglicheVariante(soeldner.getPremerSeesoeldner());
        arrayList.add(soeldner);
        arrayList.add(new Entdecker(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Fernhaendler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Fischer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Grosswildjaeger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Hirte(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        Jaeger jaeger = new Jaeger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        jaeger.removeMoeglicheVariante(jaeger.getWildhueter());
        if (!(this.istVariante(o\u00f5\u00f8000) || this.istVariante(\u00f5\u00f4\u00f8000) || this.istVariante(\u00f4\u00f4\u00f8000) || this.istVariante(O\u00f5\u00f8000))) {
            jaeger.addMoeglicheVariante(jaeger.getRobbenjaeger());
            jaeger.removeMoeglicheVariante(jaeger.getFallensteller());
            jaeger.addMoeglicheVariante(jaeger.getThorwallerFallensteller());
        }
        arrayList.add(jaeger);
        arrayList.add(new Kundschafter(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        Prospektor prospektor = new Prospektor(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        prospektor.clearMoeglicheVarianten();
        prospektor.addMoeglicheVariante(prospektor.getGoldsucher());
        arrayList.add(prospektor);
        arrayList.add(new Schiffer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        Seefahrer seefahrer = new Seefahrer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        seefahrer.removeMoeglicheVariante(seefahrer.getWalfaenger());
        arrayList.add(seefahrer);
        Barde barde = new Barde(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        barde.clearMoeglicheVarianten();
        barde.addMoeglicheVariante(barde.getSkalde());
        barde.addMoeglicheVariante(barde.getRunajasko());
        arrayList.add(barde);
        arrayList.add(new Gaukler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Haendler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Ausrufer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.addAll(ProfessionenFabrik.getHandwerklicheProfessionen(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        Bauer bauer = new Bauer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        arrayList.remove(bauer);
        arrayList.remove(new Domestik(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.remove(new Rattenfaenger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Druide(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Hexe(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        Magier magier = new Magier(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        magier.addMoeglicheVariante(magier.getOlport());
        arrayList.add(magier);
        arrayList.add(new Scharlatan(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Schelm(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Godi(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Heilari(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new WindUndWettermagus(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        Geweihter geweihter = new Geweihter(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        geweihter.clearMoeglicheVarianten();
        geweihter.addMoeglicheVariante(geweihter.getFirunThorwal());
        geweihter.addMoeglicheVariante(geweihter.getIfirnThorwal());
        geweihter.addMoeglicheVariante(geweihter.getTraviaThorwal());
        geweihter.addMoeglicheVariante(geweihter.getSwafnir());
        geweihter.addMoeglicheVariante(geweihter.getSwafnirHirte());
        geweihter.addMoeglicheVariante(geweihter.getEfferdBinnenland());
        geweihter.addMoeglicheVariante(geweihter.getEfferdKueste());
        geweihter.addMoeglicheVariante(geweihter.getTravia());
        geweihter.addMoeglicheVariante(geweihter.getIfirn());
        geweihter.addMoeglicheVariante(geweihter.getFirunWaldlaeufer());
        arrayList.add(geweihter);
        Edelhandwerker edelhandwerker = new Edelhandwerker(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        arrayList.remove(edelhandwerker);
        edelhandwerker.addMoeglicheVariante(edelhandwerker.getTradSchiffbauer());
        arrayList.add(edelhandwerker);
        Gardist gardist = new Gardist(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        gardist.clearMoeglicheVarianten();
        gardist.addMoeglicheVariante(gardist.getEnqui());
        arrayList.add(gardist);
        arrayList.add(new Bordmagus(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        return arrayList;
    }

    @Override
    public G getSchrift() {
        return G.\u00d8\u00d8\u00f5000;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = new OOOo();
        U u2 = (U)oooo_0.o00000("Kulturkunde");
        u2.\u00d500000(this.getKulturkundeBezeichnung());
        oOOo.o00000(u2);
        return oOOo;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d5\u00d6O000);
        arrayList.add(I.whilethissuper);
        arrayList.add(I.\u00f4O\u00d2000);
        arrayList.add(I.\u00d4oo000);
        arrayList.add(I.privateinterface);
        arrayList.add(I.o\u00f8O000);
        arrayList.add(I.\u00f5\u00f6o000);
        arrayList.add(I.\u00d5O\u00d2000);
        arrayList.add(I.\u00d8o0000);
        if (this.istVariante(\u00d5\u00f4\u00f8000) || this.istVariante(\u00f8\u00f4\u00f8000) || this.istVariante(\u00d4\u00f4\u00f8000)) {
            arrayList.add(I.\u00f4\u00f5o000);
        }
        if (this.istVariante(\u00f8\u00f4\u00f8000)) {
            arrayList.add(I.newfor);
            arrayList.add(I.thisclass);
            arrayList.add(I.\u00f40\u00d2000);
            arrayList.add(I.\u00f5\u00d30000);
        }
        return arrayList;
    }

    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        if (!this.istVariante(ifnewreturn) && !this.istVariante(\u00d4\u00f4\u00f8000)) {
            arrayList.add(new for(while.ifinterfaceObject));
        }
        arrayList.add(new for(while.\u00f5\u00d6O000));
        if (this.istVariante(\u00f5\u00f4\u00f8000)) {
            arrayList.add(new for(while.\u00f8\u00f6O000));
        }
        if (this.istVariante(\u00f4\u00f4\u00f8000)) {
            arrayList.add(new for(while.\u00f5\u00f4\u00d5000));
        }
        if ((this.istVariante(ifnewreturn) || this.istVariante(\u00d4\u00f4\u00f8000)) && super.getGewaehlteVerbilligteSonderfertigkeiten() != null) {
            arrayList.addAll(super.getGewaehlteVerbilligteSonderfertigkeiten());
        }
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        J j2 = (J)K.o00000(I.\u00d3O0000);
        j2.oO0000(5);
        oo0O.\u00d300000(j2);
        if (!(this.istVariante(returnnewreturn) || this.istVariante(ifnewreturn) || this.istVariante(\u00f4\u00f4\u00f8000))) {
            oo0O.\u00d300000(K.o00000(I.\u00d3\u00d30000));
        }
        if (this.istVariante(O\u00f5\u00f8000)) {
            J j3 = (J)K.o00000(I.\u00d40O000);
            j3.oO0000(5);
            oo0O.\u00d300000(j3);
        }
        return oo0O;
    }

    @Override
    public ArrayList<G> getZweitLehrsprache() {
        ArrayList<G> arrayList = new ArrayList<G>();
        if (!this.istVariante(O\u00f5\u00f8000)) {
            arrayList.add(G.whilewhileString);
        } else {
            arrayList.add(G.newwhileString);
        }
        return arrayList;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        if (!(this.istVariante(\u00f5\u00f4\u00f8000) || this.istVariante(\u00f4\u00f4\u00f8000) || this.istVariante(returnnewreturn))) {
            return this.\u00d8\u00f4\u00f8000 < 1;
        }
        return this.\u00d8\u00f4\u00f8000 < 0;
    }

    @Override
    public boolean hatMehrVerbilligteSonderfertigkeitAuswahl() {
        return (this.istVariante(ifnewreturn) || this.istVariante(\u00d4\u00f4\u00f8000)) && this.getGewaehlteVerbilligteSonderfertigkeiten().size() < 1;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Thorwal");
        if (this.varianteGewaehlt() && !this.istVariante(returnnewreturn)) {
            stringBuffer.append(": ");
            stringBuffer.append(this.getVariante().toString());
        }
        return stringBuffer.toString();
    }

    @Override
    public void waehleVerbilligteSonderfertigkeit(for for_) {
        super.getGewaehlteVerbilligteSonderfertigkeiten().add(for_);
    }

    @Override
    protected int getBasisGPKosten() {
        return 4;
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(returnnewreturn);
        this.addAlleVarianten(ifnewreturn);
        this.addAlleVarianten(\u00d5\u00f4\u00f8000);
        this.addAlleVarianten(\u00f8\u00f4\u00f8000);
        this.addAlleVarianten(o\u00f5\u00f8000);
        this.addAlleVarianten(\u00f5\u00f4\u00f8000);
        this.addAlleVarianten(\u00f4\u00f4\u00f8000);
        this.addAlleVarianten(O\u00f5\u00f8000);
        this.addAlleVarianten(\u00d4\u00f4\u00f8000);
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.thispublicsuper, 2);
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(returnnewreturn);
        this.addMoeglicheVariante(ifnewreturn);
        this.addMoeglicheVariante(\u00d5\u00f4\u00f8000);
        this.addMoeglicheVariante(\u00f8\u00f4\u00f8000);
        this.addMoeglicheVariante(o\u00f5\u00f8000);
        this.addMoeglicheVariante(\u00f5\u00f4\u00f8000);
        this.addMoeglicheVariante(\u00f4\u00f4\u00f8000);
        this.addMoeglicheVariante(O\u00f5\u00f8000);
        this.addMoeglicheVariante(\u00d4\u00f4\u00f8000);
    }
}

