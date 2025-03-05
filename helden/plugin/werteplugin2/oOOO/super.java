/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.werteplugin2.oOOO;

import helden.framework.E.B;
import helden.framework.E.C.E;
import helden.framework.E.F;
import helden.framework.held.oO0O;
import helden.plugin.werteplugin.A.OO0O;
import helden.plugin.werteplugin.PluginTalent;
import helden.plugin.werteplugin2.PluginFernkampfWaffe2;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class super
implements PluginFernkampfWaffe2 {
    private E \u00d600000;
    private oO0O \u00d300000;
    private int String;
    private F \u00d500000;

    public super(F f2, oO0O oO0O2, int n) {
        this.\u00d500000 = f2;
        this.\u00d600000 = (E)f2.o00000(B.class, 0);
        this.\u00d300000 = oO0O2;
        this.String = n;
    }

    @Override
    public int getFernkammpfWert() {
        return this.\u00d300000.null(this.String - 1);
    }

    @Override
    public int getLaden() {
        return this.\u00d600000.\u00d5o0000();
    }

    @Override
    public String getMunitionsArt() {
        return helden.framework.E.C.F.\u00d8O0000(this.\u00d600000.whilesuper());
    }

    @Override
    public String getName() {
        return this.\u00d500000.OO0000();
    }

    @Override
    public int[] getReichweite() {
        int[] nArray = new int[]{this.\u00d600000.\u00d6o0000().o00000(0), this.\u00d600000.\u00d6o0000().o00000(1), this.\u00d600000.\u00d6o0000().o00000(2), this.\u00d600000.\u00d6o0000().o00000(3), this.\u00d600000.\u00d6o0000().o00000(4)};
        return nArray;
    }

    public int super() {
        return this.String;
    }

    @Override
    public PluginTalent getTalent() {
        return new OO0O(this.\u00d600000.\u00f5o0000().get(0));
    }

    @Override
    public int[] getTrefferpunkte() {
        int[] nArray = new int[]{this.\u00d600000.\u00d8o0000().\u00d400000(), this.\u00d600000.\u00d8o0000().Object(), this.\u00d600000.\u00d8o0000().o00000()};
        return nArray;
    }

    @Override
    public int[] getTrefferpunkteModifikation() {
        int[] nArray = new int[]{this.\u00d600000.\u00f6o0000().o00000(0), this.\u00d600000.\u00f6o0000().o00000(1), this.\u00d600000.\u00f6o0000().o00000(2), this.\u00d600000.\u00f6o0000().o00000(3), this.\u00d600000.\u00f6o0000().o00000(4)};
        return nArray;
    }

    @Override
    public String toString() {
        return this.\u00d500000.toString();
    }
}

