/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.gmod;

import helden.framework.OOoO.K;
import helden.framework.gmod.GModAtome;
import helden.framework.settings.Settings;
import java.util.ArrayList;
import java.util.Collection;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class GModAuswahlen<T> {
    private ArrayList<T> \u00d300000;
    private ArrayList<GModAtome> \u00d400000;
    private String \u00d200000;
    private Settings super = null;

    public GModAuswahlen(String string, Collection<T> collection) {
        this.\u00d200000 = string;
        this.\u00d300000 = new ArrayList();
        this.\u00d300000.addAll(collection);
    }

    public GModAtome<T> format(T t) {
        return new GModAtome<T>(t.toString(), t);
    }

    public String getBezeichner() {
        return this.\u00d200000;
    }

    public ArrayList<GModAtome> getFormatierteListe(Settings settings) {
        if (this.\u00d400000 == null || !this.super.equals(settings)) {
            this.super = settings;
            ArrayList<GModAtome<T>> arrayList = new ArrayList<GModAtome<T>>();
            for (T t : this.getListe(settings)) {
                arrayList.add(this.format(t));
            }
            this.\u00d400000 = arrayList;
        }
        return this.\u00d400000;
    }

    public ArrayList<T> getListe(Settings settings) {
        if (settings == null) {
            return this.\u00d300000;
        }
        ArrayList<T> arrayList = new ArrayList<T>();
        for (T t : this.\u00d300000) {
            if (!(t instanceof Integer) && !(t instanceof K) && !settings.contains(t)) continue;
            arrayList.add(t);
        }
        return arrayList;
    }
}

