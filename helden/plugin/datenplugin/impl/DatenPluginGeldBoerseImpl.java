/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenplugin.impl;

import helden.framework.geld.GeldBoerse;
import helden.framework.geld.Muenze;
import helden.plugin.datenplugin.DatenPluginGeldBoerse;
import helden.plugin.datenplugin.DatenPluginMuenze;
import helden.plugin.datenplugin.impl.DatenPluginMuenzeImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class DatenPluginGeldBoerseImpl
implements DatenPluginGeldBoerse {
    private GeldBoerse o00000;

    public DatenPluginGeldBoerseImpl(GeldBoerse geldBoerse) {
        this.o00000 = geldBoerse;
    }

    @Override
    public void addMuenze(DatenPluginMuenze datenPluginMuenze, int n) {
        this.o00000.addMuenze((Muenze)datenPluginMuenze.getObject(), n);
    }

    @Override
    public Vector<String> getGeldStrings() {
        return this.o00000.getGeldStrings(false);
    }

    @Override
    public int getMuenzAnzahl(DatenPluginMuenze datenPluginMuenze) {
        return this.o00000.getMuenzAnzahl((Muenze)datenPluginMuenze.getObject());
    }

    @Override
    public List<DatenPluginMuenze> getMuenzenList() {
        ArrayList<DatenPluginMuenze> arrayList = new ArrayList<DatenPluginMuenze>();
        Iterator<Muenze> iterator = this.o00000.getMuenzeIter();
        while (iterator.hasNext()) {
            arrayList.add(new DatenPluginMuenzeImpl(iterator.next()));
        }
        return arrayList;
    }

    @Override
    public void putMuenze(DatenPluginMuenze datenPluginMuenze, int n) {
        this.o00000.putMuenze((Muenze)datenPluginMuenze.getObject(), n);
    }
}

