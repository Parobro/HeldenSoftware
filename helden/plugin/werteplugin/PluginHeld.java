/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.werteplugin;

import helden.plugin.werteplugin.HeldAngaben;

public interface PluginHeld {
    public int getAbenteuerpunkte();

    public HeldAngaben getAngaben();

    public String getGeschlechtString();

    public Object getHeld();

    public String getKulturString();

    public String getProfessionString();

    public String getRasseString();

    public int getStufe();

    public boolean hatZaubersprueche();

    public String toString();
}

