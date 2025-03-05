/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZprofessionen.alchimist;

import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import helden.model.profession.alchimist.BasisAlchimist;
import java.util.ArrayList;
import java.util.Vector;

public class BasisAlchimistDDZ
extends BasisAlchimist {
    public BasisAlchimistDDZ(String string, int n, boolean bl) {
        super(string, n, bl);
    }

    @Override
    public int getAnzahlTalentAuswahlen() {
        return 6;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.remove(oooo_0.o00000(while.\u00f8\u00d8\u00d6000.toString()));
        return arrayList;
    }

    @Override
    public m_0 getTalentAuswahl(int n) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (n) {
            case 5: {
                arrayList.add(G.\u00f4\u00d4\u00f5000);
                arrayList.add(G.nullObjectclass);
                arrayList.add(G.nullpublicString);
                int[] nArray = new int[]{5};
                return new m_0(arrayList, nArray);
            }
        }
        return super.getTalentAuswahl(n);
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.o00000(G.\u00d5\u00d4\u00f5000);
        return k_02;
    }

    @Override
    protected Vector<KonkreterZauber> getZauber() {
        Vector<KonkreterZauber> vector = super.getZauber();
        vector.add(this.getZauber(Zauber.\u00d5\u00f8\u00d2000));
        vector.add(this.getZauber(Zauber.Stringinterfacenew));
        return vector;
    }
}

