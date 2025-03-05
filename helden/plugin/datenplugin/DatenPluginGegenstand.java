/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenplugin;

import java.util.ArrayList;

public interface DatenPluginGegenstand {
    public int getAnzahl();

    public float getGesamtVolumen();

    public float getGewicht();

    public float getInnenVolumen();

    public String getName();

    public Object getObject();

    public int getPreis();

    public ArrayList<String> getSettings();

    public float getTragkraft();

    public boolean isBehaelter();

    public boolean istIntern();

    public boolean istModifiziert();

    public String toString();
}

