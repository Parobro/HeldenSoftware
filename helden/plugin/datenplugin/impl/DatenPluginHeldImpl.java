/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenplugin.impl;

import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.plugin.datenplugin.DatenPluginHeld;
import helden.plugin.datenplugin.DatenPluginHeldAngaben;
import helden.plugin.datenplugin.DatenPluginKultur;
import helden.plugin.datenplugin.DatenPluginProfession;
import helden.plugin.datenplugin.DatenPluginRasse;
import helden.plugin.datenplugin.impl.DatenPluginHeldAngabenImpl;
import helden.plugin.datenplugin.impl.DatenPluginKulturImpl;
import helden.plugin.datenplugin.impl.DatenPluginProfessionImpl;
import helden.plugin.datenplugin.impl.DatenPluginRasseImpl;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class DatenPluginHeldImpl
implements DatenPluginHeld {
    private OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO super;

    public DatenPluginHeldImpl(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        this.super = oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2;
    }

    @Override
    public int getAbenteuerpunkte() {
        return this.super.o\u00d30000();
    }

    @Override
    public DatenPluginHeldAngaben getAngaben() {
        return new DatenPluginHeldAngabenImpl(this.super.thissuper());
    }

    @Override
    public String getGeschlechtString() {
        return this.super.\u00d300000().toString();
    }

    @Override
    public String getHeldenID() {
        return this.super.\u00f4o0000();
    }

    @Override
    public Object getHeldObject() {
        return this.super;
    }

    @Override
    public DatenPluginKultur getKulturString() {
        return new DatenPluginKulturImpl(this.super.\u00f800000());
    }

    @Override
    public DatenPluginProfession getProfessionString() {
        return new DatenPluginProfessionImpl(this.super.\u00d800000());
    }

    @Override
    public DatenPluginRasse getRasse() {
        return new DatenPluginRasseImpl(this.super.o\u00d20000());
    }

    @Override
    public int getStufe() {
        return this.super.\u00d5O0000();
    }

    @Override
    public boolean hatZaubersprueche() {
        return this.super.\u00f500000();
    }
}

