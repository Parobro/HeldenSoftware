/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.OoOO;

import helden.framework.OoOO.private;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.Object.Q;
import helden.framework.oooo.l_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import java.nio.charset.Charset;
import org.w3c.dom.Node;

public class V
extends voidsuper
implements private {
    private Node \u00d3o\u00f6000;
    private String \u00d8o\u00f6000;
    private String \u00d5o\u00f6000;
    private String thisvoidclass;
    private String \u00d4o\u00f6000;
    private String whilereturnclass;

    public V(String string, oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1 oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12, boolean bl, l_0 l_02, Node node, String string2, String string3, String string4) {
        this(string, oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12, bl, l_02, node, "", string2, string3, string4);
    }

    public V(String string, oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1 oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12, boolean bl, l_0 l_02, Node node, String string2, String string3, String string4, String string5) {
        super(string, oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12, bl, l_02, string2);
        this.thisvoidclass = string3;
        this.whilereturnclass = string4;
        this.\u00d4o\u00f6000 = string5;
        this.\u00d3o\u00f6000 = node;
        this.\u00d8o\u00f6000 = "Talent\nName: " + string + "\n" + "Behinderung " + string2 + "\n" + "TalentArt " + oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12.toString() + "\n" + "Basis " + bl + "\n" + "Probe " + l_02.toString() + "\n" + "Beschreibung " + string3 + "\n" + "Urheber " + string4 + "\n" + "Kontakt " + string5 + "\n";
        this.\u00d5o\u00f6000 = Q.o00000(this.\u00d8o\u00f6000, Charset.forName("UTF-8"));
    }

    @Override
    public String \u00d4\u00f40000() {
        return this.thisvoidclass;
    }

    @Override
    public String \u00d6\u00f40000() {
        return this.\u00d8o\u00f6000;
    }

    @Override
    public String getID() {
        return this.\u00d5o\u00f6000;
    }

    @Override
    public String \u00d5\u00f40000() {
        return this.\u00d4o\u00f6000;
    }

    @Override
    public String o\u00f40000() {
        return this.whilereturnclass;
    }

    @Override
    public Node \u00d2\u00f40000() {
        return this.\u00d3o\u00f6000;
    }

    @Override
    public boolean Objectreturn() {
        throw new RuntimeException("Not supported");
    }

    @Override
    public boolean istIntern() {
        return false;
    }
}

