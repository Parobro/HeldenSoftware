/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenplugin;

import java.util.ArrayList;

public interface DatenPluginHeldAngaben {
    public ArrayList<String> getAlleAugenFarben();

    public ArrayList<String> getAlleHaarFarben();

    public String getAugenFarbe();

    public String[] getAussehenText();

    public String[] getFamilieText();

    public String getGeburtstagString();

    public int getGewicht(boolean var1);

    public int getGPRest();

    public int getGPStart();

    public String getGpWerte();

    public int getGroesse();

    public String getHaarFarbe();

    public String[] getNotiz();

    public String getStand();

    public String getTitel();

    public boolean setAugenFarbe(String var1);

    public boolean setAussehenText(String[] var1);

    public boolean setFamilieText(String[] var1);

    public boolean setGewicht(int var1, boolean var2);

    public boolean setGroesse(int var1);

    public boolean setHaarFarbe(String var1);

    public boolean setNotiz(String[] var1);

    public boolean setStand(String var1);

    public boolean setTitel(String var1);
}

