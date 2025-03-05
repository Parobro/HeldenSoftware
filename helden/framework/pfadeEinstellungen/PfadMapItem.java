/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.pfadeEinstellungen;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class PfadMapItem {
    private String new = "";
    private String o00000 = "";
    private String \u00d400000 = "";
    private boolean \u00d300000 = false;

    public PfadMapItem(String string, String string2) {
        this(string, string2, "");
    }

    public PfadMapItem(String string, String string2, boolean bl) {
        this(string, string2, "", bl);
    }

    public PfadMapItem(String string, String string2, String string3) {
        this(string, string2, "", false);
    }

    public PfadMapItem(String string, String string2, String string3, boolean bl) {
        this.new = string;
        this.o00000 = string3;
        this.\u00d400000 = string2;
        this.\u00d300000 = bl;
    }

    public String getCustomPfad() {
        return this.o00000;
    }

    public String getDefaultPfad() {
        return this.new;
    }

    public String getLokalPfad() {
        return this.\u00d400000;
    }

    public boolean isFile() {
        return this.\u00d300000;
    }

    public void setCustomPfad(String string) {
        this.o00000 = string;
    }
}

