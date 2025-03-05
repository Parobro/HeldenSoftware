/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.persistenz;

import helden.framework.DruckEinstellungen;
import helden.framework.DruckSeitenEintrag;
import helden.framework.Einstellungen;
import helden.framework.HeldEinstellungen;
import helden.framework.held.Object.M;
import helden.framework.held.Object.Y;
import helden.framework.startEvents.StartEvent;
import helden.gui.allgemein.spielleiterBrief.SpielleiterAuswahl;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class XMLEinstellungenParser {
    private ArrayList<String> o00000 = new ArrayList();

    public ArrayList<String> getFehlerHelden() {
        return this.o00000;
    }

    public ArrayList<HeldEinstellungen> ladeEinstellungen(File file) throws Exception {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        Object object = documentBuilderFactory.newDocumentBuilder();
        Document document = ((DocumentBuilder)object).parse(file);
        object = document.getChildNodes().item(0);
        NodeList nodeList = object.getChildNodes();
        ArrayList<HeldEinstellungen> arrayList = new ArrayList<HeldEinstellungen>();
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            Node node = nodeList.item(i2);
            if (node.getNodeName().startsWith("#")) continue;
            try {
                HeldEinstellungen heldEinstellungen = this.\u00d3o0000(node);
                if (heldEinstellungen == null) continue;
                arrayList.add(heldEinstellungen);
                continue;
            }
            catch (Exception exception) {
                this.o00000.add(exception.getMessage());
            }
        }
        return arrayList;
    }

    public Y ladeGruppe(Document document) throws Exception {
        NodeList nodeList = document.getElementsByTagName("tree").item(0).getChildNodes();
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            Node node = nodeList.item(i2);
            if (node.getNodeName().startsWith("#")) continue;
            return this.\u00f400000(node);
        }
        return null;
    }

    private void returnnew(Node node) {
        Einstellungen.getInstance().setAutoSaveNachErschaffung(Boolean.parseBoolean(this.\u00f4\u00d20000(node)));
    }

    private void oo0000(Node node) {
        Einstellungen.getInstance().setAutoUpdate(Boolean.parseBoolean(this.\u00f4\u00d20000(node)));
    }

    private HeldEinstellungen \u00d3o0000(Node node) throws Exception {
        HeldEinstellungen heldEinstellungen = null;
        NodeList nodeList = node.getChildNodes();
        String string = null;
        try {
            String string2 = node.getNodeName();
            if ("Global".equals(string2)) {
                this.\u00d300000(node);
            }
            for (int i2 = 1; i2 < nodeList.getLength(); ++i2) {
                Node node2;
                if (!"HeldEinstellungen".equals(string2) || !(node2 = nodeList.item(i2)).getNodeName().equals("portraet")) continue;
                this.o00000(heldEinstellungen, node2);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
            throw new Exception(string);
        }
        return heldEinstellungen;
    }

    private void new(Node node) {
        Einstellungen.getInstance().setDebianMode(Boolean.parseBoolean(this.\u00f4\u00d20000(node)));
    }

    private void ifnew(Node node) {
        M.o00000(new File(this.\u00f4\u00d20000(node)), true);
    }

    private void \u00d300000(Node node) {
        NodeList nodeList = node.getChildNodes();
        try {
            for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
                Node node2 = nodeList.item(i2);
                if (node2.getNodeName().equals("gpStart")) {
                    this.\u00d8\u00d20000(node2);
                }
                if (node2.getNodeName().equals("nscSchmiede")) {
                    this.\u00d4o0000(node2);
                }
                if (node2.getNodeName().equals("metaTalentAusgeben")) {
                    this.OO0000(node2);
                }
                if (node2.getNodeName().equals("goettergeschenk")) {
                    this.return(node2);
                }
                if (node2.getNodeName().equals("hilfeanzeigen")) {
                    this.\u00f5\u00d20000(node2);
                }
                if (node2.getNodeName().equals("font")) {
                    this.newnew(node2);
                }
                if (node2.getNodeName().equals("guifont")) {
                    this.\u00d400000(node2);
                }
                if (node2.getNodeName().equals("letzterPfad")) {
                    this.Stringsuper(node2);
                }
                if (node2.getNodeName().equals("slbogen")) {
                    this.\u00d800000(node2);
                }
                if (node2.getNodeName().equals("tierfeld")) {
                    this.\u00f5O0000(node2);
                }
                if (node2.getNodeName().equals("heldNamenSignatur")) {
                    this.\u00d5o0000(node2);
                }
                if (node2.getNodeName().equals("geldkreisedrucken")) {
                    this.if(node2);
                }
                if (node2.getNodeName().equals("zauberKommentar")) {
                    this.forsuper(node2);
                }
                if (node2.getNodeName().equals("alteBoegen")) {
                    this.\u00d5O0000(node2);
                }
                if (node2.getNodeName().equals("neueBoegen")) {
                    this.O\u00d30000(node2);
                }
                if (node2.getNodeName().equals("frameMaximiert")) {
                    this.\u00f8\u00d20000(node2);
                }
                if (node2.getNodeName().equals("zauberQuelle")) {
                    this.\u00d5\u00d20000(node2);
                }
                if (node2.getNodeName().equals("pfad")) {
                    this.\u00f8o0000(node2);
                }
                if (node2.getNodeName().equals("anzahlTalentAktivierung")) {
                    this.Oo0000(node2);
                }
                if (node2.getNodeName().equals("proxyServer")) {
                    this.\u00d4O0000(node2);
                }
                if (node2.getNodeName().equals("proxyPort")) {
                    this.while(node2);
                }
                if (node2.getNodeName().equals("proxyVerwenden")) {
                    this.oO0000(node2);
                }
                if (node2.getNodeName().equals("proxyUser")) {
                    this.\u00f8O0000(node2);
                }
                if (node2.getNodeName().equals("proxyPwd")) {
                    this.o00000(node2);
                }
                if (node2.getNodeName().equals("proxyAuth")) {
                    this.\u00d3\u00d20000(node2);
                }
                if (node2.getNodeName().equals("seitenwahlallgemein")) {
                    this.thissuper(node2);
                }
                if (node2.getNodeName().equals("seitenwahl")) {
                    this.\u00d3O0000(node2);
                }
                if (node2.getNodeName().equals("neueHeldenInTree")) {
                    this.nullsuper(node2);
                }
                if (node2.getNodeName().equals("lookandfeel")) {
                    this.\u00d500000(node2);
                }
                if (node2.getNodeName().equals("selectedPath")) {
                    this.\u00d8O0000(node2);
                }
                if (node2.getNodeName().equals("preselect")) {
                    this.\u00f4O0000(node2);
                }
                if (node2.getNodeName().equals("ListeOderTree")) {
                    this.\u00f5o0000(node2);
                }
                if (node2.getNodeName().equals("sortierung")) {
                    this.o\u00d20000(node2);
                }
                if (node2.getNodeName().equals("lastversion")) {
                    this.\u00f500000(node2);
                }
                if (node2.getNodeName().equals("hslocal")) {
                    this.\u00f800000(node2);
                }
                if (node2.getNodeName().equals("profiMode")) {
                    this.privatesuper(node2);
                }
                if (node2.getNodeName().equals("delPfad")) {
                    this.ifnew(node2);
                }
                if (node2.getNodeName().equals("preRelease")) {
                    this.\u00d4\u00d20000(node2);
                }
                if (node2.getNodeName().equals("autoUpdate")) {
                    this.oo0000(node2);
                }
                if (node2.getNodeName().equals("debianMode")) {
                    this.new(node2);
                }
                if (node2.getNodeName().equals("autoSaveNachErschaffung")) {
                    this.returnnew(node2);
                }
                if (node2.getNodeName().equals("startEvents")) {
                    this.\u00f4o0000(node2);
                }
                if (!node2.getNodeName().equals("ignoriereRangeChecks")) continue;
                this.\u00d8o0000(node2);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private int o00000(Node node, String string) {
        return Integer.parseInt(this.new(node, string));
    }

    private String \u00f4\u00d20000(Node node) {
        return this.new(node, "name");
    }

    private String new(Node node, String string) {
        return node.getAttributes().getNamedItem(string).getNodeValue();
    }

    private String O\u00d20000(Node node) {
        return this.new(node, "value");
    }

    private Y \u00f400000(Node node) throws Exception {
        if (node.getNodeName().equals("gruppe")) {
            Y y2 = new Y(this.\u00f4\u00d20000(node), false);
            if (node.hasChildNodes()) {
                NodeList nodeList = node.getChildNodes();
                for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
                    Node node2 = nodeList.item(i2);
                    if (node2.getNodeName().startsWith("#")) continue;
                    y2.o00000(this.\u00f400000(node2));
                    continue;
                }
            }
            return y2;
        }
        if (node.getNodeName().equals("heldID")) {
            return new Y(this.new(node, "id"), true);
        }
        if (node.getNodeName().equals("held")) {
            return new Y(this.new(node, "id"), true);
        }
        return null;
    }

    private void \u00d4\u00d20000(Node node) {
        Einstellungen.getInstance().setPreRelease(Boolean.parseBoolean(this.\u00f4\u00d20000(node)));
    }

    private void \u00d5O0000(Node node) {
        Einstellungen.getInstance().setAlteBoegen(Boolean.parseBoolean(this.\u00f4\u00d20000(node)));
    }

    private void Oo0000(Node node) {
        int n = this.o00000(node, "name");
        if (n <= 3 || n <= 10) {
            Einstellungen.getInstance().setAnzahlAktivierbar(n);
        }
    }

    private void o00000(HeldEinstellungen heldEinstellungen, Node node) {
        heldEinstellungen.setBildPfad(node.getAttributes().getNamedItem("value").getNodeValue());
    }

    private void newnew(Node node) {
        Einstellungen.getInstance().setFontOhneWarnung(new Font(this.\u00f4\u00d20000(node), 0, 9));
        Einstellungen.getInstance().setFontGroesse(this.o00000(node, "fontgroesse"));
    }

    private void \u00f8\u00d20000(Node node) {
        if (this.\u00f4\u00d20000(node).equals("true")) {
            Einstellungen.getInstance().setFrameMaximize(true);
        }
    }

    private void if(Node node) {
        if (this.\u00f4\u00d20000(node).equals("false")) {
            Einstellungen.getInstance().setGeldKreiseDrucken(false);
        }
    }

    private void return(Node node) {
        if (this.\u00f4\u00d20000(node).equals("true")) {
            Einstellungen.getInstance().setGoettergeschnkeVergeben(true);
        }
    }

    private void \u00d8\u00d20000(Node node) {
        Einstellungen.getInstance().setGPStartwert(this.o00000(node, "name"));
    }

    private void \u00d400000(Node node) {
        Font font = new Font(this.\u00f4\u00d20000(node), 0, 9);
        if (font != null) {
            Einstellungen.getInstance().setGuiFont(font);
        }
    }

    private void \u00d5o0000(Node node) {
        if (this.\u00f4\u00d20000(node).equals("true")) {
            Einstellungen.getInstance().setNameAufSeiteDrucken(true);
        }
    }

    private void \u00f5\u00d20000(Node node) {
        Einstellungen.getInstance().setHilfeAnzeigen(Boolean.parseBoolean(this.\u00f4\u00d20000(node)));
    }

    private void \u00f800000(Node node) {
        if (this.\u00f4\u00d20000(node).equals("true")) {
            Einstellungen.getInstance().getPfade().setHsLocal(true);
        }
    }

    private void \u00d8o0000(Node node) {
        if (this.\u00f4\u00d20000(node).equals("true")) {
            Einstellungen.getInstance().setIgnoriereAlleLaengenChecks(true);
        }
    }

    private void \u00f500000(Node node) {
        Einstellungen.getInstance().setLastVersion(this.\u00f4\u00d20000(node));
    }

    private void Stringsuper(Node node) {
        Einstellungen.getInstance().setLetzterPfad(this.\u00f4\u00d20000(node));
    }

    private void \u00f5o0000(Node node) {
        String string = this.\u00f4\u00d20000(node);
        try {
            Einstellungen.getInstance().setLastSelectedListeTree(Integer.parseInt(string));
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private void \u00d500000(Node node) {
        String string = this.\u00f4\u00d20000(node);
        if (string.startsWith("helden.gui.DSAM")) {
            string = "helden.gui.laf.DSAMetalLookAndFeel";
        }
        if (string.startsWith("javax.swing.")) {
            string = "helden.gui.laf.DSAMetalLookAndFeel";
        }
        Einstellungen.getInstance().setLookAndFeel(string);
    }

    private void OO0000(Node node) {
        if (this.\u00f4\u00d20000(node).equals("true")) {
            Einstellungen.getInstance().setMetaTalenteAusgebe(true);
        }
    }

    private void O\u00d30000(Node node) {
        Einstellungen.getInstance().setNeueBoegen(Boolean.parseBoolean(this.\u00f4\u00d20000(node)));
    }

    private void nullsuper(Node node) {
        if (this.\u00f4\u00d20000(node).equals("false")) {
            Einstellungen.getInstance().setNeueHeldenInTree(false);
        }
    }

    private void \u00f4O0000(Node node) {
        NodeList nodeList = node.getChildNodes();
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            Node node2 = nodeList.item(i2);
            if (node2.getNodeName().equals("user")) {
                Einstellungen.getInstance().setPreselectUsername(this.\u00f4\u00d20000(node2));
                Einstellungen.getInstance().setVoreinstellungen(true);
            }
            if (node2.getNodeName().equals("meister")) {
                Einstellungen.getInstance().setPreselectMeister(this.\u00f4\u00d20000(node2));
            }
            if (node2.getNodeName().equals("besitzer")) {
                Einstellungen.getInstance().setPreselectBesitzer(this.\u00f4\u00d20000(node2));
            }
            if (node2.getNodeName().equals("rasse")) {
                Einstellungen.getInstance().setPreselectRasse(this.\u00f4\u00d20000(node2));
            }
            if (node2.getNodeName().equals("kultur")) {
                Einstellungen.getInstance().setPreselectKultur(this.\u00f4\u00d20000(node2));
            }
            if (node2.getNodeName().equals("profession")) {
                Einstellungen.getInstance().setPreselectProfession(this.\u00f4\u00d20000(node2));
            }
            if (node2.getNodeName().equals("sichtbarkeit")) {
                Einstellungen.getInstance().setPreselectSichtbarkeit(this.O\u00d20000(node2));
            }
            if (node2.getNodeName().equals("ueberschreiben")) {
                Einstellungen.getInstance().setPreselectUeberschreiben(this.O\u00d20000(node2).equals("true"));
            }
            if (node2.getNodeName().equals("minstufe")) {
                Einstellungen.getInstance().setPreselectMinStufe(new Integer(this.o00000(node2, "value")));
            }
            if (!node2.getNodeName().equals("maxstufe")) continue;
            Einstellungen.getInstance().setPreselectMaxStufe(new Integer(this.o00000(node2, "value")));
        }
    }

    private void privatesuper(Node node) {
        if (this.\u00f4\u00d20000(node).equals("true")) {
            Einstellungen.getInstance().getPfade().setProfiMode(true);
        }
    }

    private void \u00d3\u00d20000(Node node) {
        if (this.\u00f4\u00d20000(node).equals("true")) {
            Einstellungen.getInstance().setProxyAuthentifikation(true);
        }
    }

    private void while(Node node) {
        Einstellungen.getInstance().setProxyPort(this.\u00f4\u00d20000(node));
    }

    private void o00000(Node node) {
        Einstellungen.getInstance().setProxyPwd(this.\u00f4\u00d20000(node));
    }

    private void \u00d4O0000(Node node) {
        Einstellungen.getInstance().setProxyServer(this.\u00f4\u00d20000(node));
    }

    private void \u00f8O0000(Node node) {
        Einstellungen.getInstance().setProxyUser(this.\u00f4\u00d20000(node));
    }

    private void oO0000(Node node) {
        if (this.\u00f4\u00d20000(node).equals("true")) {
            Einstellungen.getInstance().setProxyVerwenden(true);
        }
    }

    private void \u00d4o0000(Node node) {
        if (this.O\u00d20000(node).equals("true")) {
            Einstellungen.getInstance().setIstNSCSchmiede(true);
        }
    }

    private void \u00d3O0000(Node node) {
        Object object;
        DruckEinstellungen druckEinstellungen = Einstellungen.getInstance().getSeitenEinstellungen(this.new(node, "id"));
        if (node.getAttributes().getNamedItem("ks1") != null) {
            druckEinstellungen.getSet().add(new DruckSeitenEintrag("Kompaktbogen", this.new(node, "ks1").equals("true"), ""));
            druckEinstellungen.getSet().add(new DruckSeitenEintrag("Heldenbogen", this.new(node, "hb").equals("true"), ""));
            druckEinstellungen.getSet().add(new DruckSeitenEintrag("Talentbogen", this.new(node, "tb").equals("true"), ""));
            druckEinstellungen.getSet().add(new DruckSeitenEintrag("Kampfbogen", this.new(node, "kb").equals("true"), ""));
            druckEinstellungen.getSet().add(new DruckSeitenEintrag("Ausr\u00fcstungsbogen", this.new(node, "ab").equals("true"), ""));
            druckEinstellungen.getSet().add(new DruckSeitenEintrag("Kommentarbogen", this.new(node, "kom").equals("true"), ""));
            druckEinstellungen.getSet().add(new DruckSeitenEintrag("Liturgiebogen", this.new(node, "lb").equals("true"), ""));
            druckEinstellungen.getSet().add(new DruckSeitenEintrag("Ritualbogen", this.new(node, "rb").equals("true"), ""));
            druckEinstellungen.getSet().add(new DruckSeitenEintrag("Zauberbogen", this.new(node, "zb").equals("true"), ""));
        }
        if (node.getAttributes().getNamedItem("buch") != null) {
            druckEinstellungen.setBuchdruck(this.new(node, "buch").equals("true"));
        }
        if (node.getAttributes().getNamedItem("hintergrundpfad") != null) {
            druckEinstellungen.setBackgroudPath(this.new(node, "hintergrundpfad"));
        }
        if (node.getAttributes().getNamedItem("wundmaennchenpfad") != null) {
            druckEinstellungen.setWundmaennchenPfad(this.new(node, "wundmaennchenpfad"));
        }
        if (node.getAttributes().getNamedItem("zonenreustung") != null) {
            druckEinstellungen.setZonenruestung(this.new(node, "zonenreustung").equals("true"));
        }
        if (node.getAttributes().getNamedItem("stufe40") != null) {
            druckEinstellungen.setDsa40stufe(this.new(node, "stufe40").equals("true"));
        }
        if (node.getAttributes().getNamedItem("zonenreustung") != null) {
            druckEinstellungen.setZonenruestung(this.new(node, "zonenreustung").equals("true"));
        }
        if (node.getAttributes().getNamedItem("stufe40") != null) {
            druckEinstellungen.setDsa40stufe(this.new(node, "stufe40").equals("true"));
        }
        if (node.getAttributes().getNamedItem("meta") != null) {
            druckEinstellungen.setMetatalentedrucken(this.new(node, "meta").equals("true"));
        } else {
            druckEinstellungen.setMetatalentedrucken(Einstellungen.getInstance().isMetaTalenteAusgebe());
        }
        if (node.getAttributes().getNamedItem("metaWDE") != null) {
            druckEinstellungen.setMetaWDEdrucken(this.new(node, "metaWDE").equals("true"));
        }
        if (node.getAttributes().getNamedItem("zauberkommentar") != null) {
            druckEinstellungen.setZauberkommentar(this.new(node, "zauberkommentar").equals("true"));
        } else {
            druckEinstellungen.setZauberkommentar(Einstellungen.getInstance().istZauberKommentar());
        }
        if (node.getAttributes().getNamedItem("tierfeld") != null) {
            druckEinstellungen.setTierfeld(this.new(node, "tierfeld").equals("true"));
        } else {
            druckEinstellungen.setTierfeld(Einstellungen.getInstance().getTiereDrucken());
        }
        if (node.getAttributes().getNamedItem("geldkreise") != null) {
            druckEinstellungen.setGeldkreise(this.new(node, "geldkreise").equals("true"));
        } else {
            druckEinstellungen.setGeldkreise(Einstellungen.getInstance().isGeldKreiseDrucken());
        }
        if (node.getAttributes().getNamedItem("aspleiste") != null) {
            druckEinstellungen.setASPLeiste(this.new(node, "aspleiste").equals("true"));
        }
        if (node.getAttributes().getNamedItem("signieren") != null) {
            druckEinstellungen.setSignieren(this.new(node, "signieren").equals("true"));
        } else {
            druckEinstellungen.setSignieren(Einstellungen.getInstance().isNamenAufSeiteDrucken());
        }
        if (node.getAttributes().getNamedItem("zrsteiler") != null) {
            druckEinstellungen.setZonenRSTeiler(Integer.parseInt(this.new(node, "zrsteiler")));
        }
        if (node.getAttributes().getNamedItem("blockfarbe") != null) {
            object = new Color(Integer.parseInt(this.new(node, "blockfarbe")));
            druckEinstellungen.setBlockfarbe((Color)object);
        }
        object = node.getChildNodes();
        for (int i2 = 0; i2 < object.getLength(); ++i2) {
            Node node2 = object.item(i2);
            if (!node2.getNodeName().startsWith("DruckSeitenEintrag")) continue;
            String string = this.new(node2, "name");
            boolean bl = this.new(node2, "drucken").equalsIgnoreCase("true");
            String string2 = this.new(node2, "bild");
            String string3 = "";
            if (node2.getAttributes().getNamedItem("hash") != null) {
                string3 = this.new(node2, "hash");
            }
            druckEinstellungen.getSet().add(new DruckSeitenEintrag(string, bl, string2, string3));
        }
    }

    private void thissuper(Node node) {
        Object object;
        DruckEinstellungen druckEinstellungen = Einstellungen.getInstance().getDruckEinstellungentAllegemein();
        if (node.getAttributes().getNamedItem("ks1") != null) {
            druckEinstellungen.getSet().add(new DruckSeitenEintrag("Kompaktbogen", this.new(node, "ks1").equals("true"), ""));
            druckEinstellungen.getSet().add(new DruckSeitenEintrag("Heldenbogen", this.new(node, "hb").equals("true"), ""));
            druckEinstellungen.getSet().add(new DruckSeitenEintrag("Talentbogen", this.new(node, "tb").equals("true"), ""));
            druckEinstellungen.getSet().add(new DruckSeitenEintrag("Kampfbogen", this.new(node, "kb").equals("true"), ""));
            druckEinstellungen.getSet().add(new DruckSeitenEintrag("Ausr\u00fcstungsbogen", this.new(node, "ab").equals("true"), ""));
            druckEinstellungen.getSet().add(new DruckSeitenEintrag("Kommentarbogen", this.new(node, "kom").equals("true"), ""));
            druckEinstellungen.getSet().add(new DruckSeitenEintrag("Liturgiebogen", this.new(node, "lb").equals("true"), ""));
            druckEinstellungen.getSet().add(new DruckSeitenEintrag("Ritualbogen", this.new(node, "rb").equals("true"), ""));
            druckEinstellungen.getSet().add(new DruckSeitenEintrag("Zauberbogen", this.new(node, "zb").equals("true"), ""));
        }
        if (node.getAttributes().getNamedItem("buch") != null) {
            druckEinstellungen.setBuchdruck(this.new(node, "buch").equals("true"));
        }
        if (node.getAttributes().getNamedItem("hintergrundpfad") != null) {
            druckEinstellungen.setBackgroudPath(this.new(node, "hintergrundpfad"));
        }
        if (node.getAttributes().getNamedItem("wundmaennchenpfad") != null) {
            druckEinstellungen.setWundmaennchenPfad(this.new(node, "wundmaennchenpfad"));
        }
        if (node.getAttributes().getNamedItem("zonenreustung") != null) {
            druckEinstellungen.setZonenruestung(this.new(node, "zonenreustung").equals("true"));
        }
        if (node.getAttributes().getNamedItem("stufe40") != null) {
            druckEinstellungen.setDsa40stufe(this.new(node, "stufe40").equals("true"));
        }
        if (node.getAttributes().getNamedItem("meta") != null) {
            druckEinstellungen.setMetatalentedrucken(this.new(node, "meta").equals("true"));
        } else {
            druckEinstellungen.setMetatalentedrucken(Einstellungen.getInstance().isMetaTalenteAusgebe());
        }
        if (node.getAttributes().getNamedItem("metaWDE") != null) {
            druckEinstellungen.setMetaWDEdrucken(this.new(node, "metaWDE").equals("true"));
        }
        if (node.getAttributes().getNamedItem("zauberkommentar") != null) {
            druckEinstellungen.setZauberkommentar(this.new(node, "zauberkommentar").equals("true"));
        } else {
            druckEinstellungen.setZauberkommentar(Einstellungen.getInstance().istZauberKommentar());
        }
        if (node.getAttributes().getNamedItem("zrsteiler") != null) {
            druckEinstellungen.setZonenRSTeiler(Integer.parseInt(this.new(node, "zrsteiler")));
        }
        if (node.getAttributes().getNamedItem("blockfarbe") != null) {
            object = new Color(Integer.parseInt(this.new(node, "blockfarbe")));
            druckEinstellungen.setBlockfarbe((Color)object);
        }
        if (node.getAttributes().getNamedItem("tierfeld") != null) {
            druckEinstellungen.setTierfeld(this.new(node, "tierfeld").equals("true"));
        } else {
            druckEinstellungen.setTierfeld(Einstellungen.getInstance().getTiereDrucken());
        }
        if (node.getAttributes().getNamedItem("geldkreise") != null) {
            druckEinstellungen.setGeldkreise(this.new(node, "geldkreise").equals("true"));
        } else {
            druckEinstellungen.setGeldkreise(Einstellungen.getInstance().isGeldKreiseDrucken());
        }
        if (node.getAttributes().getNamedItem("aspleiste") != null) {
            druckEinstellungen.setASPLeiste(this.new(node, "aspleiste").equals("true"));
        }
        if (node.getAttributes().getNamedItem("signieren") != null) {
            druckEinstellungen.setSignieren(this.new(node, "signieren").equals("true"));
        } else {
            druckEinstellungen.setSignieren(Einstellungen.getInstance().isNamenAufSeiteDrucken());
        }
        object = node.getChildNodes();
        for (int i2 = 0; i2 < object.getLength(); ++i2) {
            Node node2 = object.item(i2);
            if (!node2.getNodeName().startsWith("DruckSeitenEintrag")) continue;
            String string = this.new(node2, "name");
            boolean bl = this.new(node2, "drucken").equalsIgnoreCase("true");
            String string2 = this.new(node2, "bild");
            String string3 = "";
            if (node2.getAttributes().getNamedItem("hash") != null) {
                string3 = this.new(node2, "hash");
            }
            druckEinstellungen.getSet().add(new DruckSeitenEintrag(string, bl, string2, string3));
        }
    }

    private void \u00d8O0000(Node node) {
        NodeList nodeList = node.getChildNodes();
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            Node node2 = nodeList.item(i2);
            if (node2.getNodeName().startsWith("#")) continue;
            try {
                Einstellungen.getInstance().setSelectetPathNote(this.\u00f400000(node2));
                continue;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    private void \u00d800000(Node node) {
        NodeList nodeList = node.getChildNodes();
        ArrayList<SpielleiterAuswahl> arrayList = new ArrayList<SpielleiterAuswahl>();
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            Node node2 = nodeList.item(i2);
            if (!node2.getNodeName().startsWith("SLheld")) continue;
            HashMap<String, Boolean> hashMap = new HashMap<String, Boolean>();
            String string = this.\u00f4\u00d20000(node2);
            if (string == null) continue;
            NodeList nodeList2 = node2.getChildNodes();
            for (int i3 = 0; i3 < nodeList2.getLength(); ++i3) {
                Node node3 = nodeList2.item(i3);
                if (!node2.getNodeName().startsWith("talent")) continue;
                hashMap.put(this.\u00f4\u00d20000(node3), true);
            }
            SpielleiterAuswahl spielleiterAuswahl = new SpielleiterAuswahl();
            spielleiterAuswahl.setHeldKey(string);
            spielleiterAuswahl.setAusgewaehlte(hashMap);
            arrayList.add(spielleiterAuswahl);
        }
        Einstellungen.getInstance().setSLAuswahl(arrayList);
    }

    private void o\u00d20000(Node node) {
        Einstellungen.getInstance().setLastSort(this.\u00f4\u00d20000(node));
    }

    private void \u00f5O0000(Node node) {
        if (this.\u00f4\u00d20000(node).equals("false")) {
            Einstellungen.getInstance().setTiereDrucken(false);
        }
    }

    private void forsuper(Node node) {
        if (this.\u00f4\u00d20000(node).equals("true")) {
            Einstellungen.getInstance().setZauberKommentar(true);
        }
    }

    private void \u00d5\u00d20000(Node node) {
        if (this.\u00f4\u00d20000(node).equals("false")) {
            Einstellungen.getInstance().setZauberQuelledrucken(false);
        }
    }

    private void \u00f4o0000(Node node) {
        NodeList nodeList = node.getChildNodes();
        for (int i2 = 0; i2 < nodeList.getLength(); ++i2) {
            Node node2 = nodeList.item(i2);
            if (!node2.getNodeName().equals("event")) continue;
            String string = node2.getAttributes().getNamedItem("key").getNodeValue();
            String string2 = node2.getAttributes().getNamedItem("value").getNodeValue();
            StartEvent startEvent = Einstellungen.getInstance().getStartEventEinstellungen().getEvent(string);
            if (startEvent == null) continue;
            startEvent.setValue(Long.parseLong(string2));
        }
    }

    private void \u00f8o0000(Node node) {
        String string = this.new(node, "name");
        String string2 = this.new(node, "customPfad");
        Einstellungen.getInstance().getPfade().setPath(string, string2);
    }
}

