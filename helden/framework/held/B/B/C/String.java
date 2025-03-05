/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.B.B.C;

import helden.framework.held.B.B.G;
import helden.framework.held.B.B.oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class String {
    private Graphics \u00d500000 = null;
    private int String = 620;
    private java.lang.String \u00d200000;
    private java.lang.String o00000;
    private List<java.lang.String> \u00d300000 = new ArrayList<java.lang.String>();
    private Font \u00d600000 = null;

    public String(java.lang.String string, java.lang.String string2, Font font) {
        this.\u00d200000 = string;
        this.o00000 = string2;
        this.\u00d600000 = font;
        this.\u00d500000();
    }

    public int \u00d600000() {
        if (this.\u00d300000.size() == 0) {
            return 1;
        }
        return this.\u00d300000.size() - 1;
    }

    public Font Object() {
        return this.\u00d600000;
    }

    public List<java.lang.String> \u00d400000() {
        return this.\u00d300000;
    }

    public void \u00d500000() {
        this.\u00d300000 = new ArrayList<java.lang.String>();
        int n = this.String;
        this.o00000().setFont(this.\u00d600000);
        n -= this.o00000(this.\u00d200000) + 10;
        this.\u00d300000.add(this.\u00d200000);
        StringBuilder stringBuilder = new StringBuilder("");
        this.o00000().setFont(this.o00000(9).deriveFont(0));
        if (this.o00000.length() != 0) {
            for (java.lang.String string : this.o00000.split(" ")) {
                string = string + " ";
                int n2 = this.o00000(string);
                if (string.contains("\n")) {
                    java.lang.String[] stringArray = string.split("\n");
                    for (int i2 = 0; i2 < stringArray.length; ++i2) {
                        java.lang.String string2 = stringArray[i2];
                        int n3 = this.o00000(string2);
                        if (i2 == stringArray.length - 1) {
                            if (n - n3 < 0) {
                                n = this.String - n3;
                                this.\u00d300000.add(stringBuilder.toString());
                                stringBuilder = new StringBuilder(string2);
                                continue;
                            }
                            n -= n3;
                            stringBuilder.append(string2);
                            continue;
                        }
                        if (n - n3 < 0) {
                            n = this.String - n3;
                            this.\u00d300000.add(stringBuilder.toString());
                            stringBuilder = new StringBuilder(string2);
                            continue;
                        }
                        stringBuilder.append(string2);
                        this.\u00d300000.add(stringBuilder.toString());
                        stringBuilder = new StringBuilder();
                        n = this.String;
                    }
                    continue;
                }
                if (n - n2 < 0) {
                    n = this.String - n2;
                    this.\u00d300000.add(stringBuilder.toString());
                    stringBuilder = new StringBuilder(string);
                    continue;
                }
                n -= n2;
                stringBuilder.append(string);
            }
            this.\u00d300000.add(stringBuilder.toString());
        } else {
            this.\u00d300000.add("");
        }
    }

    public void \u00d200000(int n) {
        if (n != this.String) {
            this.String = n;
            this.\u00d500000();
        }
    }

    public void o00000(Graphics graphics) {
        this.\u00d500000 = graphics;
        this.\u00d500000();
    }

    public void o00000(Font font) {
        this.\u00d600000 = font;
    }

    public java.lang.String toString() {
        return this.\u00d200000;
    }

    protected Font o00000(int n) {
        return G.new(n);
    }

    private Graphics o00000() {
        if (this.\u00d500000 == null) {
            return oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d300000().new();
        }
        return this.\u00d500000;
    }

    private int o00000(java.lang.String string) {
        if (string.isEmpty()) {
            return 0;
        }
        return (int)this.o00000().getFontMetrics(this.o00000().getFont()).getStringBounds(string, this.o00000()).getWidth();
    }

    public double \u00d200000() {
        return this.String;
    }
}

