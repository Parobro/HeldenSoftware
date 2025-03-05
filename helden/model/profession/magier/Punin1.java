/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.magier;

import helden.framework.D.OOOo;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import helden.model.profession.magier.Punin;
import java.util.ArrayList;

public class Punin1
extends Punin {
    public Punin1() {
        super("Punin I", 28);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public String getBezeichner(Geschlecht geschlecht) {
        return this.toString();
    }

    @Override
    public ArrayList<for> getGewaehlteVerbilligteSonderfertigkeiten() {
        OOOo oOOo = this.getProfession().getGewaehlteSonderfertigkeiten();
        ArrayList<for> arrayList = new ArrayList<for>();
        if (oOOo.\u00d200000(while.o\u00d6\u00d5000.toString())) {
            arrayList.add(new for(while.\u00d8oO000));
        }
        if (oOOo.\u00d200000(while.\u00d8oO000.toString())) {
            arrayList.add(new for(while.o\u00d6\u00d5000));
        }
        return arrayList;
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(oooo_0.o00000(while.o\u00d6\u00d5000.toString()));
                arrayList.add(oooo_0.o00000(while.\u00d8oO000.toString()));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.\u00d5\u00d8\u00f4000.toString()));
        arrayList.add(oooo_0.o00000(while.\u00d8\u00d2\u00d8000.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.o00000(this.getZauber(Zauber.\u00d5\u00f6\u00d4000), 6);
        k_02.o00000(this.getZauber(Zauber.O0\u00d5000), 6);
        k_02.o00000(this.getZauber(Zauber.nullinterfacesuper), 5);
        k_02.o00000(this.getZauber(Zauber.\u00d4\u00d6\u00d3000), 7);
        k_02.o00000(this.getZauber(Zauber.\u00d4\u00f4\u00d3000), 6);
        k_02.o00000(this.getZauber(Zauber.\u00f4\u00d8\u00d3000), 6);
        k_02.o00000(this.getZauber(Zauber.ifnewnew), 5);
        k_02.o00000(this.getZauber(Zauber.nullpublicnew), 4);
        k_02.o00000(this.getZauber(Zauber.newfornew), 2);
        k_02.o00000(this.getZauber(Zauber.\u00f8o\u00d4000), 3);
        k_02.o00000(this.getZauber(Zauber.\u00f8\u00d2\u00d5000), 2);
        k_02.o00000(this.getZauber(Zauber.\u00f8\u00f5\u00d4000), 4);
        k_02.o00000(this.getZauber(Zauber.Stringpublicnew), 4);
        k_02.o00000(this.getZauber(Zauber.\u00d5\u00d2\u00d3000), 3);
        k_02.o00000(this.getZauber(Zauber.\u00d3\u00d3\u00d4000), 5);
        k_02.o00000(this.getZauber(Zauber.ifthisObject), 3);
        k_02.o00000(this.getZauber(Zauber.\u00f8\u00d5\u00d3000), 4);
        k_02.o00000(this.getZauber(Zauber.\u00d5\u00d5\u00d4000), 3);
        k_02.o00000(this.getZauber(Zauber.\u00d50\u00d4000), 2);
        k_02.o00000(this.getZauber(Zauber.\u00f5\u00d5\u00d3000), 2);
        k_02.o00000(this.getZauber(Zauber.\u00d3\u00d5\u00d3000), 4);
        k_02.o00000(this.getZauber(Zauber.\u00d3o\u00d4000), 5);
        k_02.o00000(this.getZauber(Zauber.\u00d4o\u00d5000), 3);
        k_02.o00000(this.getZauber(Zauber.ifwhilenew), 2);
        k_02.o00000(this.getZauber(Zauber.o\u00d3\u00d4000), 2);
        return k_02;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.add(new for(while.forforclass));
        arrayList.add(new for(while.\u00d6\u00f5\u00d4000));
        arrayList.add(new for(while.returnObjectnew));
        arrayList.add(new for(while.\u00f8\u00d5\u00d6000));
        arrayList.add(new for(while.\u00f6\u00d5\u00d6000));
        arrayList.add(new for(while.\u00f6\u00d5\u00f4000));
        return arrayList;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        arrayList.add(this.getZauber(Zauber.\u00d5\u00f6\u00d4000));
        arrayList.add(this.getZauber(Zauber.O0\u00d5000));
        arrayList.add(this.getZauber(Zauber.nullinterfacesuper));
        arrayList.add(this.getZauber(Zauber.\u00d4\u00d6\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00d4\u00f4\u00d3000));
        arrayList.add(this.getZauber(Zauber.\u00f4\u00d8\u00d3000));
        arrayList.add(this.getZauber(Zauber.ifnewnew));
    }

    @Override
    public String toString() {
        return "Arcanes Institut Punin - Metamagie, Beschw\u00f6rungen, Herbeirufung";
    }
}

