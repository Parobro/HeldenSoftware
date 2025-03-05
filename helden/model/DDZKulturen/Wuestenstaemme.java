/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZKulturen;

import helden.framework.D.OOOo;
import helden.framework.D.OoOO.U;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.G;
import helden.framework.d.oooo_0;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.super;
import helden.model.DDZprofessionen.Entdecker;
import helden.model.DDZprofessionen.Gladiator;
import helden.model.DDZprofessionen.Goetterdiener;
import helden.model.DDZprofessionen.Handwerker;
import helden.model.DDZprofessionen.Hirte;
import helden.model.DDZprofessionen.Jaeger;
import helden.model.DDZprofessionen.Karawanenfuehrer;
import helden.model.DDZprofessionen.Kophta;
import helden.model.DDZprofessionen.Kundschafter;
import helden.model.DDZprofessionen.Mudramul;
import helden.model.DDZprofessionen.Schmuggler;
import helden.model.DDZprofessionen.Soeldner;
import helden.model.DDZprofessionen.Soldat;
import helden.model.DDZprofessionen.Stammeskrieger;
import helden.model.DDZprofessionen.Strassenraeuber;
import helden.model.kultur.Novadis;
import java.util.ArrayList;

public class Wuestenstaemme
extends Novadis {
    public Wuestenstaemme() {
    }

    public Wuestenstaemme(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public String getID() {
        return "K64";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "W\u00fcstenst\u00e4mme";
    }

    @Override
    public int getMaximalSozialstatus() {
        return 8;
    }

    @Override
    public G getMuttersprache() {
        return G.\u00f5\u00f6\u00f5000;
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        ArrayList<super> arrayList = new ArrayList<super>();
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        Stammeskrieger stammeskrieger = new Stammeskrieger(this.getGeschlecht(), g2, g3);
        stammeskrieger.clearMoeglicheVarianten();
        stammeskrieger.addMoeglicheVariante(stammeskrieger.getWuestenkrieger());
        arrayList.add(stammeskrieger);
        arrayList.add(new Gladiator(this.getGeschlecht(), g2, g3));
        arrayList.add(new Soeldner(this.getGeschlecht(), g2, g3));
        arrayList.add(new Soldat(this.getGeschlecht(), g2, g3));
        arrayList.add(new Entdecker(this.getGeschlecht(), g2, g3));
        arrayList.add(new Hirte(this.getGeschlecht(), g2, g3));
        arrayList.add(new Jaeger(this.getGeschlecht(), g2, g3));
        arrayList.add(new Karawanenfuehrer(this.getGeschlecht(), g2, g3));
        arrayList.add(new Kundschafter(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schmuggler(this.getGeschlecht(), g2, g3));
        Strassenraeuber strassenraeuber = new Strassenraeuber(this.getGeschlecht(), g2, g3);
        strassenraeuber.clearMoeglicheVarianten();
        strassenraeuber.addMoeglicheVariante(strassenraeuber.getBandit());
        arrayList.add(strassenraeuber);
        arrayList.add(new Handwerker(this.getGeschlecht(), g2, g3));
        arrayList.add(new Kophta(this.getGeschlecht(), g2, g3));
        arrayList.add(new Mudramul(this.getGeschlecht(), g2, g3));
        arrayList.add(new Goetterdiener(this.getGeschlecht(), g2, g3));
        return arrayList;
    }

    @Override
    public G getSchrift() {
        return G.\u00f8\u00f8\u00f4000;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = new OOOo();
        U u2 = (U)oooo_0.o00000("Kulturkunde");
        u2.\u00d500000(this.getKulturkundeBezeichnung());
        oOOo.o00000(u2);
        oOOo.o00000(oooo_0.o00000(while.\u00f5o\u00d5000.toString()));
        return oOOo;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = new ArrayList<for>();
        return arrayList;
    }

    @Override
    public String toString() {
        return "W\u00fcstenst\u00e4mme";
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(nullclassreturn);
        this.addAlleVarianten(forclassreturn);
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(nullclassreturn);
    }
}

