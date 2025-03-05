/*
 * Decompiled with CFR 0.152.
 */
package helden.model.kultur;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.C.public;
import helden.framework.D.OOOo;
import helden.framework.D.OoOO.U;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.framework.d.oooo_0;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.OooO;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.framework.oOoO.for;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.o00o_0;
import helden.model.profession.Amazone;
import helden.model.profession.Barde;
import helden.model.profession.Bauer;
import helden.model.profession.Derwisch;
import helden.model.profession.Domestik;
import helden.model.profession.Entdecker;
import helden.model.profession.Fernhaendler;
import helden.model.profession.Gaukler;
import helden.model.profession.Gelehrter;
import helden.model.profession.Grosswildjaeger;
import helden.model.profession.Haendler;
import helden.model.profession.Handwerker;
import helden.model.profession.Hirte;
import helden.model.profession.Jaeger;
import helden.model.profession.Karawanenfuehrer;
import helden.model.profession.Kundschafter;
import helden.model.profession.Magier;
import helden.model.profession.Prospektor;
import helden.model.profession.Schwertgeselle;
import helden.model.profession.Stammeskrieger;
import helden.model.profession.Strassenraeuber;
import helden.model.profession.Streuner;
import helden.model.profession.Tageloehner;
import helden.model.profession.Tierbaendiger;
import helden.model.profession.Wundarzt;
import helden.model.profession.Zaubertaenzer;
import java.util.ArrayList;

public class Novadis
extends OooO
implements for {
    public static final P \u00d3O0O00 = new P("M\u00e4nner oder Achmad'sunni", 2, false);
    public static final P OO0O00 = new P("Frauen", 0, false);
    public static final P \u00d4O0O00 = new P("W\u00fcstenoase (M\u00e4nner)", -2, true);
    public static final P oO0O00 = new P("W\u00fcstenoase (Frauen)", -1, true);
    public static final P forclassreturn = new P("M\u00e4nner oder Achmad'sunni", 4, false);
    public static final P nullclassreturn = new P("W\u00fcstenst\u00e4mme", 4, false);
    private J \u00d5O0O00 = null;

    public Novadis() {
    }

    public Novadis(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void addAutomatischerVorteil(public public_) {
        this.\u00d5O0O00 = (J)public_;
        this.\u00d5O0O00.oO0000(5);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        if (this.istVariante(\u00d3O0O00) || this.istVariante(forclassreturn) || this.istVariante(nullclassreturn)) {
            this.addTalentwert(E.\u00d3\u00d6\u00d8000, 1);
            this.addTalentwert(E.nullsuperString, 1);
            this.addTalentwert(E.O\u00d6\u00d8000, 1);
            this.addTalentwert(E.\u00f4\u00d6\u00d8000, 1);
            this.addTalentwert(E.newnewString, 1);
            this.addTalentwert(E.\u00f4\u00d4\u00d8000, 1);
            this.addTalentwert(E.o\u00d6\u00d8000, 1);
            this.addTalentwert(E.\u00d3\u00d5\u00d8000, 1);
            this.addTalentwert(voidsuper.ifforObject, 1);
            this.addTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 1);
            this.addTalentwert(voidsuper.\u00d5O\u00d6000, 3);
            this.addTalentwert(voidsuper.returnprivateObject, -1);
            this.addTalentwert(voidsuper.o\u00d3\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00d4\u00d8\u00d6000, 1);
            this.addTalentwert(voidsuper.StringvoidObject, 3);
            this.addTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00f4o\u00d6000, 2);
            this.addTalentwert(voidsuper.oo\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00f5\u00d2\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00f4\u00d2\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 1);
            this.addTalentwert(voidsuper.O\u00f4\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00d3\u00d6\u00d5000, 1);
            this.addTalentwert(voidsuper.thisclassObject, -1);
            this.addTalentwert(voidsuper.\u00f5\u00d5\u00d6000, 2);
        }
        if (this.istVariante(OO0O00)) {
            this.addTalentwert(E.nullsuperString, 1);
            this.addTalentwert(E.\u00f4\u00d6\u00d8000, 2);
            this.addTalentwert(voidsuper.ifforObject, 1);
            this.addTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 1);
            this.addTalentwert(voidsuper.\u00d5O\u00d6000, 2);
            this.addTalentwert(voidsuper.returnforObject, 1);
            this.addTalentwert(voidsuper.returnprivateObject, -1);
            this.addTalentwert(voidsuper.\u00d4\u00f8\u00d5000, 1);
            this.addTalentwert(voidsuper.forclassObject, 1);
            this.addTalentwert(voidsuper.o\u00d3\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00d4\u00d8\u00d6000, 3);
            this.addTalentwert(voidsuper.\u00d5\u00d5\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00d8\u00d5\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00d30\u00d8000, 1);
            this.addTalentwert(voidsuper.StringvoidObject, 3);
            this.addTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00f4o\u00d6000, 3);
            this.addTalentwert(voidsuper.oo\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00f5\u00d2\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00f4\u00d2\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 3);
            this.addTalentwert(voidsuper.O\u00f4\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00d3\u00d6\u00d5000, 1);
            this.addTalentwert(voidsuper.thisclassObject, -1);
            this.addTalentwert(voidsuper.\u00f4\u00d5\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00f5\u00f5\u00d6000, 1);
            this.addTalentwert(voidsuper.StringObjectObject, 1);
            this.addTalentwert(voidsuper.\u00d5\u00d5\u00d6000, 2);
            this.addTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 1);
            this.addTalentwert(voidsuper.o\u00f6\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00d4\u00d4\u00d5000, 2);
            this.addTalentwert(voidsuper.returnifObject, 1);
        }
        if (this.istVariante(\u00d4O0O00)) {
            this.removeTalent(E.\u00d3\u00d6\u00d8000);
            this.removeTalent(E.O\u00d6\u00d8000);
            this.removeTalent(E.\u00d3\u00d5\u00d8000);
            this.addTalentwert(voidsuper.\u00f8\u00f4\u00d6000, 2);
            this.addTalentwert(voidsuper.\u00d5O\u00d6000, -2);
            this.addTalentwert(voidsuper.thisinterfaceObject, 1);
            this.addTalentwert(voidsuper.\u00d30\u00d8000, 1);
            this.addTalentwert(voidsuper.StringvoidObject, -2);
            this.addTalentwert(voidsuper.\u00d5\u00d2\u00d6000, 1);
        }
        if (this.istVariante(oO0O00)) {
            this.addTalentwert(voidsuper.ifforObject, -1);
            this.addTalentwert(voidsuper.\u00d4\u00d2\u00d8000, -1);
            this.addTalentwert(voidsuper.\u00d5O\u00d6000, -1);
            this.addTalentwert(voidsuper.StringvoidObject, -2);
            this.addTalentwert(voidsuper.\u00d5\u00d2\u00d6000, 1);
            this.addTalentwert(voidsuper.privatedoObject, 1);
            this.addTalentwert(voidsuper.\u00d4\u00d4\u00d5000, -1);
        }
        if (this.istVariante(forclassreturn) || this.istVariante(nullclassreturn)) {
            this.addTalentwert(voidsuper.ifforObject, 1);
            this.addTalentwert(voidsuper.\u00d4\u00f8\u00d5000, 1);
            this.addTalentwert(voidsuper.o\u00d3\u00d6000, 1);
            this.removeTalent(voidsuper.\u00d4\u00d8\u00d6000);
            this.addTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 1);
            this.removeTalent(voidsuper.\u00f4o\u00d6000);
            this.removeTalent(voidsuper.\u00f4\u00d2\u00d6000);
            this.addTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 1);
        }
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.StringObject);
        arrayList.add(I.\u00f4\u00d8O000);
        arrayList.add(I.\u00d8\u00f6o000);
        arrayList.add(I.o\u00d8o000);
        arrayList.add(I.Stringsuper);
        arrayList.add(I.ifreturn);
        arrayList.add(I.thisdo);
        arrayList.add(I.o\u00f5O000);
        arrayList.add(I.\u00f5\u00f6o000);
        arrayList.add(I.\u00d5oo000);
        arrayList.add(I.\u00d40O000);
        arrayList.add(I.O\u00d5o000);
        if (this.istVariante(\u00d3O0O00) || this.istVariante(forclassreturn)) {
            arrayList.add(I.returnnewsuper);
            arrayList.add(I.\u00d3\u00d40000);
        }
        return arrayList;
    }

    @Override
    public String getID() {
        return "K30";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Novadi";
    }

    @Override
    public G getMuttersprache() {
        return G.newwhileString;
    }

    @Override
    public ArrayList<String> getNamesGeneratorListen(floatsuper floatsuper2) {
        ArrayList<String> arrayList = super.getNamesGeneratorListen(floatsuper2);
        arrayList.add("Novadische Namen");
        return arrayList;
    }

    @Override
    public o00o_0 getNextVorteilAuswahl() {
        if (this.\u00d5O0O00 == null) {
            ArrayList<public> arrayList = new ArrayList<public>();
            arrayList.add(K.o00000(I.thisdo));
            arrayList.add(K.o00000(I.\u00d40O000));
            return new o00o_0(this, arrayList, 1);
        }
        throw new c_1();
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        if (this.istVariante(\u00d3O0O00) || this.istVariante(\u00d4O0O00)) {
            BedingungsVerknuepfung bedingungsVerknuepfung = super.getNotwendigeVoraussetzungen();
            bedingungsVerknuepfung.addBedingung(new BedingungsVerknuepfung(VerknuepfungsArt.\u00d300000, Bedingung.hat(Geschlecht.\u00d400000), Bedingung.hatProfession(Stammeskrieger.class)));
            return bedingungsVerknuepfung;
        }
        if (this.istVariante(OO0O00) || this.istVariante(oO0O00)) {
            BedingungsVerknuepfung bedingungsVerknuepfung = super.getNotwendigeVoraussetzungen();
            bedingungsVerknuepfung.addBedingung(Bedingung.hat(Geschlecht.\u00d300000));
            return bedingungsVerknuepfung;
        }
        return super.getNotwendigeVoraussetzungen();
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        ArrayList<super> arrayList = new ArrayList<super>();
        if (this.istVariante(\u00d4O0O00) || this.istVariante(\u00d3O0O00)) {
            Stammeskrieger stammeskrieger = new Stammeskrieger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
            stammeskrieger.clearMoeglicheVarianten();
            stammeskrieger.addMoeglicheVariante(stammeskrieger.getNovadi());
            stammeskrieger.addMoeglicheVariante(stammeskrieger.getBeniDervez());
            stammeskrieger.addMoeglicheVariante(stammeskrieger.getAlDrakorhim());
            stammeskrieger.addMoeglicheVariante(stammeskrieger.getBeniUchakani());
            stammeskrieger.addMoeglicheVariante(stammeskrieger.getTarisharim());
            stammeskrieger.addMoeglicheVariante(stammeskrieger.getAchmadSunni());
            arrayList.add(stammeskrieger);
            Schwertgeselle schwertgeselle = new Schwertgeselle(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
            schwertgeselle.clearMoeglicheVarianten();
            schwertgeselle.addMoeglicheVariante(schwertgeselle.getRafim());
            arrayList.add(schwertgeselle);
            arrayList.add(new Entdecker(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
            arrayList.add(new Fernhaendler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
            arrayList.add(new Grosswildjaeger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
            arrayList.add(new Hirte(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
            arrayList.add(new Jaeger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
            Karawanenfuehrer karawanenfuehrer = new Karawanenfuehrer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
            karawanenfuehrer.addMoeglicheVariante(karawanenfuehrer.getSalzgaenger());
            arrayList.add(karawanenfuehrer);
            arrayList.add(new Kundschafter(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
            arrayList.add(new Prospektor(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
            Strassenraeuber strassenraeuber = new Strassenraeuber(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
            strassenraeuber.clearMoeglicheVarianten();
            strassenraeuber.addMoeglicheVariante(strassenraeuber.getBandit());
            arrayList.add(strassenraeuber);
            Barde barde = new Barde(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
            barde.clearMoeglicheVarianten();
            barde.addMoeglicheVariante(barde.getErzaehler());
            arrayList.add(barde);
            arrayList.add(new Haendler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
            arrayList.add(new Tageloehner(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
            arrayList.add(new Bauer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
            arrayList.add(new Domestik(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
            Gelehrter gelehrter = new Gelehrter(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
            gelehrter.addMoeglicheVariante(gelehrter.getMawdli());
            gelehrter.removeMoeglicheVariante(gelehrter.getRechtsgelehrter());
            arrayList.add(gelehrter);
            arrayList.add(new Handwerker(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
            arrayList.add(new Tierbaendiger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
            arrayList.add(new Wundarzt(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
            arrayList.add(new Derwisch(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
            Magier magier = new Magier(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
            magier.clearMoeglicheVarianten();
            magier.addMoeglicheVariante(magier.getMherwed());
            arrayList.add(magier);
        } else {
            Stammeskrieger stammeskrieger = new Stammeskrieger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
            stammeskrieger.clearMoeglicheVarianten();
            stammeskrieger.addMoeglicheVariante(stammeskrieger.getAchmadSunni());
            arrayList.add(stammeskrieger);
            arrayList.add(new Amazone(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
            arrayList.add(new Entdecker(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
            arrayList.add(new Fernhaendler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
            arrayList.add(new Hirte(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
            arrayList.add(new Kundschafter(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
            arrayList.add(new Prospektor(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
            Strassenraeuber strassenraeuber = new Strassenraeuber(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
            strassenraeuber.clearMoeglicheVarianten();
            strassenraeuber.addMoeglicheVariante(strassenraeuber.getBandit());
            arrayList.add(strassenraeuber);
            arrayList.add(new Barde(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
            arrayList.add(new Gaukler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
            arrayList.add(new Haendler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
            arrayList.add(new Streuner(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
            arrayList.add(new Tageloehner(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
            arrayList.add(new Bauer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
            arrayList.add(new Domestik(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
            arrayList.add(new Tierbaendiger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
            arrayList.add(new Wundarzt(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
            Zaubertaenzer zaubertaenzer = new Zaubertaenzer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
            zaubertaenzer.clearMoeglicheVarianten();
            zaubertaenzer.addMoeglicheVariante(zaubertaenzer.getNovadischeSharisad());
            zaubertaenzer.addMoeglicheVariante(zaubertaenzer.getNovadischeSharisadMagisch());
            arrayList.add(zaubertaenzer);
        }
        return arrayList;
    }

    @Override
    public G getSchrift() {
        return G.whileStringclass;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = new OOOo();
        U u2 = (U)oooo_0.o00000("Kulturkunde");
        u2.\u00d500000(this.getKulturkundeBezeichnung());
        oOOo.o00000(u2);
        oOOo.o00000(oooo_0.o00000(while.\u00f5o\u00d5000.toString()));
        return oOOo;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d5\u00d6O000);
        arrayList.add(I.whilethissuper);
        arrayList.add(I.\u00f4O\u00d2000);
        arrayList.add(I.\u00f800000);
        arrayList.add(I.\u00d8Oo000);
        arrayList.add(I.\u00d4oo000);
        arrayList.add(I.thisclass);
        arrayList.add(I.\u00f40\u00d2000);
        arrayList.add(I.\u00f5\u00d6O000);
        arrayList.add(I.\u00d8o0000);
        return arrayList;
    }

    public ArrayList<helden.framework.D.for> getVerbilligteSonderfertigkeiten() {
        ArrayList<helden.framework.D.for> arrayList = new ArrayList<helden.framework.D.for>();
        if (this.istVariante(\u00d3O0O00) || this.istVariante(forclassreturn) || this.istVariante(\u00d4O0O00) || this.istVariante(nullclassreturn)) {
            arrayList.add(new helden.framework.D.for(while.newint));
        }
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000(I.nullObjectsuper));
        oo0O.\u00d300000(K.o00000(I.\u00f8\u00d4O000));
        J j2 = (J)K.o00000(I.o\u00f5O000);
        j2.oO0000(6);
        oo0O.\u00d300000(j2);
        J j3 = (J)K.o00000(I.newnew);
        j3.oO0000(6);
        oo0O.\u00d300000(j3);
        if (!this.istVariante(forclassreturn) || !this.istVariante(nullclassreturn)) {
            oo0O.\u00d300000(K.o00000(I.\u00f5\u00d50000));
        }
        oo0O.\u00d300000(this.\u00d5O0O00);
        return oo0O;
    }

    @Override
    public boolean hatMehrVorteilAuswahl() {
        return this.\u00d5O0O00 == null;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Novadi");
        if (this.istVariante(\u00d3O0O00)) {
            stringBuffer.append("/");
            stringBuffer.append(\u00d3O0O00.toString());
        }
        if (this.istVariante(OO0O00)) {
            stringBuffer.append("/");
            stringBuffer.append(OO0O00.toString());
        }
        if (this.istVariante(oO0O00)) {
            stringBuffer.append("- ");
            stringBuffer.append(oO0O00.toString());
        }
        if (this.istVariante(\u00d4O0O00)) {
            stringBuffer.append("- ");
            stringBuffer.append(\u00d4O0O00.toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected int getBasisGPKosten() {
        return 0;
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(\u00d3O0O00);
        this.addAlleVarianten(OO0O00);
        this.addAlleVarianten(\u00d4O0O00);
        this.addAlleVarianten(oO0O00);
    }

    @Override
    protected void setzeModifikationen() {
        if (this.istVariante(\u00d3O0O00) || this.istVariante(forclassreturn) || this.istVariante(\u00d4O0O00) || this.istVariante(nullclassreturn)) {
            this.putModifikator(b_0.whilewhilesuper, 1);
            this.putModifikator(b_0.thispublicsuper, 2);
        } else {
            this.putModifikator(b_0.thispublicsuper, 1);
        }
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(\u00d3O0O00);
        this.addMoeglicheVariante(OO0O00);
        this.addMoeglicheVariante(\u00d4O0O00);
        this.addMoeglicheVariante(oO0O00);
    }
}

