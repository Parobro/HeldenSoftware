/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.int;

import helden.framework.C.I;
import helden.framework.EigeneErweiterungenMoeglich;
import helden.framework.Geschlecht;
import helden.framework.OoOO.G;
import helden.framework.OoOO.interface;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.F;
import helden.framework.int.OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import java.util.ArrayList;
import java.util.List;

public abstract class super
extends OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
implements F,
EigeneErweiterungenMoeglich {
    public static final int \u00f5\u00f4\u00f6000 = 13;
    private voidsuper \u00d8\u00f4\u00f6000;
    private voidsuper \u00f4\u00f4\u00f6000;
    private ArrayList<G> privatefloatclass;
    private k_0<oo0o_0> \u00f8\u00f4\u00f6000;

    protected super() {
    }

    protected super(Geschlecht geschlecht, voidsuper voidsuper2, voidsuper voidsuper3) {
        super(geschlecht);
        this.setMuttersprache(voidsuper2);
        this.setMuttersprachenSchrift(voidsuper3);
        this.\u00f8\u00f4\u00f6000 = new k_0();
        this.privatefloatclass = new ArrayList();
    }

    @Override
    public void addTalentTyp2Auswahl(interface interface_) {
        super.addTalentTyp2Auswahl(interface_);
    }

    public boolean adeligVoraussetzung() {
        return false;
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        if (this.getZweitLehrsprache() != null) {
            for (G g2 : this.getZweitLehrsprache()) {
                if (g2.toString().equals("Muttersprache")) continue;
                if (this.mutterspracheGesetzt() && this.getMuttersprache().equals(g2) || this.privatefloatclass.contains(g2)) {
                    this.setTalentwert(g2, 4);
                    continue;
                }
                this.setTalentwert(g2, n - 4);
            }
        }
    }

    public List<String> getBesondererBesitzMoeglichkeiten() {
        return new ArrayList<String>();
    }

    public ArrayList<I> getEntfernteKutlurVorteile() {
        return new ArrayList<I>();
    }

    public abstract String getID();

    public ArrayList<String> getIDs() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add(this.getID());
        return arrayList;
    }

    public _o getKategorie() {
        return _o.\u00f400000;
    }

    public ArrayList<G> getKulturLehrZweitSprache() {
        return this.privatefloatclass;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 13;
    }

    public voidsuper getMuttersprache() {
        return this.\u00d8\u00f4\u00f6000;
    }

    public voidsuper getMuttersprachenSchrift() {
        return this.\u00f4\u00f4\u00f6000;
    }

    public int getPermanenteASP() {
        return 0;
    }

    public k_0<oo0o_0> getVerteilTalente() {
        return this.\u00f8\u00f4\u00f6000;
    }

    public super hatProfession(Class clazz) {
        if (this.getClass().equals(clazz)) {
            return this;
        }
        return null;
    }

    @Deprecated
    public boolean istElfischeProfession() {
        return false;
    }

    @Deprecated
    public boolean istErstProfession() {
        return false;
    }

    @Override
    public boolean istIntern() {
        return true;
    }

    public boolean istMagiedilletantErlaubt() {
        return true;
    }

    public boolean istMagiedilletantischeProfession() {
        return false;
    }

    public boolean istMagischeProfession() {
        return this.getVorteile().\u00d400000(I.forsupersuper) || this.getVorteile().\u00d400000(I.\u00f5\u00d8o000) || this.getVorteile().\u00d400000(I.\u00d5\u00d3O000);
    }

    @Override
    public boolean istProfession() {
        return true;
    }

    public boolean istVeteranErlaubt() {
        return true;
    }

    public boolean istZeitaufwendig() {
        return this.getBasisGPKosten() > 15 || this.getVorteile().\u00d400000(I.ifprivate) || this.getVorteile().\u00d400000(I.o\u00d6o000) || this.getVorteile().\u00d400000(I.\u00d50\u00d2000) || this.getVorteile().\u00d400000(I.\u00d3\u00d3o000) || this.getVorteile().\u00d400000(I.returnfor);
    }

    public boolean mutterspracheGesetzt() {
        return this.\u00d8\u00f4\u00f6000 != null;
    }

    public void setKulturZweitLehrsprache(ArrayList<G> arrayList) {
        if (arrayList != null) {
            this.privatefloatclass.addAll(arrayList);
        }
    }

    public void setMuttersprache(voidsuper voidsuper2) {
        this.\u00d8\u00f4\u00f6000 = voidsuper2;
    }

    public void setMuttersprachenSchrift(voidsuper voidsuper2) {
        this.\u00f4\u00f4\u00f6000 = voidsuper2;
    }

    protected void addVerteilTalent(oo0o_0 oo0o_02, int n) {
        this.\u00f8\u00f4\u00f6000.o00000(oo0o_02, n);
        if (n > 0) {
            this.addTalentwert(oo0o_02, n);
        }
    }

    protected void addVerteilTalente(ArrayList<oo0o_0> arrayList) {
        for (oo0o_0 oo0o_02 : this.getVerteilTalente()) {
            arrayList.add(oo0o_02);
        }
    }

    @Override
    protected abstract int getBasisGPKosten();

    protected int[] getUmverteilen() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ArrayList<oo0o_0> arrayList2 = new ArrayList<oo0o_0>();
        for (oo0o_0 oo0o_02 : this.\u00f8\u00f4\u00f6000) {
            if (!this.getGewaehlteTalente().contains(oo0o_02)) continue;
            int n = this.\u00f8\u00f4\u00f6000.Object(oo0o_02);
            if (n > 0) {
                arrayList.add(new Integer(n));
                this.setTalentauswahl(oo0o_02, this.getWahlWert0(oo0o_02) - n);
            }
            arrayList2.add(oo0o_02);
        }
        for (oo0o_0 oo0o_02 : arrayList2) {
            this.\u00f8\u00f4\u00f6000.o00000(oo0o_02);
        }
        Object object = new int[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            object[i2] = (Integer)arrayList.get(i2);
        }
        return object;
    }

    protected ArrayList<oo0o_0> getUmverteilenTalente() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        for (oo0o_0 oo0o_02 : this.getVerteilTalente()) {
            arrayList.add(oo0o_02);
        }
        return arrayList;
    }

    protected boolean hatMehrZumUmverteilen() {
        for (oo0o_0 oo0o_02 : this.\u00f8\u00f4\u00f6000) {
            int n;
            if (!this.getGewaehlteTalente().contains(oo0o_02) || (n = this.\u00f8\u00f4\u00f6000.Object(oo0o_02)) <= 0) continue;
            return true;
        }
        return false;
    }

    /*
     * Illegal identifiers - consider using --renameillegalidents true
     */
    public static enum _o {
        \u00f400000,
        \u00d300000,
        \u00d800000,
        \u00d200000,
        \u00d600000,
        super,
        class;

    }
}

