/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.persistenz;

import helden.Version;
import helden.framework.Einstellungen;
import helden.framework.held.Object.OOoo;
import helden.gui.super.OooO.new.OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.super.OooO.new.ooOO;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class InfoXmlWriterParser {
    private String o00000 = "2.0";
    private File \u00d200000 = null;
    private OOoo Object = null;

    public InfoXmlWriterParser(OOoo oOoo) {
        this.Object = oOoo;
        try {
            this.\u00d200000 = new File(Einstellungen.getInstance().getPfade().getPfad("daten") + "/infos.xml");
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void laden() {
        if (!this.versionCheck(this.\u00d200000)) {
            this.\u00d200000.renameTo(new File("infosALT.xml"));
        } else {
            this.Object.\u00d400000();
            this.xmlLesen(this.\u00d200000);
            File file = new File(Einstellungen.getInstance().getPfade().getPfad("pluginPfad") + "/zauberinfo.xml");
            if (file.exists()) {
                this.o00000(file);
                file.renameTo(new File(file.getAbsolutePath() + ".old"));
            }
        }
    }

    public void speichern(ArrayList<ooOO> arrayList) {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        try {
            String[] stringArray2;
            Object object;
            Document document = documentBuilderFactory.newDocumentBuilder().newDocument();
            Element element = document.createElement("Infos");
            element.setAttribute("Version", Version.getVersion());
            document.appendChild(element);
            Element element2 = document.createElement("Version");
            element2.setAttribute("XMLVersion", this.o00000);
            element.appendChild(element2);
            Element element3 = document.createElement("TextBausteine");
            element.appendChild(element3);
            for (ooOO object22 : arrayList) {
                object = document.createElement("BausteinArt");
                object.setAttribute("zaubername", object22.new());
                object.setAttribute("repaesentation", object22.\u00d300000());
                element3.appendChild((Node)object);
                for (String string : object22.o00000()) {
                    Element element4 = document.createElement("Baustein");
                    element4.setAttribute("name", string);
                    object.appendChild(element4);
                }
            }
            Element element5 = document.createElement("Varianten");
            element.appendChild(element5);
            ArrayList<OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> arrayList2 = this.Object.o00000("Alle");
            for (String[] stringArray2 : arrayList2) {
                Element dOMSource = document.createElement("Variante");
                dOMSource.setAttribute("name", stringArray2.toString());
                dOMSource.setAttribute("lblbezeichner", stringArray2.\u00d600000());
                dOMSource.setAttribute("felderAnzahl", stringArray2.\u00d500000() + "");
                dOMSource.setAttribute("felderNamen", this.o00000(stringArray2.\u00f500000()));
                dOMSource.setAttribute("felderLaenge", this.o00000(stringArray2.\u00d200000()));
                dOMSource.setAttribute("istZauber", stringArray2.\u00f600000() + "");
                dOMSource.setAttribute("istSF", stringArray2.String() + "");
                dOMSource.setAttribute("istSFMitZusatzfeldern", stringArray2.for() + "");
                dOMSource.setAttribute("istVTNT", stringArray2.\u00d800000() + "");
                dOMSource.setAttribute("infos", this.o00000(stringArray2.o00000()));
                element5.appendChild(dOMSource);
            }
            object = TransformerFactory.newInstance();
            stringArray2 = ((TransformerFactory)object).newTransformer();
            stringArray2.setOutputProperty("indent", "yes");
            stringArray2.setOutputProperty("standalone", "yes");
            stringArray2.setOutputProperty("encoding", "UTF-8");
            DOMSource dOMSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(this.\u00d200000);
            stringArray2.transform(dOMSource, streamResult);
        }
        catch (ParserConfigurationException parserConfigurationException) {
            parserConfigurationException.printStackTrace();
        }
        catch (TransformerException transformerException) {
            transformerException.printStackTrace();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public boolean versionCheck(File file) {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(file);
            NodeList nodeList = document.getElementsByTagName("Version");
            int n = 0;
            if (n < nodeList.getLength()) {
                Node node = nodeList.item(n);
                String string = node.getAttributes().getNamedItem("XMLVersion").getNodeValue();
                return this.o00000.equals(string);
            }
        }
        catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Datei nicht gefunden");
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
        return false;
    }

    public void xmlLesen(File file) {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        try {
            Object object;
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(file);
            NodeList nodeList = document.getElementsByTagName("Variante");
            for (int i2 = 0; nodeList != null && i2 < nodeList.getLength(); ++i2) {
                Node node = nodeList.item(i2);
                try {
                    object = new OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO();
                    ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object).o00000(node.getAttributes().getNamedItem("name").getNodeValue());
                    ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object).\u00d200000(node.getAttributes().getNamedItem("lblbezeichner").getNodeValue());
                    ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object).o00000(new Integer(node.getAttributes().getNamedItem("felderAnzahl").getNodeValue()));
                    ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object).\u00d200000(this.\u00d200000(node.getAttributes().getNamedItem("felderNamen").getNodeValue()));
                    ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object).o00000(this.o00000(node.getAttributes().getNamedItem("felderLaenge").getNodeValue()));
                    ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object).\u00d300000(new Boolean(node.getAttributes().getNamedItem("istZauber").getNodeValue()));
                    ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object).\u00d200000(new Boolean(node.getAttributes().getNamedItem("istSF").getNodeValue()));
                    ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object).o00000(new Boolean(node.getAttributes().getNamedItem("istSFMitZusatzfeldern").getNodeValue()));
                    ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object).String(new Boolean(node.getAttributes().getNamedItem("istVTNT").getNodeValue()));
                    ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object).o00000(this.\u00d200000(node.getAttributes().getNamedItem("infos").getNodeValue()));
                    this.Object.new((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object);
                    continue;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
            NodeList nodeList2 = document.getElementsByTagName("BausteinArt");
            if (nodeList2 != null) {
                for (int i3 = 0; i3 < nodeList2.getLength(); ++i3) {
                    object = nodeList2.item(i3);
                    ArrayList<String> arrayList = new ArrayList<String>();
                    String string = object.getAttributes().getNamedItem("zaubername").getNodeValue();
                    String string2 = object.getAttributes().getNamedItem("repaesentation").getNodeValue();
                    NodeList nodeList3 = object.getChildNodes();
                    for (int i4 = 0; i4 < nodeList3.getLength(); ++i4) {
                        Node node = nodeList3.item(i4);
                        if (node == null || !node.getNodeName().equals("Baustein")) continue;
                        arrayList.add(node.getAttributes().getNamedItem("name").getNodeValue());
                    }
                    String[] stringArray = new String[arrayList.size()];
                    for (int i5 = 0; i5 < arrayList.size(); ++i5) {
                        stringArray[i5] = (String)arrayList.get(i5);
                    }
                    this.Object.o00000(new ooOO(stringArray, string, string2));
                }
            }
        }
        catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Datei nicht gefunden");
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void o00000(File file) {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        try {
            String[] stringArray;
            Object object;
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(file);
            NodeList nodeList = document.getElementsByTagName("Zaubervariante");
            for (int i2 = 0; nodeList != null && i2 < nodeList.getLength(); ++i2) {
                Node node = nodeList.item(i2);
                try {
                    object = new OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO();
                    ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object).o00000(node.getAttributes().getNamedItem("name").getNodeValue());
                    ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object).\u00d200000(node.getAttributes().getNamedItem("zaubername").getNodeValue());
                    ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object).o00000(6);
                    ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object).o00000(this.o00000("444|##|220|##|70|##|67|##|70|##|60|##|"));
                    ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object).\u00d200000(this.\u00d200000("Kommentar:|##|Anmerkung:|##|Reichweite:|##|Wirkungsdauer:|##|Zauberdauer:|##|Kosten:|##|"));
                    ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object).\u00d300000(true);
                    ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object).\u00d200000(false);
                    ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object).o00000(false);
                    ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object).String(false);
                    stringArray = new String[]{node.getAttributes().getNamedItem("kommentar").getNodeValue(), node.getAttributes().getNamedItem("anmerkung").getNodeValue(), node.getAttributes().getNamedItem("reichweite").getNodeValue(), node.getAttributes().getNamedItem("wirkungsDauer").getNodeValue(), node.getAttributes().getNamedItem("zauberDauer").getNodeValue(), node.getAttributes().getNamedItem("kosten").getNodeValue()};
                    ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object).o00000(stringArray);
                    this.Object.new((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object);
                    continue;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
            NodeList nodeList2 = document.getElementsByTagName("BausteinArt");
            if (nodeList2 != null) {
                for (int i3 = 0; i3 < nodeList2.getLength(); ++i3) {
                    object = nodeList2.item(i3);
                    stringArray = new ArrayList();
                    String string = object.getAttributes().getNamedItem("zaubername").getNodeValue();
                    String string2 = object.getAttributes().getNamedItem("repaesentation").getNodeValue();
                    NodeList nodeList3 = object.getChildNodes();
                    for (int i4 = 0; i4 < nodeList3.getLength(); ++i4) {
                        Node node = nodeList3.item(i4);
                        if (node == null || !node.getNodeName().equals("Baustein")) continue;
                        stringArray.add(node.getAttributes().getNamedItem("name").getNodeValue());
                    }
                    String[] stringArray2 = new String[stringArray.size()];
                    for (int i5 = 0; i5 < stringArray.size(); ++i5) {
                        stringArray2[i5] = (String)stringArray.get(i5);
                    }
                    this.Object.o00000(new ooOO(stringArray2, string, string2));
                }
            }
        }
        catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Datei nicht gefunden");
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private String o00000(int[] nArray) {
        Object[] objectArray = new Integer[nArray.length];
        int n = 0;
        for (int n2 : nArray) {
            objectArray[n] = n2;
            ++n;
        }
        return this.o00000(objectArray);
    }

    private String o00000(Object[] objectArray) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Object object : objectArray) {
            if (object != null) {
                stringBuilder.append(object.toString());
            }
            stringBuilder.append("|##|");
        }
        return stringBuilder.toString();
    }

    private String[] \u00d200000(String string) {
        String[] stringArray = string.split("\\|##\\|");
        return stringArray;
    }

    private int[] o00000(String string) {
        String[] stringArray = this.\u00d200000(string);
        int[] nArray = new int[stringArray.length];
        int n = 0;
        for (String string2 : stringArray) {
            nArray[n] = new Integer(string2);
            ++n;
        }
        return nArray;
    }
}

