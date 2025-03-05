/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.Object;

import helden.framework.Einstellungen;
import helden.framework.held.object.oooo_0;

public final class private {
    public static final String \u00d500000 = "sven";
    public static final String return = "maik";
    public static final String \u00d300000 = "lutz";
    public static final String \u00d400000 = "andreas";
    public static final String new = "christian";
    public static final String \u00d800000 = "immer";
    public static final String o00000 = "alle";

    public static void o00000(String string, String string2) {
        if (\u00d800000.equals(string2)) {
            oooo_0.\u00f400000(string);
            System.out.print(string);
        }
        if (Einstellungen.getInstance().isTestMode()) {
            if (Einstellungen.getInstance().getActor().equals(string2)) {
                oooo_0.\u00f400000(string);
                System.out.print(string);
            } else if (o00000.equals(Einstellungen.getInstance().getActor())) {
                oooo_0.\u00f400000(string);
                System.out.print(string);
            }
        }
    }

    public static void \u00d200000(String string, String string2) {
        if (\u00d800000.equals(string2)) {
            oooo_0.\u00f400000(string);
            System.out.println(string);
        }
        if (Einstellungen.getInstance().isTestMode()) {
            if (Einstellungen.getInstance().getActor().equals(string2)) {
                oooo_0.\u00f400000(string);
                System.out.println(string);
            } else if (o00000.equals(Einstellungen.getInstance().getActor())) {
                oooo_0.\u00f400000(string);
                System.out.println(string);
            }
        }
    }

    public static void o00000(String string) {
        private.\u00d200000(string, \u00d800000);
    }

    private private() {
    }
}

