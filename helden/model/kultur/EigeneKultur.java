/*
 * Decompiled with CFR 0.152.
 */
package helden.model.kultur;

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
import helden.framework.held.Object.floatsuper;
import helden.framework.held.Object.private;
import helden.framework.int.C;
import helden.framework.int.O0oO;
import helden.framework.int.OooO;
import helden.framework.int.super;
import helden.framework.oooo.a.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.framework.settings.Settings;
import helden.framework.zauber.KonkreterZauber;
import helden.gui.O0OO.A.oOOO;
import java.util.ArrayList;
import java.util.List;

public class EigeneKultur
extends OooO
implements helden.framework.oOoO.A.Object {
    private C \u00f8\u00d3\u00f8000;
    private O0oO Stringinterfaceclass;

    public EigeneKultur(C c) {
        this.\u00f8\u00d3\u00f8000 = c;
        this.init();
    }

    public EigeneKultur(Geschlecht geschlecht, C c) {
        super(geschlecht);
        this.\u00f8\u00d3\u00f8000 = c;
        this.init();
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.Stringinterfaceclass.o00000(n, this.getMuttersprache(), this.getSchrift());
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof EigeneKultur) {
            EigeneKultur eigeneKultur = (EigeneKultur)object;
            return super.equals(object.toString()) && eigeneKultur.getID().equals(this.getID());
        }
        return false;
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        return this.Stringinterfaceclass.\u00f500000();
    }

    public C getHauptVariante() {
        return this.\u00f8\u00d3\u00f8000;
    }

    @Override
    public String getID() {
        return this.\u00f8\u00d3\u00f8000.o\u00f60000();
    }

    @Override
    public ArrayList<String> getIDs() {
        return this.\u00f8\u00d3\u00f8000.\u00d5\u00f60000();
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return this.toString();
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        return this.Stringinterfaceclass.o00000(b_02, super.getMinimalEigenschaftswert(b_02));
    }

    @Override
    public G getMuttersprache() {
        return this.\u00f8\u00d3\u00f8000.\u00d4\u00f60000();
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        oOOO oOOO2 = this.Stringinterfaceclass.\u00d4O0000();
        return new o0oo_2(this, oOOO2.\u00f800000(), oOOO2.if());
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        return new ArrayList<super>();
    }

    @Override
    public G getSchrift() {
        return this.\u00f8\u00d3\u00f8000.supervoid();
    }

    @Override
    public List<Settings> getSettings() {
        return null;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        return this.Stringinterfaceclass.\u00d200000();
    }

    @Override
    public String getToolTip() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<html><body>Selbsterstellte Kultur<p>");
        if (this.\u00f8\u00d3\u00f8000.\u00d6\u00f60000() != null) {
            stringBuffer.append(this.\u00f8\u00d3\u00f8000.\u00d6\u00f60000());
        }
        stringBuffer.append("<p>ID: " + this.getID());
        stringBuffer.append("</body></html>");
        return stringBuffer.toString();
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        return this.Stringinterfaceclass.\u00d400000();
    }

    @Override
    public ArrayList<oooo_0> getVerallgemeinteListenAuswahlen() {
        return this.Stringinterfaceclass.supersuper();
    }

    @Override
    public List<for> getVerbilligteSonderfertigkeiten() {
        return this.Stringinterfaceclass.o00000();
    }

    @Override
    public Oo0O getVorteile() {
        return this.Stringinterfaceclass.\u00d500000();
    }

    @Override
    public void gewaehlterHauszauber(KonkreterZauber konkreterZauber) {
        private.o00000("gewaehlterHauszauber nicht implementiert f\u00fcr " + this.toString());
    }

    @Override
    public void gewaehlterVorteil(public public_) {
        this.Stringinterfaceclass.o00000(public_);
    }

    @Override
    public void gewaehltesLeittalent(oo0o_0 oo0o_02) {
        throw new RuntimeException("Nicht implementiert");
    }

    @Override
    public void gewaehlteSonderfertigkeit(P p2) {
        this.Stringinterfaceclass.o00000(p2);
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
        return this.Stringinterfaceclass.\u00f400000();
    }

    public void init() {
        this.Stringinterfaceclass = new O0oO(this.\u00f8\u00d3\u00f8000, this, this);
        this.setzeMoeglicheVarianten();
        this.setzeAlleVarianten();
    }

    @Override
    public boolean istIntern() {
        return false;
    }

    @Override
    public String toString() {
        return this.Stringinterfaceclass.o00000(this.getGeschlecht());
    }

    @Override
    protected int getBasisGPKosten() {
        return this.\u00f8\u00d3\u00f8000.getGPKosten();
    }

    @Override
    protected void setzeAlleVarianten() {
        if (this.\u00f8\u00d3\u00f8000 == null) {
            return;
        }
        this.Stringinterfaceclass.\u00f5O0000();
    }

    @Override
    protected void setzeModifikationen() {
        if (this.\u00f8\u00d3\u00f8000 == null) {
            return;
        }
        this.Stringinterfaceclass.\u00d6O0000();
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        if (this.\u00f8\u00d3\u00f8000 == null) {
            return;
        }
        this.Stringinterfaceclass.Object();
    }
}

