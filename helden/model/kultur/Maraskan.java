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
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oo0o_2;
import helden.model.ProfessionenFabrik;
import helden.model.profession.Alchemist;
import helden.model.profession.Amazone;
import helden.model.profession.Geweihter;
import helden.model.profession.Hexe;
import helden.model.profession.Lehrmeister;
import helden.model.profession.Magier;
import helden.model.profession.Ritter;
import helden.model.profession.Scharlatan;
import helden.model.profession.Schwertgeselle;
import helden.model.profession.Stammeskrieger;
import java.util.ArrayList;

public class Maraskan
extends OooO {
    public static final P \u00d5\u00d5\u00f8000 = new P("Dschungel", 5, true);
    public static final P \u00d4\u00d5\u00f8000 = new P("K\u00fcstengebiet", 3, true);
    public static final P returnthisreturn = new P("Maraskanische St\u00e4dte", 1, true);
    private int \u00d8\u00d5\u00f8000 = 0;
    private G \u00d3\u00d5\u00f8000 = null;
    private G newthisreturn = null;

    public Maraskan() {
    }

    public Maraskan(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void addSpracheAuswahl(G g2) {
        if (this.\u00d3\u00d5\u00f8000 == null) {
            this.\u00d3\u00d5\u00f8000 = g2;
            if (g2.equals(G.whilewhileString)) {
                this.newthisreturn = G.\u00d8\u00d8\u00f5000;
                ArrayList<G> arrayList = new ArrayList<G>();
                arrayList.add(G.newwhileString);
                this.setZweitLehrsprache(arrayList);
            } else {
                ArrayList<G> arrayList = new ArrayList<G>();
                arrayList.add(G.whilewhileString);
                this.setZweitLehrsprache(arrayList);
            }
        } else {
            this.newthisreturn = g2;
        }
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(E.returnnewString, 2);
        this.setTalentwert(E.nullsuperString, 1);
        this.setTalentwert(E.\u00f4\u00d6\u00d8000, 2);
        this.setTalentwert(voidsuper.returnprivateObject, 1);
        this.setTalentwert(voidsuper.\u00d4\u00f8\u00d5000, 2);
        this.setTalentwert(voidsuper.thisinterfaceObject, 1);
        this.setTalentwert(voidsuper.forclassObject, 1);
        this.setTalentwert(voidsuper.\u00d30\u00d8000, 2);
        this.setTalentwert(voidsuper.oo\u00d6000, 2);
        this.setTalentwert(voidsuper.o\u00d5\u00d6000, 1);
        this.setTalentwert(voidsuper.thisintObject, 2);
        this.setTalentwert(voidsuper.\u00f5\u00d2\u00d6000, 2);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 2);
        this.setTalentwert(voidsuper.\u00d4\u00f6\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d5\u00d2\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00f4\u00d5\u00d6000, 2);
        this.setTalentwert(voidsuper.\u00d5\u00d5\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00d4\u00d4\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00d5\u00d3\u00d6000, 1);
        if (this.istVariante(\u00d5\u00d5\u00f8000)) {
            this.addTalentwert(voidsuper.ifforObject, 1);
            this.addTalentwert(voidsuper.\u00f8\u00f4\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 1);
            this.addTalentwert(voidsuper.returnforObject, 1);
            this.addTalentwert(voidsuper.thisvoidObject, 1);
            this.addTalentwert(voidsuper.o\u00d3\u00d6000, 2);
            this.addTalentwert(voidsuper.\u00f8\u00d8\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00f80\u00d6000, 1);
            this.addTalentwert(voidsuper.StringvoidObject, 1);
            this.addTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 2);
            this.addTalentwert(voidsuper.o\u00d5\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00d4\u00f6\u00d6000, 1);
        }
        if (this.istVariante(\u00d4\u00d5\u00f8000)) {
            this.addTalentwert(E.\u00d3\u00d5\u00d8000, 1);
            this.addTalentwert(voidsuper.returnprivateObject, 1);
            this.addTalentwert(voidsuper.o\u00d3\u00d6000, 2);
            this.addTalentwert(voidsuper.\u00f80\u00d6000, 2);
            this.addTalentwert(voidsuper.\u00d4\u00f6\u00d6000, 1);
            this.addTalentwert(voidsuper.thisclassObject, 1);
            this.addTalentwert(voidsuper.\u00d8\u00d8\u00d5000, 1);
        }
        if (this.istVariante(returnthisreturn)) {
            this.addTalentwert(voidsuper.thisinterfaceObject, 2);
            this.addTalentwert(voidsuper.\u00d30\u00d8000, 1);
            this.addTalentwert(voidsuper.O\u00f4\u00d5000, 1);
        }
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.StringObject);
        arrayList.add(I.O\u00f60000);
        arrayList.add(I.\u00f5\u00f60000);
        arrayList.add(I.nullObjectsuper);
        arrayList.add(I.\u00d5\u00d50000);
        arrayList.add(I.o\u00f4o000);
        arrayList.add(I.\u00f8\u00d4O000);
        arrayList.add(I.\u00d3\u00d40000);
        arrayList.add(I.\u00d4oo000);
        arrayList.add(I.forvoid);
        arrayList.add(I.\u00f4\u00f8o000);
        arrayList.add(I.O\u00d5o000);
        return arrayList;
    }

    @Override
    public String getID() {
        return "K24";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Maraskan";
    }

    @Override
    public G getMuttersprache() {
        return this.\u00d3\u00d5\u00f8000;
    }

    @Override
    public ArrayList<String> getNamesGeneratorListen(floatsuper floatsuper2) {
        ArrayList<String> arrayList = super.getNamesGeneratorListen(floatsuper2);
        arrayList.add("Maraskanische Namen");
        return arrayList;
    }

    @Override
    public oo0o_2 getNextSprachAuswahl() {
        if (this.\u00d3\u00d5\u00f8000 == null) {
            ArrayList<G> arrayList = new ArrayList<G>();
            arrayList.add(G.whilewhileString);
            arrayList.add(G.newwhileString);
            return new oo0o_2(this, arrayList, 1, "Muttersprache, nicht gew\u00e4hlte Sprache wird zur Zweitsprache");
        }
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.\u00d3o\u00f5000);
        arrayList.add(G.\u00d8\u00d8\u00f5000);
        return new oo0o_2(this, arrayList, 1, "Schrift zur Muttersprache");
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.\u00d8\u00d5\u00f8000) {
            case 0: {
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.\u00f4\u00d4\u00d8000);
                arrayList.add(E.thissuperString);
                int[] nArray = new int[]{1};
                ++this.\u00d8\u00d5\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 1: {
                arrayList.add(E.\u00d8\u00d5\u00d8000);
                arrayList.add(E.o\u00d6\u00d8000);
                int[] nArray = new int[]{1};
                ++this.\u00d8\u00d5\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 2: {
                arrayList.add(voidsuper.\u00d3\u00f4\u00d5000);
                arrayList.add(voidsuper.privateObjectObject);
                int[] nArray = new int[]{2};
                ++this.\u00d8\u00d5\u00f8000;
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
        arrayList.addAll(ProfessionenFabrik.getKriegerischeProfessionen(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Schwertgeselle(this.getGeschlecht(), g2, g3));
        Schwertgeselle schwertgeselle = new Schwertgeselle(this.getGeschlecht(), g2, g3);
        schwertgeselle.addMoeglicheVariante(schwertgeselle.getBuskur());
        arrayList.add(schwertgeselle);
        arrayList.remove(new Amazone(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Stammeskrieger(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Ritter(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getReisendeProfessionen(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getGesellschaftlicheProfessionen(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getHandwerklicheProfessionen(this.getGeschlecht(), g2, g3));
        arrayList.add(new Alchemist(this.getGeschlecht(), g2, g3));
        Magier magier = new Magier(this.getGeschlecht(), g2, g3);
        magier.addMoeglicheVariante(magier.getMendenaInitiator());
        magier.addMoeglicheVariante(magier.getMendenaInspirator());
        magier.addMoeglicheVariante(magier.getMendenaInstrukteuer());
        magier.addMoeglicheVariante(magier.getMendenaInvokator());
        magier.addMoeglicheVariante(magier.getYolGurmakF());
        magier.addMoeglicheVariante(magier.getYolGurmakH());
        magier.addMoeglicheVariante(magier.getYolGurmakU());
        magier.addMoeglicheVariante(magier.getYolGurmakW());
        arrayList.add(magier);
        Lehrmeister lehrmeister = new Lehrmeister(this.getGeschlecht(), g2, g3);
        lehrmeister.clearMoeglicheVarianten();
        lehrmeister.addMoeglicheVariante(lehrmeister.getKarasuk());
        lehrmeister.addMoeglicheVariante(lehrmeister.getNachtwind());
        arrayList.add(lehrmeister);
        Hexe hexe = new Hexe(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        hexe.clearMoeglicheVarianten();
        hexe.addMoeglicheVariante(hexe.getSchwarzeWitwe());
        arrayList.add(hexe);
        arrayList.add(new Scharlatan(this.getGeschlecht(), g2, g3));
        Geweihter geweihter = new Geweihter(this.getGeschlecht(), g2, g3);
        geweihter.clearMoeglicheVarianten();
        geweihter.addMoeglicheVariante(geweihter.getRurGror());
        geweihter.addMoeglicheVariante(geweihter.getRurGrorGeheim());
        geweihter.addMoeglicheVariante(geweihter.getRurGrorWanderer());
        geweihter.addMoeglicheVariante(geweihter.getRurGrorWandererGeheim());
        arrayList.add(geweihter);
        return arrayList;
    }

    @Override
    public G getSchrift() {
        return this.newthisreturn;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = new OOOo();
        U u2 = (U)oooo_0.o00000("Kulturkunde");
        u2.\u00d500000(this.getKulturkundeBezeichnung());
        oOOo.o00000(u2);
        if (this.istVariante(\u00d5\u00d5\u00f8000)) {
            oOOo.o00000(oooo_0.o00000(while.\u00f5\u00d5\u00d8000));
        }
        return oOOo;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f800000);
        arrayList.add(I.o\u00d3O000);
        arrayList.add(I.OO0000);
        arrayList.add(I.\u00d8Oo000);
        arrayList.add(I.\u00f4\u00d6o000);
        arrayList.add(I.\u00d4\u00f4o000);
        arrayList.add(I.o\u00f5O000);
        return arrayList;
    }

    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        if (!this.istVariante(\u00d5\u00d5\u00f8000)) {
            arrayList.add(new for(while.\u00f5\u00d5\u00d8000));
        }
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        J j2 = (J)K.o00000(I.thisdo);
        j2.oO0000(5);
        oo0O.\u00d300000(j2);
        J j3 = (J)K.o00000(I.\u00d50o000);
        j3.oO0000(5);
        oo0O.\u00d300000(j3);
        return oo0O;
    }

    @Override
    public boolean hatMehrSprachenAuswahl() {
        return this.\u00d3\u00d5\u00f8000 == null || this.newthisreturn == null;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        return this.\u00d8\u00d5\u00f8000 < 3;
    }

    @Override
    public boolean istMutterschriftGewaehlt() {
        return true;
    }

    @Override
    public boolean istMutterspracheGewaehlt() {
        return true;
    }

    @Override
    public boolean istZweitLehrspracheGewaehlt() {
        return true;
    }

    @Override
    public void setzeMuttersprache(G g2) {
        this.\u00d3\u00d5\u00f8000 = g2;
    }

    @Override
    public void setzeMuttersSchriftSrache(G g2) {
        this.newthisreturn = g2;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Maraskan");
        if (this.istVariante(\u00d5\u00d5\u00f8000)) {
            stringBuffer.append(", " + \u00d5\u00d5\u00f8000.toString());
        }
        if (this.istVariante(\u00d4\u00d5\u00f8000)) {
            stringBuffer.append(", " + \u00d4\u00d5\u00f8000.toString());
        }
        if (this.istVariante(returnthisreturn)) {
            stringBuffer.append(", " + returnthisreturn.toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected int getBasisGPKosten() {
        return 5;
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(\u00d5\u00d5\u00f8000);
        this.addAlleVarianten(\u00d4\u00d5\u00f8000);
        this.addAlleVarianten(returnthisreturn);
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.\u00f8\u00f4\u00d2000, 1);
        this.putModifikator(b_0.\u00d8\u00f5\u00d2000, 1);
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(\u00d5\u00d5\u00f8000);
        this.addMoeglicheVariante(\u00d4\u00d5\u00f8000);
        this.addMoeglicheVariante(returnthisreturn);
    }
}

