/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.O0OO.B;

import helden.Version;
import helden.framework.Einstellungen;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.persistenz.ModsDatenParser;
import helden.framework.held.persistenz.XMLParser;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.gui.O0OO.ooOO.Object;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class C
extends helden.gui.O0OO.C {
    private static C new;

    public static C \u00d300000() {
        if (new == null) {
            new = new C();
        }
        return new;
    }

    protected boolean o00000(Object object) throws ParserConfigurationException, TransformerException, IOException {
        boolean bl;
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        Document document = documentBuilderFactory.newDocumentBuilder().newDocument();
        ProcessingInstruction processingInstruction = document.createProcessingInstruction("xml-stylesheet", "type=\"text/xsl\" href=\"helden.xsl\"");
        document.appendChild(processingInstruction);
        Element element = document.createElement("eigenestalent");
        element.setAttribute("Version", Version.getVersion());
        document.appendChild(element);
        boolean bl2 = oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000.equals(object.\u00f600000());
        if (bl2 && !object.\u00d2O0000().startsWith("Sprachen kennen ")) {
            throw new RuntimeException("Sprachen m\u00fcssen mit 'Sprachen kennen ' beginnen!");
        }
        boolean bl3 = oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f600000.equals(object.\u00f600000());
        if (bl3 && !object.\u00d2O0000().startsWith("Lesen/Schreiben ")) {
            throw new RuntimeException("Schriften m\u00fcssen mit 'Lesen/Schreiben ' beginnen!");
        }
        boolean bl4 = oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d6O0000.equals(object.\u00f600000()) || oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.do.equals(object.\u00f600000());
        Element element2 = document.createElement("beschreibung");
        Text text = document.createTextNode(object.\u00d300000());
        element2.appendChild(text);
        element.appendChild(element2);
        this.o00000(document, "urheber", object.o00000(), element);
        this.o00000(document, "kontakt", object.String(), element);
        this.o00000(document, "talentname", object.\u00d2O0000(), element);
        this.o00000(document, "talentart", object.\u00f600000().toString(), element);
        boolean bl5 = bl = !bl2 && !bl3 && !bl4;
        if (bl) {
            this.o00000(document, "probe1", object.\u00d5O0000().toString(), element);
            this.o00000(document, "probe2", object.\u00f800000().toString(), element);
            this.o00000(document, "probe3", object.\u00d800000().toString(), element);
        }
        if (oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.Oo0000.equals(object.\u00f600000())) {
            this.o00000(document, "behinderungsstring", object.for(), element);
        }
        if (oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d6O0000.equals(object.\u00f600000()) || oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.do.equals(object.\u00f600000())) {
            this.o00000(document, "behinderungszahl", "" + object.\u00d3O0000(), element);
            this.o00000(document, "abkuerzung", object.private(), element);
        }
        if (oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d6O0000.equals(object.\u00f600000())) {
            this.o00000(document, "hatparade", "" + object.oO0000(), element);
        }
        if (bl2 || bl3) {
            this.o00000(document, "komplexitaet", "" + object.\u00d600000(), element);
        }
        if (bl4 || bl2 || bl3) {
            this.o00000(document, "steigerungskategorie", "" + object.null().\u00d400000(), element);
        }
        if (bl2) {
            this.o00000(document, "sprachfamilie", "" + object.\u00f500000(), element);
        }
        XMLParser xMLParser = new XMLParser(null);
        voidsuper voidsuper2 = ModsDatenParser.getInstance().einlesenTalent(element);
        xMLParser.saveXML(element, voidsuper2.getID(), Einstellungen.getInstance().getPfade().getPfad("mods") + "/Talent");
        N.floatsuper().\u00d200000(voidsuper2);
        return true;
    }
}

