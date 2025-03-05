/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.persistenz;

import helden.framework.C.A;
import helden.framework.C.A.void;
import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.M;
import helden.framework.C.public;
import helden.framework.D.B;
import helden.framework.D.K;
import helden.framework.D.OoOO.D;
import helden.framework.D.OoOO.F;
import helden.framework.D.OoOO.OO0oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.D.OoOO.U;
import helden.framework.D.P;
import helden.framework.D.Q;
import helden.framework.D.for;
import helden.framework.D.o0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.EigeneErweiterungenMoeglich;
import helden.framework.OOoO.R;
import helden.framework.OoOO.E;
import helden.framework.OoOO.private;
import helden.framework.held.object.oooo_0;
import helden.framework.held.persistenz.ModVerwaltung;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.TharunZauber;
import java.util.ArrayList;
import java.util.Iterator;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public final class BasisXMLPersistierer {
    private static BasisXMLPersistierer o00000;

    public static BasisXMLPersistierer getInstance() {
        if (o00000 == null) {
            o00000 = new BasisXMLPersistierer();
        }
        return o00000;
    }

    private BasisXMLPersistierer() {
    }

    public void addTalentInfo(Element element, oo0o_0 oo0o_02, String string, ModVerwaltung modVerwaltung) {
        element.setAttribute(string, oo0o_02.toString());
        if (oo0o_02 instanceof private) {
            private private_ = (private)((Object)oo0o_02);
            String string2 = private_.getID();
            element.setAttribute("modtalentid", string2);
            modVerwaltung.add(private_);
        }
    }

    public Element createValueNode(String string, Element element) {
        Element element2 = element.getOwnerDocument().createElement(string);
        element.appendChild(element2);
        return element2;
    }

    public Element getSFElement(P p2, ModVerwaltung modVerwaltung) {
        Document document = modVerwaltung.getDoc();
        Element element = modVerwaltung.getDoc().createElement("sonderfertigkeit");
        if (p2 instanceof helden.framework.D.void) {
            element.setAttribute("name", p2.\u00f500000());
            if (p2 instanceof U) {
                for (Q q : ((U)p2).o\u00d40000()) {
                    Element element2 = document.createElement("kultur");
                    element2.setAttribute("name", ((o0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)q.\u00d8\u00d30000()).new());
                    element.appendChild(element2);
                }
            } else if (p2 instanceof B) {
                for (Q q : ((B)p2).o\u00d40000()) {
                    Element element3 = document.createElement("talent");
                    element3.setAttribute("name", ((E)q.\u00d8\u00d30000()).toString());
                    element.appendChild(element3);
                }
            } else if (p2.\u00f500000().equals("R\u00fcstungsgew\u00f6hnung I")) {
                for (Q q : ((helden.framework.D.void)p2).o\u00d40000()) {
                    Element element4 = document.createElement("gegenstand");
                    element4.setAttribute("name", ((helden.framework.E.F)q.\u00d8\u00d30000()).toString());
                    element.appendChild(element4);
                }
            } else if (p2 instanceof D || p2 instanceof OO0oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO || p2 instanceof F) {
                for (Q q : ((helden.framework.D.void)p2).o\u00d40000()) {
                    Element element5 = document.createElement("auswahl");
                    element5.setAttribute("name", q.\u00d8\u00d30000().toString());
                    element.appendChild(element5);
                }
            } else if (p2 instanceof helden.framework.D.F) {
                helden.framework.D.F f2 = (helden.framework.D.F)p2;
                for (Q q : f2.o\u00d40000()) {
                    Element element6 = document.createElement("auswahl");
                    element.appendChild(element6);
                    R r = (R)q.\u00d8\u00d30000();
                    this.speichereNTupel(modVerwaltung, element6, r);
                }
            } else {
                for (Q q : ((helden.framework.D.void)p2).o\u00d40000()) {
                    Element element7 = document.createElement("auswahl");
                    element7.setAttribute("name", q.\u00d8\u00d30000().toString());
                    element.appendChild(element7);
                }
            }
        } else if (p2 instanceof Q) {
            oooo_0.\u00f500000("AuswahlSonderfertigkeit beim Speichern " + p2.toString());
            Q q = (Q)p2;
            element.setAttribute("name", q.\u00d5\u00d30000());
            Element element8 = document.createElement("auswahl");
            element8.setAttribute("name", q.\u00d8\u00d30000().toString());
            element.appendChild(element8);
        } else {
            element.setAttribute("name", p2.toString());
            if (p2.\u00f8O0000()) {
                K k2 = (K)p2;
                if (k2.O\u00d30000()) {
                    Element element9 = document.createElement("zauber");
                    KonkreterZauber konkreterZauber = (KonkreterZauber)k2.o\u00d30000();
                    element9.setAttribute("name", konkreterZauber.getZaubername());
                    element9.setAttribute("repraesentation", konkreterZauber.getRep().toString());
                    element9.setAttribute("variante", konkreterZauber.getVariante());
                    element.appendChild(element9);
                    Element element10 = document.createElement("spezialisierung");
                    element10.setAttribute("name", k2.\u00f5\u00d20000());
                    element.appendChild(element10);
                } else {
                    Element element11 = document.createElement("talent");
                    element11.setAttribute("name", k2.o\u00d30000().toString());
                    element.appendChild(element11);
                    Element element12 = document.createElement("spezialisierung");
                    element12.setAttribute("name", k2.\u00f5\u00d20000());
                    element.appendChild(element12);
                }
            }
        }
        return element;
    }

    public ArrayList<Element> getVorteil(public public_, Document document) {
        ArrayList<Element> arrayList = new ArrayList<Element>();
        Element element = document.createElement("vorteil");
        if (public_ instanceof J) {
            element.setAttribute("name", this.o00000(public_));
            J j2 = (J)public_;
            element.setAttribute("value", "" + j2.ObjectString());
            arrayList.add(element);
        } else if (public_ instanceof A) {
            A a2 = (A)public_;
            if (a2.\u00d2\u00d20000() == 0) {
                element = document.createElement("vorteil");
                element.setAttribute("name", this.o00000(public_));
                arrayList.add(element);
            } else {
                for (R r : a2.intsuper()) {
                    element = document.createElement("vorteil");
                    element.setAttribute("name", this.o00000(public_));
                    for (int i2 = 0; i2 < r.o00000(); ++i2) {
                        Element element2 = document.createElement("auswahl");
                        element2.setAttribute("position", "" + i2);
                        element2.setAttribute("value", r.o00000(i2).toString());
                        element.appendChild(element2);
                    }
                    arrayList.add(element);
                }
            }
        } else if (public_ instanceof M) {
            M m = (M)public_;
            if (m.\u00d2\u00d20000() == 0) {
                element = document.createElement("vorteil");
                element.setAttribute("name", this.o00000(public_));
                arrayList.add(element);
            } else {
                Iterator iterator = m.intsuper().iterator();
                while (iterator.hasNext()) {
                    String string;
                    element = document.createElement("vorteil");
                    element.setAttribute("name", this.o00000(public_));
                    Object t = iterator.next();
                    if (t instanceof KonkreterZauber) {
                        KonkreterZauber konkreterZauber = (KonkreterZauber)t;
                        string = konkreterZauber.getZaubername();
                    } else {
                        string = t.toString();
                    }
                    element.setAttribute("value", string);
                    arrayList.add(element);
                }
            }
        } else if (public_ instanceof helden.framework.C.D) {
            helden.framework.C.D d2 = (helden.framework.C.D)public_;
            element = document.createElement("vorteil");
            element.setAttribute("name", d2.\u00f6o0000());
            arrayList.add(element);
            if (d2.\u00f4o0000() != null) {
                element.setAttribute("value", d2.\u00f4o0000().toString());
            }
        } else if (public_ instanceof void) {
            void void_ = (void)public_;
            element = document.createElement("vorteil");
            element.setAttribute("name", this.o00000(public_));
            for (String string : void_.classsuper()) {
                Element element3 = document.createElement("stubenhocker");
                element3.setAttribute("freigekauft", string);
                element.appendChild(element3);
            }
            arrayList.add(element);
        } else {
            element.setAttribute("name", this.o00000(public_));
            arrayList.add(element);
        }
        return arrayList;
    }

    public Element getVSFElement(for for_, ModVerwaltung modVerwaltung) {
        Document document = modVerwaltung.getDoc();
        Element element = document.createElement("verbilligtesonderfertigkeit");
        if (for_.o00000()) {
            BasisXMLPersistierer.getInstance().addTalentInfo(element, for_.Object(), "talent", modVerwaltung);
        }
        for (Object t : for_.getAuswahlen()) {
            Element element2 = document.createElement("auswahl");
            element2.setAttribute("auswahl", t.toString());
            element.appendChild(element2);
        }
        element.setAttribute("name", for_.getBezeichner().toString());
        return element;
    }

    public Element getZauberElement(KonkreterZauber konkreterZauber, Document document) {
        Element element = document.createElement("zauber");
        element.setAttribute("name", konkreterZauber.getZaubername());
        element.setAttribute("probe", konkreterZauber.getTalentprobe().toString());
        element.setAttribute("repraesentation", konkreterZauber.getRep().toString());
        element.setAttribute("variante", konkreterZauber.getVariante());
        element.setAttribute("k", konkreterZauber.getKategorie(false).toString());
        if (konkreterZauber.getZauber() instanceof TharunZauber) {
            TharunZauber tharunZauber = (TharunZauber)konkreterZauber.getZauber();
            element.setAttribute("tharun", "true");
            element.setAttribute("tharunzauberart", tharunZauber.getZauberart().name());
            for (int i2 = 0; i2 < tharunZauber.runenAnzahl(); ++i2) {
                Element element2 = document.createElement("rune");
                element2.setAttribute("name", tharunZauber.getRunen()[i2].\u00d400000());
                element2.setAttribute("gegenstandsid", tharunZauber.getGegenstandsID()[i2].toString());
                element.appendChild(element2);
            }
        }
        return element;
    }

    public void speichereNTupel(ModVerwaltung modVerwaltung, Element element, R r) {
        for (int i2 = 0; i2 < r.o00000(); ++i2) {
            Element element2 = element.getOwnerDocument().createElement("wahl");
            Object object = r.o00000(i2);
            element2.setAttribute("position", "" + i2);
            if (object != null) {
                EigeneErweiterungenMoeglich eigeneErweiterungenMoeglich;
                element2.setAttribute("value", object.toString());
                if (object instanceof EigeneErweiterungenMoeglich && !(eigeneErweiterungenMoeglich = (EigeneErweiterungenMoeglich)object).istIntern()) {
                    if (object instanceof private) {
                        private private_ = (private)object;
                        element2.setAttribute("eeid", private_.getID());
                        modVerwaltung.add(private_);
                    } else {
                        oooo_0.\u00f500000("Tupel nicht speicherbar, da Vererbung EigeneErweiterungenMoeglich fehlt. " + r.toString());
                    }
                }
            }
            element.appendChild(element2);
            if (!(r.o00000(i2) instanceof R)) continue;
            this.speichereNTupel(modVerwaltung, element2, (R)r.o00000(i2));
        }
    }

    private String o00000(public public_) {
        if (public_.toString().startsWith(I.while.toString())) {
            return I.while.toString();
        }
        if (public_.toString().startsWith(I.\u00d8O0000.toString())) {
            return I.\u00d8O0000.toString();
        }
        if (public_ instanceof void) {
            return I.\u00d3\u00d3O000.toString();
        }
        return public_.toString();
    }
}

