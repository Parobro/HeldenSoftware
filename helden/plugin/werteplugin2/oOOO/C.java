/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.werteplugin2.oOOO;

import helden.framework.E.C.A;
import helden.framework.E.F;
import helden.framework.OoOO.E;
import helden.framework.held.B;
import helden.framework.held.oO0O;
import helden.plugin.werteplugin.A.OO0O;
import helden.plugin.werteplugin.PluginTalent;
import helden.plugin.werteplugin2.PluginNahkampfWaffe2;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class C
implements PluginNahkampfWaffe2 {
    private F return;
    private A \u00d500000;
    private int \u00d400000;
    private oO0O \u00d300000;

    public C(F f2, oO0O oO0O2, int n) {
        this.\u00d500000 = (A)f2.o00000(helden.framework.E.B.\u00d400000, 0);
        this.return = f2;
        this.\u00d300000 = oO0O2;
        this.\u00d400000 = n;
    }

    @Override
    public int getAttacke() {
        return this.\u00d300000.String(this.\u00d400000 - 1);
    }

    @Override
    public PluginTalent getBenutztesTalent() {
        return new OO0O(this.\u00d300000.\u00d3O0000(this.\u00d400000).o00000());
    }

    @Override
    public int[] getBF() {
        return new int[]{this.\u00d500000.o00000().\u00d400000(), this.\u00d500000.o00000().\u00d300000()};
    }

    @Override
    public String[] getDistanzklasse() {
        String[] stringArray = new String[this.\u00d500000.\u00d8\u00d50000().size()];
        for (int i2 = 0; i2 < this.\u00d500000.\u00d8\u00d50000().size(); ++i2) {
            stringArray[i2] = this.\u00d500000.\u00d8\u00d50000().get(i2).o00000();
        }
        return stringArray;
    }

    @Override
    public int[] getEndTP() {
        return null;
    }

    @Override
    public int getINIMod() {
        return this.\u00d500000.\u00d300000();
    }

    @Override
    public ArrayList<PluginTalent> getKampfTalente() {
        Iterator<E> iterator = this.\u00d500000.\u00f6\u00d40000().iterator();
        ArrayList<PluginTalent> arrayList = new ArrayList<PluginTalent>();
        while (iterator.hasNext()) {
            arrayList.add(new OO0O(iterator.next()));
        }
        return arrayList;
    }

    @Override
    public int[] getKoerperkraftzuschlag() {
        int[] nArray = new int[]{this.\u00d500000.\u00d200000().\u00d300000(), this.\u00d500000.\u00d200000().o00000()};
        return nArray;
    }

    @Override
    public String getName() {
        return this.return.OO0000();
    }

    @Override
    public int getParade() {
        try {
            return this.\u00d300000.\u00d200000(this.\u00d400000 - 1);
        }
        catch (B b) {
            return -99;
        }
    }

    @Override
    public PluginTalent[] getTalente() {
        PluginTalent[] pluginTalentArray = new PluginTalent[this.\u00d500000.\u00f6\u00d40000().size()];
        for (int i2 = 0; i2 < this.\u00d500000.\u00f6\u00d40000().size(); ++i2) {
            pluginTalentArray[i2] = new OO0O(this.\u00d500000.\u00f6\u00d40000().get(i2));
        }
        return pluginTalentArray;
    }

    @Override
    public int[] getTrefferpunkte() {
        int[] nArray = new int[]{this.\u00d500000.o\u00d50000().\u00d400000(), this.\u00d500000.o\u00d50000().Object(), this.\u00d500000.o\u00d50000().o00000()};
        return nArray;
    }

    @Override
    public int getWaffenNummer() {
        return this.\u00d400000;
    }

    @Override
    public int getWmAT() {
        return this.\u00d500000.\u00d5\u00d50000().o00000();
    }

    @Override
    public int getWmPA() {
        return this.\u00d500000.\u00d5\u00d50000().new();
    }

    @Override
    public boolean isSchadensartAusdauer() {
        return this.\u00d500000.StringString();
    }

    @Override
    public String toString() {
        return this.return.toString();
    }
}

