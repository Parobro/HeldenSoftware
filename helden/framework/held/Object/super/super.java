/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.Object.super;

import helden.framework.held.Object.super.OoOO;
import helden.framework.held.persistenz.XMLParserKonverter;
import helden.gui.A;
import java.io.File;
import java.util.ArrayList;

public final class super {
    private static super o00000;

    public static super o00000() {
        if (o00000 == null) {
            o00000 = new super();
        }
        return o00000;
    }

    private super() {
    }

    public ArrayList<OoOO> o00000(File file, A a2) throws Exception {
        XMLParserKonverter xMLParserKonverter = new XMLParserKonverter(a2);
        return xMLParserKonverter.ladeHelden(file);
    }
}

