/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.magier;

import helden.framework.C.I;
import helden.framework.C.Oo0O;
import helden.framework.C.public;
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
import helden.framework.oooo.k_0;
import helden.framework.oooo.o00o_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.framework.zauber.ZauberFabrik;
import helden.model.profession.magier.StandardMagierVariante;
import java.util.ArrayList;

public class Tuzak
extends StandardMagierVariante {
    public Tuzak() {
        super("Tuzak", 24);
        this.oO\u00d2O00 = "grau";
    }

    @Override
    public int getAnzahlVorteilAuswahlen() {
        return 1;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public int getMaximalSozialstatus() {
        return 12;
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
        if (b_02.equals(b_0.\u00f4\u00f4\u00d2000)) {
            return 11;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 7;
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
        arrayList.add(oooo_0.o00000(while.\u00f5\u00d2\u00d6000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d2oO000.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.o00000(E.nullsuperString, 1);
        k_02.o00000(E.\u00f4\u00d6\u00d8000, 2);
        k_02.o00000(E.\u00d3\u00d4\u00d8000, 2);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d6000, 2);
        k_02.o00000(voidsuper.returnforObject, 1);
        k_02.o00000(voidsuper.returnprivateObject, 2);
        k_02.o00000(voidsuper.\u00d4\u00f8\u00d5000, 4);
        k_02.o00000(voidsuper.o\u00d3\u00d6000, 4);
        k_02.o00000(voidsuper.O0\u00d6000, 1);
        k_02.o00000(voidsuper.\u00d8\u00d5\u00d6000, 3);
        k_02.o00000(voidsuper.thisinterfaceObject, 3);
        k_02.o00000(voidsuper.\u00d30\u00d8000, 3);
        k_02.o00000(voidsuper.\u00f8\u00d8\u00d5000, 1);
        k_02.o00000(voidsuper.\u00d5\u00d6\u00d5000, 1);
        k_02.o00000(voidsuper.StringvoidObject, 2);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d6000, 3);
        k_02.o00000(voidsuper.\u00d5\u00d3\u00d8000, 1);
        k_02.o00000(voidsuper.\u00d5\u00d4\u00d6000, 3);
        k_02.o00000(voidsuper.oo\u00d6000, 3);
        k_02.o00000(voidsuper.\u00f5\u00f5\u00d5000, 5);
        k_02.o00000(voidsuper.o\u00d5\u00d6000, 4);
        k_02.o00000(voidsuper.thisintObject, 2);
        k_02.o00000(voidsuper.\u00f5\u00d2\u00d6000, 4);
        k_02.o00000(voidsuper.\u00f4\u00d2\u00d6000, 3);
        k_02.o00000(voidsuper.\u00f8\u00f4\u00d5000, 3);
        k_02.o00000(voidsuper.\u00d3\u00d6\u00d5000, 1);
        k_02.o00000(voidsuper.\u00d4\u00f6\u00d6000, 4);
        k_02.o00000(G.\u00d3\u00f8\u00f5000, 5);
        k_02.o00000(G.newwhileString, 4);
        k_02.o00000(G.whilewhileString, 4);
        k_02.o00000(G.\u00d8\u00d8\u00f5000, 7);
        k_02.o00000(G.\u00d3o\u00f5000, 4);
        k_02.o00000(voidsuper.\u00f5o\u00d6000, 2);
        k_02.o00000(voidsuper.\u00f4\u00d5\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d5\u00d5\u00d6000, 2);
        k_02.o00000(voidsuper.\u00d3\u00f4\u00d5000, 4);
        KonkreterZauber konkreterZauber = KonkreterZauber.getZauber(Zauber.\u00f4\u00f8\u00d2000.toString(), K.\u00f8O0000, "Variante1");
        k_02.o00000(konkreterZauber, 6);
        k_02.o00000(this.getZauber(Zauber.newfornew), 7);
        k_02.o00000(this.getZauber(Zauber.\u00d8\u00f5\u00d3000), 5);
        k_02.o00000(this.getZauber(Zauber.\u00d5\u00d5\u00d3000), 5);
        k_02.o00000(this.getZauber(Zauber.\u00d4o\u00d5000), 5);
        k_02.o00000(this.getZauber(Zauber.whilereturnnew), 6);
        k_02.o00000(this.getZauber(Zauber.\u00d8\u00f4\u00d4000), 4);
        konkreterZauber = KonkreterZauber.getZauber(Zauber.\u00f4\u00f8\u00d2000.toString(), K.\u00f8O0000, "Variante2");
        k_02.o00000(konkreterZauber, 3);
        konkreterZauber = KonkreterZauber.getZauber(Zauber.\u00f4\u00f8\u00d2000.toString(), K.\u00f8O0000, "Variante3");
        k_02.o00000(konkreterZauber, 2);
        k_02.o00000(this.getZauber(Zauber.\u00d8\u00d6\u00d3000), 3);
        k_02.o00000(this.getZauber(Zauber.\u00f8\u00f8\u00d2000), 5);
        k_02.o00000(this.getZauber(Zauber.\u00d4\u00d6\u00d4000), 3);
        k_02.o00000(this.getZauber(Zauber.\u00f8o\u00d4000), 3);
        k_02.o00000(this.getZauber(Zauber.O\u00d2\u00d4000), 3);
        k_02.o00000(this.getZauber(Zauber.O\u00d3\u00d4000), 3);
        k_02.o00000(this.getZauber(Zauber.\u00d4\u00d2\u00d5000), 4);
        k_02.o00000(this.getZauber(Zauber.Stringpublicnew), 4);
        k_02.o00000(this.getZauber(Zauber.O\u00d2\u00d5000), 3);
        k_02.o00000(this.getZauber(Zauber.\u00d3o\u00d4000), 4);
        k_02.o00000(this.getZauber(Zauber.nullsupernew), 4);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.\u00f8\u00d5\u00d6000));
        arrayList.add(new for(while.\u00f6\u00d5\u00d6000));
        return arrayList;
    }

    @Override
    public o00o_0 getVorteilAuswahl(int n) {
        ArrayList<public> arrayList = new ArrayList<public>(2);
        arrayList.add(helden.framework.C.K.o00000(I.O\u00d5o000, "Mittelreicher", 8));
        arrayList.add(helden.framework.C.K.o00000(I.o\u00d5O000, "Geselligkeit und st\u00e4dtisches Treiben", 5));
        return new o00o_0(this.getProfession(), arrayList, 1);
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000(I.\u00d3\u00d30000));
        return oo0O;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = new WaehlbareZauber();
        waehlbareZauber.addAll(ZauberFabrik.getInstance().mindestVerbreitung(4, K.\u00f8O0000, this.getSetting()));
        waehlbareZauber.removeAll(ZauberFabrik.getInstance().mindestVerbreitung(0, K.\u00f8O0000, o00O.\u00d2O0000, this.getSetting()));
        waehlbareZauber.removeAll(ZauberFabrik.getInstance().mindestVerbreitungDaemonisch(0, K.\u00f8O0000, this.getSetting()));
        waehlbareZauber.removeAll(ZauberFabrik.getInstance().mindestVerbreitung(0, K.\u00f8O0000, o00O.floatObject, this.getSetting()));
        waehlbareZauber.removeAll(ZauberFabrik.getInstance().mindestVerbreitung(0, K.\u00f8O0000, o00O.\u00d4\u00d30000, this.getSetting()));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d5\u00d5\u00d4000, K.\u00f8O0000, ""));
        for (KonkreterZauber konkreterZauber : waehlbareZauber.getZauberListe()) {
            if (!konkreterZauber.hatMerkmal(o00O.\u00d400000) && !konkreterZauber.hatMerkmal(o00O.\u00d8o0000) && !konkreterZauber.hatMerkmal(o00O.classnew) || konkreterZauber.getZauber().equals(Zauber.O\u00d2\u00d4000) || konkreterZauber.getZauber().equals(Zauber.O\u00d3\u00d4000)) continue;
            waehlbareZauber.add(konkreterZauber, 1);
        }
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.o\u00d3\u00d3000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.O\u00d6\u00d4000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f5\u00d6\u00d4000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4o\u00d4000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d30\u00d3000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d8\u00f8\u00d2000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d5\u00f8\u00d4000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f5\u00d6\u00d3000, K.\u00f4o0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00f8\u00d2000.toString(), K.\u00f8O0000, ""));
        return waehlbareZauber;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        KonkreterZauber konkreterZauber = KonkreterZauber.getZauber(Zauber.\u00f4\u00f8\u00d2000.toString(), K.\u00f8O0000, "Variante1");
        arrayList.add(konkreterZauber);
        arrayList.add(this.getZauber(Zauber.newfornew));
        arrayList.add(this.getZauber(Zauber.\u00d8\u00f5\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00d5\u00d5\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00d4o\u00d5000));
        arrayList.add(this.getZauber(Zauber.whilereturnnew));
        arrayList.add(this.getZauber(Zauber.\u00d8\u00f4\u00d4000));
    }

    @Override
    public String toString() {
        return "Schule des Wandelbaren zu Tuzak";
    }
}

