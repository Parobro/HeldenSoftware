/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.persistenz;

import helden.framework.C.Oo0O;
import helden.framework.C.public;
import helden.framework.D.OOOo;
import helden.framework.OOoO.Y;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.V;
import helden.framework.OoOO.interface;
import helden.framework.OoOO.null;
import helden.framework.OoOO.voidsuper;
import helden.framework.Wuerfelwurf;
import helden.framework.held.Object.private;
import helden.framework.held.a.oooo_1;
import helden.framework.held.persistenz.BasisXMLParser;
import helden.framework.int.C;
import helden.framework.oooo.a.b_0;
import helden.framework.oooo.a.oooo_0;
import helden.framework.oooo.a_0;
import helden.framework.oooo.l_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_2;
import helden.framework.oooo.s_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.ZauberMitWertUndHZ;
import helden.gui.O0OO.A.oOOO;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public final class ModsDatenParser
extends BasisXMLParser {
    private static ModsDatenParser OO0000;

    public static ModsDatenParser getInstance() {
        if (OO0000 == null) {
            OO0000 = new ModsDatenParser();
        }
        return OO0000;
    }

    private ModsDatenParser() {
    }

    public C einlesenFile(File file, String string) {
        try {
            Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
            return this.einlesenNode(document, string);
        }
        catch (Exception exception) {
            private.\u00d200000("File " + file.toString(), "immer");
            private.\u00d200000(exception.toString(), "immer");
            exception.printStackTrace();
            return null;
        }
    }

    public Y einlesenFormel(File file) {
        Node node = this.getFirstNodeFromFileByName(file, "eigeneformel");
        return this.einlesenFormel(node);
    }

    public Y einlesenFormel(Node node) {
        String string = null;
        String string2 = null;
        String string3 = null;
        String string4 = null;
        String string5 = null;
        String string6 = null;
        Integer n = null;
        Integer n2 = null;
        oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_0 oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_02 = null;
        block22: for (Node node2 : a_0.o00000(node)) {
            switch (node2.getNodeName()) {
                case "beschreibung": {
                    string = node2.getTextContent();
                    continue block22;
                }
                case "urheber": {
                    string2 = this.\u00d400000(node2, "value");
                    continue block22;
                }
                case "kontakt": {
                    string3 = this.\u00d400000(node2, "value");
                    continue block22;
                }
                case "formelname": {
                    string4 = this.\u00d400000(node2, "value");
                    continue block22;
                }
                case "quelle": {
                    string5 = this.\u00d400000(node2, "value");
                    continue block22;
                }
                case "dienst": {
                    string6 = this.\u00d400000(node2, "value");
                    continue block22;
                }
                case "probe": {
                    n = Integer.parseInt(this.\u00d400000(node2, "value"));
                    continue block22;
                }
                case "zauberdauer": {
                    n2 = Integer.parseInt(this.\u00d400000(node2, "value"));
                    continue block22;
                }
                case "komplexitaet": {
                    oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_02 = oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_0.valueOf(this.\u00d400000(node2, "value"));
                    continue block22;
                }
            }
            private.o00000("Unbekanntes Tag im Formeln: " + node2.getNodeName());
        }
        return new Y(string4, string5, string6, (int)n, string, string2, string3, n2, oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_02);
    }

    public C einlesenNode(Document document, String string) {
        Node node = document.getElementsByTagName(string).item(0);
        try {
            return this.einlesenRKPVariante(node);
        }
        catch (NullPointerException nullPointerException) {
            helden.framework.held.object.oooo_0.o00000(nullPointerException);
            return null;
        }
    }

    public C einlesenRKPVariante(Node node) {
        C c = new C();
        NodeList nodeList = node.getChildNodes();
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            int n;
            Object object;
            String string;
            List<Node> list;
            Node node2 = nodeList.item(i2);
            if (node2.getNodeName().startsWith("#")) continue;
            if (node2.getNodeName().equals("name")) {
                c.float(this.\u00d400000(node2, "maennlich"));
                c.oO0000(this.\u00d400000(node2, "weiblich"));
                continue;
            }
            if (node2.getNodeName().equals("gp")) {
                c.\u00d4O0000(Integer.parseInt(this.\u00d400000(node2, "value")));
                continue;
            }
            if (node2.getNodeName().equals("kontakt")) {
                c.\u00f600000(this.\u00d400000(node2, "value"));
                continue;
            }
            if (node2.getNodeName().equals("urheber")) {
                c.OO0000(this.\u00d400000(node2, "value"));
                continue;
            }
            if (node2.getNodeName().equals("optional")) {
                c.setOptional(Boolean.parseBoolean(this.\u00d400000(node2, "value")));
                continue;
            }
            if (node2.getNodeName().equals("hauptprofession") || node2.getNodeName().equals("hauptvariante")) {
                c.public(this.\u00d400000(node2, "value"));
                continue;
            }
            if (node2.getNodeName().equals("zuentfernendetalente")) {
                list = c.publicreturn();
                for (Node node3 : this.getRealChildren(node2)) {
                    string = this.\u00d400000(node3, "name");
                    object = N.floatsuper().\u00d200000(string);
                    ((ArrayList)list).add((Node)object);
                }
                continue;
            }
            if (node2.getNodeName().equals("talente")) {
                for (Node node4 : this.getRealChildren(node2)) {
                    object = this.\u00d400000(node4, "name");
                    voidsuper voidsuper2 = N.floatsuper().\u00d200000((String)object);
                    c.o00000(voidsuper2, Integer.parseInt(this.\u00d400000(node4, "value")));
                }
                continue;
            }
            if (node2.getNodeName().equals("lehrzweitsprachen")) {
                list = new ArrayList();
                for (Node node5 : this.getRealChildren(node2)) {
                    string = this.\u00d400000(node5, "name");
                    object = N.floatsuper().\u00d200000(string);
                    ((ArrayList)list).add((Node)((Object)((G)object)));
                }
                if (((ArrayList)list).size() <= 0) continue;
                c.Object((ArrayList<G>)list);
                continue;
            }
            if (node2.getNodeName().equals("zauber")) {
                for (Node node6 : this.getRealChildren(node2)) {
                    KonkreterZauber konkreterZauber = KonkreterZauber.getZauber(this.getName(node6), this.getRepraesentation(node6), this.getVariante(node6));
                    c.o00000(konkreterZauber, Integer.parseInt(this.\u00d400000(node6, "value")));
                    if (!this.getHauszauber(node6)) continue;
                    c.o00000(konkreterZauber);
                }
                continue;
            }
            if (node2.getNodeName().equals("waehlbarezauber")) {
                for (Node node7 : this.getRealChildren(node2)) {
                    KonkreterZauber konkreterZauber = KonkreterZauber.getZauber(this.getName(node7), this.getRepraesentation(node7), this.getVariante(node7));
                    c.\u00d200000(konkreterZauber);
                }
                continue;
            }
            if (node2.getNodeName().equals("voraussetzungen")) {
                list = new TreeMap();
                NodeList nodeList2 = node2.getChildNodes();
                for (n = 0; n < nodeList2.getLength(); ++n) {
                    object = nodeList2.item(n);
                    if (object.getNodeName().startsWith("#")) continue;
                    ((TreeMap)((Object)list)).put(helden.framework.oooo.b_0.\u00f400000(this.\u00d400000((Node)object, "name")), Integer.parseInt(this.\u00d400000((Node)object, "value")));
                }
                c.\u00d200000((TreeMap<helden.framework.oooo.b_0, Integer>)((Object)list));
                continue;
            }
            if (node2.getNodeName().equals("modifikatoren")) {
                list = new TreeMap();
                NodeList nodeList3 = node2.getChildNodes();
                for (n = 0; n < nodeList3.getLength(); ++n) {
                    object = nodeList3.item(n);
                    if (object.getNodeName().startsWith("#")) continue;
                    ((TreeMap)((Object)list)).put(helden.framework.oooo.b_0.\u00f400000(this.\u00d400000((Node)object, "name")), Integer.parseInt(this.\u00d400000((Node)object, "value")));
                }
                c.o00000((TreeMap<helden.framework.oooo.b_0, Integer>)((Object)list));
                continue;
            }
            if (node2.getNodeName().equals("vorteileautomatisch")) {
                list = new Oo0O();
                NodeList nodeList4 = node2.getChildNodes();
                for (n = 0; n < nodeList4.getLength(); ++n) {
                    object = nodeList4.item(n);
                    if (object.getNodeName().startsWith("#")) continue;
                    ((Oo0O)((Object)list)).\u00d300000((public)this.getVorteil((Node)object));
                }
                c.o00000((Oo0O)((Object)list));
                continue;
            }
            if (node2.getNodeName().equals("vorteileungeeignet") || node2.getNodeName().equals("vorteileempfohlen")) {
                list = new ArrayList();
                NodeList nodeList5 = node2.getChildNodes();
                for (n = 0; n < nodeList5.getLength(); ++n) {
                    object = nodeList5.item(n);
                    if (object.getNodeName().startsWith("#")) continue;
                    ((ArrayList)list).add((Node)((Object)((public)this.getVorteil((Node)object))));
                }
                if (node2.getNodeName().equals("vorteileungeeignet")) {
                    c.\u00d500000((ArrayList<public>)list);
                    continue;
                }
                c.\u00d400000((ArrayList<public>)list);
                continue;
            }
            if (node2.getNodeName().equals("sonderfertigkeiten")) {
                list = new OOOo();
                List<Node> list2 = this.getRealChildren(node2);
                for (n = 0; n < list2.size(); ++n) {
                    object = list2.get(n);
                    ((OOOo)((Object)list)).o00000(this.getSonderfertigkeit((Node)object));
                }
                c.o00000((OOOo)((Object)list));
                continue;
            }
            if (node2.getNodeName().equals("verbilligtesonderfertigkeiten")) {
                list = new ArrayList();
                List<Node> list3 = this.getRealChildren(node2);
                for (n = 0; n < list3.size(); ++n) {
                    object = list3.get(n);
                    list.add((Node)((Object)((public)((Object)this.getVerbilligteSonderfertigkeit((Node)object)))));
                }
                c.o00000(list);
                continue;
            }
            if (node2.getNodeName().equals("zeitaufwendig")) {
                c.void(Boolean.parseBoolean(this.\u00d400000(node2, "value")));
                continue;
            }
            if (node2.getNodeName().equals("veteranerlaubt")) {
                c.\u00f400000(Boolean.parseBoolean(this.\u00d400000(node2, "value")));
                continue;
            }
            if (node2.getNodeName().equals("magiedilletanterlaubt")) {
                c.\u00f500000(Boolean.parseBoolean(this.\u00d400000(node2, "value")));
                continue;
            }
            if (node2.getNodeName().equals("maxsozialstatus")) {
                c.\u00d200000(Integer.parseInt(this.\u00d400000(node2, "value")));
                continue;
            }
            if (node2.getNodeName().equals("besondererbesitz")) {
                list = new ArrayList();
                List<Node> list4 = this.getRealChildren(node2);
                for (n = 0; n < list4.size(); ++n) {
                    object = list4.get(n);
                    list.add((Node)((Object)this.getName((Node)object)));
                }
                c.\u00d200000(list);
                continue;
            }
            if (node2.getNodeName().equals("beschreibung")) {
                c.\u00d2O0000(node2.getTextContent().replace("\n", "<br>"));
                continue;
            }
            if (node2.getNodeName().equals("auswahlen")) {
                list = this.getRealChildren(node2);
                for (int i3 = 0; i3 < list.size(); ++i3) {
                    Node node8 = (Node)list.get(i3);
                    this.o00000(node8, c);
                }
                continue;
            }
            if (node2.getNodeName().equals("muttersprache")) {
                list = this.\u00d400000(node2, "name");
                voidsuper voidsuper3 = N.floatsuper().\u00d200000((String)((Object)list));
                c.\u00d400000((G)voidsuper3);
                continue;
            }
            if (node2.getNodeName().equals("mutterschrift")) {
                list = this.\u00d400000(node2, "name");
                voidsuper voidsuper4 = N.floatsuper().\u00d200000((String)((Object)list));
                c.\u00d500000((G)voidsuper4);
                continue;
            }
            if (node2.getNodeName().equals("haarfarbe") || node2.getNodeName().equals("augenfarbe")) {
                list = this.getRealChildren(node2);
                for (int i4 = 0; i4 < list.size(); ++i4) {
                    Node node9 = list.get(i4);
                    object = new oooo_1(this.\u00d400000(node9, "farbe"), Integer.parseInt(this.\u00d400000(node9, "wahr")), 0);
                    if (node2.getNodeName().equals("haarfarbe")) {
                        c.\u00d200000((oooo_1)object);
                    }
                    if (!node2.getNodeName().equals("augenfarbe")) continue;
                    c.o00000((oooo_1)object);
                }
                continue;
            }
            if (node2.getNodeName().equals("altersstufen")) {
                list = this.getRealChildren(node2);
                Integer[] integerArray = new Integer[7];
                for (n = 0; n < list.size(); ++n) {
                    object = list.get(n);
                    integerArray[n] = Integer.parseInt(this.\u00d400000((Node)object, "value"));
                }
                c.o00000(integerArray);
                continue;
            }
            if (node2.getNodeName().equals("alter")) {
                list = this.OO0000(node2);
                c.o00000((Wuerfelwurf)((Object)list));
                continue;
            }
            if (node2.getNodeName().equals("gr\u00f6\u00dfe")) {
                list = this.getRealChildren(node2);
                for (int i5 = 0; i5 < list.size(); ++i5) {
                    Node node10 = list.get(i5);
                    object = this.OO0000(node10);
                    int n2 = Integer.parseInt(this.\u00d400000(node10, "gewichtdifferenzzurgr\u00f6\u00dfe"));
                    if (node10.getNodeName().equals("m\u00e4nnlich")) {
                        c.Object((Wuerfelwurf)object);
                        c.\u00d6O0000(n2);
                    }
                    if (!node10.getNodeName().equals("weiblich")) continue;
                    c.\u00d200000((Wuerfelwurf)object);
                    c.\u00d5O0000(n2);
                }
                continue;
            }
            JOptionPane.showMessageDialog(null, "Import fehlgeschlagen!\nUnbekannter XML-Tag: " + node2.getNodeName(), "Fehler beim Import", 0);
            return null;
        }
        c.\u00d200000(node.cloneNode(true));
        c.publicnull();
        return c;
    }

    public voidsuper einlesenTalent(File file) {
        Node node = this.getFirstNodeFromFileByName(file, "eigenestalent");
        return this.einlesenTalent(node);
    }

    public voidsuper einlesenTalent(Node node) {
        Object object;
        String string = "";
        String string2 = "";
        String string3 = "";
        String string4 = "";
        helden.framework.oooo.b_0 b_02 = null;
        helden.framework.oooo.b_0 b_03 = null;
        helden.framework.oooo.b_0 b_04 = null;
        oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1 oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12 = null;
        String string5 = "";
        Boolean bl = false;
        String string6 = "";
        int n = 0;
        int n2 = 0;
        s_0 s_02 = null;
        String string7 = "keinefamilie";
        NodeList nodeList = node.getChildNodes();
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            object = nodeList.item(i2);
            if (object.getNodeName().startsWith("#")) continue;
            if (object.getNodeName().equals("beschreibung")) {
                string = object.getTextContent().replace("\n", "<br>");
                continue;
            }
            if (object.getNodeName().equals("urheber")) {
                string3 = this.\u00d400000((Node)object, "value");
                continue;
            }
            if (object.getNodeName().equals("kontakt")) {
                string4 = this.\u00d400000((Node)object, "value");
                continue;
            }
            if (object.getNodeName().equals("talentname")) {
                string2 = this.\u00d400000((Node)object, "value");
                continue;
            }
            if (object.getNodeName().equals("talentart")) {
                oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12 = oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.o00000(this.\u00d400000((Node)object, "value"));
                continue;
            }
            if (object.getNodeName().equals("probe1")) {
                b_02 = helden.framework.oooo.b_0.\u00f400000(this.\u00d400000((Node)object, "value"));
                continue;
            }
            if (object.getNodeName().equals("probe2")) {
                b_03 = helden.framework.oooo.b_0.\u00f400000(this.\u00d400000((Node)object, "value"));
                continue;
            }
            if (object.getNodeName().equals("probe3")) {
                b_04 = helden.framework.oooo.b_0.\u00f400000(this.\u00d400000((Node)object, "value"));
                continue;
            }
            if (object.getNodeName().equals("behinderungsstring")) {
                string6 = this.\u00d400000((Node)object, "value");
                continue;
            }
            if (object.getNodeName().equals("behinderungszahl")) {
                n = Integer.parseInt(this.\u00d400000((Node)object, "value"));
                continue;
            }
            if (object.getNodeName().equals("abkuerzung")) {
                string5 = this.\u00d400000((Node)object, "value");
                continue;
            }
            if (object.getNodeName().equals("")) {
                bl = Boolean.parseBoolean(this.\u00d400000((Node)object, "value"));
                continue;
            }
            if (object.getNodeName().equals("komplexitaet")) {
                n2 = Integer.parseInt(this.\u00d400000((Node)object, "value"));
                continue;
            }
            if (object.getNodeName().equals("steigerungskategorie")) {
                s_02 = s_0.o00000(Integer.parseInt(this.\u00d400000((Node)object, "value")));
                continue;
            }
            if (object.getNodeName().equals("sprachfamilie")) {
                string7 = this.\u00d400000((Node)object, "value");
                continue;
            }
            if (object.getNodeName().equals("hatparade")) {
                bl = Boolean.parseBoolean(this.\u00d400000((Node)object, "value"));
                continue;
            }
            private.o00000("Unbekanntes Tag im Talent: " + object.getNodeName());
        }
        voidsuper voidsuper2 = null;
        if (oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.do.equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12) || oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d6O0000.equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12)) {
            voidsuper2 = new null(string2, string5, s_02, "BE-" + n, n, oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12, bl, node, string, string3, string4);
        } else if (oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f600000.equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12) || oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000.equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12)) {
            voidsuper2 = new oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_2(string2, oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12, s_02, n2, string7, node, string, string3, string4);
        } else if (oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.Oo0000.equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12)) {
            object = new l_0(b_02, b_03, b_04);
            voidsuper2 = new V(string2, oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12, false, (l_0)object, node, string6, string, string3, string4);
        } else {
            object = new l_0(b_02, b_03, b_04);
            voidsuper2 = new V(string2, oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12, false, (l_0)object, node, string, string3, string4);
        }
        return voidsuper2;
    }

    public Node getFirstNodeFromFileByName(File file, String string) {
        try {
            Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
            return document.getElementsByTagName(string).item(0);
        }
        catch (Exception exception) {
            private.\u00d200000(exception.toString(), "sven");
            exception.printStackTrace();
            return null;
        }
    }

    private String \u00d400000(Node node, String string) {
        return node.getAttributes().getNamedItem(string).getNodeValue();
    }

    private void o00000(Node node, C c) {
        String string = this.\u00d400000(node, "typ");
        if (string.equals("listenauswahl")) {
            oooo_0 oooo_02 = new oooo_0();
            oooo_02.o00000(Integer.parseInt(this.\u00d400000(node, "anzahl")));
            for (Node node2 : this.getRealChildren(node)) {
                b_0 b_02 = new b_0();
                for (Node node3 : this.getRealChildren(node2)) {
                    Object object;
                    if (node3.getNodeName().equals("vorteil")) {
                        b_02.o00000(this.getVorteil(node3));
                        continue;
                    }
                    if (node3.getNodeName().equals("sonderfertigkeit")) {
                        b_02.o00000(this.getSonderfertigkeit(node3));
                        continue;
                    }
                    if (node3.getNodeName().equals("talent")) {
                        object = this.\u00d400000(node3, "talent");
                        b_02.o00000(new interface(N.floatsuper().\u00d200000((String)object), this.getIntValue(node3)));
                        continue;
                    }
                    if (node3.getNodeName().equals("zauber")) {
                        object = KonkreterZauber.getZauber(this.getName(node3), this.getRepraesentation(node3), this.getVariante(node3));
                        b_02.o00000(new ZauberMitWertUndHZ((KonkreterZauber)object, this.getIntValue(node3), this.getHauszauber(node3)));
                        continue;
                    }
                    if (node3.getNodeName().equals("verbilligtesonderfertigkeit")) {
                        b_02.o00000(this.getVerbilligteSonderfertigkeit(node3));
                        continue;
                    }
                    private.o00000("Unbekanntes Tag in Auswahl: " + node3.getNodeName());
                }
                oooo_02.o00000(b_02);
            }
            c.o00000(oooo_02);
        } else if (string.equals("talentauswahl")) {
            oOOO oOOO2 = new oOOO();
            for (Node node4 : this.getRealChildren(node)) {
                if (node4.getNodeName().equals("wert")) {
                    oOOO2.\u00d500000(this.getIntValue(node4));
                    continue;
                }
                if (node4.getNodeName().equals("talent")) {
                    String string2 = this.\u00d400000(node4, "name");
                    oOOO2.o00000((oo0o_0)N.floatsuper().\u00d200000(string2));
                    continue;
                }
                private.o00000("Unbekanntes Tag in Auswahl: " + node4.getNodeName());
            }
            c.o00000(oOOO2);
        } else {
            private.o00000("Unbekannte Auswahlart");
        }
    }

    private Wuerfelwurf OO0000(Node node) {
        return new Wuerfelwurf(Integer.parseInt(this.\u00d400000(node, "w20")), Integer.parseInt(this.\u00d400000(node, "w6")), Integer.parseInt(this.\u00d400000(node, "konstant")));
    }
}

