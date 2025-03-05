/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.int;

import helden.framework.C.I;
import helden.framework.C.Oo0O;
import helden.framework.C.public;
import helden.framework.D.OOOo;
import helden.framework.Geschlecht;
import helden.framework.OOoO.K;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.framework.held.Object.floatsuper;
import helden.framework.held.Object.private;
import helden.framework.int.N;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.framework.oOoO.T;
import helden.framework.oOoO.for;
import helden.framework.oOoO.returnsuper;
import helden.framework.oOoO.void;
import helden.framework.oooo.a.b_0;
import helden.framework.oooo.a.oooo_0;
import helden.framework.oooo.b_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.o00o_0;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oo0o_2;
import helden.framework.oooo.oooo_6;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.gui.erschaffung.werkzeug.KostenArt;
import helden.model.dsa41.orden.BasisOrden;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public abstract class L
extends super
implements for,
helden.framework.oOoO.A.Object {
    private int ifnullvoid = 0;
    private int newnullvoid = 0;
    private int \u00f4\u00d5oO00 = 0;
    private Oo0O \u00f5\u00d5oO00 = new Oo0O();
    private int \u00d8\u00d5oO00 = 0;
    private OOOo \u00d3\u00d5oO00 = new OOOo();
    private int \u00d4\u00d5oO00 = 0;
    private int returnnullvoid = 0;
    private ArrayList<voidsuper> \u00d5\u00d5oO00 = new ArrayList();

    public L() {
    }

    public L(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
    }

    @Override
    public void addAlleVarianten(P p2) {
        super.addAlleVarianten(p2);
        p2.setProfession(this);
    }

    @Override
    public void addAutomatischerVorteil(public public_) {
        this.\u00f5\u00d5oO00.\u00d300000(public_);
    }

    @Override
    public void addMoeglicheVariante(P p2) {
        super.addMoeglicheVariante(p2);
        p2.setProfession(this);
    }

    @Override
    public void addSpracheAuswahl(G g2) {
        ((N)this.getVariante()).addSpracheAuswahl(g2);
    }

    @Override
    public boolean adeligVoraussetzung() {
        return ((N)this.getVariante()).adeligVoraussetzung();
    }

    public String alleVariantenToString() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<P> iterator = this.getGewaehlteVarianten().iterator();
        while (iterator.hasNext()) {
            N n = (N)iterator.next();
            stringBuffer.append(n.toString());
            if (!iterator.hasNext()) continue;
            stringBuffer.append(", ");
        }
        return stringBuffer.toString();
    }

    @Override
    public int anzahlAktivierbarerZauber() {
        int n = 0;
        for (P p2 : this.getGewaehlteVarianten()) {
            n += p2.anzahlAktivierbarerZauber();
        }
        return n;
    }

    @Override
    public int anzahlWaehlbareHauszauber() {
        int n = 0;
        for (P p2 : this.getGewaehlteVarianten()) {
            n += p2.anzahlWaehlbareHauszauber();
        }
        return n;
    }

    @Override
    public int anzahlWahlbarerLeitzauber() {
        int n = 0;
        for (P p2 : this.getGewaehlteVarianten()) {
            n += p2.anzahlWahlbarerLeitzauber();
        }
        return n;
    }

    @Override
    public final void bestimmeTalentwerte(int n) {
        for (P p2 : this.getGewaehlteVarianten()) {
            N n2 = (N)p2;
            n2.setKulturZweitLehrsprache(this.getKulturLehrZweitSprache());
            k_0<oo0o_0> k_02 = n2.getTalentwerte(this.getMuttersprache(), this.getMuttersprachenSchrift(), n);
            for (oo0o_0 oo0o_02 : k_02) {
                int n3 = k_02.\u00d400000(oo0o_02);
                this.addTalentwert(oo0o_02, n3);
            }
        }
    }

    public ArrayList<b_0> getBedingteWerte() {
        ArrayList<b_0> arrayList = new ArrayList<b_0>();
        for (P p2 : this.getGewaehlteVarianten()) {
            if (!(p2 instanceof BasisOrden)) continue;
            arrayList.addAll(((BasisOrden)p2).getBedingteWerte());
        }
        return arrayList;
    }

    @Override
    public List<String> getBesondererBesitzMoeglichkeiten() {
        ArrayList<String> arrayList = new ArrayList<String>();
        if (this.varianteGewaehlt()) {
            for (P p2 : this.getGewaehlteVarianten()) {
                N n = (N)p2;
                arrayList.addAll(n.getBesondererBesitzMoeglichkeiten());
            }
            return arrayList;
        }
        return super.getBesondererBesitzMoeglichkeiten();
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        if (this.varianteGewaehlt()) {
            for (P p2 : this.getGewaehlteVarianten()) {
                N n = (N)p2;
                arrayList.addAll(n.getEmpfohleneVorteile());
            }
            return arrayList;
        }
        return super.getEmpfohleneVorteile();
    }

    @Override
    public ArrayList<I> getEntfernteKutlurVorteile() {
        return ((N)this.getVariante()).getEntfernteKutlurVorteile();
    }

    public ArrayList<voidsuper> getGewaehlteLeiteTalente() {
        return this.\u00d5\u00d5oO00;
    }

    public OOOo getGewaehlteSonderfertigkeiten() {
        return this.\u00d3\u00d5oO00;
    }

    public ArrayList<helden.framework.D.for> getGewaehlteVerbilligteSonderfertigkeiten() {
        ArrayList<helden.framework.D.for> arrayList = new ArrayList<helden.framework.D.for>();
        arrayList.addAll(super.getGewaehlteVerbilligteSonderfertigkeiten());
        if (this.varianteGewaehlt()) {
            arrayList.addAll(((N)this.getVariante()).getGewaehlteVerbilligteSonderfertigkeiten());
        }
        return arrayList;
    }

    @Override
    public String getID() {
        return null;
    }

    @Deprecated
    public N getKonkreteVariante() {
        return (N)this.getVariante();
    }

    @Override
    public final int getMaximalSozialstatus() {
        if (this.varianteGewaehlt()) {
            int n = 21;
            for (P p2 : this.getGewaehlteVarianten()) {
                N n2 = (N)p2;
                n = Math.min(n, n2.getMaximalSozialstatus());
            }
            if (n < 13) {
                return n;
            }
        }
        return super.getMaximalSozialstatus();
    }

    @Override
    public final int getMinimalEigenschaftswert(helden.framework.oooo.b_0 b_02) {
        int n = 0;
        if (this.varianteGewaehlt()) {
            for (P p2 : this.getGewaehlteVarianten()) {
                N n2 = (N)p2;
                n = Math.max(n, n2.getMinimalEigenschaftswert(b_02));
            }
        } else {
            n = 21;
            for (N n3 : this.getAlleVarianten()) {
                n = Math.min(n, n3.getMinimalEigenschaftswert(b_02));
            }
        }
        if (n > 0) {
            return n;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public T getNextLeittalentAuswahl() {
        for (P p2 : this.getGewaehlteVarianten()) {
            if (!p2.hatMehrLeittalentAuswahl()) continue;
            return p2.getNextLeittalentAuswahl();
        }
        return null;
    }

    @Override
    public b_1 getNextModifikationAuswahl() {
        int n = this.returnnullvoid;
        for (P p2 : this.getGewaehlteVarianten()) {
            N n2 = (N)p2;
            if (n < n2.getAnzahlModifikationAuswahlen()) {
                ++this.returnnullvoid;
                return n2.getModifikationAuswahl(n);
            }
            n -= n2.getAnzahlModifikationAuswahlen();
        }
        throw new IllegalStateException("Keine weitere Auswahl von Modifikationen");
    }

    @Override
    public objectsuper_0 getNextSonderfertigkeitAuswahl() {
        int n = this.\u00d8\u00d5oO00;
        for (P p2 : this.getGewaehlteVarianten()) {
            N n2 = (N)p2;
            if (n < n2.getAnzahlSonderfertigkeitAuswahlen()) {
                ++this.\u00d8\u00d5oO00;
                return n2.getSonderfertigkeitAuswahl(n);
            }
            n -= n2.getAnzahlSonderfertigkeitAuswahlen();
        }
        throw new IllegalStateException("Keine weiteren Sonderfertigkeit-Auswahlen");
    }

    @Override
    public oo0o_2 getNextSprachAuswahl() {
        return ((N)this.getVariante()).getNextSprachAuswahl();
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        int n = this.ifnullvoid;
        for (P p2 : this.getGewaehlteVarianten()) {
            N n2 = (N)p2;
            if (n < n2.getAnzahlTalentAuswahlen()) {
                m_0 m_02 = n2.getTalentAuswahl(n);
                ++this.ifnullvoid;
                return new o0oo_2(this, m_02.new(), m_02.\u00d300000(), m_02.o00000());
            }
            n -= n2.getAnzahlTalentAuswahlen();
        }
        return null;
    }

    @Override
    public oooo_6 getNextTalentTyp2Auswahl() {
        return ((N)this.getVariante()).getNextTalentTyp2Auswahl();
    }

    @Override
    public returnsuper getNextTaPVerteilAuswahl() {
        int n = this.newnullvoid;
        for (P p2 : this.getGewaehlteVarianten()) {
            N n2 = (N)p2;
            if (n < n2.getAnzahlVerteilAuswahlen()) {
                returnsuper returnsuper2 = n2.getNextTaPVerteilAuswahl(n);
                ++this.newnullvoid;
                return returnsuper2;
            }
            n -= n2.getAnzahlVerteilAuswahlen();
        }
        return null;
    }

    @Override
    public void getNextVerbilligteSonderfertigkeitAuswahl() {
        int n = this.\u00d4\u00d5oO00;
        for (P p2 : this.getGewaehlteVarianten()) {
            N n2 = (N)p2;
            if (n < n2.getAnzahlVerbilligteSonderfertigkeitAuswahlen()) {
                ++this.\u00d4\u00d5oO00;
                return n2.getVerbilligteSonderfertigkeitAuswahl(n);
            }
            n -= n2.getAnzahlVerbilligteSonderfertigkeitAuswahlen();
        }
        throw new IllegalStateException("Keine weitere Auswahl verbilligter Sonderfertigkeiten");
    }

    @Override
    public o00o_0 getNextVorteilAuswahl() {
        int n = this.\u00f4\u00d5oO00;
        for (P p2 : this.getGewaehlteVarianten()) {
            N n2 = (N)p2;
            if (n < n2.getAnzahlVorteilAuswahlen()) {
                o00o_0 o00o_02 = n2.getVorteilAuswahl(n);
                ++this.\u00f4\u00d5oO00;
                return o00o_02;
            }
            n -= n2.getAnzahlVorteilAuswahlen();
        }
        throw new IllegalStateException("Keine weiteren Vorteil-Auswahlen");
    }

    @Override
    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        BedingungsVerknuepfung bedingungsVerknuepfung = new BedingungsVerknuepfung(VerknuepfungsArt.o00000);
        for (P p2 : this.getGewaehlteVarianten()) {
            BedingungsVerknuepfung bedingungsVerknuepfung2 = ((N)p2).getNotwendigeVoraussetzungen();
            if (bedingungsVerknuepfung2.isEmpty()) continue;
            bedingungsVerknuepfung.addBedingung(bedingungsVerknuepfung2);
        }
        return bedingungsVerknuepfung;
    }

    @Override
    public int getPermanenteASP() {
        return ((N)this.getVariante()).getPermanenteASP();
    }

    @Override
    public Vector<KostenArt> getPunktePools(floatsuper floatsuper2) {
        Vector<KostenArt> vector = new Vector<KostenArt>();
        for (P p2 : this.getGewaehlteVarianten()) {
            vector.addAll(((N)p2).getPunktePools(floatsuper2));
        }
        return vector;
    }

    @Override
    public K getRepraesentation(Zauber zauber) {
        return this.getKonkreteVariante().getRepraesentation(zauber);
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        if (this.varianteGewaehlt()) {
            ArrayList<helden.framework.D.P> arrayList = new ArrayList<helden.framework.D.P>();
            for (P p2 : this.getGewaehlteVarianten()) {
                N n = (N)p2;
                arrayList.addAll(n.getSonderfertigkeiten());
            }
            arrayList.addAll(this.\u00d3\u00d5oO00.\u00f600000());
            OOOo oOOo = new OOOo();
            oOOo.o00000(arrayList);
            return oOOo;
        }
        return super.getSonderfertigkeiten();
    }

    @Override
    public final ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = new ArrayList<I>();
        if (this.varianteGewaehlt()) {
            for (P p2 : this.getGewaehlteVarianten()) {
                N n = (N)p2;
                arrayList.addAll(n.getUngeeigneteVorteile());
            }
            return arrayList;
        }
        return super.getUngeeigneteVorteile();
    }

    @Override
    public ArrayList<oooo_0> getVerallgemeinteListenAuswahlen() {
        ArrayList<oooo_0> arrayList = new ArrayList<oooo_0>();
        for (P p2 : this.getGewaehlteVarianten()) {
            if (!(p2 instanceof helden.framework.oOoO.A.Object)) continue;
            helden.framework.oOoO.A.Object object = (helden.framework.oOoO.A.Object)((Object)p2);
            arrayList.addAll(object.getVerallgemeinteListenAuswahlen());
        }
        return arrayList;
    }

    @Override
    public List<helden.framework.D.for> getVerbilligteSonderfertigkeiten() {
        List<helden.framework.D.for> list = super.getVerbilligteSonderfertigkeiten();
        for (P p2 : this.getGewaehlteVarianten()) {
            N n = (N)p2;
            list.addAll(n.getVerbilligteSonderfertigkeiten());
        }
        list.addAll(this.getGewaehlteVerbilligteSonderfertigkeiten());
        return list;
    }

    @Override
    public int getVerrechnungspunkte() {
        int n = 0;
        for (P p2 : this.getGewaehlteVarianten()) {
            n += p2.getVerrechnungspunkte();
        }
        return n;
    }

    @Override
    public final Oo0O getVorteile() {
        Oo0O oo0O = new Oo0O();
        if (this.varianteGewaehlt()) {
            for (P p2 : this.getGewaehlteVarianten()) {
                N n = (N)p2;
                oo0O.new(n.getVorteile());
            }
        } else {
            oo0O = super.getVorteile();
        }
        oo0O.new(this.\u00f5\u00d5oO00);
        return oo0O;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = new WaehlbareZauber();
        for (P p2 : this.getGewaehlteVarianten()) {
            waehlbareZauber.addAll(p2.getWaehlbareZauber());
        }
        return waehlbareZauber;
    }

    @Override
    public ArrayList<G> getZweitLehrsprache() {
        P p2 = this.getVariante();
        if (p2 == null) {
            return new ArrayList<G>();
        }
        return ((N)p2).getZweitLehrsprache();
    }

    @Override
    public void gewaehlterHauszauber(KonkreterZauber konkreterZauber) {
        private.o00000("gewaehlterHauszauber nicht implementiert f\u00fcr " + this.toString());
    }

    @Override
    public void gewaehlterVorteil(public public_) {
    }

    @Override
    public void gewaehltesLeittalent(oo0o_0 oo0o_02) {
        throw new RuntimeException("Nicht implementiert");
    }

    @Override
    public void gewaehlteSonderfertigkeit(helden.framework.D.P p2) {
    }

    @Override
    public void gewaehltesTalent(oo0o_0 oo0o_02, int n, helden.framework.held.K k2, boolean bl) {
    }

    @Override
    public boolean hatMehrLeittalentAuswahl() {
        for (P p2 : this.getGewaehlteVarianten()) {
            if (!p2.hatMehrLeittalentAuswahl()) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean hatMehrModifikationAuswahl() {
        int n = 0;
        for (P p2 : this.getGewaehlteVarianten()) {
            n += ((N)p2).getAnzahlModifikationAuswahlen();
        }
        return this.returnnullvoid < n;
    }

    @Override
    public boolean hatMehrSonderfertigkeitAuswahl() {
        int n = 0;
        for (P p2 : this.getGewaehlteVarianten()) {
            n += ((N)p2).getAnzahlSonderfertigkeitAuswahlen();
        }
        return this.\u00d8\u00d5oO00 < n;
    }

    @Override
    public boolean hatMehrSprachenAuswahl() {
        if (this.getGewaehlteVarianten().size() == 0) {
            return false;
        }
        return ((N)this.getVariante()).hatMehrSprachenAuswahl();
    }

    @Override
    public final boolean hatMehrTalentAuswahl() {
        int n = 0;
        for (P p2 : this.getGewaehlteVarianten()) {
            n += ((N)p2).getAnzahlTalentAuswahlen();
        }
        return this.ifnullvoid < n;
    }

    @Override
    public boolean hatMehrTalentTyp2Auswahl() {
        return ((N)this.getVariante()).hatMehrTalentTyp2Auswahl();
    }

    @Override
    public boolean hatMehrTaPVerteilAuswahl() {
        int n = 0;
        for (P p2 : this.getGewaehlteVarianten()) {
            n += ((N)p2).getAnzahlVerteilAuswahlen();
        }
        return this.newnullvoid < n;
    }

    @Override
    public boolean hatMehrVerbilligteSonderfertigkeitAuswahl() {
        int n = 0;
        for (P p2 : this.getGewaehlteVarianten()) {
            n += ((N)p2).getAnzahlVerbilligteSonderfertigkeitAuswahlen();
        }
        return this.\u00d4\u00d5oO00 < n;
    }

    @Override
    public final boolean hatMehrVorteilAuswahl() {
        int n = 0;
        for (P p2 : this.getGewaehlteVarianten()) {
            n += ((N)p2).getAnzahlVorteilAuswahlen();
        }
        return this.\u00f4\u00d5oO00 < n;
    }

    public boolean hatVariante(String string) {
        for (P p2 : this.getGewaehlteVarianten()) {
            if (!p2.toString().equals(string)) continue;
            return true;
        }
        return false;
    }

    public boolean hatVariante(P p2) {
        return this.hatVariante(p2.toString());
    }

    @Override
    public boolean istZeitaufwendig() {
        for (P p2 : this.getGewaehlteVarianten()) {
            if (!((N)p2).istZeitaufwendig()) continue;
            return true;
        }
        return super.istZeitaufwendig();
    }

    @Override
    public boolean istZweitLehrspracheGewaehlt() {
        if (this.getGewaehlteVarianten().size() == 0) {
            return false;
        }
        return ((N)this.getVariante()).istZweitLehrspracheGewaehlt();
    }

    @Override
    public K repraesenationVerrechnungspunkte() {
        Iterator<P> iterator = this.getGewaehlteVarianten().iterator();
        if (iterator.hasNext()) {
            P p2 = iterator.next();
            return p2.repraesenationVerrechnungspunkte();
        }
        return null;
    }

    @Override
    public void setZweitLehrsprache(ArrayList<G> arrayList) {
        ((N)this.getVariante()).setZweitLehrsprache(arrayList);
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<P> iterator = this.getGewaehlteVarianten().iterator();
        while (iterator.hasNext()) {
            N n = (N)iterator.next();
            stringBuffer.append(n.toString());
            if (!iterator.hasNext()) continue;
            stringBuffer.append(", ");
        }
        return stringBuffer.toString();
    }

    @Override
    public void waehleLeittalent(voidsuper voidsuper2) {
        this.\u00d5\u00d5oO00.add(voidsuper2);
    }

    @Override
    public void waehleSonderfertigkeit(helden.framework.D.P p2) {
        this.\u00d3\u00d5oO00.o00000(p2);
    }

    @Override
    public void waehleVerbilligteSonderfertigkeit(helden.framework.D.for for_) {
        super.getGewaehlteVerbilligteSonderfertigkeiten().add(for_);
    }

    @Override
    protected final int getBasisGPKosten() {
        return 0;
    }

    @Override
    protected void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        ((N)this.getVariante()).setzeHauszauber(arrayList);
    }

    @Override
    protected void setzeLeittalente(ArrayList<oo0o_0> arrayList) {
        for (P p2 : this.getGewaehlteVarianten()) {
            ((N)p2).setzeLeittalente(arrayList);
        }
        arrayList.addAll(this.\u00d5\u00d5oO00);
    }

    @Override
    protected final void setzeModifikationen() {
        for (P p2 : this.getGewaehlteVarianten()) {
            k_0<helden.framework.oooo.b_0> k_02 = ((N)p2).getModifikationen();
            for (helden.framework.oooo.b_0 b_02 : k_02) {
                int n = k_02.\u00d400000(b_02);
                this.putModifikator(b_02, n);
            }
        }
    }
}

