/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.werteplugin.A;

import helden.framework.E.B;
import helden.framework.E.C.E;
import helden.framework.E.F;
import helden.plugin.werteplugin.A.OO0O;
import helden.plugin.werteplugin.PluginFernkampfWaffe;
import helden.plugin.werteplugin.PluginTalent;

public class J
implements PluginFernkampfWaffe {
    private E \u00d200000;
    private String o00000;

    public J(F f2) {
        this.\u00d200000 = (E)f2.o00000(B.class, 0);
        this.o00000 = f2.toString();
    }

    @Override
    public int getLaden() {
        return this.\u00d200000.\u00d5o0000();
    }

    @Override
    public String getMunitionsArt() {
        return helden.framework.E.C.F.\u00d8O0000(this.\u00d200000.whilesuper());
    }

    @Override
    public int[] getReichweite() {
        int[] nArray = new int[]{this.\u00d200000.\u00d6o0000().o00000(0), this.\u00d200000.\u00d6o0000().o00000(1), this.\u00d200000.\u00d6o0000().o00000(2), this.\u00d200000.\u00d6o0000().o00000(3), this.\u00d200000.\u00d6o0000().o00000(4)};
        return nArray;
    }

    @Override
    public PluginTalent getTalent() {
        return new OO0O(this.\u00d200000.\u00f5o0000().get(0));
    }

    @Override
    public int[] getTrefferpunkte() {
        int[] nArray = new int[]{this.\u00d200000.\u00d8o0000().\u00d400000(), this.\u00d200000.\u00d8o0000().Object(), this.\u00d200000.\u00d8o0000().o00000()};
        return nArray;
    }

    @Override
    public int[] getTrefferpunkteModifikation() {
        int[] nArray = new int[]{this.\u00d200000.\u00f6o0000().o00000(0), this.\u00d200000.\u00f6o0000().o00000(1), this.\u00d200000.\u00f6o0000().o00000(2), this.\u00d200000.\u00f6o0000().o00000(3), this.\u00d200000.\u00f6o0000().o00000(4)};
        return nArray;
    }

    @Override
    public String toString() {
        return this.o00000;
    }
}

