/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.werteplugin.A;

import helden.framework.E.C.void;
import helden.plugin.werteplugin.PluginSchild;

public class K
implements PluginSchild {
    private void \u00d200000;
    private String o00000;

    public K(void void_, String string) {
        this.\u00d200000 = void_;
        this.o00000 = string;
    }

    @Override
    public int getBruchfaktor() {
        return this.\u00d200000.\u00d8\u00d20000().\u00d300000();
    }

    @Override
    public int getBruchfaktorMin() {
        return this.\u00d200000.\u00d8\u00d20000().\u00d400000();
    }

    @Override
    public int getInitiativeModifikator() {
        return this.\u00d200000.nullnew();
    }

    @Override
    public int getWaffenModifikatorAT() {
        return this.\u00d200000.\u00f5\u00d20000().o00000();
    }

    @Override
    public int getWaffenModifikatorPA() {
        return this.\u00d200000.\u00f5\u00d20000().new();
    }

    @Override
    public String toString() {
        return this.o00000;
    }
}

