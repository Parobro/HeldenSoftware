/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenplugin;

import java.util.ArrayList;

public interface DatenPluginVorteil {
    public String[] getAusgewaehltes();

    public String getName();

    public ArrayList<String> getSettings();

    public int getWert();

    public boolean isAuswahlVorteil();

    public boolean isMehfachAuswahlVorteil();

    public boolean isNachteil();

    public boolean istIntern();

    public boolean isWertVorteil();

    public String toString();
}

