/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.werteplugin2.oOOO;

import helden.framework.E.C.B;
import helden.framework.E.F;
import helden.framework.held.oO0O;
import helden.plugin.werteplugin.A.H;
import helden.plugin.werteplugin.A.OO0O;
import helden.plugin.werteplugin.PluginRuestungsTeil;
import helden.plugin.werteplugin.PluginTalent;
import helden.plugin.werteplugin2.PluginAusruestung2;
import helden.plugin.werteplugin2.PluginFernkampfWaffe2;
import helden.plugin.werteplugin2.PluginNahkampfWaffe2;
import helden.plugin.werteplugin2.PluginSchildParadewaffe;
import helden.plugin.werteplugin2.oOOO.C;
import helden.plugin.werteplugin2.oOOO.return;
import helden.plugin.werteplugin2.oOOO.super;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class E
implements PluginAusruestung2 {
    private oO0O super;

    public E(oO0O oO0O2) {
        this.super = oO0O2;
    }

    @Override
    public int getAusweichen() {
        return this.super.\u00d2O0000();
    }

    public PluginTalent super(PluginNahkampfWaffe2 pluginNahkampfWaffe2) {
        if (this.super.\u00f8O0000(pluginNahkampfWaffe2.getWaffenNummer()) != null) {
            return new OO0O(this.super.\u00d3O0000(pluginNahkampfWaffe2.getWaffenNummer()).o00000());
        }
        return null;
    }

    public PluginFernkampfWaffe2[] super() {
        PluginFernkampfWaffe2[] pluginFernkampfWaffe2Array = new PluginFernkampfWaffe2[3];
        for (int i2 = 1; i2 < 3; ++i2) {
            if (this.super.\u00d500000(i2) == null) continue;
            pluginFernkampfWaffe2Array[i2 - 1] = new super(this.super.\u00d500000(i2), this.super, i2);
        }
        return pluginFernkampfWaffe2Array;
    }

    @Override
    public PluginRuestungsTeil getGesammtRuestung() {
        return new H(this.super.\u00f800000(), "gesamt");
    }

    @Override
    public int getKomboMitSchildParadewaffe(PluginNahkampfWaffe2 pluginNahkampfWaffe2) {
        return this.super.\u00d800000(pluginNahkampfWaffe2.getWaffenNummer());
    }

    @Override
    public PluginNahkampfWaffe2[] getNahkampfWaffen() {
        PluginNahkampfWaffe2[] pluginNahkampfWaffe2Array = new PluginNahkampfWaffe2[5];
        for (int i2 = 1; i2 < 5; ++i2) {
            if (this.super.\u00f8O0000(i2) == null) continue;
            pluginNahkampfWaffe2Array[i2 - 1] = new C(this.super.\u00f8O0000(i2), this.super, i2);
        }
        return pluginNahkampfWaffe2Array;
    }

    @Override
    public int getRaufenParade() {
        return this.super.\u00d800000();
    }

    @Override
    public String getRaufenTP() {
        return this.super.null();
    }

    @Override
    public int getRauferAttacke() {
        return this.super.\u00f6O0000();
    }

    @Override
    public int getRingenAttacke() {
        return this.super.\u00d5O0000();
    }

    @Override
    public int getRingenParade() {
        return this.super.String();
    }

    @Override
    public String getRingenTP() {
        return this.super.\u00f600000();
    }

    @Override
    public PluginRuestungsTeil[] getRuestungsTeile() {
        ArrayList<H> arrayList = new ArrayList<H>();
        Iterator<F> iterator = this.super.oO0000().iterator();
        while (iterator.hasNext()) {
            try {
                F f2 = iterator.next();
                B b = ((B)f2.o00000(helden.framework.E.B.OO0000, 0)).private();
                arrayList.add(new H(b, f2.toString()));
            }
            catch (CloneNotSupportedException cloneNotSupportedException) {
                cloneNotSupportedException.printStackTrace();
            }
        }
        return arrayList.toArray(new PluginRuestungsTeil[arrayList.size()]);
    }

    @Override
    public PluginSchildParadewaffe[] getSchildParadewaffe() {
        int n = 0;
        ArrayList<return> arrayList = new ArrayList<return>();
        if (this.super.\u00f5O0000(1) != null) {
            ++n;
            arrayList.add(new return(this.super.\u00f5O0000(1), this.super, 1));
        }
        if (this.super.\u00f5O0000(2) != null) {
            ++n;
            arrayList.add(new return(this.super.\u00f5O0000(2), this.super, 2));
        }
        return arrayList.toArray(new PluginSchildParadewaffe[n]);
    }

    @Override
    public boolean istZonenRuestungsBerechnung() {
        return this.super.\u00d200000();
    }
}

