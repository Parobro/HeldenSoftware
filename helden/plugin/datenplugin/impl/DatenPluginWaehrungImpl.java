/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenplugin.impl;

import helden.framework.geld.Muenze;
import helden.framework.geld.Waehrung;
import helden.plugin.datenplugin.DatenPluginMuenze;
import helden.plugin.datenplugin.DatenPluginWaehrung;
import helden.plugin.datenplugin.impl.DatenPluginMuenzeImpl;
import java.util.Iterator;

public class DatenPluginWaehrungImpl
implements DatenPluginWaehrung {
    private Waehrung o00000;

    public DatenPluginWaehrungImpl(Waehrung waehrung) {
        this.o00000 = waehrung;
    }

    @Override
    public String getBezeichner() {
        return this.o00000.getBezeichner();
    }

    @Override
    public DatenPluginWaehrung getClone() {
        return new DatenPluginWaehrungImpl(this.o00000.getClone());
    }

    @Override
    public Iterator<String> getMuenzBezeichner() {
        return this.o00000.getMuenzBezeichner();
    }

    @Override
    public DatenPluginMuenze getMuenzen(String string) {
        return new DatenPluginMuenzeImpl(this.o00000.getMuenzen(string));
    }

    @Override
    public void setMuenzen(String string, DatenPluginMuenze datenPluginMuenze) {
        this.o00000.setMuenzen(string, (Muenze)datenPluginMuenze.getObject());
    }
}

