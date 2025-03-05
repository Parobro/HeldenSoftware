/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.werteplugin.A;

import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.oo0o_0;
import helden.plugin.werteplugin.PluginTalent;

public class OO0O
implements PluginTalent {
    private oo0o_0 o00000;

    public OO0O(oo0o_0 oo0o_02) {
        this.o00000 = oo0o_02;
    }

    @Override
    public String getBehinderung() {
        if (this.o00000 instanceof voidsuper) {
            voidsuper voidsuper2 = (voidsuper)this.o00000;
            return voidsuper2.superclass();
        }
        return "";
    }

    @Override
    public String getBezeichnung() {
        return this.o00000.toString();
    }

    @Override
    public String[] getProbe() {
        String[] stringArray = new String[]{this.o00000.getTalentprobe().o00000(0).toString(), this.o00000.getTalentprobe().o00000(1).toString(), this.o00000.getTalentprobe().o00000(2).toString()};
        return stringArray;
    }

    @Override
    public Object getTalent() {
        return this.o00000;
    }

    @Override
    public String getTalentart() {
        return this.o00000.getArt().toString();
    }

    @Override
    public String toString() {
        return this.o00000.toString();
    }
}

