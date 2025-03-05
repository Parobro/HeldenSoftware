/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.int;

import helden.framework.EigeneErweiterungenMoeglich;
import helden.framework.Geschlecht;
import helden.framework.Wuerfelwurf;
import helden.framework.held.A.A;
import helden.framework.held.A.OOoO;
import helden.framework.held.a.oooo_1;
import helden.framework.int.OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.int.OooO;
import helden.framework.settings.Settings;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from helden.framework.int.o0OO
 */
public abstract class o0oo_0
extends OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
implements EigeneErweiterungenMoeglich {
    private int \u00d8\u00f40O00;

    protected o0oo_0() {
    }

    protected o0oo_0(Geschlecht geschlecht) {
        super(geschlecht);
    }

    public abstract ArrayList<Integer> getAlterungsStufen();

    public ArrayList<oooo_1> getAugenfarben() {
        return new ArrayList<oooo_1>();
    }

    public ArrayList<A> getFarben() {
        int n;
        ArrayList<A> arrayList = new ArrayList<A>();
        A a2 = new A(OOoO.super, new Wuerfelwurf(1, 0, 0));
        int n2 = 1;
        for (oooo_1 oooo_12 : this.getHaarfarben()) {
            n = n2 + oooo_12.\u00d300000() - 1;
            a2.o00000(n2, n2 + oooo_12.\u00d300000() - 1, oooo_12.String());
            n2 = n + 1;
        }
        arrayList.add(a2);
        a2 = new A(OOoO.\u00d300000, new Wuerfelwurf(1, 0, 0));
        n2 = 1;
        for (oooo_1 oooo_12 : this.getAugenfarben()) {
            n = n2 + oooo_12.\u00d300000() - 1;
            a2.o00000(n2, n2 + oooo_12.\u00d300000() - 1, oooo_12.String());
            n2 = n + 1;
        }
        arrayList.add(a2);
        return arrayList;
    }

    public abstract int getGewicht();

    public int getGroesse() {
        if (this.\u00d8\u00f40O00 == 0) {
            this.groesseWuerfeln();
        }
        return this.\u00d8\u00f40O00;
    }

    public ArrayList<oooo_1> getHaarfarben() {
        return new ArrayList<oooo_1>();
    }

    public abstract String getID();

    public ArrayList<String> getIDs() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add(this.getID());
        return arrayList;
    }

    public OooO getKultur(Class<?> clazz) {
        for (OooO oooO2 : this.getKulturen(false)) {
            if (!oooO2.getClass().equals(clazz)) continue;
            return oooO2;
        }
        return null;
    }

    public abstract ArrayList<OooO> getKulturen(boolean var1);

    public abstract int getMaxGewicht();

    public abstract int getMaxGroesse();

    public abstract int getMinGewicht();

    public abstract int getMinGroesse();

    public List<Settings> getSettings() {
        return null;
    }

    public void groesseWuerfeln() {
        this.setGroesse(this.erwuerfleGroesse());
    }

    @Override
    public boolean istIntern() {
        return true;
    }

    public boolean istMagiedilletantErlaubt() {
        return true;
    }

    public boolean istSchelmErlaubt() {
        return true;
    }

    public boolean istVeteranErlaubt() {
        return true;
    }

    public void setGroesse(int n) {
        this.\u00d8\u00f40O00 = n;
    }

    public abstract int wurfeleAlter();

    protected abstract int erwuerfleGroesse();

    @Override
    protected abstract int getBasisGPKosten();
}

