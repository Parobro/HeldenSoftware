/*
 * Decompiled with CFR 0.152.
 */
package helden.model.kultur;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.Oo0O;
import helden.framework.C.public;
import helden.framework.D.OOOo;
import helden.framework.D.OoOO.U;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OOoO.K;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.L;
import helden.framework.int.OooO;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.framework.oOoO.for;
import helden.framework.oOoO.returnsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.o00o_0;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oo0o_2;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.model.profession.Bader;
import helden.model.profession.Barde;
import helden.model.profession.Bauer;
import helden.model.profession.Bewahrer;
import helden.model.profession.Botenreiter;
import helden.model.profession.Edelhandwerker;
import helden.model.profession.Einbrecher;
import helden.model.profession.Fischer;
import helden.model.profession.Former;
import helden.model.profession.Gaukler;
import helden.model.profession.Grosswildjaeger;
import helden.model.profession.Haendler;
import helden.model.profession.Handwerker;
import helden.model.profession.Hirte;
import helden.model.profession.Hofkuenstler;
import helden.model.profession.Kaempfer;
import helden.model.profession.Karawanenfuehrer;
import helden.model.profession.Kundschafter;
import helden.model.profession.Kurtisane;
import helden.model.profession.Legendensaenger;
import helden.model.profession.Prospektor;
import helden.model.profession.Schiffer;
import helden.model.profession.Schmuggler;
import helden.model.profession.Seefahrer;
import helden.model.profession.Taugenichts;
import helden.model.profession.Tierbaendiger;
import helden.model.profession.Wildnislaeufer;
import helden.model.profession.Wundarzt;
import helden.model.profession.Zauberweber;
import java.util.ArrayList;
import java.util.Iterator;

public class ElfischeSiedlung
extends OooO
implements for {
    public static final P whileprivateclass = new P("Elfische Siedlung", 0, false);
    public static final P ifprivateclass = new P("S\u00fcdliche Mittellande (Almada, Garetien)", 1, false);
    public static final P \u00d4\u00d3\u00f8000 = new P("Gro\u00dfstadt (Lowangen, Punin)", -1, false);
    public static final P \u00f8\u00d2\u00f8000 = new P("Firnelfisch beeinflusste Siedlung (Olport, Keamonmund)", 1, false);
    public static final P \u00d5\u00d3\u00f8000 = new P("Waldelfisch beeinflusste Siedlung (Donnerbach, Gerasim, Kvirasim)", 2, false);
    public static final P \u00f5\u00d2\u00f8000 = new P("verweltlicht", 5, true);
    private int o\u00d3\u00f8000 = 0;
    private int O\u00d3\u00f8000 = 0;
    private public \u00d3\u00d3\u00f8000;

    public ElfischeSiedlung() {
    }

    public ElfischeSiedlung(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void addAutomatischerVorteil(public public_) {
        this.\u00d3\u00d3\u00f8000 = public_;
    }

    @Override
    public void addSpracheAuswahl(G g2) {
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(g2);
        this.setZweitLehrsprache(arrayList);
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
        this.setTalentwert(E.\u00d3\u00d6\u00d8000, 3);
        this.setTalentwert(E.nullsuperString, 2);
        this.setTalentwert(E.\u00f4\u00d6\u00d8000, 1);
        this.setTalentwert(voidsuper.ifforObject, 1);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d4\u00d2\u00d8000, 1);
        this.setTalentwert(voidsuper.returnforObject, 1);
        this.setTalentwert(voidsuper.returnprivateObject, 2);
        this.setTalentwert(voidsuper.thisvoidObject, 2);
        this.setTalentwert(voidsuper.newnewObject, 2);
        this.setTalentwert(voidsuper.\u00d4\u00d8\u00d6000, 2);
        this.setTalentwert(voidsuper.\u00d5\u00d5\u00d5000, 3);
        this.setTalentwert(voidsuper.thisinterfaceObject, 1);
        this.setTalentwert(voidsuper.\u00d30\u00d8000, 1);
        this.setTalentwert(voidsuper.\u00f8\u00d8\u00d5000, 2);
        this.setTalentwert(voidsuper.\u00f80\u00d6000, 1);
        this.setTalentwert(voidsuper.\u00d3\u00f4\u00d6000, 3);
        this.setTalentwert(voidsuper.\u00f5\u00f5\u00d5000, 3);
        this.setTalentwert(voidsuper.o\u00d5\u00d6000, 2);
        this.setTalentwert(voidsuper.\u00f4\u00d2\u00d6000, -1);
        this.setTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 2);
        this.setTalentwert(voidsuper.\u00d4\u00f6\u00d6000, 2);
        this.setTalentwert(voidsuper.\u00d3\u00d8\u00d5000, 2);
        this.setTalentwert(voidsuper.\u00d4\u00d4\u00d5000, 2);
        this.setTalentwert(voidsuper.privateObjectObject, 3);
        this.setTalentwert(voidsuper.returnifObject, 2);
        if (this.istVariante(ifprivateclass)) {
            this.addTalentwert(E.\u00d3\u00d6\u00d8000, -1);
            this.addTalentwert(voidsuper.\u00f8\u00d8\u00d5000, -1);
            this.addTalentwert(voidsuper.\u00f80\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00d3\u00f4\u00d6000, -1);
            this.addTalentwert(voidsuper.o\u00d5\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 1);
            this.addTalentwert(voidsuper.\u00d5\u00d2\u00d6000, 2);
        }
        if (this.istVariante(\u00d4\u00d3\u00f8000)) {
            this.addTalentwert(E.\u00d3\u00d6\u00d8000, -2);
            this.addTalentwert(voidsuper.returnprivateObject, -2);
            this.addTalentwert(voidsuper.\u00d30\u00d8000, 1);
            this.addTalentwert(voidsuper.\u00f8\u00d8\u00d5000, -1);
            this.addTalentwert(voidsuper.\u00d3\u00f4\u00d6000, -2);
            this.addTalentwert(voidsuper.\u00f4\u00d2\u00d6000, 2);
            this.addTalentwert(voidsuper.o\u00f6\u00d6000, 1);
        }
        if (this.istVariante(\u00f8\u00d2\u00f8000)) {
            this.addTalentwert(voidsuper.returnprivateObject, -1);
            this.addTalentwert(voidsuper.\u00d8\u00d3\u00d8000, 1);
            this.addTalentwert(voidsuper.\u00d5\u00d5\u00d5000, -2);
            this.addTalentwert(voidsuper.\u00f80\u00d6000, 1);
            this.addTalentwert(voidsuper.\u00d40\u00d8000, 1);
        }
        if (this.istVariante(\u00d5\u00d3\u00f8000)) {
            this.addTalentwert(voidsuper.\u00f8\u00f4\u00d6000, 1);
        }
    }

    @Override
    public ArrayList<P> getAlleZusatzVarianten() {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(\u00f5\u00d2\u00f8000);
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f800000);
        arrayList.add(I.\u00f5\u00f60000);
        arrayList.add(I.privateclasssuper);
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
        return "K12";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Auelfen";
    }

    @Override
    public int getMaximalSozialstatus() {
        return 10;
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
    public oo0o_2 getNextSprachAuswahl() {
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.whilewhileString);
        arrayList.add(G.newwhileString);
        arrayList.add(G.\u00f8\u00f6\u00f5000);
        arrayList.add(G.nullsuperclass);
        arrayList.add(G.\u00d8\u00d3\u00f5000);
        arrayList.add(G.\u00d3\u00d4\u00f5000);
        return new oo0o_2(this, arrayList, 1, "Zweitsprache");
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.o\u00d3\u00f8000) {
            case 0: {
                arrayList.add(E.\u00d4\u00d5\u00d8000);
                arrayList.add(E.\u00f4\u00d4\u00d8000);
                arrayList.add(E.thissuperString);
                arrayList.add(E.o\u00d6\u00d8000);
                arrayList.add(E.\u00d3\u00d4\u00d8000);
                int[] nArray = new int[]{2};
                ++this.o\u00d3\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 1: {
                arrayList.addAll(N.floatsuper().super(this.getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                int[] nArray = new int[]{3};
                ++this.o\u00d3\u00f8000;
                if (!this.istVariante(ifprivateclass)) {
                    ++this.o\u00d3\u00f8000;
                }
                return new o0oo_2(this, arrayList, nArray);
            }
            case 2: {
                arrayList.add(G.\u00f50\u00f5000);
                arrayList.add(G.\u00d3\u00f4\u00f5000);
                int[] nArray = new int[]{4};
                ++this.o\u00d3\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public returnsuper getNextTaPVerteilAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.O\u00d3\u00f8000) {
            case 0: {
                arrayList.add(voidsuper.\u00d8\u00d5\u00d5000);
                arrayList.add(voidsuper.forvoidObject);
                arrayList.add(voidsuper.thisclassObject);
                arrayList.add(voidsuper.\u00f4\u00d5\u00d6000);
                arrayList.add(voidsuper.\u00d5\u00d5\u00d6000);
                arrayList.add(voidsuper.\u00d3\u00f4\u00d5000);
                ++this.O\u00d3\u00f8000;
                return new returnsuper(this, arrayList, 6, 2, 0, 6);
            }
        }
        throw new c_1();
    }

    @Override
    public o00o_0 getNextVorteilAuswahl() {
        if (this.\u00d3\u00d3\u00f8000 == null) {
            ArrayList<public> arrayList = new ArrayList<public>();
            arrayList.add(helden.framework.C.K.o00000(I.o\u00d5O000, "G\u00f6tter/Religion", 6));
            arrayList.add(helden.framework.C.K.o00000(I.o\u00d5O000, "Adel/Hierarchien", 6));
            arrayList.add(helden.framework.C.K.o00000(I.o\u00d5O000, "Geld/Besitz", 6));
            return new o00o_0(this, arrayList, 1);
        }
        throw new c_1();
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        L l2;
        ArrayList<super> arrayList = new ArrayList<super>();
        arrayList.add(new Bewahrer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Former(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        Kaempfer kaempfer = new Kaempfer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        kaempfer.removeMoeglicheVariante(kaempfer.getSteppenelfischerKaempfer());
        arrayList.add(kaempfer);
        arrayList.add(new Legendensaenger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        Zauberweber zauberweber = new Zauberweber(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        zauberweber.addMoeglicheVariante(zauberweber.getBeschuetzer());
        arrayList.add(zauberweber);
        Wildnislaeufer wildnislaeufer = new Wildnislaeufer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        wildnislaeufer.removeMoeglicheVariante(wildnislaeufer.getSteppenreiter());
        arrayList.add(wildnislaeufer);
        arrayList.add(new Botenreiter(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Fischer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Grosswildjaeger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Hirte(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Karawanenfuehrer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Kundschafter(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        Prospektor prospektor = new Prospektor(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        prospektor.clearMoeglicheVarianten();
        prospektor.addMoeglicheVariante(prospektor.getKraeutersammler());
        arrayList.add(prospektor);
        Schiffer schiffer = new Schiffer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        schiffer.clearMoeglicheVarianten();
        schiffer.addMoeglicheVariante(schiffer.getLotse());
        arrayList.add(schiffer);
        arrayList.add(new Schmuggler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Barde(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Gaukler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Hofkuenstler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Taugenichts(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Bauer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Tierbaendiger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Handwerker(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Wundarzt(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        if (this.istVariante(\u00d4\u00d3\u00f8000)) {
            l2 = new Einbrecher(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
            l2.removeMoeglicheVariante(((Einbrecher)l2).getGrabraeuber());
            arrayList.add(l2);
            Haendler haendler = new Haendler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
            haendler.clearMoeglicheVarianten();
            haendler.addMoeglicheVariante(haendler.getKraemer());
            arrayList.add(haendler);
            arrayList.add(new Kurtisane(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
            arrayList.add(new Bader(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
            Edelhandwerker edelhandwerker = new Edelhandwerker(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
            edelhandwerker.clearMoeglicheVarianten();
            edelhandwerker.addMoeglicheVariante(edelhandwerker.getApothekarius());
            arrayList.add(edelhandwerker);
        }
        if (this.istVariante(\u00f8\u00d2\u00f8000)) {
            arrayList.remove(new Bauer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
            arrayList.remove(new Botenreiter(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
            arrayList.remove(new Gaukler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
            arrayList.remove(new Hirte(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
            arrayList.remove(new Hofkuenstler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
            arrayList.remove(new Taugenichts(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
            l2 = new Seefahrer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
            l2.clearMoeglicheVarianten();
            l2.addMoeglicheVariante(((Seefahrer)l2).getWalfaenger());
            arrayList.add(l2);
        }
        if (this.istVariante(\u00d5\u00d3\u00f8000)) {
            arrayList.remove(new Hirte(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
            arrayList.remove(new Hofkuenstler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
            arrayList.remove(new Taugenichts(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        }
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
        oOOo.o00000(oooo_0.o00000(while.fornullsuper.toString()));
        oOOo.o00000(oooo_0.o00000(while.privatenullObject.toString()));
        oOOo.o00000(oooo_0.o00000(while.\u00d2\u00f5\u00d8000.toString()));
        if (!this.istVariante(\u00f5\u00d2\u00f8000)) {
            oOOo.o00000(oooo_0.o00000(while.StringthisString.toString()));
        }
        return oOOo;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.privateclass);
        arrayList.add(I.\u00d40O000);
        arrayList.add(I.\u00d3\u00f4O000);
        return arrayList;
    }

    public ArrayList<helden.framework.D.for> getVerbilligteSonderfertigkeiten() {
        ArrayList<helden.framework.D.for> arrayList = new ArrayList<helden.framework.D.for>();
        if (!this.istVariante(\u00f5\u00d2\u00f8000)) {
            arrayList.add(new helden.framework.D.for(while.\u00f8\u00d5\u00d6000));
        }
        return arrayList;
    }

    @Override
    public int getVerrechnungspunkte() {
        return 100;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        if (!this.istVariante(\u00f5\u00d2\u00f8000)) {
            oo0O.\u00d300000(helden.framework.C.K.o00000(I.newreturn));
        }
        if (!this.istVariante(\u00d5\u00d3\u00f8000)) {
            J j2 = (J)helden.framework.C.K.o00000(I.\u00d50o000);
            j2.oO0000(5);
            oo0O.\u00d300000(j2);
        }
        oo0O.\u00d300000(this.\u00d3\u00d3\u00f8000);
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
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.iffornew, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.O\u00d2\u00d5000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.ifprivatesuper, K.\u00f4o0000, ""));
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
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d30\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d40\u00d5000, K.\u00f4o0000, ""));
        if (this.istVariante(\u00d5\u00d3\u00f8000)) {
            waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3O\u00d5000, K.\u00f4o0000, ""));
            waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.StringObjectnew, K.\u00f4o0000, ""));
            waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.O\u00d8\u00d4000, K.\u00f4o0000, ""));
            waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.o\u00d5\u00d4000, K.\u00f4o0000, ""));
            waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.O\u00d5\u00d4000, K.\u00f4o0000, ""));
            waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8o\u00d4000, K.\u00f4o0000, ""));
            waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.thisObjectnew, K.\u00f4o0000, ""));
        }
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00f5\u00d3000, K.\u00f4o0000, ""));
        return waehlbareZauber;
    }

    @Override
    public ArrayList<ArrayList<P>> getZusatzVarianten(P p2) {
        ArrayList<ArrayList<P>> arrayList = new ArrayList<ArrayList<P>>();
        arrayList.add(this.getAlleZusatzVarianten());
        return arrayList;
    }

    @Override
    public boolean hatMehrSprachenAuswahl() {
        return this.getZweitLehrsprache().size() == 0;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        return this.o\u00d3\u00f8000 < 3;
    }

    @Override
    public boolean hatMehrTaPVerteilAuswahl() {
        return this.O\u00d3\u00f8000 < 1;
    }

    @Override
    public boolean hatMehrVorteilAuswahl() {
        return this.\u00d3\u00d3\u00f8000 == null;
    }

    @Override
    public boolean istMutterschriftGewaehlt() {
        return true;
    }

    @Override
    public boolean istZweitLehrspracheGewaehlt() {
        return true;
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
        arrayList.add(voidsuper.returnprivateObject);
        arrayList.add(voidsuper.\u00f80\u00d6000);
        if (this.istVariante(ifprivateclass)) {
            arrayList.add(voidsuper.o\u00d5\u00d6000);
        } else {
            arrayList.add(voidsuper.\u00d3\u00f4\u00d6000);
        }
        if (this.getZweitLehrsprache() != null && this.getZweitLehrsprache().size() > 0) {
            arrayList.add(this.getZweitLehrsprache().get(0));
        }
        arrayList.add(voidsuper.\u00d3\u00d8\u00d5000);
        if (this.istTalentGewaehlt(voidsuper.\u00d8\u00d5\u00d5000)) {
            arrayList.add(voidsuper.\u00d8\u00d5\u00d5000);
        }
        if (this.istTalentGewaehlt(voidsuper.forvoidObject)) {
            arrayList.add(voidsuper.forvoidObject);
        }
        if (this.istTalentGewaehlt(voidsuper.thisclassObject)) {
            arrayList.add(voidsuper.thisclassObject);
        }
        if (this.istTalentGewaehlt(voidsuper.\u00f4\u00d5\u00d6000)) {
            arrayList.add(voidsuper.\u00f4\u00d5\u00d6000);
        }
        if (this.istTalentGewaehlt(voidsuper.\u00d5\u00d5\u00d6000)) {
            arrayList.add(voidsuper.\u00d5\u00d5\u00d6000);
        }
        if (this.istTalentGewaehlt(voidsuper.\u00d3\u00f4\u00d5000)) {
            arrayList.add(voidsuper.\u00d3\u00f4\u00d5000);
        }
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Elfische Siedlung");
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
    protected int getBasisGPKosten() {
        return 3;
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(whileprivateclass);
        this.addAlleVarianten(ifprivateclass);
        this.addAlleVarianten(\u00d4\u00d3\u00f8000);
        this.addAlleVarianten(\u00f8\u00d2\u00f8000);
        this.addAlleVarianten(\u00d5\u00d3\u00f8000);
    }

    @Override
    protected void setzeModifikationen() {
        if (this.istVariante(\u00f5\u00d2\u00f8000)) {
            this.putModifikator(b_0.\u00f4\u00f5\u00d2000, -3);
            this.putModifikator(b_0.\u00d8\u00f5\u00d2000, -1);
        }
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(whileprivateclass);
        this.addMoeglicheVariante(ifprivateclass);
        this.addMoeglicheVariante(\u00d4\u00d3\u00f8000);
        this.addMoeglicheVariante(\u00f8\u00d2\u00f8000);
        this.addMoeglicheVariante(\u00d5\u00d3\u00f8000);
    }
}

