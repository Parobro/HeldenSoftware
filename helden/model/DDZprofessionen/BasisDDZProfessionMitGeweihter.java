/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.model.DDZprofessionen.KeineWahl;
import helden.model.DDZprofessionen.zusatzvarianten.Geweiht;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class BasisDDZProfessionMitGeweihter
extends L {
    private static P[] Stringsuperif;
    private static P \u00f5\u00f6\u00d6O00;

    public BasisDDZProfessionMitGeweihter() {
    }

    public BasisDDZProfessionMitGeweihter(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public ArrayList<P> getAlleZusatzVarianten() {
        ArrayList<P> arrayList = super.getAlleZusatzVarianten();
        arrayList.add(this.getKeineWahl());
        arrayList.add(this.getGeweiht(1));
        arrayList.add(this.getGeweiht(2));
        arrayList.add(this.getGeweiht(3));
        arrayList.add(this.getGeweiht(4));
        return arrayList;
    }

    public P getGeweiht(int n) {
        if (Stringsuperif == null) {
            Stringsuperif = new P[4];
            for (int i2 = 0; i2 < 4; ++i2) {
                BasisDDZProfessionMitGeweihter.Stringsuperif[i2] = new Geweiht(i2 + 1);
            }
        }
        return Stringsuperif[n - 1];
    }

    public P getKeineWahl() {
        if (\u00f5\u00f6\u00d6O00 == null) {
            \u00f5\u00f6\u00d6O00 = new KeineWahl();
        }
        return \u00f5\u00f6\u00d6O00;
    }

    @Override
    public ArrayList<ArrayList<P>> getZusatzVarianten(P p2) {
        ArrayList<ArrayList<P>> arrayList = new ArrayList<ArrayList<P>>();
        ArrayList<P> arrayList2 = new ArrayList<P>();
        arrayList2.add(this.getKeineWahl());
        arrayList2.add(this.getGeweiht(1));
        arrayList2.add(this.getGeweiht(2));
        arrayList2.add(this.getGeweiht(3));
        arrayList2.add(this.getGeweiht(4));
        arrayList.add(arrayList2);
        return arrayList;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<P> iterator = this.getGewaehlteVarianten().iterator();
        while (iterator.hasNext()) {
            stringBuffer.append(iterator.next());
            if (!iterator.hasNext()) continue;
            stringBuffer.append("; ");
        }
        return stringBuffer.toString();
    }
}

