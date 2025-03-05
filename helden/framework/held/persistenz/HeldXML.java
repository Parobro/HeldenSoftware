/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.persistenz;

import helden.framework.C.public;
import helden.framework.D.for;
import helden.framework.E.C.A;
import helden.framework.E.C.B;
import helden.framework.E.C.F;
import helden.framework.E.C.I;
import helden.framework.E.C.M;
import helden.framework.E.C.void;
import helden.framework.E.O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.E.OoOO.D;
import helden.framework.E.OoOO.oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.E.if;
import helden.framework.OOoO.S;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.U;
import helden.framework.OoOO.interface;
import helden.framework.OoOO.voidsuper;
import helden.framework.e.oooo_0;
import helden.framework.geld.Muenze;
import helden.framework.gmod.GMod;
import helden.framework.held.K;
import helden.framework.held.L;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.held.classsuper;
import helden.framework.held.oO0O;
import helden.framework.held.persistenz.BasisXMLPersistierer;
import helden.framework.held.persistenz.ModVerwaltung;
import helden.framework.int.C;
import helden.framework.int.OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.int.OooO;
import helden.framework.int.P;
import helden.framework.int.String;
import helden.framework.int.super;
import helden.framework.oooo.b_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.settings.Setting;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import helden.framework.zauber.ZauberInfos;
import helden.model.kultur.EigeneKultur;
import helden.model.profession.EigeneProfession;
import helden.model.rasse.EigeneRasse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class HeldXML {
    private K \u00d300000;
    private Document \u00d200000;
    private Element o00000;
    private BasisXMLPersistierer \u00d500000;
    private ModVerwaltung String;

    public HeldXML(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, Document document) {
        this.\u00d300000 = (K)oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2;
        this.\u00d200000 = document;
        this.\u00d500000 = BasisXMLPersistierer.getInstance();
        this.String = new ModVerwaltung(document);
    }

    public Element addTierAngriff(Element element, helden.framework.E.OoOO.E e) {
        Element element2 = this.\u00d500000.createValueNode("angriff", element);
        element2.setAttribute("name", e.\u00d400000());
        this.\u00d500000.createValueNode("at", element2).setAttribute("value", "" + e.o00000());
        this.\u00d500000.createValueNode("pa", element2).setAttribute("value", "" + e.new());
        this.addWurzelmitKonstante(element2, "tp", e.\u00d800000());
        for (oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 : e.return()) {
            Element element3 = this.\u00d500000.createValueNode("dk", element2);
            element3.setAttribute("value", oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00d600000());
        }
        return element2;
    }

    public Element addWurzelmitKonstante(Element element, String string, S s) {
        Element element2 = element.getOwnerDocument().createElement(string);
        element2.setAttribute("mul", "" + s.\u00d400000());
        element2.setAttribute("w", "" + s.Object());
        element2.setAttribute("sum", "" + s.o00000());
        element.appendChild(element2);
        return element2;
    }

    public Element getFernkampfwaffeXMLDiv(helden.framework.E.C.E e, helden.framework.E.C.E e2, Element element) {
        Object object;
        boolean bl = false;
        if (e == null) {
            return null;
        }
        if (e2.\u00d5o0000() != e.\u00d5o0000()) {
            bl = true;
            object = element.getOwnerDocument().createElement("laden");
            object.setAttribute("aktionen", "" + e.\u00d5o0000());
            element.appendChild((Node)object);
        }
        if (e2.whilesuper() != e.whilesuper()) {
            bl = true;
            object = element.getOwnerDocument().createElement("munition");
            object.setAttribute("art", "" + F.\u00d8O0000(e.whilesuper()));
            element.appendChild((Node)object);
        }
        if (e2.\u00f5o0000() != e.\u00f5o0000()) {
            bl = true;
            for (E e3 : e.\u00f5o0000()) {
                Element element2 = element.getOwnerDocument().createElement("talente");
                BasisXMLPersistierer.getInstance().addTalentInfo(element2, e3, "kampftalent", this.String);
                element.appendChild(element2);
            }
        }
        if (e2.\u00d6o0000().o00000(0) != e.\u00d6o0000().o00000(0) || e2.\u00d6o0000().o00000(1) != e.\u00d6o0000().o00000(1) || e2.\u00d6o0000().o00000(2) != e.\u00d6o0000().o00000(2) || e2.\u00d6o0000().o00000(3) != e.\u00d6o0000().o00000(3) || e2.\u00d6o0000().o00000(4) != e.\u00d6o0000().o00000(4)) {
            bl = true;
            object = element.getOwnerDocument().createElement("entfernung");
            object.setAttribute("E0", "" + e.\u00d6o0000().o00000(0));
            object.setAttribute("E1", "" + e.\u00d6o0000().o00000(1));
            object.setAttribute("E2", "" + e.\u00d6o0000().o00000(2));
            object.setAttribute("E3", "" + e.\u00d6o0000().o00000(3));
            object.setAttribute("E4", "" + e.\u00d6o0000().o00000(4));
            element.appendChild((Node)object);
        }
        if (e2.\u00f6o0000().o00000(0) != e.\u00f6o0000().o00000(0) || e2.\u00f6o0000().o00000(1) != e.\u00f6o0000().o00000(1) || e2.\u00f6o0000().o00000(2) != e.\u00f6o0000().o00000(2) || e2.\u00f6o0000().o00000(3) != e.\u00f6o0000().o00000(3) || e2.\u00f6o0000().o00000(4) != e.\u00f6o0000().o00000(4)) {
            bl = true;
            object = element.getOwnerDocument().createElement("tpmod");
            object.setAttribute("M0", "" + e.\u00f6o0000().o00000(0));
            object.setAttribute("M1", "" + e.\u00f6o0000().o00000(1));
            object.setAttribute("M2", "" + e.\u00f6o0000().o00000(2));
            object.setAttribute("M3", "" + e.\u00f6o0000().o00000(3));
            object.setAttribute("M4", "" + e.\u00f6o0000().o00000(4));
            element.appendChild((Node)object);
        }
        if (e2.\u00d8o0000().\u00d400000() != e.\u00d8o0000().\u00d400000() || e2.\u00d8o0000().Object() != e.\u00d8o0000().Object() || e2.\u00d8o0000().o00000() != e.\u00d8o0000().o00000()) {
            bl = true;
            object = element.getOwnerDocument().createElement("trefferpunkte");
            object.setAttribute("mul", "" + e.\u00d8o0000().\u00d400000());
            object.setAttribute("w", "" + e.\u00d8o0000().Object());
            object.setAttribute("sum", "" + e.\u00d8o0000().o00000());
            element.appendChild((Node)object);
        }
        if (bl) {
            return element;
        }
        return null;
    }

    public Element getGegenstandselement(helden.framework.E.F f2, int n) {
        Object object;
        Element element;
        Object object2;
        helden.framework.E.F f3 = O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d400000().o00000(f2.toString());
        Element element2 = this.\u00d200000.createElement("gegenstand");
        element2.setAttribute("name", f2.toString());
        element2.setAttribute("anzahl", "" + f2.\u00f500000());
        element2.setAttribute("slot", "" + n);
        Iterator<helden.framework.E.A> iterator = f2.\u00d500000().iterator();
        if (f3.Object() != f2.Object() || f3.oO0000() != f2.oO0000() || !f2.toString().equals(f2.OO0000())) {
            object2 = this.\u00d200000.createElement("modallgemein");
            element = this.\u00d200000.createElement("gewicht");
            element.setAttribute("value", "" + f2.Object());
            object2.appendChild(element);
            object = this.\u00d200000.createElement("preis");
            object.setAttribute("value", "" + f2.oO0000());
            object2.appendChild((Node)object);
            Element element3 = this.\u00d200000.createElement("name");
            element3.setAttribute("value", "" + f2.OO0000());
            object2.appendChild(element3);
            element2.appendChild((Node)object2);
        }
        block15: while (iterator.hasNext()) {
            object2 = iterator.next();
            element = null;
            switch (1.super[((Enum)object2).ordinal()]) {
                case 1: {
                    for (int i2 = 0; i2 < f2.Object(helden.framework.E.B.\u00d400000); ++i2) {
                        element = this.o00000((A)f2.o00000((helden.framework.E.A)((Object)object2), i2), (A)f3.o00000((helden.framework.E.A)((Object)object2), i2), this.\u00d200000.createElement(helden.framework.E.B.super((helden.framework.E.A)((Object)object2))), i2);
                        if (element == null) continue;
                        element2.appendChild(element);
                    }
                    continue block15;
                }
                case 2: {
                    element = this.getFernkampfwaffeXMLDiv((helden.framework.E.C.E)f2.o00000((helden.framework.E.A)((Object)object2), 0), (helden.framework.E.C.E)f3.o00000((helden.framework.E.A)((Object)object2), 0), this.\u00d200000.createElement(helden.framework.E.B.super((helden.framework.E.A)((Object)object2))));
                    if (element == null) continue block15;
                    element2.appendChild(element);
                    break;
                }
                case 3: {
                    element = this.o00000((void)f2.o00000((helden.framework.E.A)((Object)object2), 0), (void)f3.o00000((helden.framework.E.A)((Object)object2), 0), this.\u00d200000.createElement(helden.framework.E.B.super((helden.framework.E.A)((Object)object2))));
                    if (element == null) continue block15;
                    element2.appendChild(element);
                    break;
                }
                case 4: {
                    element = this.o00000((B)f2.o00000((helden.framework.E.A)((Object)object2), 0), (B)f3.o00000((helden.framework.E.A)((Object)object2), 0), this.\u00d200000.createElement(helden.framework.E.B.super((helden.framework.E.A)((Object)object2))));
                    if (element == null) continue block15;
                    element2.appendChild(element);
                    break;
                }
                case 5: {
                    object = helden.framework.E.B.super((helden.framework.E.A)((Object)object2));
                    element = this.o00000((I)f2.o00000((helden.framework.E.A)((Object)object2), 0), this.\u00d200000.createElement((String)object));
                    if (element == null) continue block15;
                    element2.appendChild(element);
                    break;
                }
                case 6: {
                    element = this.o00000((helden.framework.E.C.K)f2.o00000((helden.framework.E.A)((Object)object2), 0), this.\u00d200000.createElement(helden.framework.E.B.super((helden.framework.E.A)((Object)object2))));
                    if (element == null) continue block15;
                    element2.appendChild(element);
                    break;
                }
                case 7: {
                    break;
                }
                case 8: {
                    break;
                }
                case 9: {
                    break;
                }
                case 10: {
                    break;
                }
                case 11: {
                    break;
                }
                case 12: {
                    break;
                }
                case 13: {
                    element = this.o00000(this.String, (M)f2.o00000((helden.framework.E.A)((Object)object2), 0), this.\u00d200000.createElement(helden.framework.E.B.super((helden.framework.E.A)((Object)object2))));
                    if (element == null) continue block15;
                    element2.appendChild(element);
                    break;
                }
                default: {
                    throw new IllegalArgumentException("GegenstandsArt " + object2 + " gibt es nicht");
                }
            }
        }
        return element2;
    }

    public Element getXMLElement() {
        this.o00000 = this.\u00d200000.createElement("held");
        Element element = this.\u00d200000.createElement("mods");
        this.o00000.appendChild(element);
        Element element2 = this.\u00d200000.createElement("basis");
        this.o00000.appendChild(element2);
        this.o00000(element2, this.o00000);
        this.oO0000(element2);
        this.\u00f800000(element2);
        Element element3 = this.\u00d200000.createElement("eigenschaften");
        this.o00000.appendChild(element3);
        this.\u00d3O0000(element3);
        Element element4 = this.\u00d200000.createElement("vt");
        this.o00000.appendChild(element4);
        this.\u00f600000(element4);
        Element element5 = this.\u00d200000.createElement("sf");
        this.o00000.appendChild(element5);
        this.\u00d500000(element5);
        this.\u00f500000(this.o00000);
        Element element6 = this.\u00d200000.createElement("talentliste");
        this.o00000.appendChild(element6);
        this.\u00d600000(element6);
        Element element7 = this.\u00d200000.createElement("zauberliste");
        this.o00000.appendChild(element7);
        this.String(element7);
        Element element8 = this.\u00d200000.createElement("kampf");
        this.o00000.appendChild(element8);
        this.\u00d300000(element8);
        Element element9 = this.\u00d200000.createElement("gegenst\u00e4nde");
        this.o00000.appendChild(element9);
        this.o00000(element9);
        Element element10 = this.\u00d200000.createElement("BoniWaffenlos");
        this.private(element10);
        this.o00000.appendChild(element10);
        Element element11 = this.\u00d200000.createElement("kommentare");
        this.\u00d200000(element11);
        this.o00000.appendChild(element11);
        Element element12 = this.\u00d200000.createElement("ausr\u00fcstungen");
        this.o00000.appendChild(element12);
        if (this.\u00d300000.o00000(0).o00000() || this.\u00d300000.o00000(0).\u00d3O0000()) {
            this.o00000(element12, 0);
        }
        if (this.\u00d300000.o00000(1).o00000() || this.\u00d300000.o00000(1).\u00d3O0000()) {
            this.o00000(element12, 1);
        }
        if (this.\u00d300000.o00000(2).o00000() || this.\u00d300000.o00000(2).\u00d3O0000()) {
            this.o00000(element12, 2);
        }
        Element element13 = this.\u00d200000.createElement("verbindungen");
        this.o00000.appendChild(element13);
        this.\u00d800000(element13);
        this.\u00d2O0000(this.o00000);
        this.for(this.o00000);
        this.null(element);
        this.o00000();
        return this.o00000;
    }

    private void null(Element element) {
        for (Map.Entry<String, Node> entry : this.String.getAll()) {
            Node node = this.\u00d200000.importNode(entry.getValue(), true);
            element.appendChild(node);
            Element element2 = (Element)node;
            element2.setAttribute("id", entry.getKey());
        }
    }

    private void o00000() {
        Element element = this.\u00d200000.createElement("plugindata");
        this.o00000.appendChild(element);
        for (Map.Entry<String, String> entry : this.\u00d300000.\u00d4\u00d50000().entrySet()) {
            Element element2 = this.\u00d500000.createValueNode("data", element);
            element2.setAttribute("name", entry.getKey());
            element2.setTextContent(entry.getValue());
        }
    }

    private void o00000(Element element, oo0o_0 oo0o_02) {
        BasisXMLPersistierer.getInstance().addTalentInfo(element, oo0o_02, "name", this.String);
    }

    private void o00000(OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, Element element) {
        for (P p2 : ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.getGewaehlteVarianten()) {
            Element element2 = this.\u00d200000.createElement("variante");
            element2.setAttribute("name", p2.toString());
            if (p2 instanceof C) {
                element2.setAttribute("id", ((C)p2).o\u00f60000());
            }
            element.appendChild(element2);
        }
    }

    private void oO0000(Element element) {
        Element element2 = this.\u00d200000.createElement("abenteuerpunkte");
        element2.setAttribute("value", "" + this.\u00d300000.o\u00d30000());
        element.appendChild(element2);
        Element element3 = this.\u00d200000.createElement("freieabenteuerpunkte");
        element3.setAttribute("value", "" + this.\u00d300000.\u00d400000());
        element.appendChild(element3);
    }

    private void o00000(Element element, helden.framework.int.String string) {
        for (String._o _o2 : String._o.values()) {
            ArrayList<super> arrayList = string.Object(_o2);
            if (arrayList == null) continue;
            for (super super_ : arrayList) {
                b_0 b_02;
                Element element2 = this.\u00d200000.createElement("ausbildung");
                element2.setAttribute("name", this.o00000(super_));
                element2.setAttribute("string", super_.toString());
                element2.setAttribute("art", _o2.toString());
                if (_o2.equals((Object)String._o.\u00d300000)) {
                    element2.setAttribute("tarnidentitaet", this.\u00d300000.thissuper().\u00d300000());
                }
                if (super_.istZweitLehrspracheGewaehlt() && super_.getZweitLehrsprache() != null) {
                    if (super_.getZweitLehrsprache().size() > 1) {
                        throw new IllegalArgumentException("Mehr als eine gew\u00e4hlte Zweit- bzw. Lehrsprache!");
                    }
                    if (super_.getZweitLehrsprache().size() == 1) {
                        element2.setAttribute("zweitsprache", super_.getZweitLehrsprache().get(0).toString());
                    }
                }
                if ((b_02 = super_.getModifizierteEigenschaft()) != null) {
                    element2.appendChild(this.o00000(b_02));
                }
                this.o00000(super_, element2);
                element.appendChild(element2);
                if (!(super_ instanceof EigeneProfession)) continue;
                EigeneProfession eigeneProfession = (EigeneProfession)super_;
                element2.setAttribute("id", eigeneProfession.getID());
                ArrayList<C> arrayList2 = new ArrayList<C>();
                arrayList2.add(eigeneProfession.getHauptVariante());
                arrayList2.addAll(eigeneProfession.getHauptVariante().floatnull());
                for (C c : arrayList2) {
                    this.String.add(c);
                }
            }
        }
    }

    private void private(Element element) {
        for (helden.framework.D.P p2 : this.\u00d300000.\u00d5\u00d20000().keySet()) {
            Element element2 = this.\u00d200000.createElement("boniSF");
            element2.setAttribute("sf", p2.toString());
            String string = "";
            if (this.\u00d300000.\u00d5\u00d20000().get(p2) != null) {
                string = this.\u00d300000.\u00d5\u00d20000().get(p2).toString();
            }
            element2.setAttribute("talent", string);
            element.appendChild(element2);
        }
    }

    private String o00000(Object object) {
        String string = object.getClass().toString();
        return string.substring(6, string.length());
    }

    private void \u00d3O0000(Element element) {
        Object object;
        Object object2;
        Object object3;
        Iterator<b_0> iterator = b_0.\u00d4\u00d60000();
        while (iterator.hasNext()) {
            object3 = iterator.next();
            object2 = this.\u00d200000.createElement("eigenschaft");
            object2.setAttribute("name", ((U)object3).toString());
            int n = this.\u00d300000.o00000((b_0)object3) - this.\u00d300000.\u00d3\u00d30000().\u00d200000((b_0)object3);
            object2.setAttribute("value", "" + n);
            if (this.\u00d300000.\u00d3\u00d30000().\u00d400000(object3).booleanValue()) {
                object2.setAttribute("se", "true");
            }
            if (this.\u00d300000.\u00d3\u00d30000().\u00d400000((b_0)object3)) {
                object2.setAttribute("leiteigenschaft", "true");
            }
            object2.setAttribute("startwert", "" + this.\u00d300000.\u00d3\u00d30000().OO0000((b_0)object3));
            object2.setAttribute("mod", "" + this.\u00d300000.\u00d3\u00d30000().\u00d200000((b_0)object3));
            object = this.\u00d300000.\u00d3\u00d30000().super((b_0)object3);
            if ((Integer)object != 0) {
                object2.setAttribute("permanent", "" + object);
            }
            element.appendChild((Node)object2);
        }
        object3 = this.\u00d200000.createElement("eigenschaft");
        object3.setAttribute("name", "Lebensenergie");
        object3.setAttribute("value", "" + this.\u00d300000.\u00d3\u00d30000().\u00d200000(b_0.\u00d3\u00f4\u00d2000));
        object3.setAttribute("mod", "" + this.\u00d300000.\u00d3\u00d30000().\u00d200000(b_0.\u00d3\u00f4\u00d2000));
        if (this.\u00d300000.\u00d3\u00d30000().\u00d400000(b_0.\u00d3\u00f4\u00d2000).booleanValue()) {
            object3.setAttribute("se", "true");
        }
        if ((Integer)(object2 = Integer.valueOf(this.\u00d300000.\u00d3\u00d30000().super(b_0.\u00d3\u00f4\u00d2000))) != 0) {
            object3.setAttribute("permanent", "" + object2);
        }
        element.appendChild((Node)object3);
        Element element2 = this.\u00d200000.createElement("eigenschaft");
        element2.setAttribute("name", "Ausdauer");
        element2.setAttribute("value", "" + this.\u00d300000.\u00d3\u00d30000().\u00d200000(b_0.thispublicsuper));
        element2.setAttribute("mod", "" + this.\u00d300000.\u00d3\u00d30000().\u00d200000(b_0.thispublicsuper));
        if (this.\u00d300000.\u00d3\u00d30000().\u00d400000(b_0.thispublicsuper).booleanValue()) {
            element2.setAttribute("se", "true");
        }
        if ((Integer)(object2 = Integer.valueOf(this.\u00d300000.\u00d3\u00d30000().super(b_0.thispublicsuper))) != 0) {
            element2.setAttribute("permanent", "" + object2);
        }
        element.appendChild(element2);
        object = this.\u00d200000.createElement("eigenschaft");
        object.setAttribute("name", "Astralenergie");
        object.setAttribute("value", "" + this.\u00d300000.\u00d3\u00d30000().\u00d200000(b_0.\u00f4\u00f5\u00d2000));
        object.setAttribute("grossemeditation", "" + this.\u00d300000.\u00d3\u00d30000().\u00d4O0000());
        object.setAttribute("mod", "" + this.\u00d300000.\u00d3\u00d30000().\u00d200000(b_0.\u00f4\u00f5\u00d2000));
        object.setAttribute("mrmod", "" + this.\u00d300000.\u00d3\u00d30000().\u00d200000(b_0.\u00d8\u00f5\u00d2000));
        if (this.\u00d300000.\u00d3\u00d30000().\u00d400000(b_0.\u00f4\u00f5\u00d2000).booleanValue()) {
            object.setAttribute("se", "true");
        }
        if ((Integer)(object2 = Integer.valueOf(this.\u00d300000.\u00d3\u00d30000().super(b_0.\u00f4\u00f5\u00d2000))) != 0) {
            object.setAttribute("permanent", "" + object2);
        }
        element.appendChild((Node)object);
        Element element3 = this.\u00d200000.createElement("eigenschaft");
        element3.setAttribute("name", "Karmaenergie");
        element3.setAttribute("value", "" + this.\u00d300000.\u00d3\u00d30000().\u00d200000(b_0.\u00d4\u00f5\u00d2000));
        element3.setAttribute("mod", "" + this.\u00d300000.\u00d3\u00d30000().\u00d200000(b_0.\u00d4\u00f5\u00d2000));
        element3.setAttribute("karmalqueste", "" + this.\u00d300000.\u00d3\u00d30000().class());
        object2 = this.\u00d300000.\u00d3\u00d30000().super(b_0.\u00d4\u00f5\u00d2000);
        if ((Integer)object2 != 0) {
            element3.setAttribute("permanent", "" + object2);
        }
        element.appendChild(element3);
        Element element4 = this.\u00d200000.createElement("eigenschaft");
        element4.setAttribute("name", b_0.\u00d8\u00f5\u00d2000.toString());
        element4.setAttribute("value", "" + this.\u00d300000.\u00d3\u00d30000().\u00d200000(b_0.\u00d8\u00f5\u00d2000));
        element4.setAttribute("mod", "" + this.\u00d300000.\u00d3\u00d30000().\u00d200000(b_0.\u00d8\u00f5\u00d2000));
        object2 = this.\u00d300000.\u00d3\u00d30000().super(b_0.\u00d8\u00f5\u00d2000);
        if ((Integer)object2 != 0) {
            element4.setAttribute("permanent", "" + object2);
        }
        element.appendChild(element4);
        Element element5 = this.\u00d200000.createElement("eigenschaft");
        element5.setAttribute("name", "ini");
        element5.setAttribute("value", "" + this.\u00d300000.\u00d3\u00d30000().\u00f400000());
        element5.setAttribute("mod", "" + this.\u00d300000.\u00d3\u00d30000().\u00d200000(b_0.\u00f4\u00d8\u00d2000));
        element.appendChild(element5);
        Element element6 = this.\u00d200000.createElement("eigenschaft");
        element6.setAttribute("name", "at");
        element6.setAttribute("value", "" + this.\u00d300000.\u00d3\u00d30000().int());
        element6.setAttribute("mod", "" + this.\u00d300000.\u00d3\u00d30000().\u00d200000(b_0.\u00f8\u00d8\u00d2000));
        element.appendChild(element6);
        Element element7 = this.\u00d200000.createElement("eigenschaft");
        element7.setAttribute("name", "pa");
        element7.setAttribute("value", "" + this.\u00d300000.\u00d3\u00d30000().\u00d600000());
        element7.setAttribute("mod", "" + this.\u00d300000.\u00d3\u00d30000().\u00d200000(b_0.ifwhilesuper));
        element.appendChild(element7);
        Element element8 = this.\u00d200000.createElement("eigenschaft");
        element8.setAttribute("name", "fk");
        element8.setAttribute("value", "" + this.\u00d300000.\u00d3\u00d30000().\u00f600000());
        element8.setAttribute("mod", "" + this.\u00d300000.\u00d3\u00d30000().\u00d200000(b_0.\u00f5\u00f4\u00d2000));
        element.appendChild(element8);
    }

    private Element o00000(b_0 b_02) {
        Element element = this.\u00d200000.createElement("modifikation");
        element.setAttribute("name", b_02.toString());
        element.setAttribute("value", "1");
        return element;
    }

    private void \u00f500000(Element element) {
        int n;
        if (this.\u00d300000.\u00d8O0000().size() == 0) {
            return;
        }
        Element element2 = this.\u00d200000.createElement("ereignisse");
        element.appendChild(element2);
        for (int i2 = n = 0; i2 < this.\u00d300000.\u00d8O0000().size(); ++i2) {
            helden.framework.A.A a2 = this.\u00d300000.\u00d8O0000().get(i2);
            Element element3 = this.\u00d200000.createElement("ereignis");
            element3.setAttribute("text", a2.\u00d3O0000());
            element3.setAttribute("time", "" + a2.\u00d800000().getTime());
            if (!a2.private().equals("")) {
                element3.setAttribute("kommentar", a2.private());
            }
            if (!a2.\u00d2O0000().equals("")) {
                element3.setAttribute("obj", a2.\u00f500000());
            }
            if (a2.\u00d5O0000() != 0) {
                element3.setAttribute(b_0.\u00f4\u00f5\u00d2000.toString(), "" + a2.\u00d5O0000());
            }
            if (a2.o00000() != 0) {
                element3.setAttribute("Abenteuerpunkte", "" + a2.o00000());
            }
            if (a2.\u00d200000() != 0) {
                element3.setAttribute(b_0.\u00d4\u00f5\u00d2000.toString(), "" + a2.\u00d200000());
            }
            if (a2.oO0000() != 0) {
                element3.setAttribute(b_0.\u00d3\u00f4\u00d2000.toString(), "" + a2.oO0000());
            }
            if (!a2.\u00f600000().equals("")) {
                element3.setAttribute("Neu", a2.\u00f600000());
            }
            if (!a2.\u00f800000().equals("")) {
                element3.setAttribute("Alt", a2.\u00f800000());
            }
            if (!a2.\u00d600000().equals("")) {
                element3.setAttribute("Info", a2.\u00d600000());
            }
            element3.setAttribute("version", a2.\u00d300000());
            element2.appendChild(element3);
        }
    }

    private void \u00d2O0000(Element element) {
        Document document = element.getOwnerDocument();
        Iterator<Document> iterator = this.\u00d300000.\u00f8o0000();
        Element element2 = this.\u00d200000.createElement("extention");
        block0: while (iterator.hasNext()) {
            Document document2 = iterator.next();
            NodeList nodeList = document2.getElementsByTagName("pluginExtension");
            if (nodeList.getLength() <= 0) continue;
            NodeList nodeList2 = nodeList.item(0).getChildNodes();
            for (int i2 = 0; i2 < nodeList2.getLength(); ++i2) {
                if (nodeList2.item(i2).getNodeName().startsWith("#")) continue;
                element2.appendChild(document.importNode(nodeList2.item(i2), true));
                continue block0;
            }
        }
        element.appendChild(element2);
    }

    private void o00000(Element element) {
        for (helden.framework.E.F[] fArray : this.\u00d300000.\u00d8o0000().new()) {
            for (int i2 = 0; i2 < this.\u00d300000.\u00d8o0000().\u00d300000(); ++i2) {
                helden.framework.E.F f2 = fArray[i2];
                if (f2 == null) continue;
                Element element2 = this.getGegenstandselement(f2, i2);
                element.appendChild(element2);
            }
        }
    }

    private Element o00000(ModVerwaltung modVerwaltung, M m, Element element) {
        Element element2 = this.\u00d500000.createValueNode("gmods", element);
        for (GMod gMod : m.fornew()) {
            Element element3 = this.\u00d500000.createValueNode("gmod", element2);
            element3.setAttribute("name", gMod.getName().toString().toLowerCase());
            this.\u00d500000.speichereNTupel(modVerwaltung, element3, gMod.getAuswahl());
        }
        return element;
    }

    private void for(Element element) {
        Element element2 = this.\u00d200000.createElement("geldboerse");
        Iterator<Muenze> iterator = this.\u00d300000.\u00f400000().getMuenzeIter();
        while (iterator.hasNext()) {
            Muenze muenze = iterator.next();
            Element element3 = this.\u00d200000.createElement("muenze");
            element3.setAttribute("name", muenze.getBezeichner());
            element3.setAttribute("waehrung", muenze.getWaehrungsBezeichner());
            element3.setAttribute("anzahl", "" + this.\u00d300000.\u00f400000().getMuenzAnzahl(muenze));
            element2.appendChild(element3);
        }
        element.appendChild(element2);
    }

    private void \u00f800000(Element element) {
        if (this.\u00d300000.returnnew() != null) {
            Element element2 = this.\u00d200000.createElement("gilde");
            element2.setAttribute("name", this.\u00d300000.returnnew());
            element.appendChild(element2);
        }
    }

    private void \u00d300000(Element element) {
        Iterator<voidsuper> iterator = this.\u00d300000.\u00f8O0000().super();
        while (iterator.hasNext()) {
            E e;
            voidsuper voidsuper2 = iterator.next();
            if (!voidsuper2.isKampftalent() || !(e = (E)voidsuper2).o\u00d80000()) continue;
            Element element2 = this.\u00d200000.createElement("kampfwerte");
            this.o00000(element2, voidsuper2);
            Element element3 = this.\u00d200000.createElement("attacke");
            element3.setAttribute("value", "" + this.\u00d300000.o00000(e));
            element2.appendChild(element3);
            Element element4 = this.\u00d200000.createElement("parade");
            element4.setAttribute("value", "" + this.\u00d300000.new(e));
            element2.appendChild(element4);
            element.appendChild(element2);
        }
    }

    private void \u00d200000(Element element) {
        Element element2;
        Object object;
        for (String object2 : this.\u00d300000.Stringsuper().o00000().keySet()) {
            object = this.\u00d300000.Stringsuper().o00000().get(object2);
            if (object == null) continue;
            element2 = this.\u00d200000.createElement("kommentar");
            element2.setAttribute("kommentar", (String)object);
            element2.setAttribute("key", object2);
            element.appendChild(element2);
        }
        Iterator<Object> iterator = this.\u00d300000.\u00f5O0000().null();
        while (iterator.hasNext()) {
            helden.framework.D.P p2 = (helden.framework.D.P)iterator.next();
            if (!helden.framework.D.D.\u00d200000(p2)) continue;
            object = this.\u00d300000.o00000(p2);
            element2 = this.\u00d200000.createElement("sfInfos");
            element2.setAttribute("sfname", p2.toString());
            element2.setAttribute("sf", ((helden.framework.D.D)object).o00000());
            element2.setAttribute("probe", ((helden.framework.D.D)object).o00000());
            element2.setAttribute("dauer", ((helden.framework.D.D)object).\u00d200000());
            element2.setAttribute("kosten", ((helden.framework.D.D)object).\u00d400000());
            element2.setAttribute("wirkung", ((helden.framework.D.D)object).Object());
            element.appendChild(element2);
        }
    }

    private Element \u00d200000() {
        Element element = this.\u00d200000.createElement("kultur");
        OooO oooO2 = this.\u00d300000.\u00f800000();
        element.setAttribute("name", this.o00000(oooO2));
        if (oooO2.istMutterschriftGewaehlt() && oooO2.getSchrift() != null) {
            element.setAttribute("schrift", oooO2.getSchrift().toString());
        }
        if (oooO2.istMutterspracheGewaehlt()) {
            element.setAttribute("sprache", oooO2.getMuttersprache().toString());
        }
        if (oooO2.istZweitLehrspracheGewaehlt()) {
            if (oooO2.getZweitLehrsprache().size() > 1) {
                throw new IllegalArgumentException("Mehr als eine gew\u00e4hlte Zweit- bzw. Lehrsprache!");
            }
            if (oooO2.getZweitLehrsprache().size() == 1) {
                element.setAttribute("zweitsprache", oooO2.getZweitLehrsprache().get(0).toString());
            }
        }
        if (oooO2 instanceof EigeneKultur) {
            EigeneKultur eigeneKultur = (EigeneKultur)oooO2;
            element.setAttribute("id", eigeneKultur.getID());
            ArrayList<C> arrayList = new ArrayList<C>();
            arrayList.add(eigeneKultur.getHauptVariante());
            arrayList.addAll(eigeneKultur.getHauptVariante().floatnull());
            for (C c : arrayList) {
                this.String.add(c);
            }
        }
        element.setAttribute("string", this.\u00d300000.\u00f800000().toString());
        this.o00000(this.\u00d300000.\u00f800000(), element);
        return element;
    }

    private Element o00000(A a2, A a3, Element element, int n) {
        Object object;
        boolean bl = false;
        if (a2 == null) {
            return null;
        }
        if (!a2.\u00f6\u00d40000().containsAll(a3.\u00f6\u00d40000()) || !a3.\u00f6\u00d40000().containsAll(a2.\u00f6\u00d40000())) {
            bl = true;
            object = a2.\u00f6\u00d40000().iterator();
            while (object.hasNext()) {
                Element element2 = element.getOwnerDocument().createElement("talente");
                E object2 = object.next();
                BasisXMLPersistierer.getInstance().addTalentInfo(element2, object2, "kampftalent", this.String);
                element.appendChild(element2);
            }
        }
        if (!a2.\u00d8\u00d50000().containsAll(a3.\u00d8\u00d50000()) || !a3.\u00d8\u00d50000().containsAll(a2.\u00d8\u00d50000())) {
            bl = true;
            object = element.getOwnerDocument().createElement("distanzklassen");
            for (oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 : a2.\u00d8\u00d50000()) {
                Element element2 = object.getOwnerDocument().createElement("distanzklasse");
                element2.setAttribute("value", oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00d600000());
                object.appendChild(element2);
            }
            element.appendChild((Node)object);
        }
        if (a3.o\u00d50000().\u00d400000() != a2.o\u00d50000().\u00d400000() || a3.o\u00d50000().Object() != a2.o\u00d50000().Object() || a3.o\u00d50000().o00000() != a2.o\u00d50000().o00000()) {
            bl = true;
            object = element.getOwnerDocument().createElement("trefferpunkte");
            object.setAttribute("mul", "" + a2.o\u00d50000().\u00d400000());
            object.setAttribute("w", "" + a2.o\u00d50000().Object());
            object.setAttribute("sum", "" + a2.o\u00d50000().o00000());
            element.appendChild((Node)object);
        }
        if (a3.StringString() != a2.StringString()) {
            bl = true;
            object = element.getOwnerDocument().createElement("schadensart");
            object.setAttribute("ausdauer", "" + a2.StringString());
            element.appendChild((Node)object);
        }
        if (a3.\u00f8\u00d40000() != a2.\u00f8\u00d40000()) {
            bl = true;
            object = element.getOwnerDocument().createElement("laenge");
            object.setAttribute("laenge", "" + a2.\u00f8\u00d40000());
            element.appendChild((Node)object);
        }
        if (a3.\u00d200000().\u00d300000() != a2.\u00d200000().\u00d300000() || a3.\u00d200000().o00000() != a2.\u00d200000().o00000()) {
            bl = true;
            object = element.getOwnerDocument().createElement("tpkk");
            object.setAttribute("kk", "" + a2.\u00d200000().\u00d300000());
            object.setAttribute("schrittweite", "" + a2.\u00d200000().o00000());
            element.appendChild((Node)object);
        }
        if (a3.String().o00000() != a2.String().o00000() || a3.String().new() != a2.String().new()) {
            bl = true;
            object = element.getOwnerDocument().createElement("wm");
            object.setAttribute("at", "" + a2.String().o00000());
            object.setAttribute("pa", "" + a2.String().new());
            element.appendChild((Node)object);
        }
        if (a3.o00000().\u00d400000() != a2.o00000().\u00d400000() || a3.o00000().\u00d300000() != a2.o00000().\u00d300000()) {
            bl = true;
            object = element.getOwnerDocument().createElement("bf");
            object.setAttribute("min", "" + a2.o00000().\u00d400000());
            object.setAttribute("akt", "" + a2.o00000().\u00d300000());
            element.appendChild((Node)object);
        }
        if (a3.\u00d300000() != a2.\u00d300000()) {
            bl = true;
            object = element.getOwnerDocument().createElement("inimod");
            object.setAttribute("ini", "" + a2.\u00d300000());
            element.appendChild((Node)object);
        }
        if (bl) {
            element.setAttribute("variante", "" + n);
            return element;
        }
        return null;
    }

    private void o00000(Element element, Element element2) {
        Element element3;
        int n;
        Object object;
        Object object2;
        Element element4;
        element2.setAttribute("name", this.\u00d300000.\u00f5o0000());
        element2.setAttribute("key", this.\u00d300000.\u00f4o0000());
        element2.setAttribute("stand", "" + this.\u00d300000.ifnew().new());
        if (this.\u00d300000.\u00d3o0000()) {
            element4 = this.\u00d200000.createElement("nscSchmide");
            element4.setAttribute("value", "true");
            element.appendChild(element4);
        }
        element4 = this.\u00d200000.createElement("geschlecht");
        element4.setAttribute("name", this.\u00d300000.\u00d300000().toString());
        element.appendChild(element4);
        Element element5 = this.\u00d200000.createElement("settings");
        element5.setAttribute("name", this.\u00d300000.oO0000().getName());
        for (Setting object32 : this.\u00d300000.oO0000().getIncludedSettings()) {
            object2 = this.\u00d200000.createElement("inc");
            object2.setAttribute("name", object32.getName());
            element5.appendChild((Node)object2);
        }
        element.appendChild(element5);
        Element element6 = this.\u00d200000.createElement("rasse");
        element6.setAttribute("name", this.o00000(this.\u00d300000.o\u00d20000()));
        element6.setAttribute("string", this.\u00d300000.o\u00d20000().toString());
        if (this.\u00d300000.o\u00d20000() instanceof EigeneRasse) {
            EigeneRasse eigeneRasse = (EigeneRasse)this.\u00d300000.o\u00d20000();
            element6.setAttribute("id", eigeneRasse.getID());
            object2 = new ArrayList();
            object2.add(eigeneRasse.getHauptVariante());
            object2.addAll(eigeneRasse.getHauptVariante().floatnull());
            Iterator iterator = object2.iterator();
            while (iterator.hasNext()) {
                object = (C)iterator.next();
                this.String.add((C)object);
            }
        }
        Element element7 = this.\u00d200000.createElement("groesse");
        element7.setAttribute("value", "" + this.\u00d300000.thissuper().getGroesse());
        if (this.\u00d300000.thissuper().getGewicht(false) > 0) {
            element7.setAttribute("gewicht", "" + this.\u00d300000.thissuper().getGewicht(false));
        } else {
            element7.setAttribute("gewicht", "" + this.\u00d300000.o\u00d20000().getGewicht());
        }
        element6.appendChild(element7);
        object2 = this.\u00d200000.createElement("aussehen");
        object2.setAttribute("haarfarbe", this.\u00d300000.thissuper().getHaarFarbe());
        object2.setAttribute("augenfarbe", this.\u00d300000.thissuper().getAugenFarbe());
        if (this.\u00d300000.thissuper().super() != null) {
            object2.setAttribute("gbtag", "" + this.\u00d300000.thissuper().super().o00000());
            object2.setAttribute("gbmonat", "" + this.\u00d300000.thissuper().super().\u00d200000().getNummer());
            object2.setAttribute("gbjahr", "" + this.\u00d300000.thissuper().super().\u00d400000());
            object2.setAttribute("kalender", this.\u00d300000.thissuper().super().Object().toString());
        }
        object2.setAttribute("alter", "" + this.\u00d300000.thissuper().\u00d200000());
        object2.setAttribute("stand", this.\u00d300000.thissuper().getStand());
        object2.setAttribute("titel", this.\u00d300000.thissuper().getTitel());
        for (n = 0; n < 4; ++n) {
            object2.setAttribute("aussehentext" + n, this.\u00d300000.thissuper().getAussehenText()[n]);
        }
        for (n = 0; n < 6; ++n) {
            object2.setAttribute("familietext" + n, this.\u00d300000.thissuper().getFamilieText()[n]);
        }
        object2.setAttribute("gpstart", "" + this.\u00d300000.thissuper().getGPStart());
        object2.setAttribute("gprest", "" + this.\u00d300000.thissuper().getGPRest());
        element6.appendChild((Node)object2);
        this.o00000(this.\u00d300000.o\u00d20000(), element6);
        element.appendChild(element6);
        element.appendChild(this.\u00d200000());
        Element element8 = this.\u00d200000.createElement("ausbildungen");
        element.appendChild(element8);
        this.o00000(element8, this.\u00d300000.\u00d800000());
        object = this.\u00d200000.createElement("verify");
        object.setAttribute("value", "" + classsuper.\u00d200000(this.\u00d300000.\u00f5\u00d40000()));
        element.appendChild((Node)object);
        b_0 b_02 = this.\u00d300000.privatesuper().getModifizierteEigenschaft();
        if (b_02 != null) {
            element3 = this.\u00d200000.createElement("goettergeschenk");
            element3.appendChild(this.o00000(b_02));
            element.appendChild(element3);
        }
        element3 = this.\u00d200000.createElement("notiz");
        for (int i2 = 0; i2 < this.\u00d300000.thissuper().getNotiz().length; ++i2) {
            element3.setAttribute("notiz" + i2, this.\u00d300000.thissuper().getNotiz()[i2]);
        }
        element.appendChild(element3);
        Element element9 = this.\u00d200000.createElement("portraet");
        element9.setAttribute("value", this.\u00d300000.forsuper());
        element.appendChild(element9);
    }

    private void o00000(Element element, int n) {
        Object object;
        Object object2;
        Object object3;
        helden.framework.E.F[] fArray;
        int n2;
        helden.framework.E.F f2;
        int n3;
        oO0O oO0O2 = this.\u00d300000.o00000(n);
        for (n3 = 0; n3 < 5; ++n3) {
            f2 = oO0O2.\u00f8O0000(n3 + 1);
            if (f2 == null) continue;
            n2 = 0;
            fArray = this.\u00d300000.\u00d8o0000().\u00d300000(f2.toString());
            for (int i2 = 0; i2 < fArray.length; ++i2) {
                if (!f2.equals(fArray[i2])) continue;
                n2 = i2;
            }
            object3 = this.\u00d200000.createElement("heldenausruestung");
            object3.setAttribute("set", "" + n);
            object2 = "nkwaffe" + (n3 + 1);
            object = oO0O2.\u00d3O0000(n3 + 1);
            D d2 = ((A)f2.o00000(helden.framework.E.B.\u00d400000, 0)).o00000();
            object3.setAttribute("name", (String)object2);
            object3.setAttribute("waffenname", "" + f2.toString());
            object3.setAttribute("slot", "" + n2);
            object3.setAttribute("schild", "" + oO0O2.\u00d800000(n3 + 1));
            object3.setAttribute("hand", "" + oO0O2.oo0000(n3 + 1));
            BasisXMLPersistierer.getInstance().addTalentInfo((Element)object3, ((oooo_0)object).o00000(), "talent", this.String);
            object3.setAttribute("bezeichner", "" + ((oooo_0)object).\u00d200000().thisString());
            object3.setAttribute("bfmin", "" + d2.\u00d400000());
            object3.setAttribute("bfakt", "" + d2.\u00d300000());
            element.appendChild((Node)object3);
        }
        if (oO0O2.\u00d6O0000()) {
            Element element2 = this.\u00d200000.createElement("heldenausruestung");
            element2.setAttribute("name", "bk12");
            element2.setAttribute("set", "" + n);
            element.appendChild(element2);
        }
        if (oO0O2.\u00f500000()) {
            Element element3 = this.\u00d200000.createElement("heldenausruestung");
            element3.setAttribute("name", "bk34");
            element3.setAttribute("set", "" + n);
            element.appendChild(element3);
        }
        for (n3 = 0; n3 < 3; ++n3) {
            f2 = oO0O2.\u00d500000(n3 + 1);
            if (f2 == null) continue;
            n2 = 0;
            fArray = this.\u00d300000.\u00d8o0000().\u00d300000(f2.toString());
            for (int i3 = 0; i3 < fArray.length; ++i3) {
                if (!f2.equals(fArray[i3])) continue;
                n2 = i3;
            }
            object3 = this.\u00d200000.createElement("heldenausruestung");
            object3.setAttribute("set", "" + n);
            object2 = "fkwaffe" + (n3 + 1);
            object3.setAttribute("name", (String)object2);
            object3.setAttribute("waffenname", "" + f2.toString());
            object3.setAttribute("slot", "" + n2);
            object = oO0O2.\u00f500000(n3 + 1);
            BasisXMLPersistierer.getInstance().addTalentInfo((Element)object3, ((if)object).super(), "talent", this.String);
            element.appendChild((Node)object3);
        }
        for (n3 = 0; n3 < 2; ++n3) {
            f2 = oO0O2.\u00f5O0000(n3 + 1);
            if (f2 == null) continue;
            n2 = 0;
            fArray = this.\u00d300000.\u00d8o0000().\u00d300000(f2.toString());
            for (int i4 = 0; i4 < fArray.length; ++i4) {
                if (!f2.equals(fArray[i4])) continue;
                n2 = i4;
            }
            object3 = this.\u00d200000.createElement("heldenausruestung");
            object2 = "schild" + (n3 + 1);
            object3.setAttribute("set", "" + n);
            object3.setAttribute("name", (String)object2);
            object3.setAttribute("schildname", "" + f2.toString());
            object3.setAttribute("slot", "" + n2);
            object3.setAttribute("verwendungsArt", oO0O2.\u00f600000(n3 + 1));
            element.appendChild((Node)object3);
        }
        Iterator<helden.framework.E.F> iterator = oO0O2.oO0000().iterator();
        int n4 = 0;
        while (iterator.hasNext()) {
            helden.framework.E.F f3 = iterator.next();
            int n5 = 0;
            object3 = this.\u00d300000.\u00d8o0000().\u00d300000(f3.toString());
            for (int i5 = 0; i5 < ((helden.framework.E.F[])object3).length; ++i5) {
                if (!f3.equals(object3[i5])) continue;
                n5 = i5;
            }
            object2 = this.\u00d200000.createElement("heldenausruestung");
            object2.setAttribute("set", "" + n);
            object = "ruestung" + ++n4;
            object2.setAttribute("name", (String)object);
            object2.setAttribute("ruestungsname", "" + f3.toString());
            object2.setAttribute("slot", "" + n5);
            element.appendChild((Node)object2);
        }
        Element element4 = this.\u00d200000.createElement("heldenausruestung");
        element4.setAttribute("set", "" + n);
        String string = "jagtwaffe";
        element4.setAttribute("name", string);
        element4.setAttribute("nummer", "" + oO0O2.\u00d8O0000());
        element.appendChild(element4);
    }

    private Element o00000(B b, B b2, Element element) {
        Element element2;
        boolean bl = false;
        if (b == null) {
            return null;
        }
        if (b2.\u00f6O0000() != b.\u00f6O0000()) {
            bl = true;
            element2 = element.getOwnerDocument().createElement("bauch");
            element2.setAttribute("value", "" + b.\u00f6O0000());
            element.appendChild(element2);
        }
        if (b2.\u00f800000() != b.\u00f800000()) {
            bl = true;
            element2 = element.getOwnerDocument().createElement("brust");
            element2.setAttribute("value", "" + b.\u00f800000());
            element.appendChild(element2);
        }
        if (b2.\u00f600000() != b.\u00f600000()) {
            bl = true;
            element2 = element.getOwnerDocument().createElement("gesbe");
            element2.setAttribute("value", "" + b.\u00f600000());
            element.appendChild(element2);
        }
        if (b2.oO0000() != b.oO0000()) {
            bl = true;
            element2 = element.getOwnerDocument().createElement("geszors");
            element2.setAttribute("value", "" + b.\u00f6O0000());
            element.appendChild(element2);
        }
        if (b2.\u00d2O0000() != b.\u00d2O0000()) {
            bl = true;
            element2 = element.getOwnerDocument().createElement("rs");
            element2.setAttribute("value", "" + b.\u00d2O0000());
            element.appendChild(element2);
        }
        if (b2.\u00f8O0000() != b.\u00f8O0000()) {
            bl = true;
            element2 = element.getOwnerDocument().createElement("kopf");
            element2.setAttribute("value", "" + b.\u00f8O0000());
            element.appendChild(element2);
        }
        if (b2.\u00d6O0000() != b.\u00d6O0000()) {
            bl = true;
            element2 = element.getOwnerDocument().createElement("linkerarm");
            element2.setAttribute("value", "" + b.\u00d6O0000());
            element.appendChild(element2);
        }
        if (b2.\u00d8O0000() != b.\u00d8O0000()) {
            bl = true;
            element2 = element.getOwnerDocument().createElement("rechterarm");
            element2.setAttribute("value", "" + b.\u00d8O0000());
            element.appendChild(element2);
        }
        if (b2.newsuper() != b.newsuper()) {
            bl = true;
            element2 = element.getOwnerDocument().createElement("ruecken");
            element2.setAttribute("value", "" + b.newsuper());
            element.appendChild(element2);
        }
        if (b2.\u00d5O0000() != b.\u00d5O0000()) {
            bl = true;
            element2 = element.getOwnerDocument().createElement("rechtesbein");
            element2.setAttribute("value", "" + b.\u00d5O0000());
            element.appendChild(element2);
        }
        if (b2.\u00f500000() != b.\u00f500000()) {
            bl = true;
            element2 = element.getOwnerDocument().createElement("linkesbein");
            element2.setAttribute("value", "" + b.\u00f500000());
            element.appendChild(element2);
        }
        if (b2.null() != b.null()) {
            bl = true;
            element2 = element.getOwnerDocument().createElement("sterne");
            element2.setAttribute("value", "" + b.null());
            element.appendChild(element2);
        }
        if (b2.for() != b.for()) {
            bl = true;
            element2 = element.getOwnerDocument().createElement("teile");
            element2.setAttribute("value", "" + b.for());
            element.appendChild(element2);
        }
        if (bl) {
            return element;
        }
        return null;
    }

    private Element o00000(I i2, Element element) {
        Element element2 = this.\u00d500000.createValueNode("runenstatus", element);
        element2.setAttribute("value", "" + i2.\u00d3\u00d30000().name());
        element2 = this.\u00d500000.createValueNode("id", element);
        element2.setAttribute("value", "" + i2.\u00f6\u00d20000());
        return element;
    }

    private Element o00000(void void_, void void_2, Element element) {
        Element element2;
        boolean bl = false;
        if (void_ == null) {
            return null;
        }
        if (void_2.\u00f5\u00d20000().o00000() != void_.\u00f5\u00d20000().o00000() || void_2.\u00f5\u00d20000().new() != void_.\u00f5\u00d20000().new()) {
            bl = true;
            element2 = element.getOwnerDocument().createElement("wm");
            element2.setAttribute("at", "" + void_.\u00f5\u00d20000().o00000());
            element2.setAttribute("pa", "" + void_.\u00f5\u00d20000().new());
            element.appendChild(element2);
        }
        if (void_2.\u00d8\u00d20000().\u00d400000() != void_.\u00d8\u00d20000().\u00d400000() || void_2.\u00d8\u00d20000().\u00d300000() != void_.\u00d8\u00d20000().\u00d300000()) {
            bl = true;
            element2 = element.getOwnerDocument().createElement("bf");
            element2.setAttribute("min", "" + void_.\u00d8\u00d20000().\u00d400000());
            element2.setAttribute("akt", "" + void_.\u00d8\u00d20000().\u00d300000());
            element.appendChild(element2);
        }
        if (void_2.nullnew() != void_.nullnew()) {
            bl = true;
            element2 = element.getOwnerDocument().createElement("inimod");
            element2.setAttribute("ini", "" + void_.nullnew());
            element.appendChild(element2);
        }
        if (bl) {
            return element;
        }
        return null;
    }

    private void \u00d500000(Element element) {
        for (Comparable<Object> comparable : this.\u00d300000.\u00f5O0000()) {
            Element element2 = this.\u00d500000.getSFElement((helden.framework.D.P)comparable, this.String);
            element.appendChild(element2);
        }
        Iterator<Comparable<Object>> iterator = this.\u00d300000.newnew();
        while (iterator.hasNext()) {
            Comparable<Object> comparable;
            comparable = (OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)iterator.next();
            for (for for_ : ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)comparable).getGewaehlteVerbilligteSonderfertigkeiten()) {
                if (this.\u00d300000.new(for_.getBezeichner().toString())) continue;
                element.appendChild(BasisXMLPersistierer.getInstance().getVSFElement(for_, this.String));
            }
        }
    }

    private void \u00d600000(Element element) {
        Iterator<voidsuper> iterator = this.\u00d300000.\u00f8O0000().super();
        while (iterator.hasNext()) {
            voidsuper voidsuper2 = iterator.next();
            if (voidsuper2.isMetatalent()) continue;
            Element element2 = this.\u00d200000.createElement("talent");
            this.o00000(element2, voidsuper2);
            element2.setAttribute("probe", voidsuper2.getTalentprobe().toString());
            try {
                element2.setAttribute("value", "" + this.\u00d300000.\u00d300000((oo0o_0)voidsuper2));
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            element2.setAttribute("lernmethode", this.\u00d300000.\u00d400000(voidsuper2).toString());
            if (this.\u00d300000.\u00f8O0000().\u00d400000(voidsuper2).booleanValue()) {
                element2.setAttribute("se", "true");
            }
            if (this.\u00d300000.\u00f8O0000().super((oo0o_0)voidsuper2, this.\u00d300000.\u00d500000())) {
                element2.setAttribute("leittalent", "true");
            }
            if (this.\u00d300000.\u00f8O0000().\u00d300000(voidsuper2)) {
                element2.setAttribute("mirakelplustalent", "true");
            }
            if (this.\u00d300000.\u00f8O0000().super(voidsuper2)) {
                element2.setAttribute("mirakelminustalent", "true");
            }
            if (voidsuper2.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.Oo0000)) {
                element2.setAttribute("be", voidsuper2.superclass());
            }
            if (voidsuper2 instanceof G) {
                element2.setAttribute("k", "" + ((G)voidsuper2).\u00f5\u00f40000());
            }
            element.appendChild(element2);
        }
    }

    private Element o00000(helden.framework.E.C.K k2, Element element) {
        Object object;
        Object object22;
        Element element2 = this.\u00d500000.createValueNode("eigenschaften", element);
        for (b_0 object72 : k2.\u00d8\u00d40000()) {
            Number number = k2.o00000(object72);
            if (number == null) continue;
            object22 = this.\u00d500000.createValueNode("eigenschaft", element2);
            object22.setAttribute("name", object72.toString());
            object22.setAttribute("value", number.toString());
        }
        Element element3 = this.\u00d500000.createValueNode("vorteile", element);
        for (public public_ : k2.\u00f5\u00d40000().o00000().getListe()) {
            object22 = this.\u00d500000.getVorteil(public_, this.\u00d200000);
            Iterator iterator = ((ArrayList)object22).iterator();
            while (iterator.hasNext()) {
                Element element4 = (Element)iterator.next();
                element3.appendChild(element4);
            }
        }
        Element element5 = this.\u00d500000.createValueNode("sonderfertigkeiten", element);
        for (Object object22 : k2.\u00d3\u00d40000()) {
            Element element6 = this.\u00d500000.getSFElement((helden.framework.D.P)object22, this.String);
            element5.appendChild(element6);
        }
        Element element7 = this.\u00d500000.createValueNode("talente", element);
        for (interface interface_ : k2.\u00f8\u00d30000()) {
            if (!(interface_.new() instanceof voidsuper)) continue;
            Element element8 = this.\u00d500000.createValueNode("talent", element7);
            element8.setAttribute("name", interface_.new().toString());
            element8.setAttribute("value", "" + interface_.\u00d300000());
        }
        object22 = this.\u00d500000.createValueNode("zauber", element);
        for (interface interface_ : k2.\u00f8\u00d30000()) {
            if (!(interface_.new() instanceof Zauber)) continue;
            object = this.\u00d500000.createValueNode("zauber", (Element)object22);
            object.setAttribute("name", interface_.new().toString());
            object.setAttribute("value", "" + interface_.\u00d300000());
        }
        this.addWurzelmitKonstante(element, "ini", k2.returnObject());
        Element element9 = this.\u00d500000.createValueNode("groesse", element);
        element9.setAttribute("value", "" + k2.\u00f5\u00d30000());
        Element element10 = this.\u00d500000.createValueNode("angriffe", element);
        for (helden.framework.E.OoOO.E e : k2.\u00d6\u00d40000()) {
            this.addTierAngriff(element10, e);
        }
        object = this.\u00d500000.createValueNode("gattung", element);
        object.setAttribute("value", k2.\u00d5\u00d30000());
        Element element11 = this.\u00d500000.createValueNode("familie", element);
        element11.setAttribute("value", k2.\u00d2\u00d40000());
        Element element12 = this.\u00d500000.createValueNode("wesensart", element);
        element12.setAttribute("value", k2.newObject().toString());
        return element;
    }

    private void \u00d800000(Element element) {
        Iterator<String> iterator = this.\u00d300000.\u00d4o0000().\u00d200000().iterator();
        while (iterator.hasNext()) {
            helden.framework.held.A.String string = this.\u00d300000.\u00d4o0000().\u00d200000(iterator.next());
            Element element2 = this.\u00d200000.createElement("verbindung");
            element2.setAttribute("name", string.\u00d300000());
            element2.setAttribute("so", "" + string.o00000());
            element2.setAttribute("beschreibung", string.new());
            element.appendChild(element2);
        }
    }

    private void \u00f600000(Element element) {
        Iterator<public> iterator = this.\u00d300000.\u00d500000().\u00d500000();
        while (iterator.hasNext()) {
            public public_ = iterator.next();
            ArrayList<Element> arrayList = this.\u00d500000.getVorteil(public_, this.\u00d200000);
            for (Element element2 : arrayList) {
                element.appendChild(element2);
            }
        }
    }

    private void String(Element element) {
        L l2 = this.\u00d300000.\u00d5o0000();
        Iterator<KonkreterZauber> iterator = l2.super();
        while (iterator.hasNext()) {
            KonkreterZauber konkreterZauber = iterator.next();
            Element element2 = BasisXMLPersistierer.getInstance().getZauberElement(konkreterZauber, this.\u00d200000);
            try {
                element2.setAttribute("value", "" + this.\u00d300000.\u00d300000(konkreterZauber));
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            if (l2.\u00d400000(konkreterZauber).booleanValue()) {
                element2.setAttribute("se", "true");
            }
            element2.setAttribute("hauszauber", "" + l2.\u00d200000(konkreterZauber));
            ZauberInfos zauberInfos = this.\u00d300000.\u00d5o0000().\u00d600000(konkreterZauber);
            element2.setAttribute("anmerkungen", zauberInfos.getAnmerkungen());
            element2.setAttribute("wirkungsdauer", zauberInfos.getWirkungsdauer());
            element2.setAttribute("reichweite", zauberInfos.getReichweite());
            element2.setAttribute("kosten", zauberInfos.getKosten());
            element2.setAttribute("zauberdauer", zauberInfos.getZauberdauer());
            element2.setAttribute("zauberkommentar", zauberInfos.getKommentar());
            if (this.\u00d300000.\u00d5o0000().super((oo0o_0)konkreterZauber, this.\u00d300000.\u00d500000())) {
                element2.setAttribute("leittalent", "true");
            }
            element2.setAttribute("lernmethode", this.\u00d300000.\u00d400000(konkreterZauber).toString());
            element.appendChild(element2);
        }
    }

    /*
     * Illegal identifiers - consider using --renameillegalidents true
     */
    static class 1 {
        static final /* synthetic */ int[] super;

        static {
            super = new int[helden.framework.E.A.values().length];
            try {
                1.super[helden.framework.E.A.return.ordinal()] = 1;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                1.super[helden.framework.E.A.\u00d800000.ordinal()] = 2;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                1.super[helden.framework.E.A.new.ordinal()] = 3;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                1.super[helden.framework.E.A.\u00d4O0000.ordinal()] = 4;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                1.super[helden.framework.E.A.\u00d400000.ordinal()] = 5;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                1.super[helden.framework.E.A.o00000.ordinal()] = 6;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                1.super[helden.framework.E.A.\u00f800000.ordinal()] = 7;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                1.super[helden.framework.E.A.\u00f500000.ordinal()] = 8;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                1.super[helden.framework.E.A.\u00d3O0000.ordinal()] = 9;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                1.super[helden.framework.E.A.\u00f400000.ordinal()] = 10;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                1.super[helden.framework.E.A.oO0000.ordinal()] = 11;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                1.super[helden.framework.E.A.OO0000.ordinal()] = 12;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                1.super[helden.framework.E.A.if.ordinal()] = 13;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
        }
    }
}

