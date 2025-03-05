/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZKulturen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.super;
import helden.framework.oooo.c_1;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.Bauer;
import helden.model.DDZprofessionen.Handwerker;
import helden.model.DDZprofessionen.Hirte;
import helden.model.DDZprofessionen.Jaeger;
import helden.model.DDZprofessionen.Kundschafter;
import helden.model.DDZprofessionen.Prospektor;
import helden.model.DDZprofessionen.Stammeskrieger;
import helden.model.DDZprofessionen.Tierbaendiger;
import helden.model.profession.Schamane;
import java.util.ArrayList;

public class Darna
extends helden.model.kultur.Darna {
    private int \u00d5\u00f5\u00f6000 = 0;

    public Darna() {
    }

    public Darna(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        super.bestimmeTalentwerte(n);
        this.addTalentwert(voidsuper.\u00f4\u00d5\u00d6000, 1);
        this.addTalentwert(voidsuper.\u00d3\u00f4\u00d5000, 1);
    }

    @Override
    public String getID() {
        return "K73";
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.\u00d5\u00f5\u00f6000) {
            case 0: {
                arrayList.add(voidsuper.\u00d5\u00d2\u00d6000);
                arrayList.add(voidsuper.StringfloatObject);
                int[] nArray = new int[]{2};
                ++this.\u00d5\u00f5\u00f6000;
                return new o0oo_2(this, arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        ArrayList<super> arrayList = new ArrayList<super>();
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        arrayList.add(new Bauer(this.getGeschlecht(), g2, g3));
        arrayList.add(new Jaeger(this.getGeschlecht(), g2, g3));
        arrayList.add(new Kundschafter(this.getGeschlecht(), g2, g3));
        arrayList.add(new Prospektor(this.getGeschlecht(), g2, g3));
        Handwerker handwerker = new Handwerker(this.getGeschlecht(), g2, g3);
        handwerker.clearMoeglicheVarianten();
        handwerker.addMoeglicheVariante(handwerker.getArchaischeSuedAventuriens());
        arrayList.add(handwerker);
        Stammeskrieger stammeskrieger = new Stammeskrieger(this.getGeschlecht(), g2, g3);
        stammeskrieger.clearMoeglicheVarianten();
        stammeskrieger.waehleVariante(stammeskrieger.getWaldmensch());
        arrayList.add(stammeskrieger);
        Schamane schamane = new Schamane(this.getGeschlecht(), g2, g3);
        schamane.clearMoeglicheVarianten();
        schamane.waehleVariante(schamane.getMedizinmannDarna());
        arrayList.add(schamane);
        arrayList.add(new Hirte(this.getGeschlecht(), g2, g3));
        arrayList.add(new Tierbaendiger(this.getGeschlecht(), g2, g3));
        return arrayList;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        return this.\u00d5\u00f5\u00f6000 < 1;
    }
}

