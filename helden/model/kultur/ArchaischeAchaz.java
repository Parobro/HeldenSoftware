/*
 * Decompiled with CFR 0.152.
 */
package helden.model.kultur;

import helden.framework.C.I;
import helden.framework.D.OOOo;
import helden.framework.D.OoOO.U;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.OooO;
import helden.framework.int.super;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.Gelehrter;
import helden.model.DDZprofessionen.Grosswildjaeger;
import helden.model.DDZprofessionen.Handwerker;
import helden.model.DDZprofessionen.Jaeger;
import helden.model.DDZprofessionen.Kundschafter;
import helden.model.DDZprofessionen.Seefahrer;
import helden.model.DDZprofessionen.Stammeskrieger;
import helden.model.DDZprofessionen.Tierbaendiger;
import helden.model.profession.Edelhandwerker;
import helden.model.profession.Fischer;
import helden.model.profession.Geweihter;
import helden.model.profession.Hirte;
import helden.model.profession.Kristallomant;
import helden.model.profession.Prospektor;
import helden.model.profession.Schmuggler;
import helden.model.profession.Soeldner;
import helden.model.profession.Wundarzt;
import java.util.ArrayList;
import java.util.List;

public class ArchaischeAchaz
extends OooO {
    private int \u00d8\u00d3\u00f8000 = 0;
    private P thisinterfaceclass;

    public ArchaischeAchaz() {
    }

    public ArchaischeAchaz(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(E.newnewString, 1);
        this.setTalentwert(voidsuper.\u00d4\u00f8\u00d5000, 2);
        this.setTalentwert(voidsuper.o\u00d3\u00d6000, 1);
        this.setTalentwert(voidsuper.O0\u00d6000, 1);
        this.setTalentwert(voidsuper.thisinterfaceObject, 1);
        this.setTalentwert(voidsuper.\u00d8\u00d5\u00d6000, 2);
        this.setTalentwert(voidsuper.\u00d40\u00d8000, 1);
        this.setTalentwert(voidsuper.StringvoidObject, 1);
        this.setTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d5\u00d4\u00d6000, 3);
        this.setTalentwert(voidsuper.\u00d50\u00d8000, 2);
        this.setTalentwert(voidsuper.oo\u00d6000, 2);
        this.setTalentwert(voidsuper.\u00f5\u00f5\u00d5000, 1);
        this.setTalentwert(voidsuper.thisintObject, 1);
        this.setTalentwert(voidsuper.o\u00d5\u00d6000, 2);
        this.setTalentwert(voidsuper.\u00f5\u00d2\u00d6000, 4);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 3);
        this.setTalentwert(voidsuper.\u00d3\u00d6\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00d4\u00f6\u00d6000, 1);
        this.setTalentwert(G.\u00f4\u00d4\u00f5000, 4);
        this.setTalentwert(voidsuper.thisclassObject, 1);
        this.setTalentwert(voidsuper.\u00f80\u00d8000, 1);
        this.setTalentwert(voidsuper.\u00f5\u00f5\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00d4\u00d4\u00d5000, 1);
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.thisdo);
        arrayList.add(I.O\u00d5o000);
        return arrayList;
    }

    @Override
    public List<for> getGewaehlteVerbilligteSonderfertigkeiten() {
        List<for> list = super.getGewaehlteVerbilligteSonderfertigkeiten();
        if (this.thisinterfaceclass != null) {
            if (this.thisinterfaceclass.toString().equals(while.\u00f8\u00f6O000.toString())) {
                list.add(new for(while.nullnewsuper));
            } else {
                list.add(new for(while.\u00f8\u00f6O000));
            }
        }
        return list;
    }

    @Override
    public String getID() {
        return "K05";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Archaische Achaz";
    }

    @Override
    public int getMaximalSozialstatus() {
        return 5;
    }

    @Override
    public G getMuttersprache() {
        return G.thissuperclass;
    }

    @Override
    public objectsuper_0 getNextSonderfertigkeitAuswahl() {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(oooo_0.o00000(while.\u00f8\u00f6O000.toString()));
        arrayList.add(oooo_0.o00000(while.nullnewsuper.toString()));
        return new objectsuper_0(this, arrayList, 1);
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.\u00d8\u00d3\u00f8000) {
            case 0: {
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.\u00f8\u00d5\u00d8000);
                arrayList.add(E.o\u00d6\u00d8000);
                int[] nArray = new int[]{3};
                ++this.\u00d8\u00d3\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 1: {
                arrayList.add(E.\u00d4\u00d4\u00d8000);
                arrayList.add(E.\u00d3\u00d5\u00d8000);
                arrayList.add(E.\u00f5\u00d5\u00d8000);
                int[] nArray = new int[]{2};
                ++this.\u00d8\u00d3\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        ArrayList<super> arrayList = new ArrayList<super>();
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        arrayList.add(new Soeldner(this.getGeschlecht(), g2, g3));
        helden.model.profession.Stammeskrieger stammeskrieger = new helden.model.profession.Stammeskrieger(this.getGeschlecht(), g2, g3);
        stammeskrieger.clearMoeglicheVarianten();
        stammeskrieger.addMoeglicheVariante(stammeskrieger.getAchaz());
        stammeskrieger.addMoeglicheVariante(stammeskrieger.getAchazTempelwache());
        arrayList.add(stammeskrieger);
        arrayList.add(new Fischer(this.getGeschlecht(), g2, g3));
        arrayList.add(new helden.model.profession.Grosswildjaeger(this.getGeschlecht(), g2, g3));
        Hirte hirte = new Hirte(this.getGeschlecht(), g2, g3);
        hirte.addMoeglicheVariante(hirte.getKleintierzuechter());
        arrayList.add(hirte);
        arrayList.add(new helden.model.profession.Jaeger(this.getGeschlecht(), g2, g3));
        arrayList.add(new helden.model.profession.Kundschafter(this.getGeschlecht(), g2, g3));
        Prospektor prospektor = new Prospektor(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        prospektor.clearMoeglicheVarianten();
        prospektor.addMoeglicheVariante(prospektor.getKraeutersammler());
        prospektor.addMoeglicheVariante(prospektor.getSammler());
        arrayList.add(prospektor);
        arrayList.add(new Schmuggler(this.getGeschlecht(), g2, g3));
        arrayList.add(new helden.model.profession.Seefahrer(this.getGeschlecht(), g2, g3));
        Edelhandwerker edelhandwerker = new Edelhandwerker(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        edelhandwerker.removeMoeglicheVariante(edelhandwerker.getDrucker());
        edelhandwerker.removeMoeglicheVariante(edelhandwerker.getUhrmacher());
        arrayList.add(edelhandwerker);
        helden.model.profession.Gelehrter gelehrter = new helden.model.profession.Gelehrter(this.getGeschlecht(), g2, g3);
        arrayList.add(gelehrter);
        helden.model.profession.Handwerker handwerker = new helden.model.profession.Handwerker(this.getGeschlecht(), g2, g3);
        handwerker.clearMoeglicheVarianten();
        handwerker.addMoeglicheVariante(handwerker.getArchaischeSuedAventuriens());
        arrayList.add(handwerker);
        arrayList.add(new helden.model.profession.Tierbaendiger(this.getGeschlecht(), g2, g3));
        Wundarzt wundarzt = new Wundarzt(this.getGeschlecht(), g2, g3);
        wundarzt.addMoeglicheVariante(wundarzt.getBrutfleger());
        arrayList.add(wundarzt);
        arrayList.add(new Kristallomant(this.getGeschlecht(), g2, g3));
        Geweihter geweihter = new Geweihter(this.getGeschlecht(), g2, g3);
        geweihter.clearMoeglicheVarianten();
        geweihter.addMoeglicheVariante(geweihter.getHSzint());
        geweihter.addMoeglicheVariante(geweihter.getZsahh());
        arrayList.add(geweihter);
        arrayList.add(new helden.model.DDZprofessionen.Soeldner(this.getGeschlecht(), g2, g3));
        Stammeskrieger stammeskrieger2 = new Stammeskrieger(this.getGeschlecht(), g2, g3);
        stammeskrieger2.clearMoeglicheVarianten();
        stammeskrieger2.addMoeglicheVariante(stammeskrieger2.getAchaz());
        arrayList.add(stammeskrieger2);
        arrayList.add(new helden.model.DDZprofessionen.Fischer(this.getGeschlecht(), g2, g3));
        arrayList.add(new Grosswildjaeger(this.getGeschlecht(), g2, g3));
        helden.model.DDZprofessionen.Hirte hirte2 = new helden.model.DDZprofessionen.Hirte(this.getGeschlecht(), g2, g3);
        hirte2.addMoeglicheVariante(hirte2.getKleintierzuechter());
        arrayList.add(hirte2);
        arrayList.add(new Jaeger(this.getGeschlecht(), g2, g3));
        arrayList.add(new Kundschafter(this.getGeschlecht(), g2, g3));
        helden.model.DDZprofessionen.Prospektor prospektor2 = new helden.model.DDZprofessionen.Prospektor(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        prospektor2.clearMoeglicheVarianten();
        prospektor2.addMoeglicheVariante(prospektor2.getKraeutersammler());
        prospektor2.addMoeglicheVariante(prospektor2.getSammler());
        arrayList.add(prospektor2);
        arrayList.add(new helden.model.DDZprofessionen.Schmuggler(this.getGeschlecht(), g2, g3));
        arrayList.add(new Seefahrer(this.getGeschlecht(), g2, g3));
        arrayList.add(new helden.model.DDZprofessionen.Edelhandwerker(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Gelehrter(this.getGeschlecht(), g2, g3));
        Handwerker handwerker2 = new Handwerker(this.getGeschlecht(), g2, g3);
        handwerker2.clearMoeglicheVarianten();
        handwerker2.addMoeglicheVariante(handwerker2.getArchaischeSuedAventuriens());
        arrayList.add(handwerker2);
        arrayList.add(new Tierbaendiger(this.getGeschlecht(), g2, g3));
        helden.model.DDZprofessionen.Wundarzt wundarzt2 = new helden.model.DDZprofessionen.Wundarzt(this.getGeschlecht(), g2, g3);
        wundarzt2.addMoeglicheVariante(wundarzt.getBrutfleger());
        arrayList.add(wundarzt2);
        return arrayList;
    }

    @Override
    public G getSchrift() {
        return G.\u00f4\u00d4\u00f5000;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = new OOOo();
        U u2 = (U)oooo_0.o00000("Kulturkunde");
        u2.\u00d500000(this.getKulturkundeBezeichnung());
        oOOo.o00000(u2);
        if (this.thisinterfaceclass != null) {
            oOOo.o00000(this.thisinterfaceclass);
        }
        return oOOo;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d5\u00d6O000);
        arrayList.add(I.whilethissuper);
        arrayList.add(I.\u00f800000);
        arrayList.add(I.\u00d8Oo000);
        arrayList.add(I.\u00d4oo000);
        arrayList.add(I.\u00d8\u00f60000);
        arrayList.add(I.\u00f5\u00f6o000);
        arrayList.add(I.newnew);
        arrayList.add(I.whilenewsuper);
        arrayList.add(I.whilereturn);
        return arrayList;
    }

    @Override
    public boolean hatMehrSonderfertigkeitAuswahl() {
        return this.thisinterfaceclass == null;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        return this.\u00d8\u00d3\u00f8000 < 2;
    }

    @Override
    public boolean istMagiedilletantErlaubt() {
        return false;
    }

    @Override
    public String toString() {
        return "Archaische Achaz";
    }

    @Override
    public void waehleSonderfertigkeit(P p2) {
        this.thisinterfaceclass = p2;
    }

    @Override
    protected int getBasisGPKosten() {
        return 9;
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.\u00d8\u00f5\u00d2000, 1);
    }
}

