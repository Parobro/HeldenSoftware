/*
 * Decompiled with CFR 0.152.
 */
package helden.model.tharun.kultur;

import helden.framework.C.I;
import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.C.public;
import helden.framework.D.OOOo;
import helden.framework.D.P;
import helden.framework.Geschlecht;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.d.oooo_0;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.OooO;
import helden.framework.int.super;
import helden.framework.oOoO.for;
import helden.framework.oooo.b_0;
import helden.framework.oooo.c_1;
import helden.framework.oooo.o00o_0;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.model.tharun.profession.Brigantai;
import helden.model.tharun.profession.Kymanai;
import helden.model.tharun.profession.Masha;
import helden.model.tharun.profession.Maturai;
import helden.model.tharun.profession.NiedererAzaraiderNanurta;
import helden.model.tharun.profession.NiedererAzaraidesArkanZin;
import helden.model.tharun.profession.NiedererAzaraidesNuminoru;
import helden.model.tharun.profession.NiedererAzaraidesOjoSombri;
import helden.model.tharun.profession.NiedererAzaraidesPateshi;
import helden.model.tharun.profession.NiedererAzaraidesShinXirit;
import helden.model.tharun.profession.NiedererAzaraidesSindayru;
import helden.model.tharun.profession.NiedererAzaraidesZirraku;
import helden.model.tharun.profession.Numinai;
import java.util.ArrayList;

public abstract class BasisTharunKulturen
extends OooO
implements for {
    public static final helden.framework.int.P \u00f4\u00d60O00 = new helden.framework.int.P("Landbev\u00f6lkerung", 3, false);
    public static final helden.framework.int.P O\u00d80O00 = new helden.framework.int.P("Stadtbev\u00f6lkerung", 3, false);
    public static final helden.framework.int.P \u00d8\u00d60O00 = new helden.framework.int.P("H\u00f6fische Familie", 6, false);
    public static final helden.framework.int.P newifreturn = new helden.framework.int.P("Brigantaibande", 9, false);
    protected ArrayList<o0oo_2> \u00f5\u00d60O00;
    protected ArrayList<objectsuper_0> \u00f8\u00d60O00;
    protected ArrayList<o00o_0> o\u00d80O00;
    protected ArrayList<P> \u00d4\u00d60O00 = new ArrayList();
    protected Oo0O forintreturn = new Oo0O();
    protected int \u00d3\u00d80O00 = 0;
    protected int \u00d4\u00d80O00 = 0;
    protected int privateintreturn = 0;
    private String \u00d5\u00d60O00;

    public BasisTharunKulturen(Geschlecht geschlecht, String string) {
        super(geschlecht);
        this.\u00d5\u00d60O00 = string;
    }

    public BasisTharunKulturen(String string) {
        this.\u00d5\u00d60O00 = string;
    }

    @Override
    public void addAutomatischerVorteil(public public_) {
        this.forintreturn.\u00d300000(public_);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        if (this.istVariante(\u00f4\u00d60O00)) {
            this.addTalentwert(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 1);
            this.addTalentwert(N.floatsuper().\u00d200000("F\u00e4hrtensuchen"), 1);
            this.addTalentwert(N.floatsuper().\u00d200000("Orientierung"), 1);
            this.addTalentwert(N.floatsuper().\u00d200000("Wettervorhersage"), 2);
            this.addTalentwert(N.floatsuper().\u00d200000("Wildnisleben"), 1);
            this.addTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 2);
        }
        if (this.istVariante(O\u00d80O00)) {
            this.addTalentwert(N.floatsuper().\u00d200000("Etikette"), 1);
            this.addTalentwert(N.floatsuper().\u00d200000("Gassenwissen"), 2);
            this.addTalentwert(N.floatsuper().\u00d200000("Menschenkenntnis"), 1);
            this.addTalentwert(N.floatsuper().\u00d200000("\u00dcberreden"), 1);
            this.addTalentwert(voidsuper.nullObjectObject, 1);
            this.addTalentwert(N.floatsuper().\u00d200000("G\u00f6tter und Kulte"), 1);
            this.addTalentwert(N.floatsuper().\u00d200000("Heraldik"), 1);
            this.addTalentwert(N.floatsuper().\u00d200000("Rechnen"), 2);
            this.addTalentwert(N.floatsuper().\u00d200000("Rechtskunde"), 1);
            this.addTalentwert(N.floatsuper().\u00d200000("Sagen und Legenden"), 2);
            this.addTalentwert(N.floatsuper().\u00d200000("Sch\u00e4tzen"), 2);
            this.addTalentwert(N.floatsuper().\u00d200000("Hauswirtschaft"), 2);
            this.addTalentwert(N.floatsuper().\u00d200000("Kochen"), 2);
        }
        if (this.istVariante(\u00d8\u00d60O00)) {
            this.addTalentwert(N.floatsuper().\u00d200000("Dolche"), 2);
            this.addTalentwert(N.floatsuper().\u00d200000("Athletik"), 1);
            this.addTalentwert(N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"), 2);
            this.addTalentwert(N.floatsuper().\u00d200000("Selbstbeherrschung"), 2);
            this.addTalentwert(N.floatsuper().\u00d200000("Sich verstecken"), 1);
            this.addTalentwert(N.floatsuper().\u00d200000("Schleichen"), 1);
            this.addTalentwert(N.floatsuper().\u00d200000("Tanzen"), 1);
            this.addTalentwert(N.floatsuper().\u00d200000("Zechen"), 1);
            this.addTalentwert(N.floatsuper().\u00d200000("Etikette"), 2);
            this.addTalentwert(N.floatsuper().\u00d200000("Menschenkenntnis"), 1);
            this.addTalentwert(N.floatsuper().\u00d200000("\u00dcberreden"), 1);
            this.addTalentwert(N.floatsuper().\u00d200000("G\u00f6tter und Kulte"), 2);
            this.addTalentwert(N.floatsuper().\u00d200000("Heraldik"), 3);
            this.addTalentwert(N.floatsuper().\u00d200000("Rechnen"), 2);
            this.addTalentwert(N.floatsuper().\u00d200000("Rechtskunde"), 2);
            this.addTalentwert(N.floatsuper().\u00d200000("Hauswirtschaft"), 2);
            this.addTalentwert(N.floatsuper().\u00d200000("Kochen"), 1);
        }
        if (this.istVariante(newifreturn)) {
            this.addTalentwert(N.floatsuper().\u00d200000("Dolche"), 1);
            this.addTalentwert(N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"), 2);
            this.addTalentwert(N.floatsuper().\u00d200000("Schleichen"), 3);
            this.addTalentwert(N.floatsuper().\u00d200000("Selbstbeherrschung"), 1);
            this.addTalentwert(N.floatsuper().\u00d200000("Sich verstecken"), 3);
            this.addTalentwert(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 3);
            this.addTalentwert(N.floatsuper().\u00d200000("Etikette"), -1);
            this.addTalentwert(N.floatsuper().\u00d200000("F\u00e4hrtensuchen"), 2);
            this.addTalentwert(N.floatsuper().\u00d200000("Orientierung"), 2);
            this.addTalentwert(N.floatsuper().\u00d200000("Wildnisleben"), 2);
        }
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        if (this.istVariante(newifreturn)) {
            arrayList.add(K.o00000("Randgruppe"));
        }
        return arrayList;
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return this.\u00d5\u00d60O00;
    }

    @Override
    public int getMaximalSozialstatus() {
        if (this.istVariante(\u00f4\u00d60O00)) {
            return 7;
        }
        if (this.istVariante(O\u00d80O00)) {
            return 8;
        }
        if (this.istVariante(\u00d8\u00d60O00)) {
            return 99;
        }
        if (this.istVariante(newifreturn)) {
            return 6;
        }
        return 99;
    }

    @Override
    public objectsuper_0 getNextSonderfertigkeitAuswahl() {
        if (!this.hatMehrSonderfertigkeitAuswahl()) {
            throw new c_1();
        }
        return this.\u00f8\u00d60O00.get(this.\u00d4\u00d80O00++);
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        if (!this.hatMehrTalentAuswahl()) {
            throw new c_1();
        }
        return this.\u00f5\u00d60O00.get(this.\u00d3\u00d80O00++);
    }

    @Override
    public o00o_0 getNextVorteilAuswahl() {
        if (!this.hatMehrVorteilAuswahl()) {
            throw new c_1();
        }
        return this.o\u00d80O00.get(this.privateintreturn++);
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        ArrayList<super> arrayList = new ArrayList<super>();
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        arrayList.add(new Brigantai(this.getGeschlecht(), g2, g3));
        if (floatsuper2.Object(Bedingung.hat(Geschlecht.\u00d400000))) {
            NiedererAzaraiderNanurta niedererAzaraiderNanurta = new NiedererAzaraiderNanurta(this.getGeschlecht(), g2, g3);
            niedererAzaraiderNanurta.clearMoeglicheVarianten();
            niedererAzaraiderNanurta.addMoeglicheVariante(niedererAzaraiderNanurta.getNiedererAzaraiderNanurtaM());
            arrayList.add(niedererAzaraiderNanurta);
            arrayList.add(new Numinai(this.getGeschlecht(), g2, g3));
            arrayList.add(new Kymanai(this.getGeschlecht(), g2, g3));
            arrayList.add(new Maturai(this.getGeschlecht(), g2, g3));
            arrayList.add(new NiedererAzaraidesArkanZin(this.getGeschlecht(), g2, g3));
            arrayList.add(new NiedererAzaraidesNuminoru(this.getGeschlecht(), g2, g3));
            arrayList.add(new NiedererAzaraidesOjoSombri(this.getGeschlecht(), g2, g3));
            arrayList.add(new NiedererAzaraidesPateshi(this.getGeschlecht(), g2, g3));
            NiedererAzaraidesShinXirit niedererAzaraidesShinXirit = new NiedererAzaraidesShinXirit(this.getGeschlecht(), g2, g3);
            niedererAzaraidesShinXirit.clearMoeglicheVarianten();
            niedererAzaraidesShinXirit.addMoeglicheVariante(niedererAzaraidesShinXirit.getNiedererAzaraidesShinXirit());
            arrayList.add(niedererAzaraidesShinXirit);
            arrayList.add(new NiedererAzaraidesSindayru(this.getGeschlecht(), g2, g3));
            NiedererAzaraidesZirraku niedererAzaraidesZirraku = new NiedererAzaraidesZirraku(this.getGeschlecht(), g2, g3);
            niedererAzaraidesZirraku.clearMoeglicheVarianten();
            niedererAzaraidesZirraku.addMoeglicheVariante(niedererAzaraidesZirraku.getNiedererAzaraidesZirraku());
            arrayList.add(niedererAzaraidesZirraku);
        } else {
            NiedererAzaraiderNanurta niedererAzaraiderNanurta = new NiedererAzaraiderNanurta(this.getGeschlecht(), g2, g3);
            niedererAzaraiderNanurta.clearMoeglicheVarianten();
            niedererAzaraiderNanurta.addMoeglicheVariante(niedererAzaraiderNanurta.getNiedererAzaraiderNanurtaW());
            arrayList.add(niedererAzaraiderNanurta);
            arrayList.add(new Masha(this.getGeschlecht(), g2, g3));
        }
        return arrayList;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        OOOo oOOo = new OOOo();
        if (this.istVariante(\u00f4\u00d60O00)) {
            oOOo.o00000(oooo_0.o00000("Ortskenntnis", "Landstrich"));
        }
        if (this.istVariante(O\u00d80O00) || this.istVariante(\u00d8\u00d60O00)) {
            oOOo.o00000(oooo_0.o00000("Ortskenntnis", "Stadt"));
        }
        oOOo.o00000(this.\u00d4\u00d60O00);
        return oOOo;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        return new ArrayList<I>();
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = new Oo0O();
        if (this.istVariante(\u00f4\u00d60O00)) {
            oo0O.\u00d300000(K.o00000("Aberglaube", 5));
            oo0O.\u00d300000(K.o00000("Ungebildet", 2));
        }
        if (this.istVariante(O\u00d80O00)) {
            oo0O.\u00d300000(K.o00000("Aberglaube", 5));
            oo0O.\u00d300000(K.o00000(I.O\u00d5o000, "Abschaum (Briganta, Namenlose)", 5));
        }
        if (this.istVariante(\u00d8\u00d60O00)) {
            oo0O.\u00d300000(K.o00000("Mitglied einer Herrscherfamilie"));
            oo0O.\u00d300000(K.o00000(I.O\u00d5o000, "Abschaum", 8));
        }
        if (this.istVariante(newifreturn)) {
            oo0O.\u00d300000(K.o00000("Aberglaube", 5));
            oo0O.\u00d300000(K.o00000(I.O\u00d5o000, "Obrigkeit", 6));
        }
        oo0O.new(this.forintreturn);
        return oo0O;
    }

    @Override
    public boolean hatMehrSonderfertigkeitAuswahl() {
        if (this.\u00f5\u00d60O00 == null) {
            this.setAuswahlen();
        }
        return this.\u00d4\u00d80O00 < this.\u00f8\u00d60O00.size();
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        if (this.\u00f5\u00d60O00 == null) {
            this.setAuswahlen();
        }
        return this.\u00d3\u00d80O00 < this.\u00f5\u00d60O00.size();
    }

    @Override
    public boolean hatMehrVorteilAuswahl() {
        if (this.o\u00d80O00 == null) {
            this.setAuswahlen();
        }
        return this.privateintreturn < this.o\u00d80O00.size();
    }

    @Override
    public String toString() {
        if (this.getGewaehlteVarianten().size() > 0) {
            return this.\u00d5\u00d60O00 + " (" + this.getVariante().toString() + ")";
        }
        return this.\u00d5\u00d60O00;
    }

    @Override
    public void waehleSonderfertigkeit(P p2) {
        this.\u00d4\u00d60O00.add(p2);
    }

    @Override
    protected int getBasisGPKosten() {
        return 0;
    }

    protected void setAuswahlen() {
        int[] nArray;
        int[] nArray2;
        ArrayList<oo0o_0> arrayList;
        this.\u00f5\u00d60O00 = new ArrayList();
        this.\u00f8\u00d60O00 = new ArrayList();
        this.o\u00d80O00 = new ArrayList();
        if (this.istVariante(\u00f4\u00d60O00)) {
            arrayList = new ArrayList<oo0o_0>();
            arrayList.add(N.floatsuper().\u00d200000("Athletik"));
            arrayList.add(N.floatsuper().\u00d200000("Klettern"));
            arrayList.add(N.floatsuper().\u00d200000("Schwimmen"));
            nArray2 = new int[]{1};
            this.\u00f5\u00d60O00.add(new o0oo_2(this, arrayList, nArray2));
            arrayList = new ArrayList();
            arrayList.add(N.floatsuper().\u00d200000("Pflanzenkunde"));
            arrayList.add(N.floatsuper().\u00d200000("Tierkunde"));
            nArray = new int[]{1};
            this.\u00f5\u00d60O00.add(new o0oo_2(this, arrayList, nArray));
            this.\u00f8\u00d60O00.add(new objectsuper_0(this, this.getSetting().getGelaendekunden(), 1));
        }
        if (this.istVariante(O\u00d80O00)) {
            arrayList = new ArrayList();
            arrayList.add(N.floatsuper().\u00d200000("Singen"));
            arrayList.add(N.floatsuper().\u00d200000("Tanzen"));
            arrayList.add(N.floatsuper().\u00d200000("Zechen"));
            nArray2 = new int[]{1};
            this.\u00f5\u00d60O00.add(new o0oo_2(this, arrayList, nArray2));
            arrayList.add(voidsuper.thisclassObject);
            arrayList.add(N.floatsuper().\u00d200000("Brauer"));
            arrayList.add(N.floatsuper().\u00d200000("Feinmechanik"));
            arrayList.add(N.floatsuper().\u00d200000("Feuersteinbearbeitung"));
            arrayList.add(N.floatsuper().\u00d200000("Fleischer"));
            arrayList.add(N.floatsuper().\u00d200000("Glaskunst"));
            arrayList.add(voidsuper.\u00f5\u00d8\u00d5000);
            arrayList.add(N.floatsuper().\u00d200000("Instrumentenbauer"));
            arrayList.add(N.floatsuper().\u00d200000("Lederarbeiten"));
            arrayList.add(N.floatsuper().\u00d200000("Maurer"));
            arrayList.add(N.floatsuper().\u00d200000("Metallguss"));
            arrayList.add(N.floatsuper().\u00d200000("Musizieren"));
            arrayList.add(voidsuper.ififObject);
            arrayList.add(N.floatsuper().\u00d200000("Schneidern"));
            arrayList.add(N.floatsuper().\u00d200000("Seiler"));
            arrayList.add(N.floatsuper().\u00d200000("Steinmetz"));
            arrayList.add(N.floatsuper().\u00d200000("Steinschneider/Juwelier"));
            arrayList.add(N.floatsuper().\u00d200000("Stoffe f\u00e4rben"));
            arrayList.add(N.floatsuper().\u00d200000("T\u00f6pfern"));
            arrayList.add(N.floatsuper().\u00d200000("Webkunst"));
            arrayList.add(N.floatsuper().\u00d200000("Zimmermann"));
            nArray = new int[]{4, 2};
            this.\u00f5\u00d60O00.add(new o0oo_2(this, arrayList, nArray));
        }
        if (this.istVariante(\u00d8\u00d60O00)) {
            arrayList = new ArrayList();
            arrayList.add((oo0o_0)((Object)K.o00000(I.O\u00f4O000, 5)));
            arrayList.add((oo0o_0)((Object)K.o00000(I.\u00d40O000, 5)));
            arrayList.add((oo0o_0)((Object)K.o00000(I.o\u00f8o000, 6)));
            this.o\u00d80O00.add(new o00o_0(this, arrayList, 1));
        }
        if (this.istVariante(newifreturn)) {
            arrayList = new ArrayList();
            arrayList.addAll(N.floatsuper().super(this.getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d6O0000));
            arrayList.addAll(N.floatsuper().super(this.getSetting(), oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.do));
            nArray2 = new int[]{2, 1};
            this.\u00f5\u00d60O00.add(new o0oo_2(this, arrayList, nArray2));
            arrayList = new ArrayList();
            arrayList.add(N.floatsuper().\u00d200000("Athletik"));
            arrayList.add(N.floatsuper().\u00d200000("Klettern"));
            arrayList.add(N.floatsuper().\u00d200000("Schwimmen"));
            nArray = new int[]{2};
            this.\u00f5\u00d60O00.add(new o0oo_2(this, arrayList, nArray));
            arrayList = new ArrayList();
            arrayList.add(N.floatsuper().\u00d200000("Fallen stellen"));
            arrayList.add(N.floatsuper().\u00d200000("Fesseln/Entfesseln"));
            arrayList.add(N.floatsuper().\u00d200000("Fischen/Angeln"));
            int[] nArray3 = new int[]{2, 1};
            this.\u00f5\u00d60O00.add(new o0oo_2(this, arrayList, nArray3));
            arrayList = new ArrayList();
            arrayList.add(N.floatsuper().\u00d200000("Pflanzenkunde"));
            arrayList.add(N.floatsuper().\u00d200000("Tierkunde"));
            int[] nArray4 = new int[]{1};
            this.\u00f5\u00d60O00.add(new o0oo_2(this, arrayList, nArray4));
            arrayList = new ArrayList();
            arrayList.add(voidsuper.thisclassObject);
            arrayList.add(voidsuper.\u00f80\u00d8000);
            arrayList.add(voidsuper.\u00d5\u00d5\u00d6000);
            arrayList.add(voidsuper.\u00d3\u00d8\u00d5000);
            arrayList.add(voidsuper.\u00d4\u00d4\u00d5000);
            arrayList.add(voidsuper.returnifObject);
            arrayList.add(voidsuper.o\u00f6\u00d6000);
            int[] nArray5 = new int[]{2, 1};
            this.\u00f5\u00d60O00.add(new o0oo_2(this, arrayList, nArray5));
            this.\u00f8\u00d60O00.add(new objectsuper_0(this, this.getSetting().getGelaendekunden(), 1));
        }
    }

    @Override
    protected void setzeAlleVarianten() {
        this.addAlleVarianten(\u00f4\u00d60O00);
        this.addAlleVarianten(O\u00d80O00);
        this.addAlleVarianten(\u00d8\u00d60O00);
        this.addAlleVarianten(newifreturn);
    }

    @Override
    protected void setzeModifikationen() {
        this.putModifikator(b_0.void("LeP"), 1);
        this.putModifikator(b_0.void("AuP"), 1);
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        this.addMoeglicheVariante(\u00f4\u00d60O00);
        this.addMoeglicheVariante(O\u00d80O00);
        this.addMoeglicheVariante(\u00d8\u00d60O00);
        this.addMoeglicheVariante(newifreturn);
    }
}

