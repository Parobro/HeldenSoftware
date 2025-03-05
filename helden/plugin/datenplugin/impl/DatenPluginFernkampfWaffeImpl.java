/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenplugin.impl;

import helden.framework.E.C.F;
import helden.framework.OoOO.E;
import helden.plugin.datenplugin.DatenPluginFernkampfWaffe;
import helden.plugin.datenplugin.DatenPluginTalent;
import helden.plugin.datenplugin.impl.DatenPluginTalentImpl;
import java.util.ArrayList;
import java.util.List;

public class DatenPluginFernkampfWaffeImpl
implements DatenPluginFernkampfWaffe {
    private helden.framework.E.C.E o00000;

    public DatenPluginFernkampfWaffeImpl(helden.framework.E.C.E e) {
        this.o00000 = e;
    }

    @Override
    public int getLaden() {
        return this.o00000.\u00d5o0000();
    }

    @Override
    public String getMunitionsArt() {
        return F.\u00d8O0000(this.o00000.whilesuper());
    }

    @Override
    public String getName() {
        return this.o00000.toString();
    }

    @Override
    public int[] getReichweite() {
        int[] nArray = new int[5];
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            nArray[i2] = this.o00000.\u00d6o0000().o00000(i2);
        }
        return nArray;
    }

    @Override
    @Deprecated
    public DatenPluginTalent getTalent() {
        return new DatenPluginTalentImpl(this.o00000.\u00f5o0000().get(0));
    }

    @Override
    public List<DatenPluginTalent> getTalente() {
        ArrayList<DatenPluginTalent> arrayList = new ArrayList<DatenPluginTalent>();
        for (E e : this.o00000.\u00f5o0000()) {
            arrayList.add(new DatenPluginTalentImpl(e));
        }
        return arrayList;
    }

    @Override
    public int[] getTrefferpunkte() {
        int[] nArray = new int[]{this.o00000.\u00d8o0000().\u00d400000(), this.o00000.\u00d8o0000().Object(), this.o00000.\u00d8o0000().o00000()};
        return nArray;
    }

    @Override
    public int[] getTrefferpunkteModifikation() {
        int[] nArray = new int[5];
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            nArray[i2] = this.o00000.\u00f6o0000().o00000(i2);
        }
        return nArray;
    }

    @Override
    public boolean istImprovisierteWaffe() {
        return this.o00000.thisnew();
    }

    @Override
    public boolean istModifiziert() {
        return false;
    }
}

