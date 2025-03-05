/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.werkzeug;

import helden.framework.C.public;
import helden.framework.D.P;
import helden.framework.Geschlecht;
import helden.framework.OoOO.voidsuper;
import helden.framework.int.OooO;
import helden.framework.int.super;
import helden.framework.oooo.a_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.gui.components.MsgDialogWithTextarea;
import helden.gui.erschaffung.werkzeug.HEW2;
import helden.gui.erschaffung.werkzeug.HEW2Zauber;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.ProcessingInstruction;

public final class TestTemplate {
    private static HEW2 o00000;

    public static void run(HEW2 hEW2) {
        String string = "";
        try {
            Object object;
            Element element;
            o00000 = hEW2;
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            Document document = documentBuilderFactory.newDocumentBuilder().newDocument();
            ProcessingInstruction processingInstruction = document.createProcessingInstruction("xml-stylesheet", "type=\"text/xsl\" ");
            document.appendChild(processingInstruction);
            Element element2 = document.createElement("held");
            document.appendChild(element2);
            element2.setAttribute("version", "V1");
            Element element3 = document.createElement("name");
            element2.appendChild(element3);
            element3.setAttribute("name", o00000.getName());
            Element element4 = document.createElement("rkp");
            element2.appendChild(element4);
            if (o00000.getGeschlecht().equals((Object)Geschlecht.\u00d400000)) {
                element4.setAttribute("g", "m");
            } else {
                element4.setAttribute("g", "w");
            }
            element4.setAttribute("r", o00000.getRasse().toString());
            element4.setAttribute("k", TestTemplate.o00000(o00000.getKultur()));
            element4.setAttribute("p", TestTemplate.o00000(o00000.getHauptProfession()));
            for (b_0 iterator : b_0.o\u00d60000()) {
                element = document.createElement("eigenschaft");
                element2.appendChild(element);
                element.setAttribute("name", iterator.toString());
                element.setAttribute("wert", "" + o00000.getHeld().o00000(iterator));
            }
            for (public public_ : o00000.getHswVorteile().getVorteile()) {
                if (o00000.getHswVorteile().isAuto(public_)) continue;
                element = document.createElement("addvorteil");
                object = "Vorteile/";
                if (public_.\u00d500000()) {
                    object = "Nachteil/";
                }
                object = (String)object + public_.toString();
                element2.appendChild(element);
                element.setAttribute("name", (String)object);
            }
            for (P p2 : o00000.getHeld().\u00f5O0000().\u00f600000()) {
                if (o00000.getSf().isAuto(p2)) continue;
                element = document.createElement("addsf");
                object = "????/" + p2.toString();
                element2.appendChild(element);
                element.setAttribute("name", (String)object);
            }
            for (oo0o_0 oo0o_02 : o00000.getTalente().getUserAktivierteTalente()) {
                element = document.createElement("addtalent");
                element2.appendChild(element);
                element.setAttribute("name", oo0o_02.toString());
            }
            for (voidsuper voidsuper2 : o00000.getHeld().\u00f8O0000().\u00d200000()) {
                int n = o00000.getTalente().getTalentWert(voidsuper2);
                if (n <= o00000.getTalente().getMinimalwert(voidsuper2)) continue;
                object = document.createElement("werttalent");
                element2.appendChild((Node)object);
                object.setAttribute("name", voidsuper2.toString());
                object.setAttribute("wert", String.valueOf(n));
            }
            HEW2Zauber hEW2Zauber = o00000.getHswZauber();
            for (KonkreterZauber konkreterZauber : o00000.getHeld().\u00d5o0000().\u00d200000()) {
                int n;
                if (!hEW2Zauber.isAutoTalent(konkreterZauber)) {
                    Element element5 = document.createElement("addzauber");
                    element2.appendChild(element5);
                    element5.setAttribute("name", konkreterZauber.getZaubername());
                    element5.setAttribute("rep", konkreterZauber.getRep().super());
                }
                if ((n = hEW2Zauber.getTalentWert(konkreterZauber)) <= hEW2Zauber.getMinimalwert(konkreterZauber)) continue;
                Element element6 = document.createElement("wertzauber");
                element2.appendChild(element6);
                element6.setAttribute("name", konkreterZauber.getZaubername());
                element6.setAttribute("rep", konkreterZauber.getRep().super());
                element6.setAttribute("wert", String.valueOf(n));
            }
            TestTemplate.o00000(document, element2, hEW2Zauber);
            string = a_0.o00000(document);
        }
        catch (ParserConfigurationException parserConfigurationException) {
            string = parserConfigurationException.getMessage();
            parserConfigurationException.printStackTrace();
        }
        new MsgDialogWithTextarea("", string).setVisible(true);
    }

    private static String o00000(OooO oooO2) {
        if (oooO2.getGewaehlteVarianten().size() > 1) {
            System.out.println("Zuviele Varianten gesetzt!");
        }
        if (oooO2.getGewaehlteVarianten().size() > 0) {
            OooO oooO3 = o00000.cloneKultur(oooO2, o00000.getGeschlecht());
            return oooO3.toString() + "/" + oooO2.getGewaehlteVarianten().get(0).toString();
        }
        return oooO2.toString();
    }

    private static String o00000(super super_) {
        if (super_.getGewaehlteVarianten().size() > 1) {
            System.out.println("Zuviele Varianten gesetzt!");
        }
        if (super_.getGewaehlteVarianten().size() > 0) {
            super super_2 = o00000.cloneProfession(super_, o00000.getGeschlecht(), o00000.getKultur());
            return super_2.toString() + "/" + super_.getGewaehlteVarianten().get(0).toString();
        }
        return super_.toString();
    }

    private static void o00000(Document document, Element element, HEW2Zauber hEW2Zauber) {
        Element element2;
        for (KonkreterZauber konkreterZauber : hEW2Zauber.getVrAktivierteZauber()) {
            element2 = document.createElement("setvr");
            element.appendChild(element2);
            element2.setAttribute("name", konkreterZauber.getZaubername());
            element2.setAttribute("rep", konkreterZauber.getRep().super());
            element2.setAttribute("wert", "true");
        }
        if (hEW2Zauber.getVrHauszauber() > 0) {
            for (KonkreterZauber konkreterZauber : hEW2Zauber.\u00d2O0000.\u00d5o0000().\u00d200000()) {
                if (!hEW2Zauber.\u00d2O0000.\u00d5o0000().\u00d200000(konkreterZauber)) continue;
                element2 = document.createElement("sethz");
                element.appendChild(element2);
                element2.setAttribute("name", konkreterZauber.getZaubername());
                element2.setAttribute("rep", konkreterZauber.getRep().super());
                element2.setAttribute("wert", "true");
            }
        }
    }

    private TestTemplate() {
    }
}

