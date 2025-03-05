/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZKulturen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.G;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.super;
import helden.framework.oooo.c_1;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.Fischer;
import helden.model.DDZprofessionen.Haendler;
import helden.model.DDZprofessionen.Handwerker;
import helden.model.DDZprofessionen.Stammeskrieger;
import helden.model.DDZprofessionen.Tierbaendiger;
import helden.model.profession.Schamane;
import java.util.ArrayList;

public class Tocamuyac
extends helden.model.kultur.Tocamuyac {
    public Tocamuyac() {
    }

    public Tocamuyac(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public String getID() {
        return "K82";
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.\u00f8\u00f6\u00f6000) {
            case 0: {
                arrayList.add(G.\u00d3\u00f8\u00f5000);
                arrayList.add(G.\u00f5\u00f6\u00f5000);
                arrayList.add(G.\u00f8\u00f6\u00f5000);
                arrayList.add(G.\u00d8\u00f4\u00f5000);
                int[] nArray = new int[]{5};
                ++this.\u00f8\u00f6\u00f6000;
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
        Stammeskrieger stammeskrieger = new Stammeskrieger(this.getGeschlecht(), g2, g3);
        stammeskrieger.clearMoeglicheVarianten();
        stammeskrieger.addMoeglicheVariante(stammeskrieger.getWaldmensch());
        stammeskrieger.addMoeglicheVariante(stammeskrieger.getKanutepeku());
        arrayList.add(stammeskrieger);
        Fischer fischer = new Fischer(this.getGeschlecht(), g2, g3);
        fischer.addMoeglicheVariante(fischer.getBergungstaucher());
        fischer.addMoeglicheVariante(fischer.getHarpunier());
        arrayList.add(fischer);
        arrayList.add(new Tierbaendiger(this.getGeschlecht(), g2, g3));
        Handwerker handwerker = new Handwerker(this.getGeschlecht(), g2, g3);
        handwerker.clearMoeglicheVarianten();
        handwerker.addMoeglicheVariante(handwerker.getArchaischeSuedAventuriens());
        arrayList.add(handwerker);
        Schamane schamane = new Schamane(this.getGeschlecht(), g2, g3);
        schamane.clearMoeglicheVarianten();
        schamane.waehleVariante(schamane.getMedizinmannTocamuyac());
        arrayList.add(schamane);
        Haendler haendler = new Haendler(this.getGeschlecht(), g2, g3);
        arrayList.remove(haendler);
        haendler.addMoeglicheVariante(haendler.getTauschhaendler());
        arrayList.add(haendler);
        return arrayList;
    }
}

