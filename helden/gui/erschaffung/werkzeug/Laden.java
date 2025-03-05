/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.werkzeug;

import helden.framework.OOoO.while;
import helden.framework.held.K;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.held.object.oooo_0;
import helden.framework.held.persistenz.BasisXMLParser;
import helden.framework.held.persistenz.XMLPersistierer;
import helden.gui.erschaffung.werkzeug.HEW2;
import helden.gui.erschaffung.werkzeug.KostenArt;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Laden
extends BasisXMLParser {
    private HEW2 \u00d2O0000;
    private boolean oO0000 = false;

    public Laden(HEW2 hEW2, String string) {
        this.\u00d2O0000 = hEW2;
        XMLPersistierer xMLPersistierer = new XMLPersistierer();
        try {
            ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> arrayList = xMLPersistierer.ladeHelden(new File(string));
            if (arrayList.size() > 1 || !this.new(string)) {
                throw new RuntimeException();
            }
            K k2 = (K)arrayList.get(0);
            hEW2.restoreSavedErschaffung(k2);
            this.o00000(string);
            hEW2.restoreSavedErschaffungPart2();
            File file = new File(string);
            hEW2.setDateinameEntwurf(file.getName().replace(".erschaffung.hld", ""));
        }
        catch (Exception exception) {
            this.oO0000 = true;
            hEW2.\u00d6o0000 = null;
            JOptionPane.showMessageDialog(null, "Kann diesen Helden nicht laden!", "Ladefehler", 1);
            exception.printStackTrace();
        }
    }

    public boolean isLadeFehler() {
        return this.oO0000;
    }

    private ArrayList<Integer[]> oO0000(Node node) {
        ArrayList<Integer[]> arrayList = new ArrayList<Integer[]>();
        for (int i2 = 0; i2 < node.getChildNodes().getLength(); ++i2) {
            Node node2 = node.getChildNodes().item(i2);
            if (node2.getNodeType() != 1) continue;
            if (!node2.getNodeName().equals("wahl")) {
                oooo_0.\u00f500000("Fehler in getAuswahl");
            }
            arrayList.add(this.while(node2));
        }
        return arrayList;
    }

    private Integer[] while(Node node) {
        int n = Integer.parseInt(node.getAttributes().getNamedItem("anzahl").getNodeValue());
        Integer[] integerArray = new Integer[n];
        int n2 = 0;
        for (int i2 = 0; i2 < node.getChildNodes().getLength(); ++i2) {
            Node node2 = node.getChildNodes().item(i2);
            if (node2.getNodeType() != 1) continue;
            if (!node2.getNodeName().equals("wert")) {
                oooo_0.\u00f500000("Fehler in getAuswahl");
            }
            integerArray[n2] = Integer.parseInt(node2.getAttributes().getNamedItem("value").getNodeValue());
            ++n2;
        }
        return integerArray;
    }

    private void o00000(String string) {
        Document document;
        Object object;
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        try {
            object = documentBuilderFactory.newDocumentBuilder();
            document = ((DocumentBuilder)object).parse(new File(string));
        }
        catch (Exception exception) {
            return;
        }
        object = document.getElementsByTagName("erschaffungsdaten").item(0);
        for (int i2 = 0; i2 < object.getChildNodes().getLength(); ++i2) {
            Node node;
            int n;
            Node node2 = object.getChildNodes().item(i2);
            if (node2.getNodeName().equals("auswahlen")) {
                this.\u00d2O0000.getHswAuswahlen().\u00d800000 = new ArrayList();
                for (n = 0; n < node2.getChildNodes().getLength(); ++n) {
                    node = node2.getChildNodes().item(n);
                    if (node.getNodeType() != 1) continue;
                    if (!node.getNodeName().equals("auswahl")) {
                        oooo_0.\u00f500000("Fehler in getAuswahlen!");
                    }
                    this.\u00d2O0000.getHswAuswahlen().\u00d800000.add(new while<String, ArrayList<Integer[]>>("", this.oO0000(node)));
                }
                continue;
            }
            if (node2.getNodeName().equals("kostensf")) {
                this.\u00d2O0000.getSf().public = new HashMap();
                for (n = 0; n < node2.getChildNodes().getLength(); ++n) {
                    node = node2.getChildNodes().item(n);
                    if (node.getNodeType() != 1) continue;
                    this.\u00d2O0000.getSf().public.put(this.getSonderfertigkeit(node), KostenArt.valueOf(node.getAttributes().getNamedItem("kostenart").getNodeValue()));
                }
                continue;
            }
            if (node2.getNodeName().equals("usersf")) {
                this.\u00d2O0000.getSf().o00000 = new ArrayList();
                for (n = 0; n < node2.getChildNodes().getLength(); ++n) {
                    node = node2.getChildNodes().item(n);
                    if (node.getNodeType() != 1) continue;
                    this.\u00d2O0000.getSf().o00000.add(this.getSonderfertigkeit(node));
                }
                continue;
            }
            if (node2.getNodeName().equals("zaubervr")) {
                for (n = 0; n < node2.getChildNodes().getLength(); ++n) {
                    node = node2.getChildNodes().item(n);
                    if (node.getNodeType() != 1) continue;
                    this.\u00d2O0000.getHswZauber().getVrAktivierteZauber().add(this.getZauber(node));
                }
                continue;
            }
            if (!node2.getNodeName().equals("cfg")) continue;
            for (n = 0; n < node2.getChildNodes().getLength(); ++n) {
                node = node2.getChildNodes().item(n);
                if (node.getNodeType() != 1) continue;
                if (node.getNodeName().equals("maxgp")) {
                    this.\u00d2O0000.setMaxGP(Integer.parseInt(node.getAttributes().getNamedItem("value").getNodeValue()));
                    continue;
                }
                if (node.getNodeName().equals("maxeigenschaftsgp")) {
                    this.\u00d2O0000.setMaxGPEigenschaft(Integer.parseInt(node.getAttributes().getNamedItem("value").getNodeValue()));
                    continue;
                }
                if (!node.getNodeName().equals("maxeigenschaftswert")) continue;
                this.\u00d2O0000.setMaxEigenschaft(Integer.parseInt(node.getAttributes().getNamedItem("value").getNodeValue()));
            }
        }
    }

    private boolean new(String string) {
        Document document;
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            document = documentBuilder.parse(new File(string));
        }
        catch (Exception exception) {
            return false;
        }
        return document.getElementsByTagName("erschaffungsdaten").getLength() > 0;
    }
}

