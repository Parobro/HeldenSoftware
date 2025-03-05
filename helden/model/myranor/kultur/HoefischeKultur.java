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
import helden.framework.held.object.oooo_0;
import helden.framework.int.super;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.model.ProfessionenFabrik;
import helden.model.myranor.kultur.BasisMyranorKultur;
import helden.model.myranor.profession.Alshinjira;
import helden.model.myranor.profession.Athlet;
import helden.model.myranor.profession.BaLoa;
import helden.model.myranor.profession.Dieb;
import helden.model.myranor.profession.Gladiator;
import helden.model.myranor.profession.Handwerker;
import helden.model.myranor.profession.Heiler;
import helden.model.myranor.profession.Jaeger;
import helden.model.myranor.profession.Leibwaechter;
import helden.model.myranor.profession.LeonirAnimist;
import helden.model.myranor.profession.Matrose;
import helden.model.myranor.profession.Optimat;
import helden.model.myranor.profession.Ordnungshueter;
import helden.model.myranor.profession.Reiter;
import helden.model.myranor.profession.Schankdiener;
import helden.model.myranor.profession.Scholar;
import helden.model.myranor.profession.Schreiber;
import helden.model.myranor.profession.Shindramatha;
import helden.model.myranor.profession.SibylleMantiker;
import helden.model.myranor.profession.Soldaten;
import helden.model.myranor.profession.Tempelpriester;
import helden.model.myranor.profession.Tempelwaechter;
import helden.model.myranor.profession.UnabhaengigerMagier;
import java.util.ArrayList;

public class HoefischeKultur
extends BasisMyranorKultur {
    public HoefischeKultur() {
    }

    public HoefischeKultur(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(K.o00000(I.\u00d5\u00d6O000));
        arrayList.add(K.o00000(I.whilethissuper));
        arrayList.add(K.o00000(I.\u00f80\u00d2000));
        arrayList.add(K.o00000("Ausr\u00fcstungsvorteil"));
        arrayList.add(K.o00000("Besonderer Besitz"));
        arrayList.add(K.o00000("Gebildet"));
        arrayList.add(K.o00000("Guter Ruf"));
        arrayList.add(K.o00000("Honorat"));
        arrayList.add(K.o00000("Optimat"));
        arrayList.add(K.o00000("Resistenz gegen Gift"));
        arrayList.add(K.o00000("Soziale Anpassungsf\u00e4higkeit"));
        arrayList.add(K.o00000("Verbindungen"));
        arrayList.add(K.o00000("Arroganz"));
        arrayList.add(K.o00000("Eitelkeit"));
        arrayList.add(K.o00000("Faulheit"));
        arrayList.add(K.o00000("Krankhafte Reinlichkeit"));
        arrayList.add(K.o00000("Ungeduld"));
        arrayList.add(K.o00000("Schlechter Ruf"));
        arrayList.add(K.o00000("Verpflichtungen"));
        return arrayList;
    }

    @Override
    public String getID() {
        return "K188";
    }

    @Override
    public int getMaximalSozialstatus() {
        return 13;
    }

    @Override
    public void setAuswahlen() {
        this.\u00f5o0O00 = new ArrayList();
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        arrayList.add(N.floatsuper().\u00d200000("Dolche"));
        arrayList.add(N.floatsuper().\u00d200000("Ringen"));
        int[] nArray = new int[]{1};
        this.\u00f5o0O00.add(new o0oo_2(this, arrayList, nArray));
        arrayList = new ArrayList();
        arrayList.add(N.floatsuper().\u00d200000("Gaukeleien"));
        arrayList.add(N.floatsuper().\u00d200000("Reiten"));
        arrayList.add(N.floatsuper().\u00d200000("Selbstbeherrschung"));
        arrayList.add(N.floatsuper().\u00d200000("Sich verstecken"));
        arrayList.add(N.floatsuper().\u00d200000("Singen"));
        arrayList.add(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"));
        arrayList.add(N.floatsuper().\u00d200000("Tanzen"));
        arrayList.add(N.floatsuper().\u00d200000("Zechen"));
        int[] nArray2 = new int[]{1};
        this.\u00f5o0O00.add(new o0oo_2(this, arrayList, nArray2));
        arrayList = new ArrayList();
        arrayList.add(voidsuper.\u00f4o\u00d6000);
        arrayList.add(N.floatsuper().\u00d200000("Geografie"));
        arrayList.add(N.floatsuper().\u00d200000("Geschichtswissen"));
        arrayList.add(N.floatsuper().\u00d200000("G\u00f6tter und Kulte"));
        arrayList.add(N.floatsuper().\u00d200000("Heraldik"));
        arrayList.add(N.floatsuper().\u00d200000("Kriegskunst"));
        arrayList.add(N.floatsuper().\u00d200000("Kryptographie"));
        arrayList.add(N.floatsuper().\u00d200000("Magiekunde"));
        arrayList.add(N.floatsuper().\u00d200000("Philosophie"));
        arrayList.add(N.floatsuper().\u00d200000("Rechnen"));
        arrayList.add(N.floatsuper().\u00d200000("Rechtskunde"));
        arrayList.add(N.floatsuper().\u00d200000("Sagen und Legenden"));
        arrayList.add(N.floatsuper().\u00d200000("Sch\u00e4tzen"));
        arrayList.add(N.floatsuper().\u00d200000("Staatskunst"));
        arrayList.add(N.floatsuper().\u00d200000("Sternkunde"));
        int[] nArray3 = new int[]{2, 2, 1, 1};
        this.\u00f5o0O00.add(new o0oo_2(this, arrayList, nArray3));
        arrayList = new ArrayList();
        if (this.getSchrift() != null) {
            arrayList.add(this.getSchrift());
        } else {
            oooo_0.\u00d400000("Schrift is null. Muttersprache: " + this.getMuttersprache());
        }
        arrayList.addAll(this.getSetting().get(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
        int[] nArray4 = new int[]{4};
        this.\u00f5o0O00.add(new o0oo_2(this, arrayList, nArray4, "Schrift oder alte Form der Muttersprache"));
        arrayList = new ArrayList();
        arrayList.add(N.floatsuper().\u00d200000("Abrichten"));
        arrayList.add(N.floatsuper().\u00d200000("Alchimie"));
        arrayList.add(N.floatsuper().\u00d200000("Drucker"));
        arrayList.add(N.floatsuper().\u00d200000("Fahrzeug lenken"));
        arrayList.add(N.floatsuper().\u00d200000("Feinmechanik"));
        arrayList.add(N.floatsuper().\u00d200000("Handel"));
        arrayList.add(N.floatsuper().\u00d200000("Hauswirtschaft"));
        arrayList.add(N.floatsuper().\u00d200000("Heilkunde: Gift"));
        arrayList.add(N.floatsuper().\u00d200000("Kartografie"));
        arrayList.add(N.floatsuper().\u00d200000("Kochen"));
        arrayList.add(N.floatsuper().\u00d200000("Malen/Zeichnen"));
        arrayList.add(N.floatsuper().\u00d200000("Musizieren"));
        arrayList.add(voidsuper.O\u00d8\u00d5000);
        int[] nArray5 = new int[]{2, 1, 1};
        this.\u00f5o0O00.add(new o0oo_2(this, arrayList, nArray5));
        arrayList = new ArrayList();
        arrayList.addAll(this.getSetting().get(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.Objectsuper));
        int[] nArray6 = new int[]{3, 2, 1, 1, 1};
        this.\u00f5o0O00.add(new o0oo_2(this, arrayList, nArray6));
        arrayList = new ArrayList();
        arrayList.addAll(this.getSetting().get(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000));
        arrayList.remove(this.getMuttersprache());
        int[] nArray7 = new int[]{4};
        this.\u00f5o0O00.add(new o0oo_2(this, arrayList, nArray7));
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        ArrayList<super> arrayList = new ArrayList<super>();
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        arrayList.add(new Athlet(this.getGeschlecht(), g2, g3));
        arrayList.add(new Gladiator(this.getGeschlecht(), g2, g3));
        arrayList.add(new Leibwaechter(this.getGeschlecht(), g2, g3));
        arrayList.add(new Ordnungshueter(this.getGeschlecht(), g2, g3));
        arrayList.add(new Soldaten(this.getGeschlecht(), g2, g3));
        arrayList.add(new Jaeger(this.getGeschlecht(), g2, g3));
        arrayList.add(new Matrose(this.getGeschlecht(), g2, g3));
        arrayList.add(new Reiter(this.getGeschlecht(), g2, g3));
        arrayList.addAll(ProfessionenFabrik.getMyranorProfessionenGesellschaft(this.getGeschlecht(), g2, g3));
        arrayList.add(new Dieb(this.getGeschlecht(), g2, g3));
        arrayList.add(new Handwerker(this.getGeschlecht(), g2, g3));
        arrayList.add(new Heiler(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schankdiener(this.getGeschlecht(), g2, g3));
        arrayList.add(new Scholar(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schreiber(this.getGeschlecht(), g2, g3));
        arrayList.add(new Tempelpriester(this.getGeschlecht(), g2, g3));
        arrayList.add(new Tempelwaechter(this.getGeschlecht(), g2, g3));
        arrayList.add(new Alshinjira(this.getGeschlecht(), g2, g3));
        arrayList.add(new BaLoa(this.getGeschlecht(), g2, g3));
        arrayList.add(new Optimat(this.getGeschlecht(), g2, g3));
        arrayList.add(new Shindramatha(this.getGeschlecht(), g2, g3));
        arrayList.add(new SibylleMantiker(this.getGeschlecht(), g2, g3));
        arrayList.add(new UnabhaengigerMagier(this.getGeschlecht(), g2, g3));
        arrayList.add(new LeonirAnimist(this.getGeschlecht(), g2, g3));
        return arrayList;
    }

    @Override
    public String toString() {
        if (this.istMaennlich()) {
            return "H\u00f6fische Kultur" + super.toString();
        }
        return "H\u00f6fische Kultur" + super.toString();
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

