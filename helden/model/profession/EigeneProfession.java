/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession;

import helden.framework.C.I;
import helden.framework.C.Oo0O;
import helden.framework.C.public;
import helden.framework.D.OOOo;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.Geschlecht;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.K;
import helden.framework.int.C;
import helden.framework.int.O0oO;
import helden.framework.int.super;
import helden.framework.oooo.a.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.framework.settings.Settings;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.gui.O0OO.A.oOOO;
import java.util.ArrayList;
import java.util.List;

public class EigeneProfession
extends super
implements helden.framework.oOoO.A.Object {
    private C nullinterfaceif;
    private O0oO o\u00f5\u00f4O00;

    public EigeneProfession(C c) {
        this.nullinterfaceif = c;
        this.init();
    }

    public EigeneProfession(C c, Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht, voidsuper2, voidsuper3);
        this.nullinterfaceif = c;
        this.init();
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        super.bestimmeTalentwerte(n);
        this.o\u00f5\u00f4O00.o00000(n, this.getMuttersprache(), this.getMuttersprachenSchrift());
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof EigeneProfession) {
            EigeneProfession eigeneProfession = (EigeneProfession)object;
            return super.equals(object) && eigeneProfession.getID().equals(this.getID());
        }
        return false;
    }

    @Override
    public List<String> getBesondererBesitzMoeglichkeiten() {
        return this.o\u00f5\u00f4O00.OO0000();
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        return this.o\u00f5\u00f4O00.\u00f500000();
    }

    public C getHauptVariante() {
        return this.nullinterfaceif;
    }

    @Override
    public String getID() {
        return this.nullinterfaceif.o\u00f60000();
    }

    @Override
    public ArrayList<String> getIDs() {
        return this.nullinterfaceif.\u00d5\u00f60000();
    }

    @Override
    public super._o getKategorie() {
        return super._o.\u00f400000;
    }

    @Override
    public int getMaximalSozialstatus() {
        return this.nullinterfaceif.\u00d2\u00f80000();
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        return this.o\u00f5\u00f4O00.o00000(b_02, super.getMinimalEigenschaftswert(b_02));
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        oOOO oOOO2 = this.o\u00f5\u00f4O00.\u00d4O0000();
        return new o0oo_2(this, oOOO2.\u00f800000(), oOOO2.if());
    }

    public List<Settings> getSettings() {
        return null;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        return this.o\u00f5\u00f4O00.\u00d200000();
    }

    @Override
    public String getToolTip() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<html><body>Selbsterstellte Profession<p>");
        if (this.nullinterfaceif.\u00d6\u00f60000() != null) {
            stringBuffer.append(this.nullinterfaceif.\u00d6\u00f60000());
        }
        stringBuffer.append("<p>ID: " + this.getID());
        stringBuffer.append("</body></html>");
        return stringBuffer.toString();
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        return this.o\u00f5\u00f4O00.\u00d400000();
    }

    @Override
    public ArrayList<oooo_0> getVerallgemeinteListenAuswahlen() {
        return this.o\u00f5\u00f4O00.supersuper();
    }

    @Override
    public List<for> getVerbilligteSonderfertigkeiten() {
        return this.o\u00f5\u00f4O00.o00000();
    }

    @Override
    public Oo0O getVorteile() {
        return this.o\u00f5\u00f4O00.\u00d500000();
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        return this.o\u00f5\u00f4O00.public();
    }

    @Override
    public ArrayList<G> getZweitLehrsprache() {
        return this.o\u00f5\u00f4O00.oO0000();
    }

    @Override
    public void gewaehlterHauszauber(KonkreterZauber konkreterZauber) {
        this.o\u00f5\u00f4O00.o00000(konkreterZauber);
    }

    @Override
    public void gewaehlterVorteil(public public_) {
        this.o\u00f5\u00f4O00.o00000(public_);
    }

    @Override
    public void gewaehltesLeittalent(oo0o_0 oo0o_02) {
        throw new RuntimeException("Nicht implementiert");
    }

    @Override
    public void gewaehlteSonderfertigkeit(P p2) {
        this.o\u00f5\u00f4O00.o00000(p2);
    }

    @Override
    public void gewaehltesTalent(oo0o_0 oo0o_02, int n, K k2, boolean bl) {
        if (!bl) {
            if (oo0o_02.istZauber()) {
                k2.\u00d5o0000().super((KonkreterZauber)oo0o_02, (Integer)n);
            } else {
                k2.\u00f8O0000().\u00d300000((voidsuper)oo0o_02, n);
            }
        }
        this.setTalentauswahl(oo0o_02, n);
    }

    @Override
    public int hashCode() {
        return this.getID().hashCode();
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        return this.o\u00f5\u00f4O00.\u00f400000();
    }

    public void init() {
        this.o\u00f5\u00f4O00 = new O0oO(this.nullinterfaceif, this, this);
        this.setzeMoeglicheVarianten();
        this.setzeAlleVarianten();
    }

    @Override
    public boolean istIntern() {
        return false;
    }

    @Override
    public boolean istMagiedilletantErlaubt() {
        return this.o\u00f5\u00f4O00.float();
    }

    @Override
    public boolean istMagiedilletantischeProfession() {
        return this.o\u00f5\u00f4O00.\u00f4O0000();
    }

    @Override
    public boolean istVeteranErlaubt() {
        return this.o\u00f5\u00f4O00.\u00d5O0000();
    }

    @Override
    public boolean istZeitaufwendig() {
        return this.o\u00f5\u00f4O00.\u00f600000();
    }

    @Override
    public String toString() {
        return this.o\u00f5\u00f4O00.o00000(this.getGeschlecht());
    }

    @Override
    protected int getBasisGPKosten() {
        return this.nullinterfaceif.getGPKosten();
    }

    @Override
    protected void setzeAlleVarianten() {
        if (this.nullinterfaceif == null) {
            return;
        }
        this.o\u00f5\u00f4O00.\u00f5O0000();
    }

    @Override
    protected void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        this.o\u00f5\u00f4O00.o00000(arrayList);
    }

    @Override
    protected void setzeModifikationen() {
        if (this.nullinterfaceif == null) {
            return;
        }
        this.o\u00f5\u00f4O00.\u00d6O0000();
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        if (this.nullinterfaceif == null) {
            return;
        }
        this.o\u00f5\u00f4O00.Object();
    }
}

