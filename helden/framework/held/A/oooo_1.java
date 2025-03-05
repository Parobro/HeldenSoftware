/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.a;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Renamed from helden.framework.held.A.oOoO
 */
public class oooo_1 {
    private static ArrayList<String> \u00d200000 = new ArrayList();
    private String o00000;
    private int \u00d300000;

    public static ArrayList<String> \u00d200000() {
        Collections.sort(\u00d200000);
        return \u00d200000;
    }

    public oooo_1(String string) {
        this.o00000 = string;
        this.\u00d300000 = 0;
        if (\u00d200000.size() == 0) {
            this.o00000();
        }
        if (!\u00d200000.contains(string)) {
            \u00d200000.add(string);
        }
    }

    public oooo_1(String string, int n) {
        this.o00000 = string;
        this.\u00d300000 = n;
        if (\u00d200000.size() == 0) {
            this.o00000();
        }
        if (!\u00d200000.contains(string)) {
            \u00d200000.add(string);
        }
    }

    public oooo_1(String string, int n, int n2) {
        this(string, n);
    }

    public oooo_1(String string, int n, String string2) {
        this(string, n);
    }

    public String String() {
        return this.o00000;
    }

    public int \u00d300000() {
        return this.\u00d300000;
    }

    public void o00000(String string) {
        this.o00000 = string;
    }

    public void o00000(int n) {
        this.\u00d300000 = n;
    }

    private void o00000() {
        String[] stringArray;
        for (String string : stringArray = new String[]{"blauschwarz", "schwarz", "silbern", "wei\u00dfblond", "hellblond", "mittelblond", "dunkelblond", "schwarzbraun", "graublau", "saphirblau", "smaragdgr\u00fcn", "dunkelviolett", "bernstein", "goldgesprenkelt", "amethyst", "orangerot", "feuerrot", "rotbraun", "dunkelrot", "rot-grau", "gr\u00fcn", "gelb", "hellrot", "rotviolett", "goldblond", "dunkelbraun", "bernsteinfarben", "rubinrot", "hellbraun", "kupferrot", "blond", "braun", "blau", "mittelbraun", "rot", "grau"}) {
            \u00d200000.add(string);
        }
    }
}

