/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.int;

import helden.framework.C.I;
import helden.framework.C.Oo0O;
import helden.framework.C.public;
import helden.framework.D.OOOo;
import helden.framework.D.for;
import helden.framework.OoOO.G;
import helden.framework.Wuerfelwurf;
import helden.framework.held.Object.Q;
import helden.framework.held.a.oooo_1;
import helden.framework.int.O;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.framework.oooo.a.b_0;
import helden.framework.oooo.a.oooo_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.gui.O0OO.A.oOOO;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.w3c.dom.Node;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class C
extends P
implements O {
    private ArrayList<C> \u00d3\u00d4\u00f6000;
    private String o\u00d5\u00f6000;
    private String whilenullclass;
    private String forvoidclass;
    private TreeMap<oo0o_0, Integer> Stringintclass;
    private TreeMap<helden.framework.oooo.b_0, Integer> \u00d5\u00d4\u00f6000;
    private TreeMap<helden.framework.oooo.b_0, Integer> newnullclass;
    private int \u00f4\u00d5\u00f6000;
    private Node ifnullclass;
    private boolean \u00d8\u00d2\u00f6000;
    private ArrayList<String> returnnullclass;
    private Oo0O \u00d4\u00d3\u00f6000;
    private OOOo \u00f8\u00d2\u00f6000;
    private List<for> O\u00d4\u00f6000;
    private boolean \u00f4\u00d4\u00f6000;
    private boolean O\u00d5\u00f6000;
    private boolean forintclass;
    private Integer O\u00d3\u00f6000;
    private List<String> \u00d3\u00d5\u00f6000;
    private ArrayList<KonkreterZauber> \u00d5\u00d3\u00f6000;
    private WaehlbareZauber \u00d8\u00d5\u00f6000;
    private String o\u00d4\u00f6000;
    private G \u00f5\u00d3\u00f6000;
    private G o\u00d3\u00f6000;
    private ArrayList<oooo_0> \u00d8\u00d4\u00f6000;
    private ArrayList<oOOO> \u00f4\u00d3\u00f6000;
    private ArrayList<oo0o_0> thisintclass;
    private ArrayList<public> privateintclass;
    private ArrayList<public> \u00f4\u00d2\u00f6000;
    private ArrayList<public> \u00f5\u00d2\u00f6000;
    private ArrayList<oooo_1> \u00f8\u00d4\u00f6000;
    private ArrayList<oooo_1> \u00d5\u00d5\u00f6000;
    private String \u00f5\u00d5\u00f6000;
    private String \u00d4\u00d5\u00f6000;
    private String \u00f5\u00d4\u00f6000;
    private ArrayList<G> \u00d8\u00d3\u00f6000;
    private Integer[] \u00f8\u00d3\u00f6000;
    private Wuerfelwurf \u00d3\u00d3\u00f6000;
    private Wuerfelwurf privatevoidclass;
    private Wuerfelwurf \u00d5\u00d2\u00f6000;
    private int nullintclass;
    private int \u00d4\u00d4\u00f6000;

    public C() {
        super("", 0, false);
        this.\u00f5\u00f80000();
    }

    @Override
    public void o00000(oooo_1 oooo_12) {
        this.\u00f8\u00d4\u00f6000.add(oooo_12);
    }

    @Override
    public void o00000(oooo_0 oooo_02) {
        this.\u00d8\u00d4\u00f6000.add(oooo_02);
        this.\u00d8\u00d2\u00f6000 = true;
    }

    @Override
    public void \u00d200000(oooo_1 oooo_12) {
        this.\u00d5\u00d5\u00f6000.add(oooo_12);
    }

    @Override
    public void o00000(KonkreterZauber konkreterZauber) {
        if (this.\u00d5\u00d3\u00f6000 == null) {
            this.\u00d5\u00d3\u00f6000 = new ArrayList();
        }
        this.\u00d8\u00d2\u00f6000 = true;
        this.\u00d5\u00d3\u00f6000.add(konkreterZauber);
    }

    @Override
    public void o00000(oOOO oOOO2) {
        this.\u00f4\u00d3\u00f6000.add(oOOO2);
        this.\u00d8\u00d2\u00f6000 = true;
    }

    @Override
    public void o00000(oo0o_0 oo0o_02, Integer n) {
        if (this.Stringintclass == null) {
            this.Stringintclass = new TreeMap();
        }
        this.\u00d8\u00d2\u00f6000 = true;
        this.Stringintclass.put(oo0o_02, n);
    }

    public void o00000(C c) {
        this.\u00d3\u00d4\u00f6000.add(c);
    }

    public void \u00d200000(KonkreterZauber konkreterZauber) {
        this.\u00d8\u00d5\u00f6000.add(konkreterZauber);
        this.\u00d8\u00d2\u00f6000 = true;
    }

    public boolean equals(Object object) {
        if (object instanceof C) {
            C c = (C)object;
            return this.toString().equals(object.toString()) && c.o\u00f60000().equals(this.o\u00f60000());
        }
        return false;
    }

    public void publicnull() {
        this.\u00d8\u00d2\u00f6000 = true;
        this.o\u00f60000();
    }

    public Wuerfelwurf interfacevoid() {
        return this.\u00d3\u00d3\u00f6000;
    }

    public Integer[] superint() {
        return this.\u00f8\u00d3\u00f6000;
    }

    public ArrayList<oooo_1> \u00d4\u00f80000() {
        return this.\u00f8\u00d4\u00f6000;
    }

    public OOOo \u00d60O000() {
        return this.\u00f8\u00d2\u00f6000;
    }

    public Oo0O \u00f6\u00f60000() {
        return this.\u00d4\u00d3\u00f6000;
    }

    @Override
    public String \u00d6\u00f60000() {
        return this.o\u00d4\u00f6000;
    }

    public List<String> classint() {
        return this.\u00d3\u00d5\u00f6000;
    }

    public ArrayList<public> voidnull() {
        return this.\u00f5\u00d2\u00f6000;
    }

    @Override
    public String \u00d5\u00f50000() {
        return this.o\u00d5\u00f6000;
    }

    public int \u00d50O000() {
        return this.nullintclass;
    }

    public int OOO000() {
        return this.\u00d4\u00d4\u00f6000;
    }

    @Override
    public int getGPKosten() {
        return this.\u00f4\u00d5\u00f6000;
    }

    public Wuerfelwurf \u00d40O000() {
        return this.privatevoidclass;
    }

    public Wuerfelwurf \u00f40O000() {
        return this.\u00d5\u00d2\u00f6000;
    }

    public ArrayList<oooo_1> \u00f4\u00f80000() {
        return this.\u00d5\u00d5\u00f6000;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public String \u00f6\u00f50000() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<u>" + this.forvoidclass + "/" + this.whilenullclass + " (" + this.getGPKosten() + " GP");
        if (this.O\u00d5\u00f6000) {
            stringBuffer.append("; zeitaufwendig");
        }
        stringBuffer.append(")</u><br>");
        stringBuffer.append("<i>" + this.\u00d6\u00f60000() + "</i><br>");
        stringBuffer.append("Urheber: " + this.\u00f5\u00d4\u00f6000 + "<br>");
        stringBuffer.append("Kontakt: " + this.\u00d4\u00d5\u00f6000 + "<br>");
        if (this.\u00d5\u00d4\u00f6000.size() > 0) {
            stringBuffer.append("Voraussetzungen:<br><ul>");
            for (Map.Entry<helden.framework.oooo.b_0, Integer> object2 : this.\u00d5\u00d4\u00f6000.entrySet()) {
                if (object2.getKey().equals(helden.framework.oooo.b_0.\u00f5\u00f5\u00d2000)) continue;
                stringBuffer.append("<li> " + object2.getKey() + " " + object2.getValue() + "\n");
            }
            stringBuffer.append("</ul>");
        }
        if (this.newnullclass.size() > 0) {
            stringBuffer.append("Modifikatoren:<br><ul>");
            for (Map.Entry<helden.framework.oooo.b_0, Integer> entry : this.newnullclass.entrySet()) {
                stringBuffer.append("<li> " + entry.getKey() + " " + entry.getValue() + "\n");
            }
            stringBuffer.append("<li> SO " + this.\u00d5\u00d4\u00f6000.get(helden.framework.oooo.b_0.\u00f5\u00f5\u00d2000) + "-" + this.\u00d2\u00f80000());
            stringBuffer.append("</ul>");
        }
        if (this.\u00d4\u00d3\u00f6000.OO0000() > 0) {
            stringBuffer.append("Automatische Vor- und Nachteile:<br><ul>");
            for (public public_ : this.\u00d4\u00d3\u00f6000.o00000().getListe()) {
                stringBuffer.append("<li> " + public_.oO0000());
            }
            stringBuffer.append("</ul>");
        }
        if (this.\u00f4\u00d2\u00f6000.size() > 0) {
            stringBuffer.append("Ungeeignete Vor- und Nachteile:<br><ul>");
            for (I i2 : this.\u00f4\u00d2\u00f6000) {
                if (i2 instanceof public) {
                    stringBuffer.append("<li> " + ((public)i2).oO0000());
                    continue;
                }
                stringBuffer.append("<li> " + i2.toString());
            }
            stringBuffer.append("</ul>");
        }
        if (this.\u00f5\u00d2\u00f6000.size() > 0) {
            stringBuffer.append("Empfohlende Vor- und Nachteile:<br><ul>");
            for (I i3 : this.\u00f5\u00d2\u00f6000) {
                if (i3 instanceof public) {
                    stringBuffer.append("<li> " + ((public)i3).oO0000());
                    continue;
                }
                stringBuffer.append("<li> " + i3.toString());
            }
            stringBuffer.append("</ul>");
        }
        if (this.thisintclass.size() > 0) {
            stringBuffer.append("Folgende Talente entfallen:<ul>");
            for (oo0o_0 oo0o_02 : this.thisintclass) {
                stringBuffer.append("<li>" + oo0o_02.toString());
            }
            stringBuffer.append("</ul>");
        }
        Object object3 = "";
        for (Map.Entry<oo0o_0, Integer> entry : this.Stringintclass.entrySet()) {
            if (!entry.getKey().getArt().toString().equals(object3)) {
                if (!((String)object3).equals("")) {
                    stringBuffer.append("</ul>");
                }
                object3 = entry.getKey().getArt().toString();
                stringBuffer.append((String)object3 + ":<ul>");
            }
            stringBuffer.append("<li>" + entry.getKey() + " " + entry.getValue());
        }
        if (!((String)object3).equals("")) {
            stringBuffer.append("</ul>");
        }
        if (this.\u00f8\u00d2\u00f6000.newsuper() > 0) {
            stringBuffer.append("Automatische Sonderfertigkeiten:<br><ul>");
            Iterator<helden.framework.D.P> iterator = this.\u00f8\u00d2\u00f6000.iterator();
            while (iterator.hasNext()) {
                stringBuffer.append("<li>" + iterator.next());
            }
            stringBuffer.append("</ul>");
        }
        if (this.O\u00d4\u00f6000.size() > 0) {
            stringBuffer.append("Verbilligte Sonderfertigkeiten:<br><ul>");
            Iterator<for> iterator = this.O\u00d4\u00f6000.iterator();
            while (iterator.hasNext()) {
                stringBuffer.append("<li>" + iterator.next());
            }
            stringBuffer.append("</ul>");
        }
        if (this.\u00d8\u00d4\u00f6000.size() > 0 || this.\u00f4\u00d3\u00f6000.size() > 0) {
            boolean bl = true;
            stringBuffer.append("Auswahlen:<br><ul>");
            for (oooo_0 oooo_02 : this.\u00d8\u00d4\u00f6000) {
                void var4_21;
                stringBuffer.append((int)var4_21 + ". Auswahl<br><ul>");
                stringBuffer.append("<li>Anzahl " + oooo_02.\u00d600000());
                for (b_0 b_02 : oooo_02.\u00d200000()) {
                    stringBuffer.append("<li>" + b_02.toString() + " ");
                }
                ++var4_21;
                stringBuffer.append("</ul>");
            }
            for (oOOO oOOO2 : this.\u00f4\u00d3\u00f6000) {
                void var4_22;
                stringBuffer.append((int)var4_22 + ". Auswahl<br><ul>");
                stringBuffer.append("<li>Talentmenge: " + oOOO2.\u00f800000().toString());
                stringBuffer.append("<li>Werte: " + oOOO2.OO0000().toString());
                stringBuffer.append("</ul>");
                ++var4_22;
            }
            stringBuffer.append("</ul>");
        }
        stringBuffer.append("Anmerkungen:<br><ul>");
        if (this.istOptional()) {
            stringBuffer.append("<li>Diese Profession/Variante ist optional.");
        } else {
            stringBuffer.append("<li>Diese Profession/Variante geh\u00f6rt zu den nicht-optional Varianten.");
        }
        if (!this.\u00f4\u00d4\u00f6000) {
            stringBuffer.append("<li>Diese Profession/Variante darf nicht zusammen mit Veteran gew\u00e4hlt werden.");
        }
        if (this.\u00d4\u00f50000()) {
            stringBuffer.append("<li>Magiedilletanten sind erlaubt.");
        } else {
            stringBuffer.append("<li>Magiedilletanten sind nicht erlaubt.");
        }
        stringBuffer.append("</ul>");
        if (this.\u00f5\u00f50000().size() > 0) {
            stringBuffer.append("Lehr/Zweitsprache<ul>");
            for (G g2 : this.\u00f5\u00f50000()) {
                stringBuffer.append("<li>" + g2);
            }
            stringBuffer.append("</ul>");
        }
        if (this.\u00d5\u00d3\u00f6000 != null) {
            for (KonkreterZauber konkreterZauber : this.\u00d5\u00d3\u00f6000) {
                stringBuffer.append("Hauszauber " + konkreterZauber.toString() + "<br>");
            }
        }
        Iterator<String> iterator = this.\u00d3\u00d5\u00f6000.iterator();
        while (iterator.hasNext()) {
            stringBuffer.append("BesondererBesitz " + iterator.next() + "<br>");
        }
        return stringBuffer.toString();
    }

    @Override
    public String o\u00f60000() {
        this.\u00d20O000();
        return this.returnnullclass.get(0);
    }

    public String o\u00f80000() {
        return this.\u00f5\u00d5\u00f6000;
    }

    @Override
    public ArrayList<String> \u00d5\u00f60000() {
        this.\u00d20O000();
        return this.returnnullclass;
    }

    public super._o \u00f6\u00f80000() {
        return super._o.\u00f400000;
    }

    @Override
    public String dovoid() {
        return this.\u00d4\u00d5\u00f6000;
    }

    public int \u00d2\u00f80000() {
        return this.O\u00d3\u00f6000;
    }

    @Override
    public TreeMap<helden.framework.oooo.b_0, Integer> O\u00f60000() {
        return this.newnullclass;
    }

    @Override
    public G supervoid() {
        return this.o\u00d3\u00f6000;
    }

    @Override
    public G \u00d4\u00f60000() {
        return this.\u00f5\u00d3\u00f6000;
    }

    @Override
    public String classvoid() {
        return this.forvoidclass;
    }

    @Override
    public String intvoid() {
        return this.whilenullclass;
    }

    public ArrayList<oOOO> \u00d5\u00f80000() {
        return this.\u00f4\u00d3\u00f6000;
    }

    @Override
    public TreeMap<oo0o_0, Integer> \u00f4\u00f50000() {
        return this.Stringintclass;
    }

    public String \u00d6\u00f80000() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<html><body>Selbsterstellte Profession<p>");
        if (this.o\u00d4\u00f6000 != null) {
            stringBuffer.append(this.o\u00d4\u00f6000);
        }
        stringBuffer.append("<p>ID: " + this.o\u00f60000());
        stringBuffer.append("</body></html>");
        return stringBuffer.toString();
    }

    public ArrayList<public> Objectnull() {
        return this.\u00f4\u00d2\u00f6000;
    }

    @Override
    public String \u00d2\u00f50000() {
        return this.\u00f5\u00d4\u00f6000;
    }

    public String O\u00f80000() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Name weiblich " + this.forvoidclass + "\n");
        stringBuffer.append("Name m\u00e4nnlich " + this.whilenullclass + "\n");
        stringBuffer.append("Kontakt " + this.\u00d4\u00d5\u00f6000 + "\n");
        stringBuffer.append("Urheber " + this.\u00f5\u00d4\u00f6000 + "\n");
        stringBuffer.append("Optinal " + this.istOptional() + "\n");
        stringBuffer.append("GP " + this.getGPKosten() + "\n");
        stringBuffer.append("veteranErlaubt " + this.\u00f4\u00d4\u00f6000 + "\n");
        stringBuffer.append("zeitaufwendig " + this.O\u00d5\u00f6000 + "\n");
        stringBuffer.append("magiedilletantErlaubt " + this.forintclass + "\n");
        stringBuffer.append("maxSO " + this.O\u00d3\u00f6000 + "\n");
        stringBuffer.append("beschreibung " + this.o\u00d4\u00f6000 + "\n");
        for (Map.Entry<oo0o_0, Integer> iterator2 : this.Stringintclass.entrySet()) {
            stringBuffer.append("Talent " + iterator2.getKey() + " " + iterator2.getValue() + "\n");
        }
        for (oo0o_0 oo0o_02 : this.thisintclass) {
            stringBuffer.append("zu entfernende Talente " + oo0o_02.toString());
        }
        if (this.\u00f5\u00f50000().size() > 0) {
            for (G g2 : this.\u00f5\u00f50000()) {
                stringBuffer.append("Lehr/Zweitsprache " + g2 + "\n");
            }
        }
        if (this.\u00d5\u00d3\u00f6000 != null) {
            for (KonkreterZauber konkreterZauber : this.\u00d5\u00d3\u00f6000) {
                stringBuffer.append("Hauszauber " + konkreterZauber.toString() + "\n");
            }
        }
        for (Map.Entry<helden.framework.oooo.b_0, Integer> entry : this.newnullclass.entrySet()) {
            stringBuffer.append("Modifikator " + entry.getKey() + " " + entry.getValue() + "\n");
        }
        for (Map.Entry<helden.framework.oooo.b_0, Integer> entry : this.\u00d5\u00d4\u00f6000.entrySet()) {
            stringBuffer.append("Voraussetzungen " + entry.getKey() + " " + entry.getValue() + "\n");
        }
        Iterator<helden.framework.D.P> iterator = this.\u00f8\u00d2\u00f6000.iterator();
        while (iterator.hasNext()) {
            stringBuffer.append("Automatische Sf " + iterator.next() + "\n");
        }
        for (public public_ : this.\u00d4\u00d3\u00f6000.o00000().getListe()) {
            stringBuffer.append("Vorteile " + public_.oO0000());
        }
        for (I i2 : this.\u00f4\u00d2\u00f6000) {
            if (i2 instanceof public) {
                stringBuffer.append("ungeeigneter Vorteile " + ((public)i2).oO0000());
                continue;
            }
            stringBuffer.append("ungeeigneter Vorteile " + i2.toString());
        }
        for (I i3 : this.\u00f5\u00d2\u00f6000) {
            if (i3 instanceof public) {
                stringBuffer.append("empfohlender Vorteile " + ((public)i3).oO0000());
                continue;
            }
            stringBuffer.append("empfohlender Vorteile " + i3.toString());
        }
        Iterator<Object> iterator2 = this.O\u00d4\u00f6000.iterator();
        while (iterator2.hasNext()) {
            stringBuffer.append("Verbilligte Sf " + iterator2.next() + "\n");
        }
        Iterator<String> iterator3 = this.\u00d3\u00d5\u00f6000.iterator();
        while (iterator3.hasNext()) {
            stringBuffer.append("BesondererBesitz " + iterator3.next() + "\n");
        }
        int n = 1;
        for (oooo_0 oooo_02 : this.\u00d8\u00d4\u00f6000) {
            stringBuffer.append("Auswahl " + n + ", Anzahl " + oooo_02.\u00d600000() + "\n");
            stringBuffer.append("Auswahl " + n + ", Wahl [");
            for (b_0 b_02 : oooo_02.\u00d200000()) {
                stringBuffer.append(b_02.toString() + " ");
            }
            stringBuffer.append("]\n");
            ++n;
        }
        n = 1;
        for (oOOO oOOO2 : this.\u00f4\u00d3\u00f6000) {
            stringBuffer.append("Talentauswahl " + n + " Werte: " + oOOO2.OO0000().toString() + "\n");
            stringBuffer.append("Talentauswahl " + n + " Talente: " + oOOO2.\u00f800000().toString() + "\n");
        }
        if (this.\u00f5\u00d3\u00f6000 != null) {
            stringBuffer.append("Muttersprache " + this.\u00f5\u00d3\u00f6000 + "\n");
        }
        if (this.o\u00d3\u00f6000 != null) {
            stringBuffer.append("Mutterschrift " + this.o\u00d3\u00f6000 + "\n");
        }
        for (KonkreterZauber konkreterZauber : this.\u00d8\u00d5\u00f6000.getZauberListe()) {
            stringBuffer.append("W\u00e4hlbare Zauber: " + konkreterZauber.toStringKomplett() + ": " + this.\u00d8\u00d5\u00f6000.getKostenModifizier(konkreterZauber) + "\n");
        }
        for (oooo_1 oooo_12 : this.\u00d5\u00d5\u00f6000) {
            stringBuffer.append("Haarfarbe: " + oooo_12.String() + " " + oooo_12.\u00d300000() + "\n");
        }
        for (oooo_1 oooo_13 : this.\u00f8\u00d4\u00f6000) {
            stringBuffer.append("Augenfarbe: " + oooo_13.String() + " " + oooo_13.\u00d300000() + "\n");
        }
        if (this.\u00f8\u00d3\u00f6000 != null) {
            for (int i4 = 0; i4 < 6; ++i4) {
                stringBuffer.append("Altersstufe " + this.superint()[i4] + "\n");
            }
        }
        if (!this.\u00d3\u00d3\u00f6000.isNull()) {
            stringBuffer.append("Alter " + this.\u00d3\u00d3\u00f6000.toString());
        }
        if (this.nullintclass > 0) {
            stringBuffer.append("GewichtDiffernzM " + this.nullintclass);
        }
        if (this.\u00d4\u00d4\u00f6000 > 0) {
            stringBuffer.append("GewichtDiffernzW " + this.\u00d4\u00d4\u00f6000);
        }
        if (!this.privatevoidclass.isNull()) {
            stringBuffer.append("GroesseM " + this.privatevoidclass.toString());
        }
        if (!this.\u00d5\u00d2\u00f6000.isNull()) {
            stringBuffer.append("GroesseW " + this.\u00d5\u00d2\u00f6000.toString());
        }
        return stringBuffer.toString();
    }

    public ArrayList<C> floatnull() {
        return this.\u00d3\u00d4\u00f6000;
    }

    public ArrayList<oooo_0> o0O000() {
        return this.\u00d8\u00d4\u00f6000;
    }

    public List<for> O0O000() {
        return this.O\u00d4\u00f6000;
    }

    @Override
    public TreeMap<helden.framework.oooo.b_0, Integer> \u00f4\u00f60000() {
        return this.\u00d5\u00d4\u00f6000;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        return this.\u00d8\u00d5\u00f6000;
    }

    @Override
    public Node \u00d2\u00f60000() {
        return this.ifnullclass;
    }

    @Override
    public ArrayList<oo0o_0> publicreturn() {
        return this.thisintclass;
    }

    public ArrayList<public> \u00f60O000() {
        return this.privateintclass;
    }

    @Override
    public ArrayList<G> \u00f5\u00f50000() {
        return this.\u00d8\u00d3\u00f6000;
    }

    public int hashCode() {
        return this.o\u00f60000().hashCode();
    }

    @Override
    public boolean o\u00f50000() {
        return this.\u00d8\u00d2\u00f6000;
    }

    @Override
    public boolean \u00d4\u00f50000() {
        return this.forintclass;
    }

    public boolean \u00f50O000() {
        return false;
    }

    @Override
    public boolean \u00f5\u00f60000() {
        return this.\u00f4\u00d4\u00f6000;
    }

    @Override
    public boolean \u00d6\u00f50000() {
        return this.O\u00d5\u00f6000;
    }

    public void o00000(Wuerfelwurf wuerfelwurf) {
        this.\u00d3\u00d3\u00f6000 = wuerfelwurf;
    }

    public void o00000(Integer[] integerArray) {
        this.\u00f8\u00d3\u00f6000 = integerArray;
    }

    @Override
    public void o00000(OOOo oOOo) {
        this.\u00d8\u00d2\u00f6000 = true;
        this.\u00f8\u00d2\u00f6000 = oOOo;
    }

    @Override
    public void o00000(Oo0O oo0O) {
        this.\u00d8\u00d2\u00f6000 = true;
        this.\u00d4\u00d3\u00f6000 = oo0O;
    }

    @Override
    public void \u00d2O0000(String string) {
        this.\u00d8\u00d2\u00f6000 = true;
        this.o\u00d4\u00f6000 = string;
    }

    @Override
    public void \u00d200000(List<String> list) {
        this.\u00d8\u00d2\u00f6000 = true;
        Collections.sort(list);
        this.\u00d3\u00d5\u00f6000 = list;
    }

    public void \u00d400000(ArrayList<public> arrayList) {
        this.\u00f5\u00d2\u00f6000 = arrayList;
    }

    @Override
    public void \u00f500000(String string) {
        this.o\u00d5\u00f6000 = string;
    }

    public void \u00d6O0000(int n) {
        this.nullintclass = n;
    }

    public void \u00d5O0000(int n) {
        this.\u00d4\u00d4\u00f6000 = n;
    }

    @Override
    public void \u00d4O0000(int n) {
        this.\u00d8\u00d2\u00f6000 = true;
        this.\u00f4\u00d5\u00f6000 = n;
    }

    public void Object(Wuerfelwurf wuerfelwurf) {
        this.privatevoidclass = wuerfelwurf;
    }

    public void \u00d200000(Wuerfelwurf wuerfelwurf) {
        this.\u00d5\u00d2\u00f6000 = wuerfelwurf;
    }

    public void public(String string) {
        this.\u00f5\u00d5\u00f6000 = string;
        this.\u00d8\u00d2\u00f6000 = true;
    }

    @Override
    public void \u00f600000(String string) {
        this.\u00d4\u00d5\u00f6000 = string;
        this.\u00d8\u00d2\u00f6000 = true;
    }

    @Override
    public void \u00f500000(boolean bl) {
        this.\u00d8\u00d2\u00f6000 = true;
        this.forintclass = bl;
    }

    @Override
    public void \u00d200000(Integer n) {
        this.\u00d8\u00d2\u00f6000 = true;
        this.O\u00d3\u00f6000 = n;
    }

    @Override
    public void o00000(TreeMap<helden.framework.oooo.b_0, Integer> treeMap) {
        this.\u00d8\u00d2\u00f6000 = true;
        this.newnullclass = treeMap;
    }

    @Override
    public void \u00d500000(G g2) {
        this.o\u00d3\u00f6000 = g2;
        this.\u00d8\u00d2\u00f6000 = true;
    }

    @Override
    public void \u00d400000(G g2) {
        this.\u00f5\u00d3\u00f6000 = g2;
        this.\u00d8\u00d2\u00f6000 = true;
    }

    @Override
    public void float(String string) {
        this.\u00d8\u00d2\u00f6000 = true;
        this.forvoidclass = string;
    }

    @Override
    public void oO0000(String string) {
        this.\u00d8\u00d2\u00f6000 = true;
        this.whilenullclass = string;
    }

    public void \u00d500000(ArrayList<public> arrayList) {
        this.\u00f4\u00d2\u00f6000 = arrayList;
    }

    @Override
    public void OO0000(String string) {
        this.\u00f5\u00d4\u00f6000 = string;
        this.\u00d8\u00d2\u00f6000 = true;
    }

    @Override
    public void o00000(List<for> list) {
        this.\u00d8\u00d2\u00f6000 = true;
        this.O\u00d4\u00f6000.clear();
        this.O\u00d4\u00f6000.addAll(list);
    }

    @Override
    public void \u00f400000(boolean bl) {
        this.\u00d8\u00d2\u00f6000 = true;
        this.\u00f4\u00d4\u00f6000 = bl;
    }

    @Override
    public void \u00d200000(TreeMap<helden.framework.oooo.b_0, Integer> treeMap) {
        this.\u00d8\u00d2\u00f6000 = true;
        this.\u00d5\u00d4\u00f6000 = treeMap;
    }

    @Override
    public void \u00d200000(Node node) {
        this.ifnullclass = node;
    }

    public void \u00d600000(ArrayList<KonkreterZauber> arrayList) {
        arrayList.addAll(this.\u00d5\u00d3\u00f6000);
    }

    @Override
    public void void(boolean bl) {
        this.\u00d8\u00d2\u00f6000 = true;
        this.O\u00d5\u00f6000 = bl;
    }

    @Override
    public void Object(ArrayList<G> arrayList) {
        this.\u00d8\u00d3\u00f6000 = arrayList;
    }

    @Override
    public String toString() {
        return this.forvoidclass;
    }

    private void \u00d20O000() {
        if (this.\u00d8\u00d2\u00f6000) {
            String string = this.O\u00f80000();
            this.returnnullclass = new ArrayList(6);
            this.returnnullclass.add("02-" + Q.o00000(string, Charset.forName("UTF-8")));
            for (String string2 : new String[]{"UTF-8", "ISO-8859-1", "windows-1252", "US-ASCII", Charset.defaultCharset().toString()}) {
                try {
                    String string3 = "01-" + Q.o00000(string + "x", Charset.forName(string2));
                    if (this.returnnullclass.contains(string3)) continue;
                    this.returnnullclass.add(string3);
                }
                catch (UnsupportedCharsetException unsupportedCharsetException) {
                    helden.framework.held.object.oooo_0.\u00d300000("Charset " + string2 + " nicht gefunden!");
                }
            }
            this.\u00d8\u00d2\u00f6000 = false;
        }
    }

    private void \u00f5\u00f80000() {
        this.\u00d8\u00d5\u00f6000 = new WaehlbareZauber();
        this.thisintclass = new ArrayList();
        this.privateintclass = new ArrayList();
        this.\u00d8\u00d4\u00f6000 = new ArrayList();
        this.\u00f4\u00d3\u00f6000 = new ArrayList();
        this.\u00d8\u00d3\u00f6000 = new ArrayList();
        this.whilenullclass = "Name fehlt";
        this.forvoidclass = "Name fehlt";
        this.Stringintclass = new TreeMap();
        this.\u00d5\u00d4\u00f6000 = new TreeMap();
        this.newnullclass = new TreeMap();
        this.\u00f4\u00d5\u00f6000 = 99;
        this.\u00d4\u00d3\u00f6000 = new Oo0O();
        this.\u00f8\u00d2\u00f6000 = new OOOo();
        this.O\u00d4\u00f6000 = new ArrayList<for>();
        this.\u00f4\u00d4\u00f6000 = true;
        this.O\u00d5\u00f6000 = false;
        this.forintclass = true;
        this.O\u00d3\u00f6000 = 14;
        this.\u00d3\u00d5\u00f6000 = new ArrayList<String>();
        this.\u00d5\u00d3\u00f6000 = new ArrayList();
        this.o\u00d4\u00f6000 = "";
        this.\u00d3\u00d4\u00f6000 = new ArrayList();
        this.\u00f5\u00d4\u00f6000 = "";
        this.\u00d4\u00d5\u00f6000 = "";
        this.\u00f4\u00d2\u00f6000 = new ArrayList();
        this.\u00f5\u00d2\u00f6000 = new ArrayList();
        this.\u00d5\u00d5\u00f6000 = new ArrayList();
        this.\u00f8\u00d4\u00f6000 = new ArrayList();
        this.\u00d3\u00d3\u00f6000 = new Wuerfelwurf(0, 0, 0);
        this.nullintclass = 0;
        this.\u00d4\u00d4\u00f6000 = 0;
        this.privatevoidclass = new Wuerfelwurf(0, 0, 0);
        this.\u00d5\u00d2\u00f6000 = new Wuerfelwurf(0, 0, 0);
    }
}

