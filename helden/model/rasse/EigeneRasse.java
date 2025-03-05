/*
 * Decompiled with CFR 0.152.
 */
package helden.model.rasse;

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
import helden.framework.held.Object.private;
import helden.framework.held.a.oooo_1;
import helden.framework.int.C;
import helden.framework.int.O0oO;
import helden.framework.int.OooO;
import helden.framework.int.o0oo_0;
import helden.framework.oooo.a.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.settings.Settings;
import helden.framework.zauber.KonkreterZauber;
import java.util.ArrayList;
import java.util.List;

public class EigeneRasse
extends o0oo_0
implements helden.framework.oOoO.A.Object {
    private C ifnewvoid;
    private O0oO \u00f5\u00f5OO00;

    public EigeneRasse(C c, Geschlecht geschlecht) {
        super(geschlecht);
        this.ifnewvoid = c;
        this.\u00d2\u00d2O000();
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        this.\u00f5\u00f5OO00.o00000(n, G.\u00d8\u00f8\u00f4000, G.\u00d3\u00d2\u00f5000);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof EigeneRasse) {
            EigeneRasse eigeneRasse = (EigeneRasse)object;
            return this.toString().equals(eigeneRasse.toString()) && eigeneRasse.getID().equals(this.getID());
        }
        return false;
    }

    @Override
    public ArrayList<Integer> getAlterungsStufen() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (Integer n : this.ifnewvoid.superint()) {
            arrayList.add(n);
        }
        return arrayList;
    }

    @Override
    public ArrayList<oooo_1> getAugenfarben() {
        return this.\u00f5\u00f5OO00.void();
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        return this.\u00f5\u00f5OO00.\u00f500000();
    }

    @Override
    public int getGewicht() {
        if (this.getGeschlecht().equals((Object)Geschlecht.\u00d400000)) {
            return this.getGroesse() - this.ifnewvoid.\u00d50O000();
        }
        return this.getGroesse() - this.ifnewvoid.OOO000();
    }

    @Override
    public ArrayList<oooo_1> getHaarfarben() {
        return this.\u00f5\u00f5OO00.\u00d2O0000();
    }

    public C getHauptVariante() {
        return this.ifnewvoid;
    }

    @Override
    public String getID() {
        return this.ifnewvoid.o\u00f60000();
    }

    @Override
    public ArrayList<String> getIDs() {
        return this.ifnewvoid.\u00d5\u00f60000();
    }

    @Override
    public ArrayList<OooO> getKulturen(boolean bl) {
        return new ArrayList<OooO>();
    }

    @Override
    public int getMaxGewicht() {
        if (this.getGeschlecht().equals((Object)Geschlecht.\u00d400000)) {
            return this.getMaxGroesse() - this.ifnewvoid.\u00d50O000();
        }
        return this.getMaxGroesse() - this.ifnewvoid.OOO000();
    }

    @Override
    public int getMaxGroesse() {
        if (this.getGeschlecht().equals((Object)Geschlecht.\u00d400000)) {
            return this.ifnewvoid.\u00d40O000().getMax();
        }
        return this.ifnewvoid.\u00f40O000().getMax();
    }

    @Override
    public int getMinGewicht() {
        if (this.getGeschlecht().equals((Object)Geschlecht.\u00d400000)) {
            return this.getMinGroesse() - this.ifnewvoid.\u00d50O000();
        }
        return this.getMinGroesse() - this.ifnewvoid.OOO000();
    }

    @Override
    public int getMinGroesse() {
        if (this.getGeschlecht().equals((Object)Geschlecht.\u00d400000)) {
            return this.ifnewvoid.\u00d40O000().getMin();
        }
        return this.ifnewvoid.\u00f40O000().getMin();
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        return this.\u00f5\u00f5OO00.o00000(b_02, super.getMinimalEigenschaftswert(b_02));
    }

    @Override
    public List<Settings> getSettings() {
        return null;
    }

    @Override
    public OOOo getSonderfertigkeiten() {
        return this.\u00f5\u00f5OO00.\u00d200000();
    }

    @Override
    public String getToolTip() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<html><body>Selbsterstellte Rasse<p>");
        if (this.ifnewvoid.\u00d6\u00f60000() != null) {
            stringBuffer.append(this.ifnewvoid.\u00d6\u00f60000());
        }
        stringBuffer.append("<p>ID: " + this.getID());
        stringBuffer.append("</body></html>");
        return stringBuffer.toString();
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        return this.\u00f5\u00f5OO00.\u00d400000();
    }

    @Override
    public ArrayList<oooo_0> getVerallgemeinteListenAuswahlen() {
        return this.\u00f5\u00f5OO00.supersuper();
    }

    @Override
    public List<for> getVerbilligteSonderfertigkeiten() {
        return this.\u00f5\u00f5OO00.o00000();
    }

    @Override
    public Oo0O getVorteile() {
        return this.\u00f5\u00f5OO00.\u00d500000();
    }

    @Override
    public void gewaehlterHauszauber(KonkreterZauber konkreterZauber) {
        private.o00000("gewaehlterHauszauber nicht implementiert f\u00fcr " + this.toString());
    }

    @Override
    public void gewaehlterVorteil(public public_) {
        this.\u00f5\u00f5OO00.o00000(public_);
    }

    @Override
    public void gewaehltesLeittalent(oo0o_0 oo0o_02) {
        throw new RuntimeException("Nicht implementiert");
    }

    @Override
    public void gewaehlteSonderfertigkeit(P p2) {
        this.\u00f5\u00f5OO00.o00000(p2);
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
    public boolean istIntern() {
        return false;
    }

    @Override
    public String toString() {
        return this.\u00f5\u00f5OO00.o00000(this.getGeschlecht());
    }

    @Override
    public int wurfeleAlter() {
        return this.ifnewvoid.interfacevoid().wuerfele();
    }

    @Override
    protected int erwuerfleGroesse() {
        if (this.getGeschlecht().equals((Object)Geschlecht.\u00d400000)) {
            return this.ifnewvoid.\u00d40O000().wuerfele();
        }
        return this.ifnewvoid.\u00f40O000().wuerfele();
    }

    @Override
    protected int getBasisGPKosten() {
        return this.ifnewvoid.getGPKosten();
    }

    @Override
    protected void setzeAlleVarianten() {
        if (this.ifnewvoid == null) {
            return;
        }
        this.\u00f5\u00f5OO00.\u00f5O0000();
    }

    @Override
    protected void setzeModifikationen() {
        if (this.ifnewvoid == null) {
            return;
        }
        this.\u00f5\u00f5OO00.\u00d6O0000();
    }

    @Override
    protected void setzeMoeglicheVarianten() {
        if (this.ifnewvoid == null) {
            return;
        }
        this.\u00f5\u00f5OO00.Object();
    }

    private void \u00d2\u00d2O000() {
        this.\u00f5\u00f5OO00 = new O0oO(this.ifnewvoid, this, this);
        this.setzeMoeglicheVarianten();
        this.setzeAlleVarianten();
    }
}

