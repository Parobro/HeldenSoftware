/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.namen.io;

import helden.framework.namen.daten.Namengenerator;
import helden.framework.namen.daten.Namengeneratoren;
import helden.framework.namen.daten.Namenliste;
import helden.framework.namen.daten.Namenlisten;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class NamenLader {
    private Namengeneratoren o00000;
    private Namenlisten new;

    public List<String> erzeugeFormate(Element element, String string) {
        ArrayList<String> arrayList = new ArrayList<String>();
        Element element2 = this.o00000(element, string);
        NodeList nodeList = element2.getChildNodes();
        int n = nodeList.getLength();
        for (int i2 = 0; i2 < n; ++i2) {
            Node node = nodeList.item(i2);
            if (node.getNodeType() != 1) continue;
            String string2 = nodeList.item(i2).getTextContent();
            arrayList.add(string2);
        }
        return arrayList;
    }

    public Namengenerator erzeugeNamengenerator(Element element) {
        String string = element.getAttribute("Bezeichnung");
        Namengenerator namengenerator = new Namengenerator(string);
        Element element2 = (Element)element.getElementsByTagName("Formate").item(0);
        namengenerator.setFormateMaennlich(this.erzeugeFormate(element2, "Maennlich"));
        namengenerator.setFormateMaennlichAdlig(this.erzeugeFormate(element2, "MaennlichAdlig"));
        namengenerator.setFormateWeiblich(this.erzeugeFormate(element2, "Weiblich"));
        namengenerator.setFormateWeiblichAdlig(this.erzeugeFormate(element2, "WeiblichAdlig"));
        namengenerator.setPlatzhalter(this.erzeugePlatzhalterZuordnungen(element));
        return namengenerator;
    }

    public Namengeneratoren erzeugeNamengeneratoren(Element element) {
        Namengeneratoren namengeneratoren = new Namengeneratoren();
        NodeList nodeList = element.getElementsByTagName("Namengenerator");
        int n = nodeList.getLength();
        for (int i2 = 0; i2 < n; ++i2) {
            Element element2 = (Element)nodeList.item(i2);
            Namengenerator namengenerator = this.erzeugeNamengenerator(element2);
            namengeneratoren.add(namengenerator);
        }
        return namengeneratoren;
    }

    public Map<String, Namenliste> erzeugePlatzhalterZuordnungen(Element element) {
        HashMap<String, Namenliste> hashMap = new HashMap<String, Namenliste>();
        Element element2 = this.o00000(element, "Platzhalter");
        NodeList nodeList = element2.getElementsByTagName("Platzhalter");
        int n = nodeList.getLength();
        for (int i2 = 0; i2 < n; ++i2) {
            Element element3 = (Element)nodeList.item(i2);
            String string = element3.getAttribute("Namenliste");
            Namenliste namenliste = this.o00000(string);
            String string2 = element3.getAttribute("Platzhalter");
            hashMap.put(string2, namenliste);
        }
        return hashMap;
    }

    public Namengeneratoren getNamengeneratoren() {
        return this.o00000;
    }

    public Namenlisten getNamenlisten() {
        return this.new;
    }

    public void ladeNamen(String string) throws IOException, SAXException, ParserConfigurationException {
        this.o00000();
        if (string != null && !string.equals("")) {
            this.Object(string);
        }
    }

    public void ladeNamengeneratorenAusRessource() throws IOException, SAXException, ParserConfigurationException {
        Element element = this.\u00d200000("Namengeneratoren.xml");
        this.o00000 = this.erzeugeNamengeneratoren(element);
        int n = this.o00000.size();
        for (int i2 = 0; i2 < n; ++i2) {
            this.o00000.get(i2).setIntern(true);
        }
    }

    protected Element leseXml(InputStream inputStream) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(inputStream);
        document.normalizeDocument();
        return document.getDocumentElement();
    }

    private Namenliste o00000(Element element) {
        String string = element.getAttribute("Bezeichnung");
        Namenliste namenliste = new Namenliste(string);
        NodeList nodeList = element.getElementsByTagName("Name");
        int n = nodeList.getLength();
        for (int i2 = 0; i2 < n; ++i2) {
            String string2 = nodeList.item(i2).getTextContent();
            namenliste.add(string2);
        }
        return namenliste;
    }

    private Namenlisten \u00d200000(Element element) {
        Namenlisten namenlisten = new Namenlisten();
        NodeList nodeList = element.getElementsByTagName("Namenliste");
        int n = nodeList.getLength();
        for (int i2 = 0; i2 < n; ++i2) {
            Element element2 = (Element)nodeList.item(i2);
            Namenliste namenliste = this.o00000(element2);
            namenlisten.add(namenliste);
        }
        return namenlisten;
    }

    private Element o00000(Element element, String string) {
        NodeList nodeList = element.getElementsByTagName(string);
        if (nodeList.getLength() > 0) {
            return (Element)nodeList.item(0);
        }
        return null;
    }

    private Namenliste o00000(String string) {
        return this.new.get(string);
    }

    private void Object(String string) throws ParserConfigurationException, SAXException, IOException {
        File file = new File(string);
        if (file.exists()) {
            this.\u00d400000(string);
            this.\u00d500000(string);
        }
    }

    private void \u00d500000(String string) throws IOException, SAXException, ParserConfigurationException {
        File file = new File(string, "Namengeneratoren.xml");
        if (file.exists()) {
            Element element = this.o00000(file);
            this.o00000.add(this.erzeugeNamengeneratoren(element));
        }
    }

    private void \u00d400000(String string) throws IOException, SAXException, ParserConfigurationException {
        File file = new File(string, "Namenlisten.xml");
        if (file.exists()) {
            Element element = this.o00000(file);
            this.new.add(this.\u00d200000(element));
        }
    }

    private void \u00d200000() throws IOException, SAXException, ParserConfigurationException {
        Element element = this.\u00d200000("Namenlisten.xml");
        this.new = this.\u00d200000(element);
        int n = this.new.size();
        for (int i2 = 0; i2 < n; ++i2) {
            this.new.get(i2).setIntern(true);
        }
    }

    private void o00000() throws ParserConfigurationException, SAXException, IOException {
        this.\u00d200000();
        this.ladeNamengeneratorenAusRessource();
    }

    private Element o00000(File file) throws ParserConfigurationException, IOException, SAXException {
        return this.leseXml(new FileInputStream(file));
    }

    private Element \u00d200000(String string) throws ParserConfigurationException, IOException, SAXException {
        return this.leseXml(NamenLader.class.getResourceAsStream(string));
    }
}

