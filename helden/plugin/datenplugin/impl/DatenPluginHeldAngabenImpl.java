/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenplugin.impl;

import helden.framework.held.a.oooo_0;
import helden.framework.held.a.oooo_1;
import helden.plugin.datenplugin.DatenPluginHeldAngaben;
import java.util.ArrayList;

public class DatenPluginHeldAngabenImpl
implements DatenPluginHeldAngaben {
    private oooo_0 o00000;

    public DatenPluginHeldAngabenImpl(oooo_0 oooo_02) {
        this.o00000 = oooo_02;
    }

    @Override
    public ArrayList<String> getAlleAugenFarben() {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (String string : oooo_1.\u00d200000()) {
            arrayList.add(string);
        }
        return arrayList;
    }

    @Override
    public ArrayList<String> getAlleHaarFarben() {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (String string : oooo_1.\u00d200000()) {
            arrayList.add(string);
        }
        return arrayList;
    }

    @Override
    public String getAugenFarbe() {
        return this.o00000.getAugenFarbe();
    }

    @Override
    public String[] getAussehenText() {
        return this.o00000.getAussehenText();
    }

    @Override
    public String[] getFamilieText() {
        return this.o00000.getFamilieText();
    }

    @Override
    public String getGeburtstagString() {
        return this.o00000.getGeburtstagString();
    }

    @Override
    public int getGewicht(boolean bl) {
        return this.o00000.getGewicht(bl);
    }

    @Override
    public int getGPRest() {
        return this.o00000.getGPRest();
    }

    @Override
    public int getGPStart() {
        return this.o00000.getGPStart();
    }

    @Override
    public String getGpWerte() {
        return this.o00000.getGpWerte();
    }

    @Override
    public int getGroesse() {
        return this.o00000.getGroesse();
    }

    @Override
    public String getHaarFarbe() {
        return this.o00000.getHaarFarbe();
    }

    @Override
    public String[] getNotiz() {
        return this.o00000.getNotiz();
    }

    @Override
    public String getStand() {
        return this.o00000.getStand();
    }

    @Override
    public String getTitel() {
        return this.o00000.getTitel();
    }

    @Override
    public boolean setAugenFarbe(String string) {
        this.o00000.class(string);
        return true;
    }

    @Override
    public boolean setAussehenText(String[] stringArray) {
        this.o00000.super(stringArray);
        return true;
    }

    @Override
    public boolean setFamilieText(String[] stringArray) {
        this.o00000.\u00d200000(stringArray);
        return true;
    }

    @Override
    public boolean setGewicht(int n, boolean bl) {
        if (bl) {
            n = (int)((double)n / 1.75);
        }
        this.o00000.\u00d200000(n);
        return true;
    }

    @Override
    public boolean setGroesse(int n) {
        this.o00000.\u00d300000(n);
        return true;
    }

    @Override
    public boolean setHaarFarbe(String string) {
        this.o00000.super(string);
        return true;
    }

    @Override
    public boolean setNotiz(String[] stringArray) {
        this.o00000.\u00d300000(stringArray);
        return true;
    }

    @Override
    public boolean setStand(String string) {
        this.o00000.\u00d400000(string);
        return true;
    }

    @Override
    public boolean setTitel(String string) {
        this.o00000.\u00d300000(string);
        return true;
    }
}

