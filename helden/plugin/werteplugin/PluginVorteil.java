/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.werteplugin;

public interface PluginVorteil {
    public String[] getAusgewaehltes();

    public String getName();

    public int getWert();

    public boolean isAuswahlVorteil();

    public boolean isMehfachAuswahlVorteil();

    public boolean isNachteil();

    public boolean isWertVorteil();

    public String toString();
}

