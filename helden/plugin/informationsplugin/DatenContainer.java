/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.informationsplugin;

import helden.plugin.informationsplugin.EinzelInformation;
import java.util.ArrayList;
import java.util.Map;

public interface DatenContainer {
    public ArrayList<EinzelInformation> getEinstellungen();

    public ArrayList<EinzelInformation> getGegenstaende();

    public ArrayList<EinzelInformation> getGeld();

    public ArrayList<EinzelInformation> getSF();

    public ArrayList<EinzelInformation> getTalente();

    public ArrayList<EinzelInformation> getVorteile();

    public ArrayList<EinzelInformation> getWaffen();

    public Map<String, String> getWerte();
}

