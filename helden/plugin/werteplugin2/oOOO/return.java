/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.werteplugin2.oOOO;

import helden.framework.E.B;
import helden.framework.E.C.void;
import helden.framework.E.F;
import helden.framework.held.oO0O;
import helden.plugin.werteplugin2.PluginSchildParadewaffe;

public class return
implements PluginSchildParadewaffe {
    private oO0O Object;
    private F \u00d600000;
    private int \u00d400000;
    private void \u00d500000;

    public return(F f2, oO0O oO0O2, int n) {
        this.\u00d600000 = f2;
        this.\u00d500000 = (void)this.\u00d600000.o00000(B.\u00d300000, 0);
        this.Object = oO0O2;
        this.\u00d400000 = n;
    }

    @Override
    public String getBenutzungsart() {
        return this.Object.\u00f600000(this.\u00d400000);
    }

    @Override
    public int getBruchfaktor() {
        return this.\u00d500000.\u00d8\u00d20000().\u00d300000();
    }

    @Override
    public int getBruchfaktorMin() {
        return this.\u00d500000.\u00d8\u00d20000().\u00d400000();
    }

    @Override
    public int getInitiativeModifikator() {
        return this.\u00d500000.nullnew();
    }

    @Override
    public String getName() {
        return this.\u00d600000.OO0000();
    }

    @Override
    public int getParade() {
        return this.Object.\u00d600000(this.\u00d400000 - 1);
    }

    @Override
    public int getWaffenModifikatorAT() {
        return this.\u00d500000.\u00f5\u00d20000().o00000();
    }

    @Override
    public int getWaffenModifikatorPA() {
        return this.\u00d500000.\u00f5\u00d20000().new();
    }

    @Override
    public String toString() {
        return this.\u00d600000.toString();
    }
}

