/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.OoOO;

import helden.framework.OoOO.E;
import helden.framework.OoOO.private;
import helden.framework.held.Object.Q;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.oooo.s_0;
import helden.framework.settings.Settings;
import java.nio.charset.Charset;
import java.util.List;
import org.w3c.dom.Node;

public class null
extends E
implements private {
    private oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1 ifreturnclass;
    private boolean \u00f4O\u00f6000;
    private String oo\u00f6000;
    private String \u00f8O\u00f6000;
    private Node \u00d8O\u00f6000;
    private String Oo\u00f6000;
    private String \u00f5O\u00f6000;
    private String returnreturnclass;

    public null(String string, String string2, s_0 s_02, String string3, int n, oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1 oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12, boolean bl, Node node, String string4, String string5, String string6) {
        super(string, string2, false, s_02, string3, n, false);
        this.ifreturnclass = oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12;
        this.\u00f4O\u00f6000 = bl;
        this.oo\u00f6000 = "Kampftalent\nName: " + string + "\n" + "Abk\u00fcrzung: " + string2 + "\n" + "Steigerungsklasse " + s_02.toString() + "\n" + "Behinderung " + string3 + "\n" + "eBE " + n + "\n" + "TalentArt " + oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12.toString() + "\n" + "HatParade " + bl + "\n" + "Beschreibung " + string4 + "\n" + "Urheber " + string5 + "\n" + "Kontakt " + string6 + "\n";
        this.\u00f8O\u00f6000 = Q.o00000(this.oo\u00f6000, Charset.forName("UTF-8"));
        this.Oo\u00f6000 = string4;
        this.returnreturnclass = string5;
        this.\u00f5O\u00f6000 = string6;
        this.o00000(node);
    }

    @Override
    public String \u00d4\u00f40000() {
        return this.Oo\u00f6000;
    }

    @Override
    public String \u00d6\u00f40000() {
        return this.oo\u00f6000;
    }

    @Override
    public String getID() {
        return this.\u00f8O\u00f6000;
    }

    @Override
    public String \u00d5\u00f40000() {
        return this.\u00f5O\u00f6000;
    }

    public List<Settings> O\u00f50000() {
        return null;
    }

    @Override
    public String o\u00f40000() {
        return this.returnreturnclass;
    }

    @Override
    public Node \u00d2\u00f40000() {
        return this.\u00d8O\u00f6000;
    }

    @Override
    public boolean o\u00d80000() {
        return this.\u00f4O\u00f6000;
    }

    @Override
    public boolean classclass() {
        return oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.do.equals(this.ifreturnclass);
    }

    @Override
    public boolean Objectreturn() {
        throw new RuntimeException("Not supported");
    }

    @Override
    public boolean istIntern() {
        return false;
    }

    public void o00000(Node node) {
        this.\u00d8O\u00f6000 = node;
    }
}

