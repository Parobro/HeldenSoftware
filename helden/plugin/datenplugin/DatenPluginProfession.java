/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenplugin;

import java.util.ArrayList;

public interface DatenPluginProfession {
    public ArrayList<String> getNamen();

    public ArrayList<String> getSettings();

    public ArrayList<String> getVarianten(String var1);

    public boolean hatBreitgefaecherteBildung();

    public boolean hatLehrmeister();

    public boolean hatMagischeWeiterbilfung();

    public boolean istIntern();

    public String toString();
}

