/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenxmlplugin;

import helden.framework.Einstellungen;
import helden.framework.held.K;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.ooOO.X;
import helden.gui.return;
import helden.plugin.datenxmlplugin.DatenAustauschImpl;
import helden.plugin.datenxmlplugin.XMLDatenGenerator;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class DatenAustausch
implements DatenAustauschImpl {
    private return o00000;
    private X \u00d200000;

    public DatenAustausch(return return_, X x) {
        this.o00000 = return_;
        this.\u00d200000 = x;
    }

    @Override
    public Object exec(Document document) {
        Node node = document.getChildNodes().item(0);
        if (!node.getNodeName().equals("action") || node.getAttributes().getNamedItem("action") == null) {
            return null;
        }
        String string = node.getAttributes().getNamedItem("action").getNodeValue();
        if (string.equals("selectedHeld")) {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            try {
                Document document2 = documentBuilderFactory.newDocumentBuilder().newDocument();
                Element element = document2.createElement("result");
                document2.appendChild(element);
                element.setAttribute("action", "selectedHeld");
                element.setAttribute("value", "" + this.o00000.getSelectedIndex());
                element.setAttribute("heldenkey", ((K)this.o00000.getModel().getElementAt(this.o00000.getSelectedIndex())).\u00f4o0000());
                return document2;
            }
            catch (Exception exception) {
                return null;
            }
        }
        if (string.equals("anzahlHelden")) {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            try {
                Document document3 = documentBuilderFactory.newDocumentBuilder().newDocument();
                Element element = document3.createElement("result");
                document3.appendChild(element);
                element.setAttribute("action", "anzahlHelden");
                element.setAttribute("value", "" + this.o00000.getModel().getSize());
                return document3;
            }
            catch (Exception exception) {
                return null;
            }
        }
        if (string.equals("pluginPfad")) {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            try {
                Document document4 = documentBuilderFactory.newDocumentBuilder().newDocument();
                Element element = document4.createElement("result");
                document4.appendChild(element);
                element.setAttribute("action", "pluginPfad");
                element.setAttribute("value", "" + Einstellungen.getInstance().getPfade().getPfad("pluginPfad"));
                return document4;
            }
            catch (Exception exception) {
                return null;
            }
        }
        if (string.equals("listHelden")) {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            try {
                Document document5 = documentBuilderFactory.newDocumentBuilder().newDocument();
                Element element = document5.createElement("result");
                document5.appendChild(element);
                element.setAttribute("action", "listHelden");
                ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> arrayList = this.o00000.\u00d300000();
                for (int i2 = 0; i2 < arrayList.size(); ++i2) {
                    OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = arrayList.get(i2);
                    Element element2 = document5.createElement("held");
                    element.appendChild(element2);
                    element2.setAttribute("heldenkey", oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f4o0000());
                    element2.setAttribute("name", oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f5o0000());
                    element2.setAttribute("id", "" + i2);
                }
                return document5;
            }
            catch (Exception exception) {
                return null;
            }
        }
        if (string.equals("held")) {
            Object object;
            String string2 = node.getAttributes().getNamedItem("format").getNodeValue();
            K k2 = null;
            if (node.getAttributes().getNamedItem("id") != null) {
                int n;
                object = node.getAttributes().getNamedItem("id").getNodeValue();
                if (((String)object).equals("selected")) {
                    n = this.o00000.getSelectedIndex();
                    if (n == -1) {
                        return null;
                    }
                } else {
                    n = Integer.parseInt((String)object);
                }
                k2 = (K)this.o00000.getModel().getElementAt(n);
            } else {
                object = node.getAttributes().getNamedItem("heldenkey").getNodeValue();
                if (((String)object).equals("selected")) {
                    int n = this.o00000.getSelectedIndex();
                    if (n == -1) {
                        return null;
                    }
                    k2 = (K)this.o00000.getModel().getElementAt(n);
                } else {
                    k2 = (K)this.o00000.\u00d300000((String)object);
                }
            }
            if (string2.equalsIgnoreCase("XML")) {
                object = null;
                int n = 1;
                if (node.getAttributes().getNamedItem("version") != null) {
                    n = Integer.parseInt(node.getAttributes().getNamedItem("version").getNodeValue());
                }
                try {
                    object = XMLDatenGenerator.genDaten(k2, n);
                }
                catch (Exception exception) {
                    // empty catch block
                }
                return object;
            }
            if (string2.equalsIgnoreCase("printable")) {
                return this.\u00d200000.\u00d200000(k2);
            }
        }
        return null;
    }
}

