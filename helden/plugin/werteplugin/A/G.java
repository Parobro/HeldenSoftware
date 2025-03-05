/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.werteplugin.A;

import helden.framework.D.K;
import helden.framework.D.P;
import helden.plugin.werteplugin.A.OO0O;
import helden.plugin.werteplugin.PluginSonderfertigkeit;
import helden.plugin.werteplugin.PluginTalent;

public class G
implements PluginSonderfertigkeit {
    private P o00000;

    public G(P p2) {
        this.o00000 = p2;
    }

    @Override
    public int getArt() {
        return this.o00000.\u00d400000();
    }

    @Override
    public String getSpezialisierung() {
        if (this.istTalentspezialisierung()) {
            return ((K)this.o00000).\u00f5\u00d20000();
        }
        return null;
    }

    @Override
    public PluginTalent getTSTalent() {
        if (this.istTalentspezialisierung()) {
            return new OO0O(((K)this.o00000).o\u00d30000());
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
        return this.o00000.toString();
    }
}

