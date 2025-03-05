/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.geld;

public interface Muenze {
    public String getBezeichner();

    public Muenze getClone();

    public float getFaktorHoch();

    public float getFaktorRunter();

    public float getGewichtProStueck();

    public String getKurzString();

    public String getWaehrungsBezeichner();

    public float getWertInSilberstuecke();
}

