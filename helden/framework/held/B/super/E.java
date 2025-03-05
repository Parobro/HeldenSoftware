/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.B.super;

import helden.framework.held.B.super.A;
import helden.framework.held.B.super.D;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class E {
    private final StringBuffer \u00d300000 = new StringBuffer();
    private final String[] o00000;
    private final A new;

    public E(A a2) {
        this.new = a2;
        this.o00000();
        this.o00000 = this.new();
    }

    public boolean \u00d300000() {
        return this.new.\u00d200000();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (!this.\u00d300000()) {
            stringBuffer.append(this.\u00d300000);
            for (int i2 = 0; i2 < this.new.super(); ++i2) {
                stringBuffer.append("  <tr>\n");
                for (int i3 = 0; i3 < this.new.\u00d400000(); ++i3) {
                    stringBuffer.append(this.o00000[i3]);
                    String string = this.new.super(i2, i3);
                    string = string.length() == 0 ? "&nbsp;" : D.o00000(string);
                    stringBuffer.append(string);
                    stringBuffer.append("</td>\n");
                }
                stringBuffer.append("  </tr>\n");
            }
            stringBuffer.append("</table>\n");
        }
        return stringBuffer.toString();
    }

    private String[] new() {
        String[] stringArray = new String[this.new.\u00d400000()];
        for (int i2 = 0; i2 < this.new.\u00d400000(); ++i2) {
            stringArray[i2] = "    <td class=\"" + this.new.super(i2) + "\">";
        }
        return stringArray;
    }

    private void o00000() {
        this.\u00d300000.append("<table class=\"");
        this.\u00d300000.append(this.new.\u00d300000());
        this.\u00d300000.append("\">\n");
        if (this.new.\u00d200000(0) != null) {
            this.\u00d300000.append("  <tr>\n");
            int n = 1;
            int n2 = this.new.\u00d400000();
            for (int i2 = 0; i2 < n2; i2 += n) {
                n = 1;
                while (i2 + n < n2 && this.new.\u00d200000(i2 + n) == null) {
                    ++n;
                }
                this.\u00d300000.append("    <th class=\"");
                this.\u00d300000.append(this.new.super(i2));
                this.\u00d300000.append("\"");
                if (n > 1) {
                    this.\u00d300000.append(" colspan=\"");
                    this.\u00d300000.append(n);
                    this.\u00d300000.append("\"");
                }
                this.\u00d300000.append(">");
                String string = this.new.\u00d200000(i2);
                string = D.o00000(string);
                this.\u00d300000.append(string);
                this.\u00d300000.append("</th>\n");
            }
            this.\u00d300000.append("  </tr>\n");
        }
    }
}

