/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.B.super.super;

import helden.framework.held.K;
import helden.framework.held.b.super.super.oooo_0;
import helden.framework.zauber.KonkreterZauber;
import java.util.List;

public class Q
extends oooo_0 {
    public static final int O\u00d80000 = 0;
    public static final int \u00f4\u00d60000 = 1;
    public static final int \u00d6\u00d60000 = 2;
    public static final int \u00d5\u00d60000 = 3;
    public static final int \u00f6\u00d60000 = 4;
    public static final int classclass = 5;
    public static final int superclass = 6;
    public static final int \u00d4\u00d60000 = 7;
    private final List<KonkreterZauber> publicString;
    private K \u00f5\u00d60000;

    public Q(K k2) {
        super(k2, new String[]{"Zauber", "Probe", "ZfW", "Rep", "Merkmale", "Haus", "Komp", "L-Komp"});
        this.\u00f5\u00d60000 = k2;
        this.publicString = k2.\u00d5o0000().\u00d200000();
    }

    @Override
    public String o00000(int n, int n2) {
        String string;
        KonkreterZauber konkreterZauber = this.OO0000().get(n);
        switch (n2) {
            case 0: {
                string = konkreterZauber.getZaubername();
                break;
            }
            case 1: {
                string = konkreterZauber.getTalentprobe().toString();
                break;
            }
            case 2: {
                try {
                    string = new Integer(this.\u00d200000().\u00d5o0000().\u00d400000(konkreterZauber)).toString();
                    break;
                }
                catch (Exception exception) {
                    return "n/a";
                }
            }
            case 3: {
                string = konkreterZauber.getRep().toString();
                break;
            }
            case 4: {
                string = konkreterZauber.getMerkmaleString();
                break;
            }
            case 5: {
                if (this.\u00d200000().\u00d5o0000().\u00d200000(konkreterZauber)) {
                    string = "x";
                    break;
                }
                string = "";
                break;
            }
            case 6: {
                string = konkreterZauber.getSteigernKategorie().toString();
                break;
            }
            case 7: {
                string = this.\u00f5\u00d60000.new(konkreterZauber).toString();
                break;
            }
            default: {
                string = "Fehler! spaltenIndex: " + n2;
            }
        }
        return string;
    }

    @Override
    public int o00000() {
        return this.publicString.size();
    }

    protected List<KonkreterZauber> OO0000() {
        return this.publicString;
    }
}

