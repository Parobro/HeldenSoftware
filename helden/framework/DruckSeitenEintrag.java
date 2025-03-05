/*
 * Decompiled with CFR 0.152.
 */
package helden.framework;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class DruckSeitenEintrag
implements Cloneable {
    private String o00000 = "";
    private boolean \u00d300000 = false;
    private String new = "";
    private String \u00d400000 = "";

    public DruckSeitenEintrag(String string, boolean bl, String string2) {
        this(string, bl, string2, "");
    }

    public DruckSeitenEintrag(String string, boolean bl, String string2, String string3) {
        this.o00000 = string;
        this.\u00d300000 = bl;
        this.new = string2;
        this.\u00d400000 = string3;
    }

    public DruckSeitenEintrag clone() {
        return new DruckSeitenEintrag(this.o00000, this.\u00d300000, this.new, this.\u00d400000);
    }

    public boolean equals(Object object) {
        if (object != null && object instanceof DruckSeitenEintrag && this.o00000 != null) {
            return this.o00000.equals(((DruckSeitenEintrag)object).getBezeichner());
        }
        return false;
    }

    public String getBezeichner() {
        return this.o00000;
    }

    public String getBildpath() {
        return this.new;
    }

    public String getLastPrintHash() {
        return this.\u00d400000;
    }

    public int hashCode() {
        return this.o00000.hashCode();
    }

    public boolean isDrucken() {
        return this.\u00d300000;
    }

    public void setBezeichner(String string) {
        this.o00000 = string;
    }

    public void setBildpath(String string) {
        this.new = string;
    }

    public void setDrucken(boolean bl) {
        this.\u00d300000 = bl;
    }

    public void setLastPrintHash(String string) {
        this.\u00d400000 = string;
    }

    public String toString() {
        return "DruckSeitenEintrag [bezeichner=" + this.o00000 + ", drucken=" + this.\u00d300000 + ", bildpath=" + this.new + "]";
    }
}

