/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.int;

import helden.framework.EigeneErweiterungenMoeglich;
import helden.framework.Geschlecht;
import helden.framework.OoOO.G;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.int.super;
import helden.framework.oooo.b_0;
import helden.framework.settings.Settings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class OooO
extends OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
implements EigeneErweiterungenMoeglich {
    protected OooO() {
    }

    protected OooO(Geschlecht geschlecht) {
        super(geschlecht);
    }

    public boolean adeligVoraussetzung() {
        return false;
    }

    public abstract String getID();

    public ArrayList<String> getIDs() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add(this.getID());
        return arrayList;
    }

    public String getKulturkundeBezeichnung() {
        return null;
    }

    public int getMaximalSozialstatus() {
        return 13;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 0;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    public abstract G getMuttersprache();

    public ArrayList<String> getNamesGeneratorListen(floatsuper floatsuper2) {
        return new ArrayList<String>();
    }

    public abstract ArrayList<super> getProfessionen(floatsuper var1);

    public abstract G getSchrift();

    public List<Settings> getSettings() {
        return null;
    }

    @Override
    public boolean istIntern() {
        return true;
    }

    public boolean istMagiedilletantErlaubt() {
        return true;
    }

    public boolean istMutterschriftGewaehlt() {
        return false;
    }

    public boolean istMutterspracheGewaehlt() {
        return false;
    }

    public boolean istVeteranErlaubt() {
        return true;
    }

    public void setSprachen(int n, boolean bl) {
        if (bl && this.getMuttersprache() != null) {
            this.setTalentwert(this.getMuttersprache(), n - 2);
        }
        if (this.getZweitLehrsprache() != null) {
            Iterator<G> iterator = this.getZweitLehrsprache().iterator();
            while (iterator.hasNext()) {
                this.setTalentwert(iterator.next(), n - 4);
            }
        }
    }

    public void setzeMuttersprache(G g2) {
    }

    public void setzeMuttersSchriftSrache(G g2) {
    }

    @Override
    protected abstract int getBasisGPKosten();
}

