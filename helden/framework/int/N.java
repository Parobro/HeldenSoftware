/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.int;

import helden.framework.C.I;
import helden.framework.C.Oo0O;
import helden.framework.D.for;
import helden.framework.NichtUeberschriebenException;
import helden.framework.OOoO.K;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.framework.held.Object.floatsuper;
import helden.framework.held.object.oooo_0;
import helden.framework.int.P;
import helden.framework.oOoO.returnsuper;
import helden.framework.oOoO.void;
import helden.framework.oooo.b_0;
import helden.framework.oooo.b_1;
import helden.framework.oooo.k_0;
import helden.framework.oooo.m_0;
import helden.framework.oooo.o00o_0;
import helden.framework.oooo.objectsuper_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oo0o_2;
import helden.framework.oooo.oooo_6;
import helden.framework.settings.Settings;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import helden.gui.erschaffung.werkzeug.KostenArt;
import java.util.ArrayList;
import java.util.Vector;

public abstract class N
extends P {
    private ArrayList<G> O\u00d6\u00f6000 = null;
    private ArrayList<G> \u00f8\u00d5\u00f6000;

    public N(String string, int n) {
        super(string, n, false);
    }

    public N(String string, int n, boolean bl) {
        super(string, n, bl);
    }

    public N(String string, String string2, int n, boolean bl) {
        super(string, string2, n, bl);
    }

    public void addSpracheAuswahl(G g2) {
    }

    public boolean adeligVoraussetzung() {
        return false;
    }

    public int getAnzahlModifikationAuswahlen() {
        return 0;
    }

    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 0;
    }

    public int getAnzahlTalentAuswahlen() {
        return 0;
    }

    public int getAnzahlVerbilligteSonderfertigkeitAuswahlen() {
        return 0;
    }

    public int getAnzahlVerteilAuswahlen() {
        return 0;
    }

    public int getAnzahlVorteilAuswahlen() {
        return 0;
    }

    public ArrayList<String> getBesondererBesitzMoeglichkeiten() {
        return new ArrayList<String>();
    }

    public ArrayList<I> getEmpfohleneVorteile() {
        return new ArrayList<I>();
    }

    public ArrayList<for> getGewaehlteVerbilligteSonderfertigkeiten() {
        return new ArrayList<for>();
    }

    public int getMaximalSozialstatus() {
        return 13;
    }

    public int getMinimalEigenschaftswert(b_0 b_02) {
        return 0;
    }

    public b_1 getModifikationAuswahl(int n) {
        return null;
    }

    public k_0<b_0> getModifikationen() {
        return new k_0<b_0>();
    }

    public oo0o_2 getNextSprachAuswahl() {
        return null;
    }

    public oooo_6 getNextTalentTyp2Auswahl() {
        return null;
    }

    public returnsuper getNextTaPVerteilAuswahl(int n) {
        return null;
    }

    public BedingungsVerknuepfung getNotwendigeVoraussetzungen() {
        return new BedingungsVerknuepfung(VerknuepfungsArt.o00000);
    }

    public int getPermanenteASP() {
        return 0;
    }

    public Vector<KostenArt> getPunktePools(floatsuper floatsuper2) {
        return new Vector<KostenArt>();
    }

    public ArrayList<helden.framework.D.P> getSegnungen() {
        return null;
    }

    public Settings getSetting() {
        if (this.getProfession() == null) {
            oooo_0.\u00f500000("Profession null in getSettings()");
        }
        return this.getProfession().getSetting();
    }

    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        return null;
    }

    public ArrayList<helden.framework.D.P> getSonderfertigkeiten() {
        return new ArrayList<helden.framework.D.P>();
    }

    public m_0 getTalentAuswahl(int n) {
        return null;
    }

    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = new k_0<oo0o_0>();
        if (this.getZweitLehrsprache() != null && voidsuper2 != null) {
            for (G g2 : this.getZweitLehrsprache()) {
                if (voidsuper2.equals(g2) || this.\u00f8\u00d5\u00f6000 != null && this.\u00f8\u00d5\u00f6000.contains(g2)) {
                    k_02.o00000(g2, 4);
                    continue;
                }
                k_02.o00000(g2, n - 4);
            }
        }
        return k_02;
    }

    public ArrayList<I> getUngeeigneteVorteile() {
        return new ArrayList<I>(1);
    }

    public void getVerbilligteSonderfertigkeitAuswahl(int n) {
        return null;
    }

    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        return new ArrayList<for>();
    }

    public o00o_0 getVorteilAuswahl(int n) {
        return null;
    }

    public Oo0O getVorteile() {
        return new Oo0O();
    }

    public ArrayList<G> getZweitLehrsprache() {
        return this.O\u00d6\u00f6000;
    }

    public boolean hatMehrSprachenAuswahl() {
        return false;
    }

    public boolean hatMehrTalentTyp2Auswahl() {
        return false;
    }

    public boolean istZeitaufwendig() {
        return false;
    }

    public boolean istZweitLehrspracheGewaehlt() {
        return false;
    }

    public void setKulturZweitLehrsprache(ArrayList<G> arrayList) {
        this.\u00f8\u00d5\u00f6000 = arrayList;
    }

    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
    }

    public void setzeLeittalente(ArrayList<oo0o_0> arrayList) {
    }

    public void setZweitLehrsprache(ArrayList<G> arrayList) {
        this.O\u00d6\u00f6000 = arrayList;
    }

    protected K getRepraesentation(Zauber zauber) {
        throw new NichtUeberschriebenException();
    }

    protected KonkreterZauber getZauber(Zauber zauber) {
        return KonkreterZauber.getZauber(zauber.toString(), this.getRepraesentation(zauber), "");
    }
}

