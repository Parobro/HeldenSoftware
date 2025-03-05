/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.O0OO.B;

import helden.Version;
import helden.framework.C.Oo0O;
import helden.framework.C.public;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.Einstellungen;
import helden.framework.Geschlecht;
import helden.framework.OoOO.interface;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.a.oooo_1;
import helden.framework.held.persistenz.BasisXMLPersistierer;
import helden.framework.held.persistenz.ModVerwaltung;
import helden.framework.held.persistenz.ModsDatenParser;
import helden.framework.held.persistenz.XMLParser;
import helden.framework.oooo.b_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.ZauberMitWertUndHZ;
import helden.gui.O0OO.A.B;
import helden.gui.O0OO.A.String;
import helden.gui.O0OO.A.class;
import helden.gui.O0OO.A.oOOO;
import helden.gui.O0OO.C;
import helden.gui.O0OO.ooOO.O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.O0OO.ooOO.new;
import helden.model.KulturFabrik;
import helden.model.ProfessionenFabrik;
import helden.model.RassenFabrik;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;

public class D
extends C {
    private static D o00000;

    public static D \u00d200000() {
        if (o00000 == null) {
            o00000 = new D();
        }
        return o00000;
    }

    /*
     * WARNING - void declaration
     */
    protected void o00000(new new_, boolean bl) throws ParserConfigurationException, TransformerException, IOException {
        Object object;
        Element element;
        Element element2;
        Element element3;
        BasisXMLPersistierer basisXMLPersistierer = BasisXMLPersistierer.getInstance();
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        Document document = documentBuilderFactory.newDocumentBuilder().newDocument();
        ModVerwaltung modVerwaltung = new ModVerwaltung(document);
        ProcessingInstruction processingInstruction = document.createProcessingInstruction("xml-stylesheet", "type=\"text/xsl\" href=\"helden.xsl\"");
        document.appendChild(processingInstruction);
        switch (new_.\u00d500000()) {
            case super: {
                element3 = document.createElement("eigeneprofession");
                break;
            }
            case \u00d300000: {
                element3 = document.createElement("eigenekultur");
                break;
            }
            case \u00d400000: {
                element3 = document.createElement("eigenerasse");
                break;
            }
            default: {
                element3 = null;
            }
        }
        element3.setAttribute("Version", Version.getVersion());
        document.appendChild(element3);
        Element element4 = document.createElement("name");
        element4.setAttribute("maennlich", new_.whilesuper());
        element4.setAttribute("weiblich", new_.\u00f8o0000());
        element3.appendChild(element4);
        Element element5 = document.createElement("beschreibung");
        Text text = document.createTextNode(new_.\u00d300000());
        element5.appendChild(text);
        element3.appendChild(element5);
        if (bl) {
            this.o00000(document, "hauptvariante", new_.\u00d3\u00d30000().fornew().o\u00f60000(), element3);
        }
        this.o00000(document, "gp", "" + new_.\u00f6O0000(), element3);
        if (new_.\u00d500000().equals((Object)O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO._o.super)) {
            this.o00000(document, "zeitaufwendig", "" + new_.\u00f5o0000(), element3);
            this.o00000(document, "veteranerlaubt", "" + new_.newsuper(), element3);
            this.o00000(document, "magiedilletanterlaubt", "" + new_.\u00d3\u00d20000(), element3);
        }
        if (!new_.\u00d500000().equals((Object)O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO._o.\u00d400000)) {
            this.o00000(document, "maxsozialstatus", "" + new_.thisnew(), element3);
        }
        this.o00000(document, "kontakt", "" + new_.String(), element3);
        this.o00000(document, "urheber", "" + new_.o00000(), element3);
        this.o00000(document, "optional", "" + new_.\u00f6\u00d20000(), element3);
        if (new_.\u00d500000().equals((Object)O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO._o.\u00d300000)) {
            element2 = document.createElement("muttersprache");
            element3.appendChild(element2);
            basisXMLPersistierer.addTalentInfo(element2, new_.\u00f8O0000(), "name", modVerwaltung);
            element2 = document.createElement("mutterschrift");
            element3.appendChild(element2);
            basisXMLPersistierer.addTalentInfo(element2, new_.\u00f8\u00d20000(), "name", modVerwaltung);
        }
        element2 = document.createElement("zuentfernendetalente");
        element3.appendChild(element2);
        for (oo0o_0 object92 : new_.\u00d8O0000()) {
            Element element6 = document.createElement("talent");
            element2.appendChild(element6);
            basisXMLPersistierer.addTalentInfo(element6, object92, "name", modVerwaltung);
        }
        Element element6 = document.createElement("talente");
        element3.appendChild(element6);
        for (interface interface_ : new_.\u00d5o0000()) {
            Element element7 = document.createElement("talent");
            element6.appendChild(element7);
            basisXMLPersistierer.addTalentInfo(element7, interface_.new(), "name", modVerwaltung);
            element7.setAttribute("value", "" + interface_.\u00d300000());
        }
        Element element8 = document.createElement("zauber");
        element3.appendChild(element8);
        for (interface interface_ : new_.\u00f5O0000()) {
            Element element9 = basisXMLPersistierer.getZauberElement((KonkreterZauber)interface_.new(), document);
            element8.appendChild(element9);
            element9.setAttribute("value", "" + interface_.\u00d300000());
            element9.setAttribute("hauszauber", "" + new_.o\u00d20000().contains(interface_.new()));
        }
        Element element10 = document.createElement("waehlbarezauber");
        element3.appendChild(element10);
        for (KonkreterZauber konkreterZauber : new_.o\u00d30000()) {
            Element element11 = basisXMLPersistierer.getZauberElement(konkreterZauber, document);
            element10.appendChild(element11);
        }
        if (new_.\u00d500000().equals((Object)O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO._o.super) || new_.\u00d500000().equals((Object)O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO._o.\u00d300000)) {
            Element element12 = document.createElement("lehrzweitsprachen");
            element3.appendChild(element12);
            for (voidsuper voidsuper2 : new_.returnsuper()) {
                Element element13 = document.createElement("talent");
                element12.appendChild(element13);
                basisXMLPersistierer.addTalentInfo(element13, voidsuper2, "name", modVerwaltung);
            }
        }
        Element element14 = document.createElement("modifikatoren");
        element3.appendChild(element14);
        Element element15 = document.createElement("voraussetzungen");
        element3.appendChild(element15);
        for (b_0 b_02 : new_.\u00f6o0000()) {
            if (b_02.publicString() && new_.\u00d500000(b_02) > 8 || b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
                Element element16 = document.createElement("eigenschaft");
                element15.appendChild(element16);
                element16.setAttribute("name", b_02.toString());
                element16.setAttribute("value", "" + new_.\u00d500000(b_02));
            }
            if (new_.String(b_02) == 0) continue;
            Element element17 = document.createElement("eigenschaft");
            element14.appendChild(element17);
            element17.setAttribute("name", b_02.toString());
            element17.setAttribute("value", "" + new_.String(b_02));
        }
        this.o00000(basisXMLPersistierer, document, element3, new_.\u00d2\u00d30000(), "vorteileautomatisch");
        this.o00000(basisXMLPersistierer, document, element3, new Oo0O(new_.Stringnew()), "vorteileungeeignet");
        this.o00000(basisXMLPersistierer, document, element3, new Oo0O(new_.\u00d8o0000()), "vorteileempfohlen");
        Element element18 = document.createElement("sonderfertigkeiten");
        element3.appendChild(element18);
        for (P p2 : new_.\u00d2\u00d20000().private().getListe()) {
            element18.appendChild(basisXMLPersistierer.getSFElement(p2, modVerwaltung));
        }
        Element element19 = document.createElement("verbilligtesonderfertigkeiten");
        element3.appendChild(element19);
        for (for for_ : new_.\u00d6\u00d20000()) {
            element19.appendChild(basisXMLPersistierer.getVSFElement(for_, modVerwaltung));
        }
        if (new_.\u00d500000().equals((Object)O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO._o.super) || new_.\u00d500000().equals((Object)O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO._o.\u00d300000)) {
            Element element20 = document.createElement("besondererbesitz");
            element3.appendChild(element20);
            for (java.lang.String string : new_.\u00d6O0000()) {
                this.o00000(document, "bb", string, element20, "name");
            }
        }
        Element element21 = document.createElement("auswahlen");
        element3.appendChild(element21);
        for (B b : new_.\u00f5\u00d20000()) {
            B b2;
            element = document.createElement("auswahl");
            element21.appendChild(element);
            if (b instanceof oOOO) {
                b2 = (oOOO)b;
                element.setAttribute("typ", "talentauswahl");
                for (oo0o_0 oo0o_02 : ((oOOO)b2).\u00f800000()) {
                    this.o00000(document, "talent", oo0o_02.toString(), element, "name");
                }
                for (Integer n : ((oOOO)b2).OO0000()) {
                    this.o00000(document, "wert", "" + n, element);
                }
                continue;
            }
            if (b instanceof helden.gui.O0OO.A.C) {
                b2 = (helden.gui.O0OO.A.C)b;
                element.setAttribute("typ", "listenauswahl");
                element.setAttribute("anzahl", "" + ((helden.gui.O0OO.A.C)b2).\u00d300000());
                for (public public_ : ((helden.gui.O0OO.A.C)b2).\u00d400000()) {
                    for (Element element22 : basisXMLPersistierer.getVorteil(public_, document)) {
                        Object object2 = document.createElement("wahl");
                        element.appendChild((Node)object2);
                        object2.appendChild(element22);
                    }
                }
                continue;
            }
            if (b instanceof class) {
                b2 = (class)b;
                element.setAttribute("typ", "listenauswahl");
                element.setAttribute("anzahl", "" + ((class)b2).\u00d800000());
                for (P p3 : ((class)b2).\u00f500000()) {
                    object = document.createElement("wahl");
                    element.appendChild((Node)object);
                    object.appendChild(basisXMLPersistierer.getSFElement(p3, modVerwaltung));
                }
                continue;
            }
            if (!(b instanceof String)) continue;
            b2 = (String)b;
            element.setAttribute("typ", "listenauswahl");
            element.setAttribute("anzahl", "" + ((String)b2).\u00d500000());
            for (ArrayList<Object> arrayList : ((String)b2).return()) {
                object = document.createElement("wahl");
                element.appendChild((Node)object);
                for (Object object2 : arrayList) {
                    Object object3;
                    Element element232;
                    if (object2 instanceof P) {
                        object.appendChild(basisXMLPersistierer.getSFElement((P)object2, modVerwaltung));
                        continue;
                    }
                    if (object2 instanceof public) {
                        for (Element element232 : basisXMLPersistierer.getVorteil((public)object2, document)) {
                            object.appendChild(element232);
                        }
                        continue;
                    }
                    if (object2 instanceof for) {
                        object.appendChild(basisXMLPersistierer.getVSFElement((for)object2, modVerwaltung));
                        continue;
                    }
                    if (object2 instanceof ZauberMitWertUndHZ) {
                        object3 = (ZauberMitWertUndHZ)object2;
                        element232 = basisXMLPersistierer.getZauberElement(((ZauberMitWertUndHZ)object3).getZauber(), document);
                        element232.setAttribute("value", "" + ((ZauberMitWertUndHZ)object3).getWert());
                        element232.setAttribute("hauszauber", "" + ((ZauberMitWertUndHZ)object3).isHauszauber());
                        object.appendChild(element232);
                        continue;
                    }
                    if (!(object2 instanceof interface)) continue;
                    object3 = (interface)object2;
                    element232 = document.createElement("talent");
                    BasisXMLPersistierer.getInstance().addTalentInfo(element232, ((interface)object3).new(), "talent", modVerwaltung);
                    element232.setAttribute("value", "" + ((interface)object3).\u00d300000());
                    object.appendChild(element232);
                }
            }
        }
        if (new_.\u00d500000().equals((Object)O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO._o.\u00d400000)) {
            void var21_74;
            void var20_60;
            boolean bl2 = false;
            while (var20_60 < 2) {
                void var21_72;
                java.lang.String string = "";
                if (var20_60 == false) {
                    java.lang.String string2 = "haarfarbe";
                } else {
                    java.lang.String string3 = "augenfarbe";
                }
                element = document.createElement((java.lang.String)var21_72);
                element3.appendChild(element);
                int n = 0;
                for (oooo_1 oooo_12 : new_.String((int)var20_60)) {
                    object = this.o00000(document, "farbe", oooo_12.String(), element, "farbe");
                    object.setAttribute("wahr", "" + oooo_12.\u00d300000());
                    n += oooo_12.\u00d300000();
                    element.appendChild((Node)object);
                }
                if (n < 20) {
                    Iterator<ArrayList<Object>> iterator = this.o00000(document, "farbe", "nicht eingetragen", element, "farbe");
                    iterator.setAttribute("wahr", "" + (20 - n));
                    element.appendChild((Node)((Object)iterator));
                }
                ++var20_60;
            }
            Element element24 = document.createElement("altersstufen");
            element3.appendChild(element24);
            boolean bl3 = false;
            while (var21_74 < 7) {
                this.o00000(document, "altersstufe", "" + new_.\u00d500000((int)var21_74), element24);
                ++var21_74;
            }
            this.o00000(document, element3, "alter", new_.ifsuper());
            Element element25 = document.createElement("gr\u00f6\u00dfe");
            element3.appendChild(element25);
            Element element26 = this.o00000(document, element25, "m\u00e4nnlich", new_.\u00d200000(Geschlecht.\u00d400000));
            element26.setAttribute("gewichtdifferenzzurgr\u00f6\u00dfe", "" + new_.o00000(Geschlecht.\u00d400000));
            Element element27 = this.o00000(document, element25, "weiblich", new_.\u00d200000(Geschlecht.\u00d300000));
            element27.setAttribute("gewichtdifferenzzurgr\u00f6\u00dfe", "" + new_.o00000(Geschlecht.\u00d300000));
        }
        XMLParser xMLParser = new XMLParser(null);
        helden.framework.int.C c = ModsDatenParser.getInstance().einlesenRKPVariante(element3);
        c.publicnull();
        if (new_.\u00d500000().equals((Object)O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO._o.super)) {
            xMLParser.saveXML(element3, c.o\u00f60000(), Einstellungen.getInstance().getPfade().getPfad("mods") + "/Profession");
            ProfessionenFabrik.aktualisiereEigeneProfessionen();
        }
        if (new_.\u00d500000().equals((Object)O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO._o.\u00d300000)) {
            xMLParser.saveXML(element3, c.o\u00f60000(), Einstellungen.getInstance().getPfade().getPfad("mods") + "/Kultur");
            KulturFabrik.aktualisiereEigeneKulturen();
        }
        if (new_.\u00d500000().equals((Object)O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO._o.\u00d400000)) {
            xMLParser.saveXML(element3, c.o\u00f60000(), Einstellungen.getInstance().getPfade().getPfad("mods") + "/Rasse");
            RassenFabrik.aktualisiereEigeneRassen();
        }
    }
}

