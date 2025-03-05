/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.schelm;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.M;
import helden.framework.C.Oo0O;
import helden.framework.D.K;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OOoO.o00O;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.int.N;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.framework.zauber.ZauberFabrik;
import java.util.ArrayList;

public class StandartSchelm
extends N {
    public StandartSchelm(String string, int n) {
        super(string, n);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 1;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich()) {
            return "Schelm";
        }
        return "Schelmin";
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(I.\u00f5O0000);
        arrayList.add(I.O\u00f60000);
        arrayList.add(I.\u00d4\u00f8o000);
        arrayList.add(I.\u00d4\u00d60000);
        arrayList.add(I.whilereturnsuper);
        arrayList.add(I.forclasssuper);
        arrayList.add(I.\u00d4OO000);
        arrayList.add(I.\u00f8\u00d5O000);
        arrayList.add(I.\u00f4\u00f5o000);
        arrayList.add(I.\u00d8\u00f8O000);
        arrayList.add(I.whileStringsuper);
        arrayList.add(I.o\u00d3o000);
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 7;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 13;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 13;
        }
        if (b_02.equals(b_0.\u00f4\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 2;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = new k_0<b_0>();
        k_02.o00000(b_0.\u00d8\u00f5\u00d2000, 2);
        return k_02;
    }

    @Override
    public helden.framework.OOoO.K getRepraesentation(Zauber zauber) {
        return helden.framework.OOoO.K.\u00d8o0000;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00d5o\u00d3000.toString()));
        arrayList.add(K.o00000(voidsuper.returnwhileObject, "Bauchreden"));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(this.getZauber(Zauber.returnprivatenew));
                arrayList.add(this.getZauber(Zauber.whileprivatesuper));
                arrayList.add(this.getZauber(Zauber.\u00d8\u00d2\u00d4000));
                int[] nArray = new int[]{6, 3};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.o00000(G.privatesuperclass, n - 2);
        k_02.o00000(E.\u00f4\u00d6\u00d8000, 3);
        k_02.o00000(E.newnewString, 2);
        k_02.o00000(E.\u00d5\u00d6\u00d8000, 2);
        k_02.o00000(voidsuper.o\u00d2\u00d8000, 5);
        k_02.o00000(voidsuper.OO\u00d6000, 5);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d6000, 4);
        k_02.o00000(voidsuper.\u00d4\u00d2\u00d8000, 4);
        k_02.o00000(voidsuper.returnforObject, 3);
        k_02.o00000(voidsuper.\u00d4\u00f8\u00d5000, 2);
        k_02.o00000(voidsuper.thisvoidObject, 5);
        k_02.o00000(voidsuper.newnewObject, 2);
        k_02.o00000(voidsuper.returnwhileObject, 7);
        k_02.o00000(voidsuper.\u00d4\u00d8\u00d6000, 2);
        k_02.o00000(voidsuper.forclassObject, 4);
        k_02.o00000(voidsuper.\u00d30\u00d8000, 5);
        k_02.o00000(voidsuper.\u00d5\u00f6\u00d5000, 2);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d6000, 1);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d5000, 3);
        k_02.o00000(voidsuper.\u00d5\u00d5\u00d6000, 1);
        k_02.o00000(voidsuper.privateObjectObject, 3);
        k_02.o00000(voidsuper.returnifObject, 1);
        k_02.o00000(this.getZauber(Zauber.whilethisnew), 7);
        k_02.o00000(this.getZauber(Zauber.\u00d4\u00f8\u00d2000), 6);
        k_02.o00000(this.getZauber(Zauber.thisdonew), 7);
        k_02.o00000(this.getZauber(Zauber.O\u00d3\u00d3000), 6);
        k_02.o00000(this.getZauber(Zauber.\u00d40\u00d3000), 6);
        k_02.o00000(this.getZauber(Zauber.\u00f5\u00f8\u00d2000), 5);
        k_02.o00000(this.getZauber(Zauber.\u00d5\u00d6\u00d4000), 5);
        k_02.o00000(this.getZauber(Zauber.\u00d4\u00d2\u00d4000), 5);
        k_02.o00000(this.getZauber(Zauber.privateinterfacesuper), 3);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.whilethissuper);
        arrayList.add(I.\u00d5\u00d6O000);
        arrayList.add(I.\u00f5\u00f50000);
        arrayList.add(I.thisdo);
        arrayList.add(I.newif);
        arrayList.add(I.o\u00f5O000);
        arrayList.add(I.OO0000);
        arrayList.add(I.\u00d40O000);
        arrayList.add(I.whilenewsuper);
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.add(new for(while.\u00d3\u00d5\u00d6000));
        arrayList.add(new for(while.\u00d8\u00d8\u00d3000));
        arrayList.add(new for(while.\u00d8\u00d20000));
        arrayList.add(new for(while.\u00f6\u00f8\u00f4000));
        arrayList.add(new for(while.\u00f6\u00f8\u00d8000));
        arrayList.add(new for(while.privatenullsuper));
        arrayList.add(new for(while.\u00d3\u00f4\u00d3000));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.O\u00f5o000));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00f5\u00d8o000));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00d8Oo000));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00d4Oo000));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.privatedo, "nur aus Spa\u00df zaubern"));
        J j2 = (J)helden.framework.C.K.o00000(I.\u00d50o000);
        j2.oO0000(10);
        oo0O.\u00d300000(j2);
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.o\u00d5O000, "Obrigkeit / Autorit\u00e4ten", 5));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.o\u00d5O000, "menschlicher Humor", 5));
        M m = (M)helden.framework.C.K.o00000(I.O\u00d4O000);
        m.\u00d2o0000();
        m.o00000(o00O.\u00d400000);
        oo0O.\u00d300000(m);
        return oo0O;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.addAll(ZauberFabrik.getInstance().mindestVerbreitung(4, helden.framework.OOoO.K.\u00d8o0000, this.getSetting()));
        return waehlbareZauber;
    }

    @Override
    public boolean istZweitLehrspracheGewaehlt() {
        return true;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        super.setzeHauszauber(arrayList);
        arrayList.add(this.getZauber(Zauber.whilethisnew));
        arrayList.add(this.getZauber(Zauber.\u00d4\u00f8\u00d2000));
        arrayList.add(this.getZauber(Zauber.thisdonew));
        arrayList.add(this.getZauber(Zauber.O\u00d3\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00d40\u00d3000));
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

