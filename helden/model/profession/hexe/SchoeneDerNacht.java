/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.hexe;

import helden.framework.C.I;
import helden.framework.C.public;
import helden.framework.D.OOOo;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OOoO.K;
import helden.framework.OoOO.E;
import helden.framework.OoOO.N;
import helden.framework.OoOO.interface;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.a.b_0;
import helden.framework.oooo.a.oooo_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.model.profession.hexe.BasisHexe;
import java.util.ArrayList;

public class SchoeneDerNacht
extends BasisHexe
implements helden.framework.oOoO.A.Object {
    public SchoeneDerNacht() {
        super("Sch\u00f6ne der Nacht", 18);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 2;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Kunstfertiger Schmuck");
        arrayList.add("Kostbarer Degen");
        arrayList.add("Edles Tanzgewand");
        return arrayList;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Sch\u00f6ne der Nacht";
        }
        return "Sch\u00f6ne der Nacht";
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(I.whilenewsuper);
        arrayList.add(I.returnStringsuper);
        return arrayList;
    }

    @Override
    public ArrayList<for> getGewaehlteVerbilligteSonderfertigkeiten() {
        OOOo oOOo = this.getProfession().getGewaehlteSonderfertigkeiten();
        ArrayList<for> arrayList = new ArrayList<for>();
        if (oOOo.\u00d200000(while.\u00d8\u00f5\u00d8000.toString())) {
            arrayList.add(new for(while.\u00d8\u00d20000));
        }
        if (oOOo.\u00d200000(while.\u00d8\u00d20000.toString())) {
            arrayList.add(new for(while.\u00d8\u00f5\u00d8000));
        }
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 10;
    }

    @Override
    public int getMinimalEigenschaftswert(helden.framework.oooo.b_0 b_02) {
        if (b_02.equals(helden.framework.oooo.b_0.whilewhilesuper)) {
            return 11;
        }
        if (b_02.equals(helden.framework.oooo.b_0.\u00f8\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(helden.framework.oooo.b_0.\u00d5\u00f4\u00d2000)) {
            return 13;
        }
        if (b_02.equals(helden.framework.oooo.b_0.\u00f5\u00f5\u00d2000)) {
            return 6;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public K getRepraesentation(Zauber zauber) {
        return K.if;
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(helden.framework.d.oooo_0.o00000(while.\u00d8\u00f5\u00d8000.toString()));
                arrayList.add(helden.framework.d.oooo_0.o00000(while.\u00d8\u00d20000.toString()));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
        }
        throw new c_1();
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(E.nullsuperString);
                arrayList.add(E.\u00d4\u00d5\u00d8000);
                arrayList.add(E.\u00f4\u00d4\u00d8000);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
                int[] nArray = new int[]{5};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.o00000(E.nullsuperString);
        k_02.\u00d200000(E.\u00f4\u00d6\u00d8000, 2);
        k_02.\u00d200000(E.newnewString, 2);
        k_02.\u00d200000(voidsuper.\u00f8\u00f4\u00d6000, 2);
        k_02.\u00d200000(voidsuper.returnforObject, 4);
        k_02.\u00d200000(voidsuper.thisvoidObject, 3);
        k_02.\u00d200000(voidsuper.o\u00d3\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d4\u00d8\u00d6000, 2);
        k_02.\u00d200000(voidsuper.\u00d5\u00d5\u00d5000, 3);
        k_02.\u00d200000(voidsuper.O0\u00d6000, 2);
        k_02.\u00d200000(voidsuper.O\u00f6\u00d5000, 2);
        k_02.\u00d200000(voidsuper.thisinterfaceObject, 2);
        k_02.\u00d200000(voidsuper.forclassObject, 4);
        k_02.\u00d200000(voidsuper.\u00d30\u00d8000, 2);
        k_02.o00000(voidsuper.StringvoidObject);
        k_02.o00000(voidsuper.\u00d40\u00d8000);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d6000);
        k_02.\u00d200000(voidsuper.\u00f4\u00d2\u00d6000, 1);
        k_02.\u00d200000(voidsuper.O\u00f4\u00d5000, 2);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f5\u00f4\u00d3000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d3\u00d3\u00d3000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.StringObjectnew), 5);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f4O\u00d3000), 7);
        k_02.\u00d200000(this.getZauber(Zauber.O\u00d3\u00d5000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d3\u00d2\u00d4000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.O\u00f6\u00d3000), 5);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d3\u00f8\u00d3000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d40\u00d4000), 2);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d8\u00f5\u00d3000), 2);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d8\u00d3\u00d4000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d3O\u00d3000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.\u00f4\u00d2\u00d3000), 2);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d5\u00f4\u00d3000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.O\u00d5\u00d3000), 2);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d8\u00f5\u00d4000), 3);
        k_02.\u00d200000(this.getZauber(Zauber.o\u00f5\u00d4000), 2);
        k_02.\u00d200000(this.getZauber(Zauber.\u00d5\u00f5\u00d4000), 5);
        return k_02;
    }

    @Override
    public ArrayList<oooo_0> getVerallgemeinteListenAuswahlen() {
        oooo_0 oooo_02 = new oooo_0();
        b_0 b_02 = new b_0();
        b_02.o00000(new interface(this.getProfession().getMuttersprachenSchrift(), 4));
        oooo_02.o00000(b_02);
        for (voidsuper voidsuper2 : N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000)) {
            b_02 = new b_0();
            b_02.o00000(new interface(voidsuper2, 3));
            oooo_02.o00000(b_02);
        }
        oooo_02.o00000(1);
        oooo_02.o00000(this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(oooo_02);
        return arrayList;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3o\u00d3000, K.if, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.thisinterfacenew, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4O\u00d5000, K.if, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.Stringvoidnew, K.if, ""));
        return waehlbareZauber;
    }

    @Override
    public void gewaehlterHauszauber(KonkreterZauber konkreterZauber) {
        throw new RuntimeException("Auswahlfehler");
    }

    @Override
    public void gewaehlterVorteil(public public_) {
        throw new RuntimeException("Auswahlfehler");
    }

    @Override
    public void gewaehltesLeittalent(oo0o_0 oo0o_02) {
        throw new RuntimeException("Nicht implementiert");
    }

    @Override
    public void gewaehlteSonderfertigkeit(P p2) {
        throw new RuntimeException("Auswahlfehler");
    }

    @Override
    public void gewaehltesTalent(oo0o_0 oo0o_02, int n, helden.framework.held.K k2, boolean bl) {
        k2.\u00f8O0000().\u00d300000((voidsuper)oo0o_02, n);
        this.setTalentauswahl(oo0o_02, n);
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        arrayList.add(this.getZauber(Zauber.\u00f5\u00f4\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00d3\u00d3\u00d3000));
        arrayList.add(this.getZauber(Zauber.StringObjectnew));
        arrayList.add(this.getZauber(Zauber.\u00f4O\u00d3000));
        arrayList.add(this.getZauber(Zauber.O\u00d3\u00d5000));
        arrayList.add(this.getZauber(Zauber.\u00d3\u00d2\u00d4000));
        arrayList.add(this.getZauber(Zauber.O\u00f6\u00d3000));
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }

    @Override
    public void waehleVerbilligteSonderfertigkeit(for for_) {
        throw new RuntimeException("Auswahlfehler");
    }
}

