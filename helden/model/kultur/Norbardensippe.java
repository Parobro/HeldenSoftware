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
import helden.framework.int.OooO;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.framework.oOoO.void;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oo0o_2;
import helden.model.profession.Ausrufer;
import helden.model.profession.Bader;
import helden.model.profession.Barde;
import helden.model.profession.Entdecker;
import helden.model.profession.Fernhaendler;
import helden.model.profession.Fuhrmann;
import helden.model.profession.Gaukler;
import helden.model.profession.Gelehrter;
import helden.model.profession.Geweihter;
import helden.model.profession.Gladiator;
import helden.model.profession.Grosswildjaeger;
import helden.model.profession.Haendler;
import helden.model.profession.Handwerker;
import helden.model.profession.Hexe;
import helden.model.profession.Jaeger;
import helden.model.profession.Kundschafter;
import helden.model.profession.Magier;
import helden.model.profession.Prospektor;
import helden.model.profession.Scharlatan;
import helden.model.profession.Schiffer;
import helden.model.profession.Schmuggler;
import helden.model.profession.Soeldner;
import helden.model.profession.Streuner;
import helden.model.profession.Tierbaendiger;
import helden.model.profession.Wirt;
import helden.model.profession.Wundarzt;
import helden.model.profession.Zibilja;
import java.util.ArrayList;
import java.util.List;

public class Norbardensippe
extends OooO {
    public static final P o\u00d4\u00f8000 = new P("Norbardensippe", 0, false);
    public static final P O\u00d4\u00f8000 = new P("Norbardensippe in Thorwal (UdW)", 3, false);
    private int \u00d3\u00d4\u00f8000 = 0;
    private helden.framework.D.P nullinterfaceclass;

    public Norbardensippe() {
    }

    public Norbardensippe(Geschlecht geschlecht) {
        super(geschlecht);
        if (this.istVariante(O\u00d4\u00f8000)) {
            ArrayList<G> arrayList = new ArrayList<G>();
            arrayList.add(G.\u00d8\u00d3\u00f5000);
            this.setZweitLehrsprache(arrayList);
        }
    }

    @Override
    public void addSpracheAuswahl(G g2) {
        ArrayList<G> arrayList = new ArrayList<G>();
        if (this.istVariante(O\u00d4\u00f8000)) {
            arrayList.add(G.\u00d8\u00d3\u00f5000);
        } else {
            arrayList.add(g2);
        }
        this.setZweitLehrsprache(arrayList);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(E.nullsuperString, 1);
        this.setTalentwert(E.\u00f5\u00d3\u00d8000, 1);
        this.setTalentwert(E.\u00f4\u00d6\u00d8000, 1);
        this.setTalentwert(E.newnewString, 1);
        this.setTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 1);
        this.setTalentwert(voidsuper.\u00d5O\u00d6000, 1);
        this.setTalentwert(voidsuper.returnforObject, 1);
        this.setTalentwert(voidsuper.returnprivateObject, 1);
        this.setTalentwert(voidsuper.newnewObject, 1);
        this.setTalentwert(voidsuper.o\u00d3\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d4\u00d8\u00d6000, 2);
        this.setTalentwert(voidsuper.\u00d40\u00d6000, 3);
        this.setTalentwert(voidsuper.thisinterfaceObject, 3);
        this.setTalentwert(voidsuper.\u00d30\u00d8000, 3);
        this.setTalentwert(voidsuper.\u00f8\u00d8\u00d5000, 1);
        this.setTalentwert(voidsuper.StringvoidObject, 2);
        this.setTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 2);
        this.setTalentwert(voidsuper.nullObjectObject, 1);
        this.setTalentwert(voidsuper.oo\u00d6000, 2);
        this.setTalentwert(voidsuper.\u00f5\u00d2\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 2);
        this.setTalentwert(voidsuper.O\u00f4\u00d5000, 2);
        if (!this.istVariante(O\u00d4\u00f8000)) {
            this.setTalentwert(G.\u00d8\u00d3\u00f5000, 4);
            this.setTalentwert(G.O\u00d8\u00f5000, 4);
        }
        this.setTalentwert(voidsuper.\u00d5o\u00d8000, 2);
        this.setTalentwert(voidsuper.\u00d5\u00d5\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00d4\u00d4\u00d5000, 1);
        this.setTalentwert(voidsuper.privateObjectObject, 1);
        this.setTalentwert(voidsuper.returnifObject, 1);
        if (this.istVariante(O\u00d4\u00f8000)) {
            this.addTalentwert(E.\u00f4\u00d6\u00d8000, 1);
            this.addTalentwert(E.\u00d5\u00d4\u00d8000, 2);
            this.addTalentwert(voidsuper.\u00d8\u00d3\u00d8000, 1);
            this.addTalentwert(voidsuper.\u00d5\u00f6\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00f80\u00d6000, 1);
            this.addTalentwert(voidsuper.StringvoidObject, 1);
        }
        if (this.getZweitLehrsprache().size() > 0) {
            if (this.getZweitLehrsprache().get(0).equals(G.nullsuperclass)) {
                this.addTalentwert(G.whilewhileString, 4);
            }
            if (this.getZweitLehrsprache().get(0).equals(G.whilewhileString)) {
                this.addTalentwert(G.nullsuperclass, 4);
            }
        }
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.O\u00f60000);
        arrayList.add(I.\u00d4\u00d5o000);
        arrayList.add(I.o\u00d3O000);
        arrayList.add(I.\u00f8\u00d4O000);
        arrayList.add(I.privateclass);
        arrayList.add(I.newnew);
        return arrayList;
    }

    @Override
    public List<for> getGewaehlteVerbilligteSonderfertigkeiten() {
        List<for> list = super.getGewaehlteVerbilligteSonderfertigkeiten();
        if (this.nullinterfaceclass != null) {
            if (this.nullinterfaceclass.toString().equals(while.\u00d2\u00d4O000.toString())) {
                list.add(new for(while.\u00f5\u00d30000));
            } else {
                list.add(new for(while.\u00d2\u00d4O000));
            }
        }
        return list;
    }

    @Override
    public String getID() {
        return "K29";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Norbarden";
    }

    @Override
    public int getMaximalSozialstatus() {
        return 10;
    }

    @Override
    public G getMuttersprache() {
        return G.\u00f8\u00f6\u00f5000;
    }

    @Override
    public ArrayList<String> getNamesGeneratorListen(floatsuper floatsuper2) {
        ArrayList<String> arrayList = super.getNamesGeneratorListen(floatsuper2);
        arrayList.add("Norbardische Namen");
        return arrayList;
    }

    @Override
    public objectsuper_0 getNextSonderfertigkeitAuswahl() {
        ArrayList<helden.framework.D.P> arrayList = new ArrayList<helden.framework.D.P>();
        arrayList.add(oooo_0.o00000(while.\u00f5\u00d30000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d2\u00d4O000.toString()));
        return new objectsuper_0(this, arrayList, 1);
    }

    @Override
    public oo0o_2 getNextSprachAuswahl() {
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.whilewhileString);
        arrayList.add(G.nullsuperclass);
        return new oo0o_2(this, arrayList, 1, "Zweitsprache");
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.\u00d3\u00d4\u00f8000) {
            case 0: {
                arrayList.add(E.\u00d4\u00d6\u00d8000);
                arrayList.add(E.\u00d3\u00d6\u00d8000);
                arrayList.add(E.\u00d5\u00d4\u00d8000);
                int[] nArray = new int[]{1};
                ++this.\u00d3\u00d4\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 1: {
                arrayList.add(E.o\u00d6\u00d8000);
                arrayList.add(E.\u00d3\u00d4\u00d8000);
                int[] nArray = new int[]{1};
                ++this.\u00d3\u00d4\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 2: {
                arrayList.add(G.whilewhileString);
                arrayList.add(G.nullsuperclass);
                arrayList.add(G.O\u00d8\u00f5000);
                int[] nArray = new int[]{4, 4};
                ++this.\u00d3\u00d4\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public void getNextVerbilligteSonderfertigkeitAuswahl() {
        ArrayList<for> arrayList = new ArrayList<for>();
        if (this.istVariante(O\u00d4\u00f8000)) {
            arrayList.add(new for(while.\u00f6o\u00d5000));
            arrayList.add(new for(while.\u00d2\u00d4O000));
        }
        return new void(this, arrayList, 1);
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        ArrayList<super> arrayList = new ArrayList<super>();
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        arrayList.add(new Gladiator(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Soeldner(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Entdecker(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Fernhaendler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Fuhrmann(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Grosswildjaeger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        Jaeger jaeger = new Jaeger(this.getGeschlecht(), g2, g3);
        if (this.istVariante(O\u00d4\u00f8000)) {
            jaeger.addMoeglicheVariante(jaeger.getRobbenjaeger());
            jaeger.removeMoeglicheVariante(jaeger.getFallensteller());
            jaeger.addMoeglicheVariante(jaeger.getThorwallerFallensteller());
        }
        arrayList.add(jaeger);
        arrayList.add(new Kundschafter(this.getGeschlecht(), g2, g3));
        arrayList.add(new Prospektor(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schiffer(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schmuggler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Barde(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Gaukler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Haendler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Streuner(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Ausrufer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Bader(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        Gelehrter gelehrter = new Gelehrter(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        gelehrter.clearMoeglicheVarianten();
        gelehrter.addMoeglicheVariante(gelehrter.getSprachenkundler());
        gelehrter.addMoeglicheVariante(gelehrter.getVoelkerkundler());
        arrayList.add(gelehrter);
        arrayList.add(new Handwerker(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Tierbaendiger(this.getGeschlecht(), g2, g3));
        arrayList.add(new Wirt(this.getGeschlecht(), g2, g3));
        arrayList.add(new Wundarzt(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Hexe(this.getGeschlecht(), g2, g3));
        arrayList.add(new Magier(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Scharlatan(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Zibilja(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        Geweihter geweihter = new Geweihter(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        geweihter.clearMoeglicheVarianten();
        geweihter.addMoeglicheVariante(geweihter.getAves());
        geweihter.addMoeglicheVariante(geweihter.getHesindePastori());
        geweihter.addMoeglicheVariante(geweihter.getHesindeSatori());
        geweihter.addMoeglicheVariante(geweihter.getHesindeFreidenker());
        geweihter.addMoeglicheVariante(geweihter.getHesindeDraconiter());
        geweihter.addMoeglicheVariante(geweihter.getNandus());
        geweihter.addMoeglicheVariante(geweihter.getNandusMarktschreiber());
        geweihter.addMoeglicheVariante(geweihter.getNandusVolkslehrer());
        geweihter.addMoeglicheVariante(geweihter.getNandusRechtshelfer());
        geweihter.addMoeglicheVariante(geweihter.getPhex());
        geweihter.addMoeglicheVariante(geweihter.getPhexBetrueger());
        geweihter.addMoeglicheVariante(geweihter.getPhexBeutelschneider());
        geweihter.addMoeglicheVariante(geweihter.getPhexFassadenkletterer());
        geweihter.addMoeglicheVariante(geweihter.getPhexHaendler());
        geweihter.addMoeglicheVariante(geweihter.getPhexHehler());
        geweihter.addMoeglicheVariante(geweihter.getPhexIntrigant());
        geweihter.addMoeglicheVariante(geweihter.getFirunHueterDerJagd());
        geweihter.addMoeglicheVariante(geweihter.getFirunWaldlaeufer());
        if (this.istVariante(O\u00d4\u00f8000)) {
            geweihter.addMoeglicheVariante(geweihter.getFirunThorwal());
        }
        arrayList.add(geweihter);
        Haendler haendler = new Haendler(this.getGeschlecht(), g2, g3);
        arrayList.remove(haendler);
        haendler.addMoeglicheVariante(haendler.getTauschhaendler());
        arrayList.add(haendler);
        return arrayList;
    }

    @Override
    public G getSchrift() {
        return G.\u00d8\u00d8\u00f5000;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = new OOOo();
        U u2 = (U)oooo_0.o00000(while.\u00d2o\u00f5000);
        u2.\u00d500000(this.getKulturkundeBezeichnung());
        oOOo.o00000(u2);
        if (!this.istVariante(O\u00d4\u00f8000) && this.nullinterfaceclass != null) {
            oOOo.o00000(this.nullinterfaceclass);
        }
        return oOOo;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d5\u00d6O000);
        arrayList.add(I.whilethissuper);
        arrayList.add(I.\u00f4O\u00d2000);
        arrayList.add(I.thisdo);
        arrayList.add(I.\u00d8o0000);
        arrayList.add(I.\u00d5oo000);
        arrayList.add(I.O\u00d5o000);
        arrayList.add(I.thisfloat);
        return arrayList;
    }

    @Override
    public List<for> getVerbilligteSonderfertigkeiten() {
        List<for> list = super.getVerbilligteSonderfertigkeiten();
        for<String> for_ = new for<String>(while.\u00d2o\u00f5000, false);
        for_.add("Bornland");
        for_.add("Nivesen");
        list.add(for_);
        if (this.istVariante(O\u00d4\u00f8000)) {
            list.add(new for(while.\u00f5\u00d6O000));
            if (super.getGewaehlteVerbilligteSonderfertigkeiten() != null) {
                list.addAll(super.getGewaehlteVerbilligteSonderfertigkeiten());
            }
        }
        return list;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        J j2 = (J)K.o00000(I.OOO000);
        j2.oO0000(6);
        oo0O.\u00d300000(j2);
        J j3 = (J)K.o00000(I.\u00d50o000);
        j3.oO0000(5);
        oo0O.\u00d300000(j3);
        return oo0O;
    }

    @Override
    public boolean hatMehrSonderfertigkeitAuswahl() {
        return this.nullinterfaceclass == null;
    }

    @Override
    public boolean hatMehrSprachenAuswahl() {
        return this.getZweitLehrsprache().size() == 0;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        if (this.istVariante(O\u00d4\u00f8000)) {
            return this.\u00d3\u00d4\u00f8000 < 3;
        }
        return this.\u00d3\u00d4\u00f8000 < 2;
    }

    @Override
    public boolean hatMehrVerbilligteSonderfertigkeitAuswahl() {
        return this.istVariante(O\u00d4\u00f8000) && this.getGewaehlteVerbilligteSonderfertigkeiten().size() < 1;
    }

    @Override
    public boolean istZweitLehrspracheGewaehlt() {
        return true;
    }

    @Override
    public String toString() {
        if (this.istVariante(O\u00d4\u00f8000)) {
            return "Norbardensippe in Thorwal";
        }
        return "Norbardensippe";
    }

    @Override
    public void waehleSonderfertigkeit(helden.framework.D.P p2) {
        this.nullinterfaceclass = p2;
    }

    @Override
    public void waehleVerbilligteSonderfertigkeit(for for_) {
        super.getGewaehlteVerbilligteSonderfertigkeiten().add(for_);
    }

    @Override
    protected int getBasisGPKosten() {
        return 8;
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(o\u00d4\u00f8000);
        this.addAlleVarianten(O\u00d4\u00f8000);
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.thispublicsuper, 2);
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(o\u00d4\u00f8000);
        this.addMoeglicheVariante(O\u00d4\u00f8000);
    }
}

