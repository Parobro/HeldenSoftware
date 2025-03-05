/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenplugin;

public interface DatenPluginRuestungsTeil {
    public int getAnzahlTeile();

    public int getBauchSchutz();

    public int getBrustSchutz();

    public int getGesammtBehinderung();

    public int getGesammtZonenSchutz();

    public int getGesamtSchutz();

    public int getKopfSchutz();

    public int getLinkerArmSchutz();

    public int getLinkesBeinSchutz();

    public String getName();

    public int getRechterArmSchutz();

    public int getRechtesBeinSchutz();

    public int getRueckenSchutz();

    public Object getRuestungsteil();

    public boolean istModifiziert();

    public boolean istZeug();

    public String toString();
}

