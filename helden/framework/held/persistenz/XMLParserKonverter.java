/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.persistenz;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.M;
import helden.framework.C.private;
import helden.framework.C.public;
import helden.framework.D.P;
import helden.framework.E.C.B;
import helden.framework.E.C.void;
import helden.framework.E.O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.E.OoOO.A;
import helden.framework.E.OoOO.C;
import helden.framework.E.OoOO.F;
import helden.framework.E.OoOO.null;
import helden.framework.E.OoOO.oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.Geschlecht;
import helden.framework.Monat;
import helden.framework.OOoO.K;
import helden.framework.OOoO.o00O;
import helden.framework.OoOO.D;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.U;
import helden.framework.OoOO.X;
import helden.framework.OoOO.voidsuper;
import helden.framework.geld.Muenze;
import helden.framework.geld.WaehrungsFabrik;
import helden.framework.held.L;
import helden.framework.held.Object.H;
import helden.framework.held.Object.super.OoOO;
import helden.framework.held.T;
import helden.framework.held.a.oooo_1;
import helden.framework.held.a.oooo_2;
import helden.framework.held.object.a_0;
import helden.framework.held.oooo_0;
import helden.framework.held.persistenz.NamenErsetzerKonverter;
import helden.framework.int.OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.int.OooO;
import helden.framework.int.String;
import helden.framework.int.o0oo_0;
import helden.framework.int.super;
import helden.framework.oooo.b_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oo0o_2;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.ZauberFabrik;
import helden.framework.zauber.ZauberInfos;
import helden.gui.allgemein.Utils;
import helden.gui.components.AuswahlPanel;
import java.beans.PropertyChangeSupport;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JDialog;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class XMLParserKonverter {
    private helden.gui.A \u00d200000;
    private PropertyChangeSupport int;
    private String \u00f400000;
    private Integer class;
    private boolean \u00d400000;
    private int \u00d800000;
    private int \u00f600000;
    private boolean \u00d600000;
    private OoOO \u00d300000;
    private String super;

    public XMLParserKonverter(helden.gui.A a2) {
        this.\u00d200000 = a2;
        this.int = new PropertyChangeSupport(this);
        this.int.addPropertyChangeListener(helden.gui.B.\u00d200000());
    }

    public ArrayList<OoOO> ladeHelden(File file) throws Exception {
        ArrayList<OoOO> arrayList = new ArrayList<OoOO>();
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        Object object = documentBuilderFactory.newDocumentBuilder();
        Document document = ((DocumentBuilder)object).parse(file);
        object = document.getElementsByTagName("helden");
        this.\u00f400000 = "";
        if (object.getLength() > 0 && object.item(0).getAttributes().getNamedItem("Version") != null) {
            this.\u00f400000 = object.item(0).getAttributes().getNamedItem("Version").getNodeValue();
        }
        if (this.\u00f400000.equals("") || this.\u00f400000.startsWith("5.")) {
            throw new Exception("Schon eine aktuelle Version! Keine Konvertierung m\u00f6glich!");
        }
        NodeList nodeList = document.getElementsByTagName("held");
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            this.\u00d300000 = new OoOO();
            Node node = nodeList.item(i2);
            this.int.firePropertyChange("value", new Integer(nodeList.getLength()), new Integer(i2));
            if (!node.getNodeName().startsWith("#")) {
                this.\u00d300000.o00000(node.getAttributes().getNamedItem("name").getNodeValue());
                try {
                    this.class(node);
                    Iterator<OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> iterator = this.\u00d300000.\u00d500000().newnew();
                    while (iterator.hasNext()) {
                        OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = iterator.next();
                        while (ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.hatMehrSprachenAuswahl()) {
                            oo0o_2 oo0o_22 = ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.getNextSprachAuswahl();
                            ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.addSpracheAuswahl(this.super(oo0o_22.o00000(), oo0o_22.return() + "\n\n" + "Helden: " + this.\u00d300000.new() + "\n" + "Quelle: " + ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.toString() + "\n"));
                        }
                    }
                }
                catch (Exception exception) {
                    System.err.println(this.super);
                    this.\u00d300000.new("Fehler: " + exception.getMessage());
                    exception.printStackTrace();
                }
            }
            arrayList.add(this.\u00d300000);
        }
        return arrayList;
    }

    private void class(Node node) throws Exception {
        NodeList nodeList = node.getChildNodes();
        H h2 = a_0.class().\u00d400000();
        this.super = null;
        this.\u00d400000 = true;
        this.\u00d600000 = true;
        try {
            Node node2;
            int n;
            Node node3 = node.getAttributes().getNamedItem("name");
            this.super = node3.getNodeValue() + " (DSA 4.0)";
            Node node4 = node.getAttributes().getNamedItem("key");
            long l2 = System.currentTimeMillis();
            if (node4 != null) {
                l2 = Long.parseLong(node4.getNodeValue());
            }
            h2.o00000(this.super);
            h2.\u00d800000().o00000(l2);
            int n2 = 0;
            for (n = 0; n < nodeList.getLength(); ++n) {
                node2 = nodeList.item(n);
                if (node2.getNodeName().equals("ausbildung")) {
                    n2 = Math.max(n2, 1);
                }
                if (!node2.getNodeName().equals("ausbildungen")) continue;
                n2 = Math.max(n2, 2);
            }
            for (n = 0; n < nodeList.getLength(); ++n) {
                block34: {
                    node2 = nodeList.item(n);
                    if (node2.getNodeName().equals("geschlecht")) {
                        this.\u00d300000(h2, node2);
                    }
                    if (node2.getNodeName().equals("nscSchmide")) {
                        this.\u00d200000(h2, node2);
                    }
                    if (node2.getNodeName().equals("rasse")) {
                        this.voidsuper(h2, node2);
                    }
                    if (node2.getNodeName().equals("kultur")) {
                        this.Oo0000(h2, node2);
                    }
                    if (node2.getNodeName().startsWith("profession") && n2 == 0) {
                        this.\u00d300000.new("Das Format ist zu alt.");
                        this.\u00d300000.new("Bitte die Datei erstmal miteiner aktuellen 4.7.x Version einlesen");
                        this.\u00d300000.new("und anschlie\u00dfend speichern.");
                        return;
                    }
                    if (node2.getNodeName().equals("ausbildung") && n2 == 1) {
                        this.super(h2, node2);
                    }
                    if (node2.getNodeName().equals("ausbildungen") && n2 == 2) {
                        this.\u00d400000(h2, node2);
                    }
                    if (node2.getNodeName().startsWith("goettergeschenk")) {
                        this.\u00d800000(h2, node2);
                    }
                    if (node2.getNodeName().equals("eingegeben")) {
                        h2.\u00d800000().\u00f8\u00d20000();
                    }
                    if (node2.getNodeName().equals("portraet")) {
                        this.\u00d6O0000(h2, node2);
                    }
                    if (node2.getNodeName().equals("abenteuerpunkte")) {
                        this.class(h2, node2);
                    }
                    if (node2.getNodeName().equals("gilde")) {
                        this.\u00f8O0000(h2, node2);
                    }
                    if (node2.getNodeName().equals("freieabenteuerpunkte")) {
                        this.Objectsuper(h2, node2);
                    }
                    if (node2.getNodeName().equals("eigenschaft")) {
                        this.\u00f800000(h2, node2);
                    }
                    if (node2.getNodeName().equals("vorteil")) {
                        this.\u00d2O0000(h2, node2);
                    }
                    if (node2.getNodeName().equals("sonderfertigkeit")) {
                        this.\u00d8O0000(h2, node2);
                    }
                    if (node2.getNodeName().equals("verbilligtesonderfertigkeit")) {
                        this.\u00d4O0000(h2, node2);
                    }
                    if (node2.getNodeName().equals("talent")) {
                        this.interface(h2, node2);
                    }
                    if (node2.getNodeName().equals("zauber")) {
                        this.\u00f6O0000(h2, node2);
                    }
                    if (node2.getNodeName().equals("kampfwerte")) {
                        try {
                            this.do(h2, node2);
                        }
                        catch (Exception exception) {
                            if (exception instanceof oooo_0) break block34;
                            this.\u00d300000.new("Fehler beim Setzen der Kampfwerte");
                        }
                    }
                }
                if (node2.getNodeName().equals("notiz")) {
                    this.\u00f400000(h2, node2);
                }
                if (node2.getNodeName().equals("gegenstand")) {
                    this.int(h2, node2);
                }
                if (node2.getNodeName().equals("verbindung")) {
                    this.\u00d600000(h2, node2);
                }
                if (node2.getNodeName().equals("ausruestungneu")) {
                    this.\u00f600000(h2, node2);
                }
                if (node2.getNodeName().equals("extention")) {
                    this.OO0000(h2, node2);
                }
                if (node2.getNodeName().equals("geldboerse")) {
                    this.\u00f4O0000(h2, node2);
                }
                if (!node2.getNodeName().equals("ereignisse")) continue;
                this.\u00d3O0000(h2, node2);
            }
            n = h2.o00000();
            h2.\u00d800000().thissuper().\u00d400000(n);
        }
        catch (Exception exception) {
            System.err.println(this.super);
            exception.printStackTrace();
            throw new Exception(exception.getMessage());
        }
        this.\u00d300000.o00000(h2.\u00d800000());
    }

    private String \u00d300000(Node node, String string) {
        return this.super(node, string, "");
    }

    private String super(Node node, String string, String string2) {
        if (node.getAttributes().getNamedItem(string) == null) {
            return string2;
        }
        return node.getAttributes().getNamedItem(string).getNodeValue();
    }

    private <G> G super(ArrayList<G> arrayList, String string) {
        AuswahlPanel<G> auswahlPanel = new AuswahlPanel<G>(arrayList, string, 1);
        JDialog jDialog = new JDialog(this.\u00d200000, "Konverter", true);
        auswahlPanel.getController().setDialog(jDialog);
        jDialog.getContentPane().add(auswahlPanel);
        jDialog.setSize(600, 400);
        Utils.zentriere(jDialog);
        jDialog.setVisible(true);
        return auswahlPanel.getAusgewaelteVarianteimPanelList().get(0);
    }

    private int \u00d300000(Node node) {
        Node node2 = node.getAttributes().getNamedItem("grossemeditation");
        if (node2 != null) {
            String string = node2.getNodeValue();
            return Integer.parseInt(string);
        }
        return 0;
    }

    private boolean \u00f400000(Node node) {
        String string = this.\u00d200000(node, "hauszauber");
        return Boolean.valueOf(string);
    }

    private int super(Node node, String string) {
        return Integer.parseInt(this.\u00d200000(node, string));
    }

    private int super(Node node) {
        return Integer.parseInt(this.\u00f800000(node));
    }

    private int OO0000(Node node) {
        Node node2 = node.getAttributes().getNamedItem("karmalqueste");
        if (node2 != null) {
            String string = node2.getNodeValue();
            return Integer.parseInt(string);
        }
        return 0;
    }

    private boolean \u00d200000(Node node) {
        Node node2 = node.getAttributes().getNamedItem("leittalent");
        if (node2 != null) {
            String string = node2.getNodeValue();
            return Boolean.valueOf(string);
        }
        return false;
    }

    private String \u00d2O0000(Node node) {
        return this.\u00d200000(node, "name");
    }

    private int do(Node node) {
        Node node2 = node.getAttributes().getNamedItem("permanent");
        if (node2 != null) {
            String string = node2.getNodeValue();
            return Integer.parseInt(string);
        }
        return 0;
    }

    private ArrayList<Node> int(Node node) {
        ArrayList<Node> arrayList = new ArrayList<Node>();
        for (int i2 = 0; i2 < node.getChildNodes().getLength(); ++i2) {
            Node node2 = node.getChildNodes().item(i2);
            if (node2.getNodeName().startsWith("#")) continue;
            arrayList.add(node2);
        }
        return arrayList;
    }

    private K \u00d400000(Node node) {
        String string = this.\u00d200000(node, "repraesentation");
        K k2 = K.super(string);
        return k2;
    }

    private Boolean \u00d600000(Node node) {
        Node node2 = node.getAttributes().getNamedItem("se");
        if (node2 != null) {
            String string = node2.getNodeValue();
            return Boolean.valueOf(string);
        }
        return new Boolean(false);
    }

    private int \u00f600000(Node node) {
        Node node2 = node.getAttributes().getNamedItem("startwert");
        if (node2 != null) {
            String string = node2.getNodeValue();
            return Integer.parseInt(string);
        }
        return 0;
    }

    private String \u00d200000(Node node, String string) {
        return node.getAttributes().getNamedItem(string).getNodeValue();
    }

    private String \u00f800000(Node node) {
        return this.\u00d200000(node, "value");
    }

    private String \u00d800000(Node node) {
        Node node2 = node.getAttributes().getNamedItem("variante");
        if (node2 == null) {
            return "";
        }
        return this.\u00d200000(node, "variante");
    }

    private void class(H h2, Node node) {
        int n = this.super(node);
        h2.\u00d600000(n);
    }

    private void super(H h2, Node node) throws Exception {
        this.super(h2, node, null);
    }

    private void \u00d400000(H h2, Node node) throws Exception {
        for (Node node2 : this.int(node)) {
            Object object;
            Node node3;
            String._o _o2 = String._o.valueOf(this.\u00d200000(node2, "art"));
            String string = this.\u00d2O0000(node2);
            for (int i2 = 0; i2 < node.getChildNodes().getLength(); ++i2) {
                node3 = node.getChildNodes().item(i2);
                if (!node3.getNodeName().equals("variante")) continue;
                object = this.\u00d2O0000(node3);
                String string2 = string + "#" + (String)object;
                if (NamenErsetzerKonverter.getInstance().korrigiere(string2, this.class) == string2) continue;
                string = NamenErsetzerKonverter.getInstance().korrigiere(string2, this.class);
            }
            super super_ = (super)Class.forName(string).newInstance();
            this.super(node2, super_);
            super_.setGeschlecht(h2.\u00d800000().\u00d300000());
            ArrayList<Node> arrayList = this.int(node2);
            if (arrayList.size() > 0 && (node3 = arrayList.get(0)).getNodeName().equals("modifikation")) {
                object = b_0.\u00f400000(this.\u00d2O0000(node3));
                super_.setzeModifizierteEigenschaft((b_0)object);
            }
            h2.\u00d800000().\u00d800000().o00000(_o2, super_);
        }
    }

    private void super(H h2, Node node, String._o _o2) throws Exception {
        String string = node.getNodeName();
        if (string.equals("ausbildung")) {
            ArrayList<Node> arrayList = this.int(node);
            if (arrayList.size() != 1) {
                helden.framework.held.Object.private.\u00d200000("Fehler beim Einlesen. childs.size=" + arrayList.size(), "sven");
            }
            this.super(h2, arrayList.get(0), _o2);
        } else if (string.equals("breitgefaechertebildung")) {
            int n = this.int(node).size();
            this.super(h2, this.int(node).get(0), null);
            if (n > 1) {
                this.super(h2, this.int(node).get(1), String._o.\u00d500000);
            }
            if (n > 2) {
                this.super(h2, this.int(node).get(2), String._o.\u00d500000);
            }
        } else if (string.equals("magischeweiterbildung")) {
            int n = this.int(node).size();
            this.super(h2, this.int(node).get(0), null);
            if (n > 1) {
                this.super(h2, this.int(node).get(1), String._o.\u00d800000);
            }
            if (n > 2) {
                this.super(h2, this.int(node).get(2), String._o.\u00d800000);
            }
            if (n > 3) {
                this.super(h2, this.int(node).get(3), String._o.\u00d800000);
            }
        } else if (string.equals("spaetweihe")) {
            this.super(h2, this.int(node).get(0), null);
            this.super(h2, this.int(node).get(1), String._o.\u00d200000);
        } else if (string.equals("profession")) {
            super super_;
            Object object;
            Node node2;
            String string2 = this.\u00d2O0000(node);
            if (NamenErsetzerKonverter.getInstance().korrigiere(string2, this.class) != null) {
                string2 = NamenErsetzerKonverter.getInstance().korrigiere(string2, this.class);
            }
            try {
                for (int i2 = 0; i2 < node.getChildNodes().getLength(); ++i2) {
                    node2 = node.getChildNodes().item(i2);
                    if (!node2.getNodeName().equals("variante")) continue;
                    object = this.\u00d2O0000(node2);
                    String string3 = string2 + "#" + (String)object;
                    if (NamenErsetzerKonverter.getInstance().korrigiere(string3, this.class) == string3) continue;
                    string2 = NamenErsetzerKonverter.getInstance().korrigiere(string3, this.class);
                }
                super_ = (super)Class.forName(string2).newInstance();
                this.super(node, super_);
            }
            catch (ClassNotFoundException classNotFoundException) {
                this.\u00d300000.new("Profession " + string2 + " nicht gefunden.");
                throw classNotFoundException;
            }
            super_.setGeschlecht(h2.\u00d800000().\u00d300000());
            ArrayList<Node> arrayList = this.int(node);
            if (arrayList.size() > 0 && (node2 = arrayList.get(0)).getNodeName().equals("modifikation")) {
                object = b_0.\u00f400000(this.\u00d2O0000(node2));
                super_.setzeModifizierteEigenschaft((b_0)object);
            }
            if (_o2 == null) {
                _o2 = String._o.\u00d300000;
            }
            h2.\u00d800000().\u00d800000().o00000(_o2, super_);
        } else {
            helden.framework.held.Object.private.\u00d200000("Unbekanntes XML-Element " + string, "sven");
        }
    }

    private void \u00d6O0000(H h2, Node node) {
        h2.\u00d800000().o00000(node.getAttributes().getNamedItem("value").getNodeValue());
    }

    private void \u00f800000(H h2, Node node) throws Exception {
        int n;
        String string = this.\u00d2O0000(node);
        if (string.equals("at") || string.equals("pa") || string.equals("ini") || string.equals("fk")) {
            return;
        }
        b_0 b_02 = b_0.\u00f400000(string);
        int n2 = this.super(node);
        h2.\u00d200000(b_02, n2);
        Boolean bl = this.\u00d600000(node);
        h2.\u00d200000((U)b_02, bl);
        if (b_02.publicString()) {
            n = this.\u00f600000(node);
            if (n > 0) {
                h2.\u00d300000(b_02, n);
            } else {
                h2.\u00d300000(b_02, n2);
            }
        }
        h2.o00000(b_02, this.do(node));
        if (b_02.equals(b_0.\u00f4\u00f5\u00d2000)) {
            n = this.\u00d300000(node);
            h2.\u00d800000().\u00d3\u00d30000().\u00d300000(n);
        }
        if (b_02.equals(b_0.\u00d4\u00f5\u00d2000)) {
            n = this.OO0000(node);
            h2.\u00d800000().\u00d3\u00d30000().class(n);
            if (node.getAttributes().getNamedItem("karmalqueste") == null) {
                h2.\u00d800000().\u00d3\u00d30000().class(n2);
                h2.\u00d200000(b_02, 0);
            }
        }
    }

    private void Objectsuper(H h2, Node node) {
        int n = this.super(node);
        h2.\u00d800000(n);
    }

    private void \u00d300000(H h2, Node node) {
        String string = this.\u00d2O0000(node);
        Geschlecht geschlecht = Geschlecht.getGeschlecht(string);
        h2.o00000(geschlecht);
    }

    private void \u00f8O0000(H h2, Node node) {
        h2.\u00d800000().\u00d800000(this.\u00d2O0000(node));
    }

    private void \u00d800000(H h2, Node node) throws Exception {
        ArrayList<Node> arrayList = this.int(node);
        if (arrayList.size() > 0) {
            Node node2 = arrayList.get(0);
            b_0 b_02 = b_0.\u00f400000(this.\u00d2O0000(node2));
            h2.\u00d800000().privatesuper().setzeModifizierteEigenschaft(b_02);
        }
    }

    private void int(H h2, Node node) {
        try {
            String string = NamenErsetzerKonverter.getInstance().korrigiere(this.\u00d200000(node, "name"), this.class);
            if (O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d400000().o00000(string) != null) {
                helden.framework.E.F f2 = O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d400000().o00000(string).\u00f400000();
                f2.Object(this.super(node, "anzahl"));
                int n = 0;
                if (node.getAttributes().getNamedItem("slot") != null) {
                    n = this.super(node, "slot");
                }
                if (node.hasChildNodes()) {
                    for (int i2 = 0; i2 < node.getChildNodes().getLength(); ++i2) {
                        helden.framework.E.G g2;
                        Node node2 = node.getChildNodes().item(i2);
                        if (node2.getNodeName().equals("Nahkampfwaffe")) {
                            g2 = (helden.framework.E.C.A)f2.o00000(helden.framework.E.B.\u00d400000, 0);
                            this.super((helden.framework.E.C.A)g2, node2);
                        }
                        if (node2.getNodeName().equals("Fernkampfwaffe")) {
                            g2 = (helden.framework.E.C.E)f2.o00000(helden.framework.E.B.class, 0);
                            this.super((helden.framework.E.C.E)g2, node2);
                        }
                        if (node2.getNodeName().equals("Schild")) {
                            f2.o00000(helden.framework.E.B.\u00d300000, 0);
                            g2 = (void)f2.o00000(helden.framework.E.B.\u00d300000, 0);
                            this.super((void)g2, node2);
                        }
                        if (node2.getNodeName().equals("R\u00fcstung")) {
                            f2.o00000(helden.framework.E.B.OO0000, 0);
                            g2 = (B)f2.o00000(helden.framework.E.B.OO0000, 0);
                            this.super((B)g2, node2);
                        }
                        if (!node2.getNodeName().equals("modallgemein")) continue;
                        this.super(f2, node2);
                    }
                }
                h2.\u00d800000().\u00d8o0000().new(f2, n);
            }
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            System.err.println(this.super);
            cloneNotSupportedException.printStackTrace();
        }
    }

    private void do(H h2, Node node) throws Exception {
        if (this.\u00d400000) {
            h2.\u00d3O0000();
            this.\u00d400000 = false;
            this.\u00d800000 = h2.\u00d800000().\u00d3\u00d30000().int();
            this.\u00f600000 = h2.\u00d800000().\u00d3\u00d30000().\u00d600000();
        }
        String string = this.\u00d2O0000(node);
        E e = (E)N.floatsuper().\u00d200000(string);
        ArrayList<Node> arrayList = this.int(node);
        Node node2 = arrayList.get(0);
        int n = this.super(node2);
        int n2 = 0;
        if (e.o\u00d80000()) {
            Node node3 = arrayList.get(1);
            n2 = this.super(node3);
            int n3 = Math.min(this.\u00d800000, this.\u00f600000);
            int n4 = Math.max(n, n2);
            for (int i2 = n3; i2 < n4; ++i2) {
                if (i2 < n) {
                    h2.\u00d200000(e, i2 + 1);
                }
                if (i2 >= n2) continue;
                h2.o00000(e, i2 + 1);
            }
        } else {
            h2.\u00d200000(e, n);
        }
    }

    private void Oo0000(H h2, Node node) throws Exception {
        String string;
        String string2 = this.\u00d2O0000(node);
        if (string2.equals("helden.model.kultur.Schelm")) {
            string2 = this.\u00d200000(node, "ursprung");
        }
        if (string2.equals("helden.model.kultur.Yaquirien")) {
            string2 = "helden.model.kultur.Mittelreich";
        }
        OooO oooO2 = (OooO)Class.forName(string2).newInstance();
        Node node2 = node.getAttributes().getNamedItem("sprache");
        if (node2 != null) {
            string = node2.getNodeValue();
            oooO2.setzeMuttersprache((G)N.floatsuper().\u00d200000(string));
        }
        if ((node2 = node.getAttributes().getNamedItem("schrift")) != null) {
            string = node2.getNodeValue();
            oooO2.setzeMuttersSchriftSrache((G)N.floatsuper().\u00d200000(string));
        }
        int n = 0;
        while (node.getAttributes().getNamedItem("zweitsprache" + n) != null) {
            ArrayList<G> arrayList = oooO2.getZweitLehrsprache();
            if (arrayList == null) {
                arrayList = new ArrayList();
                oooO2.setZweitLehrsprache(arrayList);
            }
            String string3 = node.getAttributes().getNamedItem("zweitsprache" + n).getNodeValue();
            arrayList.add((G)N.floatsuper().\u00d200000(string3));
            ++n;
        }
        oooO2.setGeschlecht(h2.\u00d800000().\u00d300000());
        this.super(node, oooO2);
        h2.o00000(oooO2);
    }

    private void \u00d200000(H h2, Node node) {
        if (this.\u00d200000(node, "value").equals("true")) {
            h2.\u00d800000().o00000(true);
        } else {
            h2.\u00d800000().o00000(false);
        }
    }

    private void voidsuper(H h2, Node node) throws Exception {
        oooo_1 oooo_12;
        oooo_1 oooo_13;
        String string = this.\u00d2O0000(node);
        o0oo_0 o0oo_02 = (o0oo_0)Class.forName(string).newInstance();
        o0oo_02.setGeschlecht(h2.\u00d800000().\u00d300000());
        Node node2 = this.int(node).get(0);
        int n = this.super(node2);
        o0oo_02.setGroesse(n);
        h2.\u00d800000().thissuper().\u00d300000(n);
        if (node2.getAttributes().getNamedItem("gewicht") != null) {
            h2.\u00d800000().thissuper().\u00d200000(this.super(node2, "gewicht"));
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
            if (node3.getAttributes().getNamedItem("gbtag") != null) {
                String[] stringArray;
                String[] stringArray2;
                e.\u00d200000(this.super(node3, "gbtag"));
                e.o00000(Monat.get(this.super(node3, "gbmonat")));
                e.o00000(this.super(node3, "gbjahr"));
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
            h2.\u00d800000().thissuper().super(this.super(node3, "gpstart"), this.super(node3, "gprest"));
        }
        if (h2.\u00d800000().thissuper().getHaarFarbe().equals("-") && (oooo_13 = o0oo_02.getHaarfarben().get(0)) != null) {
            h2.\u00d800000().thissuper().super(oooo_13.String());
        }
        if (h2.\u00d800000().thissuper().getAugenFarbe().equals("-") && (oooo_12 = o0oo_02.getAugenfarben().get(0)) != null) {
            h2.\u00d800000().thissuper().class(oooo_12.String());
        }
        this.super(node, o0oo_02);
        h2.o00000(o0oo_02);
    }

    private void \u00d8O0000(H h2, Node node) throws Exception {
        P p2;
        Object object;
        Object object2;
        Object object3;
        Node node2;
        Object object4;
        String string = NamenErsetzerKonverter.getInstance().korrigiere(this.\u00d200000(node, "name"), this.class);
        if (string.startsWith("Talentspezialisierung")) {
            object4 = this.int(node);
            node2 = ((ArrayList)object4).get(0);
            object3 = this.\u00d2O0000(node2);
            object2 = N.floatsuper().\u00d200000((String)object3);
            object = (Node)((ArrayList)object4).get(1);
            String string2 = this.\u00d2O0000((Node)object);
            p2 = helden.framework.D.K.o00000((oo0o_0)object2, string2);
        } else if (string.startsWith("Zauberspezialisierung")) {
            object4 = this.int(node);
            node2 = ((ArrayList)object4).get(0);
            object3 = KonkreterZauber.getZauber(this.\u00d2O0000(node2), this.\u00d400000(node2), this.\u00d200000(node2, "variante"));
            object2 = (Node)((ArrayList)object4).get(1);
            object = this.\u00d2O0000((Node)object2);
            p2 = helden.framework.D.K.new((oo0o_0)object3, (String)object, true);
        } else {
            try {
                p2 = helden.framework.d.oooo_0.o00000(string);
            }
            catch (RuntimeException runtimeException) {
                this.\u00d300000.new("Sonderfertigkeit " + string + " wurde entfernt.");
                return;
            }
        }
        if (helden.framework.D.D.\u00d200000(p2)) {
            object4 = h2.\u00d800000().o00000(p2);
            node2 = node.getAttributes().getNamedItem("probe");
            if (node2 != null) {
                ((helden.framework.D.D)object4).o00000(node2.getNodeValue());
                object3 = node.getAttributes().getNamedItem("dauer");
                ((helden.framework.D.D)object4).\u00d400000(object3.getNodeValue());
                object2 = node.getAttributes().getNamedItem("kosten");
                ((helden.framework.D.D)object4).\u00d200000(object2.getNodeValue());
                object = node.getAttributes().getNamedItem("wirkung");
                ((helden.framework.D.D)object4).Object(object.getNodeValue());
            }
        }
        if ((object4 = node.getAttributes().getNamedItem("kommentar")) != null) {
            h2.\u00d800000().Stringsuper().o00000(p2.toString(), object4.getNodeValue());
        }
        h2.o00000(p2, false);
    }

    private void interface(H h2, Node node) throws Exception {
        if (this.\u00d600000) {
            h2.\u00d800000().O\u00d30000().resetModifikationen();
            this.\u00d600000 = false;
        }
        String string = NamenErsetzerKonverter.getInstance().korrigiere(this.\u00d2O0000(node), this.class);
        voidsuper voidsuper2 = N.floatsuper().\u00d200000(string);
        int n = this.super(node);
        T t = h2.\u00d800000().\u00f8O0000();
        t.super(voidsuper2, n);
        h2.\u00d200000(voidsuper2, D.Object);
        Boolean bl = this.\u00d600000(node);
        h2.\u00d200000((U)voidsuper2, bl);
        boolean bl2 = this.\u00d200000(node);
        if (bl2) {
            t.\u00d200000((oo0o_0)voidsuper2);
        }
    }

    private void \u00d4O0000(H h2, Node node) {
    }

    private void \u00d600000(H h2, Node node) {
        helden.framework.held.A.String string = new helden.framework.held.A.String(this.\u00d200000(node, "name"), this.super(node, "so"), this.\u00d200000(node, "beschreibung"));
        h2.\u00d800000().\u00d4o0000().o00000(string);
    }

    private void \u00d2O0000(H h2, Node node) {
        Object object;
        public public_;
        String string = this.\u00d2O0000(node);
        if (string.equals("Herauragende Balance")) {
            string = "Herausragende Balance";
        }
        if (string.equals("Eidetisches Ged\u00e4chtniss")) {
            string = "Eidetisches Ged\u00e4chtnis";
        }
        if (string.equals("Geweiht [Angrosch oder Gravesh]")) {
            string = "Geweiht [Angrosch]";
        }
        if (string.equals("Geweiht [nicht-alveransische Gottheit]")) {
            string = "Geweiht [nicht-alveranische Gottheit]";
        }
        if ((public_ = helden.framework.C.K.o00000(string)) instanceof J) {
            object = (J)public_;
            int n = 0;
            n = public_.toString().equals("Prinzipientreue") ? 10 : (public_.toString().equals("Schulden") ? 1000 : (public_.toString().equals("Schnelle Heilung") ? 2 : (public_.toString().equals("Schlafst\u00f6rungen") ? 1 : this.super(node))));
            ((J)object).oO0000(n);
        }
        if (public_ instanceof M) {
            Object object2;
            object = (M)public_;
            ((private)object).\u00d2o0000();
            String string2 = this.\u00f800000(node);
            try {
                object2 = N.floatsuper().\u00d200000(string2);
                ((M)object).o00000(object2);
            }
            catch (X x) {
                try {
                    oo0o_0 oo0o_02;
                    string2 = NamenErsetzerKonverter.getInstance().korrigiere(string2, this.class);
                    if (public_.equals(I.O\u00d6o000)) {
                        oo0o_02 = ZauberFabrik.getInstance().getZauberfertigkeit(string2);
                    } else {
                        oo0o_02 = KonkreterZauber.getZauber(string2, K.\u00d400000, "");
                        if (oo0o_02 == null) {
                            throw new X(string2);
                        }
                    }
                    ((M)object).o00000(oo0o_02);
                }
                catch (X x2) {
                    try {
                        b_0 b_02 = b_0.\u00f400000(string2);
                        ((M)object).o00000(b_02);
                    }
                    catch (X x3) {
                        try {
                            o00O o00O2 = o00O.\u00d200000(string2);
                            ((M)object).o00000(o00O2);
                        }
                        catch (X x4) {
                            try {
                                P p2 = helden.framework.d.oooo_0.\u00f500000().get(string2);
                                if (p2 != null) {
                                    ((M)object).o00000(helden.framework.d.oooo_0.o00000(string2));
                                } else {
                                    try {
                                        ((M)object).o00000(string2);
                                    }
                                    catch (Exception exception) {
                                        this.\u00d300000.new("Vorteil: " + string + " konnte mit " + string2 + " werden und wurde entfernt.");
                                    }
                                }
                            }
                            catch (X x5) {
                                ((M)object).o00000(string2);
                            }
                        }
                    }
                }
            }
            object2 = node.getAttributes().getNamedItem("kommentar");
            if (object2 != null) {
                h2.\u00d800000().Stringsuper().o00000(public_.toString(), object2.getNodeValue());
            }
        } else {
            object = node.getAttributes().getNamedItem("kommentar");
            if (object != null) {
                h2.\u00d800000().Stringsuper().o00000(public_.toString(), object.getNodeValue());
            }
        }
        h2.o00000(public_);
    }

    private void \u00f6O0000(H h2, Node node) throws Exception {
        String string = NamenErsetzerKonverter.getInstance().korrigiere(this.\u00d2O0000(node), this.class);
        KonkreterZauber konkreterZauber = KonkreterZauber.getZauber(string, this.\u00d400000(node), this.\u00d800000(node));
        L l2 = h2.\u00d800000().\u00d5o0000();
        int n = this.super(node);
        boolean bl = this.\u00f400000(node);
        Boolean bl2 = this.\u00d600000(node);
        l2.super(konkreterZauber, n);
        l2.super(konkreterZauber, bl2);
        ZauberInfos zauberInfos = l2.\u00d600000(konkreterZauber);
        Node node2 = node.getAttributes().getNamedItem("anmerkungen");
        if (node2 != null) {
            String string2 = node.getAttributes().getNamedItem("anmerkungen").getNodeValue();
            if (string2.startsWith(konkreterZauber.getQuelle())) {
                string2 = string2.substring(konkreterZauber.getQuelle().length());
            }
            zauberInfos.setAnmerkungen(string2);
            zauberInfos.setWirkungsdauer(node.getAttributes().getNamedItem("wirkungsdauer").getNodeValue());
            zauberInfos.setKosten(node.getAttributes().getNamedItem("kosten").getNodeValue());
            zauberInfos.setReichweite(node.getAttributes().getNamedItem("reichweite").getNodeValue());
            zauberInfos.setZauberdauer(node.getAttributes().getNamedItem("zauberdauer").getNodeValue());
            if (node.getAttributes().getNamedItem("zauberkommentar") != null) {
                zauberInfos.setKommentar(node.getAttributes().getNamedItem("zauberkommentar").getNodeValue());
            }
        }
        if (bl) {
            l2.\u00d300000(konkreterZauber);
        }
    }

    private void \u00f600000(H h2, Node node) {
    }

    private void \u00d3O0000(H h2, Node node) {
        for (Node node2 : this.int(node)) {
            helden.framework.A.A a2 = new helden.framework.A.A(this.\u00d300000(node2, "text") + this.\u00d300000(node2, "aktion"), (Object)this.\u00d300000(node2, "obj"), this.\u00d300000(node2, "kommentar"), Integer.valueOf(this.super(node2, b_0.\u00d4\u00f5\u00d2000.toString(), "0")), Integer.valueOf(this.super(node2, b_0.\u00d3\u00f4\u00d2000.toString(), "0")), Integer.valueOf(this.super(node2, "Abenteuerpunkte", "0")), Integer.valueOf(this.super(node2, b_0.\u00f4\u00f5\u00d2000.toString(), "0")), this.\u00d300000(node2, "Alt"), this.\u00d300000(node2, "Neu"));
            a2.\u00d800000().setTime(Long.valueOf(this.super(node2, "time", "0")));
            a2.\u00d500000(this.super(node2, "Info", ""));
            a2.o00000(true);
            h2.\u00d800000().\u00d8O0000().add(a2);
        }
    }

    private void \u00f4O0000(H h2, Node node) {
        for (int i2 = 0; i2 < node.getChildNodes().getLength(); ++i2) {
            Muenze muenze;
            if (!node.getChildNodes().item(i2).getNodeName().equals("muenze")) continue;
            Node node2 = node.getChildNodes().item(i2);
            String string = this.\u00d200000(node2, "name");
            String string2 = this.\u00d200000(node2, "waehrung");
            int n = this.super(node2, "anzahl");
            if (WaehrungsFabrik.getInstance().getWaehrungen(string2) == null || (muenze = WaehrungsFabrik.getInstance().getWaehrungen(string2).getMuenzen(string)) == null) continue;
            h2.\u00d800000().\u00f400000().putMuenze(muenze, n);
        }
    }

    private void \u00f400000(H h2, Node node) {
        String[] stringArray = new String[]{"", "", "", "", "", "", "", "", "", "", "", ""};
        String string = "";
        for (int i2 = 0; i2 < 12; ++i2) {
            string = node.getAttributes().getNamedItem("notiz" + i2).getNodeValue();
            if (string == null) continue;
            stringArray[i2] = string;
        }
        h2.\u00d800000().thissuper().\u00d300000(stringArray);
    }

    private void OO0000(H h2, Node node) {
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

    private void super(Node node, OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        for (int i2 = 0; i2 < node.getChildNodes().getLength(); ++i2) {
            Node node2 = node.getChildNodes().item(i2);
            if (!node2.getNodeName().equals("variante")) continue;
            String string = this.\u00d2O0000(node2);
            String string2 = ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.getClass().toString() + "#" + string;
            if (NamenErsetzerKonverter.getInstance().getKorrigiereRKP(string2) != null) {
                String string3 = NamenErsetzerKonverter.getInstance().getKorrigiereRKP(string2).o00000(0).toString();
                String string4 = NamenErsetzerKonverter.getInstance().getKorrigiereRKP(string2).o00000(1).toString();
                if (string3.equals(ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.getClass().toString())) {
                    string = string4;
                } else {
                    helden.framework.held.Object.private.\u00d200000("#################" + string2, "sven");
                    helden.framework.held.Object.private.\u00d200000("   Sonderfall Klasse \u00e4ndert sich!", "sven");
                    if (node.getChildNodes().getLength() != 0) {
                        helden.framework.held.Object.private.\u00d200000("  " + node.getChildNodes().getLength(), "sven");
                        helden.framework.held.Object.private.\u00d200000("  " + string3 + "#" + string4, "sven");
                    }
                }
                helden.framework.held.Object.private.\u00d200000(this.\u00d2O0000(node2) + " => " + string4, "sven");
            }
            try {
                ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.waehleVariante(string);
                continue;
            }
            catch (RuntimeException runtimeException) {
                helden.framework.held.Object.private.\u00d200000("Variante " + string + " konnte nicht gesetzt werden", "sven");
                this.\u00d300000.new("Variante " + string + " konnte nicht gesetzt werden");
            }
        }
    }

    private void super(helden.framework.E.C.E e, Node node) {
        boolean bl = false;
        for (int i2 = 0; i2 < node.getChildNodes().getLength(); ++i2) {
            Object object;
            Node node2 = node.getChildNodes().item(i2);
            if (node2.getNodeName().equals("laden")) {
                e.\u00d5O0000(this.super(node2, "aktionen"));
            }
            if (node2.getNodeName().equals("munition")) {
                object = this.\u00d200000(node2, "art");
                int n = 0;
                for (int i3 = 0; i3 < 5; ++i3) {
                    if (!helden.framework.E.C.F.\u00d8O0000(i3).equals(object)) continue;
                    n = i3;
                }
                e.\u00d6O0000(n);
            }
            if (node2.getNodeName().equals("talente")) {
                if (!bl) {
                    e.\u00f5o0000().clear();
                    bl = true;
                }
                e.o00000((E)N.floatsuper().\u00d200000(this.\u00d200000(node2, "kampftalent")));
            }
            if (node2.getNodeName().equals("entfernung")) {
                object = new helden.framework.e.oooo.oooo_0(this.super(node2, "E0"), this.super(node2, "E1"), this.super(node2, "E2"), this.super(node2, "E3"), this.super(node2, "E4"));
                e.o00000((helden.framework.e.oooo.oooo_0)object);
            }
            if (node2.getNodeName().equals("tpmod")) {
                object = new C(this.super(node2, "M0"), this.super(node2, "M1"), this.super(node2, "M2"), this.super(node2, "M3"), this.super(node2, "M4"));
                e.o00000((C)object);
            }
            if (!node2.getNodeName().equals("trefferpunkte")) continue;
            object = new F(this.super(node2, "mul"), this.super(node2, "w"), this.super(node2, "sum"));
            e.\u00d200000((F)object);
        }
    }

    private void super(helden.framework.E.C.A a2, Node node) {
        boolean bl = false;
        boolean bl2 = false;
        for (int i2 = 0; i2 < node.getChildNodes().getLength(); ++i2) {
            int n;
            Object object;
            Node node2 = node.getChildNodes().item(i2);
            if (node2.getNodeName().equals("talente")) {
                if (!bl) {
                    a2.\u00f6\u00d40000().clear();
                    bl = true;
                }
                a2.\u00d300000((E)N.floatsuper().\u00d200000(this.\u00d200000(node2, "kampftalent")));
            }
            if (node2.getNodeName().equals("trefferpunkte")) {
                object = new F(this.super(node2, "mul"), this.super(node2, "w"), this.super(node2, "sum"));
                a2.o00000((F)object);
            }
            if (node2.getNodeName().equals("wm")) {
                object = new null(this.super(node2, "at"), this.super(node2, "pa"));
                a2.o00000((null)object);
            }
            if (node2.getNodeName().equals("bf")) {
                int n2 = this.super(node2, "min");
                n = this.super(node2, "akt");
                if (n2 < -10) {
                    n2 = -10;
                }
                if (n < -10) {
                    n = -10;
                }
                a2.o00000().new(n2);
                a2.o00000().o00000(n);
            }
            if (node2.getNodeName().equals("inimod")) {
                a2.o00000(this.super(node2, "ini"));
            }
            if (node2.getNodeName().equals("distanzklassen")) {
                if (!bl2) {
                    a2.\u00d8\u00d50000().clear();
                    bl2 = true;
                }
                NodeList nodeList = node2.getChildNodes();
                for (n = 0; n < nodeList.getLength(); ++n) {
                    Node node3 = nodeList.item(n);
                    if (!node3.getNodeName().equals("distanzklasse")) continue;
                    if (oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d200000.\u00d600000().equals(this.\u00d200000(node3, "value"))) {
                        a2.\u00d8\u00d50000().add(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d200000);
                    }
                    if (oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d600000.\u00d600000().equals(this.\u00d200000(node3, "value"))) {
                        a2.\u00d8\u00d50000().add(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d600000);
                    }
                    if (oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.null.\u00d600000().equals(this.\u00d200000(node3, "value"))) {
                        a2.\u00d8\u00d50000().add(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.null);
                    }
                    if (!oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d800000.\u00d600000().equals(this.\u00d200000(node3, "value"))) continue;
                    a2.\u00d8\u00d50000().add(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d800000);
                }
            }
            if (node2.getNodeName().equals("tpkk")) {
                A a3 = new A(this.super(node2, "kk"), this.super(node2, "schrittweite"));
                a2.o00000(a3);
            }
            if (node2.getNodeName().equals("laenge")) {
                a2.oo0000(this.super(node2, "laenge"));
            }
            if (!node2.getNodeName().equals("schadensart")) continue;
            a2.String(this.\u00d200000(node2, "ausdauer").equals("true"));
        }
    }

    private void super(helden.framework.E.F f2, Node node) {
        for (int i2 = 0; i2 < node.getChildNodes().getLength(); ++i2) {
            Node node2 = node.getChildNodes().item(i2);
            if (node2.getNodeName().equals("name")) {
                f2.o00000(this.\u00d200000(node2, "value"));
            }
            if (node2.getNodeName().equals("preis")) {
                f2.\u00d500000(this.super(node2, "value"));
            }
            if (!node2.getNodeName().equals("gewicht")) continue;
            f2.o00000(Float.parseFloat(this.\u00d200000(node2, "value")));
        }
    }

    private void super(B b, Node node) {
        for (int i2 = 0; i2 < node.getChildNodes().getLength(); ++i2) {
            Node node2 = node.getChildNodes().item(i2);
            if (node2.getNodeName().equals("bauch")) {
                b.\u00d2O0000(this.super(node2, "value"));
            }
            if (node2.getNodeName().equals("brust")) {
                b.oO0000(this.super(node2, "value"));
            }
            if (node2.getNodeName().equals("gesbe")) {
                b.\u00f600000(this.super(node2, "value"));
            }
            if (node2.getNodeName().equals("geszors")) {
                b.null(this.super(node2, "value"));
            }
            if (node2.getNodeName().equals("rs")) {
                b.\u00d500000(this.super(node2, "value"));
            }
            if (node2.getNodeName().equals("kopf")) {
                b.\u00d300000(this.super(node2, "value"));
            }
            if (node2.getNodeName().equals("ruecken")) {
                b.\u00f500000(this.super(node2, "value"));
            }
            if (node2.getNodeName().equals("rechterarm")) {
                b.\u00d800000(this.super(node2, "value"));
            }
            if (node2.getNodeName().equals("linkerarm")) {
                b.\u00f800000(this.super(node2, "value"));
            }
            if (node2.getNodeName().equals("rechtesbein")) {
                b.\u00d200000(this.super(node2, "value"));
            }
            if (node2.getNodeName().equals("linkesbein")) {
                b.String(this.super(node2, "value"));
            }
            if (!node2.getNodeName().equals("sterne")) continue;
            b.\u00d600000(this.super(node2, "value"));
        }
    }

    private void super(void void_, Node node) {
        for (int i2 = 0; i2 < node.getChildNodes().getLength(); ++i2) {
            Node node2 = node.getChildNodes().item(i2);
            if (node2.getNodeName().equals("wm")) {
                null nullVal = new null(this.super(node2, "at"), this.super(node2, "pa"));
                void_.\u00d200000(nullVal);
            }
            if (node2.getNodeName().equals("bf")) {
                int n = this.super(node2, "min");
                int n2 = this.super(node2, "akt");
                if (n < -10) {
                    n = -10;
                }
                if (n2 < -10) {
                    n2 = -10;
                }
                void_.\u00d8\u00d20000().new(n);
                void_.\u00d8\u00d20000().o00000(n2);
            }
            if (!node2.getNodeName().equals("inimod")) continue;
            void_.\u00f8O0000(this.super(node2, "ini"));
        }
    }
}

