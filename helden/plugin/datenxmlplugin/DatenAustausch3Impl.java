/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenxmlplugin;

import helden.framework.Einstellungen;
import helden.framework.held.B.B.class;
import helden.framework.held.B.B.oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.held.K;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.held.object.oooo_0;
import helden.framework.oooo.return_0;
import helden.gui.return;
import helden.plugin.datenxmlplugin.DatenAustausch3Interface;
import helden.plugin.datenxmlplugin.XMLDatenGenerator;
import java.awt.print.Printable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.standard.JobName;
import javax.print.attribute.standard.MediaPrintableArea;
import javax.print.attribute.standard.OrientationRequested;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class DatenAustausch3Impl
implements DatenAustausch3Interface {
    private return new;
    private ArrayList<ChangeListener> o00000;

    public DatenAustausch3Impl(return return_) {
        this.new = return_;
        this.o00000 = new ArrayList();
    }

    @Override
    public void addChangeListener(ChangeListener changeListener) {
        this.o00000.add(changeListener);
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
                element.setAttribute("value", "" + this.new.getSelectedIndex());
                element.setAttribute("heldenkey", ((K)this.new.getModel().getElementAt(this.new.getSelectedIndex())).\u00f4o0000());
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
                element.setAttribute("value", "" + this.new.getModel().getSize());
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
                ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> arrayList = this.new.\u00d300000();
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
            String string2 = node.getAttributes().getNamedItem("format").getNodeValue();
            K k2 = this.super(node);
            if (string2.equalsIgnoreCase("XML")) {
                Document document6 = null;
                int n = 1;
                if (node.getAttributes().getNamedItem("version") != null) {
                    n = Integer.parseInt(node.getAttributes().getNamedItem("version").getNodeValue());
                }
                try {
                    document6 = XMLDatenGenerator.genDaten(k2, n);
                }
                catch (Exception exception) {
                    // empty catch block
                }
                return document6;
            }
            if (string2.equalsIgnoreCase("printable")) {
                return this.printHeld();
            }
        } else {
            if (string.equals("saveProperties")) {
                try {
                    Object object;
                    Properties properties = new Properties();
                    for (int i3 = 0; i3 < node.getChildNodes().getLength(); ++i3) {
                        object = node.getChildNodes().item(i3);
                        properties.put(object.getAttributes().getNamedItem("key").getNodeValue(), object.getAttributes().getNamedItem("value").getNodeValue());
                    }
                    return_0.\u00d200000("plugin." + node.getAttributes().getNamedItem("pluginName").getNodeValue() + ".", properties);
                    object = DocumentBuilderFactory.newInstance();
                    Document document7 = ((DocumentBuilderFactory)object).newDocumentBuilder().newDocument();
                    Element element = document7.createElement("result");
                    document7.appendChild(element);
                    element.setAttribute("action", "saveProperties");
                    element.setAttribute("status", "saved");
                    return document7;
                }
                catch (DOMException dOMException) {
                    oooo_0.o00000(dOMException);
                    return null;
                }
                catch (IOException iOException) {
                    oooo_0.o00000(iOException);
                    return null;
                }
                catch (ParserConfigurationException parserConfigurationException) {
                    oooo_0.o00000(parserConfigurationException);
                    return null;
                }
            }
            if (string.equals("listProperties")) {
                if (node.getAttributes().getNamedItem("pluginName") == null) {
                    return null;
                }
                String string3 = "plugin." + node.getAttributes().getNamedItem("pluginName").getNodeValue() + ".";
                DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
                try {
                    Document document8 = documentBuilderFactory.newDocumentBuilder().newDocument();
                    Element element = document8.createElement("result");
                    document8.appendChild(element);
                    element.setAttribute("action", "listProperties");
                    for (Map.Entry entry : return_0.o00000(string3).entrySet()) {
                        Element element3 = document8.createElement("prop");
                        element.appendChild(element3);
                        element3.setAttribute("key", entry.getKey().toString());
                        element3.setAttribute("value", entry.getValue().toString());
                    }
                    return document8;
                }
                catch (Exception exception) {
                    oooo_0.o00000(exception);
                    return null;
                }
            }
            if (string.equals("setHeldProperties")) {
                K k3 = this.super(node);
                if (node.getAttributes().getNamedItem("key") == null) {
                    return null;
                }
                String string4 = node.getAttributes().getNamedItem("key").getNodeValue();
                k3.\u00d4\u00d50000().put(string4, node.getTextContent());
                return this.super(node, "setHeldProperties");
            }
            if (string.equals("getHeldProperties")) {
                return this.super(node, "getHeldProperties");
            }
        }
        return null;
    }

    public Printable printHeld() {
        OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = (OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)this.new.getSelectedValue();
        if (oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 == null) {
            return null;
        }
        HashPrintRequestAttributeSet hashPrintRequestAttributeSet = new HashPrintRequestAttributeSet();
        String string = "Helden-" + oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f5o0000();
        hashPrintRequestAttributeSet.add(new JobName(string, null));
        hashPrintRequestAttributeSet.add(new MediaPrintableArea(5.0f, 5.0f, 200.0f, 287.0f, 1000));
        oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d300000().o00000(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
        oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d300000().\u00d500000();
        boolean bl = Einstellungen.getInstance().getSeitenEinstellungen(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f4o0000()).isBuchdruck();
        Einstellungen.getInstance().setBuchdruck(bl);
        Printable printable = null;
        if (bl) {
            printable = class.o00000(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
            hashPrintRequestAttributeSet.add(OrientationRequested.LANDSCAPE);
        } else {
            printable = class.\u00d200000(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
        }
        return printable;
    }

    public void sendMsg(String string) {
        for (ChangeListener changeListener : this.o00000) {
            changeListener.stateChanged(new ChangeEvent(string));
        }
    }

    private K super(Node node) {
        K k2 = null;
        if (node.getAttributes().getNamedItem("id") != null) {
            int n;
            String string = node.getAttributes().getNamedItem("id").getNodeValue();
            if (string.equals("selected")) {
                n = this.new.getSelectedIndex();
                if (n == -1) {
                    return null;
                }
            } else {
                n = Integer.parseInt(string);
            }
            k2 = (K)this.new.getModel().getElementAt(n);
        } else {
            String string = node.getAttributes().getNamedItem("heldenkey").getNodeValue();
            if (string.equals("selected")) {
                int n = this.new.getSelectedIndex();
                if (n == -1) {
                    return null;
                }
                k2 = (K)this.new.getModel().getElementAt(n);
            } else {
                k2 = (K)this.new.\u00d300000(string);
            }
        }
        return k2;
    }

    private Object super(Node node, String string) {
        K k2 = this.super(node);
        if (node.getAttributes().getNamedItem("key") == null) {
            return null;
        }
        String string2 = node.getAttributes().getNamedItem("key").getNodeValue();
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        try {
            Document document = documentBuilderFactory.newDocumentBuilder().newDocument();
            Element element = document.createElement("result");
            document.appendChild(element);
            element.setAttribute("action", string);
            element.setTextContent(k2.\u00d4\u00d50000().get(string2));
            return document;
        }
        catch (Exception exception) {
            return null;
        }
    }
}

