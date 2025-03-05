/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.namen.io;

import helden.framework.namen.daten.Namengenerator;
import helden.framework.namen.daten.Namengeneratoren;
import helden.framework.namen.daten.Namenliste;
import helden.framework.namen.daten.Namenlisten;
import java.io.File;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class NamenSpeicherer {
    private Document o00000;

    public void speichern(String string, Namengeneratoren namengeneratoren) throws ParserConfigurationException, TransformerException {
        this.o00000 = this.o00000();
        Element element = this.o00000("Namengeneratoren");
        this.o00000.appendChild(element);
        for (Namengenerator namengenerator : namengeneratoren) {
            if (namengenerator.istIntern()) continue;
            this.o00000(element, namengenerator);
        }
        Object object = string;
        if (!((String)object).endsWith(File.separator)) {
            object = (String)object + File.separator;
        }
        object = (String)object + "Namengeneratoren.xml";
        this.o00000((String)object, this.o00000);
    }

    public void speichern(String string, Namenlisten namenlisten) throws ParserConfigurationException, TransformerException {
        this.o00000 = this.o00000();
        Element element = this.o00000("Namenlisten");
        this.o00000.appendChild(element);
        for (Namenliste namenliste : namenlisten) {
            if (namenliste.istIntern()) continue;
            this.o00000(element, namenliste);
        }
        Object object = string;
        if (!((String)object).endsWith(File.separator)) {
            object = (String)object + File.separator;
        }
        object = (String)object + "Namenlisten.xml";
        this.o00000((String)object, this.o00000);
    }

    private void o00000(Element element, List<String> list) {
        for (String string : list) {
            this.o00000(element, string);
        }
    }

    private void o00000(Element element, List<String> list, List<String> list2, List<String> list3, List<String> list4) {
        Element element2 = this.o00000("Formate");
        element.appendChild(element2);
        this.o00000(element2, "Maennlich", list);
        this.o00000(element2, "MaennlichAdlig", list2);
        this.o00000(element2, "Weiblich", list3);
        this.o00000(element2, "WeiblichAdlig", list4);
    }

    private void o00000(Element element, Map<String, Namenliste> map) {
        Element element2 = this.o00000("Platzhalter");
        element.appendChild(element2);
        ArrayList<String> arrayList = new ArrayList<String>(map.keySet());
        Collections.sort(arrayList, Collator.getInstance());
        for (String string : arrayList) {
            this.o00000(element2, string, map.get(string));
        }
    }

    private void o00000(Element element, Namengenerator namengenerator) {
        Element element2 = this.o00000("Namengenerator");
        element.appendChild(element2);
        element2.setAttribute("Bezeichnung", namengenerator.getBezeichnung());
        this.o00000(element2, namengenerator.getFormatStringsNamenMaennlich(), namengenerator.getFormatStringsNamenMaennlichAdlig(), namengenerator.getFormatStringsNamenWeiblich(), namengenerator.getFormatStringsNamenWeiblichAdlig());
        this.o00000(element2, namengenerator.getPlatzhalter());
    }

    private void o00000(Element element, Namenliste namenliste) {
        Element element2 = this.o00000("Namenliste");
        element.appendChild(element2);
        element2.setAttribute("Bezeichnung", namenliste.getBezeichnung());
        this.o00000(element2, namenliste.getNamen());
    }

    private void o00000(Element element, String string) {
        Element element2 = this.o00000("Name");
        element.appendChild(element2);
        element2.setTextContent(string);
    }

    private void o00000(Element element, String string, List<String> list) {
        Element element2 = this.o00000(string);
        element.appendChild(element2);
        for (String string2 : list) {
            this.o00000(element2, "Format", string2);
        }
    }

    private void o00000(Element element, String string, Namenliste namenliste) {
        Element element2 = this.o00000("Platzhalter");
        element.appendChild(element2);
        element2.setAttribute("Namenliste", namenliste.getBezeichnung());
        element2.setAttribute("Platzhalter", string);
    }

    private void o00000(Element element, String string, String string2) {
        Element element2 = this.o00000(string);
        element2.setTextContent(string2);
        element.appendChild(element2);
    }

    private Element o00000(String string) {
        return this.o00000.createElement(string);
    }

    private Document o00000() throws ParserConfigurationException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        return documentBuilder.newDocument();
    }

    private void o00000(String string, Document document) throws TransformerException {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource dOMSource = new DOMSource(document);
        StreamResult streamResult = new StreamResult(new File(string));
        transformer.transform(dOMSource, streamResult);
    }
}

