/*
 * Decompiled with CFR 0.152.
 */
package helden.model.kultur;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.M;
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
import helden.framework.d.oooo_0;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.OooO;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.framework.oOoO.for;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.o00o_0;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.model.DDZprofessionen.Jaeger;
import helden.model.profession.Haendler;
import helden.model.profession.Handwerker;
import helden.model.profession.Kundschafter;
import helden.model.profession.Prospektor;
import java.util.ArrayList;

public class NuanaaeLi
extends OooO
implements for {
    public static final P \u00d8\u00d80O00 = new P("Nauoke", 10, true);
    private int returnifreturn = 0;
    private ArrayList<public> \u00d5\u00d80O00 = new ArrayList();

    public NuanaaeLi() {
    }

    public NuanaaeLi(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void addAutomatischerVorteil(public public_) {
        this.\u00d5\u00d80O00.add(public_);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(E.nullsuperString, 1);
        this.setTalentwert(E.\u00f5\u00d3\u00d8000, 2);
        this.setTalentwert(E.\u00f4\u00d6\u00d8000, 4);
        this.setTalentwert(E.newnewString, 2);
        this.setTalentwert(E.o\u00d6\u00d8000, 3);
        this.setTalentwert(voidsuper.ifforObject, 3);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d6000, 3);
        this.setTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 3);
        this.setTalentwert(voidsuper.returnforObject, 3);
        this.setTalentwert(voidsuper.returnprivateObject, 2);
        this.setTalentwert(voidsuper.\u00d4\u00f8\u00d5000, 2);
        this.setTalentwert(voidsuper.thisvoidObject, 1);
        this.setTalentwert(voidsuper.o\u00d3\u00d6000, 2);
        this.setTalentwert(voidsuper.\u00f8\u00d8\u00d5000, 4);
        this.setTalentwert(voidsuper.\u00f80\u00d6000, 3);
        this.setTalentwert(voidsuper.StringvoidObject, 3);
        this.setTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 4);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 1);
        this.setTalentwert(voidsuper.\u00d4\u00f6\u00d6000, 2);
        this.setTalentwert(voidsuper.\u00d5\u00d5\u00d6000, 2);
        this.setTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 2);
        this.setTalentwert(voidsuper.\u00d4\u00d4\u00d5000, 1);
        if (this.istVariante(\u00d8\u00d80O00)) {
            this.addTalentwert(E.\u00f4\u00d6\u00d8000, 2);
            this.addTalentwert(E.newnewString, 3);
            this.addTalentwert(E.o\u00d6\u00d8000, 1);
            this.addTalentwert(voidsuper.ifforObject, 1);
            this.addTalentwert(voidsuper.\u00f8\u00f4\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 1);
            this.addTalentwert(voidsuper.returnforObject, 1);
            this.addTalentwert(voidsuper.\u00d4\u00f8\u00d5000, 2);
            this.addTalentwert(voidsuper.o\u00d3\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00f8\u00d8\u00d5000, 1);
            this.addTalentwert(voidsuper.StringvoidObject, 1);
            this.addTalentwert(voidsuper.\u00d4\u00f6\u00d6000, 2);
        }
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.StringObject);
        arrayList.add(I.\u00f4\u00d8O000);
        arrayList.add(I.\u00f5\u00f60000);
        arrayList.add(I.OO0000);
        arrayList.add(I.\u00f8\u00d4O000);
        arrayList.add(I.\u00d3\u00d40000);
        arrayList.add(I.\u00d5\u00d3O000);
        arrayList.add(I.nullfloat);
        arrayList.add(I.ifreturn);
        arrayList.add(I.\u00d3O0000);
        arrayList.add(I.forsuper);
        arrayList.add(I.newif);
        arrayList.add(I.\u00f4\u00f5o000);
        return arrayList;
    }

    @Override
    public String getID() {
        return "K50";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Nivesen";
    }

    @Override
    public int getMaximalSozialstatus() {
        return 5;
    }

    @Override
    public G getMuttersprache() {
        return G.nullsuperclass;
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.returnifreturn) {
            case 0: {
                arrayList.add(E.\u00d3\u00d6\u00d8000);
                arrayList.add(E.\u00d3\u00d5\u00d8000);
                int[] nArray = new int[]{2};
                ++this.returnifreturn;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 1: {
                arrayList.add(voidsuper.forvoidObject);
                arrayList.add(voidsuper.Oo\u00d6000);
                arrayList.add(voidsuper.\u00f80\u00d8000);
                arrayList.add(voidsuper.oO\u00d6000);
                int[] nArray = new int[]{2};
                ++this.returnifreturn;
                return new o0oo_2(this, arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public o00o_0 getNextVorteilAuswahl() {
        if (this.\u00d5\u00d80O00.size() == 0) {
            ArrayList<public> arrayList = new ArrayList<public>();
            arrayList.add(K.o00000(I.o\u00d5O000, "Religion", 5));
            arrayList.add(K.o00000(I.o\u00d5O000, "Adelsherrschaft", 5));
            arrayList.add(K.o00000(I.o\u00d5O000, "W\u00e4hrung/Geld", 5));
            arrayList.add(K.o00000(I.o\u00d5O000, "Rechtsprechung/Gesetze", 5));
            return new o00o_0(this, arrayList, 3);
        }
        throw new c_1();
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        if (this.istVariante(\u00d8\u00d80O00)) {
            BedingungsVerknuepfung bedingungsVerknuepfung = super.getNotwendigeVoraussetzungen();
            bedingungsVerknuepfung.addBedingung(Bedingung.hat(I.\u00d5\u00d3O000));
            return bedingungsVerknuepfung;
        }
        return super.getNotwendigeVoraussetzungen();
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        ArrayList<super> arrayList = new ArrayList<super>();
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        helden.model.profession.Jaeger jaeger = new helden.model.profession.Jaeger(this.getGeschlecht(), g2, g3);
        jaeger.removeMoeglicheVariante(jaeger.getWildhueter());
        arrayList.add(jaeger);
        arrayList.add(new Kundschafter(this.getGeschlecht(), g2, g3));
        Prospektor prospektor = new Prospektor(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        prospektor.clearMoeglicheVarianten();
        prospektor.addMoeglicheVariante(prospektor.getSammler());
        arrayList.add(prospektor);
        Haendler haendler = new Haendler(this.getGeschlecht(), g2, g3);
        haendler.clearMoeglicheVarianten();
        haendler.addMoeglicheVariante(haendler.getTauschhaendler());
        arrayList.add(haendler);
        Handwerker handwerker = new Handwerker(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        handwerker.clearMoeglicheVarianten();
        handwerker.addMoeglicheVariante(handwerker.getArchaischeNordens());
        arrayList.add(handwerker);
        Jaeger jaeger2 = new Jaeger(this.getGeschlecht(), g2, g3);
        jaeger2.removeMoeglicheVariante(jaeger2.getWildhueter());
        arrayList.add(jaeger2);
        arrayList.add(new helden.model.DDZprofessionen.Kundschafter(this.getGeschlecht(), g2, g3));
        helden.model.DDZprofessionen.Prospektor prospektor2 = new helden.model.DDZprofessionen.Prospektor(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        prospektor2.clearMoeglicheVarianten();
        prospektor2.addMoeglicheVariante(prospektor2.getSammler());
        arrayList.add(prospektor2);
        helden.model.DDZprofessionen.Haendler haendler2 = new helden.model.DDZprofessionen.Haendler(this.getGeschlecht(), g2, g3);
        haendler2.clearMoeglicheVarianten();
        haendler2.addMoeglicheVariante(haendler2.getTauschhaendler());
        arrayList.add(haendler2);
        helden.model.DDZprofessionen.Handwerker handwerker2 = new helden.model.DDZprofessionen.Handwerker(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        handwerker2.clearMoeglicheVarianten();
        handwerker2.addMoeglicheVariante(handwerker2.getArchaischeNordens());
        arrayList.add(handwerker2);
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
        oOOo.o00000(oooo_0.o00000(while.\u00f6o\u00d5000.toString()));
        return oOOo;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d5\u00d6O000);
        arrayList.add(I.whilethissuper);
        arrayList.add(I.\u00f4O\u00d2000);
        arrayList.add(I.\u00d5o\u00d2000);
        arrayList.add(I.nullObjectsuper);
        arrayList.add(I.\u00d4oo000);
        arrayList.add(I.\u00d8\u00f60000);
        arrayList.add(I.thisdo);
        arrayList.add(I.\u00f8\u00d2o000);
        arrayList.add(I.privateclass);
        arrayList.add(I.\u00d8o0000);
        arrayList.add(I.whilenewsuper);
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        M m;
        Oo0O oo0O = super.getVorteile();
        if (this.istVariante(\u00d8\u00d80O00)) {
            m = (M)K.o00000(I.nullfloat);
            m.\u00d2o0000();
            m.o00000("wissentlich");
            oo0O.\u00d300000(m);
        }
        oo0O.\u00d300000(K.o00000(I.\u00f4\u00f8o000));
        m = (M)K.o00000(I.\u00d8\u00f8O000);
        m.\u00d2o0000();
        m.o00000(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.Objectsuper.toString());
        oo0O.\u00d300000(m);
        for (public public_ : this.\u00d5\u00d80O00) {
            oo0O.\u00d300000(public_);
        }
        return oo0O;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        return this.returnifreturn < 2;
    }

    @Override
    public boolean hatMehrVorteilAuswahl() {
        return this.\u00d5\u00d80O00.size() == 0;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Nuana\u00e4-Li");
        if (this.istVariante(\u00d8\u00d80O00)) {
            stringBuffer.append(" - ");
            stringBuffer.append(\u00d8\u00d80O00.toString());
        }
        return stringBuffer.toString();
    }

    @Override
    protected int getBasisGPKosten() {
        return 7;
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(\u00d8\u00d80O00);
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.thispublicsuper, 5);
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(\u00d8\u00d80O00);
    }
}

