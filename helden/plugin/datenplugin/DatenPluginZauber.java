/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenplugin;

import java.util.ArrayList;

public interface DatenPluginZauber {
    public String getBezeichnung();

    public String[] getMerkmale();

    public String[] getProbe();

    public String[] getRepraesentationen();

    public ArrayList<String> getSettings();

    public Object getZauber();

    public boolean isHauszauber();

    public boolean istIntern();

    public String toString();
}

