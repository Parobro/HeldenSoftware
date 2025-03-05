/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenplugin;

import helden.plugin.datenplugin.DatenPluginHeldAngaben;
import helden.plugin.datenplugin.DatenPluginKultur;
import helden.plugin.datenplugin.DatenPluginProfession;
import helden.plugin.datenplugin.DatenPluginRasse;

public interface DatenPluginHeld {
    public int getAbenteuerpunkte();

    public DatenPluginHeldAngaben getAngaben();

    public String getGeschlechtString();

    public String getHeldenID();

    public Object getHeldObject();

    public DatenPluginKultur getKulturString();

    public DatenPluginProfession getProfessionString();

    public DatenPluginRasse getRasse();

    public int getStufe();

    public boolean hatZaubersprueche();

    public String toString();
}

