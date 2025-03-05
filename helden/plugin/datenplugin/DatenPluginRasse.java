/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenplugin;

import java.util.ArrayList;

public interface DatenPluginRasse {
    public ArrayList<String> getAugenfarben();

    public ArrayList<String> getHaarfarben();

    public int getMaxGewicht();

    public int getMaxGroesse();

    public int getMinGewicht();

    public int getMinGroesse();

    public String getName();

    public ArrayList<String> getSettings();

    public ArrayList<String> getVarianten();

    public boolean istIntern();

    public String toString();
}

