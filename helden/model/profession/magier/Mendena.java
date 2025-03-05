/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.magier;

import helden.framework.C.I;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.OOoO.K;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.a.b_0;
import helden.framework.oooo.a.oooo_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.framework.zauber.ZauberFabrik;
import helden.model.profession.magier.StandardMagierVariante;
import java.util.ArrayList;

public class Mendena
extends StandardMagierVariante {
    protected Mendena(String string, int n) {
        super("Akademie f\u00fcr Beschw\u00f6rung und gem. Magie im Heer zu Mendena: " + string, n);
        ArrayList<G> arrayList = new ArrayList<G>();
        arrayList.add(G.whilewhileString);
        this.setZweitLehrsprache(arrayList);
    }

    @Override
    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = super.getBesondererBesitzMoeglichkeiten();
        arrayList.add("MEMORAN-Artefakt (drei Ladungen; aufladbar)");
        arrayList.add("ATTRIBUTO-Artefakt (drei Ladungen; aufladbar)");
        arrayList.add("umfassendes Kartenwerk einer Region");
        return arrayList;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(helden.framework.C.K.o00000("Besonderer Besitz"));
        arrayList.add(helden.framework.C.K.o00000("Gefahreninstinkt"));
        arrayList.add(helden.framework.C.K.o00000("Arroganz"));
        arrayList.add(helden.framework.C.K.o00000("Blutdurst"));
        arrayList.add(helden.framework.C.K.o00000("Einbildungen"));
        arrayList.add(helden.framework.C.K.o00000("Feind"));
        arrayList.add(helden.framework.C.K.o00000("Jagdfieber"));
        arrayList.add(helden.framework.C.K.o00000("Meeresangst"));
        arrayList.add(helden.framework.C.K.o00000("Schlechter Ruf"));
        arrayList.add(helden.framework.C.K.o00000("Streitsucht"));
        arrayList.add(helden.framework.C.K.o00000("Wahnvorstellungen"));
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 12;
    }

    @Override
    public int getMinimalEigenschaftswert(helden.framework.oooo.b_0 b_02) {
        if (b_02.equals(helden.framework.oooo.b_0.void("MU"))) {
            return 13;
        }
        if (b_02.equals(helden.framework.oooo.b_0.void("KL"))) {
            return 13;
        }
        if (b_02.equals(helden.framework.oooo.b_0.void("IN"))) {
            return 12;
        }
        if (b_02.equals(helden.framework.oooo.b_0.\u00f5\u00f5\u00d2000)) {
            return 7;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(helden.framework.d.oooo_0.o00000("Eiserner Wille I"));
        arrayList.add(helden.framework.d.oooo_0.o00000("Verbotene Pforten"));
        arrayList.add(helden.framework.d.oooo_0.o00000("Zauberkontrolle"));
        arrayList.add(helden.framework.d.oooo_0.o00000("Zauberroutine"));
        arrayList.add(helden.framework.d.oooo_0.o00000("Gro\u00dfe Meditation"));
        arrayList.add(helden.framework.d.oooo_0.o00000(while.StringwhileString.toString()));
        arrayList.add(helden.framework.d.oooo_0.o00000(while.\u00d8\u00d5\u00d2000.toString()));
        arrayList.add(helden.framework.d.oooo_0.o00000(while.\u00d6\u00f6o000.toString()));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Dolche"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("St\u00e4be"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Selbstbeherrschung"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lehren"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberreden"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberzeugen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Orientierung"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Baukunst"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Geografie"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Geschichtswissen"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("G\u00f6tter und Kulte"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heraldik"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Kriegskunst"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Kryptographie"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Magiekunde"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechnen"), 6);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechtskunde"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sprachenkunde"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Staatskunst"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sternkunde"), 1);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sprachen kennen Bosparano"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sprachen kennen Zhayad"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lesen/Schreiben Kusliker Zeichen"), 8);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lesen/Schreiben Zhayad"), 6);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Anatomie"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heilkunde: Wunden"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Malen/Zeichnen"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Kartografie"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Handel"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Seefahrt"), 2);
        k_02.\u00d200000(this.getZauber("Attributo"), 7);
        k_02.\u00d200000(this.getZauber("Memorans"), 5);
        k_02.\u00d200000(this.getZauber("Salander"), 5);
        k_02.\u00d200000(this.getZauber("Analys"), 3);
        k_02.\u00d200000(this.getZauber("Adlerauge"), 3);
        k_02.\u00d200000(this.getZauber("Adlerschwinge"), 4);
        k_02.\u00d200000(this.getZauber("Axxeleratus"), 3);
        k_02.\u00d200000(this.getZauber("Blick in die Gedanken"), 2);
        k_02.\u00d200000(this.getZauber("Gardianum"), 2);
        k_02.\u00d200000(this.getZauber("Imperavi"), 4);
        k_02.\u00d200000(this.getZauber("Invocatio minor"), 4);
        k_02.\u00d200000(this.getZauber("Invocatio maior"), 2);
        k_02.\u00d200000(this.getZauber("Unitatio"), 3);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        arrayList.add(helden.framework.C.K.o00000("Gerechtigkeitswahn"));
        arrayList.add(helden.framework.C.K.o00000("Totenangst"));
        return arrayList;
    }

    @Override
    public ArrayList<oooo_0> getVerallgemeinteListenAuswahlen() {
        ArrayList<oooo_0> arrayList = new ArrayList<oooo_0>();
        oooo_0 oooo_02 = new oooo_0(1, this);
        arrayList.add(oooo_02);
        oooo_02.o00000(new b_0(helden.framework.d.oooo_0.o00000(while.\u00d2oO000), for.o00000(helden.framework.d.oooo_0.o00000(while.ifdoObject)).get(0), for.o00000(helden.framework.d.oooo_0.o00000(while.\u00f5\u00d2\u00d6000)).get(0)));
        oooo_02.o00000(new b_0(helden.framework.d.oooo_0.o00000(while.ifdoObject), for.o00000(helden.framework.d.oooo_0.o00000(while.\u00d2oO000)).get(0), for.o00000(helden.framework.d.oooo_0.o00000(while.\u00f5\u00d2\u00d6000)).get(0)));
        oooo_02.o00000(new b_0(helden.framework.d.oooo_0.o00000(while.\u00f5\u00d2\u00d6000), for.o00000(helden.framework.d.oooo_0.o00000(while.\u00d2oO000)).get(0), for.o00000(helden.framework.d.oooo_0.o00000(while.ifdoObject)).get(0)));
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.addAll(for.\u00d200000("Astrale Meditation"));
        arrayList.addAll(for.\u00d200000("Eiserner Wille II"));
        arrayList.addAll(for.\u00d200000("Konzentrationsst\u00e4rke"));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000("Arroganz", 6));
        oo0O.\u00d300000(helden.framework.C.K.o00000("Gesucht", 2));
        oo0O.\u00d300000(helden.framework.C.K.o00000("Randgruppe", "potenzielle D\u00e4monenverehrer"));
        return oo0O;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        waehlbareZauber.addAll(ZauberFabrik.getInstance().mindestVerbreitung(4, K.\u00f8O0000, this.getSetting()));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d3O\u00d4000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.O\u00d4\u00d3000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00f4\u00f4\u00d3000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d80\u00d3000, K.\u00f8O0000, ""));
        waehlbareZauber.add(KonkreterZauber.getZauber(Zauber.\u00d4\u00d5\u00d4000, K.\u00f8O0000, ""));
        return waehlbareZauber;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        arrayList.add(this.getZauber("Attributo"));
        arrayList.add(this.getZauber("Memorans"));
        arrayList.add(this.getZauber("Salander"));
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }

    protected KonkreterZauber getZauber(String string) {
        for (Zauber zauber : ZauberFabrik.getInstance().getAlleZauber()) {
            if (!zauber.toString().toLowerCase().startsWith(string.toLowerCase())) continue;
            string = zauber.toString();
            break;
        }
        return KonkreterZauber.getZauber(string, K.\u00f8O0000, "");
    }
}

