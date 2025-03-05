/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.int;

import helden.framework.C.I;
import helden.framework.C.Oo0O;
import helden.framework.D.OOOo;
import helden.framework.D.for;
import helden.framework.Geschlecht;
import helden.framework.NichtUeberschriebenException;
import helden.framework.OOoO.K;
import helden.framework.OoOO.G;
import helden.framework.OoOO.interface;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.framework.held.Object.floatsuper;
import helden.framework.held.Object.public;
import helden.framework.held.object.oooo_0;
import helden.framework.int.L;
import helden.framework.int.P;
import helden.framework.oOoO.F;
import helden.framework.oOoO.T;
import helden.framework.oOoO.Z;
import helden.framework.oOoO.publicsuper;
import helden.framework.oOoO.returnsuper;
import helden.framework.oOoO.void;
import helden.framework.oooo.b_0;
import helden.framework.oooo.b_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.k_1;
import helden.framework.oooo.n_0;
import helden.framework.oooo.o00o_0;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.o0oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oo0o_1;
import helden.framework.oooo.oo0o_2;
import helden.framework.oooo.oooo_6;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_3;
import helden.framework.oooo.private_0;
import helden.framework.oooo.s_1;
import helden.framework.settings.Settings;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.gui.erschaffung.werkzeug.KostenArt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public abstract class OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
implements Comparable<Object>,
helden.framework.oOoO.floatsuper,
o0oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_0,
Z,
k_1,
private_0,
n_0,
oo0o_1,
F,
oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_3 {
    private k_0<b_0> \u00f5\u00d8\u00f6000;
    private k_0<oo0o_0> \u00d5\u00d8\u00f6000;
    private k_0<oo0o_0> \u00d3\u00d8\u00f6000;
    private Geschlecht Stringfloatclass = Geschlecht.\u00d400000;
    private ArrayList<P> forfloatclass;
    private ArrayList<P> nullfloatclass;
    private ArrayList<P> O\u00f4\u00f6000 = new ArrayList();
    private k_0<oo0o_0> thisfloatclass;
    private ArrayList<KonkreterZauber> \u00f8\u00d8\u00f6000;
    private ArrayList<oo0o_0> \u00d3\u00f4\u00f6000;
    private ArrayList<voidsuper> \u00f4\u00d8\u00f6000;
    private ArrayList<voidsuper> \u00d4\u00d8\u00f6000;
    private publicsuper o\u00f4\u00f6000;
    private ArrayList<for> \u00d8\u00d8\u00f6000;
    private ArrayList<G> \u00d5\u00f4\u00f6000 = null;
    private Settings \u00d4\u00f4\u00f6000 = null;

    public static List<?> sortiereAlphabetisch(List<?> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        Collections.sort(arrayList, public.o00000());
        return arrayList;
    }

    protected OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO() {
        this.setzeMoeglicheVarianten();
        this.setzeAlleVarianten();
    }

    protected OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO(Geschlecht geschlecht) {
        this();
        this.setGeschlecht(geschlecht);
    }

    public void addAlleVarianten(P p2) {
        if (!this.getAlleVarianten().contains(p2)) {
            this.getAlleVarianten().add(p2);
        }
    }

    public void addGewahlteVerbilligteSonderfertigkeit(for for_) {
        this.getGewaehlteVerbilligteSonderfertigkeiten().add(for_);
    }

    public void addMoeglicheVariante(P p2) {
        if (!this.getMoeglicheVarianten().contains(p2)) {
            this.getMoeglicheVarianten().add(p2);
        }
        this.ooO000();
    }

    @Override
    public void addSpracheAuswahl(G g2) {
    }

    @Override
    public void addTalentTyp2Auswahl(interface interface_) {
        this.setTalentauswahl(interface_.new(), interface_.\u00d300000());
    }

    public int anzahlAktivierbarerZauber() {
        return 0;
    }

    public int anzahlWaehlbareHauszauber() {
        return 0;
    }

    public int anzahlWahlbarerLeitzauber() {
        return 0;
    }

    public abstract void bestimmeTalentwerte(int var1);

    public final void clearMoeglicheVarianten() {
        this.getMoeglicheVarianten().clear();
    }

    public void clearVarianten() {
        this.O\u00f4\u00f6000.clear();
        this.resetModifikationen();
    }

    @Override
    public int compareTo(Object object) {
        return this.toString().compareTo(object.toString());
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (!object.getClass().equals(this.getClass())) {
            return false;
        }
        return this.toString().equals(object.toString());
    }

    public ArrayList<P> getAlleVarianten() {
        if (this.nullfloatclass == null) {
            this.nullfloatclass = new ArrayList();
        }
        return this.nullfloatclass;
    }

    public ArrayList<P> getAlleZusatzVarianten() {
        return new ArrayList<P>();
    }

    public Collection<oo0o_0> getAutomatischeTalente() {
        this.bestimmeTalentwerte(99);
        List<oo0o_0> list = this.getTalente().\u00d200000();
        this.resetTalentwerte();
        return list;
    }

    public ArrayList<I> getEmpfohleneVorteile() {
        return null;
    }

    public Geschlecht getGeschlecht() {
        return this.Stringfloatclass;
    }

    public List<oo0o_0> getGewaehlteTalente() {
        if (this.thisfloatclass == null) {
            this.thisfloatclass = new k_0();
        }
        return this.thisfloatclass.\u00d200000();
    }

    public final ArrayList<P> getGewaehlteVarianten() {
        return this.O\u00f4\u00f6000;
    }

    public List<for> getGewaehlteVerbilligteSonderfertigkeiten() {
        if (this.\u00d8\u00d8\u00f6000 == null) {
            this.\u00d8\u00d8\u00f6000 = new ArrayList();
        }
        return this.\u00d8\u00d8\u00f6000;
    }

    public final int getGPKosten() {
        int n = this.getBasisGPKosten();
        for (P p2 : this.getGewaehlteVarianten()) {
            n += p2.getGPKosten();
        }
        return n;
    }

    public final ArrayList<KonkreterZauber> getHauszauber() {
        if (this.\u00f8\u00d8\u00f6000 == null) {
            this.\u00f8\u00d8\u00f6000 = new ArrayList();
            this.setzeHauszauber(this.\u00f8\u00d8\u00f6000);
        }
        return this.\u00f8\u00d8\u00f6000;
    }

    public final ArrayList<oo0o_0> getLeittalente() {
        this.\u00d3\u00f4\u00f6000 = new ArrayList();
        this.setzeLeittalente(this.\u00d3\u00f4\u00f6000);
        return this.\u00d3\u00f4\u00f6000;
    }

    public final int getMaxGPKosten() {
        int n = this.getBasisGPKosten();
        int n2 = 0;
        int n3 = 0;
        if (this.getMoeglicheVarianten() != null) {
            for (P p2 : this.getMoeglicheVarianten()) {
                if (p2 == null) continue;
                if (p2.istOptional()) {
                    n3 += p2.getGPKosten();
                    continue;
                }
                if (p2.getGPKosten() <= n2) continue;
                n2 = p2.getGPKosten();
            }
        }
        return n + n2 + n3;
    }

    public final int getMinGPKosten() {
        int n = this.getBasisGPKosten();
        int n2 = 1000;
        if (this.getMoeglicheVarianten() != null) {
            for (P p2 : this.getMoeglicheVarianten()) {
                if (p2 == null || p2.istOptional() || p2.getGPKosten() >= n2) continue;
                n2 = p2.getGPKosten();
            }
        }
        if (n2 < 1000) {
            return n + n2;
        }
        return n;
    }

    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 1;
        }
        return 8;
    }

    public final ArrayList<voidsuper> getMirakelminustalente() {
        if (this.\u00d4\u00d8\u00f6000 == null) {
            this.\u00d4\u00d8\u00f6000 = new ArrayList();
            this.setzeMirakelminustalente(this.\u00d4\u00d8\u00f6000);
        }
        return this.\u00d4\u00d8\u00f6000;
    }

    public final ArrayList<voidsuper> getMirakelplustalente() {
        if (this.\u00f4\u00d8\u00f6000 == null) {
            this.\u00f4\u00d8\u00f6000 = new ArrayList();
            this.setzeMirakelplustalente(this.\u00f4\u00d8\u00f6000);
        }
        return this.\u00f4\u00d8\u00f6000;
    }

    public int getModifikator(b_0 b_02) {
        if (this.\u00f5\u00d8\u00f6000 == null) {
            this.\u00f5\u00d8\u00f6000 = new k_0();
            this.setzeModifikationen();
        }
        int n = 0;
        if (this.\u00f5\u00d8\u00f6000.\u00d200000(b_02)) {
            n = this.\u00f5\u00d8\u00f6000.\u00d400000(b_02);
        }
        return n;
    }

    public b_0 getModifizierteEigenschaft() {
        if (this.o\u00f4\u00f6000 == null) {
            return null;
        }
        return this.o\u00f4\u00f6000.\u00d500000();
    }

    public ArrayList<P> getMoeglicheVarianten() {
        if (this.forfloatclass == null) {
            this.forfloatclass = new ArrayList();
        }
        return this.forfloatclass;
    }

    @Override
    public T getNextLeittalentAuswahl() {
        return null;
    }

    @Override
    public s_1 getNextMirakeltalentAuswahl() {
        return null;
    }

    @Override
    public b_1 getNextModifikationAuswahl() {
        return null;
    }

    @Override
    public objectsuper_0 getNextSonderfertigkeitAuswahl() {
        return null;
    }

    @Override
    public oo0o_2 getNextSprachAuswahl() {
        return null;
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        return null;
    }

    @Override
    public oooo_6 getNextTalentTyp2Auswahl() {
        return null;
    }

    @Override
    public returnsuper getNextTaPVerteilAuswahl() {
        return null;
    }

    @Override
    public void getNextVerbilligteSonderfertigkeitAuswahl() {
        return null;
    }

    public o00o_0 getNextVorteilAuswahl() {
        return null;
    }

    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        return new BedingungsVerknuepfung(VerknuepfungsArt.o00000);
    }

    public Vector<KostenArt> getPunktePools(floatsuper floatsuper2) {
        return new Vector<KostenArt>();
    }

    @Override
    public K getRepraesentation(Zauber zauber) {
        throw new NichtUeberschriebenException();
    }

    public Settings getSetting() {
        return this.\u00d4\u00f4\u00f6000;
    }

    public OOOo getSonderfertigkeiten() {
        return new OOOo();
    }

    public k_0<oo0o_0> getTalente() {
        if (this.\u00d5\u00d8\u00f6000 == null) {
            this.\u00d5\u00d8\u00f6000 = new k_0();
        }
        return this.\u00d5\u00d8\u00f6000;
    }

    public String getToolTip() {
        return "";
    }

    public ArrayList<Zauber> getUebernatuerlicheBegabungMoeglichkeiten(ArrayList<Zauber> arrayList) {
        return arrayList;
    }

    public ArrayList<I> getUngeeigneteVorteile() {
        return null;
    }

    public List<for> getVerbilligteSonderfertigkeiten() {
        return new ArrayList<for>();
    }

    public int getVerrechnungspunkte() {
        return -99;
    }

    public Oo0O getVorteile() {
        return new Oo0O();
    }

    public WaehlbareZauber getWaehlbareZauber() {
        return new WaehlbareZauber();
    }

    public int getWahlWert(oo0o_0 oo0o_02) {
        if (this.thisfloatclass == null) {
            this.thisfloatclass = new k_0();
        }
        return this.thisfloatclass.\u00d400000(oo0o_02);
    }

    public int getWahlWert0(oo0o_0 oo0o_02) {
        if (this.thisfloatclass == null) {
            this.thisfloatclass = new k_0();
        }
        return this.thisfloatclass.Object(oo0o_02);
    }

    public k_0<oo0o_0> getZauberfertigkeiten() {
        if (this.\u00d3\u00d8\u00f6000 == null) {
            this.\u00d3\u00d8\u00f6000 = new k_0();
        }
        return this.\u00d3\u00d8\u00f6000;
    }

    public ArrayList<ArrayList<P>> getZusatzVarianten(P p2) {
        ArrayList<ArrayList<P>> arrayList = new ArrayList<ArrayList<P>>();
        return arrayList;
    }

    public ArrayList<ArrayList<P>> getZusatzVarianten(P p2, ArrayList<String> arrayList) {
        return this.getZusatzVarianten(p2);
    }

    public ArrayList<G> getZweitLehrsprache() {
        if (this.\u00d5\u00f4\u00f6000 == null) {
            return new ArrayList<G>();
        }
        return this.\u00d5\u00f4\u00f6000;
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public boolean hatMehrLeittalentAuswahl() {
        return false;
    }

    @Override
    public boolean hatMehrMirakeltalentAuswahl() {
        return false;
    }

    @Override
    public boolean hatMehrModifikationAuswahl() {
        return false;
    }

    @Override
    public boolean hatMehrSonderfertigkeitAuswahl() {
        return false;
    }

    @Override
    public boolean hatMehrSprachenAuswahl() {
        return false;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        return false;
    }

    @Override
    public boolean hatMehrTalentTyp2Auswahl() {
        return false;
    }

    @Override
    public boolean hatMehrTaPVerteilAuswahl() {
        return false;
    }

    @Override
    public boolean hatMehrVerbilligteSonderfertigkeitAuswahl() {
        return false;
    }

    public boolean hatMehrVorteilAuswahl() {
        return false;
    }

    public boolean hatVariantenAuswahl() {
        if (this.getMoeglicheVarianten().size() == 0) {
            return false;
        }
        if (this.getMoeglicheVarianten().size() > 1) {
            return true;
        }
        if (this.getZusatzVarianten(this.getMoeglicheVarianten().get(0)) != null && this.getZusatzVarianten(this.getMoeglicheVarianten().get(0)).size() > 0) {
            return true;
        }
        return this.getMoeglicheVarianten().get(0).istOptional();
    }

    public boolean hatZusatzvarianten() {
        return this.getZusatzVarianten(null).size() > 0;
    }

    public boolean istMaennlich() {
        return this.Stringfloatclass.equals((Object)Geschlecht.\u00d400000);
    }

    @Override
    public boolean istProfession() {
        return false;
    }

    public boolean istTalentGewaehlt(oo0o_0 oo0o_02) {
        if (this.thisfloatclass == null) {
            this.thisfloatclass = new k_0();
        }
        return this.thisfloatclass.\u00d200000(oo0o_02);
    }

    public final boolean istVariante(P p2) {
        return this.O\u00f4\u00f6000.contains(p2);
    }

    public boolean istZweitLehrspracheGewaehlt() {
        return false;
    }

    public void macheAlleVariantenMoeglich() {
        for (P p2 : this.getAlleVarianten()) {
            this.addMoeglicheVariante(p2);
        }
    }

    public final void removeMoeglicheVariante(P p2) {
        this.getMoeglicheVarianten().remove(p2);
        this.ooO000();
    }

    public K repraesenationVerrechnungspunkte() {
        return null;
    }

    public void resetModifikationen() {
        this.\u00f5\u00d8\u00f6000 = null;
        this.setzeModifikationen();
    }

    public void setGeschlecht(Geschlecht geschlecht) {
        this.Stringfloatclass = geschlecht;
        this.resetModifikationen();
    }

    public void setSetting(Settings settings) {
        this.\u00d4\u00f4\u00f6000 = settings;
    }

    @Override
    public void setTalentauswahl(oo0o_0 oo0o_02, int n) {
        if (this.thisfloatclass == null) {
            this.thisfloatclass = new k_0();
        }
        this.thisfloatclass.o00000(oo0o_02, n);
        if (this.varianteGewaehlt()) {
            this.getVariante().setTalentauswahl(oo0o_02, n);
        }
    }

    public void setTalentwert(oo0o_0 oo0o_02, int n) {
        if (oo0o_02 == null) {
            return;
        }
        if (!oo0o_02.istZauber()) {
            this.getTalente().o00000(oo0o_02, n);
        } else {
            this.getZauberfertigkeiten().o00000(oo0o_02, n);
        }
    }

    @Override
    public void setzeModifizierteEigenschaft(b_0 b_02) {
        this.o\u00f4\u00f6000 = new publicsuper(b_02, 1);
        this.resetModifikationen();
    }

    public void setZweitLehrsprache(ArrayList<G> arrayList) {
        this.\u00d5\u00f4\u00f6000 = arrayList;
    }

    public String toString() {
        return this.getClass().toString();
    }

    public void ueberpruefeAufEinzelVariante() {
        P p2;
        if (this.getMoeglicheVarianten().size() == 1 && !(p2 = this.getMoeglicheVarianten().get(0)).istOptional()) {
            this.waehleVariante(p2);
        }
    }

    @Override
    public void waehleLeittalent(voidsuper voidsuper2) {
    }

    @Override
    public void waehleMirakeltalent(voidsuper voidsuper2) {
    }

    @Override
    public void waehleSonderfertigkeit(helden.framework.D.P p2) {
    }

    public final void waehleVariante(String string) {
        for (P p2 : this.getAlleVarianten()) {
            if (!p2.getBezeichner(Geschlecht.\u00d400000).equals(string) && !p2.getBezeichner(Geschlecht.\u00d300000).equals(string)) continue;
            this.waehleVariante(p2);
            return;
        }
        for (P p2 : this.getAlleZusatzVarianten()) {
            if (!p2.getBezeichner(Geschlecht.\u00d400000).equals(string) && !p2.getBezeichner(Geschlecht.\u00d300000).equals(string)) continue;
            if (this instanceof L) {
                p2.setProfession((L)this);
            }
            this.waehleVariante(p2);
            return;
        }
        throw new RuntimeException("Variante \"" + string + "\" [" + this.getClass().toString() + "] nicht gefunden. Verf\u00fcgbar: " + this.getAlleVarianten().toString() + this.getAlleZusatzVarianten().toString());
    }

    public final void waehleVariante(P p2) {
        if (!this.getMoeglicheVarianten().contains(p2)) {
            this.addMoeglicheVariante(p2);
        }
        if (!this.O\u00f4\u00f6000.contains(p2)) {
            this.O\u00f4\u00f6000.add(p2);
            this.resetModifikationen();
        }
    }

    @Override
    public void waehleVerbilligteSonderfertigkeit(for for_) {
        this.getGewaehlteVerbilligteSonderfertigkeiten().add(for_);
    }

    protected void addTalentwert(oo0o_0 oo0o_02, int n) {
        if (!oo0o_02.istZauber()) {
            this.getTalente().\u00d200000(oo0o_02, n);
        } else {
            this.getZauberfertigkeiten().\u00d200000(oo0o_02, n);
        }
    }

    protected int getBasisGPKosten() {
        return 0;
    }

    protected ArrayList<for> getEigeneGewaehlteVerbilligteSonderfertigkeiten() {
        if (this.\u00d8\u00d8\u00f6000 == null) {
            this.\u00d8\u00d8\u00f6000 = new ArrayList();
        }
        return this.\u00d8\u00d8\u00f6000;
    }

    protected final P getVariante() {
        if (this.getGewaehlteVarianten().size() == 0) {
            oooo_0.\u00f500000("Keine Variante f\u00fcr " + this.toString() + " gew\u00e4hlt");
            return null;
        }
        return this.getGewaehlteVarianten().get(0);
    }

    protected KonkreterZauber getZauber(Zauber zauber) {
        return KonkreterZauber.getZauber(zauber.toString(), this.getRepraesentation(zauber), "");
    }

    protected void putModifikator(b_0 b_02, int n) {
        if (this.\u00f5\u00d8\u00f6000 == null) {
            this.\u00f5\u00d8\u00f6000 = new k_0();
        }
        if (this.\u00f5\u00d8\u00f6000.\u00d200000(b_02)) {
            int n2 = this.getModifikator(b_02) + n;
            this.\u00f5\u00d8\u00f6000.o00000(b_02, n2);
        } else {
            this.\u00f5\u00d8\u00f6000.o00000(b_02, n);
        }
    }

    protected void removeTalent(oo0o_0 oo0o_02) {
        this.getTalente().o00000(oo0o_02);
    }

    protected void resetTalentwerte() {
        this.\u00d5\u00d8\u00f6000 = null;
        this.\u00d3\u00d8\u00f6000 = null;
    }

    protected void setzeAlleVarianten() {
    }

    protected void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
    }

    protected void setzeLeittalente(ArrayList<oo0o_0> arrayList) {
    }

    protected void setzeMirakelminustalente(ArrayList<voidsuper> arrayList) {
    }

    protected void setzeMirakelplustalente(ArrayList<voidsuper> arrayList) {
    }

    protected void setzeModifikationen() {
    }

    protected void setzeMoeglicheVarianten() {
    }

    protected final boolean varianteGewaehlt() {
        return this.getGewaehlteVarianten().size() > 0;
    }

    private void ooO000() {
    }
}

