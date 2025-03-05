/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZKulturen;

import helden.framework.C.I;
import helden.framework.D.OOOo;
import helden.framework.D.OoOO.U;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OOoO.K;
import helden.framework.OOoO.o00O;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.OooO;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.framework.oOoO.void;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.model.DDZKulturen.BosparanischesReich;
import helden.model.DDZprofessionen.Alchemist;
import helden.model.DDZprofessionen.Bauer;
import helden.model.DDZprofessionen.Bettler;
import helden.model.DDZprofessionen.BosMagier;
import helden.model.DDZprofessionen.Dieb;
import helden.model.DDZprofessionen.Druide;
import helden.model.DDZprofessionen.Edelhandwerker;
import helden.model.DDZprofessionen.Einbrecher;
import helden.model.DDZprofessionen.Entdecker;
import helden.model.DDZprofessionen.Feilscher;
import helden.model.DDZprofessionen.Fernhaendler;
import helden.model.DDZprofessionen.Goetterdiener;
import helden.model.DDZprofessionen.Grosswildjaeger;
import helden.model.DDZprofessionen.Haendler;
import helden.model.DDZprofessionen.Handwerker;
import helden.model.DDZprofessionen.Kundschafter;
import helden.model.DDZprofessionen.Lakai;
import helden.model.DDZprofessionen.Prospektor;
import helden.model.DDZprofessionen.Schmuggler;
import helden.model.DDZprofessionen.Spitzel;
import helden.model.DDZprofessionen.Streuner;
import helden.model.DDZprofessionen.Wirt;
import helden.model.DDZprofessionen.Wundarzt;
import java.util.ArrayList;
import java.util.Iterator;

public class Grolmensippe
extends OooO {
    public static final P returnnullreturn = new P("St\u00e4dtische Grolme", 7, false);
    public static final P \u00d5\u00d40O00 = new P("H\u00f6hlengrolme", 6, false);
    public static final P \u00d8\u00d40O00 = new P("Fahrende Grolme", 5, false);
    private ArrayList<o0oo_2> \u00f4\u00d40O00;
    private int \u00f5\u00d40O00 = 0;

    public Grolmensippe() {
    }

    public Grolmensippe(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.addTalentwert(E.nullsuperString, 1);
        this.addTalentwert(E.\u00f5\u00d5\u00d8000, 1);
        this.addTalentwert(E.\u00d3\u00d4\u00d8000, 1);
        this.addTalentwert(voidsuper.\u00d4\u00f8\u00d5000, 1);
        this.addTalentwert(voidsuper.o\u00d3\u00d6000, 1);
        this.addTalentwert(voidsuper.\u00d8\u00d5\u00d6000, 1);
        this.addTalentwert(voidsuper.thisinterfaceObject, 4);
        this.addTalentwert(voidsuper.\u00d30\u00d8000, 2);
        this.addTalentwert(voidsuper.\u00f4\u00f6\u00d5000, 2);
        this.addTalentwert(voidsuper.o\u00d5\u00d6000, 1);
        this.addTalentwert(voidsuper.\u00f5\u00d2\u00d6000, 4);
        this.addTalentwert(voidsuper.\u00f5o\u00d6000, 2);
        this.addTalentwert(voidsuper.\u00d5\u00d6\u00d6000, 2);
        this.addTalentwert(voidsuper.\u00d3\u00f4\u00d5000, 2);
        if (this.istVariante(returnnullreturn)) {
            this.addTalentwert(voidsuper.thisvoidObject, 1);
            this.addTalentwert(voidsuper.O\u00f6\u00d5000, 2);
            this.addTalentwert(voidsuper.thisinterfaceObject, 1);
            this.addTalentwert(voidsuper.\u00f4\u00f6\u00d5000, 2);
            this.addTalentwert(G.\u00d3\u00f8\u00f5000, 6);
            this.addTalentwert(G.\u00d40\u00f6000, 4);
            this.addTalentwert(voidsuper.\u00f5o\u00d6000, 2);
            this.addTalentwert(voidsuper.o\u00f6\u00d5000, 2);
            this.addTalentwert(voidsuper.\u00d3\u00f4\u00d5000, 2);
        }
        if (this.istVariante(\u00d5\u00d40O00)) {
            this.addTalentwert(voidsuper.\u00f8\u00f4\u00d6000, 2);
            this.addTalentwert(voidsuper.\u00d5\u00d6\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00d50\u00d8000, 2);
            this.addTalentwert(voidsuper.\u00f40\u00d8000, 1);
            this.addTalentwert(voidsuper.o\u00d5\u00d6000, 1);
            this.addTalentwert(G.\u00d3\u00f8\u00f5000, 4);
            this.addTalentwert(voidsuper.forObjectObject, 1);
        }
        if (this.istVariante(\u00d8\u00d40O00)) {
            this.addTalentwert(voidsuper.returnforObject, 2);
            this.addTalentwert(voidsuper.StringvoidObject, 1);
            this.addTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 2);
            this.addTalentwert(voidsuper.nullObjectObject, 2);
            this.addTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 2);
            this.addTalentwert(G.\u00d3\u00f8\u00f5000, 4);
            this.addTalentwert(voidsuper.\u00d5\u00d6\u00d6000, 1);
        }
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f5\u00f40000);
        arrayList.add(I.\u00f8oO000);
        arrayList.add(helden.framework.C.K.o00000(I.\u00f4\u00d20000, voidsuper.\u00d30\u00d8000));
        arrayList.add(helden.framework.C.K.o00000(I.\u00f5\u00f6O000, o00O.classnew, o00O.\u00d8o0000, o00O.\u00d200000));
        arrayList.add(I.\u00f5\u00f50000);
        arrayList.add(I.whilenull);
        arrayList.add(I.\u00f5\u00f4o000);
        arrayList.add(I.o00000);
        arrayList.add(I.o\u00f5O000);
        arrayList.add(I.\u00f40\u00d2000);
        arrayList.add(I.\u00f5\u00d6O000);
        arrayList.add(I.\u00d50o000);
        arrayList.add(I.\u00f5\u00f80000);
        return arrayList;
    }

    @Override
    public String getID() {
        return "K71";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Grolme";
    }

    @Override
    public int getMaximalSozialstatus() {
        return 7;
    }

    @Override
    public G getMuttersprache() {
        return G.\u00d5\u00f6\u00f5000;
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        o0oo_2 o0oo_22 = this.\u00f4\u00d40O00.get(this.\u00f5\u00d40O00);
        ++this.\u00f5\u00d40O00;
        return o0oo_22;
    }

    @Override
    public void getNextVerbilligteSonderfertigkeitAuswahl() {
        ArrayList<for> arrayList = new ArrayList<for>();
        if (this.istVariante(\u00d8\u00d40O00)) {
            arrayList.addAll(this.getSetting().getvSF(while.\u00d2o\u00f5000.toString()));
            arrayList.remove(new for<String>(this.getKulturkundeBezeichnung(), while.\u00d2o\u00f5000, false));
        }
        return new void(this, arrayList, 1);
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        ArrayList<super> arrayList = new ArrayList<super>();
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        arrayList.add(new Entdecker(this.getGeschlecht(), g2, g3));
        arrayList.add(new Fernhaendler(this.getGeschlecht(), g2, g3));
        Grosswildjaeger grosswildjaeger = new Grosswildjaeger(this.getGeschlecht(), g2, g3);
        grosswildjaeger.clearMoeglicheVarianten();
        grosswildjaeger.addMoeglicheVariante(grosswildjaeger.getSklavenjaeger());
        arrayList.add(grosswildjaeger);
        arrayList.add(new Kundschafter(this.getGeschlecht(), g2, g3));
        arrayList.add(new Prospektor(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schmuggler(this.getGeschlecht(), g2, g3));
        arrayList.add(new Bettler(this.getGeschlecht(), g2, g3));
        arrayList.add(new Dieb(this.getGeschlecht(), g2, g3));
        arrayList.add(new Einbrecher(this.getGeschlecht(), g2, g3));
        arrayList.add(new Feilscher(this.getGeschlecht(), g2, g3));
        arrayList.add(new Haendler(this.getGeschlecht(), g2, g3));
        arrayList.add(new Spitzel(this.getGeschlecht(), g2, g3));
        arrayList.add(new Streuner(this.getGeschlecht(), g2, g3));
        arrayList.add(new Wirt(this.getGeschlecht(), g2, g3));
        Bauer bauer = new Bauer(this.getGeschlecht(), g2, g3);
        bauer.clearMoeglicheVarianten();
        bauer.addMoeglicheVariante(bauer.getGaertner());
        bauer.addMoeglicheVariante(bauer.getPflanzer());
        bauer.addMoeglicheVariante(bauer.getViehzuechter());
        arrayList.add(bauer);
        Edelhandwerker edelhandwerker = new Edelhandwerker(this.getGeschlecht(), g2, g3);
        edelhandwerker.clearMoeglicheVarianten();
        edelhandwerker.addMoeglicheVariante(edelhandwerker.getApothekarius());
        edelhandwerker.addMoeglicheVariante(edelhandwerker.getBaumeister());
        edelhandwerker.addMoeglicheVariante(edelhandwerker.getMechanikus());
        arrayList.add(edelhandwerker);
        Handwerker handwerker = new Handwerker(this.getGeschlecht(), g2, g3);
        handwerker.addMoeglicheVariante(handwerker.getBastlerDorf());
        handwerker.addMoeglicheVariante(handwerker.getBastlerStaedisch());
        arrayList.add(handwerker);
        arrayList.add(new Lakai(this.getGeschlecht(), g2, g3));
        arrayList.add(new Wundarzt(this.getGeschlecht(), g2, g3));
        Alchemist alchemist = new Alchemist(this.getGeschlecht(), g2, g3);
        alchemist.clearMoeglicheVarianten();
        alchemist.addMoeglicheVariante(alchemist.getGrolmischerGoldmacher());
        arrayList.add(alchemist);
        Druide druide = new Druide(this.getGeschlecht(), g2, g3);
        druide.clearMoeglicheVarianten();
        druide.addMoeglicheVariante(druide.getMehrerderMacht());
        arrayList.add(druide);
        BosMagier bosMagier = new BosMagier(this.getGeschlecht(), g2, g3);
        bosMagier.clearMoeglicheVarianten();
        bosMagier.addMoeglicheVariante(bosMagier.getLeibmagier());
        arrayList.add(bosMagier);
        arrayList.add(new Goetterdiener(this.getGeschlecht(), g2, g3));
        return arrayList;
    }

    @Override
    public G getSchrift() {
        return null;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = new OOOo();
        U u2 = (U)oooo_0.o00000("Kulturkunde");
        u2.\u00d500000(this.getKulturkundeBezeichnung());
        oOOo.o00000(u2);
        if (this.istVariante(returnnullreturn)) {
            u2 = (U)oooo_0.o00000("Kulturkunde");
            u2.\u00d500000(new BosparanischesReich(Geschlecht.\u00d400000).getKulturkundeBezeichnung());
            oOOo.o00000(u2);
        }
        if (this.istVariante(\u00d5\u00d40O00)) {
            oOOo.o00000(oooo_0.o00000(while.\u00d6\u00d5\u00d4000.toString()));
        }
        return oOOo;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(helden.framework.C.K.o00000(I.\u00f5\u00f6O000, o00O.\u00d2O0000, o00O.\u00d6o0000));
        arrayList.add(I.privateclasssuper);
        arrayList.add(I.\u00d8\u00d3o000);
        arrayList.add(I.\u00d5\u00d3O000);
        arrayList.add(I.nullclass);
        arrayList.add(I.\u00d30\u00d2000);
        arrayList.add(I.newnew);
        return arrayList;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.O\u00d3\u00d4000, K.\u00d3\u00d20000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00d3\u00d3000, K.\u00d3\u00d20000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f8o\u00d3000, K.\u00d3\u00d20000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.o\u00d3\u00d3000, K.\u00d3\u00d20000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.privateintnew, K.\u00d3\u00d20000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.o0\u00d4000, K.\u00d3\u00d20000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00d8\u00d3000, K.\u00d3\u00d20000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.O\u00f6\u00d4000, K.\u00d3\u00d20000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3o\u00d3000, K.\u00d3\u00d20000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f5\u00f4\u00d3000, K.\u00d3\u00d20000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3O\u00d3000, K.\u00d3\u00d20000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.O\u00d5\u00d3000, K.\u00d3\u00d20000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00f8\u00d2000, K.\u00d3\u00d20000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d5\u00d6\u00d3000, K.\u00d3\u00d20000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f8\u00d6\u00d3000, K.\u00d3\u00d20000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d40\u00d4000, K.\u00d3\u00d20000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.O\u00d2\u00d5000, K.\u00d3\u00d20000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00f5\u00d3000, K.\u00d3\u00d20000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00d4\u00d4000, K.\u00d3\u00d20000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.nullpublicnew, K.\u00d3\u00d20000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f80\u00d5000, K.\u00d3\u00d20000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f40\u00d4000, K.\u00d3\u00d20000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.O\u00f6\u00d3000, K.\u00d3\u00d20000, ""));
        return waehlbareZauber;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        if (this.\u00f4\u00d40O00 == null) {
            this.setWahlen();
        }
        return this.\u00f5\u00d40O00 < this.\u00f4\u00d40O00.size();
    }

    @Override
    public boolean hatMehrVerbilligteSonderfertigkeitAuswahl() {
        return this.istVariante(\u00d8\u00d40O00) && this.getGewaehlteVerbilligteSonderfertigkeiten().size() < 1;
    }

    public void setWahlen() {
        this.\u00f4\u00d40O00 = new ArrayList();
        if (this.istVariante(\u00d8\u00d40O00)) {
            ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
            arrayList.add(voidsuper.\u00d5O\u00d6000);
            arrayList.add(voidsuper.\u00d5o\u00d8000);
            int[] nArray = new int[]{2};
            this.\u00f4\u00d40O00.add(new o0oo_2(this, arrayList, nArray));
            arrayList = new ArrayList();
            arrayList.addAll(N.floatsuper().super(this.getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
            arrayList.remove(this.getMuttersprache());
            arrayList.remove(G.\u00d3\u00f8\u00f5000);
            int[] nArray2 = new int[]{4};
            this.\u00f4\u00d40O00.add(new o0oo_2(this, arrayList, nArray2));
        }
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Grolmensippe");
        if (this.varianteGewaehlt()) {
            stringBuffer.append(": ");
            Iterator<P> iterator = this.getGewaehlteVarianten().iterator();
            while (iterator.hasNext()) {
                stringBuffer.append(iterator.next().toString());
                if (!iterator.hasNext()) continue;
                stringBuffer.append(", ");
            }
        }
        return stringBuffer.toString();
    }

    @Override
    public void waehleVerbilligteSonderfertigkeit(for for_) {
        if (this.istVariante(\u00d8\u00d40O00)) {
            new for<String>(this.getKulturkundeBezeichnung(), while.\u00d2o\u00f5000, false);
        }
        super.getGewaehlteVerbilligteSonderfertigkeiten().add(for_);
    }

    @Override
    protected int getBasisGPKosten() {
        return 0;
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(returnnullreturn);
        this.addAlleVarianten(\u00d5\u00d40O00);
        this.addAlleVarianten(\u00d8\u00d40O00);
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(returnnullreturn);
        this.addMoeglicheVariante(\u00d5\u00d40O00);
        this.addMoeglicheVariante(\u00d8\u00d40O00);
    }
}

