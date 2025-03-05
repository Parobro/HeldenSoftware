/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenplugin.impl;

import helden.framework.OOoO.K;
import helden.framework.held.D;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.ZauberInfos;
import helden.plugin.datenplugin.DatenPluginZauberInfo;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class DatenPluginZauberInfoImpl
implements DatenPluginZauberInfo {
    private KonkreterZauber new;
    private OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO o00000;
    private ZauberInfos \u00d300000;

    public DatenPluginZauberInfoImpl(KonkreterZauber konkreterZauber, OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        this.o00000 = oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2;
        this.new = konkreterZauber;
        this.\u00d300000 = oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00d5o0000().\u00d600000(this.new);
    }

    @Override
    public String getAnmerkungen() {
        return this.\u00d300000.getAnmerkungen();
    }

    @Override
    public String getKommentar() {
        return this.\u00d300000.getKommentar();
    }

    @Override
    public String getKosten() {
        return this.\u00d300000.getKosten();
    }

    @Override
    public String[] getMoeglicheRepraesentationen() {
        K[] kArray = this.new.getRepraesentationen();
        String[] stringArray = new String[kArray.length];
        for (int i2 = 0; i2 < kArray.length; ++i2) {
            stringArray[i2] = kArray[i2].toString();
        }
        return stringArray;
    }

    @Override
    public String getReichweite() {
        return this.\u00d300000.getReichweite();
    }

    @Override
    public String getRepraesentation() {
        return this.new.getRep().toString();
    }

    @Override
    public String getWirkungsdauer() {
        return this.\u00d300000.getWirkungsdauer();
    }

    @Override
    public String getZauberdauer() {
        return this.\u00d300000.getZauberdauer();
    }

    @Override
    public int getZauberfertigkeitsWert() {
        try {
            return this.o00000.\u00d5o0000().\u00d400000(this.new);
        }
        catch (D d2) {
            d2.printStackTrace();
            return 0;
        }
    }

    @Override
    public String getZauberName() {
        return this.new.getZaubername();
    }

    @Override
    public void setAnmerkungen(String string) {
        this.\u00d300000.setAnmerkungen(string);
    }

    @Override
    public void setKommentar(String string) {
        this.\u00d300000.setKommentar(string);
    }

    @Override
    public void setKosten(String string) {
        this.\u00d300000.setKosten(string);
    }

    @Override
    public void setReichweite(String string) {
        this.\u00d300000.setReichweite(string);
    }

    @Override
    public void setWirkungsdauer(String string) {
        this.\u00d300000.setWirkungsdauer(string);
    }

    @Override
    public void setZauberdauer(String string) {
        this.\u00d300000.setZauberdauer(string);
    }
}

