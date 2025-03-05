/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.datenxmlplugin;

import helden.Version;
import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.M;
import helden.framework.C.Oo0O;
import helden.framework.C.o0OO;
import helden.framework.C.ooOO;
import helden.framework.C.private;
import helden.framework.D.D;
import helden.framework.D.F;
import helden.framework.D.OOOo;
import helden.framework.D.P;
import helden.framework.D.Q;
import helden.framework.D.for;
import helden.framework.D.public;
import helden.framework.D.while;
import helden.framework.DruckEinstellungen;
import helden.framework.E.C.A;
import helden.framework.E.C.void;
import helden.framework.E.OoOO.oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.Einstellungen;
import helden.framework.HeldenMath;
import helden.framework.OOoO.R;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.geld.Muenze;
import helden.framework.held.B;
import helden.framework.held.K;
import helden.framework.held.Object.C;
import helden.framework.held.Object.floatsuper;
import helden.framework.held.T;
import helden.framework.held.oO0O;
import helden.framework.int.String;
import helden.framework.int.super;
import helden.framework.oooo.b_0;
import helden.framework.oooo.l_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooo_1;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.ZauberInfos;
import helden.plugin.datenxmlplugin.XMLDatenGeneratorCfg;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.ProcessingInstruction;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class XMLDatenGenerator {
    private static Element new;
    private static K o00000;
    private static Document \u00d300000;

    public static synchronized Document genDaten(K k2, int n) {
        return XMLDatenGenerator.genDaten(k2, new XMLDatenGeneratorCfg(n));
    }

    public static synchronized Document genDaten(K k2, XMLDatenGeneratorCfg xMLDatenGeneratorCfg) {
        try {
            o00000 = k2;
            k2.o00000(0).String(k2);
            k2.o00000(1).String(k2);
            k2.o00000(2).String(k2);
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            \u00d300000 = documentBuilderFactory.newDocumentBuilder().newDocument();
            ProcessingInstruction processingInstruction = \u00d300000.createProcessingInstruction("xml-stylesheet", "type=\"text/xsl\" ");
            \u00d300000.appendChild(processingInstruction);
            new = \u00d300000.createElement("daten");
            \u00d300000.appendChild(new);
            XMLDatenGenerator.\u00d300000();
            XMLDatenGenerator.o00000(xMLDatenGeneratorCfg);
            XMLDatenGenerator.\u00d500000();
            XMLDatenGenerator.new(xMLDatenGeneratorCfg);
            XMLDatenGenerator.o00000(o00000.\u00d500000(), new);
            XMLDatenGenerator.o00000(o00000.\u00f5O0000(), new);
            Element element = \u00d300000.createElement("verbilligtesonderfertigkeiten");
            new.appendChild(element);
            for (for for_ : o00000.thisObject()) {
                Element element2 = \u00d300000.createElement("verbilligtesonderfertigkeit");
                element.appendChild(element2);
                XMLDatenGenerator.o00000(element2, "nameausfuehrlich", for_.toString());
            }
            XMLDatenGenerator.\u00d400000(xMLDatenGeneratorCfg);
            XMLDatenGenerator.\u00d300000(xMLDatenGeneratorCfg);
            XMLDatenGenerator.o00000();
            XMLDatenGenerator.new();
            if (xMLDatenGeneratorCfg.show(XMLDatenGeneratorCfg.cfgOptions.\u00d200000)) {
                XMLDatenGenerator.\u00d400000();
            }
            if (xMLDatenGeneratorCfg.getVersion() == 1) {
                XMLDatenGenerator.o00000(0, new, true, xMLDatenGeneratorCfg.getVersion());
                XMLDatenGenerator.\u00d300000(0, new, true);
                XMLDatenGenerator.o00000(0, new, true);
                XMLDatenGenerator.new(0, new, true);
                XMLDatenGenerator.o00000(k2, xMLDatenGeneratorCfg.getVersion());
            }
            XMLDatenGenerator.new(k2, xMLDatenGeneratorCfg.getVersion());
            return \u00d300000;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public static void makeDeprecated(Element element) {
        element.setAttribute("deprecated", "true");
    }

    private static Element o00000(Element element, String string, boolean bl) {
        return XMLDatenGenerator.o00000(element, string, Boolean.toString(bl));
    }

    private static Element o00000(Element element, String string, int n) {
        return XMLDatenGenerator.o00000(element, string, String.valueOf(n));
    }

    private static Element o00000(Element element, String string, String string2) {
        Element element2 = \u00d300000.createElement(string);
        element.appendChild(element2);
        element2.setTextContent(string2);
        return element2;
    }

    private static void o00000(XMLDatenGeneratorCfg xMLDatenGeneratorCfg) {
        Object object;
        int n;
        Element element = \u00d300000.createElement("angaben");
        new.appendChild(element);
        XMLDatenGenerator.o00000(element, "augenfarbe", o00000.thissuper().getAugenFarbe());
        XMLDatenGenerator.o00000(element, "geburtstag", o00000.thissuper().getGeburtstagString());
        XMLDatenGenerator.o00000(element, "alter", "" + o00000.thissuper().\u00d200000());
        XMLDatenGenerator.o00000(element, "geschlecht", o00000.\u00d300000().toString());
        XMLDatenGenerator.o00000(element, "groesse", String.valueOf(o00000.thissuper().getGroesse()));
        XMLDatenGenerator.o00000(element, "gewicht", String.valueOf(o00000.thissuper().getGewicht(o00000.o00000(I.\u00f8\u00d2o000))));
        XMLDatenGenerator.o00000(element, "haarfarbe", o00000.thissuper().getHaarFarbe());
        XMLDatenGenerator.o00000(element, "stand", o00000.thissuper().getStand());
        XMLDatenGenerator.o00000(element, "titel", o00000.thissuper().getTitel());
        XMLDatenGenerator.o00000(element, "name", o00000.\u00f5o0000());
        XMLDatenGenerator.o00000(element, "bildPfad", o00000.forsuper());
        Element element2 = \u00d300000.createElement("aussehen");
        element.appendChild(element2);
        String string = "";
        for (n = 0; n < 4; ++n) {
            string = string + o00000.thissuper().getAussehenText()[n] + " ";
            XMLDatenGenerator.o00000(element2, "a" + n, o00000.thissuper().getAussehenText()[n]);
        }
        XMLDatenGenerator.o00000(element2, "text", string.trim());
        string = "";
        element2 = \u00d300000.createElement("familie");
        element.appendChild(element2);
        for (n = 0; n < 6; ++n) {
            string = string + o00000.thissuper().getFamilieText()[n] + " ";
            XMLDatenGenerator.o00000(element2, "f" + n, o00000.thissuper().getFamilieText()[n]);
        }
        XMLDatenGenerator.o00000(element2, "text", string.trim());
        string = "";
        element2 = \u00d300000.createElement("notizen");
        element.appendChild(element2);
        for (n = 0; n < o00000.thissuper().getNotiz().length; ++n) {
            object = o00000.thissuper().getNotiz()[n];
            string = string + (String)object + " ";
            XMLDatenGenerator.o00000(element2, "n" + n, (String)object);
        }
        XMLDatenGenerator.o00000(element2, "text", string.trim());
        element2 = \u00d300000.createElement("profession");
        element.appendChild(element2);
        XMLDatenGenerator.o00000(element2, "text", o00000.\u00d800000().toString());
        XMLDatenGenerator.o00000(element2, "textkurz", XMLDatenGenerator.o00000(o00000.\u00d800000()));
        XMLDatenGenerator.o00000(element2, "tarnidentitaet", o00000.thissuper().\u00d300000());
        element2 = \u00d300000.createElement("ap");
        element.appendChild(element2);
        XMLDatenGenerator.o00000(element2, "gesamt", String.valueOf(o00000.o\u00d30000()));
        XMLDatenGenerator.o00000(element2, "frei", String.valueOf(o00000.\u00d400000()));
        XMLDatenGenerator.o00000(element2, "genutzt", String.valueOf(o00000.o\u00d30000() - o00000.\u00d400000()));
        element2 = \u00d300000.createElement("gp");
        element.appendChild(element2);
        XMLDatenGenerator.o00000(element2, "start", "" + o00000.thissuper().getGPStart());
        XMLDatenGenerator.o00000(element2, "rest", "" + o00000.thissuper().getGPRest());
        element2 = \u00d300000.createElement("stufe40");
        element.appendChild(element2);
        XMLDatenGenerator.o00000(element2, "akt", String.valueOf(o00000.\u00d4\u00d30000()));
        XMLDatenGenerator.o00000(element2, "max", String.valueOf(HeldenMath.getStufe40(o00000.o\u00d30000())));
        String string2 = String.valueOf(o00000.\u00d4\u00d30000());
        string2 = string2 + " [" + HeldenMath.getStufe40(o00000.o\u00d30000()) + "]";
        XMLDatenGenerator.o00000(element2, "lang", string2);
        element2 = \u00d300000.createElement("stufe41");
        element.appendChild(element2);
        XMLDatenGenerator.o00000(element2, "akt", String.valueOf(o00000.\u00d5\u00d30000()));
        XMLDatenGenerator.o00000(element2, "max", String.valueOf(HeldenMath.getStufe41(o00000.o\u00d30000())));
        string2 = String.valueOf(o00000.\u00d5\u00d30000());
        string2 = string2 + " [" + HeldenMath.getStufe41(o00000.o\u00d30000()) + "]";
        XMLDatenGenerator.o00000(element2, "lang", string2);
        if (xMLDatenGeneratorCfg.getVersion() == 1) {
            element2 = \u00d300000.createElement("stufe");
            XMLDatenGenerator.makeDeprecated(element2);
            element.appendChild(element2);
            XMLDatenGenerator.o00000(element2, "akt", String.valueOf(o00000.\u00d5\u00d30000()));
            XMLDatenGenerator.o00000(element2, "max", String.valueOf(HeldenMath.getStufe41(o00000.o\u00d30000())));
            string2 = String.valueOf(o00000.\u00d5\u00d30000());
            string2 = string2 + " [" + HeldenMath.getStufe41(o00000.o\u00d30000()) + "]";
            XMLDatenGenerator.o00000(element2, "lang", string2);
        }
        string = "";
        if (o00000.returnnew() != null) {
            string = o00000.returnnew();
        }
        XMLDatenGenerator.o00000(element, "gilde", string);
        XMLDatenGenerator.o00000(element, "magisch", String.valueOf(o00000.oo0000()));
        XMLDatenGenerator.o00000(element, "geweiht", String.valueOf(o00000.\u00d8\u00d20000()));
        XMLDatenGenerator.o00000(element, "rasse", o00000.o\u00d20000().toString());
        XMLDatenGenerator.o00000(element, "kultur", o00000.\u00f800000().toString());
        XMLDatenGenerator.o00000(element, "aspregeneration", o00000.\u00d3\u00d50000());
        XMLDatenGenerator.o00000(element, "leregeneration", o00000.O\u00d50000());
        XMLDatenGenerator.o00000(element, "heldenversion", Version.getSoftwareVersion());
        XMLDatenGenerator.o00000(element, "wundschwelle", "" + o00000.o00000(b_0.\u00d5\u00f5\u00d2000));
        o00000.OO0000().String(o00000);
        if (xMLDatenGeneratorCfg.getVersion() == 1) {
            XMLDatenGenerator.makeDeprecated(XMLDatenGenerator.o00000(element, "rsgesamt", "" + o00000.OO0000().for()));
            XMLDatenGenerator.makeDeprecated(XMLDatenGenerator.o00000(element, "rsbe", "" + o00000.OO0000().\u00d300000()));
            object = o00000.OO0000().\u00f800000();
            if (object != null) {
                Element element3 = \u00d300000.createElement("zonenruestung");
                XMLDatenGenerator.makeDeprecated(element3);
                element.appendChild(element3);
                XMLDatenGenerator.o00000(element3, "kopf", "" + ((helden.framework.E.C.B)object).\u00f8O0000());
                XMLDatenGenerator.o00000(element3, "brust", "" + ((helden.framework.E.C.B)object).\u00f800000());
                XMLDatenGenerator.o00000(element3, "ruecken", "" + ((helden.framework.E.C.B)object).newsuper());
                XMLDatenGenerator.o00000(element3, "gesamt", "" + ((helden.framework.E.C.B)object).oO0000());
                XMLDatenGenerator.o00000(element3, "bauch", "" + ((helden.framework.E.C.B)object).\u00f6O0000());
                XMLDatenGenerator.o00000(element3, "linkerarm", "" + ((helden.framework.E.C.B)object).\u00d6O0000());
                XMLDatenGenerator.o00000(element3, "rechterarm", "" + ((helden.framework.E.C.B)object).\u00d8O0000());
                XMLDatenGenerator.o00000(element3, "linkesbein", "" + ((helden.framework.E.C.B)object).\u00f500000());
                XMLDatenGenerator.o00000(element3, "rechtesbein", "" + ((helden.framework.E.C.B)object).\u00d5O0000());
                XMLDatenGenerator.o00000(element3, "behinderung", "" + ((helden.framework.E.C.B)object).\u00f600000());
            }
        }
    }

    private static void \u00d300000() {
        DruckEinstellungen druckEinstellungen = Einstellungen.getInstance().getSeitenEinstellungen(o00000.\u00f4o0000());
        Element element = \u00d300000.createElement("config");
        new.appendChild(element);
        if (druckEinstellungen.isZonenRuestung()) {
            XMLDatenGenerator.o00000(element, "rsmodell", "zone");
        } else {
            XMLDatenGenerator.o00000(element, "rsmodell", "einfach");
        }
        Date date = new Date();
        XMLDatenGenerator.o00000(element, "datum", new SimpleDateFormat("dd.MM.yyyy").format(date));
        XMLDatenGenerator.o00000(element, "uhrzeit", new SimpleDateFormat("HH:mm").format(date));
        XMLDatenGenerator.o00000(element, "geldkreise", Einstellungen.getInstance().isGeldKreiseDrucken());
        XMLDatenGenerator.o00000(element, "metatalente", druckEinstellungen.isMetatalentedrucken());
        XMLDatenGenerator.o00000(element, "zauberquellen", Einstellungen.getInstance().isZauberQuelledrucken());
        XMLDatenGenerator.o00000(element, "namenaufseiten", Einstellungen.getInstance().isNamenAufSeiteDrucken());
    }

    private static void o00000(Element element, b_0 b_02) {
        String string = b_02.toString().toLowerCase();
        if (string.equals("k\u00f6rperkraft")) {
            string = "koerperkraft";
        }
        Element element2 = \u00d300000.createElement(string);
        element.appendChild(element2);
        try {
            int n = o00000.o00000(b_02);
            if (b_02.equals(b_0.\u00f4\u00f5\u00d2000) && !o00000.oo0000()) {
                n = 0;
            }
            XMLDatenGenerator.o00000(element2, "akt", String.valueOf(n));
            if (!b_02.equals(b_0.\u00d4\u00f5\u00d2000)) {
                n = o00000.\u00d3\u00d30000().OO0000(b_02);
                XMLDatenGenerator.o00000(element2, "start", String.valueOf(n));
            } else {
                XMLDatenGenerator.o00000(element2, "start", "0");
            }
            n = o00000.\u00d3\u00d30000().\u00d200000(b_02);
            XMLDatenGenerator.o00000(element2, "modi", String.valueOf(n));
            XMLDatenGenerator.o00000(element2, "name", b_02.toString());
            String string2 = "sonst";
            if (b_02.publicString()) {
                string2 = "guteeigenschaft";
            }
            XMLDatenGenerator.o00000(element2, "bereich", string2);
            n = -99;
            if (b_02.equals(b_0.\u00d3\u00f4\u00d2000) || b_02.equals(b_0.thispublicsuper) || b_02.equals(b_0.\u00d4\u00f5\u00d2000) || b_02.equals(b_0.\u00d8\u00f5\u00d2000)) {
                n = o00000.\u00d3\u00d30000().interface(b_02);
            }
            if (b_02.equals(b_0.\u00f4\u00f5\u00d2000)) {
                n = o00000.\u00d3\u00d30000().interface(b_02);
                if (!o00000.oo0000()) {
                    n = 0;
                }
            }
            if (n != -99) {
                XMLDatenGenerator.o00000(element2, "kaufbar", String.valueOf(n));
            }
            if (b_02.equals(b_0.\u00d3\u00f4\u00d2000) || b_02.equals(b_0.thispublicsuper) || b_02.equals(b_0.\u00f4\u00f5\u00d2000) || b_02.equals(b_0.\u00d4\u00f5\u00d2000) || b_02.equals(b_0.\u00d8\u00f5\u00d2000)) {
                n = o00000.\u00d3\u00d30000().\u00d200000(b_02);
                XMLDatenGenerator.o00000(element2, "gekauft", String.valueOf(n));
            }
            if (b_02.equals(b_0.\u00f4\u00f5\u00d2000) && o00000.oo0000()) {
                int n2 = 0;
                if (o00000.o00000(I.\u00f8oO000)) {
                    n2 += ((J)o00000.\u00d500000().\u00d300000(I.\u00f8oO000)).ObjectString();
                }
                if (o00000.o00000(I.\u00d5\u00f4O000)) {
                    n2 += 7;
                }
                XMLDatenGenerator.o00000(element2, "ausvornachteile", String.valueOf(n2));
                int n3 = (o00000.o00000(b_0.whilewhilesuper) + o00000.o00000(b_0.\u00f8\u00f4\u00d2000) + o00000.o00000(b_0.\u00d5\u00f4\u00d2000) + 1) / 2;
                XMLDatenGenerator.o00000(element2, "muinch2", String.valueOf(n3));
                int n4 = 0;
                if (o00000.new(while.\u00d3\u00d5\u00d6000.toString())) {
                    n4 = (o00000.o00000(b_0.whilewhilesuper) + o00000.o00000(b_0.\u00f8\u00f4\u00d2000) + o00000.o00000(b_0.\u00d5\u00f4\u00d2000) + o00000.o00000(b_0.\u00d5\u00f4\u00d2000) + 1) / 2 - n3;
                }
                XMLDatenGenerator.o00000(element2, "aussonderfertigkeiten", String.valueOf(n4));
                XMLDatenGenerator.o00000(element2, "professionmod", o00000.\u00d3\u00d30000().\u00f400000(b_0.\u00f4\u00f5\u00d2000) + o00000.\u00d3\u00d30000().\u00d2O0000(b_0.\u00f4\u00f5\u00d2000) - n2);
                XMLDatenGenerator.o00000(element2, "grossemeditation", o00000.\u00d3\u00d30000().\u00d4O0000());
                XMLDatenGenerator.o00000(element2, "pasprueckkaufbar", String.valueOf(-o00000.\u00d3\u00d30000().super(b_0.\u00f4\u00f5\u00d2000)));
                n = o00000.o00000(b_02);
                XMLDatenGenerator.o00000(element2, "aktinklrueckkaufbarepasp", String.valueOf(n - o00000.\u00d3\u00d30000().super(b_0.\u00f4\u00f5\u00d2000)));
            }
            if (b_02.equals(b_0.\u00d3\u00f4\u00d2000) || b_02.equals(b_0.thispublicsuper)) {
                n = o00000.o00000(b_02);
                XMLDatenGenerator.o00000(element2, "akt50", String.valueOf(HeldenMath.haelfte(n)));
                XMLDatenGenerator.o00000(element2, "akt33", String.valueOf(HeldenMath.drittel(n)));
                XMLDatenGenerator.o00000(element2, "akt25", String.valueOf(HeldenMath.viertel(n)));
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private static void \u00d500000() {
        Element element = \u00d300000.createElement("eigenschaften");
        new.appendChild(element);
        Element element2 = \u00d300000.createElement("geschwindigkeit");
        element.appendChild(element2);
        XMLDatenGenerator.o00000(element2, "akt", String.valueOf(o00000.o00000(b_0.O\u00f4\u00d2000)));
        XMLDatenGenerator.o00000(element2, "start", String.valueOf(o00000.\u00d3\u00d30000().OO0000(b_0.O\u00f4\u00d2000)));
        XMLDatenGenerator.o00000(element2, "modi", String.valueOf(o00000.\u00d3\u00d30000().\u00d200000(b_0.O\u00f4\u00d2000)));
        XMLDatenGenerator.o00000(element2, "name", b_0.O\u00f4\u00d2000.toString());
        XMLDatenGenerator.o00000(element2, "bereich", "sonst");
        ArrayList<b_0> arrayList = b_0.o\u00d60000();
        for (b_0 b_02 : arrayList) {
            XMLDatenGenerator.o00000(element, b_02);
        }
        for (b_0 b_02 : o00000.\u00d3\u00d30000().\u00d200000()) {
            if (arrayList.contains(b_02)) continue;
            XMLDatenGenerator.o00000(element, b_02);
        }
    }

    private static void \u00d400000() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        Element element = \u00d300000.createElement("ereignisse");
        new.appendChild(element);
        for (helden.framework.A.A a2 : o00000.\u00d8O0000()) {
            Element element2 = \u00d300000.createElement("ereignis");
            element.appendChild(element2);
            XMLDatenGenerator.o00000(element2, "aktion", a2.\u00d3O0000());
            XMLDatenGenerator.o00000(element2, "alterzustand", a2.\u00f800000());
            XMLDatenGenerator.o00000(element2, "ap", a2.o00000());
            XMLDatenGenerator.o00000(element2, "asp", a2.\u00d5O0000());
            XMLDatenGenerator.o00000(element2, "bemerkung", a2.\u00d600000());
            XMLDatenGenerator.o00000(element2, "date", simpleDateFormat.format(a2.\u00d800000()));
            XMLDatenGenerator.o00000(element2, "kp", a2.\u00d200000());
            XMLDatenGenerator.o00000(element2, "kommentar", a2.private());
            XMLDatenGenerator.o00000(element2, "lep", a2.oO0000());
            XMLDatenGenerator.o00000(element2, "neuerzustand", a2.\u00f600000());
            XMLDatenGenerator.o00000(element2, "object", a2.\u00f500000());
            XMLDatenGenerator.o00000(element2, "version", a2.\u00d300000());
        }
    }

    private static boolean \u00d300000(int n, Element element, boolean bl) {
        oO0O oO0O2 = o00000.o00000(n);
        Element element2 = \u00d300000.createElement("fernkampfwaffen");
        if (bl) {
            XMLDatenGenerator.makeDeprecated(element2);
        }
        element.appendChild(element2);
        boolean bl2 = false;
        for (int i2 = 0; i2 < 3; ++i2) {
            helden.framework.E.C.E e;
            if (oO0O2.\u00d500000(i2 + 1) == null || (e = (helden.framework.E.C.E)oO0O2.\u00d500000(i2 + 1).o00000(helden.framework.E.B.class, 0)) == null) continue;
            bl2 = true;
            Element element3 = \u00d300000.createElement("fernkampfwaffe");
            element2.appendChild(element3);
            XMLDatenGenerator.o00000(element3, "nummer", String.valueOf(i2 + 1));
            oO0O oO0O3 = oO0O2;
            String string = oO0O3.\u00d500000(i2 + 1).OO0000();
            XMLDatenGenerator.o00000(element3, "name", string);
            XMLDatenGenerator.o00000(element3, "spalte2", oO0O2.\u00f500000(i2 + 1).super().O\u00d80000() + "/" + oO0O2.\u00f500000(i2 + 1).super().superclass());
            XMLDatenGenerator.o00000(element3, "reichweite", e.\u00d6o0000().toString());
            XMLDatenGenerator.o00000(element3, "tp", String.valueOf(e.\u00d8o0000().toString()));
            XMLDatenGenerator.o00000(element3, "tpmod", e.\u00f6o0000().toString());
            XMLDatenGenerator.o00000(element3, "at", String.valueOf(oO0O3.null(i2)));
            XMLDatenGenerator.o00000(element3, "ladezeit", String.valueOf(e.\u00d5o0000()));
            XMLDatenGenerator.o00000(element3, "kampftalent", oO0O2.\u00f500000(i2 + 1).super().toString());
        }
        element2.setAttribute("inbenutzung", "" + bl2);
        return bl2;
    }

    private static void o00000() {
        Element element = \u00d300000.createElement("gegenstaende");
        new.appendChild(element);
        for (helden.framework.E.F[] fArray : o00000.\u00d8o0000().new()) {
            for (int i2 = 0; i2 < o00000.\u00d8o0000().\u00d300000(); ++i2) {
                if (fArray[i2] == null) continue;
                helden.framework.E.F f2 = fArray[i2];
                Element element2 = \u00d300000.createElement("gegenstand");
                element.appendChild(element2);
                XMLDatenGenerator.o00000(element2, "name", f2.OO0000());
                XMLDatenGenerator.o00000(element2, "anzahl", String.valueOf(f2.\u00f500000()));
                XMLDatenGenerator.o00000(element2, "grundlage", f2.toString());
                XMLDatenGenerator.o00000(element2, "gewicht", String.valueOf(f2.Object()));
                XMLDatenGenerator.o00000(element2, "gesamtgewicht", String.valueOf(f2.Object() * (float)f2.\u00f500000()));
                XMLDatenGenerator.o00000(element2, "angelegt", "" + o00000.o00000(0).\u00d200000(f2));
                XMLDatenGenerator.o00000(element2, "angelegt1", "" + o00000.o00000(1).\u00d200000(f2));
                XMLDatenGenerator.o00000(element2, "angelegt2", "" + o00000.o00000(2).\u00d200000(f2));
                XMLDatenGenerator.o00000(element2, "einzelpreis", "" + f2.oO0000());
                XMLDatenGenerator.o00000(element2, "gesamtpreis", "" + f2.oO0000() * f2.\u00f500000());
                Element element3 = XMLDatenGenerator.o00000(element2, "quelle", "" + f2.o00000());
                element3.setAttribute("buch", f2.o00000().\u00d200000());
                element3.setAttribute("seite", "" + f2.o00000().Object());
                Element element4 = \u00d300000.createElement("details");
                element2.appendChild(element4);
                String string = "";
                Iterator<helden.framework.E.A> iterator = f2.\u00d500000().iterator();
                while (iterator.hasNext()) {
                    helden.framework.E.A a2 = iterator.next();
                    String string2 = helden.framework.E.B.super(a2);
                    string = string + string2;
                    switch (a2) {
                        case o00000: {
                            helden.framework.E.C.K k2 = (helden.framework.E.C.K)f2.o00000(a2, 0);
                            Element element5 = \u00d300000.createElement(XMLDatenGenerator.o00000(string2.toLowerCase()));
                            element4.appendChild(element5);
                            Element element6 = \u00d300000.createElement("eigenschaften");
                            element5.appendChild(element6);
                            for (b_0 b_02 : k2.\u00d8\u00d40000()) {
                                XMLDatenGenerator.o00000(element6, XMLDatenGenerator.o00000(b_02.toString()).replace(" ", "").toLowerCase(), String.valueOf(k2.o00000(b_02)));
                            }
                            XMLDatenGenerator.o00000(k2.\u00f5\u00d40000(), element5);
                            XMLDatenGenerator.o00000(k2.\u00d3\u00d40000(), element5);
                            XMLDatenGenerator.o00000(element5, "gattung", k2.\u00d5\u00d30000());
                            XMLDatenGenerator.o00000(element5, "familie", k2.\u00d2\u00d40000());
                            XMLDatenGenerator.o00000(element5, "groesse", String.valueOf(k2.\u00f5\u00d30000()));
                            Element element7 = \u00d300000.createElement("ini");
                            element5.appendChild(element7);
                            element7.setAttribute("mul", "" + k2.returnObject().\u00d400000());
                            element7.setAttribute("w", "" + k2.returnObject().Object());
                            element7.setAttribute("sum", "" + k2.returnObject().o00000());
                            Element object2 = \u00d300000.createElement("angriffe");
                            element5.appendChild(object2);
                            for (helden.framework.E.OoOO.E e : k2.\u00d6\u00d40000()) {
                                Element element8 = \u00d300000.createElement("angriff");
                                object2.appendChild(element8);
                                element8.setAttribute("name", e.\u00d400000());
                                element8.setAttribute("at", String.valueOf(e.o00000()));
                                element8.setAttribute("pa", String.valueOf(e.new()));
                                element8.setAttribute("dk", e.\u00d300000());
                                element8.setAttribute("tp", e.\u00d800000().toString());
                            }
                            break;
                        }
                    }
                    if (!iterator.hasNext()) continue;
                    string = string + ", ";
                }
                if (string.equals("")) {
                    string = "sonst";
                }
                XMLDatenGenerator.o00000(element2, "arten", string);
            }
        }
    }

    private static void new(XMLDatenGeneratorCfg xMLDatenGeneratorCfg) {
        if (xMLDatenGeneratorCfg.getVersion() == 1) {
            Element element = \u00d300000.createElement("geld");
            new.appendChild(element);
            Iterator<Muenze> iterator = o00000.\u00f400000().getMuenzeIter();
            while (iterator.hasNext()) {
                Muenze muenze = iterator.next();
                Element element2 = XMLDatenGenerator.o00000(element, muenze.getBezeichner().replaceAll(" ", ""), "");
                XMLDatenGenerator.o00000(element2, "name", "" + muenze.getBezeichner());
                XMLDatenGenerator.o00000(element2, "anzahl", "" + o00000.\u00f400000().getMuenzAnzahl(muenze));
                XMLDatenGenerator.o00000(element2, "namekurz", muenze.getKurzString());
                XMLDatenGenerator.o00000(element2, "waehrung", muenze.getWaehrungsBezeichner());
                XMLDatenGenerator.o00000(element2, "gewicht", "" + muenze.getGewichtProStueck());
                XMLDatenGenerator.o00000(element2, "wertinsilberstuecken", "" + muenze.getWertInSilberstuecke());
                XMLDatenGenerator.o00000(element2, "gesamtwertinsilberstuecken", "" + muenze.getWertInSilberstuecke() * (float)o00000.\u00f400000().getMuenzAnzahl(muenze));
            }
        } else {
            Element element = \u00d300000.createElement("m\u00fcnzen");
            new.appendChild(element);
            Iterator<Muenze> iterator = o00000.\u00f400000().getMuenzeIter();
            while (iterator.hasNext()) {
                Muenze muenze = iterator.next();
                Element element3 = XMLDatenGenerator.o00000(element, "m\u00fcnze", "");
                XMLDatenGenerator.o00000(element3, "name", "" + muenze.getBezeichner());
                XMLDatenGenerator.o00000(element3, "anzahl", "" + o00000.\u00f400000().getMuenzAnzahl(muenze));
                XMLDatenGenerator.o00000(element3, "namekurz", muenze.getKurzString());
                XMLDatenGenerator.o00000(element3, "waehrung", muenze.getWaehrungsBezeichner());
                XMLDatenGenerator.o00000(element3, "gewicht", "" + muenze.getGewichtProStueck());
                XMLDatenGenerator.o00000(element3, "wertinsilberstuecken", "" + muenze.getWertInSilberstuecke());
                XMLDatenGenerator.o00000(element3, "gesamtwertinsilberstuecken", "" + muenze.getWertInSilberstuecke() * (float)o00000.\u00f400000().getMuenzAnzahl(muenze));
            }
        }
    }

    private static boolean o00000(int n, Element element, boolean bl, int n2) {
        floatsuper floatsuper2 = new floatsuper(o00000);
        oO0O oO0O2 = o00000.o00000(n);
        Element element2 = \u00d300000.createElement("nahkampfwaffen");
        if (bl) {
            XMLDatenGenerator.makeDeprecated(element2);
        }
        element.appendChild(element2);
        boolean bl2 = false;
        for (int i2 = 0; i2 < 5; ++i2) {
            A a2;
            helden.framework.E.F f2 = o00000.o00000(n).\u00f8O0000(i2 + 1);
            if (f2 == null || (a2 = oO0O2.\u00d3O0000(i2 + 1).\u00d200000()) == null) continue;
            bl2 = true;
            Element element3 = \u00d300000.createElement("nahkampfwaffe");
            element2.appendChild(element3);
            XMLDatenGenerator.o00000(element3, "nummer", String.valueOf(i2 + 1));
            oO0O oO0O3 = oO0O2;
            String string = "";
            XMLDatenGenerator.o00000(element3, "m\u00f6glich", String.valueOf(a2.nullString() == null || floatsuper2.\u00d200000(a2.nullString()) != floatsuper._o.\u00d400000));
            string = string + f2.OO0000();
            if (!a2.thisString().equals("")) {
                string = string + " (" + a2.thisString() + ")";
            }
            if (a2.StringString()) {
                string = string + " (A)";
            }
            if (oO0O2.\u00d800000(i2 + 1) > 0) {
                string = string + " (S" + oO0O2.\u00d800000(i2 + 1) + ")";
                XMLDatenGenerator.o00000(element3, "schildnummer", oO0O2.\u00d800000(i2 + 1));
            }
            XMLDatenGenerator.o00000(element3, "bh", String.valueOf(oO0O2.o00000(i2)));
            XMLDatenGenerator.o00000(element3, "name", string);
            XMLDatenGenerator.o00000(element3, "spalte2", oO0O3.\u00d3O0000(i2 + 1).o00000().O\u00d80000() + "/" + oO0O3.\u00d3O0000(i2 + 1).o00000().superclass());
            String string2 = "";
            for (oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 : a2.\u00d8\u00d50000()) {
                string2 = string2 + oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00d400000() + " ";
            }
            XMLDatenGenerator.o00000(element3, "dk", string2);
            XMLDatenGenerator.o00000(element3, "tp", String.valueOf(a2.\u00d500000()));
            Element object2 = XMLDatenGenerator.o00000(element3, "tpkk", String.valueOf(a2.\u00d200000()));
            object2.setAttribute("schwelle", "" + a2.\u00d200000().\u00d300000());
            object2.setAttribute("schrittweite", "" + a2.\u00d200000().o00000());
            XMLDatenGenerator.o00000(element3, "ini", String.valueOf(a2.\u00d300000()));
            XMLDatenGenerator.o00000(element3, "wm", String.valueOf(a2.String()));
            XMLDatenGenerator.o00000(element3, "at", String.valueOf(oO0O3.String(i2)));
            try {
                XMLDatenGenerator.o00000(element3, "pa", String.valueOf(oO0O3.\u00d200000(i2)));
            }
            catch (B b) {
                XMLDatenGenerator.o00000(element3, "pa", "");
            }
            int n3 = o00000.o00000(b_0.privatedosuper);
            String string3 = a2.\u00d500000().o00000(a2.\u00d200000().o00000(n3)).toString();
            XMLDatenGenerator.o00000(element3, "tpinkl", String.valueOf(string3));
            XMLDatenGenerator.o00000(element3, "bereich", "nahkampf");
            XMLDatenGenerator.o00000(element3, "bfmin", String.valueOf(a2.o00000().\u00d400000()));
            XMLDatenGenerator.o00000(element3, "bfakt", String.valueOf(a2.o00000().\u00d300000()));
            if (n2 == 1) {
                XMLDatenGenerator.o00000(element3, "talentkurz", oO0O3.\u00d3O0000(i2 + 1).o00000().O\u00d80000());
                XMLDatenGenerator.o00000(element3, "talent", oO0O3.\u00d3O0000(i2 + 1).o00000().toString());
            } else {
                XMLDatenGenerator.o00000(element3, "waffentalentkurz", oO0O3.\u00d3O0000(i2 + 1).o00000().O\u00d80000());
                XMLDatenGenerator.o00000(element3, "waffentalent", oO0O3.\u00d3O0000(i2 + 1).o00000().toString());
            }
            XMLDatenGenerator.o00000(element3, "be", oO0O3.\u00d3O0000(i2 + 1).o00000().superclass());
        }
        element2.setAttribute("inbenutzung", "" + bl2);
        return bl2;
    }

    private static boolean new(int n, Element element, boolean bl) {
        oO0O oO0O2 = o00000.o00000(n);
        Element element2 = \u00d300000.createElement("ruestungen");
        if (bl) {
            XMLDatenGenerator.makeDeprecated(element2);
        }
        element.appendChild(element2);
        boolean bl2 = false;
        for (int i2 = 0; i2 < 5; ++i2) {
            helden.framework.E.F f2 = oO0O2.\u00f800000(i2 + 1);
            if (f2 == null) continue;
            bl2 = true;
            Element element3 = \u00d300000.createElement("ruestung");
            element2.appendChild(element3);
            XMLDatenGenerator.o00000(element3, "nummer", String.valueOf(i2 + 1));
            XMLDatenGenerator.o00000(element3, "name", f2.OO0000());
            XMLDatenGenerator.o00000(element3, "grundlage", f2.toString());
            helden.framework.E.C.B b = (helden.framework.E.C.B)f2.o00000(helden.framework.E.B.OO0000, 0);
            if (b == null) continue;
            if (b.\u00d3O0000()) {
                XMLDatenGenerator.o00000(element3, "be", "*");
                XMLDatenGenerator.o00000(element3, "rs", "*");
            } else {
                XMLDatenGenerator.o00000(element3, "be", String.valueOf(b.\u00f600000()));
                XMLDatenGenerator.o00000(element3, "rs", String.valueOf(b.\u00d2O0000()));
            }
            XMLDatenGenerator.o00000(element3, "kopf", "" + b.\u00f8O0000());
            XMLDatenGenerator.o00000(element3, "brust", "" + b.\u00f800000());
            XMLDatenGenerator.o00000(element3, "ruecken", "" + b.newsuper());
            XMLDatenGenerator.o00000(element3, "bauch", "" + b.\u00f6O0000());
            XMLDatenGenerator.o00000(element3, "linkerarm", "" + b.\u00d6O0000());
            XMLDatenGenerator.o00000(element3, "rechterarm", "" + b.\u00d8O0000());
            XMLDatenGenerator.o00000(element3, "linkesbein", "" + b.\u00f500000());
            XMLDatenGenerator.o00000(element3, "rechtesbein", "" + b.\u00d5O0000());
            XMLDatenGenerator.o00000(element3, "gesamt", "" + b.\u00d2O0000());
            XMLDatenGenerator.o00000(element3, "gesamtzonenschutz", "" + b.oO0000());
            XMLDatenGenerator.o00000(element3, "behinderung", "" + b.\u00f600000());
        }
        element2.setAttribute("inbenutzung", "" + bl2);
        return bl2;
    }

    private static boolean o00000(int n, Element element, boolean bl) {
        oO0O oO0O2 = o00000.o00000(n);
        Element element2 = \u00d300000.createElement("schilder");
        if (bl) {
            XMLDatenGenerator.makeDeprecated(element2);
        }
        element.appendChild(element2);
        boolean bl2 = false;
        for (int i2 = 0; i2 < 2; ++i2) {
            if (oO0O2.\u00f5O0000(i2 + 1) == null) continue;
            bl2 = true;
            void void_ = (void)oO0O2.\u00f5O0000(i2 + 1).o00000(helden.framework.E.B.\u00d300000, 0);
            Element element3 = \u00d300000.createElement("schild");
            element2.appendChild(element3);
            XMLDatenGenerator.o00000(element3, "nummer", String.valueOf(i2 + 1));
            XMLDatenGenerator.o00000(element3, "name", oO0O2.\u00f5O0000(i2 + 1).OO0000());
            XMLDatenGenerator.o00000(element3, "ini", String.valueOf(void_.nullnew()));
            XMLDatenGenerator.o00000(element3, "mod", void_.\u00f5\u00d20000().toString());
            XMLDatenGenerator.o00000(element3, "at", String.valueOf(oO0O2.for(i2)));
            XMLDatenGenerator.o00000(element3, "pa", String.valueOf(oO0O2.\u00d600000(i2)));
            XMLDatenGenerator.o00000(element3, "bfmin", String.valueOf(void_.\u00d8\u00d20000().\u00d400000()));
            XMLDatenGenerator.o00000(element3, "bfakt", String.valueOf(void_.\u00d8\u00d20000().\u00d300000()));
            XMLDatenGenerator.o00000(element3, "bf", String.valueOf(void_.\u00d8\u00d20000().\u00d400000()) + "/" + String.valueOf(void_.\u00d8\u00d20000().\u00d300000()));
            String string = helden.framework.E.B.super(oO0O2.\u00f5O0000(i2 + 1).float());
            XMLDatenGenerator.o00000(element3, "typ", string);
        }
        element2.setAttribute("inbenutzung", "" + bl2);
        return bl2;
    }

    private static void o00000(OOOo oOOo, Element element) {
        Element element2 = \u00d300000.createElement("sonderfertigkeiten");
        element.appendChild(element2);
        Iterator<P> iterator = oOOo.iterator();
        while (iterator.hasNext()) {
            Object object;
            Object object2;
            Element element3 = \u00d300000.createElement("sonderfertigkeit");
            element2.appendChild(element3);
            P p2 = iterator.next();
            String string = p2.toString();
            XMLDatenGenerator.o00000(element3, "nameausfuehrlich", string);
            if (string.startsWith("Liturgie: ")) {
                string = string.substring(10);
            } else if (string.startsWith("Merkmalskenntnis: ")) {
                string = string.substring(18);
            } else if (string.startsWith("Repr\u00e4sentation: ")) {
                string = string.substring(16);
            } else if (string.startsWith("Ritual: ")) {
                string = string.substring(8);
            }
            XMLDatenGenerator.o00000(element3, "name", string);
            XMLDatenGenerator.o00000(element3, "bezeichner", p2.\u00f500000());
            String string2 = string;
            if (!(p2 instanceof helden.framework.D.void)) {
                object2 = o00000.o00000(p2);
                XMLDatenGenerator.o00000(element3, "wirkung", ((D)object2).Object());
                XMLDatenGenerator.o00000(element3, "dauer", ((D)object2).\u00d200000());
                XMLDatenGenerator.o00000(element3, "kosten", ((D)object2).\u00d400000());
                XMLDatenGenerator.o00000(element3, "probe", ((D)object2).o00000());
                object = o00000.Stringsuper().o00000(p2.toString());
                if (object != null && !((String)object).equals("")) {
                    string2 = string2 + " (" + (String)object + ")";
                    XMLDatenGenerator.o00000(element3, "kommentar", (String)object);
                } else {
                    XMLDatenGenerator.o00000(element3, "kommentar", "");
                }
            }
            if (p2 instanceof helden.framework.D.void) {
                object2 = (helden.framework.D.void)p2;
                object = \u00d300000.createElement("auswahlen");
                element3.appendChild((Node)object);
                List list = ((helden.framework.D.void)object2).o\u00d40000();
                for (Q q : list) {
                    Object object3;
                    Object t = q.\u00d8\u00d30000();
                    Element element4 = \u00d300000.createElement("auswahl");
                    XMLDatenGenerator.o00000(element4, "name", t.toString());
                    object.appendChild(element4);
                    if (p2 instanceof F) {
                        object3 = (R)t;
                        for (int i2 = 0; i2 < ((R)object3).o00000(); ++i2) {
                            if (((R)object3).o00000(i2) == null) continue;
                            Element element5 = XMLDatenGenerator.o00000(element4, "feld", ((R)object3).o00000(i2).toString());
                            element5.setAttribute("nr", "" + (i2 + 1));
                            element5.setAttribute("feldname", ((F)object2).return(i2));
                        }
                    } else {
                        object3 = XMLDatenGenerator.o00000(element4, "feld", t.toString());
                        object3.setAttribute("nr", "1");
                        object3.setAttribute("feldname", "1");
                    }
                    object3 = o00000.Stringsuper().o00000(q);
                    XMLDatenGenerator.o00000(element4, "kommentar", (String)(object3 == null ? "" : object3));
                    D d2 = o00000.o00000(q);
                    XMLDatenGenerator.o00000(element4, "wirkung", d2.Object());
                    XMLDatenGenerator.o00000(element4, "dauer", d2.\u00d200000());
                    XMLDatenGenerator.o00000(element4, "kosten", d2.\u00d400000());
                    XMLDatenGenerator.o00000(element4, "probe", d2.o00000());
                }
            }
            XMLDatenGenerator.o00000(element3, "namemitkommentar", string2);
            boolean bl = false;
            if (p2.\u00f8O0000()) {
                bl = true;
                XMLDatenGenerator.o00000(element3, "bereich", "Talentspezialisierung");
            }
            if (p2.\u00f5O0000()) {
                bl = true;
                XMLDatenGenerator.o00000(element3, "bereich", "Gel\u00e4ndekunde");
            }
            if ((p2.\u00f5O0000() || p2.\u00d400000() == 0) && !p2.\u00f8O0000()) {
                bl = true;
                XMLDatenGenerator.o00000(element3, "bereich", "Sonst");
            }
            if (p2.oo0000()) {
                bl = true;
                XMLDatenGenerator.o00000(element3, "bereich", "Nahkampf");
                XMLDatenGenerator.o00000(element3, "bereich", "Kampf");
            }
            if (p2.\u00f4o0000()) {
                bl = true;
                XMLDatenGenerator.o00000(element3, "bereich", "Fernkampf");
                XMLDatenGenerator.o00000(element3, "bereich", "Kampf");
            }
            if (p2.\u00d4o0000()) {
                bl = true;
                XMLDatenGenerator.o00000(element3, "bereich", "Man\u00f6ver");
                XMLDatenGenerator.o00000(element3, "bereich", "Kampf");
            }
            if (p2.\u00f4O0000()) {
                bl = true;
                XMLDatenGenerator.o00000(element3, "bereich", "Magisch");
                XMLDatenGenerator.o00000(element3, "bereich", "Repr\u00e4sentation");
            }
            if (p2.if()) {
                bl = true;
                XMLDatenGenerator.o00000(element3, "bereich", "Magisch");
                XMLDatenGenerator.o00000(element3, "bereich", "Merkmalskenntnis");
            }
            if (p2.\u00d400000() == 12) {
                bl = true;
                XMLDatenGenerator.o00000(element3, "bereich", "Schamanenritual");
            }
            if (p2.privatesuper() && (p2.returnnew() || p2.\u00f800000()) || p2.\u00d400000() == 12) {
                bl = true;
                XMLDatenGenerator.o00000(element3, "bereich", "Magisch");
                XMLDatenGenerator.o00000(element3, "bereich", "Ritual");
            }
            if (p2.\u00d4\u00d20000()) {
                bl = true;
                XMLDatenGenerator.o00000(element3, "bereich", "Magisch");
                XMLDatenGenerator.o00000(element3, "bereich", "SonstMagisch");
            }
            if (!(!p2.privatesuper() || p2.\u00f4O0000() || p2.\u00f800000() || p2.returnnew() || p2.\u00d4\u00d20000() || p2.if() || p2.\u00f4O0000() || p2.new())) {
                bl = true;
                XMLDatenGenerator.o00000(element3, "bereich", "Magisch");
                XMLDatenGenerator.o00000(element3, "bereich", "SonstMagisch");
            }
            if (p2.new()) {
                bl = true;
                XMLDatenGenerator.o00000(element3, "bereich", "Magisch");
                XMLDatenGenerator.o00000(element3, "bereich", "Ritualkenntnis");
            }
            if (p2.\u00d3O0000()) {
                bl = true;
                XMLDatenGenerator.o00000(element3, "bereich", "Geweiht");
                XMLDatenGenerator.o00000(element3, "bereich", "Liturgie");
                object = (public)p2;
                XMLDatenGenerator.o00000(element3, "grad", String.valueOf(((helden.framework.D.oO0O)object).whilenew()));
            }
            if (p2.\u00d300000() && !p2.\u00d3O0000()) {
                if (p2.\u00d500000()) {
                    bl = true;
                    XMLDatenGenerator.o00000(element3, "bereich", "Geweiht");
                    XMLDatenGenerator.o00000(element3, "bereich", "Liturgiekenntnis");
                } else {
                    bl = true;
                    XMLDatenGenerator.o00000(element3, "bereich", "Geweiht");
                    XMLDatenGenerator.o00000(element3, "bereich", "SonstGeweiht");
                }
            }
            if (bl) continue;
            XMLDatenGenerator.o00000(element3, "bereich", "Sonst");
        }
    }

    private static void \u00d400000(XMLDatenGeneratorCfg xMLDatenGeneratorCfg) {
        ArrayList<voidsuper> arrayList = o00000.O\u00d40000();
        Element element = xMLDatenGeneratorCfg.getVersion() == 1 ? \u00d300000.createElement("talente") : \u00d300000.createElement("talentliste");
        new.appendChild(element);
        T t = C.for(o00000);
        t.super(o00000.\u00f8O0000());
        for (oo0o_0 oo0o_02 : t.\u00d200000()) {
            boolean bl;
            Element element2 = \u00d300000.createElement("talent");
            element.appendChild(element2);
            String string = "";
            if (oo0o_02.getArt().toString().equals("Sprachen")) {
                string = oo0o_02.toString().substring(16);
            } else if (oo0o_02.getArt().toString().equals("Schriften")) {
                string = "L/S " + oo0o_02.toString().substring(16);
            } else if (oo0o_02.getArt().toString().equals("Ritualkenntnis")) {
                string = oo0o_02.toString().substring(16);
            } else if (oo0o_02.toString().startsWith("Liturgiekenntnis (")) {
                string = oo0o_02.toString().substring(18);
                string = string.substring(0, string.length() - 1);
            } else {
                string = oo0o_02.toString();
            }
            XMLDatenGenerator.o00000(element2, "name", string);
            String string2 = "";
            if (o00000.\u00f8O0000().\u00d300000((voidsuper)oo0o_02)) {
                string2 = string2 + " (M+)";
            }
            if (o00000.\u00f8O0000().super((voidsuper)oo0o_02)) {
                string2 = string2 + " (M-)";
            }
            boolean bl2 = bl = o00000.o00000(I.while) && ((M)o00000.\u00d500000().\u00d300000(I.while)).\u00f400000(oo0o_02);
            if (bl) {
                string2 = string2 + " (MH)";
            }
            XMLDatenGenerator.o00000(element2, "meisterhandwerk", "" + bl);
            if (o00000.\u00f8O0000().super(oo0o_02, o00000.\u00d500000())) {
                string2 = string2 + " (L)";
            }
            XMLDatenGenerator.o00000(element2, "leittalent", "" + o00000.\u00f8O0000().super(oo0o_02, o00000.\u00d500000()));
            voidsuper voidsuper2 = (voidsuper)oo0o_02;
            if (voidsuper2.\u00f5\u00d60000()) {
                string2 = string2 + " (B)";
            }
            XMLDatenGenerator.o00000(element2, "basis", "" + voidsuper2.\u00f5\u00d60000());
            string2 = string2 + XMLDatenGenerator.o00000(oo0o_02);
            String string3 = string + " " + string2;
            XMLDatenGenerator.o00000(element2, "nameausfuehrlich", string3.trim());
            try {
                string = String.valueOf(t.\u00f400000((voidsuper)oo0o_02));
            }
            catch (Exception exception) {
                string = "?";
            }
            XMLDatenGenerator.o00000(element2, "wert", string);
            string = oo0o_02.getTalentprobe().o00000(0).O\u00d60000();
            string = string + "/";
            string = string + oo0o_02.getTalentprobe().o00000(1).O\u00d60000();
            string = string + "/";
            string = string + oo0o_02.getTalentprobe().o00000(2).O\u00d60000();
            XMLDatenGenerator.o00000(element2, "probe", string);
            XMLDatenGenerator.o00000(element2, "probenwerte", XMLDatenGenerator.o00000(oo0o_02.getTalentprobe()));
            XMLDatenGenerator.o00000(element2, "nameausfuehrlichmitprobe", string3 + "(" + string + ")");
            if (oo0o_02 instanceof E) {
                int n = o00000.o00000((E)oo0o_02);
                if (n != 0) {
                    XMLDatenGenerator.o00000(element2, "at", String.valueOf(n));
                } else {
                    XMLDatenGenerator.o00000(element2, "at", "");
                }
                n = o00000.new((E)oo0o_02);
                if (n != 0) {
                    XMLDatenGenerator.o00000(element2, "pa", String.valueOf(n));
                } else {
                    XMLDatenGenerator.o00000(element2, "pa", "");
                }
            }
            string = "";
            if (oo0o_02 instanceof G) {
                XMLDatenGenerator.o00000(element2, "sprachkomplexit\u00e4t", String.valueOf(((G)oo0o_02).\u00f5\u00f40000()));
                if (o00000.O\u00d20000().equals(oo0o_02)) {
                    XMLDatenGenerator.o00000(element2, "muttersprache", "true");
                }
                if (o00000.\u00f5\u00d20000() != null && o00000.\u00f5\u00d20000().equals(oo0o_02)) {
                    XMLDatenGenerator.o00000(element2, "schriftmuttersprache", "true");
                }
                if (arrayList.contains(oo0o_02)) {
                    XMLDatenGenerator.o00000(element2, "zweitlehrsprache", "true");
                }
            }
            if (oo0o_02 instanceof voidsuper) {
                XMLDatenGenerator.o00000(element2, "behinderung", voidsuper2.superclass());
                XMLDatenGenerator.o00000(element2, "mirakelplus", String.valueOf(o00000.\u00f8O0000().\u00d300000(voidsuper2)));
                XMLDatenGenerator.o00000(element2, "mirakelminus", String.valueOf(o00000.\u00f8O0000().super(voidsuper2)));
                XMLDatenGenerator.o00000(element2, "metatalent", String.valueOf(voidsuper2.isMetatalent()));
            }
            XMLDatenGenerator.o00000(element2, "bereich", oo0o_02.getArt().toString());
            XMLDatenGenerator.o00000(element2, "komplexit\u00e4t", oo0o_02.getKategorie(false).toString());
            XMLDatenGenerator.o00000(element2, "lernkomplexit\u00e4t", o00000.new(oo0o_02).toString());
            String string4 = "";
            Iterator<String> iterator = o00000.o00000(oo0o_02).iterator();
            while (iterator.hasNext()) {
                string4 = string4 + iterator.next();
                if (!iterator.hasNext()) continue;
                string4 = string4 + ", ";
            }
            XMLDatenGenerator.o00000(element2, "spezialisierungen", string4);
        }
    }

    private static void new() {
        Element element = \u00d300000.createElement("verbindungen");
        new.appendChild(element);
        for (String string : o00000.\u00d4o0000().\u00d200000()) {
            Element element2 = \u00d300000.createElement("verbindung");
            element.appendChild(element2);
            XMLDatenGenerator.o00000(element2, "name", o00000.\u00d4o0000().\u00d200000(string).\u00d300000());
            XMLDatenGenerator.o00000(element2, "so", "" + o00000.\u00d4o0000().\u00d200000(string).o00000());
            XMLDatenGenerator.o00000(element2, "beschreibung", o00000.\u00d4o0000().\u00d200000(string).new());
        }
    }

    private static void o00000(helden.framework.C.public public_, Element element) {
        block20: {
            Object object;
            block19: {
                XMLDatenGenerator.o00000(element, "bezeichner", public_.\u00f4O0000().toString());
                XMLDatenGenerator.o00000(element, "name", public_.oO0000());
                String string = public_.oO0000();
                String string2 = o00000.Stringsuper().o00000(public_);
                if (!string2.equals("")) {
                    string = string + " (" + string2 + ")";
                }
                XMLDatenGenerator.o00000(element, "kommentar", string2);
                XMLDatenGenerator.o00000(element, "namemitkommentar", string);
                XMLDatenGenerator.o00000(element, "istvorteil", String.valueOf(!public_.\u00d500000()));
                XMLDatenGenerator.o00000(element, "istnachteil", String.valueOf(public_.\u00d500000()));
                if (public_ instanceof J) {
                    XMLDatenGenerator.o00000(element, "wert", ((J)public_).ObjectString());
                }
                if (public_ instanceof helden.framework.C.OoOO.A) {
                    object = (helden.framework.C.OoOO.A)((Object)public_);
                    XMLDatenGenerator.o00000(element, "istschlechteeigenschaft", String.valueOf(object.O\u00d20000()));
                }
                if (public_ instanceof ooOO) {
                    XMLDatenGenerator.o00000(element, "istgabe", "true");
                }
                if (public_.\u00f4O0000().Object()) {
                    XMLDatenGenerator.o00000(element, "bereich", "Sonst");
                } else if (public_.\u00f4O0000().\u00d200000()) {
                    XMLDatenGenerator.o00000(element, "bereich", "Magisch");
                } else if (public_.\u00f4O0000().o00000()) {
                    XMLDatenGenerator.o00000(element, "bereich", "Geweiht");
                }
                if (public_.equals(I.\u00f5\u00f6O000)) {
                    XMLDatenGenerator.o00000(element, "bereich", "BEGABUNGMERKMAL");
                }
                if (public_.equals(I.\u00d8\u00f6O000)) {
                    XMLDatenGenerator.o00000(element, "bereich", "BEGABUNGRITUAL");
                }
                if (public_.equals(I.\u00f4\u00d20000)) {
                    XMLDatenGenerator.o00000(element, "bereich", "BEGABUNGTALENT");
                }
                if (public_.equals(I.\u00d5o0000)) {
                    XMLDatenGenerator.o00000(element, "bereich", ",BEGABUNGTALENTGRUPPE");
                }
                if (public_.equals(I.O\u00d6o000)) {
                    XMLDatenGenerator.o00000(element, "bereich", ",BEGABUNGFUERZAUBER");
                }
                if (public_.equals(I.O\u00d4O000)) {
                    XMLDatenGenerator.o00000(element, "bereich", "UNF\u00c4HIGKEITMERKMAL");
                }
                if (public_.equals(I.fordo)) {
                    XMLDatenGenerator.o00000(element, "bereich", "UNF\u00c4HIGKEITTALENT");
                }
                if (public_.equals(I.\u00d8\u00f8O000)) {
                    XMLDatenGenerator.o00000(element, "bereich", "UNF\u00c4HIGKEITTALENTGRUPPE");
                }
                if (!(public_ instanceof helden.framework.C.B)) break block19;
                object = (helden.framework.C.B)public_;
                Element element2 = \u00d300000.createElement("auswahlen");
                element.appendChild(element2);
                for (Object object2 : ((private)object).intsuper().toArray()) {
                    Element element3 = \u00d300000.createElement("auswahl");
                    element2.appendChild(element3);
                    XMLDatenGenerator.o00000(element3, "name", ((o0OO)object).public((R)object2));
                    XMLDatenGenerator.o00000(element3, "wert", ((o0OO)object).\u00d4O0000((R)object2));
                    XMLDatenGenerator.o00000(element3, "kommentar", o00000.Stringsuper().o00000(public_, object2));
                }
                break block20;
            }
            if (!(public_ instanceof M)) break block20;
            object = (M)public_;
            Element element4 = \u00d300000.createElement("auswahlen");
            element.appendChild(element4);
            for (Object object3 : ((private)object).intsuper().toArray()) {
                Element element5 = \u00d300000.createElement("auswahl");
                element4.appendChild(element5);
                XMLDatenGenerator.o00000(element5, "name", object3.toString());
                XMLDatenGenerator.o00000(element5, "kommentar", o00000.Stringsuper().o00000(public_, object3));
            }
        }
    }

    private static void o00000(Oo0O oo0O, Element element) {
        Element element2 = \u00d300000.createElement("vorteile");
        element.appendChild(element2);
        Iterator<helden.framework.C.public> iterator = oo0O.\u00d500000();
        while (iterator.hasNext()) {
            helden.framework.C.public public_ = iterator.next();
            Element element3 = \u00d300000.createElement("vorteil");
            element2.appendChild(element3);
            XMLDatenGenerator.o00000(public_, element3);
        }
    }

    private static void \u00d300000(XMLDatenGeneratorCfg xMLDatenGeneratorCfg) {
        Element element = xMLDatenGeneratorCfg.getVersion() == 1 ? \u00d300000.createElement("zauber") : \u00d300000.createElement("zauberliste");
        new.appendChild(element);
        Iterator<KonkreterZauber> iterator = o00000.\u00d5o0000().super();
        while (iterator.hasNext()) {
            KonkreterZauber konkreterZauber = iterator.next();
            Element element2 = \u00d300000.createElement("zauber");
            element.appendChild(element2);
            XMLDatenGenerator.o00000(element2, "name", konkreterZauber.getZaubername());
            XMLDatenGenerator.o00000(element2, "variante", konkreterZauber.getVariante());
            String string = "";
            string = konkreterZauber.toString();
            string = konkreterZauber.getZaubername();
            if (!konkreterZauber.getVariante().equals("")) {
                string = string + " [" + konkreterZauber.getVariante() + "]";
            }
            XMLDatenGenerator.o00000(element2, "namemitvariante", string);
            string = string + " " + XMLDatenGenerator.o00000(konkreterZauber);
            XMLDatenGenerator.o00000(element2, "nameausfuehrlich", string.trim());
            try {
                string = String.valueOf(o00000.\u00d300000(konkreterZauber));
            }
            catch (Exception exception) {
                string = "?";
            }
            XMLDatenGenerator.o00000(element2, "wert", string);
            String string2 = "";
            Iterator<String> iterator2 = o00000.o00000(konkreterZauber).iterator();
            while (iterator2.hasNext()) {
                string2 = string2 + iterator2.next();
                if (!iterator2.hasNext()) continue;
                string2 = string2 + ", ";
            }
            XMLDatenGenerator.o00000(element2, "spezialisierungen", string2);
            string = konkreterZauber.getTalentprobe().o00000(0).O\u00d60000();
            string = string + "/";
            string = string + konkreterZauber.getTalentprobe().o00000(1).O\u00d60000();
            string = string + "/";
            string = string + konkreterZauber.getTalentprobe().o00000(2).O\u00d60000();
            XMLDatenGenerator.o00000(element2, "probe", string);
            XMLDatenGenerator.o00000(element2, "probenwerte", XMLDatenGenerator.o00000(konkreterZauber.getTalentprobe()));
            XMLDatenGenerator.o00000(element2, "bereich", konkreterZauber.getArt().toString());
            XMLDatenGenerator.o00000(element2, "komplexit\u00e4t", konkreterZauber.getKategorie(false).toString());
            XMLDatenGenerator.o00000(element2, "lernkomplexit\u00e4t", o00000.new(konkreterZauber).toString());
            String string3 = String.valueOf(o00000.\u00d5o0000().\u00d200000(konkreterZauber));
            XMLDatenGenerator.o00000(element2, "hauszauber", string3);
            if (string3.equals("true")) {
                XMLDatenGenerator.o00000(element2, "hauszauberformatiert", "X");
            } else {
                XMLDatenGenerator.o00000(element2, "hauszauberformatiert", " ");
            }
            XMLDatenGenerator.o00000(element2, "repr\u00e4sentation", konkreterZauber.getRep().toString());
            XMLDatenGenerator.o00000(element2, "merkmale", konkreterZauber.getMerkmaleString());
            ZauberInfos zauberInfos = o00000.\u00d5o0000().\u00d600000(konkreterZauber);
            XMLDatenGenerator.o00000(element2, "zauberdauer", zauberInfos.getZauberdauer());
            XMLDatenGenerator.o00000(element2, "kosten", zauberInfos.getKosten());
            XMLDatenGenerator.o00000(element2, "reichweite", zauberInfos.getReichweite());
            XMLDatenGenerator.o00000(element2, "wirkungsdauer", zauberInfos.getWirkungsdauer());
            XMLDatenGenerator.o00000(element2, "anmerkung", zauberInfos.getAnmerkungen());
            Element element3 = XMLDatenGenerator.o00000(element2, "quelle", konkreterZauber.getQuelle());
            oooo_1 oooo_12 = konkreterZauber.getZauber().getQuellenObj();
            element3.setAttribute("buch", oooo_12.\u00d200000());
            element3.setAttribute("seite", "" + oooo_12.Object());
            XMLDatenGenerator.o00000(element2, "kontrollwert", o00000.\u00d5o0000().super(o00000, konkreterZauber));
            XMLDatenGenerator.o00000(element2, "mr", konkreterZauber.getModMR());
            XMLDatenGenerator.o00000(element2, "leittalent", "" + o00000.\u00d5o0000().super((oo0o_0)konkreterZauber, o00000.\u00d500000()));
        }
    }

    private static String o00000(l_0 l_02) {
        String string = "";
        string = "" + o00000.o00000(l_02.o00000(0));
        string = string + "/";
        string = string + o00000.o00000(l_02.o00000(1));
        string = string + "/";
        string = string + o00000.o00000(l_02.o00000(2));
        return string;
    }

    private static String o00000(super super_) {
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList<super> arrayList = new ArrayList<super>();
        arrayList.addAll(o00000.\u00d800000().Object(String._o.\u00d300000));
        arrayList.addAll(o00000.\u00d800000().Object(String._o.\u00d500000));
        arrayList.addAll(o00000.\u00d800000().Object(String._o.\u00d200000));
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String string = ((super)iterator.next()).toString();
            int n = string.indexOf(":");
            if (n == -1) {
                stringBuffer.append(string);
            } else {
                stringBuffer.append(string.substring(0, n));
            }
            if (!iterator.hasNext()) continue;
            stringBuffer.append(", ");
        }
        return stringBuffer.toString();
    }

    private static String o00000(oo0o_0 oo0o_02) {
        String string = "";
        ArrayList<String> arrayList = o00000.o00000(oo0o_02);
        if (arrayList != null && arrayList.size() > 0) {
            string = string + " (";
            Iterator<String> iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                String string2 = iterator.next();
                string = string + string2;
                if (!iterator.hasNext()) continue;
                string = string + ", ";
            }
            string = string + ")";
        }
        return string;
    }

    private static void new(K k2, int n) {
        Element element = \u00d300000.createElement("kampfsets");
        new.appendChild(element);
        for (int i2 = 0; i2 < 3; ++i2) {
            Boolean[] booleanArray = new Boolean[]{true, false};
            int n2 = booleanArray.length;
            for (int i3 = 0; i3 < n2; ++i3) {
                Object object;
                boolean bl = booleanArray[i3];
                oO0O oO0O2 = o00000.o00000(i2);
                oO0O2.o00000(k2, bl);
                Element element2 = \u00d300000.createElement("kampfset");
                element2.setAttribute("nr", "" + (i2 + 1));
                element2.setAttribute("tzm", "" + bl);
                element2.setAttribute("defaultrsmodel", "" + (Einstellungen.getInstance().getSeitenEinstellungen(o00000.\u00f4o0000()).isZonenRuestung() == bl));
                element.appendChild(element2);
                Element element3 = \u00d300000.createElement("raufen");
                element2.appendChild(element3);
                XMLDatenGenerator.o00000(element3, "at", "" + oO0O2.\u00f6O0000());
                XMLDatenGenerator.o00000(element3, "pa", "" + oO0O2.\u00d800000());
                XMLDatenGenerator.o00000(element3, "tp", "" + oO0O2.null());
                Element element4 = \u00d300000.createElement("ringen");
                element2.appendChild(element4);
                XMLDatenGenerator.o00000(element4, "at", "" + oO0O2.\u00d5O0000());
                XMLDatenGenerator.o00000(element4, "pa", "" + oO0O2.String());
                XMLDatenGenerator.o00000(element4, "tp", "" + oO0O2.\u00f600000());
                XMLDatenGenerator.o00000(element2, "ausweichen", "" + oO0O2.\u00d2O0000());
                int n3 = 0;
                if (k2.new(while.iffloatObject.toString())) {
                    n3 += 3;
                    if (k2.new(while.\u00d2\u00d6\u00d6000.toString())) {
                        n3 += 3;
                        if (k2.new(while.returnfloatObject.toString())) {
                            n3 += 3;
                        }
                    }
                }
                XMLDatenGenerator.o00000(element2, "ausweichenausweichenmod", "" + n3);
                XMLDatenGenerator.o00000(element2, "ausweichenakrobatikmod", "" + oO0O2.\u00d500000());
                XMLDatenGenerator.o00000(element2, "ausweichenmod", "" + (oO0O2.\u00d500000() + n3));
                XMLDatenGenerator.o00000(element2, "geschwindigkeitinklbe", "" + oO0O2.returnsuper());
                XMLDatenGenerator.o00000(element2, "ini", "" + oO0O2.private());
                if (!bl) {
                    object = \u00d300000.createElement("ruestungeinfach");
                    element2.appendChild((Node)object);
                    XMLDatenGenerator.o00000((Element)object, "gesamt", "" + oO0O2.for());
                    XMLDatenGenerator.o00000((Element)object, "behinderung", "" + oO0O2.\u00d300000());
                } else {
                    object = oO0O2.\u00f800000();
                    if (object != null) {
                        Element element5 = \u00d300000.createElement("ruestungzonen");
                        element2.appendChild(element5);
                        XMLDatenGenerator.o00000(element5, "kopf", "" + ((helden.framework.E.C.B)object).\u00f8O0000());
                        XMLDatenGenerator.o00000(element5, "brust", "" + ((helden.framework.E.C.B)object).\u00f800000());
                        XMLDatenGenerator.o00000(element5, "ruecken", "" + ((helden.framework.E.C.B)object).newsuper());
                        XMLDatenGenerator.o00000(element5, "gesamt", "" + ((helden.framework.E.C.B)object).oO0000());
                        XMLDatenGenerator.o00000(element5, "bauch", "" + ((helden.framework.E.C.B)object).\u00f6O0000());
                        XMLDatenGenerator.o00000(element5, "linkerarm", "" + ((helden.framework.E.C.B)object).\u00d6O0000());
                        XMLDatenGenerator.o00000(element5, "rechterarm", "" + ((helden.framework.E.C.B)object).\u00d8O0000());
                        XMLDatenGenerator.o00000(element5, "linkesbein", "" + ((helden.framework.E.C.B)object).\u00f500000());
                        XMLDatenGenerator.o00000(element5, "rechtesbein", "" + ((helden.framework.E.C.B)object).\u00d5O0000());
                        XMLDatenGenerator.o00000(element5, "gesamtschutz", "" + ((helden.framework.E.C.B)object).\u00d2O0000());
                        XMLDatenGenerator.o00000(element5, "gesamtzonenschutz", "" + ((helden.framework.E.C.B)object).oO0000());
                        XMLDatenGenerator.o00000(element5, "behinderung", "" + ((helden.framework.E.C.B)object).\u00f600000());
                    }
                }
                boolean bl2 = XMLDatenGenerator.o00000(i2, element2, false, n);
                boolean bl3 = XMLDatenGenerator.\u00d300000(i2, element2, false);
                boolean bl4 = XMLDatenGenerator.o00000(i2, element2, false);
                boolean bl5 = XMLDatenGenerator.new(i2, element2, false);
                element2.setAttribute("inbenutzung", "" + (bl2 || bl3 || bl4 || bl5));
            }
            o00000.o00000(i2).String(k2);
        }
    }

    private static String o00000(String string) {
        return string.replace("\u00e4", "ae").replace("\u00fc", "ue").replace("\u00f6", "oe");
    }

    private static void o00000(K k2, int n) {
        for (int i2 = 0; i2 < 3; ++i2) {
            oO0O oO0O2 = o00000.o00000(i2);
            oO0O2.o00000(k2, Einstellungen.getInstance().getSeitenEinstellungen(o00000.\u00f4o0000()).isZonenRuestung());
            Element element = \u00d300000.createElement("set");
            XMLDatenGenerator.makeDeprecated(element);
            element.setAttribute("nr", "" + (i2 + 1));
            new.appendChild(element);
            Element element2 = \u00d300000.createElement("raufen");
            element.appendChild(element2);
            XMLDatenGenerator.o00000(element2, "at", "" + oO0O2.\u00f6O0000());
            XMLDatenGenerator.o00000(element2, "pa", "" + oO0O2.\u00d800000());
            XMLDatenGenerator.o00000(element2, "tp", "" + oO0O2.null());
            Element element3 = \u00d300000.createElement("ringen");
            element.appendChild(element3);
            XMLDatenGenerator.o00000(element3, "at", "" + oO0O2.\u00d5O0000());
            XMLDatenGenerator.o00000(element3, "pa", "" + oO0O2.String());
            XMLDatenGenerator.o00000(element3, "tp", "" + oO0O2.\u00f600000());
            XMLDatenGenerator.o00000(element, "ausweichen", "" + oO0O2.\u00d2O0000());
            int n2 = 0;
            if (k2.new(while.iffloatObject.toString())) {
                n2 += 3;
                if (k2.new(while.\u00d2\u00d6\u00d6000.toString())) {
                    n2 += 3;
                    if (k2.new(while.returnfloatObject.toString())) {
                        n2 += 3;
                    }
                }
            }
            XMLDatenGenerator.o00000(element, "ausweichenausweichenmod", "" + n2);
            XMLDatenGenerator.o00000(element, "ausweichenakrobatikmod", "" + oO0O2.\u00d500000());
            XMLDatenGenerator.o00000(element, "ausweichenmod", "" + (oO0O2.\u00d500000() + n2));
            XMLDatenGenerator.o00000(element, "geschwindigkeitinklbe", "" + oO0O2.returnsuper());
            XMLDatenGenerator.o00000(element, "ini", "" + oO0O2.private());
            oO0O2.o00000(k2, false);
            Element element4 = \u00d300000.createElement("ruestung");
            element.appendChild(element4);
            XMLDatenGenerator.o00000(element4, "gesamt", "" + oO0O2.for());
            XMLDatenGenerator.o00000(element4, "behinderung", "" + oO0O2.\u00d300000());
            oO0O2.o00000(k2, true);
            helden.framework.E.C.B b = oO0O2.\u00f800000();
            if (b != null) {
                Element element5 = \u00d300000.createElement("zonenruestung");
                element.appendChild(element5);
                XMLDatenGenerator.o00000(element5, "kopf", "" + b.\u00f8O0000());
                XMLDatenGenerator.o00000(element5, "brust", "" + b.\u00f800000());
                XMLDatenGenerator.o00000(element5, "ruecken", "" + b.newsuper());
                XMLDatenGenerator.o00000(element5, "gesamt", "" + b.oO0000());
                XMLDatenGenerator.o00000(element5, "bauch", "" + b.\u00f6O0000());
                XMLDatenGenerator.o00000(element5, "linkerarm", "" + b.\u00d6O0000());
                XMLDatenGenerator.o00000(element5, "rechterarm", "" + b.\u00d8O0000());
                XMLDatenGenerator.o00000(element5, "linkesbein", "" + b.\u00f500000());
                XMLDatenGenerator.o00000(element5, "rechtesbein", "" + b.\u00d5O0000());
                XMLDatenGenerator.o00000(element5, "gesamtschutz", "" + b.\u00d2O0000());
                XMLDatenGenerator.o00000(element5, "gesamtzonenschutz", "" + b.oO0000());
                XMLDatenGenerator.o00000(element5, "behinderung", "" + b.\u00f600000());
            }
            oO0O2.o00000(k2, Einstellungen.getInstance().getSeitenEinstellungen(o00000.\u00f4o0000()).isZonenRuestung());
            boolean bl = XMLDatenGenerator.o00000(i2, element, false, n);
            boolean bl2 = XMLDatenGenerator.\u00d300000(i2, element, false);
            boolean bl3 = XMLDatenGenerator.o00000(i2, element, false);
            boolean bl4 = XMLDatenGenerator.new(i2, element, false);
            element.setAttribute("inbenutzung", "" + (bl || bl2 || bl3 || bl4));
            oO0O2.String(k2);
        }
    }

    private XMLDatenGenerator() {
    }
}

