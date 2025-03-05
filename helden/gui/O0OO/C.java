/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.O0OO;

import helden.framework.C.Oo0O;
import helden.framework.C.public;
import helden.framework.Wuerfelwurf;
import helden.framework.held.object.oooo_0;
import helden.framework.held.persistenz.BasisXMLPersistierer;
import java.util.Iterator;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.ProcessingInstruction;

public class C {
    public Document o00000() {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        Document document = null;
        try {
            document = documentBuilderFactory.newDocumentBuilder().newDocument();
            ProcessingInstruction processingInstruction = document.createProcessingInstruction("xml-stylesheet", "type=\"text/xsl\" href=\"helden.xsl\"");
            document.appendChild(processingInstruction);
        }
        catch (ParserConfigurationException parserConfigurationException) {
            oooo_0.o00000(parserConfigurationException);
        }
        return document;
    }

    public Element o00000(Document document, String string, String string2, Element element) {
        return this.o00000(document, string, string2, element, "value");
    }

    public void o00000(BasisXMLPersistierer basisXMLPersistierer, Document document, Element element, Oo0O oo0O, String string) {
        Element element2 = document.createElement(string);
        element.appendChild(element2);
        Iterator<public> iterator = oo0O.\u00d500000();
        while (iterator.hasNext()) {
            for (Element element3 : basisXMLPersistierer.getVorteil(iterator.next(), document)) {
                element2.appendChild(element3);
            }
        }
    }

    protected Element o00000(Document document, String string, String string2, Element element, String string3) {
        Element element2 = element.getOwnerDocument().createElement(string);
        element2.setAttribute(string3, string2);
        element.appendChild(element2);
        return element2;
    }

    protected Element o00000(Document document, Element element, String string, Wuerfelwurf wuerfelwurf) {
        Element element2 = document.createElement(string);
        element2.setAttribute("w20", "" + wuerfelwurf.getW20());
        element.appendChild(element2);
        element2.setAttribute("w6", "" + wuerfelwurf.getW6());
        element.appendChild(element2);
        element2.setAttribute("konstant", "" + wuerfelwurf.getKonstant());
        element.appendChild(element2);
        return element2;
    }
}

