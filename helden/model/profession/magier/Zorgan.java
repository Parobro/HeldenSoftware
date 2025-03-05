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
import helden.framework.OOoO.o00O;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oo0o_2;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.framework.zauber.ZauberFabrik;
import helden.model.profession.magier.StandardMagierVariante;
import java.util.ArrayList;

public class Zorgan
extends StandardMagierVariante {
    public Zorgan() {
        super("Zorgan", 25);
        this.oO\u00d2O00 = "grau";
    }

    @Override
    public void addSpracheAuswahl(G g2) {
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(g2);
        this.setZweitLehrsprache(arrayList);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 2;
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = super.getBesondererBesitzMoeglichkeiten();
        arrayList.add("Liber Methelese");
        return arrayList;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public int getMaximalSozialstatus() {
        return 11;
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
            return 11;
        }
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.O\u00f5\u00d2000)) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 7;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public oo0o_2 getNextSprachAuswahl() {
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.whilewhileString);
        arrayList.add(G.newwhileString);
        return new oo0o_2(this.getProfession(), arrayList, 1, "Lehrsprache");
    }

    @Override
    public K getRepraesentation(Zauber zauber) {
        return K.\u00f8O0000;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00f6\u00f8\u00f4000.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 0: {
                arrayList.add(voidsuper.newnewObject);
                arrayList.add(voidsuper.privateObjectObject);
                int[] nArray = new int[]{2};
                return new m_0(arrayList, nArray);
            }
            case 1: {
                arrayList.add(this.getZauber(Zauber.\u00f5O\u00d3000));
                arrayList.add(this.getZauber(Zauber.whilenullnew));
                int[] nArray = new int[]{5, 3};
                return new m_0(arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.o00000(E.\u00d3\u00d4\u00d8000, 2);
        k_02.o00000(voidsuper.OO\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d5O\u00d6000, 1);
        k_02.o00000(voidsuper.\u00d4\u00f8\u00d5000, 1);
        k_02.o00000(voidsuper.o\u00d3\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d4\u00d8\u00d6000, 1);
        k_02.o00000(voidsuper.\u00d5\u00d5\u00d5000, 2);
        k_02.o00000(voidsuper.O0\u00d6000, 3);
        k_02.o00000(voidsuper.\u00d8\u00d5\u00d6000, 2);
        k_02.o00000(voidsuper.thisinterfaceObject, 4);
        k_02.o00000(voidsuper.\u00d30\u00d8000, 2);
        k_02.o00000(voidsuper.StringclassObject, 2);
        k_02.o00000(voidsuper.\u00f4o\u00d6000, 2);
        k_02.o00000(voidsuper.nullObjectObject, 2);
        k_02.o00000(voidsuper.\u00d5\u00d4\u00d6000, 3);
        k_02.o00000(voidsuper.oo\u00d6000, 2);
        k_02.o00000(voidsuper.\u00f5\u00f5\u00d5000, 4);
        k_02.o00000(voidsuper.o\u00d5\u00d6000, 2);
        k_02.o00000(voidsuper.\u00f5\u00d2\u00d6000, 4);
        k_02.o00000(voidsuper.\u00f4\u00d2\u00d6000, 2);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d5000, 4);
        k_02.o00000(voidsuper.\u00d3\u00d6\u00d5000, 3);
        k_02.o00000(voidsuper.\u00d4\u00f6\u00d6000, 2);
        k_02.o00000(G.\u00d8\u00d8\u00f5000, 8);
        k_02.o00000(G.\u00d3o\u00f5000, 8);
        if (this.getZweitLehrsprache() != null && this.getZweitLehrsprache().size() > 0 && this.getZweitLehrsprache().get(0).equals(G.whilewhileString)) {
            k_02.o00000(G.newwhileString, 4);
        } else {
            k_02.o00000(G.whilewhileString, 4);
        }
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d5000, 4);
        k_02.o00000(this.getZauber(Zauber.\u00f8\u00d6\u00d3000), 7);
        k_02.o00000(this.getZauber(Zauber.\u00f8\u00f5\u00d3000), 7);
        k_02.o00000(this.getZauber(Zauber.forpublicnew), 6);
        k_02.o00000(this.getZauber(Zauber.\u00f5o\u00d3000), 6);
        k_02.o00000(this.getZauber(Zauber.fordonew), 7);
        k_02.o00000(this.getZauber(Zauber.nullsupernew), 5);
        k_02.o00000(this.getZauber(Zauber.\u00d5\u00d8\u00d4000), 7);
        k_02.o00000(this.getZauber(Zauber.newfornew), 4);
        k_02.o00000(this.getZauber(Zauber.O\u00f5\u00d4000), 7);
        k_02.o00000(this.getZauber(Zauber.\u00f8o\u00d4000), 4);
        k_02.o00000(this.getZauber(Zauber.\u00d5\u00f6\u00d3000), 5);
        k_02.o00000(this.getZauber(Zauber.\u00d80\u00d5000), 7);
        k_02.o00000(this.getZauber(Zauber.Stringpublicnew), 4);
        k_02.o00000(this.getZauber(Zauber.O\u00f6\u00d4000), 4);
        k_02.o00000(this.getZauber(Zauber.\u00d5\u00d2\u00d3000), 3);
        k_02.o00000(this.getZauber(Zauber.\u00d3\u00d3\u00d4000), 3);
        k_02.o00000(this.getZauber(Zauber.\u00d5\u00d5\u00d4000), 5);
        k_02.o00000(this.getZauber(Zauber.\u00d3\u00d3\u00d5000), 6);
        k_02.o00000(this.getZauber(Zauber.\u00f5\u00d5\u00d3000), 3);
        k_02.o00000(this.getZauber(Zauber.\u00d3o\u00d4000), 5);
        k_02.o00000(this.getZauber(Zauber.returnifnew), 6);
        k_02.o00000(this.getZauber(Zauber.ifnewnew), 4);
        k_02.o00000(this.getZauber(Zauber.newwhilenew), 5);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(I.\u00d3\u00d3O000);
        arrayList.add(I.o\u00d5O000);
        arrayList.add(helden.framework.C.K.o00000(I.\u00d8\u00f8O000, new Object[]{oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.Objectsuper.toString()}));
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.\u00f8\u00d5\u00d6000));
        arrayList.add(new for(while.\u00f6\u00d5\u00d6000));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.whilenewsuper, 1000));
        return oo0O;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.removeAll(ZauberFabrik.getInstance().mindestVerbreitung(0, K.\u00f8O0000, o00O.\u00d2O0000, this.getSetting()));
        waehlbareZauber.removeAll(ZauberFabrik.getInstance().mindestVerbreitung(0, K.\u00f8O0000, o00O.\u00f8\u00d20000, this.getSetting()));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3O\u00d3000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.whilenullnew, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3\u00f5\u00d4000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.whilethisnew, K.\u00d8o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00d2\u00d4000, K.\u00d8o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f80\u00d4000, K.\u00f4o0000, ""));
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
        arrayList.add(this.getZauber(Zauber.\u00f8\u00d6\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00f8\u00f5\u00d3000));
        arrayList.add(this.getZauber(Zauber.forpublicnew));
        arrayList.add(this.getZauber(Zauber.\u00f5o\u00d3000));
        arrayList.add(this.getZauber(Zauber.fordonew));
        arrayList.add(this.getZauber(Zauber.nullsupernew));
        arrayList.add(this.getZauber(Zauber.\u00d5\u00d8\u00d4000));
    }

    @Override
    public String toString() {
        return "Schule des Seienden Scheins zu Zorgan";
    }
}

