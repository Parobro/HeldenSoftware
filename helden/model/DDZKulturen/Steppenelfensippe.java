/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZKulturen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.G;
import helden.framework.oooo.c_1;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.model.kultur.SteppenelfenSippe;
import java.util.ArrayList;

public class Steppenelfensippe
extends SteppenelfenSippe {
    public Steppenelfensippe() {
    }

    public Steppenelfensippe(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public String getID() {
        return "K66";
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.returnforclass) {
            case 0: {
                arrayList.add(G.\u00f8\u00f6\u00f5000);
                arrayList.add(G.\u00d8\u00f4\u00f5000);
                arrayList.add(G.nullsuperclass);
                int[] nArray = new int[]{4};
                ++this.returnforclass;
                return new o0oo_2(this, arrayList, nArray);
            }
        }
        throw new c_1();
    }
}

