/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.O0OO.B;

import helden.framework.Einstellungen;
import helden.framework.OOoO.Y;
import helden.framework.OOoO.o00O;
import helden.framework.held.object.oooo_0;
import helden.framework.held.persistenz.ModsDatenParser;
import helden.framework.held.persistenz.XMLParser;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_0;
import helden.gui.A;
import helden.gui.O0OO.D.F;
import helden.gui.O0OO.ooOO.O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Node;

public class OoOO
extends helden.gui.O0OO.A {
    public OoOO(A a2) {
        super(a2);
        this.o00000 = new O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO(O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO._o.\u00d600000);
        this.\u00d200000();
    }

    @Override
    public boolean o00000() {
        Node node;
        Object object;
        Map.Entry<String, Object> entry2;
        Map<String, Object> map = this.o00000.\u00d200000();
        String string = "";
        for (Map.Entry<String, Object> entry2 : map.entrySet()) {
            object = entry2.getValue();
            if (object != null && !object.toString().isEmpty()) continue;
            string = string + entry2.getKey() + " ";
        }
        if (!string.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Die folgenden Fehler m\u00fcssen ausgef\u00fcllt sein:\n" + string, "Fehler", 0);
            return false;
        }
        Y y2 = new Y((String)map.get("Formelname"), (o00O)map.get("Quelle"), (helden.framework.OOoO.A)map.get("Dienst"), (int)((Integer)map.get("Probe")), (String)map.get("Beschreibung"), (String)map.get("Urheber"), (String)map.get("Kontakt"), (Integer)map.get("Zauberdauer"), (oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_0)((Object)map.get("Komplexit\u00e4t")));
        entry2 = DocumentBuilderFactory.newInstance();
        object = null;
        try {
            object = ((DocumentBuilderFactory)((Object)entry2)).newDocumentBuilder().newDocument();
            node = object.createProcessingInstruction("xml-stylesheet", "type=\"text/xsl\" href=\"helden.xsl\"");
            object.appendChild(node);
        }
        catch (ParserConfigurationException parserConfigurationException) {
            oooo_0.o00000(parserConfigurationException);
        }
        node = object.importNode(y2.\u00d2\u00f40000(), true);
        object.appendChild(node);
        XMLParser xMLParser = new XMLParser(null);
        Y y3 = ModsDatenParser.getInstance().einlesenFormel(node);
        if (!y3.Objectreturn()) {
            y3.\u00f6\u00d80000();
            xMLParser.saveXML(node, y3.getID(), Einstellungen.getInstance().getPfade().getPfad("mods") + "/Formel");
        }
        return true;
    }

    @Override
    protected void Object() {
        this.o00000(new F(this.o00000));
        this.o00000(new helden.gui.O0OO.D.OoOO(this.o00000));
    }
}

