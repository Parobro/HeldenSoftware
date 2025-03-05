/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.handwerker;

import helden.framework.D.P;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.int.N;
import helden.framework.oooo.k_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import java.util.ArrayList;

public abstract class HandwerklicheSpezialisierung
extends N {
    public HandwerklicheSpezialisierung(String string) {
        super(string, 0);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        if (this.getSonderfertigkeiten().size() == 0) {
            return 1;
        }
        return 0;
    }

    public abstract oo0o_0 getHaupttalent();

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        if (n == 0) {
            return new objectsuper_0(this.getProfession(), this.OoO000(), 1);
        }
        return null;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(this.getHaupttalent(), 7);
        return k_02;
    }

    private ArrayList<P> OoO000() {
        return oooo_0.o00000(this.getHaupttalent());
    }
}

