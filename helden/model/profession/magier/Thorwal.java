/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.magier;

import helden.framework.C.I;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OOoO.K;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.framework.zauber.ZauberFabrik;
import helden.model.profession.magier.StandardMagierVariante;
import java.util.ArrayList;

public class Thorwal
extends StandardMagierVariante {
    public Thorwal() {
        super("Thorwal", 26);
        this.oO\u00d2O00 = "grau";
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.\u00d3\u00f8\u00f5000);
        this.setZweitLehrsprache(arrayList);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 5;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(I.O\u00d30000);
        arrayList.add(I.Stringdo);
        arrayList.add(I.\u00d4OO000);
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 10;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.whilewhilesuper)) {
            return 12;
        }
        if (b_02.equals(b_0.newwhilesuper)) {
            return 13;
        }
        if (b_02.equals(b_0.\u00f8\u00f4\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 6;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public K getRepraesentation(Zauber zauber) {
        return K.\u00f8O0000;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d4\u00d5000.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(G.\u00f8\u00f6\u00f5000);
                arrayList.add(G.whilewhileString);
                arrayList.add(G.\u00d5\u00f8\u00f4000);
                arrayList.add(G.\u00d8\u00d3\u00f5000);
                arrayList.add(G.newwhileString);
                arrayList.remove(this.getProfession().getMuttersprache());
                int[] nArray = new int[]{6, 4};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(G.o\u00f4\u00f5000);
                arrayList.add(G.\u00f5\u00f6\u00f5000);
                int[] nArray = new int[]{6};
                return new m_0(arrayList, nArray);
            }
            case 2: {
                arrayList.addAll(N.floatsuper().super(this.getProfession().getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f600000));
                int[] nArray = new int[]{6};
                return new m_0(arrayList, nArray);
            }
            case 3: {
                arrayList.add(voidsuper.\u00d8\u00d5\u00d5000);
                arrayList.add(voidsuper.\u00d8O\u00d8000);
                arrayList.add(voidsuper.o\u00f6\u00d5000);
                arrayList.add(voidsuper.O\u00f5\u00d6000);
                arrayList.add(voidsuper.\u00d5\u00d6\u00d6000);
                arrayList.add(voidsuper.privatedoObject);
                arrayList.add(voidsuper.\u00f4\u00d5\u00d6000);
                arrayList.add(voidsuper.ifnullObject);
                arrayList.add(voidsuper.privateObjectObject);
                arrayList.add(voidsuper.ififObject);
                arrayList.add(voidsuper.\u00d3\u00f8\u00d6000);
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
            case 4: {
                arrayList.add(this.getZauber(Zauber.o\u00d2\u00d5000));
                arrayList.add(this.getZauber(Zauber.\u00d5\u00d5\u00d3000));
                int[] nArray = new int[]{3};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.o00000(E.\u00f4\u00d6\u00d8000, 1);
        k_02.o00000(E.\u00d3\u00d4\u00d8000, 3);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d6000, 1);
        k_02.o00000(voidsuper.\u00d4\u00d2\u00d8000, 1);
        k_02.o00000(voidsuper.returnprivateObject, 1);
        k_02.o00000(voidsuper.\u00d4\u00f8\u00d5000, 2);
        k_02.o00000(voidsuper.o\u00d3\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d40\u00d6000, 1);
        k_02.o00000(voidsuper.\u00d8\u00d5\u00d6000, 2);
        k_02.o00000(voidsuper.thisinterfaceObject, 4);
        k_02.o00000(voidsuper.\u00d30\u00d8000, 3);
        k_02.o00000(voidsuper.StringclassObject, 3);
        k_02.o00000(voidsuper.StringvoidObject, 2);
        k_02.o00000(voidsuper.\u00d40\u00d8000, 2);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d6000, 2);
        k_02.o00000(voidsuper.nullObjectObject, 3);
        k_02.o00000(voidsuper.\u00d5\u00d4\u00d6000, 3);
        k_02.o00000(voidsuper.oo\u00d6000, 3);
        k_02.o00000(voidsuper.\u00f5\u00f5\u00d5000, 4);
        k_02.o00000(voidsuper.o\u00d5\u00d6000, 3);
        k_02.o00000(voidsuper.thisintObject, 4);
        k_02.o00000(voidsuper.\u00f5\u00d2\u00d6000, 4);
        k_02.o00000(voidsuper.\u00f4\u00d2\u00d6000, 1);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d5000, 3);
        k_02.o00000(voidsuper.\u00d3\u00d6\u00d5000, 3);
        k_02.o00000(voidsuper.\u00d4\u00f6\u00d6000, 2);
        k_02.o00000(G.\u00d8\u00d8\u00f5000, 6);
        k_02.o00000(voidsuper.\u00f5o\u00d6000, 4);
        k_02.o00000(voidsuper.thisclassObject, 1);
        k_02.o00000(voidsuper.\u00f5\u00f5\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d5\u00d5\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d3\u00d8\u00d5000, 2);
        k_02.o00000(voidsuper.\u00d4\u00d4\u00d5000, 2);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d5000, 4);
        k_02.o00000(voidsuper.returnifObject, 1);
        k_02.o00000(this.getZauber(Zauber.\u00d4\u00f8\u00d3000), 5);
        k_02.o00000(this.getZauber(Zauber.\u00d5\u00f6\u00d4000), 6);
        k_02.o00000(this.getZauber(Zauber.\u00f4\u00f4\u00d3000), 5);
        k_02.o00000(this.getZauber(Zauber.\u00d3\u00d5\u00d3000), 5);
        k_02.o00000(this.getZauber(Zauber.\u00d5\u00d6\u00d3000), 4);
        k_02.o00000(this.getZauber(Zauber.\u00f8\u00f8\u00d3000), 5);
        k_02.o00000(this.getZauber(Zauber.o\u00d3\u00d4000), 4);
        k_02.o00000(this.getZauber(Zauber.newfornew), 2);
        k_02.o00000(this.getZauber(Zauber.\u00f8o\u00d4000), 3);
        k_02.o00000(this.getZauber(Zauber.\u00f4\u00f6\u00d4000), 3);
        k_02.o00000(KonkreterZauber.getZauber(Zauber.\u00d3\u00f8\u00d2000, K.\u00f800000, ""), 2);
        k_02.o00000(this.getZauber(Zauber.\u00d40\u00d4000), 3);
        k_02.o00000(this.getZauber(Zauber.O\u00d3\u00d4000), 3);
        k_02.o00000(this.getZauber(Zauber.o\u00f5\u00d3000), 2);
        k_02.o00000(this.getZauber(Zauber.Stringpublicnew), 2);
        k_02.o00000(this.getZauber(Zauber.\u00d3\u00d3\u00d4000), 2);
        k_02.o00000(this.getZauber(Zauber.\u00d3o\u00d3000), 2);
        k_02.o00000(this.getZauber(Zauber.\u00d50\u00d4000), 4);
        k_02.o00000(this.getZauber(Zauber.oo\u00d4000), 3);
        k_02.o00000(this.getZauber(Zauber.\u00d3o\u00d4000), 5);
        k_02.o00000(this.getZauber(Zauber.ifnewnew), 2);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(I.\u00f5\u00f6o000);
        arrayList.add(I.\u00d3\u00d3O000);
        arrayList.add(I.o\u00d5O000);
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.forforclass));
        arrayList.add(new for(while.\u00d8\u00d8\u00d3000));
        arrayList.add(new for(while.\u00d5\u00d8\u00f4000));
        arrayList.add(new for(while.\u00f8\u00d5\u00d6000));
        arrayList.add(new for(while.\u00f6\u00d5\u00d6000));
        arrayList.add(new for(while.thisifclass));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00d5oo000, "", 8));
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00d3\u00d30000));
        return oo0O;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.addAll(ZauberFabrik.getInstance().mindestVerbreitung(4, K.\u00f8O0000, this.getSetting()));
        waehlbareZauber.removeAll(ZauberFabrik.getInstance().mindestVerbreitungDaemonisch(0, K.\u00f8O0000, this.getSetting()));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00f8\u00d3000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00f4\u00d3000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4O\u00d4000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3o\u00d3000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00d3\u00d4000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.oO\u00d5000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3\u00d5\u00d3000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3\u00f5\u00d4000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f50\u00d5000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4o\u00d3000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d5o\u00d5000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.o\u00d3\u00d4000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3\u00f8\u00d2000, K.\u00f800000, ""));
        return waehlbareZauber;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        arrayList.add(this.getZauber(Zauber.\u00d4\u00f8\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00d5\u00f6\u00d4000));
        arrayList.add(this.getZauber(Zauber.\u00f4\u00f4\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00d3\u00d5\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00d5\u00d6\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00f8\u00f8\u00d3000));
        arrayList.add(this.getZauber(Zauber.o\u00d3\u00d4000));
    }

    @Override
    public String toString() {
        return "Schule der Hellsicht zu Thorwal";
    }
}

