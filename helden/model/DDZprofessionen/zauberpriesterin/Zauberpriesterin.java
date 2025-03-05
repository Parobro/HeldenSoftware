/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.zauberpriesterin;

import helden.framework.C.I;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.OOoO.K;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.int.N;
import helden.framework.oOoO.void;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.framework.zauber.ZauberFabrik;
import java.util.ArrayList;

public class Zauberpriesterin
extends N {
    public Zauberpriesterin() {
        super("Zauberpriesterin", 22);
    }

    public Zauberpriesterin(String string, int n) {
        super(string, n);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 10;
    }

    @Override
    public int getAnzahlVerbilligteSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Bienenvolk");
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.\u00f4\u00d20000);
        arrayList.add(I.O\u00d80000);
        arrayList.add(I.\u00d4\u00d5o000);
        arrayList.add(I.whilenull);
        arrayList.add(I.O\u00d30000);
        arrayList.add(I.\u00d8\u00d4O000);
        arrayList.add(I.\u00d50o000);
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 14;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
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
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 9;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public k_0<b_0> getModifikationen() {
        k_0<b_0> k_02 = super.getModifikationen();
        return k_02;
    }

    @Override
    public int getPermanenteASP() {
        return -1;
    }

    @Override
    public K getRepraesentation(Zauber zauber) {
        return K.\u00d4\u00d20000;
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(oooo_0.o00000(while.\u00f5\u00d2\u00d6000.toString()));
        arrayList.add(oooo_0.o00000(while.oO\u00d8000.toString()));
        arrayList.add(oooo_0.o00000(while.ifdoObject.toString()));
        return new objectsuper_0(this.getProfession(), arrayList, 1);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = new ArrayList<P>();
        arrayList.add(oooo_0.o00000(while.oo\u00f6000.toString()));
        arrayList.add(oooo_0.o00000(while.StringthisString.toString()));
        arrayList.add(oooo_0.o00000(while.Stringthissuper.toString()));
        arrayList.add(oooo_0.o00000(while.Stringreturnsuper.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d3O0000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d30000.toString()));
        arrayList.add(oooo_0.o00000(while.privateifObject.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(G.\u00d3\u00f8\u00f5000);
                arrayList.add(G.\u00d8\u00f4\u00f5000);
                arrayList.add(G.nullsuperclass);
                arrayList.add(G.\u00f5\u00f6\u00f5000);
                int[] nArray = new int[]{4};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(this.getZauber(Zauber.\u00f4O\u00d4000));
                arrayList.add(this.getZauber(Zauber.\u00f4\u00d2\u00d3000));
                arrayList.add(this.getZauber(Zauber.ifnewnew));
                int[] nArray = new int[]{7, 5};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.add(this.getZauber(Zauber.privateintnew));
                arrayList.add(this.getZauber(Zauber.\u00d50\u00d4000));
                arrayList.add(this.getZauber(Zauber.\u00d4o\u00d5000));
                int[] nArray = new int[]{5, 3};
                return new m_0(arrayList, nArray);
            }
            case 3: {
                arrayList.add(this.getZauber(Zauber.ifthisObject));
                arrayList.add(this.getZauber(Zauber.\u00f5\u00f6\u00d3000));
                arrayList.add(this.getZauber(Zauber.\u00f5\u00f6\u00d4000));
                int[] nArray = new int[]{5, 4};
                return new m_0(arrayList, nArray);
            }
            case 4: {
                arrayList.add(this.getZauber(Zauber.\u00d8\u00f5\u00d3000));
                arrayList.add(this.getZauber(Zauber.whilethisObject));
                arrayList.add(this.getZauber(Zauber.\u00f8\u00f8\u00d4000));
                int[] nArray = new int[]{6, 3};
                return new m_0(arrayList, nArray);
            }
            case 5: {
                arrayList.add(this.getZauber(Zauber.\u00f5o\u00d3000));
                arrayList.add(this.getZauber(Zauber.\u00f4\u00f5\u00d3000));
                arrayList.add(this.getZauber(Zauber.O\u00d3\u00d5000));
                int[] nArray = new int[]{5, 3};
                return new m_0(arrayList, nArray);
            }
            case 6: {
                arrayList.add(this.getZauber(Zauber.\u00d3\u00d3\u00d4000));
                arrayList.add(this.getZauber(Zauber.\u00d8\u00d4\u00d4000));
                arrayList.add(this.getZauber(Zauber.oO\u00d4000));
                int[] nArray = new int[]{4, 2};
                return new m_0(arrayList, nArray);
            }
            case 7: {
                arrayList.add(this.getZauber(Zauber.nullpublicnew));
                arrayList.add(this.getZauber(Zauber.\u00f4\u00d3\u00d4000));
                arrayList.add(this.getZauber(Zauber.\u00d8\u00d2\u00d3000));
                arrayList.add(this.getZauber(Zauber.o\u00d3\u00d4000));
                int[] nArray = new int[]{5, 2};
                return new m_0(arrayList, nArray);
            }
            case 8: {
                ArrayList<KonkreterZauber> arrayList2 = new ArrayList<KonkreterZauber>();
                arrayList2.add(this.getZauber(Zauber.privateintnew));
                arrayList2.add(this.getZauber(Zauber.\u00d50\u00d4000));
                arrayList2.add(this.getZauber(Zauber.\u00d4o\u00d5000));
                arrayList2.add(this.getZauber(Zauber.ifthisObject));
                arrayList2.add(this.getZauber(Zauber.\u00f5\u00f6\u00d3000));
                arrayList2.add(this.getZauber(Zauber.\u00f5\u00f6\u00d4000));
                arrayList2.add(this.getZauber(Zauber.\u00d8\u00f5\u00d3000));
                arrayList2.add(this.getZauber(Zauber.whilethisObject));
                arrayList2.add(this.getZauber(Zauber.\u00f8\u00f8\u00d4000));
                for (oo0o_0 oo0o_02 : arrayList2) {
                    if (this.getProfession().getWahlWert0(oo0o_02) != 0) continue;
                    arrayList.add(oo0o_02);
                }
                Object object = new int[]{2};
                return new m_0(arrayList, (int[])object);
            }
            case 9: {
                ArrayList<KonkreterZauber> arrayList3 = new ArrayList<KonkreterZauber>();
                arrayList3.add(this.getZauber(Zauber.\u00f4O\u00d4000));
                arrayList3.add(this.getZauber(Zauber.\u00f4\u00d2\u00d3000));
                arrayList3.add(this.getZauber(Zauber.ifnewnew));
                for (oo0o_0 oo0o_02 : arrayList3) {
                    if (this.getProfession().getWahlWert0(oo0o_02) != 0) continue;
                    arrayList.add(oo0o_02);
                }
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.o00000(E.nullsuperString, 3);
        k_02.o00000(E.\u00f4\u00d6\u00d8000, 1);
        k_02.o00000(E.newnewString, 3);
        k_02.o00000(voidsuper.\u00d4\u00f8\u00d5000, 1);
        k_02.o00000(voidsuper.newnewObject, 3);
        k_02.o00000(voidsuper.o\u00d3\u00d6000, 1);
        k_02.o00000(voidsuper.\u00d4\u00d8\u00d6000, 1);
        k_02.o00000(voidsuper.O0\u00d6000, 3);
        k_02.o00000(voidsuper.\u00d8\u00d5\u00d6000, 5);
        k_02.o00000(voidsuper.thisinterfaceObject, 3);
        k_02.o00000(voidsuper.\u00d30\u00d8000, 1);
        k_02.o00000(voidsuper.StringclassObject, 3);
        k_02.o00000(voidsuper.nullObjectObject, 2);
        k_02.o00000(voidsuper.\u00d5\u00d4\u00d6000, 4);
        k_02.o00000(voidsuper.oo\u00d6000, 4);
        k_02.o00000(voidsuper.\u00f5\u00f5\u00d5000, 4);
        k_02.o00000(voidsuper.\u00f5\u00d2\u00d6000, 2);
        k_02.o00000(voidsuper.\u00f4\u00d2\u00d6000, 2);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d5000, 4);
        k_02.o00000(voidsuper.\u00f5\u00d6\u00d6000, 3);
        k_02.o00000(voidsuper.\u00d3\u00d6\u00d5000, 3);
        k_02.o00000(G.Stringsuperclass, 8);
        k_02.o00000(voidsuper.\u00f5o\u00d6000, 3);
        k_02.o00000(voidsuper.\u00f5\u00f5\u00d6000, 1);
        k_02.o00000(voidsuper.StringObjectObject, 1);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d5000, 7);
        k_02.o00000(voidsuper.returnifObject, 1);
        k_02.o00000(this.getZauber(Zauber.\u00d3o\u00d4000), 4);
        k_02.o00000(this.getZauber(Zauber.\u00d5\u00f6\u00d4000), 2);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(I.thisdo);
        arrayList.add(I.\u00d8oo000);
        arrayList.add(I.\u00f8\u00d5o000);
        arrayList.add(I.o\u00f8o000);
        arrayList.add(I.\u00f5\u00f80000);
        arrayList.add(I.whilefor);
        arrayList.add(I.o\u00d2O000);
        return arrayList;
    }

    @Override
    public void getVerbilligteSonderfertigkeitAuswahl(int n) {
        ArrayList<for> arrayList = new ArrayList<for>();
        if (!this.getProfession().getGewaehlteSonderfertigkeiten().\u00d200000(while.\u00f5\u00d2\u00d6000.toString())) {
            arrayList.add(new for(while.\u00f5\u00d2\u00d6000));
        }
        if (!this.getProfession().getGewaehlteSonderfertigkeiten().\u00d200000(while.oO\u00d8000.toString())) {
            arrayList.add(new for(while.oO\u00d8000));
        }
        if (!this.getProfession().getGewaehlteSonderfertigkeiten().\u00d200000(while.ifdoObject.toString())) {
            arrayList.add(new for(while.ifdoObject));
        }
        return new void(this.getProfession(), arrayList, 1);
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.newObjectsuper));
        arrayList.add(new for(while.newpublic));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.forsupersuper));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00f8\u00d3o000.toString(), new Object[]{"Heshinja"}));
        return oo0O;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.addAll(ZauberFabrik.getInstance().mindestVerbreitung(4, K.\u00d4\u00d20000, this.getSetting()));
        return waehlbareZauber;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        for (int i2 = 1; i2 < 8; ++i2) {
            m_0 m_02 = this.getTalentAuswahl(i2);
            for (oo0o_0 oo0o_02 : m_02.new()) {
                if (this.getProfession().getWahlWert0(oo0o_02) != m_02.\u00d300000()[0]) continue;
                arrayList.add((KonkreterZauber)oo0o_02);
            }
        }
    }
}

