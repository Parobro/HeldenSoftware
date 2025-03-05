/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.informationsplugin;

import helden.plugin.informationsplugin.DatenContainer;
import helden.plugin.informationsplugin.EinzelInformation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class DatenContainerImpl
implements DatenContainer {
    private ArrayList<EinzelInformation> \u00d400000 = new ArrayList();
    private ArrayList<EinzelInformation> Object = new ArrayList();
    private ArrayList<EinzelInformation> \u00d500000 = new ArrayList();
    private Map<String, String> \u00f400000 = new HashMap<String, String>();
    private ArrayList<EinzelInformation> \u00d200000 = new ArrayList();
    private ArrayList<EinzelInformation> void;
    private ArrayList<EinzelInformation> \u00d600000 = new ArrayList();
    private ArrayList<EinzelInformation> o00000 = new ArrayList();

    DatenContainerImpl() {
        this.void = new ArrayList();
    }

    @Override
    public ArrayList<EinzelInformation> getEinstellungen() {
        return this.o00000;
    }

    @Override
    public ArrayList<EinzelInformation> getGegenstaende() {
        return this.\u00d200000;
    }

    @Override
    public ArrayList<EinzelInformation> getGeld() {
        return this.void;
    }

    @Override
    public ArrayList<EinzelInformation> getSF() {
        return this.\u00d500000;
    }

    @Override
    public ArrayList<EinzelInformation> getTalente() {
        return this.\u00d400000;
    }

    @Override
    public ArrayList<EinzelInformation> getVorteile() {
        return this.Object;
    }

    @Override
    public ArrayList<EinzelInformation> getWaffen() {
        return this.\u00d600000;
    }

    @Override
    public Map<String, String> getWerte() {
        return this.\u00f400000;
    }
}

