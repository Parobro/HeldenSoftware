/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.oooo;

/*
 * Renamed from helden.framework.OoOO.OoOo
 */
public class oooo_2 {
    private int String;
    private int \u00d200000;
    private int o00000;
    private int \u00d300000;

    public static oooo_2 o00000(String string) {
        string = string.trim();
        int n = Integer.parseInt(string.substring(1, string.indexOf("/")));
        string = string.substring(string.indexOf("/"));
        int n2 = Integer.parseInt(string.substring(1, string.lastIndexOf("/")));
        string = string.substring(string.lastIndexOf("/"));
        int n3 = Integer.parseInt(string.substring(1, string.indexOf(")")));
        string = string.substring(string.indexOf(")"));
        int n4 = Integer.parseInt(string.substring(1));
        return new oooo_2(n, n2, n3, n4);
    }

    public oooo_2(int n, int n2, int n3, int n4) {
        int n5;
        this.String = n;
        this.\u00d200000 = n2;
        this.o00000 = n3;
        if (this.String > this.\u00d200000) {
            n5 = this.String;
            this.String = this.\u00d200000;
            this.\u00d200000 = n5;
        }
        if (this.\u00d200000 > this.o00000) {
            n5 = this.\u00d200000;
            this.\u00d200000 = this.o00000;
            this.o00000 = n5;
        }
        if (this.String > this.\u00d200000) {
            n5 = this.String;
            this.String = this.\u00d200000;
            this.\u00d200000 = n5;
        }
        if (n4 < 0) {
            this.String += n4;
            this.\u00d200000 += n4;
            this.o00000 += n4;
            n4 = 0;
            if (this.String < 1) {
                this.String = 1;
            }
            if (this.\u00d200000 < 1) {
                this.\u00d200000 = 1;
            }
            if (this.\u00d200000 < 1) {
                this.\u00d200000 = 1;
            }
        }
        this.\u00d300000 = n4;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        oooo_2 oooo_22 = (oooo_2)object;
        if (this.String != oooo_22.String) {
            return false;
        }
        if (this.\u00d200000 != oooo_22.\u00d200000) {
            return false;
        }
        if (this.o00000 != oooo_22.o00000) {
            return false;
        }
        return this.\u00d300000 == oooo_22.\u00d300000;
    }

    public int hashCode() {
        int n = 1;
        n = 31 * n + this.String;
        n = 31 * n + this.\u00d200000;
        n = 31 * n + this.o00000;
        n = 31 * n + this.\u00d300000;
        return n;
    }

    public boolean o00000() {
        int n = 0;
        n = this.String > 20 ? (n += 20) : (n += this.String);
        n = this.\u00d200000 > 20 ? (n += 20) : (n += this.\u00d200000);
        n = this.o00000 > 20 ? (n += 20) : (n += this.o00000);
        return (n += this.\u00d300000) >= 58;
    }

    public boolean \u00d200000() {
        return this.String <= 1 && this.\u00d200000 <= 1 && this.\u00d300000 < 19;
    }
}

