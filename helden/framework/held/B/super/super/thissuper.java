/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.B.super.super;

import helden.framework.C.I;
import helden.framework.held.K;
import helden.framework.held.b.super.super.oooo_0;

public class thissuper
extends oooo_0 {
    public static final int \u00d4\u00d80000 = 0;
    public static final int intclass = 1;
    public static final int \u00d6\u00d80000 = 2;
    public static final int \u00d5\u00d80000 = 3;
    public static final int o\u00d80000 = 4;
    public static final int \u00d2\u00d80000 = 5;
    public static final int doclass = 6;

    public thissuper(K k2) {
        super(k2, new String[]{"", ""});
    }

    @Override
    public String o00000(int n, int n2) {
        String string;
        switch (n) {
            case 0: {
                if (n2 == 0) {
                    string = "Geschlecht";
                    break;
                }
                string = this.\u00d200000().\u00d300000().toString();
                break;
            }
            case 1: {
                if (n2 == 0) {
                    string = "Geburtstag";
                    break;
                }
                string = this.\u00d200000().thissuper().super().toString();
                break;
            }
            case 2: {
                if (n2 == 0) {
                    string = "Gr\u00f6\u00dfe";
                    break;
                }
                string = this.\u00d200000().thissuper().getGroesse() + " Halbfinger";
                break;
            }
            case 3: {
                if (n2 == 0) {
                    string = "Gewicht";
                    break;
                }
                string = this.\u00d200000().thissuper().getGewicht(this.\u00d200000().o00000(I.\u00f8\u00d2o000)) + " Stein";
                break;
            }
            case 4: {
                if (n2 == 0) {
                    string = "Haarfarbe";
                    break;
                }
                string = this.\u00d200000().thissuper().getHaarFarbe();
                break;
            }
            case 5: {
                if (n2 == 0) {
                    string = "Augenfarbe";
                    break;
                }
                string = this.\u00d200000().thissuper().getAugenFarbe();
                break;
            }
            case 6: {
                if (n2 == 0) {
                    string = "Aussehen";
                    break;
                }
                String[] stringArray = this.\u00d200000().thissuper().getAussehenText();
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
        return 7;
    }
}

