/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.werteplugin.A;

import helden.framework.E.C.B;
import helden.plugin.werteplugin.PluginRuestungsTeil;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class H
implements PluginRuestungsTeil {
    private B new;
    private String o00000;

    public H(B b, String string) {
        this.new = b;
        this.o00000 = string;
    }

    @Override
    public int getAnzahlTeile() {
        return this.new.for();
    }

    @Override
    public int getBauchSchutz() {
        return this.new.\u00f6O0000();
    }

    @Override
    public int getBrustSchutz() {
        return this.new.\u00f800000();
    }

    @Override
    public int getGesammtBehinderung() {
        return this.new.\u00f600000();
    }

    @Override
    public int getGesammtZonenSchutz() {
        return this.new.oO0000();
    }

    @Override
    public int getGesamtSchutz() {
        return this.new.\u00d2O0000();
    }

    @Override
    public int getKopfSchutz() {
        return this.new.\u00f8O0000();
    }

    @Override
    public int getLinkerArmSchutz() {
        return this.new.\u00d6O0000();
    }

    @Override
    public int getLinkesBeinSchutz() {
        return this.new.\u00f500000();
    }

    @Override
    public int getRechterArmSchutz() {
        return this.new.\u00d8O0000();
    }

    @Override
    public int getRechtesBeinSchutz() {
        return this.new.\u00d5O0000();
    }

    @Override
    public int getRueckenSchutz() {
        return this.new.newsuper();
    }

    @Override
    public Object getRuestungsteil() {
        return this.new;
    }

    @Override
    public boolean istZeug() {
        return this.new.\u00d3O0000();
    }

    @Override
    public String toString() {
        return this.o00000;
    }
}

