/*
 * Decompiled with CFR 0.152.
 */
package helden.model.kultur;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.Oo0O;
import helden.framework.D.OOOo;
import helden.framework.D.OoOO.U;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OOoO.K;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.OooO;
import helden.framework.int.super;
import helden.framework.oooo.c_1;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.model.profession.Bewahrer;
import helden.model.profession.Former;
import helden.model.profession.Kaempfer;
import helden.model.profession.Legendensaenger;
import helden.model.profession.Wildnislaeufer;
import helden.model.profession.Zauberweber;
import java.util.ArrayList;

public class SteppenelfenSippe
extends OooO {
    protected int returnforclass = 0;

    public SteppenelfenSippe() {
    }

    public SteppenelfenSippe(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public int anzahlAktivierbarerZauber() {
        return 10;
    }

    @Override
    public int anzahlWaehlbareHauszauber() {
        return 3;
    }

    @Override
    public int anzahlWahlbarerLeitzauber() {
        return 3;
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.setTalentwert(E.\u00d3\u00d6\u00d8000, 4);
        this.setTalentwert(E.nullsuperString, 2);
        this.setTalentwert(E.o\u00d6\u00d8000, 2);
        this.setTalentwert(voidsuper.ifforObject, 1);
        this.setTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 2);
        this.setTalentwert(voidsuper.\u00d5O\u00d6000, 5);
        this.setTalentwert(voidsuper.returnforObject, 2);
        this.setTalentwert(voidsuper.returnprivateObject, 2);
        this.setTalentwert(voidsuper.\u00d4\u00f8\u00d5000, 2);
        this.setTalentwert(voidsuper.thisvoidObject, 2);
        this.setTalentwert(voidsuper.newnewObject, 2);
        this.setTalentwert(voidsuper.o\u00d3\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d4\u00d8\u00d6000, 2);
        this.setTalentwert(voidsuper.O\u00f6\u00d5000, -2);
        this.setTalentwert(voidsuper.\u00f8\u00d8\u00d5000, 2);
        this.setTalentwert(voidsuper.\u00f80\u00d6000, 2);
        this.setTalentwert(voidsuper.StringvoidObject, 2);
        this.setTalentwert(voidsuper.\u00d40\u00d8000, 2);
        this.setTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 5);
        this.setTalentwert(voidsuper.\u00f5\u00f5\u00d5000, 2);
        this.setTalentwert(voidsuper.o\u00d5\u00d6000, 4);
        this.setTalentwert(voidsuper.\u00f4\u00d2\u00d6000, -2);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 2);
        this.setTalentwert(voidsuper.\u00d4\u00f6\u00d6000, 4);
        this.setTalentwert(voidsuper.\u00d8\u00d5\u00d5000, 2);
        this.setTalentwert(voidsuper.forvoidObject, 2);
        this.setTalentwert(voidsuper.\u00f4\u00d5\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d5\u00d5\u00d6000, 3);
        this.setTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 2);
        this.setTalentwert(voidsuper.\u00d4\u00d4\u00d5000, 3);
        this.setTalentwert(voidsuper.privateObjectObject, 2);
        this.setTalentwert(voidsuper.returnifObject, 2);
    }

    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("geschultes Elfenpony");
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f5\u00f60000);
        arrayList.add(I.privateclasssuper);
        arrayList.add(I.ifif);
        arrayList.add(I.ooO000);
        arrayList.add(I.\u00d5\u00f4O000);
        arrayList.add(I.O\u00f6O000);
        arrayList.add(I.thisdo);
        arrayList.add(I.\u00f400000);
        arrayList.add(I.O\u00d5o000);
        arrayList.add(I.whileStringsuper);
        arrayList.add(I.o\u00d5O000);
        return arrayList;
    }

    @Override
    public String getID() {
        return "K33";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Steppenelfen";
    }

    @Override
    public int getMaximalSozialstatus() {
        return 7;
    }

    @Override
    public G getMuttersprache() {
        return G.\u00d5\u00f8\u00f4000;
    }

    @Override
    public ArrayList<String> getNamesGeneratorListen(floatsuper floatsuper2) {
        ArrayList<String> arrayList = super.getNamesGeneratorListen(floatsuper2);
        arrayList.add("Elfische Namen");
        return arrayList;
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.returnforclass) {
            case 0: {
                arrayList.add(G.\u00f8\u00f6\u00f5000);
                arrayList.add(G.whilewhileString);
                arrayList.add(G.nullsuperclass);
                int[] nArray = new int[]{4};
                ++this.returnforclass;
                return new o0oo_2(this, arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        ArrayList<super> arrayList = new ArrayList<super>();
        arrayList.add(new Bewahrer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        Kaempfer kaempfer = new Kaempfer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        kaempfer.clearMoeglicheVarianten();
        kaempfer.addMoeglicheVariante(kaempfer.getSteppenelfischerKaempfer());
        arrayList.add(kaempfer);
        arrayList.add(new Legendensaenger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        Wildnislaeufer wildnislaeufer = new Wildnislaeufer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        wildnislaeufer.clearMoeglicheVarianten();
        wildnislaeufer.addMoeglicheVariante(wildnislaeufer.getSteppenreiter());
        arrayList.add(wildnislaeufer);
        Zauberweber zauberweber = new Zauberweber(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        zauberweber.clearMoeglicheVarianten();
        zauberweber.addMoeglicheVariante(zauberweber.getZauberweber());
        arrayList.add(zauberweber);
        arrayList.add(new Former(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        return arrayList;
    }

    @Override
    public K getRepraesentation(Zauber zauber) {
        return K.\u00f4o0000;
    }

    @Override
    public G getSchrift() {
        return G.\u00d3\u00f4\u00f5000;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = new OOOo();
        U u2 = (U)oooo_0.o00000("Kulturkunde");
        u2.\u00d500000(this.getKulturkundeBezeichnung());
        oOOo.o00000(u2);
        oOOo.o00000(oooo_0.o00000(while.StringthisString.toString()));
        oOOo.o00000(oooo_0.o00000(while.fornullsuper.toString()));
        oOOo.o00000(oooo_0.o00000(while.privatenullObject.toString()));
        oOOo.o00000(oooo_0.o00000(while.\u00f5\u00d30000.toString()));
        oOOo.o00000(oooo_0.o00000(while.Stringnewclass.toString()));
        oOOo.o00000(oooo_0.o00000(while.\u00d2\u00f5\u00d8000.toString()));
        return oOOo;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d4oo000);
        arrayList.add(I.privateclass);
        arrayList.add(I.\u00d8o0000);
        arrayList.add(I.\u00d40O000);
        arrayList.add(I.\u00d3\u00f4O000);
        return arrayList;
    }

    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.o\u00d6\u00d4000));
        arrayList.add(new for(while.iffloatObject));
        arrayList.add(new for(while.\u00d6\u00f4\u00f4000));
        arrayList.add(new for(while.\u00f8\u00d5\u00d6000));
        return arrayList;
    }

    @Override
    public int getVerrechnungspunkte() {
        return 100;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        J j2 = (J)helden.framework.C.K.o00000(I.thisdo);
        j2.oO0000(5);
        oo0O.\u00d300000(j2);
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.newreturn));
        J j3 = (J)helden.framework.C.K.o00000(I.newnew);
        j3.oO0000(10);
        oo0O.\u00d300000(j3);
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.o\u00d5O000, "Adel/Hierarchien", 6));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.o\u00d5O000, "G\u00f6tter/Religion", 6));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.o\u00d5O000, "Geld/Besitz", 6));
        return oo0O;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00d6\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00f8\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00f8\u00d2000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4O\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f8\u00f8\u00d2000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.newfornew, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00d6\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f8o\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.o0\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3\u00f8\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3\u00f6\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.O\u00d2\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00f6\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00f6\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d40\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.O\u00d3\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f80\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00d3\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00f4\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.o\u00d8\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.Stringpublicnew, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d5\u00d2\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4O\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d5\u00f8\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8O\u00d5000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3O\u00d5000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.iffornew, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.StringObjectnew, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.ifprivatesuper, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.O\u00d8\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00f6\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f5\u00d5\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00d6\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00f6\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.oo\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3o\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d5\u00d6\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f8\u00f8\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00f5\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.o\u00d5\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00d3\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f8o\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00d5\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.o\u00f6\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.O\u00d5\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f8\u00f8\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00d3\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f8\u00d4\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4O\u00d5000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00d5\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4o\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d5o\u00d5000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.ifnewnew, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00f6\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.nullsupernew, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f5\u00d6\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8o\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d30\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d40\u00d5000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00f5\u00d3000, K.\u00f4o0000, ""));
        return waehlbareZauber;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        return this.returnforclass < 1;
    }

    @Override
    public K repraesenationVerrechnungspunkte() {
        return K.\u00f4o0000;
    }

    @Override
    public void setzeLeittalente(ArrayList<oo0o_0> arrayList) {
        arrayList.add(voidsuper.ifforObject);
        arrayList.add(voidsuper.\u00d4\u00d2\u00d8000);
        arrayList.add(voidsuper.\u00d3\u00f4\u00d5000);
        arrayList.add(voidsuper.privateObjectObject);
        arrayList.add(voidsuper.StringvoidObject);
        arrayList.add(voidsuper.returnforObject);
        arrayList.add(voidsuper.newnewObject);
        arrayList.add(voidsuper.o\u00d3\u00d6000);
        arrayList.add(voidsuper.\u00d4\u00d8\u00d6000);
        arrayList.add(voidsuper.\u00d40\u00d8000);
        arrayList.add(G.\u00d5\u00f8\u00f4000);
        arrayList.add(G.\u00f50\u00f5000);
        arrayList.add(G.\u00d3\u00f4\u00f5000);
        arrayList.add(G.o0\u00f5000);
        arrayList.add(E.\u00d3\u00d6\u00d8000);
        arrayList.add(voidsuper.\u00d5O\u00d6000);
        arrayList.add(voidsuper.\u00d4\u00f8\u00d5000);
        arrayList.add(voidsuper.thisvoidObject);
        arrayList.add(voidsuper.\u00f8\u00d8\u00d5000);
        arrayList.add(voidsuper.\u00d3\u00f4\u00d6000);
        arrayList.add(voidsuper.\u00d4\u00f6\u00d6000);
        arrayList.add(voidsuper.\u00d8\u00d5\u00d5000);
    }

    @Override
    public String toString() {
        return "Steppenelfische Sippe";
    }

    @Override
    protected int getBasisGPKosten() {
        return 4;
    }
}

