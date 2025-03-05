/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.E.OoOO;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class null {
    private int o00000;
    private int new;

    public null(int n, int n2) {
        this.o00000 = n;
        this.new = n2;
    }

    public int o00000() {
        return this.o00000;
    }

    public int new(int n) {
        return n + this.o00000;
    }

    public null \u00d300000() throws CloneNotSupportedException {
        return (null)this.clone();
    }

    public int new() {
        return this.new;
    }

    public int o00000(int n) {
        return n + this.new;
    }

    public String toString() {
        if (this.new == -99) {
            if (this.o00000 < 0) {
                return this.o00000 + "/  -";
            }
            return this.o00000 + " /  -";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.o00000);
        if (this.o00000 < 0) {
            stringBuffer.append("/");
        } else {
            stringBuffer.append(" /");
        }
        if (this.new > -1) {
            stringBuffer.append(" ");
            stringBuffer.append(this.new);
        } else {
            stringBuffer.append(this.new);
        }
        return stringBuffer.toString();
    }

    protected Object clone() throws CloneNotSupportedException {
        return new null(this.o00000, this.new);
    }
}

