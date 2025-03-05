/*
 * Decompiled with CFR 0.152.
 */
package helden.model.tharun.profession;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.model.tharun.profession.zusatzvarianten.MeditationsherrVariante;
import helden.model.tharun.profession.zusatzvarianten.RunenherrVariante;
import java.util.ArrayList;

public class BasisProfessionTharun
extends L {
    private MeditationsherrVariante \u00d3\u00f4\u00d6O00;
    private RunenherrVariante nullinterfaceint;

    public BasisProfessionTharun() {
    }

    public BasisProfessionTharun(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public ArrayList<P> getAlleZusatzVarianten() {
        ArrayList<P> arrayList = super.getAlleZusatzVarianten();
        arrayList.add(this.getMeditationsherr());
        arrayList.add(this.getRunenherr());
        return arrayList;
    }

    public P getMeditationsherr() {
        if (this.\u00d3\u00f4\u00d6O00 == null) {
            this.\u00d3\u00f4\u00d6O00 = new MeditationsherrVariante();
        }
        return this.\u00d3\u00f4\u00d6O00;
    }

    public P getRunenherr() {
        if (this.nullinterfaceint == null) {
            this.nullinterfaceint = new RunenherrVariante();
        }
        return this.nullinterfaceint;
    }

    @Override
    public ArrayList<ArrayList<P>> getZusatzVarianten(P p2) {
        ArrayList<ArrayList<P>> arrayList = new ArrayList<ArrayList<P>>();
        ArrayList<P> arrayList2 = new ArrayList<P>();
        arrayList2.addAll(this.getAlleZusatzVarianten());
        arrayList.add(arrayList2);
        return arrayList;
    }
}

