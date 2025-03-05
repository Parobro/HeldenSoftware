/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.lehrmeister;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.M;
import helden.framework.C.Oo0O;
import helden.framework.C.public;
import helden.framework.D.OoOO.U;
import helden.framework.D.P;
import helden.framework.D.Q;
import helden.framework.D.for;
import helden.framework.D.o0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OOoO.K;
import helden.framework.OOoO.o00O;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oOoO.void;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.o00o_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oo0o_2;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.framework.zauber.ZauberFabrik;
import helden.model.kultur.AuelfenSippe;
import helden.model.kultur.ElfischeSiedlung;
import helden.model.kultur.FirnelfenSippe;
import helden.model.kultur.SteppenelfenSippe;
import helden.model.kultur.WaldelfenSippe;
import helden.model.profession.lehrmeister.LehrmeisterBase;
import java.util.ArrayList;
import java.util.List;

public class KreisEinfuehlung
extends LehrmeisterBase {
    public KreisEinfuehlung() {
        super("Kreis der Einf\u00fchlung", "Kreis der Einf\u00fchlung", 23, false);
        this.\u00d4O\u00d2O00 = "keine";
    }

    @Override
    public void addSpracheAuswahl(G g2) {
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(g2);
        this.setZweitLehrsprache(arrayList);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 8;
    }

    @Override
    public int getAnzahlVerbilligteSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public int getAnzahlVorteilAuswahlen() {
        return 1;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Haselbusch geformter Zauberstab");
        arrayList.add("elfisches Musikinstrument");
        arrayList.add("verziertes Gewand");
        return arrayList;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(I.o\u00d8o000);
        arrayList.add(I.\u00f8\u00d4O000);
        arrayList.add(I.ooO000);
        arrayList.add(I.newnew);
        arrayList.add(I.o\u00d5O000);
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 8;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 11;
        }
        if (b_02.equals(b_0.newwhilesuper)) {
            return 13;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 13;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.returnwhilesuper)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 4;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public oo0o_2 getNextSprachAuswahl() {
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.whilewhileString);
        arrayList.add(G.\u00d5\u00f8\u00f4000);
        return new oo0o_2(this.getProfession(), arrayList, 1, "Lehrsprache");
    }

    @Override
    public int getPermanenteASP() {
        return -1;
    }

    @Override
    public K getRepraesentation(Zauber zauber) {
        if (zauber.equals(Zauber.\u00f4\u00d6\u00d3000)) {
            return K.\u00f4o0000;
        }
        return K.\u00f8O0000;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.StringwhileString.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d5\u00d2000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d6\u00f6o000.toString()));
        arrayList.add(oooo_0.o00000(while.StringthisString.toString()));
        arrayList.add(oooo_0.o00000(while.ifdoObject.toString()));
        U u2 = (U)oooo_0.o00000("Kulturkunde");
        u2.\u00d500000(new WaldelfenSippe().getKulturkundeBezeichnung());
        arrayList.add(u2);
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(voidsuper.\u00d4\u00d4\u00d5000);
                arrayList.add(voidsuper.returnifObject);
                int[] nArray = new int[]{3, 1};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(this.getZauber(Zauber.\u00d3\u00f8\u00d3000));
                arrayList.add(this.getZauber(Zauber.\u00f4\u00f4\u00d3000));
                int[] nArray = new int[]{5};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(this.getZauber(Zauber.\u00f4\u00f6\u00d4000));
                arrayList.add(this.getZauber(Zauber.\u00d50\u00d4000));
                int[] nArray = new int[]{5};
                return new m_0(arrayList, nArray);
            }
            case 3: {
                arrayList.add(this.getZauber(Zauber.\u00d4\u00f8\u00d3000));
                arrayList.add(this.getZauber(Zauber.\u00f8\u00f8\u00d2000));
                arrayList.add(this.getZauber(Zauber.newfornew));
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
            case 4: {
                arrayList.add(this.getZauber(Zauber.\u00f4\u00f8\u00d2000));
                arrayList.add(this.getZauber(Zauber.\u00d5o\u00d5000));
                int[] nArray = new int[]{4};
                return new m_0(arrayList, nArray);
            }
            case 5: {
                arrayList.add(this.getZauber(Zauber.\u00d4O\u00d3000));
                arrayList.add(this.getZauber(Zauber.O\u00d3\u00d4000));
                arrayList.add(this.getZauber(Zauber.\u00d8\u00d5\u00d3000));
                int[] nArray = new int[]{4};
                return new m_0(arrayList, nArray);
            }
            case 6: {
                arrayList.add(this.getZauber(Zauber.\u00d4\u00d6\u00d4000));
                arrayList.add(this.getZauber(Zauber.\u00d4\u00d2\u00d5000));
                int[] nArray = new int[]{4};
                return new m_0(arrayList, nArray);
            }
            case 7: {
                arrayList.add(this.getZauber(Zauber.oo\u00d4000));
                arrayList.add(this.getZauber(Zauber.\u00d4\u00f6\u00d4000));
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.o00000(E.nullsuperString, 2);
        k_02.o00000(E.\u00d3\u00d4\u00d8000, 2);
        k_02.o00000(voidsuper.ifforObject, 2);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d4\u00d2\u00d8000, 2);
        k_02.o00000(voidsuper.returnforObject, 2);
        k_02.o00000(voidsuper.returnprivateObject, 2);
        k_02.o00000(voidsuper.\u00d4\u00f8\u00d5000, 2);
        k_02.o00000(voidsuper.newnewObject, 3);
        k_02.o00000(voidsuper.o\u00d3\u00d6000, 4);
        k_02.o00000(voidsuper.\u00d4\u00d8\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d8\u00d5\u00d6000, 3);
        k_02.o00000(voidsuper.thisinterfaceObject, 4);
        k_02.o00000(voidsuper.StringclassObject, 2);
        k_02.o00000(voidsuper.\u00f8\u00d8\u00d5000, 3);
        k_02.o00000(voidsuper.\u00d5\u00d6\u00d5000, 3);
        k_02.o00000(voidsuper.\u00f80\u00d6000, 2);
        k_02.o00000(voidsuper.StringvoidObject, 3);
        k_02.o00000(voidsuper.\u00d40\u00d8000, 3);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d6000, 3);
        k_02.o00000(voidsuper.nullObjectObject, 1);
        k_02.o00000(voidsuper.oo\u00d6000, 1);
        k_02.o00000(voidsuper.\u00f5\u00f5\u00d5000, 3);
        k_02.o00000(voidsuper.o\u00d5\u00d6000, 4);
        k_02.o00000(voidsuper.thisintObject, 2);
        k_02.o00000(voidsuper.\u00f5\u00d2\u00d6000, 4);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d5000, 3);
        k_02.o00000(voidsuper.\u00d3\u00d6\u00d5000, 2);
        k_02.o00000(voidsuper.\u00d4\u00f6\u00d6000, 4);
        k_02.o00000(G.\u00f50\u00f5000, 4);
        k_02.o00000(G.\u00d8\u00d8\u00f5000, 4);
        k_02.o00000(G.\u00d3\u00f4\u00f5000, 4);
        if (this.getZweitLehrsprache() != null && this.getZweitLehrsprache().size() > 0 && this.getZweitLehrsprache().get(0).equals(G.whilewhileString)) {
            k_02.o00000(G.\u00d5\u00f8\u00f4000, 4);
        } else {
            k_02.o00000(G.whilewhileString, 4);
        }
        k_02.o00000(voidsuper.\u00d5\u00d5\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d3\u00d8\u00d5000, 4);
        k_02.o00000(voidsuper.o\u00f6\u00d6000, 3);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d5000, 4);
        k_02.o00000(voidsuper.privateObjectObject, 3);
        k_02.o00000(this.getZauber(Zauber.\u00d40\u00d4000), 5);
        k_02.o00000(this.getZauber(Zauber.\u00f4O\u00d4000), 7);
        k_02.o00000(this.getZauber(Zauber.\u00f8\u00f8\u00d3000), 6);
        k_02.o00000(this.getZauber(Zauber.\u00d4o\u00d3000), 5);
        k_02.o00000(this.getZauber(Zauber.ifnewnew), 7);
        k_02.o00000(this.getZauber(Zauber.\u00f8o\u00d4000), 3);
        k_02.o00000(this.getZauber(Zauber.Stringpublicnew), 5);
        k_02.o00000(this.getZauber(Zauber.\u00f4\u00d6\u00d3000), 2);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00d4oo000);
        arrayList.add(I.\u00d8\u00f60000);
        arrayList.add(I.\u00f8\u00d2o000);
        arrayList.add(I.privateclass);
        arrayList.add(I.o\u00f8O000);
        arrayList.add(I.\u00d3\u00d3O000);
        arrayList.add(I.O\u00d5o000);
        arrayList.add(I.thisfloat);
        return arrayList;
    }

    @Override
    public void getVerbilligteSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<for> arrayList = new ArrayList<for>();
                U u2 = (U)oooo_0.o00000("Kulturkunde");
                u2.\u00d500000(new AuelfenSippe().getKulturkundeBezeichnung());
                u2.\u00d500000(new ElfischeSiedlung().getKulturkundeBezeichnung());
                u2.\u00d500000(new FirnelfenSippe().getKulturkundeBezeichnung());
                u2.\u00d500000(new SteppenelfenSippe().getKulturkundeBezeichnung());
                List list = u2.o\u00d40000();
                for (Q q : list) {
                    for<String> for_ = new for<String>(while.\u00d2o\u00f5000, false);
                    for_.add(((o0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)q.\u00d8\u00d30000()).new());
                    arrayList.add(for_);
                }
                return new void(this.getProfession(), arrayList, 1);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.o\u00d6\u00d4000));
        arrayList.add(new for(while.oo\u00f6000));
        arrayList.add(new for(while.\u00f8\u00d5\u00d6000));
        arrayList.add(new for(while.\u00f6\u00d5\u00d6000));
        arrayList.add(new for(while.fornullsuper));
        return arrayList;
    }

    @Override
    public o00o_0 getVorteilAuswahl(int n) {
        ArrayList<public> arrayList = new ArrayList<public>(2);
        arrayList.add(helden.framework.C.K.o00000(I.o\u00d5O000, "Geld/Besitz", 5));
        arrayList.add(helden.framework.C.K.o00000(I.o\u00d5O000, "G\u00f6tter/Religion", 5));
        arrayList.add(helden.framework.C.K.o00000(I.o\u00d5O000, "Adel/Hierarchien", 5));
        return new o00o_0(this.getProfession(), arrayList, 1);
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.forsupersuper));
        J j2 = (J)helden.framework.C.K.o00000(I.\u00d50o000);
        j2.oO0000(5);
        oo0O.\u00d300000(j2);
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00d5oo000, "verantwortungsbewusstes Handeln, Verst\u00e4ndigung fordern, Natur und Leben sch\u00fctzen", 6));
        J j3 = (J)helden.framework.C.K.o00000(I.newnew);
        j3.oO0000(6);
        oo0O.\u00d300000(j3);
        M m = (M)helden.framework.C.K.o00000(I.O\u00d4O000);
        m.\u00d2o0000();
        m.o00000(o00O.\u00f8\u00d20000);
        oo0O.\u00d300000(m);
        return oo0O;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.addAll(ZauberFabrik.getInstance().mindestVerbreitung(5, K.\u00f8O0000, this.getSetting()));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.o0\u00d4000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3\u00f6\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f80\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.o\u00d8\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d5\u00f8\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00f6\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f5\u00d6\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.addAll(ZauberFabrik.getInstance().mindestVerbreitung(2, K.\u00f8O0000, K.if, this.getSetting()));
        waehlbareZauber.addAll(ZauberFabrik.getInstance().mindestVerbreitung(2, K.\u00f8O0000, K.\u00f800000, this.getSetting()));
        waehlbareZauber.removeAll(ZauberFabrik.getInstance().mindestVerbreitungDaemonisch(0, K.\u00f8O0000, this.getSetting()));
        waehlbareZauber.removeAll(ZauberFabrik.getInstance().mindestVerbreitung(0, K.\u00f8O0000, o00O.\u00d2O0000, this.getSetting()));
        return waehlbareZauber;
    }

    @Override
    public boolean hatMehrSprachenAuswahl() {
        return this.getZweitLehrsprache() == null;
    }

    @Override
    public boolean istZweitLehrspracheGewaehlt() {
        return true;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        if (this.getProfession().istTalentGewaehlt(this.getZauber(Zauber.\u00d3\u00f8\u00d3000))) {
            arrayList.add(this.getZauber(Zauber.\u00d3\u00f8\u00d3000));
        } else {
            arrayList.add(this.getZauber(Zauber.\u00f4\u00f4\u00d3000));
        }
        if (this.getProfession().istTalentGewaehlt(this.getZauber(Zauber.\u00f4\u00f6\u00d4000))) {
            arrayList.add(this.getZauber(Zauber.\u00f4\u00f6\u00d4000));
        } else {
            arrayList.add(this.getZauber(Zauber.\u00d50\u00d4000));
        }
        arrayList.add(this.getZauber(Zauber.\u00d40\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00f4O\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00f8\u00f8\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00d4o\u00d3000));
        arrayList.add(this.getZauber(Zauber.ifnewnew));
    }

    @Override
    public String toString() {
        return "Kreis der Einf\u00fchlung";
    }
}

