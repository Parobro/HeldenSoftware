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
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.Fischer;
import helden.model.DDZprofessionen.Haendler;
import helden.model.DDZprofessionen.Handwerker;
import helden.model.DDZprofessionen.Hirte;
import helden.model.DDZprofessionen.Jaeger;
import helden.model.DDZprofessionen.Kundschafter;
import helden.model.DDZprofessionen.Prospektor;
import helden.model.DDZprofessionen.Seefahrer;
import helden.model.DDZprofessionen.Tierbaendiger;
import helden.model.profession.Schamane;
import java.util.ArrayList;

public class Nivesenstaemme
extends helden.model.kultur.Nivesenstaemme {
    public Nivesenstaemme() {
    }

    public Nivesenstaemme(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public String getID() {
        return "K67";
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        if (this.\u00f5\u00d3\u00f8000 == 0) {
            ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
            arrayList.add(G.\u00f8\u00f6\u00f5000);
            arrayList.add(G.\u00d8\u00f4\u00f5000);
            arrayList.add(G.O\u00d8\u00f5000);
            arrayList.add(G.o\u00f4\u00f5000);
            int[] nArray = new int[]{5};
            ++this.\u00f5\u00d3\u00f8000;
            return new o0oo_2(this, arrayList, nArray);
        }
        throw new c_1();
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        BasisDDZProfessionMitGeweihter basisDDZProfessionMitGeweihter;
        ArrayList<super> arrayList = new ArrayList<super>();
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        arrayList.add(new Fischer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Hirte(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        Jaeger jaeger = new Jaeger(this.getGeschlecht(), g2, g3);
        jaeger.removeMoeglicheVariante(jaeger.getWildhueter());
        arrayList.add(jaeger);
        arrayList.add(new Kundschafter(this.getGeschlecht(), g2, g3));
        Prospektor prospektor = new Prospektor(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        prospektor.clearMoeglicheVarianten();
        prospektor.addMoeglicheVariante(prospektor.getSammler());
        arrayList.add(prospektor);
        Handwerker handwerker = new Handwerker(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        handwerker.clearMoeglicheVarianten();
        handwerker.addMoeglicheVariante(handwerker.getArchaischeNordens());
        arrayList.add(handwerker);
        arrayList.add(new Tierbaendiger(this.getGeschlecht(), g2, g3));
        Schamane schamane = new Schamane(this.getGeschlecht(), g2, g3);
        schamane.clearMoeglicheVarianten();
        schamane.addMoeglicheVariante(schamane.getKjaskjua());
        arrayList.add(schamane);
        if (this.istVariante(\u00f4\u00d3\u00f8000)) {
            basisDDZProfessionMitGeweihter = new Seefahrer(this.getGeschlecht(), g2, g3);
            basisDDZProfessionMitGeweihter.clearMoeglicheVarianten();
            basisDDZProfessionMitGeweihter.addMoeglicheVariante(((Seefahrer)basisDDZProfessionMitGeweihter).getRobbenjaeger());
            arrayList.add(basisDDZProfessionMitGeweihter);
        }
        basisDDZProfessionMitGeweihter = new Haendler(this.getGeschlecht(), g2, g3);
        basisDDZProfessionMitGeweihter.clearMoeglicheVarianten();
        basisDDZProfessionMitGeweihter.addMoeglicheVariante(((Haendler)basisDDZProfessionMitGeweihter).getTauschhaendler());
        arrayList.add(basisDDZProfessionMitGeweihter);
        return arrayList;
    }

    @Override
    public G getSchrift() {
        return null;
    }
}

