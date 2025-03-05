/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.former;

import helden.framework.C.I;
import helden.framework.C.public;
import helden.framework.D.K;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.U;
import helden.framework.OoOO.interface;
import helden.framework.OoOO.voidsuper;
import helden.framework.oOoO.T;
import helden.framework.oOoO.returnsuper;
import helden.framework.oooo.a.b_0;
import helden.framework.oooo.a.oooo_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import java.util.ArrayList;

public class Former
extends helden.framework.int.N
implements helden.framework.oOoO.A.Object {
    public Former() {
        super("Former", 0);
    }

    @Override
    public int anzahlAktivierbarerZauber() {
        return 10;
    }

    @Override
    public int anzahlWaehlbareHauszauber() {
        return 4;
    }

    @Override
    public int anzahlWahlbarerLeitzauber() {
        return 3;
    }

    @Override
    public int getAnzahlVerteilAuswahlen() {
        return 1;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Meisterst\u00fcck");
        arrayList.add("hochwertiges Handwerkszeug");
        return arrayList;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Former";
        }
        return "Formerin";
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        return arrayList;
    }

    @Override
    public int getMinimalEigenschaftswert(helden.framework.oooo.b_0 b_02) {
        if (b_02.equals(helden.framework.oooo.b_0.newwhilesuper)) {
            return 10;
        }
        if (b_02.equals(helden.framework.oooo.b_0.\u00f8\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(helden.framework.oooo.b_0.O\u00f5\u00d2000)) {
            return 13;
        }
        if (b_02.equals(helden.framework.oooo.b_0.\u00f5\u00f5\u00d2000)) {
            return 5;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public T getNextLeittalentAuswahl() {
        ArrayList<voidsuper> arrayList = new ArrayList<voidsuper>();
        arrayList.add(voidsuper.forvoidObject);
        arrayList.add(voidsuper.\u00f80\u00d8000);
        arrayList.add(voidsuper.Oo\u00d6000);
        arrayList.add(voidsuper.\u00d50\u00d8000);
        arrayList.add(voidsuper.O\u00f5\u00d6000);
        arrayList.add(voidsuper.\u00d3\u00d8\u00d5000);
        arrayList.add(voidsuper.\u00d8\u00f5\u00d6000);
        arrayList.add(voidsuper.o\u00f6\u00d6000);
        arrayList.add(voidsuper.\u00d4\u00d4\u00d5000);
        arrayList.add(voidsuper.returnifObject);
        arrayList.add(voidsuper.\u00f5\u00f6\u00d5000);
        arrayList.add(voidsuper.\u00f8\u00f8\u00d6000);
        arrayList.add(voidsuper.StringfloatObject);
        arrayList.add(voidsuper.\u00d5\u00d3\u00d6000);
        arrayList.add(voidsuper.\u00f8\u00d3\u00d6000);
        arrayList.add(voidsuper.newreturnObject);
        for (voidsuper voidsuper2 : this.getProfession().getGewaehlteLeiteTalente()) {
            arrayList.remove(voidsuper2);
        }
        return new T(this.getProfession(), arrayList, 2);
    }

    @Override
    public returnsuper getNextTaPVerteilAuswahl(int n) {
        if (n == 0) {
            ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
            arrayList.add(voidsuper.forvoidObject);
            arrayList.add(voidsuper.\u00f80\u00d8000);
            arrayList.add(voidsuper.Oo\u00d6000);
            arrayList.add(voidsuper.\u00d50\u00d8000);
            arrayList.add(voidsuper.O\u00f5\u00d6000);
            arrayList.add(voidsuper.\u00d3\u00d8\u00d5000);
            arrayList.add(voidsuper.\u00d8\u00f5\u00d6000);
            arrayList.add(voidsuper.o\u00f6\u00d6000);
            arrayList.add(voidsuper.\u00d4\u00d4\u00d5000);
            arrayList.add(voidsuper.returnifObject);
            arrayList.add(voidsuper.\u00f5\u00f6\u00d5000);
            arrayList.add(voidsuper.\u00f8\u00f8\u00d6000);
            arrayList.add(voidsuper.StringfloatObject);
            arrayList.add(voidsuper.\u00d5\u00d3\u00d6000);
            arrayList.add(voidsuper.\u00f8\u00d3\u00d6000);
            arrayList.add(voidsuper.newreturnObject);
            returnsuper returnsuper2 = new returnsuper(this.getProfession(), arrayList, 25, 1, 6, 3, 7);
            returnsuper2.new("<html>max. 6 Talente (+3 bis +7 pro Talent)");
            return returnsuper2;
        }
        throw new c_1();
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(helden.framework.d.oooo_0.o00000(while.\u00d2\u00d6\u00d2000.toString()));
        arrayList.add(K.o00000(voidsuper.o\u00d3\u00d6000, "Tastsinn"));
        arrayList.add(helden.framework.d.oooo_0.o00000(while.\u00d3\u00f4O000.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(voidsuper.newnewObject, 4);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 3);
        k_02.\u00d200000(G.\u00d3\u00f4\u00f5000, 8);
        k_02.\u00d200000(voidsuper.\u00d3\u00f4\u00d5000, 5);
        return k_02;
    }

    @Override
    public ArrayList<oooo_0> getVerallgemeinteListenAuswahlen() {
        ArrayList<oooo_0> arrayList = new ArrayList<oooo_0>();
        oooo_0 oooo_02 = new oooo_0(2, this);
        arrayList.add(oooo_02);
        ArrayList<voidsuper> arrayList2 = new ArrayList<voidsuper>();
        arrayList2.addAll(N.floatsuper().\u00d600000());
        arrayList2.remove(voidsuper.\u00f5o\u00d6000);
        arrayList2.remove(voidsuper.forObjectObject);
        arrayList2.remove(voidsuper.\u00d8O\u00d8000);
        arrayList2.remove(voidsuper.\u00d4\u00d3\u00d6000);
        arrayList2.remove(voidsuper.O\u00d3\u00d6000);
        arrayList2.remove(voidsuper.o\u00f6\u00d5000);
        arrayList2.remove(voidsuper.\u00f5\u00d8\u00d5000);
        arrayList2.remove(voidsuper.ifnullObject);
        arrayList2.remove(voidsuper.privateclassObject);
        arrayList2.remove(voidsuper.\u00d8\u00d8\u00d6000);
        arrayList2.remove(voidsuper.O\u00d8\u00d5000);
        arrayList2.remove(voidsuper.ififObject);
        arrayList2.remove(voidsuper.\u00d3\u00f8\u00d6000);
        arrayList2.remove(voidsuper.\u00f4\u00d8\u00d6000);
        for (U u2 : arrayList2) {
            b_0 b_02 = new b_0(helden.framework.C.K.o00000(I.while.toString(), u2), new interface((oo0o_0)u2, null, true));
            oooo_02.o00000(b_02);
        }
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        return arrayList;
    }

    @Override
    public int getVerrechnungspunkte() {
        return 100;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00d6\u00d3000, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00f8\u00d3000, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00f8\u00d2000, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4O\u00d3000, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f8\u00f8\u00d2000, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.newfornew, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00d6\u00d4000, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f8o\u00d4000, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.o0\u00d4000, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3\u00f8\u00d3000, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3\u00f6\u00d4000, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.O\u00d2\u00d4000, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00f6\u00d3000, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00f6\u00d4000, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d40\u00d4000, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.O\u00d3\u00d4000, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f80\u00d4000, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00f5\u00d3000, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00d3\u00d4000, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00f4\u00d3000, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.o\u00d8\u00d3000, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.Stringpublicnew, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d5\u00d2\u00d3000, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4O\u00d4000, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d5\u00f8\u00d4000, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8O\u00d5000, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.iffornew, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.returnStringnew, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d5o\u00d4000, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f5\u00d5\u00d3000, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00d6\u00d3000, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00f6\u00d3000, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.oo\u00d4000, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3o\u00d4000, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d5\u00d6\u00d3000, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00f5\u00d4000, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.o\u00d5\u00d3000, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00d3\u00d3000, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f8o\u00d3000, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00d5\u00d3000, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.o\u00f6\u00d4000, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f8\u00f8\u00d3000, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00d3\u00d3000, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f8\u00d4\u00d4000, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4O\u00d5000, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00d5\u00d3000, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4o\u00d3000, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.ifnewnew, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00f6\u00d4000, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.nullsupernew, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f5\u00d6\u00d3000, helden.framework.OOoO.K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d40\u00d5000, helden.framework.OOoO.K.\u00f4o0000, ""));
        return waehlbareZauber;
    }

    @Override
    public void gewaehlterHauszauber(KonkreterZauber konkreterZauber) {
        throw new RuntimeException("Nicht implementiert");
    }

    @Override
    public void gewaehlterVorteil(public public_) {
        this.getProfession().addAutomatischerVorteil(public_);
    }

    @Override
    public void gewaehltesLeittalent(oo0o_0 oo0o_02) {
        this.getProfession().waehleLeittalent((voidsuper)oo0o_02);
    }

    @Override
    public void gewaehlteSonderfertigkeit(P p2) {
        throw new RuntimeException("Nicht implementiert");
    }

    @Override
    public void gewaehltesTalent(oo0o_0 oo0o_02, int n, helden.framework.held.K k2, boolean bl) {
        throw new RuntimeException("Nicht implementiert");
    }

    @Override
    public boolean hatMehrLeittalentAuswahl() {
        return this.getProfession().getGewaehlteLeiteTalente().size() < 2;
    }

    @Override
    public helden.framework.OOoO.K repraesenationVerrechnungspunkte() {
        return helden.framework.OOoO.K.\u00f4o0000;
    }

    @Override
    public void setzeLeittalente(ArrayList<oo0o_0> arrayList) {
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }

    @Override
    public void waehleVerbilligteSonderfertigkeit(for for_) {
        throw new RuntimeException("Nicht implementiert");
    }
}

