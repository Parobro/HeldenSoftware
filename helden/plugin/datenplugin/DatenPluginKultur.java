/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenplugin;

import java.util.ArrayList;

public interface DatenPluginKultur {
    public String getName();

    public ArrayList<String> getSettings();

    public ArrayList<String> getVarianten();

    public boolean istIntern();

    public String toString();
}

