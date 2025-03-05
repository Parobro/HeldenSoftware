/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZKulturen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.G;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.super;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.Bauer;
import helden.model.DDZprofessionen.Druide;
import helden.model.DDZprofessionen.Haendler;
import helden.model.DDZprofessionen.Handwerker;
import helden.model.DDZprofessionen.Hirte;
import helden.model.DDZprofessionen.Jaeger;
import helden.model.DDZprofessionen.Kundschafter;
import helden.model.DDZprofessionen.Stammeskrieger;
import helden.model.DDZprofessionen.Strassenraeuber;
import helden.model.profession.Schamane;
import java.util.ArrayList;

public class Trollzacken
extends helden.model.kultur.Trollzacken {
    public Trollzacken() {
    }

    public Trollzacken(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        super.bestimmeTalentwerte(n);
        this.removeTalent(G.whilewhileString);
    }

    @Override
    public String getID() {
        return "K65";
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.O\u00f8\u00f8000) {
            case 1: {
                arrayList.add(G.\u00f8\u00f6\u00f5000);
                arrayList.add(G.\u00d3\u00f8\u00f5000);
                int[] nArray = new int[]{4};
                ++this.O\u00f8\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
        }
        return super.getNextTalentAuswahl();
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        ArrayList<super> arrayList = new ArrayList<super>();
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        Stammeskrieger stammeskrieger = new Stammeskrieger(this.getGeschlecht(), g2, g3);
        stammeskrieger.clearMoeglicheVarianten();
        stammeskrieger.addMoeglicheVariante(stammeskrieger.getTrollzacker());
        arrayList.add(stammeskrieger);
        arrayList.add(new Hirte(this.getGeschlecht(), g2, g3));
        arrayList.add(new Jaeger(this.getGeschlecht(), g2, g3));
        arrayList.add(new Kundschafter(this.getGeschlecht(), g2, g3));
        arrayList.add(new Strassenraeuber(this.getGeschlecht(), g2, g3));
        arrayList.add(new Bauer(this.getGeschlecht(), g2, g3));
        Handwerker handwerker = new Handwerker(this.getGeschlecht(), g2, g3);
        handwerker.clearMoeglicheVarianten();
        handwerker.addMoeglicheVariante(handwerker.getArchaischeNordens());
        arrayList.add(handwerker);
        Druide druide = new Druide(this.getGeschlecht(), g2, g3);
        druide.clearMoeglicheVarianten();
        druide.addMoeglicheVariante(druide.getHueterderMacht());
        arrayList.add(druide);
        Schamane schamane = new Schamane(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        schamane.clearMoeglicheVarianten();
        schamane.addMoeglicheVariante(schamane.getShochzul());
        arrayList.add(schamane);
        Haendler haendler = new Haendler(this.getGeschlecht(), g2, g3);
        haendler.clearMoeglicheVarianten();
        haendler.addMoeglicheVariante(haendler.getTauschhaendler());
        arrayList.add(haendler);
        return arrayList;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        return this.O\u00f8\u00f8000 < 2;
    }
}

