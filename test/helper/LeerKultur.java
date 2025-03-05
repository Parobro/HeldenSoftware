/*
 * Decompiled with CFR 0.152.
 */
package test.helper;

import helden.framework.Geschlecht;
import helden.framework.OoOO.G;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.OooO;
import helden.framework.int.super;
import helden.model.ProfessionenFabrik;
import java.util.ArrayList;

public class LeerKultur
extends OooO {
    public LeerKultur() {
    }

    public LeerKultur(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
    }

    @Override
    public String getID() {
        return "K00";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return null;
    }

    @Override
    public G getMuttersprache() {
        return G.whilewhileString;
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        ArrayList<super> arrayList = ProfessionenFabrik.getAlleProfessionen(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        return arrayList;
    }

    @Override
    public G getSchrift() {
        return G.\u00d8\u00d8\u00f5000;
    }

    @Override
    public String toString() {
        return "Kulturlos";
    }

    @Override
    protected int getBasisGPKosten() {
        return 0;
    }
}

