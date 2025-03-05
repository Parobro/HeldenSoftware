/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenplugin.impl;

import helden.framework.D.K;
import helden.framework.D.P;
import helden.framework.settings.Settings;
import helden.framework.zauber.KonkreterZauber;
import helden.plugin.datenplugin.DatenPluginSonderfertigkeit;
import helden.plugin.datenplugin.DatenPluginTalent;
import helden.plugin.datenplugin.DatenPluginZauber;
import helden.plugin.datenplugin.impl.DatenPluginTalentImpl;
import helden.plugin.datenplugin.impl.DatenPluginZauberImpl;
import java.util.ArrayList;

public class DatenPluginSonderfertigkeitImpl
implements DatenPluginSonderfertigkeit {
    private P o00000;

    public DatenPluginSonderfertigkeitImpl(P p2) {
        this.o00000 = p2;
    }

    @Override
    public int getArt() {
        return this.o00000.\u00d400000();
    }

    @Override
    public ArrayList<String> getSettings() {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (Settings settings : Settings.getSettings()) {
            if (!settings.contains(this.o00000)) continue;
            arrayList.add(settings.getName());
        }
        return arrayList;
    }

    @Override
    public String getSpezialisierung() {
        if (this.o00000 instanceof K) {
            K k2 = (K)this.o00000;
            return k2.\u00f5\u00d20000();
        }
        return "";
    }

    @Override
    public DatenPluginTalent getTSTalent() {
        if (this.o00000 instanceof K) {
            K k2 = (K)this.o00000;
            return new DatenPluginTalentImpl(k2.o\u00d30000());
        }
        return null;
    }

    @Override
    public DatenPluginZauber getTSZauber() {
        K k2;
        if (this.o00000 instanceof K && (k2 = (K)this.o00000).O\u00d30000()) {
            KonkreterZauber konkreterZauber = (KonkreterZauber)k2.o\u00d30000();
            return new DatenPluginZauberImpl(konkreterZauber, false);
        }
        return null;
    }

    @Override
    public boolean istElfenlied() {
        return this.o00000.\u00f800000();
    }

    @Override
    public boolean istFernkampfsonderfertigkeit() {
        return this.o00000.\u00f4o0000();
    }

    @Override
    public boolean istGelaendekunde() {
        return this.o00000.\u00f5O0000();
    }

    @Override
    public boolean istHexenfluch() {
        return this.o00000.return();
    }

    @Override
    public boolean istIntern() {
        return true;
    }

    @Override
    public boolean istKampfSonderfertigkeit() {
        return this.o00000.\u00f400000();
    }

    @Override
    public boolean istKlerikal() {
        return this.o00000.\u00d300000();
    }

    @Override
    public boolean istLiturgie() {
        return this.o00000.\u00d3O0000();
    }

    @Override
    public boolean istLiturgiekenntnis() {
        return this.o00000.\u00d500000();
    }

    @Override
    public boolean istMagisch() {
        return this.o00000.privatesuper();
    }

    @Override
    public boolean istManoever() {
        return this.o00000.\u00d4o0000();
    }

    @Override
    public boolean istMerkmalskenntnis() {
        return this.o00000.if();
    }

    @Override
    public boolean istNahkampfsonderfertigkeit() {
        return this.o00000.oo0000();
    }

    @Override
    public boolean istRepraesentation() {
        return this.o00000.\u00f4O0000();
    }

    @Override
    public boolean istRitual() {
        return this.o00000.returnnew();
    }

    @Override
    public boolean istSchamanenRitualkenntnis() {
        return this.o00000.\u00d4\u00d20000();
    }

    @Override
    public boolean istTalentspezialisierung() {
        return this.o00000.\u00f8O0000();
    }

    @Override
    public boolean istWaffenloseKampfstil() {
        return this.o00000.\u00d3\u00d20000();
    }

    @Override
    public String toString() {
        return this.o00000.\u00f500000();
    }
}

