/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenplugin.impl;

import helden.framework.geld.Waehrung;
import helden.framework.geld.WaehrungsFabrik;
import helden.plugin.datenplugin.DatenPluginWaehrung;
import helden.plugin.datenplugin.DatenPluginWaehrungsCollection;
import helden.plugin.datenplugin.impl.DatenPluginWaehrungImpl;
import java.util.ArrayList;
import java.util.Collection;

public class DatenPluginWaehrungsCollectionImpl
implements DatenPluginWaehrungsCollection {
    private WaehrungsFabrik o00000;

    public DatenPluginWaehrungsCollectionImpl(WaehrungsFabrik waehrungsFabrik) {
        this.o00000 = waehrungsFabrik;
    }

    @Override
    public Collection<DatenPluginWaehrung> getAllWaehrungen() {
        ArrayList<DatenPluginWaehrung> arrayList = new ArrayList<DatenPluginWaehrung>();
        for (Waehrung waehrung : this.o00000.getAllWaehrungen()) {
            arrayList.add(new DatenPluginWaehrungImpl(waehrung));
        }
        return arrayList;
    }

    @Override
    public Collection<String> getAllWaehrungenBezeichner() {
        return this.o00000.getAllWaehrungenBezeichner();
    }

    @Override
    public DatenPluginWaehrung getWaehrungen(String string) {
        return new DatenPluginWaehrungImpl(this.o00000.getWaehrungen(string));
    }
}

