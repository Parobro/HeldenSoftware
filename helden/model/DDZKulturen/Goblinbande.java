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
import helden.model.DDZprofessionen.Bettler;
import helden.model.DDZprofessionen.Dieb;
import helden.model.DDZprofessionen.Einbrecher;
import helden.model.DDZprofessionen.Jaeger;
import helden.model.DDZprofessionen.Kundschafter;
import helden.model.DDZprofessionen.Schmuggler;
import helden.model.DDZprofessionen.Soeldner;
import helden.model.DDZprofessionen.Strassenraeuber;
import java.util.ArrayList;

public class Goblinbande
extends helden.model.kultur.Goblinbande {
    private int \u00f8\u00f5\u00f8000 = 0;

    public Goblinbande() {
    }

    public Goblinbande(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public String getID() {
        return "K79";
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.\u00f8\u00f5\u00f8000) {
            case 0: {
                arrayList.add(E.\u00f5\u00d3\u00d8000);
                arrayList.add(E.\u00f4\u00d4\u00d8000);
                arrayList.add(E.o\u00d6\u00d8000);
                int[] nArray = new int[]{2};
                ++this.\u00f8\u00f5\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 1: {
                arrayList.add(G.\u00f8\u00f6\u00f5000);
                arrayList.add(G.nullsuperclass);
                arrayList.add(G.O\u00d8\u00f5000);
                int[] nArray = new int[]{3, 2};
                ++this.\u00f8\u00f5\u00f8000;
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
        arrayList.add(new Soeldner(this.getGeschlecht(), g2, g3));
        arrayList.add(new Jaeger(this.getGeschlecht(), g2, g3));
        arrayList.add(new Kundschafter(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schmuggler(this.getGeschlecht(), g2, g3));
        arrayList.add(new Strassenraeuber(this.getGeschlecht(), g2, g3));
        arrayList.add(new Bettler(this.getGeschlecht(), g2, g3));
        arrayList.add(new Dieb(this.getGeschlecht(), g2, g3));
        arrayList.add(new Einbrecher(this.getGeschlecht(), g2, g3));
        return arrayList;
    }

    @Override
    public boolean hatMehrSprachenAuswahl() {
        return false;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        return this.\u00f8\u00f5\u00f8000 < 2;
    }

    @Override
    public boolean istZweitLehrspracheGewaehlt() {
        return false;
    }

    @Override
    public String toString() {
        return "Goblinbande (DDZ)";
    }
}

