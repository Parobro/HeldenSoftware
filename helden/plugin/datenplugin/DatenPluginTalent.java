/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenplugin;

import java.util.ArrayList;

public interface DatenPluginTalent {
    public String getBehinderung();

    public String getBezeichnung();

    public String[] getProbe();

    public ArrayList<String> getSettings();

    public Object getTalent();

    public String getTalentart();

    public boolean istIntern();

    public String toString();
}

