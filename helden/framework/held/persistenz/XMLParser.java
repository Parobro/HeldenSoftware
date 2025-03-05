/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.persistenz;

import helden.Version;
import helden.framework.C.public;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.E.B;
import helden.framework.E.C.A;
import helden.framework.E.F;
import helden.framework.E.O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.E.if;
import helden.framework.Einstellungen;
import helden.framework.Geschlecht;
import helden.framework.Monat;
import helden.framework.OOoO.O;
import helden.framework.OOoO.R;
import helden.framework.OOoO.Y;
import helden.framework.OoOO.D;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.U;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.geld.Muenze;
import helden.framework.geld.WaehrungsFabrik;
import helden.framework.held.K;
import helden.framework.held.L;
import helden.framework.held.Object.H;
import helden.framework.held.Object.private;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.held.T;
import helden.framework.held.a.oooo_1;
import helden.framework.held.a.oooo_2;
import helden.framework.held.classsuper;
import helden.framework.held.persistenz.BasisXMLParser;
import helden.framework.held.persistenz.ModsDatenParser;
import helden.framework.held.persistenz.NamenErsetzerKonverter;
import helden.framework.held.persistenz.SigTool;
import helden.framework.int.C;
import helden.framework.int.OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.int.OooO;
import helden.framework.int.String;
import helden.framework.int.o0oo_0;
import helden.framework.int.super;
import helden.framework.oooo.a_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.settings.Settings;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.ZauberInfos;
import helden.model.KulturFabrik;
import helden.model.ProfessionenFabrik;
import helden.model.RassenFabrik;
import java.beans.PropertyChangeSupport;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class XMLParser
extends BasisXMLParser {
    private ArrayList<String> float;
    private ArrayList<String> \u00f400000;
    private ArrayList<Document> Object;
    private PropertyChangeSupport void;
    private boolean \u00d400000;
    private int \u00d600000;
    private int \u00f600000;
    private boolean \u00d500000;
    private String \u00f500000 = null;

    public XMLParser(PropertyChangeSupport propertyChangeSupport) {
        this.void = propertyChangeSupport;
        this.float = new ArrayList();
        this.Object = new ArrayList();
        this.\u00f400000 = new ArrayList();
    }

    public ArrayList<String> getFehlerHelden() {
        return this.float;
    }

    public ArrayList<Document> getFehlerHeldenXML() {
        return this.Object;
    }

    public ArrayList<String> getHinweiseHelden() {
        return this.\u00f400000;
    }

    public String getVersionsWechsel() {
        return this.\u00f500000;
    }

    public ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> ladeHelden(Document document, PropertyChangeSupport propertyChangeSupport) {
        ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> arrayList = new ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO>();
        SigTool.VerfiyStatus verfiyStatus = SigTool.getInstance().verify(document);
        NodeList nodeList = document.getElementsByTagName("helden");
        String string = "";
        if (nodeList.getLength() > 0 && nodeList.item(0).getAttributes().getNamedItem("Version") != null) {
            string = nodeList.item(0).getAttributes().getNamedItem("Version").getNodeValue();
        }
        if (string.equals("") || string.startsWith("4.")) {
            throw new RuntimeException("Alte Version! Kein Import m\u00f6glich!");
        }
        this.setVersion(string);
        NodeList nodeList2 = document.getElementsByTagName("held");
        for (int i2 = 0; i2 < nodeList2.getLength(); ++i2) {
            Node node = nodeList2.item(i2);
            if (propertyChangeSupport != null) {
                propertyChangeSupport.firePropertyChange("value", new Integer(nodeList2.getLength()), new Integer(i2));
            }
            if (node.getNodeName().startsWith("#")) continue;
            try {
                K k2 = (K)this.\u00d800000(node);
                k2.o00000(verfiyStatus, string);
                arrayList.add(k2);
                continue;
            }
            catch (Exception exception) {
                this.float.add(exception.getMessage());
                this.Object.add(document);
            }
        }
        return arrayList;
    }

    public ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> ladeHelden(File file) throws Exception {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        documentBuilderFactory.setNamespaceAware(true);
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(file);
        return this.ladeHelden(document, this.void);
    }

    public void saveXML(Node node, String string, String string2) {
        try {
            boolean bl;
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            Document document = documentBuilderFactory.newDocumentBuilder().newDocument();
            document.appendChild(document.importNode(node, true));
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty("indent", "yes");
            transformer.setOutputProperty("standalone", "yes");
            transformer.setOutputProperty("encoding", "UTF-8");
            DOMSource dOMSource = new DOMSource(document);
            File file = new File(string2);
            boolean bl2 = bl = file.exists() && !file.isDirectory();
            if (!file.exists()) {
                boolean bl3 = bl = !file.mkdir();
            }
            if (bl) {
                JOptionPane.showMessageDialog(null, "Das Verzeichnis " + file.getName() + " konnte nicht erzeugt werden!", "Fehler", 0);
                return;
            }
            String string3 = string2 + File.separator + string + ".xml";
            file = new File(string3);
            if (file.exists()) {
                int n = 0;
                do {
                    string3 = string2 + File.separator + string + "-" + n + ".xml";
                    ++n;
                } while ((file = new File(string3)).exists());
            }
            StreamResult streamResult = new StreamResult(string3);
            transformer.transform(dOMSource, streamResult);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO \u00d800000(Node node) throws Exception {
        NodeList nodeList = node.getChildNodes();
        H h2 = helden.framework.held.object.a_0.class().\u00d400000();
        String string = null;
        this.\u00d400000 = true;
        this.\u00d500000 = true;
        try {
            Node node2 = node.getAttributes().getNamedItem("name");
            string = node2.getNodeValue();
            Node object = node.getAttributes().getNamedItem("key");
            long l2 = System.currentTimeMillis();
            if (object != null) {
                l2 = Long.parseLong(object.getNodeValue());
            }
            h2.o00000(string);
            h2.\u00d800000().o00000(l2);
            Node node3 = node.getAttributes().getNamedItem("stand");
            if (node3 != null) {
                h2.\u00d800000().ifnew().o00000(Long.parseLong(node3.getNodeValue()));
            }
            this.o00000(nodeList, h2);
            if (!this.getVersion().equals(Version.getVersion())) {
                this.\u00f500000 = this.getVersion();
                this.o00000(h2);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
            throw new Exception("Held: " + string + " [Fehler: " + exception.getMessage() + "]");
        }
        for (String string2 : h2.oO0000()) {
            this.\u00f400000.add(string + ": " + string2);
        }
        return h2.\u00d800000();
    }

    private void \u00d3o0000(H h2, Node node) {
        List<Node> list = this.getRealChildren(node);
        for (Node node2 : list) {
            C c;
            Object object;
            if (node2.getNodeName().equals("eigeneprofession")) {
                object = this.\u00d4o0000(h2, node2);
                if (ProfessionenFabrik.isErweiterungBekannt((String)object)) continue;
                c = ModsDatenParser.getInstance().einlesenRKPVariante(node2);
                if (!c.\u00d5\u00f60000().contains(object)) {
                    h2.\u00d2O0000().put((String)object, c.o\u00f60000());
                }
                this.saveXML(node2, c.o\u00f60000(), Einstellungen.getInstance().getPfade().getPfad("mods") + "/Profession");
                ProfessionenFabrik.aktualisiereEigeneProfessionen();
                continue;
            }
            if (node2.getNodeName().equals("eigenekultur")) {
                object = this.\u00d4o0000(h2, node2);
                if (KulturFabrik.isErweiterungBekannt((String)object)) continue;
                c = ModsDatenParser.getInstance().einlesenRKPVariante(node2);
                if (!c.\u00d5\u00f60000().contains(object)) {
                    h2.\u00d2O0000().put((String)object, c.o\u00f60000());
                }
                this.saveXML(node2, c.o\u00f60000(), Einstellungen.getInstance().getPfade().getPfad("mods") + "/Kultur");
                KulturFabrik.aktualisiereEigeneKulturen();
                continue;
            }
            if (node2.getNodeName().equals("eigenerasse")) {
                object = this.\u00d4o0000(h2, node2);
                if (RassenFabrik.isErweiterungBekannt((String)object)) continue;
                c = ModsDatenParser.getInstance().einlesenRKPVariante(node2);
                if (!c.\u00d5\u00f60000().contains(object)) {
                    h2.\u00d2O0000().put((String)object, c.o\u00f60000());
                }
                this.saveXML(node2, c.o\u00f60000(), Einstellungen.getInstance().getPfade().getPfad("mods") + "/Rasse");
                RassenFabrik.aktualisiereEigeneRassen();
                continue;
            }
            if (node2.getNodeName().equals("eigenestalent")) {
                object = this.\u00d4o0000(h2, node2);
                if (N.floatsuper().super((String)object) != null) continue;
                N.floatsuper().\u00d200000(ModsDatenParser.getInstance().einlesenTalent(node2));
                continue;
            }
            if (node2.getNodeName().equals("eigeneformel")) {
                object = ModsDatenParser.getInstance().einlesenFormel(node2);
                if (((Y)object).Objectreturn()) continue;
                ((O)object).\u00f6\u00d80000();
                this.saveXML(node2, ((Y)object).getID(), Einstellungen.getInstance().getPfade().getPfad("mods") + "/Formel");
                continue;
            }
            helden.framework.held.object.oooo_0.\u00f500000("Unbekanntes Tag in extractMods" + node2.getNodeName());
        }
    }

    private String \u00d300000(Node node, String string) {
        return this.o00000(node, string, "");
    }

    private String o00000(Node node, String string, String string2) {
        if (node.getAttributes().getNamedItem(string) == null) {
            return string2;
        }
        return node.getAttributes().getNamedItem(string).getNodeValue();
    }

    private int \u00d500000(Node node) {
        Node node2 = node.getAttributes().getNamedItem("grossemeditation");
        if (node2 != null) {
            String string = node2.getNodeValue();
            return Integer.parseInt(string);
        }
        return 0;
    }

    private int new(Node node, String string) {
        return Integer.parseInt(this.getString(node, string));
    }

    private int \u00f500000(Node node) {
        Node node2 = node.getAttributes().getNamedItem("karmalqueste");
        if (node2 != null) {
            String string = node2.getNodeValue();
            return Integer.parseInt(string);
        }
        return 0;
    }

    private String \u00d4o0000(H h2, Node node) {
        String string = this.\u00d300000(node, "id");
        if (string.length() > 3 && !string.substring(2, 3).equals("-")) {
            string = "01-" + string;
        }
        if (h2.\u00d2O0000().containsKey(string)) {
            string = h2.\u00d2O0000().get(string);
        }
        return string;
    }

    private boolean \u00d400000(Node node) {
        Node node2 = node.getAttributes().getNamedItem("leittalent");
        if (node2 != null) {
            String string = node2.getNodeValue();
            return Boolean.valueOf(string);
        }
        return false;
    }

    private D if(Node node) {
        Node node2 = node.getAttributes().getNamedItem("lernmethode");
        if (node2 != null) {
            String string = node2.getNodeValue();
            return D.o00000(string);
        }
        return D.Object;
    }

    private int \u00f800000(Node node) {
        Node node2 = node.getAttributes().getNamedItem("permanent");
        if (node2 != null) {
            String string = node2.getNodeValue();
            return Integer.parseInt(string);
        }
        return 0;
    }

    private Boolean return(Node node) {
        Node node2 = node.getAttributes().getNamedItem("se");
        if (node2 != null) {
            String string = node2.getNodeValue();
            return Boolean.valueOf(string);
        }
        return new Boolean(false);
    }

    private int \u00f400000(Node node) {
        Node node2 = node.getAttributes().getNamedItem("startwert");
        if (node2 != null) {
            String string = node2.getNodeValue();
            return Integer.parseInt(string);
        }
        return 0;
    }

    private void o00000(H h2) {
    }

    private void o00000(NodeList nodeList, H h2) throws Exception {
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            Node node = nodeList.item(i2);
            if (node.getNodeName().startsWith("#")) continue;
            if (node.getNodeName().equals("basis")) {
                this.o00000(node.getChildNodes(), h2);
                continue;
            }
            if (node.getNodeName().equals("eigenschaften")) {
                this.o00000(node.getChildNodes(), h2);
                continue;
            }
            if (node.getNodeName().equals("vt")) {
                this.o00000(node.getChildNodes(), h2);
                continue;
            }
            if (node.getNodeName().equals("sf")) {
                this.o00000(node.getChildNodes(), h2);
                continue;
            }
            if (node.getNodeName().equals("talentliste")) {
                this.o00000(node.getChildNodes(), h2);
                continue;
            }
            if (node.getNodeName().equals("zauberliste")) {
                this.o00000(node.getChildNodes(), h2);
                continue;
            }
            if (node.getNodeName().equals("kampf")) {
                this.o00000(node.getChildNodes(), h2);
                continue;
            }
            if (node.getNodeName().equals("gegenst\u00e4nde")) {
                this.o00000(node.getChildNodes(), h2);
                continue;
            }
            if (node.getNodeName().equals("BoniWaffenlos")) {
                this.o00000(node.getChildNodes(), h2);
                continue;
            }
            if (node.getNodeName().equals("kommentare")) {
                this.o00000(node.getChildNodes(), h2);
                continue;
            }
            if (node.getNodeName().equals("ausr\u00fcstungen")) {
                this.o00000(node.getChildNodes(), h2);
                continue;
            }
            if (node.getNodeName().equals("verbindungen")) {
                this.o00000(node.getChildNodes(), h2);
                continue;
            }
            if (node.getNodeName().equals("geschlecht")) {
                this.\u00d300000(h2, node);
                continue;
            }
            if (node.getNodeName().equals("setting") || node.getNodeName().equals("settings")) {
                this.Oo0000(h2, node);
                continue;
            }
            if (node.getNodeName().equals("mods")) {
                this.\u00d3o0000(h2, node);
                continue;
            }
            if (node.getNodeName().equals("nscSchmide")) {
                this.new(h2, node);
                continue;
            }
            if (node.getNodeName().equals("rasse")) {
                this.\u00f4o0000(h2, node);
                continue;
            }
            if (node.getNodeName().equals("kultur")) {
                this.\u00d8o0000(h2, node);
                continue;
            }
            if (node.getNodeName().equals("ausbildungen")) {
                this.\u00d400000(h2, node);
                continue;
            }
            if (node.getNodeName().startsWith("goettergeschenk")) {
                this.\u00f400000(h2, node);
                continue;
            }
            if (node.getNodeName().equals("eingegeben")) {
                h2.\u00d800000().\u00f8\u00d20000();
                continue;
            }
            if (node.getNodeName().equals("portraet")) {
                this.\u00f4O0000(h2, node);
                continue;
            }
            if (node.getNodeName().equals("abenteuerpunkte")) {
                this.\u00d500000(h2, node);
                continue;
            }
            if (node.getNodeName().equals("gilde")) {
                this.forsuper(h2, node);
                continue;
            }
            if (node.getNodeName().equals("freieabenteuerpunkte")) {
                this.oo0000(h2, node);
                continue;
            }
            if (node.getNodeName().equals("eigenschaft")) {
                this.OO0000(h2, node);
                continue;
            }
            if (node.getNodeName().equals("vorteil")) {
                this.\u00d4O0000(h2, node);
                continue;
            }
            if (node.getNodeName().equals("sonderfertigkeit")) {
                this.Stringsuper(h2, node);
                continue;
            }
            if (node.getNodeName().equals("verbilligtesonderfertigkeit")) {
                this.thissuper(h2, node);
                continue;
            }
            if (node.getNodeName().equals("talent")) {
                this.\u00d8O0000(h2, node);
                continue;
            }
            if (node.getNodeName().equals("zauber")) {
                this.nullsuper(h2, node);
                continue;
            }
            if (node.getNodeName().equals("kampfwerte")) {
                this.\u00d3O0000(h2, node);
                continue;
            }
            if (node.getNodeName().equals("boniSF")) {
                this.oO0000(h2, node);
                continue;
            }
            if (node.getNodeName().equals("notiz")) {
                this.\u00f500000(h2, node);
                continue;
            }
            if (node.getNodeName().equals("kommentar")) {
                this.\u00f5O0000(h2, node);
                continue;
            }
            if (node.getNodeName().equals("sfInfos")) {
                this.\u00d5o0000(h2, node);
                continue;
            }
            if (node.getNodeName().equals("gegenstand")) {
                this.if(h2, node);
                continue;
            }
            if (node.getNodeName().equals("verbindung")) {
                this.return(h2, node);
                continue;
            }
            if (node.getNodeName().equals("heldenausruestung")) {
                this.\u00f800000(h2, node);
                continue;
            }
            if (node.getNodeName().equals("extention")) {
                this.while(h2, node);
                continue;
            }
            if (node.getNodeName().equals("geldboerse")) {
                this.\u00f8O0000(h2, node);
                continue;
            }
            if (node.getNodeName().equals("ereignisse")) {
                this.\u00d5O0000(h2, node);
                continue;
            }
            if (node.getNodeName().equals("plugindata")) {
                this.o00000(h2, node);
                continue;
            }
            if (!node.getNodeName().equals("verify")) continue;
            this.\u00d800000(h2, node);
        }
    }

    private void \u00d500000(H h2, Node node) {
        int n = this.getIntValue(node);
        h2.\u00d600000(n);
    }

    private void \u00d400000(H h2, Node node) throws Exception {
        for (Node node2 : this.getRealChildren(node)) {
            List<Object> list;
            Object object;
            Object object2;
            super super_;
            String._o _o2 = String._o.valueOf(this.getString(node2, "art"));
            String string = this.getName(node2);
            if (string.equals("helden.model.profession.EigeneProfession")) {
                super_ = ProfessionenFabrik.getProfessionByID(this.\u00d4o0000(h2, node2));
                if (super_ == null) {
                    throw new Exception("Kenne die Erweiterung " + this.\u00d4o0000(h2, node2) + " nicht!");
                }
            } else {
                super_ = (super)Class.forName(string).newInstance();
            }
            try {
                this.o00000(node2, super_);
            }
            catch (RuntimeException runtimeException) {
                Object object3;
                object2 = "";
                for (int i2 = 0; i2 < node2.getChildNodes().getLength(); ++i2) {
                    object3 = node2.getChildNodes().item(i2);
                    if (!object3.getNodeName().equals("variante")) continue;
                    object2 = this.getName((Node)object3);
                    break;
                }
                object = super_.getClass().toString() + "#" + (String)object2;
                object3 = NamenErsetzerKonverter.getInstance().getKorrigiereRKP((String)object);
                if (object3 == null) {
                    private.\u00d200000((String)object, "sven");
                    throw runtimeException;
                }
                super_ = (super)Class.forName(((R)object3).o00000(0).toString().substring(6)).newInstance();
                super_.waehleVariante(((R)object3).o00000(1).toString());
            }
            if (node2.getAttributes().getNamedItem("tarnidentitaet") != null) {
                h2.\u00d800000().thissuper().\u00d200000(node2.getAttributes().getNamedItem("tarnidentitaet").getNodeValue());
            }
            if (node2.getAttributes().getNamedItem("zweitsprache") != null) {
                list = new ArrayList<G>();
                super_.setZweitLehrsprache((ArrayList<G>)list);
                object2 = node2.getAttributes().getNamedItem("zweitsprache").getNodeValue();
                ((ArrayList)list).add((G)N.floatsuper().\u00d200000((String)object2));
            }
            super_.setGeschlecht(h2.\u00d800000().\u00d300000());
            list = this.getRealChildren(node2);
            if (list.size() > 0 && (object2 = (Node)list.get(0)).getNodeName().equals("modifikation")) {
                object = b_0.\u00f400000(this.getName((Node)object2));
                super_.setzeModifizierteEigenschaft((b_0)object);
            }
            h2.\u00d800000().\u00d800000().o00000(_o2, super_);
        }
    }

    private void \u00f4O0000(H h2, Node node) {
        h2.\u00d800000().o00000(node.getAttributes().getNamedItem("value").getNodeValue());
    }

    private void oO0000(H h2, Node node) {
        try {
            String string = this.getString(node, "sf");
            String string2 = this.getString(node, "talent");
            P p2 = oooo_0.o00000(P.new(string));
            if (string2.equals("")) {
                h2.\u00d800000().\u00d5\u00d20000().put(p2, null);
            } else {
                voidsuper voidsuper2 = N.floatsuper().\u00d200000(string2);
                h2.\u00d800000().\u00d5\u00d20000().put(p2, voidsuper2);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void OO0000(H h2, Node node) throws Exception {
        int n;
        String string = this.getName(node);
        if (string.equals("at") || string.equals("pa") || string.equals("ini") || string.equals("fk")) {
            return;
        }
        b_0 b_02 = b_0.\u00f400000(string);
        int n2 = this.getIntValue(node);
        h2.\u00d200000(b_02, n2);
        Boolean bl = this.return(node);
        h2.\u00d200000((U)b_02, bl);
        if (b_02.publicString()) {
            n = this.\u00f400000(node);
            if (n > 0) {
                h2.\u00d300000(b_02, n);
            } else {
                h2.\u00d300000(b_02, n2);
            }
        }
        h2.o00000(b_02, this.\u00f800000(node));
        if (b_02.equals(b_0.\u00f4\u00f5\u00d2000)) {
            n = this.\u00d500000(node);
            h2.\u00d800000().\u00d3\u00d30000().\u00d300000(n);
        }
        if (b_02.equals(b_0.\u00d4\u00f5\u00d2000)) {
            n = this.\u00f500000(node);
            h2.\u00d800000().\u00d3\u00d30000().class(n);
        }
    }

    private void oo0000(H h2, Node node) {
        int n = this.getIntValue(node);
        h2.\u00d800000(n);
    }

    private void \u00d300000(H h2, Node node) {
        String string = this.getName(node);
        Geschlecht geschlecht = Geschlecht.getGeschlecht(string);
        h2.o00000(geschlecht);
    }

    private void forsuper(H h2, Node node) {
        h2.\u00d800000().\u00d800000(this.getName(node));
    }

    private void \u00f400000(H h2, Node node) throws Exception {
        List<Node> list = this.getRealChildren(node);
        if (list.size() > 0) {
            Node node2 = list.get(0);
            b_0 b_02 = b_0.\u00f400000(this.getName(node2));
            h2.\u00d800000().privatesuper().setzeModifizierteEigenschaft(b_02);
        }
    }

    private void if(H h2, Node node) {
        R r = this.getGegenstand(h2, node);
        if (r != null) {
            h2.\u00d800000().\u00d8o0000().new((F)r.o00000(0), (Integer)r.o00000(1));
        } else {
            helden.framework.held.object.oooo_0.\u00f400000("Gegenstand nicht gefunden" + this.getString(node, "name"));
        }
    }

    private void \u00d3O0000(H h2, Node node) throws Exception {
        if (this.\u00d400000) {
            h2.\u00d3O0000();
            this.\u00d400000 = false;
            this.\u00d600000 = h2.\u00d800000().\u00d3\u00d30000().int();
            this.\u00f600000 = h2.\u00d800000().\u00d3\u00d30000().\u00d600000();
        }
        String string = this.getName(node);
        E e = (E)N.floatsuper().\u00d200000(string);
        List<Node> list = this.getRealChildren(node);
        Node node2 = list.get(0);
        int n = this.getIntValue(node2);
        int n2 = 0;
        if (e.o\u00d80000()) {
            Node node3 = list.get(1);
            n2 = this.getIntValue(node3);
            int n3 = Math.min(this.\u00d600000, this.\u00f600000);
            int n4 = Math.max(n, n2);
            for (int i2 = n3; i2 < n4; ++i2) {
                if (i2 < n) {
                    h2.\u00d200000(e, i2 + 1, true);
                }
                if (i2 >= n2) continue;
                h2.o00000(e, i2 + 1, true);
            }
        } else {
            h2.\u00d200000(e, n, true);
        }
    }

    private void \u00d8o0000(H h2, Node node) throws Exception {
        String string;
        ArrayList<G> arrayList;
        OooO oooO2;
        Object object;
        String string2 = NamenErsetzerKonverter.getInstance().korrigiere(this.getName(node), this.getVersionInt());
        if (string2.equals("helden.model.kultur.EigeneKultur")) {
            object = this.\u00d4o0000(h2, node);
            oooO2 = KulturFabrik.getKulturByID((String)object);
            if (oooO2 == null) {
                throw new Exception("Kenne die Kultur-Erweiterung " + (String)object + " nicht!");
            }
        } else {
            if (string2.startsWith("helden.model.kultur.DDZ")) {
                string2 = "helden.model.DDZKulturen." + string2.substring(23);
            }
            oooO2 = (OooO)Class.forName(string2).newInstance();
        }
        if ((object = node.getAttributes().getNamedItem("sprache")) != null) {
            arrayList = object.getNodeValue();
            oooO2.setzeMuttersprache((G)N.floatsuper().\u00d200000((String)((Object)arrayList)));
        }
        if ((object = node.getAttributes().getNamedItem("schrift")) != null) {
            arrayList = object.getNodeValue();
            oooO2.setzeMuttersSchriftSrache((G)N.floatsuper().\u00d200000((String)((Object)arrayList)));
        }
        if (node.getAttributes().getNamedItem("zweitsprache") != null) {
            arrayList = new ArrayList();
            oooO2.setZweitLehrsprache(arrayList);
            string = node.getAttributes().getNamedItem("zweitsprache").getNodeValue();
            arrayList.add((G)N.floatsuper().\u00d200000(string));
        }
        if (node.getAttributes().getNamedItem("zweitsprache0") != null) {
            arrayList = new ArrayList<G>();
            oooO2.setZweitLehrsprache(arrayList);
            string = node.getAttributes().getNamedItem("zweitsprache0").getNodeValue();
            arrayList.add((G)N.floatsuper().\u00d200000(string));
        }
        oooO2.setGeschlecht(h2.\u00d800000().\u00d300000());
        this.o00000(node, oooO2);
        h2.o00000(oooO2);
    }

    private void new(H h2, Node node) {
        if (this.getString(node, "value").equals("true")) {
            h2.\u00d800000().o00000(true);
        } else {
            h2.\u00d800000().o00000(false);
        }
    }

    private void \u00f4o0000(H h2, Node node) throws Exception {
        oooo_1 oooo_12;
        oooo_1 oooo_13;
        String string = NamenErsetzerKonverter.getInstance().korrigiere(this.getName(node), this.getVersionInt());
        o0oo_0 o0oo_02 = null;
        if (string.equals("helden.model.rasse.EigeneRasse")) {
            o0oo_02 = RassenFabrik.getRasseByID(this.\u00d4o0000(h2, node));
            if (o0oo_02 == null) {
                throw new Exception("Kenne die Erweiterung " + this.\u00d4o0000(h2, node) + " nicht!");
            }
        } else {
            if (string.startsWith("helden.model.rasse.DDZ")) {
                string = "helden.model.DDZRassen." + string.substring(22);
            }
            o0oo_02 = (o0oo_0)Class.forName(string).newInstance();
        }
        o0oo_02.setGeschlecht(h2.\u00d800000().\u00d300000());
        Node node2 = this.getRealChildren(node).get(0);
        int n = this.getIntValue(node2);
        o0oo_02.setGroesse(n);
        h2.\u00d800000().thissuper().\u00d300000(n);
        if (node2.getAttributes().getNamedItem("gewicht") != null) {
            h2.\u00d800000().thissuper().\u00d200000(this.new(node2, "gewicht"));
        } else {
            h2.\u00d800000().thissuper().\u00d200000(o0oo_02.getGewicht());
        }
        helden.framework.held.A.E e = new helden.framework.held.A.E(1, Monat.\u00f400000, 0, oooo_2.\u00d800000);
        h2.\u00d800000().thissuper().super(e);
        for (int i2 = 0; i2 < node.getChildNodes().getLength(); ++i2) {
            Node node3 = node.getChildNodes().item(i2);
            if (!"aussehen".equals(node3.getNodeName())) continue;
            h2.\u00d800000().thissuper().super(node3.getAttributes().getNamedItem("haarfarbe").getNodeValue());
            h2.\u00d800000().thissuper().class(node3.getAttributes().getNamedItem("augenfarbe").getNodeValue());
            if (node3.getAttributes().getNamedItem("alter") != null) {
                h2.\u00d800000().thissuper().\u00d400000(this.new(node3, "alter"));
            } else {
                h2.\u00d800000().thissuper().\u00d400000(o0oo_02.wurfeleAlter());
            }
            if (node3.getAttributes().getNamedItem("gbtag") != null) {
                String[] stringArray;
                String[] stringArray2;
                e.\u00d200000(this.new(node3, "gbtag"));
                e.o00000(Monat.get(this.new(node3, "gbmonat")));
                e.o00000(this.new(node3, "gbjahr"));
                if (node3.getAttributes().getNamedItem("kalender") != null) {
                    if (node3.getAttributes().getNamedItem("kalender").getNodeValue().equals("Bosperans Fall")) {
                        e.o00000(oooo_2.super("Bosparans Fall"));
                    } else {
                        e.o00000(oooo_2.super(node3.getAttributes().getNamedItem("kalender").getNodeValue()));
                    }
                }
                if (node3.getAttributes().getNamedItem("stand") != null) {
                    h2.\u00d800000().thissuper().\u00d400000(node3.getAttributes().getNamedItem("stand").getNodeValue());
                    h2.\u00d800000().thissuper().\u00d300000(node3.getAttributes().getNamedItem("titel").getNodeValue());
                    stringArray2 = new String[4];
                    for (int i3 = 0; i3 < 4; ++i3) {
                        stringArray2[i3] = node3.getAttributes().getNamedItem("aussehentext" + i3).getNodeValue();
                    }
                    h2.\u00d800000().thissuper().super(stringArray2);
                    stringArray = new String[6];
                    for (int i4 = 0; i4 < 6; ++i4) {
                        stringArray[i4] = node3.getAttributes().getNamedItem("familietext" + i4).getNodeValue();
                    }
                    h2.\u00d800000().thissuper().\u00d200000(stringArray);
                } else {
                    h2.\u00d800000().thissuper().\u00d400000("");
                    h2.\u00d800000().thissuper().\u00d300000("");
                    stringArray2 = new String[]{"", "", "", ""};
                    stringArray = new String[]{"", "", "", "", "", ""};
                    h2.\u00d800000().thissuper().super(stringArray2);
                    h2.\u00d800000().thissuper().\u00d200000(stringArray);
                }
            }
            if (node3.getAttributes().getNamedItem("gpstart") == null) continue;
            h2.\u00d800000().thissuper().super(this.new(node3, "gpstart"), this.new(node3, "gprest"));
        }
        if (h2.\u00d800000().thissuper().getHaarFarbe().equals("-") && (oooo_13 = o0oo_02.getHaarfarben().get(0)) != null) {
            h2.\u00d800000().thissuper().super(oooo_13.String());
        }
        if (h2.\u00d800000().thissuper().getAugenFarbe().equals("-") && (oooo_12 = o0oo_02.getAugenfarben().get(0)) != null) {
            h2.\u00d800000().thissuper().class(oooo_12.String());
        }
        this.o00000(node, o0oo_02);
        h2.o00000(o0oo_02);
    }

    private void Oo0000(H h2, Node node) {
        Settings settings = Settings.getSettingByName(this.getName(node));
        if (settings == null) {
            h2.o00000(Settings.getSettingByName("DSA 4.1 und Unter dem Westwind"));
        } else {
            for (Node node2 : this.getRealChildren(node)) {
                try {
                    settings.addIncludeSetting(this.getString(node2, "name"));
                }
                catch (Exception exception) {}
            }
            h2.o00000(settings);
        }
    }

    private void Stringsuper(H h2, Node node) throws Exception {
        Node node2;
        if (this.getName(node).equals("Talentspezialisierung E:Zauberei [Optimatik] (Metamagie)")) {
            return;
        }
        P p2 = this.getSonderfertigkeit(node);
        if (helden.framework.D.D.\u00d200000(p2) && (node2 = node.getAttributes().getNamedItem("probe")) != null) {
            helden.framework.D.D d2 = h2.\u00d800000().o00000(p2);
            d2.o00000(node2.getNodeValue());
            Node node3 = node.getAttributes().getNamedItem("dauer");
            d2.\u00d400000(node3.getNodeValue());
            Node node4 = node.getAttributes().getNamedItem("kosten");
            d2.\u00d200000(node4.getNodeValue());
            Node node5 = node.getAttributes().getNamedItem("wirkung");
            d2.Object(node5.getNodeValue());
        }
        if ((node2 = node.getAttributes().getNamedItem("kommentar")) != null) {
            h2.\u00d800000().Stringsuper().o00000(p2.toString(), node2.getNodeValue());
        }
        h2.o00000(p2, false);
    }

    private void \u00d8O0000(H h2, Node node) throws Exception {
        if (this.\u00d500000) {
            h2.\u00d800000().O\u00d30000().resetModifikationen();
            this.\u00d500000 = false;
        }
        String string = this.getName(node);
        String string2 = this.\u00d300000(node, "modtalentid");
        voidsuper voidsuper2 = !string2.equals("") ? N.floatsuper().super(string2) : N.floatsuper().\u00d200000(NamenErsetzerKonverter.getInstance().korrigiere(string, this.getVersionInt()));
        int n = this.getIntValue(node);
        T t = h2.\u00d800000().\u00f8O0000();
        t.super(voidsuper2, n);
        D d2 = this.if(node);
        h2.\u00d200000(voidsuper2, d2);
        Boolean bl = this.return(node);
        h2.\u00d200000((U)voidsuper2, bl);
        boolean bl2 = this.\u00d400000(node);
        if (bl2) {
            t.\u00d200000((oo0o_0)voidsuper2);
        }
    }

    private void thissuper(H h2, Node node) {
        for for_ = this.getVerbilligteSonderfertigkeit(node);
        h2.\u00d800000().\u00d800000().addGewahlteVerbilligteSonderfertigkeit(for_);
    }

    private void return(H h2, Node node) {
        helden.framework.held.A.String string = new helden.framework.held.A.String(this.getString(node, "name"), this.new(node, "so"), this.getString(node, "beschreibung"));
        h2.\u00d800000().\u00d4o0000().o00000(string);
    }

    private void \u00d800000(H h2, Node node) {
        Set<classsuper> set = classsuper.o00000(this.getIntValue(node));
        h2.\u00d800000().o00000(set);
    }

    private void \u00d4O0000(H h2, Node node) {
        public public_ = (public)this.getVorteil(node);
        Node node2 = node.getAttributes().getNamedItem("kommentar");
        if (node2 != null) {
            h2.\u00d800000().Stringsuper().o00000(public_.toString(), node2.getNodeValue());
        }
        h2.o00000(public_);
    }

    private void nullsuper(H h2, Node node) throws Exception {
        boolean bl;
        KonkreterZauber konkreterZauber = this.getZauber(node);
        L l2 = h2.\u00d800000().\u00d5o0000();
        int n = this.getIntValue(node);
        boolean bl2 = this.getHauszauber(node);
        Boolean bl3 = this.return(node);
        l2.super(konkreterZauber, n);
        l2.super(konkreterZauber, bl3);
        ZauberInfos zauberInfos = l2.\u00d600000(konkreterZauber);
        Node node2 = node.getAttributes().getNamedItem("anmerkungen");
        if (node2 != null) {
            String string = node.getAttributes().getNamedItem("anmerkungen").getNodeValue();
            if (string.startsWith(konkreterZauber.getQuelle())) {
                string = string.substring(konkreterZauber.getQuelle().length());
            }
            zauberInfos.setAnmerkungen(string);
            zauberInfos.setWirkungsdauer(node.getAttributes().getNamedItem("wirkungsdauer").getNodeValue());
            zauberInfos.setKosten(node.getAttributes().getNamedItem("kosten").getNodeValue());
            zauberInfos.setReichweite(node.getAttributes().getNamedItem("reichweite").getNodeValue());
            zauberInfos.setZauberdauer(node.getAttributes().getNamedItem("zauberdauer").getNodeValue());
            if (node.getAttributes().getNamedItem("zauberkommentar") != null) {
                zauberInfos.setKommentar(node.getAttributes().getNamedItem("zauberkommentar").getNodeValue());
            }
        }
        if (bl2) {
            l2.\u00d300000(konkreterZauber);
        }
        if (bl = this.\u00d400000(node)) {
            l2.\u00d200000((oo0o_0)konkreterZauber);
        }
        D d2 = this.if(node);
        h2.\u00d200000(konkreterZauber, d2);
    }

    private void \u00f800000(H h2, Node node) {
        Object object;
        Object object2;
        Object object3;
        int n;
        String string;
        int n2;
        String string2;
        int n3 = 0;
        if (node.getAttributes().getNamedItem("set") != null) {
            n3 = this.new(node, "set");
        }
        if ((string2 = this.getString(node, "name")).startsWith("nkwaffe")) {
            Object object4;
            n2 = Integer.parseInt(string2.substring(7));
            string = this.getString(node, "waffenname");
            if (O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d400000().o00000(string) == null) {
                return;
            }
            n = 0;
            if (node.getAttributes().getNamedItem("slot") != null) {
                n = this.new(node, "slot");
            }
            object3 = h2.\u00d800000().\u00d8o0000().\u00d300000(string)[n];
            object2 = this.getString(node, "bezeichner");
            object = (E)N.floatsuper().\u00d200000(this.getString(node, "talent"));
            Iterator<helden.framework.e.oooo_0> iterator = helden.framework.e.oooo_0.o00000((F)object3).iterator();
            helden.framework.e.oooo_0 oooo_02 = null;
            while (iterator.hasNext()) {
                object4 = iterator.next();
                if (!((helden.framework.e.oooo_0)object4).\u00d200000().thisString().equals(object2) || !((helden.framework.e.oooo_0)object4).o00000().equals(object)) continue;
                oooo_02 = object4;
                break;
            }
            if (oooo_02 == null) {
                return;
            }
            h2.\u00d800000().o00000(n3).\u00d200000(n2, (F)object3);
            h2.\u00d800000().o00000(n3).o00000(n2, oooo_02);
            object4 = ((A)h2.\u00d800000().o00000(n3).\u00f8O0000(n2).o00000(B.\u00d400000, 0)).o00000();
            if (node.getAttributes().getNamedItem("schild") != null) {
                h2.\u00d800000().o00000(n3).o00000(n2, this.new(node, "schild"));
            }
            if (node.getAttributes().getNamedItem("zweitwaffe") != null) {
                h2.\u00d800000().o00000(n3).\u00d200000(n2, this.new(node, "zweitwaffe"));
            }
            if (node.getAttributes().getNamedItem("bfmin") != null) {
                ((helden.framework.E.OoOO.D)object4).new(this.new(node, "bfmin"));
            }
            if (node.getAttributes().getNamedItem("bfakt") != null) {
                ((helden.framework.E.OoOO.D)object4).o00000(this.new(node, "bfakt"));
            }
            if (node.getAttributes().getNamedItem("hand") != null) {
                h2.\u00d800000().o00000(n3).o00000(n2, this.getString(node, "hand"));
            }
        }
        if (string2.startsWith("fkwaffe")) {
            n2 = Integer.parseInt(string2.substring(7));
            string = this.getString(node, "waffenname");
            if (O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d400000().o00000(string) == null) {
                return;
            }
            n = 0;
            if (node.getAttributes().getNamedItem("slot") != null) {
                n = this.new(node, "slot");
            }
            object3 = h2.\u00d800000().\u00d8o0000().\u00d300000(string)[n];
            h2.\u00d800000().o00000(n3).\u00d300000(n2, (F)object3);
            if (node.getAttributes().getNamedItem("talent") != null) {
                object2 = (E)N.floatsuper().\u00d200000(this.getString(node, "talent"));
                object = if.super((F)object3).get(0);
                ((if)object).super((E)object2);
                h2.\u00d800000().o00000(n3).o00000(n2, (if)object);
            }
        }
        if (string2.startsWith("schild")) {
            n2 = Integer.parseInt(string2.substring(6));
            string = this.getString(node, "schildname");
            if (O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d400000().o00000(string) == null) {
                return;
            }
            n = 0;
            if (node.getAttributes().getNamedItem("slot") != null) {
                n = this.new(node, "slot");
            }
            h2.\u00d800000().o00000(n3).o00000(n2, h2.\u00d800000().\u00d8o0000().\u00d300000(string)[n]);
            object3 = B.super(h2.\u00d800000().\u00d8o0000().\u00d300000(string)[n].float());
            if (node.getAttributes().getNamedItem("verwendungsArt") != null) {
                object3 = this.getString(node, "verwendungsArt");
            }
            h2.\u00d800000().o00000(n3).\u00d200000(n2, (String)object3);
        }
        if (string2.startsWith("ruestung")) {
            n2 = 0;
            if (node.getAttributes().getNamedItem("slot") != null) {
                n2 = this.new(node, "slot");
            }
            int n4 = Integer.parseInt(string2.substring(8));
            String string3 = NamenErsetzerKonverter.getInstance().korrigiere(this.getString(node, "ruestungsname"), this.getVersionInt());
            if (O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d400000().o00000(string3) == null) {
                return;
            }
            h2.\u00d800000().o00000(n3).String(n4, h2.\u00d800000().\u00d8o0000().\u00d300000(string3)[n2]);
        }
        if (string2.startsWith("jagtwaffe")) {
            h2.\u00d800000().o00000(n3).\u00d300000(this.new(node, "nummer"));
        }
        if (string2.startsWith("bk12")) {
            h2.\u00d800000().o00000(n3).\u00d200000(true);
        }
        if (string2.startsWith("bk34")) {
            h2.\u00d800000().o00000(n3).o00000(true);
        }
    }

    private void \u00d5O0000(H h2, Node node) {
        for (Node node2 : this.getRealChildren(node)) {
            helden.framework.A.A a2 = new helden.framework.A.A(this.\u00d300000(node2, "text") + this.\u00d300000(node2, "aktion"), (Object)this.\u00d300000(node2, "obj"), this.\u00d300000(node2, "kommentar"), Integer.valueOf(this.o00000(node2, b_0.\u00d4\u00f5\u00d2000.toString(), "0")), Integer.valueOf(this.o00000(node2, b_0.\u00d3\u00f4\u00d2000.toString(), "0")), Integer.valueOf(this.o00000(node2, "Abenteuerpunkte", "0")), Integer.valueOf(this.o00000(node2, b_0.\u00f4\u00f5\u00d2000.toString(), "0")), this.\u00d300000(node2, "Alt"), this.\u00d300000(node2, "Neu"));
            a2.\u00d800000().setTime(Long.valueOf(this.o00000(node2, "time", "0")));
            a2.\u00d500000(this.o00000(node2, "Info", ""));
            a2.o00000(true);
            a2.String(this.o00000(node2, "version", ""));
            h2.\u00d800000().\u00d8O0000().add(a2);
        }
    }

    private void \u00f8O0000(H h2, Node node) {
        for (int i2 = 0; i2 < node.getChildNodes().getLength(); ++i2) {
            Muenze muenze;
            if (!node.getChildNodes().item(i2).getNodeName().equals("muenze")) continue;
            Node node2 = node.getChildNodes().item(i2);
            String string = this.getString(node2, "name");
            String string2 = this.getString(node2, "waehrung");
            int n = this.new(node2, "anzahl");
            if (WaehrungsFabrik.getInstance().getWaehrungen(string2) == null || (muenze = WaehrungsFabrik.getInstance().getWaehrungen(string2).getMuenzen(string)) == null) continue;
            h2.\u00d800000().\u00f400000().putMuenze(muenze, n);
        }
    }

    private void \u00f5O0000(H h2, Node node) {
        try {
            String string = this.getString(node, "key");
            String string2 = this.getString(node, "kommentar");
            h2.\u00d800000().Stringsuper().o00000(string, string2);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void \u00f500000(H h2, Node node) {
        String[] stringArray = new String[]{"", "", "", "", "", "", "", "", "", "", "", ""};
        String string = "";
        for (int i2 = 0; i2 < 12; ++i2) {
            if (node.getAttributes().getNamedItem("notiz" + i2) == null || (string = node.getAttributes().getNamedItem("notiz" + i2).getNodeValue()) == null) continue;
            stringArray[i2] = string;
        }
        h2.\u00d800000().thissuper().\u00d300000(stringArray);
    }

    private void o00000(H h2, Node node) {
        for (Node node2 : a_0.o00000(node)) {
            String string = this.\u00d300000(node2, "name");
            String string2 = node2.getTextContent();
            h2.\u00d800000().\u00d4\u00d50000().put(string, string2);
        }
    }

    private void while(H h2, Node node) {
        for (int i2 = 0; i2 < node.getChildNodes().getLength(); ++i2) {
            if (node.getChildNodes().item(i2).getNodeName().startsWith("#")) continue;
            try {
                Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
                Element element = document.createElement("pluginExtension");
                element.appendChild(document.importNode(node.getChildNodes().item(i2), true));
                document.appendChild(element);
                h2.\u00d800000().o00000(document, node.getChildNodes().item(i2).getNodeName());
                continue;
            }
            catch (ParserConfigurationException parserConfigurationException) {
                parserConfigurationException.printStackTrace();
                continue;
            }
            catch (FactoryConfigurationError factoryConfigurationError) {
                factoryConfigurationError.printStackTrace();
            }
        }
    }

    private void \u00d5o0000(H h2, Node node) {
        try {
            Iterator<P> iterator = h2.\u00d800000().\u00f5O0000().null();
            while (iterator.hasNext()) {
                P p2 = iterator.next();
                if (!p2.toString().equals(this.getString(node, "sfname"))) continue;
                if (helden.framework.D.D.\u00d200000(p2)) {
                    helden.framework.D.D d2 = h2.\u00d800000().o00000(p2);
                    Node node2 = node.getAttributes().getNamedItem("probe");
                    if (node2 != null) {
                        d2.o00000(node2.getNodeValue());
                        Node node3 = node.getAttributes().getNamedItem("dauer");
                        d2.\u00d400000(node3.getNodeValue());
                        Node node4 = node.getAttributes().getNamedItem("kosten");
                        d2.\u00d200000(node4.getNodeValue());
                        Node node5 = node.getAttributes().getNamedItem("wirkung");
                        d2.Object(node5.getNodeValue());
                    }
                }
                break;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void o00000(Node node, OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        for (int i2 = 0; i2 < node.getChildNodes().getLength(); ++i2) {
            Node node2 = node.getChildNodes().item(i2);
            if (!node2.getNodeName().equals("variante")) continue;
            String string = NamenErsetzerKonverter.getInstance().korrigiere(this.getName(node2), this.getVersionInt());
            ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.waehleVariante(string);
        }
    }
}

