/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZKulturen;

import helden.framework.D.OOOo;
import helden.framework.D.OoOO.U;
import helden.framework.D.while;
import helden.framework.Geschlecht;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.d.oooo_0;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.super;
import helden.framework.oooo.c_1;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.Ausrufer;
import helden.model.DDZprofessionen.Bader;
import helden.model.DDZprofessionen.Barde;
import helden.model.DDZprofessionen.Entdecker;
import helden.model.DDZprofessionen.Fernhaendler;
import helden.model.DDZprofessionen.Fuhrmann;
import helden.model.DDZprofessionen.Gaukler;
import helden.model.DDZprofessionen.Gelehrter;
import helden.model.DDZprofessionen.Gladiator;
import helden.model.DDZprofessionen.Goetterdiener;
import helden.model.DDZprofessionen.Grosswildjaeger;
import helden.model.DDZprofessionen.Haendler;
import helden.model.DDZprofessionen.Handwerker;
import helden.model.DDZprofessionen.Jaeger;
import helden.model.DDZprofessionen.Kundschafter;
import helden.model.DDZprofessionen.Prospektor;
import helden.model.DDZprofessionen.Schiffer;
import helden.model.DDZprofessionen.Schmuggler;
import helden.model.DDZprofessionen.Soeldner;
import helden.model.DDZprofessionen.Streuner;
import helden.model.DDZprofessionen.Tierbaendiger;
import helden.model.DDZprofessionen.Wirt;
import helden.model.DDZprofessionen.Wundarzt;
import helden.model.kultur.Norbardensippe;
import helden.model.profession.Zibilja;
import java.util.ArrayList;

public class Serrach
extends Norbardensippe {
    private int \u00d4\u00d4\u00f8000 = 0;

    public Serrach() {
    }

    public Serrach(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public String getID() {
        return "K81";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Serrach";
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.\u00d4\u00d4\u00f8000) {
            case 0: {
                arrayList.add(E.\u00d4\u00d6\u00d8000);
                arrayList.add(E.\u00d3\u00d6\u00d8000);
                arrayList.add(E.\u00d5\u00d4\u00d8000);
                int[] nArray = new int[]{1};
                ++this.\u00d4\u00d4\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 1: {
                arrayList.add(E.o\u00d6\u00d8000);
                arrayList.add(E.\u00d3\u00d4\u00d8000);
                int[] nArray = new int[]{1};
                ++this.\u00d4\u00d4\u00f8000;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 2: {
                arrayList.add(G.o\u00f4\u00f5000);
                arrayList.add(G.\u00d8\u00f4\u00f5000);
                arrayList.add(G.nullsuperclass);
                arrayList.add(G.O\u00d8\u00f5000);
                int[] nArray = new int[]{3};
                ++this.\u00d4\u00d4\u00f8000;
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
        arrayList.add(new Gladiator(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Soeldner(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Entdecker(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Fernhaendler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Fuhrmann(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Grosswildjaeger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Jaeger(this.getGeschlecht(), g2, g3));
        arrayList.add(new Kundschafter(this.getGeschlecht(), g2, g3));
        arrayList.add(new Prospektor(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schiffer(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schmuggler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Barde(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Gaukler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Haendler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Streuner(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Ausrufer(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Bader(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Gelehrter(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Handwerker(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Tierbaendiger(this.getGeschlecht(), g2, g3));
        arrayList.add(new Wirt(this.getGeschlecht(), g2, g3));
        arrayList.add(new Wundarzt(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        arrayList.add(new Zibilja(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift()));
        Haendler haendler = new Haendler(this.getGeschlecht(), g2, g3);
        arrayList.remove(haendler);
        haendler.addMoeglicheVariante(haendler.getTauschhaendler());
        arrayList.add(haendler);
        arrayList.add(new Goetterdiener(this.getGeschlecht(), g2, g3));
        return arrayList;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = super.getSonderfertigkeiten();
        U u2 = (U)oooo_0.o00000(while.\u00d2o\u00f5000);
        u2.\u00d500000(this.getKulturkundeBezeichnung());
        oOOo.o00000(u2);
        return oOOo;
    }

    @Override
    public boolean hatMehrSprachenAuswahl() {
        return false;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        return this.\u00d4\u00d4\u00f8000 < 3;
    }

    @Override
    public String toString() {
        return "Serrach";
    }

    @Override
    protected int getBasisGPKosten() {
        return 7;
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(o\u00d4\u00f8000);
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(o\u00d4\u00f8000);
    }
}

