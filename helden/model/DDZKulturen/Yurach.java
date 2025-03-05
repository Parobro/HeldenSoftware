/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZKulturen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.super;
import helden.framework.oooo.c_1;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.Bauer;
import helden.model.DDZprofessionen.Gladiator;
import helden.model.DDZprofessionen.Jaeger;
import helden.model.DDZprofessionen.Kundschafter;
import helden.model.DDZprofessionen.Rattenfaenger;
import helden.model.DDZprofessionen.Soeldner;
import helden.model.DDZprofessionen.Strassenraeuber;
import helden.model.DDZprofessionen.Tageloehner;
import java.util.ArrayList;

public class Yurach
extends helden.model.kultur.Yurach {
    private int newforclass = 0;

    public Yurach() {
    }

    public Yurach(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        super.bestimmeTalentwerte(n);
        this.removeTalent(G.whilewhileString);
    }

    @Override
    public String getID() {
        return "K85";
    }

    @Override
    public G getMuttersprache() {
        return G.O\u00d8\u00f5000;
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.newforclass) {
            case 0: {
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.\u00f4\u00d4\u00d8000);
                arrayList.add(E.o\u00d6\u00d8000);
                int[] nArray = new int[]{2};
                ++this.newforclass;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 1: {
                arrayList.add(G.\u00d3\u00f8\u00f5000);
                arrayList.add(G.\u00f8\u00f6\u00f5000);
                arrayList.add(G.\u00d8\u00f4\u00f5000);
                int[] nArray = new int[]{3};
                ++this.newforclass;
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
        arrayList.add(new Gladiator(this.getGeschlecht(), g2, g3));
        arrayList.add(new Soeldner(this.getGeschlecht(), g2, g3));
        arrayList.add(new Jaeger(this.getGeschlecht(), g2, g3));
        arrayList.add(new Kundschafter(this.getGeschlecht(), g2, g3));
        arrayList.add(new Strassenraeuber(this.getGeschlecht(), g2, g3));
        Bauer bauer = new Bauer(this.getGeschlecht(), g2, g3);
        bauer.clearMoeglicheVarianten();
        bauer.addMoeglicheVariante(bauer.getFeldsklave());
        arrayList.add(bauer);
        arrayList.add(new Rattenfaenger(this.getGeschlecht(), g2, g3));
        arrayList.add(new Tageloehner(this.getGeschlecht(), g2, g3));
        return arrayList;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        return this.newforclass < 2;
    }
}

