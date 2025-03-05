/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.B.super.super;

import helden.framework.held.K;
import helden.framework.held.a.oooo_0;
import helden.framework.oooo.b_0;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class for
extends helden.framework.held.b.super.super.oooo_0 {
    public static final int O\u00d40000 = 0;
    public static final int \u00d2\u00d40000 = 1;
    public static final int o\u00d40000 = 2;
    public static final int classObject = 3;

    public for(K k2) {
        super(k2, new String[]{"", ""});
    }

    @Override
    public String o00000(int n, int n2) {
        String string;
        switch (n) {
            case 0: {
                if (n2 == 0) {
                    string = "Stand";
                    break;
                }
                string = this.\u00f600000().getStand();
                break;
            }
            case 1: {
                if (n2 == 0) {
                    string = "Titel";
                    break;
                }
                string = this.\u00f600000().getTitel();
                break;
            }
            case 2: {
                if (n2 == 0) {
                    string = "Sozialstatus";
                    break;
                }
                string = this.float();
                break;
            }
            case 3: {
                if (n2 == 0) {
                    string = "Familie/ Herkunft/ Hintergrund";
                    break;
                }
                String[] stringArray = this.\u00f600000().getFamilieText();
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(stringArray[0]);
                for (int i2 = 1; i2 < stringArray.length; ++i2) {
                    stringBuffer.append(" ");
                    stringBuffer.append(stringArray[i2]);
                }
                string = stringBuffer.toString();
                break;
            }
            default: {
                string = "Fehler! zeilenIndex: " + n;
            }
        }
        return string;
    }

    @Override
    public int o00000() {
        return 4;
    }

    private oooo_0 \u00f600000() {
        return this.\u00d200000().thissuper();
    }

    private String float() {
        return this.\u00d200000().o00000(b_0.\u00f5\u00f5\u00d2000) + "";
    }
}

