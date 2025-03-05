/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.startEvents;

import java.util.Date;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class StartEvent {
    public static final String \u00f400000 = "einmalig";
    public static final String \u00d800000 = "einmaligmessage";
    public static final String super = "dayly";
    public static final String int = "weekly";
    public static final String \u00d400000 = "mounth";
    public static final String do = "alle20starts";
    public static final int \u00d200000 = 0;
    public static final int \u00d300000 = 1;
    public static final int OO0000 = 2;
    private int \u00d600000 = -1;
    private String \u00f800000 = "";
    private long \u00f600000 = 0L;
    private long class = 0L;

    public StartEvent(String string, int n, long l2) {
        this.\u00f800000 = string;
        this.\u00d600000 = n;
        this.class = l2;
        this.\u00f600000 = l2;
    }

    public String getKey() {
        return this.\u00f800000;
    }

    public long getValue() {
        switch (this.\u00d600000) {
            case 2: {
                return 1L;
            }
        }
        return this.\u00f600000;
    }

    public boolean istAktive() {
        long l2 = new Date().getTime() / 1000L;
        switch (this.\u00d600000) {
            case 0: {
                boolean bl = l2 > this.\u00f600000 + this.class;
                return bl;
            }
            case 1: {
                boolean bl = this.\u00f600000 >= this.class;
                return bl;
            }
            case 2: {
                return this.\u00f600000 == 0L;
            }
        }
        throw new RuntimeException("Modi unbekannt");
    }

    public void resetWennNoetig() {
        if (this.istAktive()) {
            this.o00000();
        }
    }

    public void setValue(long l2) {
        if (this.\u00d600000 == 1) {
            ++l2;
        }
        this.\u00f600000 = l2;
    }

    private void o00000() {
        long l2 = new Date().getTime() / 1000L;
        switch (this.\u00d600000) {
            case 0: {
                this.\u00f600000 = l2;
                break;
            }
            case 1: {
                this.\u00f600000 = 0L;
                break;
            }
            case 2: {
                break;
            }
            default: {
                throw new RuntimeException("Modi unbekannt");
            }
        }
    }
}

