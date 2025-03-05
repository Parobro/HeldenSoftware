/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.C;

import helden.framework.C.I;
import helden.framework.C.OoOO.A;
import helden.framework.C.public;
import helden.framework.OoOO.M;
import helden.framework.held.Object.private;
import helden.framework.oooo.b_0;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class J
extends public
implements M,
A {
    private int Stringdosuper;
    private int thisdosuper;
    private int o\u00d8\u00d2000;
    private int \u00f8\u00d6\u00d2000;
    private int \u00d4\u00d6\u00d2000;
    private int \u00d8\u00d6\u00d2000;
    private int \u00f4\u00d6\u00d2000;
    private int \u00d3\u00d8\u00d2000;
    private boolean nulldosuper;
    private boolean \u00d5\u00d6\u00d2000;
    private int \u00f5\u00d6\u00d2000;
    private int O\u00d8\u00d2000;
    private int \u00d4\u00d8\u00d2000;

    public static J Object(b_0 b_02) {
        String string = "Herausragende Eigenschaft: " + b_02.toString();
        J j2 = new J(I.\u00d8\u00d80000, 2, false, 7, true);
        j2.\u00d600000(true);
        j2.OO0000(1);
        j2.\u00d200000(string);
        return j2;
    }

    public static J \u00d600000(I i2, int n, int n2) {
        J j2 = new J(i2, n, true, 12, true);
        j2.\u00d500000(true);
        j2.OO0000(n2);
        if (n2 == 2) {
            j2.float(6);
            j2.oO0000(6);
        } else {
            j2.float(5);
            j2.oO0000(5);
        }
        return j2;
    }

    public static J \u00f400000(I i2, int n, int n2) {
        J j2 = J.\u00d600000(i2, n, n2);
        j2.\u00d500000(true);
        return j2;
    }

    public static J void(I i2, int n, int n2) {
        J j2 = new J(i2, -1, true, n2, false);
        j2.float(n);
        j2.oO0000(n);
        return j2;
    }

    public static J \u00d400000(I i2) {
        J j2 = new J(i2, 10, false, 10, false);
        return j2;
    }

    public static J \u00d200000(I i2, int n, int n2) {
        J j2 = new J(i2, n, true, n2, true);
        return j2;
    }

    public static J \u00d500000(I i2, int n, int n2) {
        J j2 = new J(i2, -1, true, n2, true);
        j2.float(n);
        j2.oO0000(n);
        return j2;
    }

    public static J o00000(I i2, int n, int n2, int n3) {
        J j2 = new J(i2, -1, true, n2, true);
        j2.OO0000(100);
        j2.float(n);
        j2.oO0000(n);
        return j2;
    }

    public static J Object(I i2, int n, int n2) {
        J j2 = new J(i2, n, true, n2, true);
        return j2;
    }

    public static J \u00d400000(I i2, int n, int n2) {
        J j2 = new J(i2, 1, false, n2, true);
        j2.OO0000(1);
        j2.float(n);
        j2.oO0000(n);
        return j2;
    }

    public static J \u00f500000(I i2, int n, int n2) {
        J j2 = new J(i2, n, false, n2, true);
        return j2;
    }

    public static J o00000(I i2, int n, int n2) {
        J j2 = new J(i2, n, false, 10000, true);
        j2.OO0000(n2);
        j2.oO0000(n2);
        return j2;
    }

    private J(I i2, int n, boolean bl, int n2, boolean bl2) {
        super(i2, 0, bl, bl2);
        this.Stringdosuper = n;
        this.nulldosuper = false;
        this.\u00d5\u00d6\u00d2000 = false;
        this.\u00f8\u00d6\u00d2000 = n2;
        this.O\u00d8\u00d2000 = 1;
        this.oO0000(1);
        this.OO0000(1);
        this.\u00f5\u00d6\u00d2000 = 0;
    }

    public void interfaceObject() {
        this.\u00f5\u00d6\u00d2000 = this.ObjectString();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        J j2 = new J(this.\u00f4O0000(), this.Stringdosuper, this.\u00d500000(), this.\u00f8\u00d6\u00d2000, this.\u00f400000());
        j2.OO0000(this.o\u00d8\u00d2000);
        j2.\u00d5\u00d6\u00d2000 = this.\u00d5\u00d6\u00d2000;
        j2.nulldosuper = this.nulldosuper;
        j2.thisdosuper = this.thisdosuper;
        j2.\u00d200000(this.toString());
        j2.\u00f5\u00d6\u00d2000 = this.\u00f5\u00d6\u00d2000;
        j2.public(this.\u00d4\u00d8\u00d2000);
        return j2;
    }

    public String O\u00d50000() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.toString());
        stringBuilder.append("\n\n");
        stringBuilder.append("Wert: ");
        stringBuilder.append(this.thisdosuper);
        stringBuilder.append("\n");
        stringBuilder.append("gpSchrittweite: ");
        stringBuilder.append(this.Stringdosuper);
        stringBuilder.append("\n");
        stringBuilder.append("Max: ");
        stringBuilder.append(this.\u00f8\u00d6\u00d2000);
        stringBuilder.append("\n");
        stringBuilder.append("Gp: ");
        stringBuilder.append(this.o\u00d3\u00d2000);
        stringBuilder.append("\n");
        stringBuilder.append("wertSchrittweite: ");
        stringBuilder.append(this.o\u00d8\u00d2000);
        stringBuilder.append("\n");
        stringBuilder.append("SavedGPSchrittweite: ");
        stringBuilder.append(this.\u00d4\u00d6\u00d2000);
        stringBuilder.append("\n");
        stringBuilder.append("savedWert: ");
        stringBuilder.append(this.\u00d8\u00d6\u00d2000);
        stringBuilder.append("\n");
        stringBuilder.append("savedWertSchrittweite: ");
        stringBuilder.append(this.\u00f4\u00d6\u00d2000);
        stringBuilder.append("\n");
        stringBuilder.append("saveMaximalWert: ");
        stringBuilder.append(this.\u00d3\u00d8\u00d2000);
        stringBuilder.append("\n");
        stringBuilder.append("saveGp: ");
        stringBuilder.append(this.o\u00d4\u00d2000);
        stringBuilder.append("\n");
        stringBuilder.append("Auto: ");
        stringBuilder.append(this.\u00f5\u00d6\u00d2000);
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object instanceof J) {
            J j2 = (J)object;
            if (j2.\u00f4O0000().equals(this.\u00f4O0000())) {
                if (this.\u00d5\u00d6\u00d2000 || this.nulldosuper) {
                    return this.toString().equals(j2.toString());
                }
                return true;
            }
        } else if (this.toString().equals(object.toString())) {
            return true;
        }
        return false;
    }

    public void \u00d6\u00d50000() {
        if (this.\u00f6\u00d40000()) {
            this.oO0000(this.thisdosuper - this.o\u00d8\u00d2000);
        }
    }

    @Override
    public int \u00d600000() {
        float f2 = (float)this.voidString() / (float)this.\u00d2\u00d50000();
        int n = this.O\u00d20000() ? Math.round(f2 * -50.0f) : Math.round(f2 * -100.0f);
        if (this.ObjectString() == 1) {
            n += this.\u00d4\u00d8\u00d2000 * -100;
        }
        return n;
    }

    public int \u00f4\u00d50000() {
        return this.\u00f5\u00d6\u00d2000;
    }

    public double \u00d4\u00d50000() {
        double d2 = (double)this.voidString() / (double)this.o\u00d8\u00d2000;
        return d2 * (double)this.ObjectString() + (double)this.\u00d4\u00d8\u00d2000;
    }

    @Override
    public int supersuper() {
        int n = this.ObjectString() - this.\u00f5\u00d6\u00d2000;
        if (this.\u00d5\u00d6\u00d2000) {
            int n2 = 0;
            for (int i2 = this.\u00f5\u00d6\u00d2000 + 1; i2 <= this.ObjectString(); ++i2) {
                n2 += 6 + 2 * i2 + 1;
            }
            return n2;
        }
        if (this.\u00f5\u00d6\u00d2000 == 0) {
            return n / this.o\u00d8\u00d2000 * this.Stringdosuper + this.\u00d4\u00d8\u00d2000;
        }
        return n / this.o\u00d8\u00d2000 * this.Stringdosuper;
    }

    public int voidString() {
        if (!this.\u00d5\u00d6\u00d2000) {
            return this.Stringdosuper;
        }
        return 6 + 2 * this.ObjectString() + 1;
    }

    public int \u00f5\u00d40000() {
        return this.\u00f8\u00d6\u00d2000;
    }

    public int o\u00d50000() {
        if ((this.O\u00d20000() || this.toString().equals("Schulden")) && this.\u00f5\u00d6\u00d2000 > 0) {
            return 0;
        }
        return Math.max(this.O\u00d8\u00d2000, this.\u00f5\u00d6\u00d2000);
    }

    public int ObjectString() {
        return this.thisdosuper;
    }

    public int \u00d2\u00d50000() {
        return this.o\u00d8\u00d2000;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public boolean O\u00d20000() {
        return this.nulldosuper;
    }

    @Override
    public String oO0000() {
        StringBuffer stringBuffer = new StringBuffer(this.toString());
        stringBuffer.append(": ");
        stringBuffer.append(this.ObjectString());
        return stringBuffer.toString();
    }

    public void \u00f4\u00d40000() {
        int n = this.ObjectString() - this.\u00f5\u00d6\u00d2000;
        if (n % this.o\u00d8\u00d2000 != 0 && (this.\u00d5\u00d50000() || this.\u00f6\u00d40000())) {
            int n2 = 1;
            if (this.\u00f6\u00d40000()) {
                n2 = -1;
            }
            while (n % this.o\u00d8\u00d2000 != 0) {
                this.oO0000(this.ObjectString() + n2);
                n = this.ObjectString() - this.\u00f5\u00d6\u00d2000;
            }
        }
    }

    public void \u00f600000(int n) {
        if (this.o\u00d8\u00d2000 == 0) {
            private.\u00d200000("Wertschrittweite auf 0" + this.toString() + "!", "alle");
            return;
        }
        if (n > this.ObjectString()) {
            do {
                this.doObject();
            } while (this.\u00d5\u00d50000() && this.ObjectString() < n);
        }
        if (n < this.ObjectString()) {
            do {
                this.\u00d6\u00d50000();
            } while (this.\u00f6\u00d40000() && this.ObjectString() > n);
        }
    }

    @Override
    public void \u00f600000() {
        this.Stringdosuper = this.\u00d4\u00d6\u00d2000;
        this.o\u00d8\u00d2000 = this.\u00f4\u00d6\u00d2000;
    }

    @Override
    public void OO0000() {
        super.OO0000();
        this.\u00d4\u00d6\u00d2000 = this.Stringdosuper;
        this.\u00d8\u00d6\u00d2000 = this.thisdosuper;
        this.\u00f4\u00d6\u00d2000 = this.o\u00d8\u00d2000;
        this.\u00d3\u00d8\u00d2000 = this.\u00f8\u00d6\u00d2000;
    }

    public void public(int n) {
        this.\u00d4\u00d8\u00d2000 = n;
    }

    @Override
    public void o00000(int n) {
    }

    public void \u00f500000(int n) {
        this.Stringdosuper = n;
        if (this.o\u00d8\u00d2000 != 1) {
            throw new IllegalStateException("Unpassende Wert-Schrittweite");
        }
    }

    public void \u00f400000(int n) {
        this.\u00f8\u00d6\u00d2000 = n;
    }

    public void oO0000(int n) {
        this.thisdosuper = n;
    }

    public void OO0000(int n) {
        this.o\u00d8\u00d2000 = n;
    }

    public void \u00d2O0000(int n) {
        this.OO0000(n);
        this.\u00f4\u00d40000();
    }

    protected void float(int n) {
        this.O\u00d8\u00d2000 = n;
    }

    private boolean \u00d5\u00d50000() {
        return this.thisdosuper + this.o\u00d8\u00d2000 <= this.\u00f8\u00d6\u00d2000;
    }

    private boolean \u00f6\u00d40000() {
        return this.thisdosuper - this.o\u00d8\u00d2000 >= this.o\u00d50000();
    }

    private void doObject() {
        if (this.\u00d5\u00d50000()) {
            this.oO0000(this.thisdosuper + this.o\u00d8\u00d2000);
        }
    }

    private void \u00d600000(boolean bl) {
        this.\u00d5\u00d6\u00d2000 = bl;
    }

    private void \u00d500000(boolean bl) {
        this.nulldosuper = bl;
    }
}

