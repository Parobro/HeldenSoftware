/*
 * Decompiled with CFR 0.152.
 */
package helden.model.kultur;

import helden.framework.C.I;
import helden.framework.D.K;
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
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.Gaukler;
import helden.model.DDZprofessionen.Gladiator;
import helden.model.DDZprofessionen.Grosswildjaeger;
import helden.model.DDZprofessionen.Haendler;
import helden.model.DDZprofessionen.Handwerker;
import helden.model.DDZprofessionen.Jaeger;
import helden.model.DDZprofessionen.Kundschafter;
import helden.model.DDZprofessionen.Lakai;
import helden.model.DDZprofessionen.Seefahrer;
import helden.model.DDZprofessionen.Stammeskrieger;
import helden.model.profession.Domestik;
import helden.model.profession.Fischer;
import helden.model.profession.Hirte;
import helden.model.profession.Schamane;
import helden.model.profession.Soeldner;
import helden.model.profession.Wundarzt;
import java.util.ArrayList;
import java.util.List;

public class StammesAchaz
extends OooO {
    public static final P privateclassreturn = new P("beliebiger Stamm", 0, false);
    public static final P \u00d3o0O00 = new P("Maraskan", 0, false);
    public static final P \u00f4O0O00 = new P("Orkland", 0, false);
    public static final P Oo0O00 = new P("Echsens\u00fcmpfe", 1, false);
    public static final P newreturnreturn = new P("Loch Harodrol", 3, false);
    public static final P \u00f8O0O00 = new P("Waldinseln/S\u00fcdaventurien", 0, false);
    private int oo0O00 = 0;
    private helden.framework.D.P \u00f5O0O00;

    public StammesAchaz() {
    }

    public StammesAchaz(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(E.\u00f4\u00d6\u00d8000, 2);
        this.setTalentwert(E.newnewString, 1);
        this.setTalentwert(E.o\u00d6\u00d8000, 3);
        this.setTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 2);
        this.setTalentwert(voidsuper.\u00d4\u00f8\u00d5000, 1);
        this.setTalentwert(voidsuper.returnforObject, 1);
        this.setTalentwert(voidsuper.returnprivateObject, 2);
        this.setTalentwert(voidsuper.o\u00d3\u00d6000, 1);
        this.setTalentwert(voidsuper.thisinterfaceObject, 2);
        this.setTalentwert(voidsuper.\u00f80\u00d6000, 2);
        this.setTalentwert(voidsuper.StringvoidObject, 2);
        this.setTalentwert(voidsuper.\u00d40\u00d8000, 2);
        this.setTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 4);
        this.setTalentwert(voidsuper.\u00d5\u00d4\u00d6000, 1);
        this.setTalentwert(voidsuper.oo\u00d6000, 1);
        this.setTalentwert(voidsuper.o\u00d5\u00d6000, 2);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 2);
        this.setTalentwert(voidsuper.thisclassObject, 2);
        this.setTalentwert(voidsuper.\u00f80\u00d8000, 1);
        this.setTalentwert(voidsuper.\u00f5\u00f5\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00d4\u00d4\u00d5000, 1);
        if (this.istVariante(\u00d3o0O00)) {
            this.addTalentwert(voidsuper.returnprivateObject, -1);
            this.addTalentwert(voidsuper.o\u00d5\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00d4\u00f6\u00d6000, 2);
            this.addTalentwert(voidsuper.thisclassObject, -1);
        }
        if (this.istVariante(\u00f4O0O00)) {
            this.addTalentwert(E.\u00d3\u00d5\u00d8000, 2);
        }
        if (this.istVariante(newreturnreturn)) {
            this.addTalentwert(voidsuper.returnprivateObject, 1);
            this.addTalentwert(voidsuper.\u00f80\u00d6000, 2);
            this.addTalentwert(voidsuper.\u00d4\u00f6\u00d6000, 2);
            this.addTalentwert(voidsuper.thisclassObject, 2);
        }
        if (this.istVariante(\u00f8O0O00)) {
            this.addTalentwert(G.\u00d5o\u00f5000, 2);
        }
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.StringObject);
        arrayList.add(I.\u00f5\u00f60000);
        arrayList.add(I.returnnewsuper);
        arrayList.add(I.o\u00d8o000);
        arrayList.add(I.ifreturn);
        arrayList.add(I.O\u00d5o000);
        return arrayList;
    }

    @Override
    public List<for> getGewaehlteVerbilligteSonderfertigkeiten() {
        List<for> list = super.getGewaehlteVerbilligteSonderfertigkeiten();
        if (!this.istVariante(Oo0O00) && !this.istVariante(\u00f4O0O00)) {
            if (this.\u00f5O0O00 != null && this.\u00f5O0O00.toString().equals(while.\u00f8\u00f6O000.toString())) {
                list.add(new for(while.nullnewsuper));
            } else {
                list.add(new for(while.\u00f8\u00f6O000));
            }
        }
        return list;
    }

    @Override
    public String getID() {
        return "K32";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Stammesachaz";
    }

    @Override
    public int getMaximalSozialstatus() {
        return 4;
    }

    @Override
    public G getMuttersprache() {
        return G.thissuperclass;
    }

    @Override
    public objectsuper_0 getNextSonderfertigkeitAuswahl() {
        ArrayList<helden.framework.D.P> arrayList = new ArrayList<helden.framework.D.P>();
        arrayList.add(oooo_0.o00000(while.\u00f8\u00f6O000.toString()));
        arrayList.add(oooo_0.o00000(while.nullnewsuper.toString()));
        return new objectsuper_0(this, arrayList, 1);
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.oo0O00) {
            case 0: {
                if (!this.istVariante(\u00f4O0O00)) {
                    arrayList.add(E.\u00d3\u00d5\u00d8000);
                    arrayList.add(E.\u00d4\u00d4\u00d8000);
                    int[] nArray = new int[]{2};
                    ++this.oo0O00;
                    return new o0oo_2(this, arrayList, nArray);
                }
                ++this.oo0O00;
            }
            case 1: {
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.\u00f8\u00d5\u00d8000);
                int[] nArray = new int[]{2};
                ++this.oo0O00;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 2: {
                if (this.istVariante(\u00f8O0O00)) break;
                if (!this.istVariante(\u00f4O0O00)) {
                    arrayList.add(G.newwhileString);
                    arrayList.add(G.whilewhileString);
                } else {
                    arrayList.add(G.O\u00d8\u00f5000);
                    arrayList.add(G.\u00d5\u00d6\u00f5000);
                }
                int[] nArray = new int[]{2};
                ++this.oo0O00;
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
        arrayList.add(new helden.model.profession.Gladiator(this.getGeschlecht(), g2, g3));
        arrayList.add(new Soeldner(this.getGeschlecht(), g2, g3));
        helden.model.profession.Stammeskrieger stammeskrieger = new helden.model.profession.Stammeskrieger(this.getGeschlecht(), g2, g3);
        stammeskrieger.clearMoeglicheVarianten();
        stammeskrieger.addMoeglicheVariante(stammeskrieger.getAchaz());
        stammeskrieger.addMoeglicheVariante(stammeskrieger.getAchazTempelwache());
        arrayList.add(stammeskrieger);
        Fischer fischer = new Fischer(this.getGeschlecht(), g2, g3);
        fischer.addMoeglicheVariante(fischer.getBergungstaucher());
        fischer.addMoeglicheVariante(fischer.getUnterwasserjaeger());
        arrayList.add(fischer);
        arrayList.add(new helden.model.profession.Grosswildjaeger(this.getGeschlecht(), g2, g3));
        Hirte hirte = new Hirte(this.getGeschlecht(), g2, g3);
        hirte.addMoeglicheVariante(hirte.getKleintierzuechter());
        arrayList.add(hirte);
        Domestik domestik = new Domestik(this.getGeschlecht(), g2, g3);
        domestik.clearMoeglicheVarianten();
        domestik.addMoeglicheVariante(domestik.getErzieher());
        arrayList.add(domestik);
        helden.model.profession.Haendler haendler = new helden.model.profession.Haendler(this.getGeschlecht(), g2, g3);
        haendler.clearMoeglicheVarianten();
        haendler.addMoeglicheVariante(haendler.getTauschhaendler());
        arrayList.add(haendler);
        helden.model.profession.Handwerker handwerker = new helden.model.profession.Handwerker(this.getGeschlecht(), g2, g3);
        handwerker.addMoeglicheVariante(handwerker.getArchaischeSuedAventuriens());
        arrayList.add(handwerker);
        arrayList.add(new helden.model.profession.Jaeger(this.getGeschlecht(), g2, g3));
        arrayList.add(new helden.model.profession.Kundschafter(this.getGeschlecht(), g2, g3));
        arrayList.add(new helden.model.profession.Seefahrer(this.getGeschlecht(), g2, g3));
        arrayList.add(new helden.model.profession.Gaukler(this.getGeschlecht(), g2, g3));
        Wundarzt wundarzt = new Wundarzt(this.getGeschlecht(), g2, g3);
        wundarzt.addMoeglicheVariante(wundarzt.getBrutfleger());
        arrayList.add(wundarzt);
        Schamane schamane = new Schamane(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        schamane.clearMoeglicheVarianten();
        schamane.addMoeglicheVariante(schamane.getAchaz());
        arrayList.add(schamane);
        arrayList.add(new Gladiator(this.getGeschlecht(), g2, g3));
        arrayList.add(new helden.model.DDZprofessionen.Soeldner(this.getGeschlecht(), g2, g3));
        Stammeskrieger stammeskrieger2 = new Stammeskrieger(this.getGeschlecht(), g2, g3);
        stammeskrieger2.clearMoeglicheVarianten();
        stammeskrieger2.addMoeglicheVariante(stammeskrieger2.getAchaz());
        arrayList.add(stammeskrieger2);
        helden.model.DDZprofessionen.Fischer fischer2 = new helden.model.DDZprofessionen.Fischer(this.getGeschlecht(), g2, g3);
        fischer2.addMoeglicheVariante(fischer2.getBergungstaucher());
        fischer2.addMoeglicheVariante(fischer2.getUnterwasserjaeger());
        arrayList.add(fischer2);
        arrayList.add(new Grosswildjaeger(this.getGeschlecht(), g2, g3));
        helden.model.DDZprofessionen.Hirte hirte2 = new helden.model.DDZprofessionen.Hirte(this.getGeschlecht(), g2, g3);
        hirte2.addMoeglicheVariante(hirte2.getKleintierzuechter());
        arrayList.add(hirte2);
        Lakai lakai = new Lakai(this.getGeschlecht(), g2, g3);
        lakai.clearMoeglicheVarianten();
        lakai.addMoeglicheVariante(lakai.getErzieher());
        arrayList.add(lakai);
        Haendler haendler2 = new Haendler(this.getGeschlecht(), g2, g3);
        haendler2.clearMoeglicheVarianten();
        haendler2.addMoeglicheVariante(haendler2.getTauschhaendler());
        arrayList.add(haendler2);
        Handwerker handwerker2 = new Handwerker(this.getGeschlecht(), g2, g3);
        handwerker2.addMoeglicheVariante(handwerker2.getArchaischeSuedAventuriens());
        arrayList.add(handwerker2);
        arrayList.add(new Jaeger(this.getGeschlecht(), g2, g3));
        arrayList.add(new Kundschafter(this.getGeschlecht(), g2, g3));
        arrayList.add(new Seefahrer(this.getGeschlecht(), g2, g3));
        arrayList.add(new Gaukler(this.getGeschlecht(), g2, g3));
        helden.model.DDZprofessionen.Wundarzt wundarzt2 = new helden.model.DDZprofessionen.Wundarzt(this.getGeschlecht(), g2, g3);
        wundarzt2.addMoeglicheVariante(wundarzt2.getBrutfleger());
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
        U u2 = (U)oooo_0.o00000(while.\u00d2o\u00f5000);
        u2.\u00d500000(this.getKulturkundeBezeichnung());
        oOOo.o00000(u2);
        if (this.istVariante(newreturnreturn)) {
            oOOo.o00000(K.o00000(voidsuper.returnprivateObject, "Tauchen"));
        }
        if (this.istVariante(Oo0O00)) {
            oOOo.o00000(oooo_0.o00000(while.\u00f8\u00f6O000));
            oOOo.o00000(oooo_0.o00000(while.nullnewsuper));
        }
        if (this.istVariante(\u00f4O0O00)) {
            oOOo.o00000(oooo_0.o00000(while.nullnewsuper));
        } else if (this.\u00f5O0O00 != null) {
            oOOo.o00000(this.\u00f5O0O00);
        }
        return oOOo;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d5\u00d6O000);
        arrayList.add(I.whilethissuper);
        arrayList.add(I.\u00d5o\u00d2000);
        arrayList.add(I.\u00f800000);
        arrayList.add(I.\u00d8Oo000);
        arrayList.add(I.\u00d4oo000);
        arrayList.add(I.\u00d8\u00f60000);
        arrayList.add(I.Ooo000);
        arrayList.add(I.\u00f8\u00d2o000);
        arrayList.add(I.newfor);
        arrayList.add(I.o\u00f8O000);
        arrayList.add(I.\u00f5\u00f6o000);
        arrayList.add(I.newnew);
        arrayList.add(I.whilenewsuper);
        arrayList.add(I.whilereturn);
        return arrayList;
    }

    @Override
    public List<for> getVerbilligteSonderfertigkeiten() {
        List<for> list = super.getVerbilligteSonderfertigkeiten();
        list.addAll(this.getGewaehlteVerbilligteSonderfertigkeiten());
        if (this.istVariante(\u00f4O0O00)) {
            list.add(new for(while.\u00f5\u00d30000));
        }
        return list;
    }

    @Override
    public boolean hatMehrSonderfertigkeitAuswahl() {
        return !this.istVariante(\u00f4O0O00) && !this.istVariante(Oo0O00) && this.\u00f5O0O00 == null;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        if (this.istVariante(\u00f8O0O00)) {
            return this.oo0O00 < 2;
        }
        return this.oo0O00 < 3;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Stammes-Achaz");
        if (this.istVariante(\u00d3o0O00)) {
            stringBuffer.append("/Maraskan");
        }
        if (this.istVariante(\u00f4O0O00)) {
            stringBuffer.append("/Orkland");
        }
        if (this.istVariante(Oo0O00)) {
            stringBuffer.append("/Echsens\u00fcmpfe");
        }
        if (this.istVariante(newreturnreturn)) {
            stringBuffer.append("/Loch Harodrol");
        }
        if (this.istVariante(\u00f8O0O00)) {
            stringBuffer.append("/Waldinseln, S\u00fcdaventurien");
        }
        if (this.istVariante(privateclassreturn)) {
            stringBuffer.append("");
        }
        return stringBuffer.toString();
    }

    @Override
    public void waehleSonderfertigkeit(helden.framework.D.P p2) {
        this.\u00f5O0O00 = p2;
    }

    @Override
    protected int getBasisGPKosten() {
        return 10;
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(privateclassreturn);
        this.addAlleVarianten(Oo0O00);
        this.addAlleVarianten(newreturnreturn);
        this.addAlleVarianten(\u00d3o0O00);
        this.addAlleVarianten(\u00f4O0O00);
        this.addAlleVarianten(\u00f8O0O00);
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.\u00d3\u00f4\u00d2000, 1);
        this.putModifikator(b_0.thispublicsuper, 3);
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(privateclassreturn);
        this.addMoeglicheVariante(Oo0O00);
        this.addMoeglicheVariante(newreturnreturn);
        this.addMoeglicheVariante(\u00d3o0O00);
        this.addMoeglicheVariante(\u00f4O0O00);
        this.addMoeglicheVariante(\u00f8O0O00);
    }
}

