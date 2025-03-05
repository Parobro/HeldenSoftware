/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenxmlplugin;

import java.util.HashSet;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class XMLDatenGeneratorCfg {
    private HashSet<cfgOptions> new;
    private int o00000;

    public XMLDatenGeneratorCfg(int n) {
        this.o00000 = n;
        this.new = new HashSet();
    }

    public int getVersion() {
        return this.o00000;
    }

    public XMLDatenGeneratorCfg incl(cfgOptions cfgOptions2) {
        this.new.add(cfgOptions2);
        return this;
    }

    public boolean show(cfgOptions cfgOptions2) {
        return this.new.contains((Object)cfgOptions2);
    }

    public static enum cfgOptions {
        \u00d200000;

    }
}

