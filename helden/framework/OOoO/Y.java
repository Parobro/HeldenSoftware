/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.OOoO;

import helden.Version;
import helden.framework.OOoO.A;
import helden.framework.OOoO.O;
import helden.framework.OOoO.o00O;
import helden.framework.OoOO.private;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_0;
import helden.gui.O0OO.C;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.Text;

public class Y
extends O
implements private {
    private String \u00f5o\u00f6000;
    private String \u00f4o\u00f6000;
    private String Stringvoidclass;

    public Y(String string, o00O o00O2, A a2, int n, String string2, String string3, String string4, Integer n2, oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_0 oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_02) {
        super(string, o00O2, a2, n, false, oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_02, n2);
        this.Stringvoidclass = string2;
        this.\u00f4o\u00f6000 = string3;
        this.\u00f5o\u00f6000 = string4;
    }

    public Y(String string, String string2, String string3, int n, String string4, String string5, String string6, Integer n2, oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_0 oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_02) {
        super(string, string2, string3, n, false, oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_02, n2);
        this.Stringvoidclass = string4;
        this.\u00f4o\u00f6000 = string5;
        this.\u00f5o\u00f6000 = string6;
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    @Override
    public String \u00d4\u00f40000() {
        return this.Stringvoidclass;
    }

    @Override
    public String \u00d6\u00f40000() {
        return "<html>Formelname: " + this.interfaceclass() + "<br>" + "Quelle: " + this.\u00f4\u00d80000() + "<br>" + "Dienst: " + this.\u00d5\u00d80000() + "<br>" + "Probenerschwernis: " + this.\u00f5\u00d80000() + "<br>" + "Komplexit\u00e4t: " + (this.\u00d6\u00d80000() != null ? this.\u00d6\u00d80000() : "") + "<br>" + "Zauberdauer: " + (this.doclass() != null ? this.doclass() : "") + "<br>" + "<br><br>" + "Urheber: " + this.\u00f4o\u00f6000 + "<br>" + "Kontakt: " + this.\u00f5o\u00f6000 + "<br>" + "Beschreibung: " + this.Stringvoidclass + "<br>";
    }

    @Override
    public String getID() {
        return "formel" + this.hashCode();
    }

    @Override
    public String \u00d5\u00f40000() {
        return this.\u00f5o\u00f6000;
    }

    @Override
    public String o\u00f40000() {
        return this.\u00f4o\u00f6000;
    }

    @Override
    public Node \u00d2\u00f40000() {
        C c = new C();
        Document document = c.o00000();
        Element element = document.createElement("eigeneformel");
        element.setAttribute("version", Version.getVersion());
        element.setAttribute("id", this.getID());
        document.appendChild(element);
        c.o00000(document, "urheber", this.\u00f4o\u00f6000, element);
        c.o00000(document, "kontakt", this.\u00f5o\u00f6000, element);
        Element element2 = document.createElement("beschreibung");
        Text text = document.createTextNode(this.Stringvoidclass);
        element2.appendChild(text);
        element.appendChild(element2);
        c.o00000(document, "formelname", this.interfaceclass(), element);
        c.o00000(document, "quelle", this.\u00f4\u00d80000().toString(), element);
        c.o00000(document, "dienst", this.\u00d5\u00d80000().toString(), element);
        c.o00000(document, "probe", String.valueOf(this.\u00f5\u00d80000()), element);
        if (this.\u00d6\u00d80000() != null) {
            c.o00000(document, "komplexitaet", this.\u00d6\u00d80000().name(), element);
        }
        if (this.doclass() != null) {
            c.o00000(document, "zauberdauer", String.valueOf(this.doclass()), element);
        }
        return element;
    }

    @Override
    public int hashCode() {
        int n = super.hashCode();
        n = 31 * n + (this.Stringvoidclass == null ? 0 : this.Stringvoidclass.hashCode());
        n = 31 * n + (this.\u00f5o\u00f6000 == null ? 0 : this.\u00f5o\u00f6000.hashCode());
        n = 31 * n + (this.\u00f4o\u00f6000 == null ? 0 : this.\u00f4o\u00f6000.hashCode());
        return n;
    }

    @Override
    public boolean Objectreturn() {
        String string = this.getID();
        for (O o : Y.O\u00f40000()) {
            Y y2;
            if (!(o instanceof Y) || !(y2 = (Y)o).getID().equals(string)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean istIntern() {
        return false;
    }
}

