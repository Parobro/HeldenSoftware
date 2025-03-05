/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZKulturen;

import helden.framework.D.OOOo;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.d.oooo_0;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.super;
import helden.framework.oOoO.returnsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.Bader;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.Bettler;
import helden.model.DDZprofessionen.BosMagier;
import helden.model.DDZprofessionen.Botenreiter;
import helden.model.DDZprofessionen.Dieb;
import helden.model.DDZprofessionen.Druide;
import helden.model.DDZprofessionen.Edelhandwerker;
import helden.model.DDZprofessionen.Fernhaendler;
import helden.model.DDZprofessionen.Gardist;
import helden.model.DDZprofessionen.Gelehrter;
import helden.model.DDZprofessionen.Goetterdiener;
import helden.model.DDZprofessionen.Grosswildjaeger;
import helden.model.DDZprofessionen.Haendler;
import helden.model.DDZprofessionen.Karawanenfuehrer;
import helden.model.DDZprofessionen.Kurtisane;
import helden.model.DDZprofessionen.Lakai;
import helden.model.DDZprofessionen.Rattenfaenger;
import helden.model.DDZprofessionen.Schreiber;
import helden.model.DDZprofessionen.Soeldner;
import helden.model.DDZprofessionen.Soldat;
import helden.model.DDZprofessionen.Spitzel;
import helden.model.DDZprofessionen.Streuner;
import helden.model.DDZprofessionen.Tierbaendiger;
import helden.model.DDZprofessionen.TochterSatu;
import helden.model.ProfessionenFabrik;
import helden.model.profession.Schelm;
import java.util.ArrayList;

public class AndergastNostria
extends helden.model.kultur.AndergastNostria {
    private int \u00d3\u00f6\u00f6000 = 0;

    public AndergastNostria() {
    }

    public AndergastNostria(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        super.bestimmeTalentwerte(n);
        this.removeTalent(E.\u00f4\u00d6\u00d8000);
    }

    @Override
    public String getID() {
        return "K72";
    }

    @Override
    public G getMuttersprache() {
        return G.\u00d3\u00f8\u00f5000;
    }

    @Override
    public returnsuper getNextTaPVerteilAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.\u00d3\u00f6\u00f6000) {
            case 0: {
                arrayList.add(G.\u00d8\u00f4\u00f5000);
                arrayList.add(G.O\u00d8\u00f5000);
                arrayList.add(G.\u00d8\u00d3\u00f5000);
                ++this.\u00d3\u00f6\u00f6000;
                return new returnsuper(this, arrayList, 4, 4);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        BasisDDZProfessionMitGeweihter basisDDZProfessionMitGeweihter;
        ArrayList<super> arrayList = new ArrayList<super>();
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        arrayList.add(new Gardist(this.getGeschlecht(), g2, g3));
        arrayList.add(new Soldat(this.getGeschlecht(), g2, g3));
        arrayList.add(new Soeldner(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getDDZProfessionenReiseWildnis(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Botenreiter(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Fernhaendler(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Grosswildjaeger(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Karawanenfuehrer(this.getGeschlecht(), g2, g3));
        arrayList.add(new Bettler(this.getGeschlecht(), g2, g3));
        arrayList.add(new Dieb(this.getGeschlecht(), g2, g3));
        arrayList.add(new Haendler(this.getGeschlecht(), g2, g3));
        if (!this.istMaennlich()) {
            basisDDZProfessionMitGeweihter = new Kurtisane(this.getGeschlecht(), g2, g3);
            basisDDZProfessionMitGeweihter.clearMoeglicheVarianten();
            basisDDZProfessionMitGeweihter.addMoeglicheVariante(((Kurtisane)basisDDZProfessionMitGeweihter).getHure());
            arrayList.add(basisDDZProfessionMitGeweihter);
        }
        arrayList.add(new Spitzel(this.getGeschlecht(), g2, g3));
        arrayList.add(new Streuner(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getDDZProfessionenHandwerkWissen(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Bader(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Tierbaendiger(this.getGeschlecht(), g2, g3));
        basisDDZProfessionMitGeweihter = new Tierbaendiger(this.getGeschlecht(), g2, g3);
        basisDDZProfessionMitGeweihter.removeMoeglicheVariante(((Tierbaendiger)basisDDZProfessionMitGeweihter).getChimaerenbaendiger());
        arrayList.add(basisDDZProfessionMitGeweihter);
        arrayList.remove(new Edelhandwerker(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Gelehrter(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Lakai(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Rattenfaenger(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Schreiber(this.getGeschlecht(), g2, g3));
        Druide druide = new Druide(this.getGeschlecht(), g2, g3);
        druide.removeMoeglicheVariante(druide.getMehrerderMacht());
        arrayList.add(druide);
        arrayList.add(new BosMagier(this.getGeschlecht(), g2, g3));
        arrayList.add(new TochterSatu(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schelm(this.getGeschlecht(), g2, g3));
        arrayList.add(new Goetterdiener(this.getGeschlecht(), g2, g3));
        return arrayList;
    }

    @Override
    public G getSchrift() {
        return G.\u00d40\u00f6000;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = super.getSonderfertigkeiten();
        oOOo.\u00d200000(oooo_0.o00000(while.\u00d2\u00d6\u00d2000.toString()));
        return oOOo;
    }

    @Override
    public boolean hatMehrTaPVerteilAuswahl() {
        return this.\u00d3\u00f6\u00f6000 < 1;
    }

    @Override
    protected int getBasisGPKosten() {
        return 3;
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(\u00f5\u00f5\u00f6000);
        this.addAlleVarianten(whileforclass);
        this.addAlleVarianten(\u00f8\u00f5\u00f6000);
    }

    @Override
    protected void setzeModifikationen() {
        super.setzeModifikationen();
        this.putModifikator(b_0.thispublicsuper, -1);
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(\u00f5\u00f5\u00f6000);
        this.addMoeglicheVariante(whileforclass);
        this.addMoeglicheVariante(\u00f8\u00f5\u00f6000);
    }
}

