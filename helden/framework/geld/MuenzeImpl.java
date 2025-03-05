/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.geld;

import helden.framework.geld.Muenze;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class MuenzeImpl
implements Cloneable,
Muenze {
    private String o00000;
    private float \u00d800000;
    private float return;
    private String \u00d300000;
    private float new;
    private float \u00d500000;
    private String \u00d400000;

    public MuenzeImpl(String string, String string2, float f2, float f3, String string3) {
        this.o00000 = string;
        this.\u00d300000 = string2;
        this.\u00d800000 = f2;
        this.return = f3;
        this.new = 10.0f;
        this.\u00d500000 = 10.0f;
        this.\u00d400000 = string3;
    }

    public Object clone() {
        return new MuenzeImpl(this.o00000, this.\u00d300000, this.\u00d800000, this.return, this.\u00d400000);
    }

    @Override
    public String getBezeichner() {
        return this.o00000;
    }

    @Override
    public Muenze getClone() {
        return (Muenze)this.clone();
    }

    @Override
    public float getFaktorHoch() {
        return this.new;
    }

    @Override
    public float getFaktorRunter() {
        return this.\u00d500000;
    }

    @Override
    public float getGewichtProStueck() {
        return this.return;
    }

    @Override
    public String getKurzString() {
        return this.\u00d300000;
    }

    @Override
    public String getWaehrungsBezeichner() {
        return this.\u00d400000;
    }

    @Override
    public float getWertInSilberstuecke() {
        return this.\u00d800000;
    }

    public void setFaktorHoch(float f2) {
        this.new = f2;
    }

    public void setFaktorRunter(float f2) {
        this.\u00d500000 = f2;
    }
}

