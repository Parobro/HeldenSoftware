/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.werteplugin.A;

import helden.framework.E.B;
import helden.framework.E.C.void;
import helden.framework.E.F;
import helden.plugin.werteplugin.PluginParadeWaffe;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class class
implements PluginParadeWaffe {
    private void \u00d200000;
    private String super;

    public class(F f2) {
        try {
            this.\u00d200000 = ((void)f2.o00000(B.\u00d300000, 0)).\u00d6\u00d20000();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            // empty catch block
        }
        this.super = f2.toString();
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
        return this.super;
    }
}

