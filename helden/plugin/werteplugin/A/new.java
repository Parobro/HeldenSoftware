/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.werteplugin.A;

import helden.framework.E.B;
import helden.framework.E.C.A;
import helden.framework.E.F;
import helden.framework.OoOO.E;
import helden.plugin.werteplugin.A.OO0O;
import helden.plugin.werteplugin.PluginNahkampfWaffe;
import helden.plugin.werteplugin.PluginTalent;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class new
implements PluginNahkampfWaffe {
    private String o00000;
    private A new;

    public new(F f2) {
        this.new = (A)f2.o00000(B.\u00d400000, 0);
        this.o00000 = f2.toString();
    }

    @Override
    public String[] getDistanzklasse() {
        String[] stringArray = new String[this.new.\u00d8\u00d50000().size()];
        for (int i2 = 0; i2 < this.new.\u00d8\u00d50000().size(); ++i2) {
            stringArray[i2] = this.new.\u00d8\u00d50000().get(i2).o00000();
        }
        return stringArray;
    }

    @Override
    public ArrayList<PluginTalent> getKampfTalente() {
        Iterator<E> iterator = this.new.\u00f6\u00d40000().iterator();
        ArrayList<PluginTalent> arrayList = new ArrayList<PluginTalent>();
        while (iterator.hasNext()) {
            arrayList.add(new OO0O(iterator.next()));
        }
        return arrayList;
    }

    @Override
    public int[] getKoerperkraftzuschlag() {
        int[] nArray = new int[]{this.new.\u00d200000().\u00d300000(), this.new.\u00d200000().o00000()};
        return nArray;
    }

    @Override
    public PluginTalent[] getTalente() {
        PluginTalent[] pluginTalentArray = new PluginTalent[this.new.\u00f6\u00d40000().size()];
        for (int i2 = 0; i2 < this.new.\u00f6\u00d40000().size(); ++i2) {
            pluginTalentArray[i2] = new OO0O(this.new.\u00f6\u00d40000().get(i2));
        }
        return pluginTalentArray;
    }

    @Override
    public int[] getTrefferpunkte() {
        int[] nArray = new int[]{this.new.o\u00d50000().\u00d400000(), this.new.o\u00d50000().Object(), this.new.o\u00d50000().o00000()};
        return nArray;
    }

    @Override
    public int getWmAT() {
        return this.new.\u00d5\u00d50000().o00000();
    }

    @Override
    public int getWmPA() {
        return this.new.\u00d5\u00d50000().new();
    }

    @Override
    public boolean isSchadensartAusdauer() {
        return this.new.StringString();
    }

    @Override
    public String toString() {
        return this.o00000;
    }
}

