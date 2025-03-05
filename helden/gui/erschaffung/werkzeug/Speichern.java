/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.werkzeug;

import helden.framework.C.J;
import helden.framework.C.public;
import helden.framework.D.P;
import helden.framework.OOoO.while;
import helden.framework.held.persistenz.BasisXMLPersistierer;
import helden.framework.held.persistenz.ModVerwaltung;
import helden.framework.held.persistenz.XMLPersistierer;
import helden.framework.zauber.KonkreterZauber;
import helden.gui.erschaffung.werkzeug.HEW2;
import helden.gui.erschaffung.werkzeug.KostenArt;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Speichern {
    private HEW2 o00000;

    public Speichern(HEW2 hEW2) {
        this.o00000 = hEW2;
    }

    public void save(String string) {
        XMLPersistierer xMLPersistierer = new XMLPersistierer();
        this.o00000.getTalente().initialisiereKampfwerte();
        try {
            Object object;
            Object object4;
            File file = new File(string);
            Document document = xMLPersistierer.getHeldenXMLDocument(this.o00000.getHeld());
            ModVerwaltung modVerwaltung = new ModVerwaltung(document);
            NodeList nodeList = document.getElementsByTagName("held");
            Element element = (Element)nodeList.item(0);
            element.setAttribute("Erschaffungszwischenstand", "yes");
            Element element2 = document.createElement("erschaffungsdaten");
            nodeList.item(0).appendChild(element2);
            Element element3 = document.createElement("auswahlen");
            element2.appendChild(element3);
            ArrayList<while<String, ArrayList<Integer[]>>> arrayList = this.o00000.getHswAuswahlen().\u00d800000;
            for (int i2 = 0; i2 < arrayList.size(); ++i2) {
                Element element4 = document.createElement("auswahl");
                element4.setAttribute("auswahl", "" + i2);
                element4.setAttribute("desc", "" + arrayList.get(i2).getWert1());
                for (int i3 = 0; i3 < arrayList.get(i2).getWert2().size(); ++i3) {
                    object4 = document.createElement("wahl");
                    object4.setAttribute("auswahl", "" + i2);
                    object4.setAttribute("wahlnr", "" + i3);
                    object4.setAttribute("anzahl", "" + arrayList.get(i2).getWert2().get(i3).length);
                    for (int i4 = 0; i4 < arrayList.get(i2).getWert2().get(i3).length; ++i4) {
                        Element object32 = document.createElement("wert");
                        object32.setAttribute("auswahl", "" + i2);
                        object32.setAttribute("wahlnr", "" + i3);
                        object32.setAttribute("wertnr", "" + i4);
                        object32.setAttribute("value", "" + arrayList.get(i2).getWert2().get(i3)[i4]);
                        object4.appendChild(object32);
                    }
                    element4.appendChild((Node)object4);
                }
                element3.appendChild(element4);
            }
            Element element5 = document.createElement("kostensf");
            element2.appendChild(element5);
            for (Map.Entry entry : this.o00000.getSf().public.entrySet()) {
                object4 = BasisXMLPersistierer.getInstance().getSFElement((P)entry.getKey(), modVerwaltung);
                object4.setAttribute("kostenart", ((KostenArt)entry.getValue()).toString());
                element5.appendChild((Node)object4);
            }
            Element element6 = document.createElement("usersf");
            element2.appendChild(element6);
            for (P p2 : this.o00000.getSf().o00000) {
                element6.appendChild(BasisXMLPersistierer.getInstance().getSFElement(p2, modVerwaltung));
            }
            object4 = document.createElement("zaubervr");
            element2.appendChild((Node)object4);
            for (KonkreterZauber konkreterZauber : this.o00000.getHswZauber().getVrAktivierteZauber()) {
                object4.appendChild(BasisXMLPersistierer.getInstance().getZauberElement(konkreterZauber, document));
            }
            Element element7 = document.createElement("wertvorteile");
            element2.appendChild(element7);
            for (public public_ : this.o00000.getHswVorteile().getVorteile()) {
                if (!(public_ instanceof J)) continue;
                object = document.createElement("vorteil");
                object.setAttribute("vorteil", "" + public_.toString());
                object.setAttribute("value", "" + this.o00000.getHswVorteile().getMinimalWert((J)public_));
                element7.appendChild((Node)object);
            }
            Element element4 = document.createElement("cfg");
            element2.appendChild(element4);
            this.o00000(document, element4, "maxgp", "" + this.o00000.getGpmax());
            this.o00000(document, element4, "maxeigenschaftsgp", "" + this.o00000.getMaxgpeigenschaft());
            this.o00000(document, element4, "maxeigenschaftswert", "" + this.o00000.getMaxeigenschaft());
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            object = transformerFactory.newTransformer();
            ((Transformer)object).setOutputProperty("indent", "yes");
            ((Transformer)object).setOutputProperty("standalone", "yes");
            ((Transformer)object).setOutputProperty("encoding", "UTF-8");
            DOMSource dOMSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(file);
            ((Transformer)object).transform(dOMSource, streamResult);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private Element o00000(Document document, Element element, String string, String string2) {
        Element element2 = document.createElement(string);
        element2.setAttribute("value", string2);
        element.appendChild(element2);
        return element2;
    }
}

