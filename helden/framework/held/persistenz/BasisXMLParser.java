/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.persistenz;

import helden.Version;
import helden.framework.C.A.void;
import helden.framework.C.J;
import helden.framework.C.M;
import helden.framework.C.private;
import helden.framework.C.public;
import helden.framework.D.OoOO.D;
import helden.framework.D.OoOO.OO0oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.D.OoOO.U;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.D.while;
import helden.framework.E.C.B;
import helden.framework.E.C.I;
import helden.framework.E.C.K;
import helden.framework.E.O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.E.OoOO.A;
import helden.framework.E.OoOO.C;
import helden.framework.E.OoOO.F;
import helden.framework.E.OoOO.null;
import helden.framework.E.OoOO.oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.OOoO.I;
import helden.framework.OOoO.K;
import helden.framework.OOoO.R;
import helden.framework.OOoO.S;
import helden.framework.OOoO.o00O;
import helden.framework.OOoO.o0Oo;
import helden.framework.OoOO.E;
import helden.framework.OoOO.N;
import helden.framework.OoOO.X;
import helden.framework.OoOO.voidsuper;
import helden.framework.e.oooo.oooo_0;
import helden.framework.gmod.GMod;
import helden.framework.gmod.GmodFactory;
import helden.framework.held.Object.H;
import helden.framework.held.persistenz.NamenErsetzerKonverter;
import helden.framework.oooo.a_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooo_3;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.TharunZauber;
import helden.framework.zauber.Zauber;
import helden.framework.zauber.ZauberFabrik;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class BasisXMLParser {
    private String \u00d200000;
    private Integer o00000;

    public R getGegenstand(H h2, Node node) {
        try {
            String string = NamenErsetzerKonverter.getInstance().korrigiere(this.getString(node, "name"), this.getVersionInt());
            if (O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d400000().o00000(string) == null) {
                return null;
            }
            helden.framework.E.F f2 = O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d400000().o00000(string).\u00f400000();
            f2.Object(this.o00000(node, "anzahl"));
            int n = 0;
            if (node.getAttributes().getNamedItem("slot") != null) {
                n = this.o00000(node, "slot");
            }
            if (node.hasChildNodes()) {
                for (int i2 = 0; i2 < node.getChildNodes().getLength(); ++i2) {
                    Node node2 = node.getChildNodes().item(i2);
                    if (node2.getNodeName().equals("Nahkampfwaffe")) {
                        int n2 = 0;
                        if (node2.getAttributes().getNamedItem("variante") != null) {
                            n2 = Integer.parseInt(node2.getAttributes().getNamedItem("variante").getNodeValue());
                        }
                        helden.framework.E.C.A a2 = (helden.framework.E.C.A)f2.o00000(helden.framework.E.B.\u00d400000, n2);
                        this.o00000(a2, node2);
                    }
                    if (node2.getNodeName().equals("Fernkampfwaffe")) {
                        helden.framework.E.C.E e = (helden.framework.E.C.E)f2.o00000(helden.framework.E.B.class, 0);
                        if (e == null) {
                            helden.framework.held.object.oooo_0.\u00f500000("FKW-Erweiterung f\u00fcr " + string + " nicht gefunden!");
                        }
                        this.o00000(e, node2);
                    }
                    if (node2.getNodeName().equals("Schild")) {
                        f2.o00000(helden.framework.E.B.\u00d300000, 0);
                        helden.framework.E.C.void void_ = (helden.framework.E.C.void)f2.o00000(helden.framework.E.B.\u00d300000, 0);
                        this.o00000(void_, node2);
                    }
                    if (node2.getNodeName().equals("R\u00fcstung")) {
                        f2.o00000(helden.framework.E.B.OO0000, 0);
                        B b = (B)f2.o00000(helden.framework.E.B.OO0000, 0);
                        this.o00000(b, node2);
                    }
                    if (node2.getNodeName().equals(helden.framework.E.A.o00000.toString())) {
                        f2.o00000(helden.framework.E.B.\u00d200000, 0);
                        helden.framework.E.C.K k2 = (helden.framework.E.C.K)f2.o00000(helden.framework.E.B.\u00d200000, 0);
                        this.o00000(k2, node2, h2);
                    }
                    if (node2.getNodeName().equals(helden.framework.E.A.\u00d400000.toString())) {
                        helden.framework.E.C.I i3 = (helden.framework.E.C.I)f2.o00000(helden.framework.E.B.int, 0);
                        this.o00000(i3, node2, h2);
                    }
                    if (node2.getNodeName().equals(helden.framework.E.A.if.toString())) {
                        f2.o00000(helden.framework.E.B.super, 0);
                        helden.framework.E.C.M m = (helden.framework.E.C.M)f2.o00000(helden.framework.E.B.super, 0);
                        if (m == null) {
                            helden.framework.held.object.oooo_0.\u00f500000("HeldModifizierer ist null");
                        }
                        this.o00000(m, node2);
                    }
                    if (!node2.getNodeName().equals("modallgemein")) continue;
                    this.o00000(f2, node2);
                }
            }
            return new R(f2, n);
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            cloneNotSupportedException.printStackTrace();
            return null;
        }
    }

    public int getIntValue(Node node) {
        return Integer.parseInt(this.getStringValue(node));
    }

    public String getString(Node node, String string) {
        return node.getAttributes().getNamedItem(string).getNodeValue();
    }

    public String getString(Node node, String string, String string2) {
        if (node.getAttributes().getNamedItem(string) == null) {
            return string2;
        }
        return node.getAttributes().getNamedItem(string).getNodeValue();
    }

    public Object getValue(Node node) {
        if (node.getAttributes().getNamedItem("value") == null) {
            return null;
        }
        if (node.getAttributes().getNamedItem("eeid") == null) {
            return this.getString(node, "value");
        }
        return new I(this.getString(node, "value"), this.getString(node, "eeid"));
    }

    /*
     * WARNING - void declaration
     */
    public for getVerbilligteSonderfertigkeit(Node node) {
        for<Object> for_;
        String string = this.getName(node);
        ArrayList<String> arrayList = new ArrayList<String>();
        for (Node object : this.getRealChildren(node)) {
            arrayList.add(this.getString(object, "auswahl"));
        }
        if (string.equals("Talentspezialisierung")) {
            void var6_8;
            Node node2 = node.getAttributes().getNamedItem("talent");
            Object var6_6 = null;
            if (node2 != null) {
                voidsuper voidsuper2 = N.floatsuper().\u00d200000(node2.getNodeValue());
            }
            for_ = for.o00000((oo0o_0)var6_8, arrayList, 0);
        } else {
            for_ = new for(arrayList, string, false);
        }
        return for_;
    }

    public String getVersion() {
        return this.\u00d200000;
    }

    public Integer getVersionInt() {
        return this.o00000;
    }

    public helden.framework.C.I getVorteil(Node node) {
        public public_;
        public public_2;
        String string = this.getName(node);
        if ("".equals(string)) {
            return null;
        }
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
        if ((public_2 = helden.framework.C.K.o00000(string)) instanceof J) {
            public_ = (J)public_2;
            int n = ((J)public_).equals("Moralkodex [DDZ]") && node.getAttributes().getNamedItem("Value") == null ? Integer.parseInt(this.getString(node, "Value", "6")) : this.getIntValue(node);
            ((J)public_).oO0000(n);
        }
        if (public_2 instanceof helden.framework.C.A) {
            public_ = (helden.framework.C.A)public_2;
            String[] stringArray = new String[((helden.framework.C.A)public_).O\u00d30000()];
            int n = 0;
            for (Node node2 : this.getRealChildren(node)) {
                stringArray[n++] = this.getString(node2, "value");
            }
            R r = ((helden.framework.C.A)public_).o00000(stringArray);
            ((helden.framework.C.A)public_).o00000(r);
            return public_;
        }
        if (public_2 instanceof M) {
            public_ = (M)public_2;
            ((private)public_).\u00d2o0000();
            String string2 = this.getString(node, "value", null);
            if (string2 == null) {
                return public_;
            }
            Object t = ((private)public_).\u00d5o0000().get(0);
            if (t instanceof String) {
                ((M)public_).o00000(string2);
                return public_2;
            }
            if (t instanceof P) {
                P p2 = helden.framework.d.oooo_0.\u00f500000().get(string2);
                if (p2 != null) {
                    ((M)public_).o00000(helden.framework.d.oooo_0.o00000(string2));
                } else {
                    ((M)public_).o00000(string2);
                }
                return public_2;
            }
            if (t instanceof o00O) {
                o00O o00O2 = o00O.\u00d200000(string2);
                ((M)public_).o00000(o00O2);
                return public_2;
            }
            if (t instanceof b_0 || public_2.equals(helden.framework.C.I.while)) {
                try {
                    b_0 b_02 = b_0.\u00f400000(string2);
                    ((M)public_).o00000(b_02);
                    return public_2;
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            if (t instanceof Zauber) {
                Zauber zauber = ZauberFabrik.getInstance().getZauberfertigkeit(string2);
                if (zauber == null) {
                    throw new X(string2);
                }
                ((M)public_).o00000(zauber);
                return public_2;
            }
            if (t instanceof KonkreterZauber) {
                KonkreterZauber konkreterZauber = KonkreterZauber.getZauber(string2, K.\u00d400000, "");
                if (konkreterZauber == null) {
                    throw new X(string2);
                }
                ((M)public_).o00000(konkreterZauber);
                return public_2;
            }
            if (t instanceof voidsuper || public_2.equals(helden.framework.C.I.while)) {
                try {
                    voidsuper voidsuper2 = N.floatsuper().\u00d200000(string2);
                    ((M)public_).o00000(voidsuper2);
                    return public_2;
                }
                catch (Exception exception) {
                    return public_2;
                }
            }
            if (t instanceof R) {
                for (Comparable comparable : ((private)public_).\u00d5o0000()) {
                    if (!string2.equals(comparable.toString())) continue;
                    ((M)public_).o00000(comparable);
                }
                return public_2;
            }
            if (t instanceof o0Oo) {
                ((M)public_).o00000(o0Oo.o00000(string2));
                return public_2;
            }
            throw new RuntimeException("Unbekannter MAV: " + string + ": " + string2 + " " + t.getClass().getName());
        }
        if (public_2 instanceof void) {
            public_ = (void)public_2;
            for (Node node3 : this.getRealChildren(node)) {
                String string3 = this.getString(node3, "freigekauft");
                ((void)public_).\u00d400000(string3);
            }
        }
        return public_2;
    }

    public void setVersion(String string) {
        this.\u00d200000 = string;
        this.o00000 = Version.versionStringToNummer(string);
    }

    protected boolean getHauszauber(Node node) {
        String string = this.getString(node, "hauszauber", "false");
        return Boolean.valueOf(string);
    }

    protected String getName(Node node) {
        return this.getString(node, "name");
    }

    protected Number getNumberValue(Node node) {
        String string = this.getStringValue(node);
        if (string.contains(".")) {
            return Double.parseDouble(string);
        }
        return Integer.parseInt(string);
    }

    protected List<Node> getRealChildren(Node node) {
        ArrayList<Node> arrayList = new ArrayList<Node>();
        for (int i2 = 0; i2 < node.getChildNodes().getLength(); ++i2) {
            Node node2 = node.getChildNodes().item(i2);
            if (node2.getNodeName().startsWith("#")) continue;
            arrayList.add(node2);
        }
        return arrayList;
    }

    protected K getRepraesentation(Node node) {
        String string = this.getString(node, "repraesentation");
        K k2 = K.super(string);
        return k2;
    }

    protected P getSonderfertigkeit(Node node) {
        P p2;
        String string = NamenErsetzerKonverter.getInstance().korrigiere(this.getName(node), this.getVersionInt());
        if (string.startsWith("Talentspezialisierung")) {
            List<Node> list = this.getRealChildren(node);
            Node node2 = list.get(0);
            String string2 = this.getName(node2);
            voidsuper voidsuper2 = N.floatsuper().\u00d200000(string2);
            Node node3 = list.get(1);
            String string3 = NamenErsetzerKonverter.getInstance().korrigiere(this.getName(node3), this.getVersionInt());
            p2 = helden.framework.D.K.o00000(voidsuper2, string3);
        } else if (string.startsWith("Zauberspezialisierung")) {
            List<Node> list = this.getRealChildren(node);
            Node node4 = list.get(0);
            KonkreterZauber konkreterZauber = KonkreterZauber.getZauber(this.getName(node4), this.getRepraesentation(node4), this.getString(node4, "variante"));
            Node node5 = list.get(1);
            String string4 = this.getName(node5);
            p2 = helden.framework.D.K.new(konkreterZauber, string4, true);
        } else if (string.startsWith("Kulturkunde")) {
            U u2 = (U)helden.framework.d.oooo_0.o00000("Kulturkunde");
            for (Node node6 : this.getRealChildren(node)) {
                String string5 = this.getName(node6);
                u2.\u00d500000(string5);
            }
            p2 = u2;
        } else if (string.startsWith("Scharfsch\u00fctze")) {
            helden.framework.D.B b = (helden.framework.D.B)helden.framework.d.oooo_0.o00000(while.\u00f6\u00d5\u00d2000.toString());
            for (Node node7 : this.getRealChildren(node)) {
                String string6 = this.getName(node7);
                b.\u00d500000(string6);
            }
            p2 = b;
        } else if (string.startsWith("Meistersch\u00fctze")) {
            helden.framework.D.B b = (helden.framework.D.B)helden.framework.d.oooo_0.o00000(while.\u00f6O\u00f5000.toString());
            for (Node node8 : this.getRealChildren(node)) {
                String string7 = this.getName(node8);
                b.\u00d500000(string7);
            }
            p2 = b;
        } else if (string.startsWith("Schnellladen")) {
            helden.framework.D.B b = (helden.framework.D.B)helden.framework.d.oooo_0.o00000(while.newpublicnew.toString());
            for (Node node9 : this.getRealChildren(node)) {
                String string8 = this.getName(node9);
                b.\u00d500000(string8);
            }
            p2 = b;
        } else if (string.startsWith("Ortskenntnis")) {
            D d2 = (D)helden.framework.d.oooo_0.o00000(while.\u00d30\u00d2000.toString());
            for (Node node10 : this.getRealChildren(node)) {
                String string9 = this.getName(node10);
                d2.\u00d500000(string9);
            }
            p2 = d2;
        } else if (string.startsWith("Akoluth")) {
            OO0oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oO0oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO = (OO0oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)helden.framework.d.oooo_0.o00000(while.\u00d3\u00f4\u00f5000.toString());
            for (Node node11 : this.getRealChildren(node)) {
                String string10 = this.getName(node11);
                oO0oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d500000(string10);
            }
            p2 = oO0oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
        } else if (string.startsWith("Elementarharmonisierte Aura")) {
            helden.framework.D.void void_ = (helden.framework.D.void)helden.framework.d.oooo_0.o00000(while.\u00d6\u00d2\u00f4000.toString());
            for (Node node12 : this.getRealChildren(node)) {
                String string11 = this.getName(node12);
                void_.\u00d500000(string11);
            }
            p2 = void_;
        } else if (string.equals("R\u00fcstungsgew\u00f6hnung I")) {
            helden.framework.D.void void_ = (helden.framework.D.void)helden.framework.d.oooo_0.o00000(while.\u00d8\u00d3\u00d2000.toString());
            for (Node node13 : this.getRealChildren(node)) {
                String string12 = this.getName(node13);
                void_.\u00d500000(string12);
            }
            p2 = void_;
        } else {
            p2 = helden.framework.d.oooo_0.o00000(string);
            if (p2 instanceof helden.framework.D.F) {
                helden.framework.D.F f2 = (helden.framework.D.F)p2;
                f2.\u00d3\u00d40000();
                for (Node node14 : this.getRealChildren(node)) {
                    ArrayList arrayList = this.new(node14);
                    NamenErsetzerKonverter.getInstance().korrigiereWahrerName(this.o00000, f2, arrayList);
                    f2.\u00d400000(f2.new(arrayList));
                }
                if (string.equals(while.\u00d2\u00f80000.toString()) && f2.nullObject().size() == 0 && this.getVersionInt() <= 50207) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("dummy");
                    f2.\u00d400000(f2.new(arrayList));
                }
                return f2;
            }
            if (p2 instanceof helden.framework.D.void) {
                helden.framework.D.void void_ = p2;
                for (Node node15 : this.getRealChildren(node)) {
                    String string13 = this.getName(node15);
                    void_.\u00d500000(string13);
                }
            }
        }
        return p2;
    }

    protected String getStringValue(Node node) {
        return this.getString(node, "value");
    }

    protected String getVariante(Node node) {
        Node node2 = node.getAttributes().getNamedItem("variante");
        if (node2 == null) {
            return "";
        }
        return this.getString(node, "variante");
    }

    protected KonkreterZauber getZauber(Node node) {
        K k2 = this.getRepraesentation(node);
        String string = this.getVariante(node);
        KonkreterZauber konkreterZauber = null;
        if ("true".equals(this.getString(node, "tharun", ""))) {
            ArrayList<o0Oo> arrayList = new ArrayList<o0Oo>();
            ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
            for (Node node2 : this.getRealChildren(node)) {
                arrayList.add(o0Oo.o00000(this.getString(node2, "name")));
                arrayList2.add(this.o00000(node2, "gegenstandsid"));
            }
            TharunZauber tharunZauber = new TharunZauber(TharunZauber.TharunischeZauberArten.valueOf(this.getString(node, "tharunzauberart", "")), arrayList.toArray(new o0Oo[0]), arrayList2.toArray(new Integer[0]));
            konkreterZauber = KonkreterZauber.get(tharunZauber, k2, string);
        } else {
            String string2 = NamenErsetzerKonverter.getInstance().korrigiere(this.getName(node), this.getVersionInt());
            konkreterZauber = KonkreterZauber.getZauber(string2, k2, string);
        }
        return konkreterZauber;
    }

    private helden.framework.E.OoOO.E o00000(Node node) {
        String string = this.getName(node);
        Integer n = 0;
        Integer n2 = 0;
        F f2 = null;
        ArrayList<oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> arrayList = new ArrayList<oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO>();
        for (int i2 = 0; i2 < node.getChildNodes().getLength(); ++i2) {
            Node node2 = node.getChildNodes().item(i2);
            String string2 = node2.getNodeName();
            if (string2.equals("at")) {
                n2 = this.getIntValue(node2);
                continue;
            }
            if (string2.equals("pa")) {
                n = this.getIntValue(node2);
                continue;
            }
            if (string2.equals("dk")) {
                arrayList.add(this.\u00d300000(node2));
                continue;
            }
            if (!string2.equals("tp")) continue;
            f2 = new F(this.o00000(node2, "mul"), this.o00000(node2, "w"), this.o00000(node2, "sum"));
        }
        return new helden.framework.E.OoOO.E(string, arrayList.toArray(new oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO[0]), f2, n2, n);
    }

    private ArrayList new(Node node) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (Node node2 : this.getRealChildren(node)) {
            if (node2.hasChildNodes()) {
                arrayList.add(this.new(node2));
                continue;
            }
            arrayList.add(this.getValue(node2));
        }
        return arrayList;
    }

    private oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO \u00d300000(Node node) {
        if (oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d200000.\u00d600000().equals(this.getString(node, "value"))) {
            return oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d200000;
        }
        if (oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d600000.\u00d600000().equals(this.getString(node, "value"))) {
            return oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d600000;
        }
        if (oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.null.\u00d600000().equals(this.getString(node, "value"))) {
            return oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.null;
        }
        if (oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d800000.\u00d600000().equals(this.getString(node, "value"))) {
            return oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d800000;
        }
        return null;
    }

    private int o00000(Node node, String string) {
        return Integer.parseInt(this.getString(node, string));
    }

    private void o00000(helden.framework.E.C.E e, Node node) {
        boolean bl = false;
        for (int i2 = 0; i2 < node.getChildNodes().getLength(); ++i2) {
            Object object;
            Node node2 = node.getChildNodes().item(i2);
            if (node2.getNodeName().equals("laden")) {
                e.\u00d5O0000(this.o00000(node2, "aktionen"));
            }
            if (node2.getNodeName().equals("munition")) {
                object = this.getString(node2, "art");
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
                e.o00000((E)N.floatsuper().\u00d200000(this.getString(node2, "kampftalent")));
            }
            if (node2.getNodeName().equals("entfernung")) {
                object = new oooo_0(this.o00000(node2, "E0"), this.o00000(node2, "E1"), this.o00000(node2, "E2"), this.o00000(node2, "E3"), this.o00000(node2, "E4"));
                e.o00000((oooo_0)object);
            }
            if (node2.getNodeName().equals("tpmod")) {
                object = new C(this.o00000(node2, "M0"), this.o00000(node2, "M1"), this.o00000(node2, "M2"), this.o00000(node2, "M3"), this.o00000(node2, "M4"));
                e.o00000((C)object);
            }
            if (!node2.getNodeName().equals("trefferpunkte")) continue;
            object = new F(this.o00000(node2, "mul"), this.o00000(node2, "w"), this.o00000(node2, "sum"));
            e.\u00d200000((F)object);
        }
    }

    private void o00000(helden.framework.E.C.M m, Node node) {
        m.fornew().clear();
        for (Node node2 : a_0.o00000(node)) {
            String string = node2.getNodeName();
            if (!string.equals("gmods")) {
                helden.framework.held.object.oooo_0.\u00f500000("Tag " + string + " statt gmods gefunden!");
                continue;
            }
            for (Node node3 : a_0.o00000(node2)) {
                string = node3.getNodeName();
                if (!string.equals("gmod")) {
                    helden.framework.held.object.oooo_0.\u00f500000("Tag " + string + " statt gmod gefunden!");
                    continue;
                }
                GMod gMod = GmodFactory.getGmodName(this.getName(node3));
                if (gMod == null) continue;
                for (Node node4 : a_0.o00000(node3)) {
                    string = node4.getNodeName();
                    if (!string.equals("wahl")) {
                        helden.framework.held.object.oooo_0.\u00f500000("Tag " + string + " statt wahl gefunden! Text: " + node4.getTextContent());
                        continue;
                    }
                    int n = this.o00000(node4, "position");
                    String string2 = this.getString(node4, "value");
                    gMod.setAuswahlPosition(n, string2);
                }
                m.fornew().add(gMod);
            }
        }
    }

    private void o00000(helden.framework.E.C.A a2, Node node) {
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
                a2.\u00d300000((E)N.floatsuper().\u00d200000(this.getString(node2, "kampftalent")));
            }
            if (node2.getNodeName().equals("trefferpunkte")) {
                object = new F(this.o00000(node2, "mul"), this.o00000(node2, "w"), this.o00000(node2, "sum"));
                a2.o00000((F)object);
            }
            if (node2.getNodeName().equals("wm")) {
                object = new null(this.o00000(node2, "at"), this.o00000(node2, "pa"));
                a2.o00000((null)object);
            }
            if (node2.getNodeName().equals("bf")) {
                int n2 = this.o00000(node2, "min");
                n = this.o00000(node2, "akt");
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
                a2.o00000(this.o00000(node2, "ini"));
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
                    a2.\u00d8\u00d50000().add(this.\u00d300000(node3));
                }
            }
            if (node2.getNodeName().equals("tpkk")) {
                A a3 = new A(this.o00000(node2, "kk"), this.o00000(node2, "schrittweite"));
                a2.o00000(a3);
            }
            if (node2.getNodeName().equals("laenge")) {
                a2.oo0000(this.o00000(node2, "laenge"));
            }
            if (!node2.getNodeName().equals("schadensart")) continue;
            a2.String(this.getString(node2, "ausdauer").equals("true"));
        }
    }

    private void o00000(helden.framework.E.F f2, Node node) {
        for (int i2 = 0; i2 < node.getChildNodes().getLength(); ++i2) {
            Node node2 = node.getChildNodes().item(i2);
            if (node2.getNodeName().equals("name")) {
                f2.o00000(this.getString(node2, "value"));
            }
            if (node2.getNodeName().equals("preis")) {
                f2.\u00d500000(this.o00000(node2, "value"));
            }
            if (!node2.getNodeName().equals("gewicht")) continue;
            f2.o00000(Float.parseFloat(this.getString(node2, "value")));
        }
    }

    private void o00000(B b, Node node) {
        for (int i2 = 0; i2 < node.getChildNodes().getLength(); ++i2) {
            Node node2 = node.getChildNodes().item(i2);
            if (node2.getNodeName().equals("bauch")) {
                b.\u00d2O0000(this.o00000(node2, "value"));
            }
            if (node2.getNodeName().equals("brust")) {
                b.oO0000(this.o00000(node2, "value"));
            }
            if (node2.getNodeName().equals("gesbe")) {
                b.\u00f600000(this.o00000(node2, "value"));
            }
            if (node2.getNodeName().equals("geszors")) {
                b.null(this.o00000(node2, "value"));
            }
            if (node2.getNodeName().equals("rs")) {
                b.\u00d500000(this.o00000(node2, "value"));
            }
            if (node2.getNodeName().equals("kopf")) {
                b.\u00d300000(this.o00000(node2, "value"));
            }
            if (node2.getNodeName().equals("ruecken")) {
                b.\u00f500000(this.o00000(node2, "value"));
            }
            if (node2.getNodeName().equals("rechterarm")) {
                b.\u00d800000(this.o00000(node2, "value"));
            }
            if (node2.getNodeName().equals("linkerarm")) {
                b.\u00f800000(this.o00000(node2, "value"));
            }
            if (node2.getNodeName().equals("rechtesbein")) {
                b.\u00d200000(this.o00000(node2, "value"));
            }
            if (node2.getNodeName().equals("linkesbein")) {
                b.String(this.o00000(node2, "value"));
            }
            if (node2.getNodeName().equals("sterne")) {
                b.\u00d600000(this.o00000(node2, "value"));
            }
            if (!node2.getNodeName().equals("teile")) continue;
            b.for(this.o00000(node2, "value"));
        }
    }

    private void o00000(helden.framework.E.C.I i2, Node node, H h2) {
        for (int i3 = 0; i3 < node.getChildNodes().getLength(); ++i3) {
            Node node2 = node.getChildNodes().item(i3);
            String string = node2.getNodeName();
            if (string.equals("runenstatus")) {
                i2.o00000(I._o.valueOf(this.getString(node2, "value")));
                continue;
            }
            if (string.equals("id")) {
                i2.o00000(Integer.parseInt(this.getString(node2, "value")));
                continue;
            }
            helden.framework.held.object.oooo_0.\u00f500000("Tag " + string + " gefunden!");
        }
    }

    private void o00000(helden.framework.E.C.void void_, Node node) {
        for (int i2 = 0; i2 < node.getChildNodes().getLength(); ++i2) {
            Node node2 = node.getChildNodes().item(i2);
            if (node2.getNodeName().equals("wm")) {
                null nullVal = new null(this.o00000(node2, "at"), this.o00000(node2, "pa"));
                void_.\u00d200000(nullVal);
            }
            if (node2.getNodeName().equals("bf")) {
                int n = this.o00000(node2, "min");
                int n2 = this.o00000(node2, "akt");
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
            void_.\u00f8O0000(this.o00000(node2, "ini"));
        }
    }

    private void o00000(helden.framework.E.C.K k2, Node node, H h2) {
        for (int i2 = 0; i2 < node.getChildNodes().getLength(); ++i2) {
            Number number;
            Object object;
            Node node2 = node.getChildNodes().item(i2);
            String string = node2.getNodeName();
            if (string.equals("ini")) {
                k2.o00000(new S(this.o00000(node2, "mul"), this.o00000(node2, "w"), this.o00000(node2, "sum")));
                continue;
            }
            if (string.equals("eigenschaften")) {
                k2.o\u00d40000();
                for (Node node3 : a_0.o00000(node2)) {
                    object = this.getName(node3);
                    number = this.getNumberValue(node3);
                    k2.o00000(oooo_3.\u00f400000((String)object), (Object)number);
                }
                continue;
            }
            if (string.equals("sonderfertigkeiten")) {
                k2.\u00d5\u00d40000();
                for (Node node3 : a_0.o00000(node2)) {
                    object = this.getSonderfertigkeit(node3);
                    k2.o00000((P)object);
                }
                continue;
            }
            if (string.equals("vorteile")) {
                k2.\u00d8\u00d30000();
                for (Node node3 : a_0.o00000(node2)) {
                    object = this.getVorteil(node3);
                    if (object == null) {
                        h2.\u00d300000("Durch einen Fehler ist bei dem Tier ein Vorteil oder Nachteil entfallen. Bitte das Tier entsprechend pr\u00fcfen!");
                        continue;
                    }
                    if (!(object instanceof public)) {
                        object = helden.framework.C.K.o00000((helden.framework.C.I)object);
                    }
                    k2.o00000((public)object);
                }
                continue;
            }
            if (string.equals("groesse")) {
                k2.returnsuper(this.getIntValue(node2));
                continue;
            }
            if (string.equals("familie")) {
                k2.\u00d300000(this.getStringValue(node2));
                continue;
            }
            if (string.equals("gattung")) {
                k2.\u00d200000(this.getStringValue(node2));
                continue;
            }
            if (string.equals("wesensart")) {
                k2.o00000(K._o.o00000(this.getStringValue(node2)));
                continue;
            }
            if (string.equals("angriffe")) {
                k2.\u00d6\u00d40000().clear();
                for (Node node3 : a_0.o00000(node2)) {
                    k2.\u00d6\u00d40000().add(this.o00000(node3));
                }
                continue;
            }
            if (string.equals("talente")) {
                for (Node node3 : a_0.o00000(node2)) {
                    object = this.getName(node3);
                    number = this.getNumberValue(node3);
                    k2.o00000(N.floatsuper().\u00d200000((String)object), number);
                }
                continue;
            }
            if (string.equals("zauber")) {
                for (Node node3 : a_0.o00000(node2)) {
                    object = this.getName(node3);
                    number = this.getNumberValue(node3);
                    k2.o00000(ZauberFabrik.getInstance().getZauberfertigkeit((String)object), number);
                }
                continue;
            }
            helden.framework.held.object.oooo_0.\u00f500000("Tag " + string + " gefunden!");
        }
    }
}

