/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.int;

import helden.framework.C.I;
import helden.framework.Geschlecht;
import helden.framework.OOoO.K;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.int.L;
import helden.framework.oOoO.T;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.WaehlbareZauber;
import java.util.ArrayList;

public class P
implements Comparable<Object> {
    private k_0<oo0o_0> O\u00d2\u00f6000;
    private String \u00f8o\u00f6000;
    private String o\u00d2\u00f6000 = null;
    private int \u00d3\u00d2\u00f6000;
    private boolean nullvoidclass;
    private L \u00d4\u00d2\u00f6000;

    public P(String string, int n, boolean bl) {
        this.\u00f8o\u00f6000 = string;
        this.\u00d3\u00d2\u00f6000 = n;
        this.nullvoidclass = bl;
        this.O\u00d2\u00f6000 = new k_0();
    }

    public P(String string, String string2, int n, boolean bl) {
        this(string, n, bl);
        this.o\u00d2\u00f6000 = string2;
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

    @Override
    public int compareTo(Object object) {
        return this.toString().compareTo(object.toString());
    }

    public String getBezeichner(Geschlecht geschlecht) {
        if (geschlecht.istMaennlich() || this.o\u00d2\u00f6000 == null) {
            return this.\u00f8o\u00f6000;
        }
        return this.o\u00d2\u00f6000;
    }

    public ArrayList<I> getEntfernteKutlurVorteile() {
        return new ArrayList<I>();
    }

    public int getGPKosten() {
        return this.\u00d3\u00d2\u00f6000;
    }

    public T getNextLeittalentAuswahl() {
        return null;
    }

    public int getVerrechnungspunkte() {
        return 0;
    }

    public WaehlbareZauber getWaehlbareZauber() {
        return new WaehlbareZauber();
    }

    public BedingungsVerknuepfung getWahlBedingung() {
        return null;
    }

    public boolean hatMehrLeittalentAuswahl() {
        return false;
    }

    public boolean istOptional() {
        return this.nullvoidclass;
    }

    public K repraesenationVerrechnungspunkte() {
        return null;
    }

    public void setOptional(boolean bl) {
        this.nullvoidclass = bl;
    }

    public void setProfession(L l2) {
        this.\u00d4\u00d2\u00f6000 = l2;
    }

    public void setTalentauswahl(oo0o_0 oo0o_02, int n) {
        this.O\u00d2\u00f6000.\u00d200000(oo0o_02, n);
    }

    public String toString() {
        return this.\u00f8o\u00f6000;
    }

    protected Geschlecht getGeschlecht() {
        if (this.\u00d4\u00d2\u00f6000 == null) {
            return null;
        }
        return this.\u00d4\u00d2\u00f6000.getGeschlecht();
    }

    protected L getProfession() {
        return this.\u00d4\u00d2\u00f6000;
    }

    protected int getWahlWert(oo0o_0 oo0o_02) {
        return this.O\u00d2\u00f6000.\u00d400000(oo0o_02);
    }

    protected int getWahlWert0(oo0o_0 oo0o_02) {
        return this.O\u00d2\u00f6000.Object(oo0o_02);
    }
}

