/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.kultur;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.Geschlecht;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.super;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.model.ProfessionenFabrik;
import helden.model.myranor.kultur.BasisMyranorKultur;
import helden.model.myranor.profession.Alshinjira;
import helden.model.myranor.profession.Athlet;
import helden.model.myranor.profession.BaLoa;
import helden.model.myranor.profession.Geisterwerker;
import helden.model.myranor.profession.Gladiator;
import helden.model.myranor.profession.Gossenschlaeger;
import helden.model.myranor.profession.Leibwaechter;
import helden.model.myranor.profession.LeonirAnimist;
import helden.model.myranor.profession.Makshamant;
import helden.model.myranor.profession.Matrose;
import helden.model.myranor.profession.Optimat;
import helden.model.myranor.profession.Ordnungshueter;
import helden.model.myranor.profession.Reiter;
import helden.model.myranor.profession.Runenmeister;
import helden.model.myranor.profession.Sadhaka;
import helden.model.myranor.profession.Sammler;
import helden.model.myranor.profession.Schiffskaempfer;
import helden.model.myranor.profession.Shanwada;
import helden.model.myranor.profession.Shindramatha;
import helden.model.myranor.profession.SibylleMantiker;
import helden.model.myranor.profession.Soldaten;
import helden.model.myranor.profession.Taucher;
import helden.model.myranor.profession.Tempelpriester;
import helden.model.myranor.profession.Tempelwaechter;
import helden.model.myranor.profession.Thulnail;
import helden.model.myranor.profession.UnabhaengigerMagier;
import helden.model.myranor.profession.Wanderhaendler;
import helden.model.myranor.profession.Wanderprediger;
import helden.model.myranor.profession.Yachzuq;
import helden.model.myranor.profession.Zaubertaenzer;
import java.util.ArrayList;

public class StaedtischeKultur
extends BasisMyranorKultur {
    public StaedtischeKultur() {
    }

    public StaedtischeKultur(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000("Ausr\u00fcstungsvorteil"));
        arrayList.add(K.o00000("Soziale Anpassungsf\u00e4higkeit"));
        arrayList.add(K.o00000("Verbindungen"));
        arrayList.add(K.o00000("Schulden"));
        return arrayList;
    }

    @Override
    public String getID() {
        return "K191";
    }

    @Override
    public int getMaximalSozialstatus() {
        return 11;
    }

    @Override
    public void setAuswahlen() {
        this.\u00f5o0O00 = new ArrayList();
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        arrayList.add(N.floatsuper().\u00d200000("Freies Fliegen"));
        arrayList.add(N.floatsuper().\u00d200000("Klettern"));
        arrayList.add(N.floatsuper().\u00d200000("Schleichen"));
        arrayList.add(N.floatsuper().\u00d200000("Sich verstecken"));
        arrayList.add(N.floatsuper().\u00d200000("Singen"));
        arrayList.add(N.floatsuper().\u00d200000("Tanzen"));
        arrayList.add(N.floatsuper().\u00d200000("Zechen"));
        int[] nArray = new int[]{1};
        this.\u00f5o0O00.add(new o0oo_2(this, arrayList, nArray));
        arrayList = new ArrayList();
        arrayList.add(voidsuper.\u00f4o\u00d6000);
        arrayList.add(N.floatsuper().\u00d200000("Geschichtswissen"));
        arrayList.add(N.floatsuper().\u00d200000("G\u00f6tter und Kulte"));
        arrayList.add(N.floatsuper().\u00d200000("Magiekunde"));
        arrayList.add(N.floatsuper().\u00d200000("Mechanik"));
        arrayList.add(N.floatsuper().\u00d200000("Rechnen"));
        arrayList.add(N.floatsuper().\u00d200000("Rechtskunde"));
        arrayList.add(N.floatsuper().\u00d200000("Sagen und Legenden"));
        arrayList.add(N.floatsuper().\u00d200000("Sch\u00e4tzen"));
        arrayList.add(N.floatsuper().\u00d200000("Staatskunst"));
        int[] nArray2 = new int[]{1, 1, 1, 1};
        this.\u00f5o0O00.add(new o0oo_2(this, arrayList, nArray2));
        arrayList = new ArrayList();
        arrayList.add(N.floatsuper().\u00d200000("Alchimie"));
        arrayList.add(N.floatsuper().\u00d200000("Brauer"));
        arrayList.add(N.floatsuper().\u00d200000("Drucker"));
        arrayList.add(N.floatsuper().\u00d200000("Fahrzeug lenken"));
        arrayList.add(N.floatsuper().\u00d200000("Falschspiel"));
        arrayList.add(N.floatsuper().\u00d200000("Feinmechanik"));
        arrayList.add(N.floatsuper().\u00d200000("Fleischer"));
        arrayList.add(N.floatsuper().\u00d200000("Gerber/K\u00fcrschner"));
        arrayList.add(N.floatsuper().\u00d200000("Grobschmied"));
        arrayList.add(N.floatsuper().\u00d200000("Handel"));
        arrayList.add(N.floatsuper().\u00d200000("Hauswirtschaft"));
        arrayList.add(N.floatsuper().\u00d200000("Heilkunde: Wunden"));
        arrayList.add(N.floatsuper().\u00d200000("Holzbearbeitung"));
        arrayList.add(N.floatsuper().\u00d200000("Kochen"));
        arrayList.add(N.floatsuper().\u00d200000("Lederarbeiten"));
        arrayList.add(N.floatsuper().\u00d200000("Malen/Zeichnen"));
        arrayList.add(N.floatsuper().\u00d200000("Maurer"));
        arrayList.add(N.floatsuper().\u00d200000("Musizieren"));
        arrayList.add(N.floatsuper().\u00d200000("Schl\u00f6sser knacken"));
        arrayList.add(N.floatsuper().\u00d200000("Schnaps brennen"));
        arrayList.add(N.floatsuper().\u00d200000("Schneidern"));
        arrayList.add(N.floatsuper().\u00d200000("Seiler"));
        arrayList.add(N.floatsuper().\u00d200000("Steinmetz"));
        arrayList.add(N.floatsuper().\u00d200000("Steinschneider/Juwelier"));
        arrayList.add(N.floatsuper().\u00d200000("Stellmacher"));
        arrayList.add(N.floatsuper().\u00d200000("Stoffe f\u00e4rben"));
        arrayList.add(N.floatsuper().\u00d200000("T\u00f6pfern"));
        arrayList.add(N.floatsuper().\u00d200000("Webkunst"));
        arrayList.add(N.floatsuper().\u00d200000("Zimmermann"));
        int[] nArray3 = new int[]{2, 2, 1, 1, 1, 1};
        this.\u00f5o0O00.add(new o0oo_2(this, arrayList, nArray3));
        arrayList = new ArrayList();
        arrayList.addAll(this.getSetting().get(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
        arrayList.remove(this.getMuttersprache());
        int[] nArray4 = new int[]{4, 4};
        this.\u00f5o0O00.add(new o0oo_2(this, arrayList, nArray4));
        arrayList = new ArrayList();
        arrayList.addAll(this.getSetting().get(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.Objectsuper));
        int[] nArray5 = new int[]{3, 2, 2, 1, 1};
        this.\u00f5o0O00.add(new o0oo_2(this, arrayList, nArray5));
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        ArrayList<super> arrayList = new ArrayList<super>();
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        arrayList.add(new Athlet(this.getGeschlecht(), g2, g3));
        arrayList.add(new Gladiator(this.getGeschlecht(), g2, g3));
        arrayList.add(new Gossenschlaeger(this.getGeschlecht(), g2, g3));
        arrayList.add(new Leibwaechter(this.getGeschlecht(), g2, g3));
        arrayList.add(new Ordnungshueter(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schiffskaempfer(this.getGeschlecht(), g2, g3));
        arrayList.add(new Soldaten(this.getGeschlecht(), g2, g3));
        arrayList.add(new Matrose(this.getGeschlecht(), g2, g3));
        arrayList.add(new Reiter(this.getGeschlecht(), g2, g3));
        arrayList.add(new Sammler(this.getGeschlecht(), g2, g3));
        arrayList.add(new Taucher(this.getGeschlecht(), g2, g3));
        arrayList.add(new Wanderhaendler(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getMyranorProfessionenGesellschaft(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getMyranorProfessionenHandwerker(this.getGeschlecht(), g2, g3));
        arrayList.add(new Tempelpriester(this.getGeschlecht(), g2, g3));
        arrayList.add(new Tempelwaechter(this.getGeschlecht(), g2, g3));
        arrayList.add(new Wanderprediger(this.getGeschlecht(), g2, g3));
        arrayList.add(new Alshinjira(this.getGeschlecht(), g2, g3));
        arrayList.add(new BaLoa(this.getGeschlecht(), g2, g3));
        arrayList.add(new Geisterwerker(this.getGeschlecht(), g2, g3));
        arrayList.add(new Makshamant(this.getGeschlecht(), g2, g3));
        arrayList.add(new Optimat(this.getGeschlecht(), g2, g3));
        arrayList.add(new Runenmeister(this.getGeschlecht(), g2, g3));
        arrayList.add(new Sadhaka(this.getGeschlecht(), g2, g3));
        arrayList.add(new Shanwada(this.getGeschlecht(), g2, g3));
        arrayList.add(new Shindramatha(this.getGeschlecht(), g2, g3));
        arrayList.add(new SibylleMantiker(this.getGeschlecht(), g2, g3));
        arrayList.add(new Thulnail(this.getGeschlecht(), g2, g3));
        arrayList.add(new UnabhaengigerMagier(this.getGeschlecht(), g2, g3));
        arrayList.add(new LeonirAnimist(this.getGeschlecht(), g2, g3));
        arrayList.add(new Yachzuq(this.getGeschlecht(), g2, g3));
        arrayList.add(new Zaubertaenzer(this.getGeschlecht(), g2, g3));
        return arrayList;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "St\u00e4dtische Kultur" + super.toString();
        }
        return "St\u00e4dtische Kultur" + super.toString();
    }

    @Override
    protected int getBasisGPKosten() {
        return 0;
    }

    @Override
    public boolean hatOptimatischeVariante() {
        return true;
    }
}

