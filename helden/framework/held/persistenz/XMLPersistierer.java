/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.persistenz;

import helden.Version;
import helden.framework.HeldEinstellungen;
import helden.framework.held.B.B.class;
import helden.framework.held.Object.K;
import helden.framework.held.Object.Y;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.held.object.oooo_0;
import helden.framework.held.persistenz.HeldEinstellungenXML;
import helden.framework.held.persistenz.SigTool;
import helden.framework.held.persistenz.XMLEinstellungenParser;
import helden.framework.held.persistenz.XMLParser;
import helden.framework.oooo.a_0;
import helden.gui.B;
import java.beans.PropertyChangeSupport;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.tree.TreePath;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.ProcessingInstruction;

public class XMLPersistierer
implements K {
    private XMLParser \u00d200000;
    private XMLEinstellungenParser o00000;

    @Override
    public ArrayList<String> getFehlerHelden() {
        if (this.\u00d200000 == null) {
            return new ArrayList<String>();
        }
        return this.\u00d200000.getFehlerHelden();
    }

    @Override
    public Document getGruppenBeschreibung(TreePath treePath) throws ParserConfigurationException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        Document document = documentBuilderFactory.newDocumentBuilder().newDocument();
        Element element = document.createElement("heldengruppe");
        element.setAttribute("Version", Version.getVersion());
        new HeldEinstellungenXML(document).getGruppenBaschreibung(treePath);
        return document;
    }

    @Override
    public Document getHeldenXMLDocument(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) throws ParserConfigurationException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        documentBuilderFactory.setNamespaceAware(true);
        Document document = documentBuilderFactory.newDocumentBuilder().newDocument();
        ProcessingInstruction processingInstruction = document.createProcessingInstruction("xml-stylesheet", "type=\"text/xsl\" href=\"helden.xsl\"");
        document.appendChild(processingInstruction);
        Element element = document.createElement("helden");
        element.setAttribute("Version", Version.getVersion());
        document.appendChild(element);
        try {
            Element element2 = class.o00000(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, document);
            element.appendChild(element2);
            SigTool.getInstance().sign(document);
        }
        catch (Exception exception) {
            oooo_0.\u00f500000("Der folgende Held wurde aufgrund\neines Fehlers NICHT gespeichert:\n" + oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f5o0000() + "\n" + exception.getMessage());
            exception.printStackTrace();
            JOptionPane.showMessageDialog(null, "Der folgende Held wurde aufgrund\neines Fehlers NICHT gespeichert:\n" + oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f5o0000() + "\n" + exception.getMessage(), "", 0);
        }
        return document;
    }

    @Override
    public ArrayList<String> getHinweiseHelden() {
        if (this.\u00d200000 == null) {
            return new ArrayList<String>();
        }
        return this.\u00d200000.getHinweiseHelden();
    }

    public String getVersionDesLetztenHelden() {
        if (this.\u00d200000 != null) {
            return this.\u00d200000.getVersion();
        }
        return null;
    }

    @Override
    public String getVersionsWechsel() {
        if (this.\u00d200000 != null) {
            return this.\u00d200000.getVersionsWechsel();
        }
        return null;
    }

    @Override
    public ArrayList<HeldEinstellungen> ladeEinstellungen(File file) throws Exception {
        this.o00000 = new XMLEinstellungenParser();
        return this.o00000.ladeEinstellungen(file);
    }

    @Override
    public Y ladeGruppe(Document document) throws Exception {
        this.o00000 = new XMLEinstellungenParser();
        return this.o00000.ladeGruppe(document);
    }

    @Override
    public ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> ladeHelden(Document document) {
        PropertyChangeSupport propertyChangeSupport = null;
        if (this.\u00d200000 == null) {
            propertyChangeSupport = new PropertyChangeSupport(this);
            propertyChangeSupport.addPropertyChangeListener(B.\u00d200000());
            this.\u00d200000 = new XMLParser(propertyChangeSupport);
        }
        return this.\u00d200000.ladeHelden(document, propertyChangeSupport);
    }

    @Override
    public ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> ladeHelden(File file) throws Exception {
        if (this.\u00d200000 == null) {
            PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
            propertyChangeSupport.addPropertyChangeListener(B.\u00d200000());
            this.\u00d200000 = new XMLParser(propertyChangeSupport);
        }
        return this.\u00d200000.ladeHelden(file);
    }

    @Override
    public void speichereEinstellungen(File file, ArrayList<HeldEinstellungen> arrayList) throws ParserConfigurationException, TransformerException, IOException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        Document document = documentBuilderFactory.newDocumentBuilder().newDocument();
        Element element = document.createElement("einstellungen");
        document.appendChild(element);
        Element element2 = new HeldEinstellungenXML(document).getXMLGlobalElement();
        element.appendChild(element2);
        if (arrayList != null) {
            Iterator<HeldEinstellungen> iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                element2 = new HeldEinstellungenXML(iterator.next(), document).getXMLElement();
                element.appendChild(element2);
            }
        }
        a_0.o00000(document, file);
    }

    @Override
    public void speichereHelden(File file, OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) throws ParserConfigurationException, TransformerException, IOException {
        Document document = this.getHeldenXMLDocument(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty("standalone", "yes");
        transformer.setOutputProperty("encoding", "UTF-8");
        DOMSource dOMSource = new DOMSource(document);
        StreamResult streamResult = new StreamResult(file);
        transformer.transform(dOMSource, streamResult);
    }

    @Override
    public void unsetParser() {
        this.\u00d200000 = null;
    }

    @Override
    public void writeHeldenXML(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, OutputStream outputStream) throws Exception {
        Document document = this.getHeldenXMLDocument(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty("standalone", "yes");
        transformer.setOutputProperty("encoding", "UTF-8");
        DOMSource dOMSource = new DOMSource(document);
        StreamResult streamResult = new StreamResult(outputStream);
        transformer.transform(dOMSource, streamResult);
    }
}

