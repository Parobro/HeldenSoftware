/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held;

import helden.Version;
import helden.framework.A.A;
import helden.framework.C.I;
import helden.framework.C.M;
import helden.framework.C.Oo0O;
import helden.framework.C.public;
import helden.framework.D.H;
import helden.framework.D.OOOo;
import helden.framework.D.OoOO.privatesuper;
import helden.framework.D.P;
import helden.framework.D.Q;
import helden.framework.D.for;
import helden.framework.E.F;
import helden.framework.EigeneErweiterungenMoeglich;
import helden.framework.Geschlecht;
import helden.framework.HeldenMath;
import helden.framework.OOoO.R;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.geld.GeldBoerse;
import helden.framework.geld.GeldBoerseImpl;
import helden.framework.gmod.GMod;
import helden.framework.gmod.GModBezeichner;
import helden.framework.held.A.E;
import helden.framework.held.D;
import helden.framework.held.J;
import helden.framework.held.L;
import helden.framework.held.O;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.held.S;
import helden.framework.held.Stringsuper;
import helden.framework.held.T;
import helden.framework.held.U;
import helden.framework.held.classsuper;
import helden.framework.held.int;
import helden.framework.held.oO0O;
import helden.framework.held.oooo_0;
import helden.framework.held.oooo_1;
import helden.framework.held.persistenz.SigTool;
import helden.framework.held.return;
import helden.framework.held.while;
import helden.framework.int.OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.int.OooO;
import helden.framework.int.String;
import helden.framework.int.do;
import helden.framework.int.o0oo_0;
import helden.framework.int.o0oo_1;
import helden.framework.int.super;
import helden.framework.int.void;
import helden.framework.oooo.b_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooo_4;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.oooo.r_0;
import helden.framework.oooo.s_0;
import helden.framework.settings.Setting;
import helden.framework.settings.Settings;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import helden.model.DDZprofessionen.AlhanischeZauberPriesterin;
import helden.model.DDZprofessionen.Druide;
import helden.model.DDZprofessionen.Geode;
import helden.model.DDZprofessionen.Kophta;
import helden.model.DDZprofessionen.Mudramul;
import helden.model.DDZprofessionen.TochterSatu;
import helden.model.DDZprofessionen.zauberpriesterin.Zauberpriesterin;
import helden.model.kultur.AuelfenSippe;
import helden.model.kultur.ElfischeSiedlung;
import helden.model.kultur.FirnelfenSippe;
import helden.model.kultur.SteppenelfenSippe;
import helden.model.kultur.WaldelfenSippe;
import helden.model.myranor.profession.Aygon;
import helden.model.myranor.profession.BaLoa;
import helden.model.myranor.profession.Bashide;
import helden.model.myranor.profession.Biagha;
import helden.model.myranor.profession.Falschgesicht;
import helden.model.myranor.profession.Geisterwerker;
import helden.model.myranor.profession.IcemnaOptimat;
import helden.model.myranor.profession.LeonirAnimist;
import helden.model.myranor.profession.Medizinmann;
import helden.model.myranor.profession.MinotaurenAnimist;
import helden.model.myranor.profession.Monddeuter;
import helden.model.myranor.profession.Saithakenner;
import helden.model.myranor.profession.Saithyar;
import helden.model.myranor.profession.Satudur;
import helden.model.myranor.profession.Shanwada;
import helden.model.myranor.profession.Sherkumar;
import helden.model.myranor.profession.Shurhokach;
import helden.model.myranor.profession.SibylleMantiker;
import helden.model.myranor.profession.Sternensaenger;
import helden.model.myranor.profession.Thulnail;
import helden.model.myranor.profession.Weihertaenzer;
import helden.model.myranor.profession.Wellenkind;
import helden.model.myranor.profession.Windfluesterer;
import helden.model.myranor.profession.Yachzuq;
import helden.model.myranor.profession.Zharzhuri;
import helden.model.profession.Bewahrer;
import helden.model.profession.Derwisch;
import helden.model.profession.Former;
import helden.model.profession.Hexe;
import helden.model.profession.Kaempfer;
import helden.model.profession.Kristallomant;
import helden.model.profession.Legendensaenger;
import helden.model.profession.Schamane;
import helden.model.profession.Schelm;
import helden.model.profession.Tierkrieger;
import helden.model.profession.Wildnislaeufer;
import helden.model.profession.Zaubertaenzer;
import helden.model.profession.Zauberweber;
import helden.model.profession.varianten.FerkinaBesessener;
import helden.model.rasse.Auelf;
import helden.model.rasse.Firnelf;
import helden.model.rasse.Halbelf;
import helden.model.rasse.Waldelf;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.w3c.dom.Document;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class K
implements OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO,
r_0 {
    private Geschlecht Oo0000 = null;
    private o0oo_0 do;
    private OooO \u00d6o0000;
    private J super;
    private o0oo_1 \u00d400000;
    private T \u00f400000;
    private L floatsuper;
    private void \u00f4O0000;
    private return OO0000;
    private helden.framework.held.a.oooo_0 \u00d3O0000;
    private Map<voidsuper, U> Objectsuper;
    private String \u00f6o0000;
    private oO0O[] \u00d4O0000;
    private int \u00f800000;
    private int \u00d6O0000;
    private PropertyChangeSupport \u00d800000;
    private boolean \u00d2o0000;
    private String \u00f8O0000;
    private do \u00f4o0000;
    private O \u00f600000;
    private S \u00d600000;
    private long publicsuper;
    private HashMap<String, Document> interface;
    private GeldBoerseImpl int;
    private String \u00d3o0000 = null;
    private Map<P, voidsuper> \u00d300000;
    private ArrayList<A> \u00d200000;
    private Map<String, helden.framework.D.D> class;
    private oooo_1 \u00d4o0000;
    private helden.framework.int.String voidsuper;
    private Settings \u00d8O0000;
    private Set<classsuper> \u00f6O0000;
    private HashMap<String, String> \u00d2O0000 = new HashMap();
    private while \u00d8o0000;

    public K() {
        this.\u00d8O0000 = Settings.getSettingByName("DSA4.1");
        this.int = new GeldBoerseImpl();
        this.super = new J(this);
        this.\u00d800000 = new PropertyChangeSupport(this);
        this.\u00d8o0000 = new while(this.\u00d800000);
        this.\u00d400000 = new o0oo_1();
        this.\u00f400000 = new T();
        this.\u00d4O0000 = new oO0O[3];
        for (int i2 = 0; i2 < 3; ++i2) {
            this.\u00d4O0000[i2] = new oO0O();
            this.\u00d4O0000[i2].o00000(this.\u00d8o0000.\u00d500000());
        }
        this.\u00d4O0000[0].\u00d300000(true);
        this.floatsuper = new L(this);
        this.Objectsuper = new HashMap<voidsuper, U>();
        this.interface = new HashMap();
        this.\u00d300000 = new HashMap<P, voidsuper>();
        this.class = new HashMap<String, helden.framework.D.D>();
        this.\u00f4O0000 = new void(this.\u00d8O0000);
        this.\u00d3O0000 = new helden.framework.held.a.oooo_0();
        this.OO0000 = new return();
        this.\u00f8O0000 = "";
        this.\u00d2o0000 = false;
        this.\u00f4o0000 = new do();
        this.\u00f600000 = new O(this.\u00d8o0000.\u00d500000());
        this.\u00d600000 = new S();
        this.\u00d200000 = new ArrayList();
        this.\u00d4o0000 = new oooo_1(this);
        this.voidsuper = new helden.framework.int.String();
        this.\u00f6O0000 = new HashSet<classsuper>();
    }

    @Override
    public void o00000(A a2) {
        this.\u00d8o0000.\u00d300000();
        this.\u00d200000.add(a2);
        int n = this.\u00d200000.size();
        this.\u00d800000.firePropertyChange("EreignisAnzahl", n - 1, n);
    }

    @Override
    public void o00000(oo0o_0 oo0o_02, int n) {
        this.\u00d8o0000.\u00d300000();
        if (oo0o_02 instanceof KonkreterZauber) {
            this.\u00d5o0000().\u00d300000((KonkreterZauber)oo0o_02, n);
        } else {
            this.\u00f8O0000().\u00d300000((voidsuper)oo0o_02, n);
        }
    }

    @Override
    public void o00000(PropertyChangeListener propertyChangeListener) {
        this.\u00d800000.addPropertyChangeListener(propertyChangeListener);
    }

    public void \u00d500000(P p2) {
        this.o00000(p2, true);
    }

    public void o00000(P p2, boolean bl) {
        this.\u00d8o0000.\u00d300000();
        this.\u00f4O0000.o00000(p2, bl);
        for (Object object : p2.\u00d5\u00d20000()) {
            if (object instanceof I) {
                this.o00000(helden.framework.C.K.o00000((I)object), true);
                continue;
            }
            helden.framework.held.object.oooo_0.\u00f500000("Unbekannter Typ bei addSonderfertigkeit: " + object + "/" + object.toString());
        }
        if (p2.equals(helden.framework.D.while.o\u00d3o000.toString())) {
            this.\u00d400000("Matrixgeber");
        }
        if (p2.equals(helden.framework.D.while.\u00d2\u00d6\u00f5000.toString())) {
            this.\u00d400000("Semipermanenz");
        }
    }

    public void o00000(public public_, boolean bl) {
        this.\u00d8o0000.\u00d300000();
        this.\u00d400000.o00000(public_, bl);
    }

    public boolean new(P p2) {
        if (p2 instanceof helden.framework.D.void) {
            helden.framework.D.void void_ = (helden.framework.D.void)p2;
            for (for for_ : this.thisObject()) {
                if (!for_.getBezeichner().equals(void_.\u00f500000())) continue;
                return true;
            }
        }
        return false;
    }

    @Override
    public int o\u00d30000() {
        return this.\u00f800000;
    }

    public Set<classsuper> \u00f5\u00d40000() {
        return this.\u00f6O0000;
    }

    public String o\u00d40000() {
        return classsuper.o00000(this.\u00f5\u00d40000());
    }

    @Override
    public while ifnew() {
        return this.\u00d8o0000;
    }

    public ArrayList<voidsuper> \u00f8\u00d30000() {
        ArrayList<voidsuper> arrayList = this.\u00f8O0000().super(this.oO0000());
        ArrayList<voidsuper> arrayList2 = new ArrayList<voidsuper>();
        for (voidsuper voidsuper2 : arrayList) {
            if (!this.\u00d300000(voidsuper2)) continue;
            arrayList2.add(voidsuper2);
        }
        arrayList.removeAll(arrayList2);
        return arrayList;
    }

    @Override
    public helden.framework.held.a.oooo_0 thissuper() {
        return this.\u00d3O0000;
    }

    public String \u00d3\u00d50000() {
        Object object;
        if (!this.oo0000()) {
            return "";
        }
        int n = 0;
        int n2 = 0;
        if (this.o00000(I.\u00f5\u00f40000)) {
            object = (helden.framework.C.J)this.\u00d500000().\u00d300000(I.\u00f5\u00f40000);
            n += ((helden.framework.C.J)object).ObjectString();
        }
        if (this.o00000(I.\u00f8\u00d6o000)) {
            --n;
        }
        if (this.o00000(I.whilewhile)) {
            --n;
        }
        if (this.new(helden.framework.D.while.\u00f6\u00d5\u00d6000.toString())) {
            n2 += 2;
        } else if (this.new(helden.framework.D.while.\u00f8\u00d5\u00d6000.toString())) {
            ++n2;
        }
        if (this.new(helden.framework.D.while.\u00d3\u00d6\u00d2000.toString())) {
            int n3 = this.o00000(this.while());
            return String.valueOf(HeldenMath.drittel(n3) + 3 + n);
        }
        object = "1W6";
        int n4 = n + n2;
        if (n4 > 0) {
            object = (String)object + "+" + n4;
        } else if (n4 < 0) {
            object = (String)object + "-" + -n4;
        }
        return object;
    }

    @Override
    public int o00000(helden.framework.OoOO.E e) {
        int n = this.Objectsuper.get(e).\u00d300000();
        if (e.classclass()) {
            return n + this.\u00d3\u00d30000().\u00f600000();
        }
        return n + this.\u00d3\u00d30000().int();
    }

    @Override
    public oO0O OO0000() {
        for (oO0O oO0O2 : this.\u00d4O0000) {
            if (!oO0O2.o00000()) continue;
            return oO0O2;
        }
        return this.\u00d4O0000[0];
    }

    @Override
    public oO0O o00000(int n) {
        return this.\u00d4O0000[n];
    }

    @Override
    public String forsuper() {
        return this.\u00f8O0000;
    }

    @Override
    public Map<P, voidsuper> \u00d5\u00d20000() {
        return this.\u00d300000;
    }

    @Override
    public J \u00d3\u00d30000() {
        return this.super;
    }

    @Override
    public ArrayList<I> \u00f4\u00d20000() {
        ArrayList<I> arrayList = new ArrayList<I>();
        Iterator<OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> iterator = this.newnew();
        while (iterator.hasNext()) {
            OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = iterator.next();
            ArrayList<I> arrayList2 = ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.getEmpfohleneVorteile();
            if (arrayList2 == null) continue;
            arrayList.addAll(ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.getEmpfohleneVorteile());
        }
        return arrayList;
    }

    @Override
    public ArrayList<A> \u00d8O0000() {
        return this.\u00d200000;
    }

    @Override
    public ArrayList<voidsuper> Oo0000() {
        return this.\u00f8O0000().super(this.oO0000());
    }

    @Override
    public E \u00f4O0000() {
        return this.thissuper().super();
    }

    @Override
    public GeldBoerse \u00f400000() {
        return this.int;
    }

    @Override
    public List<GMod> o00000(GModBezeichner gModBezeichner) {
        ArrayList<GMod> arrayList = new ArrayList<GMod>();
        for (F[] fArray : this.\u00d8o0000().new()) {
            for (int i2 = 0; i2 < this.\u00d8o0000().\u00d300000(); ++i2) {
                if (fArray[i2] == null) continue;
                F f2 = fArray[i2];
                for (helden.framework.E.G g2 : f2.\u00d400000(helden.framework.E.A.if)) {
                    helden.framework.E.C.M m = (helden.framework.E.C.M)g2;
                    for (GMod gMod : m.fornew()) {
                        if (gModBezeichner != null && !gMod.getName().equals((Object)gModBezeichner)) continue;
                        arrayList.add(gMod);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override
    public int o00000(b_0 b_02) {
        return this.\u00d3\u00d30000().do(b_02);
    }

    @Override
    public Geschlecht \u00d300000() {
        return this.Oo0000;
    }

    @Override
    public String returnnew() {
        return this.\u00d3o0000;
    }

    @Override
    public do privatesuper() {
        return this.\u00f4o0000;
    }

    @Override
    public super \u00d4O0000() {
        ArrayList<super> arrayList = this.\u00d800000().Object(String._o.\u00d300000);
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList.get(0);
    }

    @Override
    public String \u00f4o0000() {
        return "" + this.publicsuper;
    }

    @Override
    public O \u00d8o0000() {
        if (this.\u00f600000 == null) {
            this.\u00f600000 = new O(this.\u00d8o0000.\u00d500000());
        }
        return this.\u00f600000;
    }

    public ArrayList<voidsuper> \u00f5\u00d30000() {
        ArrayList<voidsuper> arrayList = new ArrayList<voidsuper>();
        Iterator<voidsuper> iterator = this.\u00f8O0000().super();
        while (iterator.hasNext()) {
            voidsuper voidsuper2 = iterator.next();
            if (!voidsuper2.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f400000)) continue;
            arrayList.add(voidsuper2);
        }
        return arrayList;
    }

    public U new(voidsuper voidsuper2) {
        return this.Objectsuper.get(voidsuper2);
    }

    @Override
    public return Stringsuper() {
        return this.OO0000;
    }

    @Override
    public OooO \u00f800000() {
        return this.\u00d6o0000;
    }

    public ArrayList<voidsuper> O\u00d40000() {
        ArrayList<voidsuper> arrayList = new ArrayList<voidsuper>();
        arrayList.addAll(this.\u00d800000().getZweitLehrsprache());
        arrayList.addAll(this.\u00f800000().getZweitLehrsprache());
        return arrayList;
    }

    @Override
    public b_0 while() {
        b_0 b_02 = b_0.newwhilesuper;
        if (this.oO0000().getHauptSetting().equals((Object)Setting.\u00f8O0000)) {
            b_02 = b_0.\u00f8\u00f4\u00d2000;
        }
        if (this.\u00d800000().hatProfession(Kophta.class) != null) {
            b_02 = b_0.\u00d5\u00f4\u00d2000;
        }
        if (this.\u00d800000().hatProfession(Hexe.class) != null || this.\u00d800000().hatProfession(Schelm.class) != null || this.\u00d800000().hatProfession(Kristallomant.class) != null || this.\u00d800000().hatProfession(Derwisch.class) != null || this.\u00d800000().hatProfession(Bewahrer.class) != null || this.\u00d800000().hatProfession(Former.class) != null || this.\u00d800000().hatProfession(Legendensaenger.class) != null || this.\u00d800000().hatProfession(Kaempfer.class) != null || this.\u00d800000().hatProfession(Wildnislaeufer.class) != null || this.\u00d800000().hatProfession(Zauberweber.class) != null || this.\u00d800000().hatProfession(Schamane.class) != null || this.\u00d800000().hatProfession(Zaubertaenzer.class) != null || this.\u00d800000().hatProfession(FerkinaBesessener.class) != null || this.\u00d800000().hatProfession(Tierkrieger.class) != null || this.\u00d800000().hatProfession(TochterSatu.class) != null || this.\u00d800000().hatProfession(Mudramul.class) != null || this.\u00d800000().hatProfession(Zauberpriesterin.class) != null || this.\u00d800000().hatProfession(AlhanischeZauberPriesterin.class) != null || this.privateObject() || this.\u00d800000().hatProfession(IcemnaOptimat.class) != null || this.\u00d800000().hatProfession(Satudur.class) != null || this.\u00d3\u00d40000() || this.\u00d8\u00d30000() || this.new(helden.framework.D.while.\u00d3\u00f4\u00d2000.toString())) {
            b_02 = b_0.\u00f8\u00f4\u00d2000;
        }
        if (this.newString()) {
            b_02 = b_0.\u00f8\u00f4\u00d2000;
        }
        if (this.\u00d8\u00d40000()) {
            b_02 = b_0.\u00f8\u00f4\u00d2000;
        }
        return b_02;
    }

    public String O\u00d50000() {
        Object object;
        int n = 0;
        if (this.o00000(I.\u00d3\u00d40000)) {
            object = (helden.framework.C.J)this.\u00d500000().\u00d300000(I.\u00d3\u00d40000);
            n += ((helden.framework.C.J)object).ObjectString();
        }
        if (this.o00000(I.\u00d4\u00f5o000)) {
            --n;
        }
        object = "1W6";
        int n2 = n;
        if (n2 > 0) {
            object = (String)object + "+" + n2;
        } else if (n2 < 0) {
            object = (String)object + "-" + -n2;
        }
        return object;
    }

    @Override
    public helden.framework.OoOO.D \u00d400000(oo0o_0 oo0o_02) {
        if (oo0o_02 instanceof KonkreterZauber) {
            return this.\u00d5o0000().super(oo0o_02);
        }
        return this.\u00f8O0000().super(oo0o_02);
    }

    @Override
    public s_0 new(oo0o_0 oo0o_02) {
        return this.new(oo0o_02, false);
    }

    public int \u00d4\u00d40000() {
        T t = this.\u00f8O0000();
        if (this.new(helden.framework.D.while.\u00d3\u00d6O000.toString())) {
            return t.\u00d800000(helden.framework.OoOO.voidsuper.o\u00f8\u00d6000);
        }
        voidsuper voidsuper2 = t.\u00d2o0000();
        try {
            return t.\u00f400000(voidsuper2);
        }
        catch (D d2) {
            throw new RuntimeException(d2);
        }
    }

    public int \u00d800000(oo0o_0 oo0o_02) {
        oooo_4 oooo_42;
        Object object;
        int n = Integer.MAX_VALUE;
        int n2 = this.return(oo0o_02) + 3;
        if (oo0o_02.istZauber() && !this.o00000(I.\u00d8O0000) && this.\u00d5o0000().super(((KonkreterZauber)oo0o_02).getRep(), this.\u00f5O0000())) {
            n2 = this.\u00d500000(oo0o_02);
            if (this.\u00d400000(oo0o_02).equals(helden.framework.OoOO.D.\u00d500000)) {
                n = 10;
            }
        }
        if (oo0o_02.toStringKomplett().startsWith("Ritualk")) {
            n2 = this.o00000(this.while()) + 3;
        }
        if (oo0o_02.toStringKomplett().startsWith("Liturgiek")) {
            n2 = this.o00000(b_0.\u00f8\u00f4\u00d2000) + 3;
        }
        if (this.o00000(I.fordo) && ((M)(object = (M)this.\u00d500000().\u00d300000(I.fordo))).\u00f400000(oo0o_02)) {
            n = this.\u00d500000(oo0o_02);
        }
        if (oo0o_02 instanceof oooo_4 && this.o00000(I.newString) && ((M)(object = (M)this.\u00d500000().\u00d300000(I.\u00d3\u00d2O000))).\u00f400000((oooo_42 = (oooo_4)oo0o_02).o\u00d5O000())) {
            n = this.\u00d500000(oo0o_02);
        }
        if (this.o00000(I.\u00f4\u00d20000) && ((M)(object = (M)this.\u00d500000().\u00d300000(I.\u00f4\u00d20000))).\u00f400000(oo0o_02)) {
            n2 = this.return(oo0o_02) + 5;
        }
        if (oo0o_02 instanceof oooo_4 && this.o00000(I.\u00d3\u00d2O000) && ((M)(object = (M)this.\u00d500000().\u00d300000(I.\u00d3\u00d2O000))).\u00f400000((oooo_42 = (oooo_4)oo0o_02).o\u00d5O000())) {
            n2 = this.return(oo0o_02) + 5;
        }
        if (this.o00000(I.O\u00d6o000)) {
            object = (M)this.\u00d500000().\u00d300000(I.O\u00d6o000);
            if (oo0o_02 instanceof KonkreterZauber && ((M)object).\u00f400000(((KonkreterZauber)oo0o_02).getZauber())) {
                n2 = this.return(oo0o_02) + 5;
            }
        }
        if (oo0o_02 instanceof G) {
            object = (G)oo0o_02;
            n2 = Math.min(((G)object).\u00f5\u00f40000(), n2);
        }
        return Math.min(n, n2);
    }

    public List<OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> StringObject() {
        ArrayList<OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> arrayList = new ArrayList<OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO>();
        if (this.o\u00d20000() != null) {
            arrayList.add(this.o\u00d20000());
        }
        if (this.\u00f800000() != null) {
            arrayList.add(this.\u00f800000());
        }
        if (this.\u00d800000().Object(String._o.\u00d300000).size() > 0) {
            arrayList.add(this.\u00d800000());
        }
        if (this.\u00d400000 != null) {
            arrayList.add(this.\u00d400000);
        }
        if (this.\u00f4O0000 != null) {
            arrayList.add(this.\u00f4O0000);
        }
        return arrayList;
    }

    @Override
    public Iterator<OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> newnew() {
        return this.StringObject().iterator();
    }

    @Override
    public G O\u00d20000() {
        if (this.\u00d4O0000() instanceof Schelm) {
            return G.privatesuperclass;
        }
        return this.\u00f800000().getMuttersprache();
    }

    @Override
    public String \u00f5o0000() {
        return this.\u00f6o0000;
    }

    @Override
    public int new(helden.framework.OoOO.E e) {
        if (e.o\u00d80000()) {
            return this.Objectsuper.get(e).String() + this.\u00d3\u00d30000().\u00d600000();
        }
        return 0;
    }

    @Override
    public Iterator<Document> \u00f8o0000() {
        return this.interface.values().iterator();
    }

    public HashMap<String, String> \u00d4\u00d50000() {
        return this.\u00d2O0000;
    }

    @Override
    public ArrayList<super> nullsuper() {
        return this.\u00d800000().\u00d6oO000();
    }

    @Override
    public helden.framework.int.String \u00d800000() {
        return this.voidsuper;
    }

    @Override
    public o0oo_0 o\u00d20000() {
        return this.do;
    }

    public int forObject() {
        T t = this.\u00f8O0000();
        voidsuper voidsuper2 = t.Oo0000();
        try {
            return t.\u00f400000(voidsuper2);
        }
        catch (D d2) {
            throw new RuntimeException(d2);
        }
    }

    @Override
    public G \u00f5\u00d20000() {
        return this.\u00f800000().getSchrift();
    }

    @Override
    public Settings oO0000() {
        return this.\u00d8O0000;
    }

    @Override
    public helden.framework.D.D o00000(P p2) {
        String string = helden.framework.D.D.o00000(p2);
        if (this.class.get(string) == null) {
            helden.framework.D.D d2 = new helden.framework.D.D();
            this.class.put(string, d2);
            if (p2 instanceof Q && ((Q)p2).\u00d4\u00d30000() instanceof privatesuper) {
                Q q = (Q)p2;
                helden.framework.OOoO.O o = (helden.framework.OOoO.O)((R)q.\u00d8\u00d30000()).o00000(0);
                if (o.doclass() != null) {
                    d2.o00000(String.valueOf(o.doclass()));
                }
                if (o.\u00d6\u00d80000() != null) {
                    d2.Object(o.\u00d6\u00d80000().toString());
                }
            }
        }
        return this.class.get(string);
    }

    @Override
    public OOOo \u00f5O0000() {
        return this.\u00f4O0000.classfloat();
    }

    @Override
    public void O\u00d30000() {
        return this.\u00f4O0000;
    }

    @Override
    public ArrayList<String> o00000(oo0o_0 oo0o_02) {
        return this.\u00f5O0000().o00000(oo0o_02);
    }

    @Override
    public helden.framework.OOoO.K return() {
        if (!this.\u00d3O0000()) {
            throw new IllegalArgumentException("Held ist kein Spruchzauberer");
        }
        return this.\u00d5o0000().\u00f4O0000();
    }

    @Override
    public s_0 new(oo0o_0 oo0o_02, boolean bl) {
        s_0 s_02 = null;
        try {
            s_02 = oo0o_02.istZauber() ? this.\u00d5o0000().super(oo0o_02, this, bl) : this.\u00f8O0000().super(oo0o_02, this, bl);
        }
        catch (Stringsuper stringsuper) {
            throw new RuntimeException(stringsuper);
        }
        return s_02;
    }

    @Override
    public float o00000(oo0o_0 oo0o_02, boolean bl) {
        float f2 = 0.0f;
        try {
            f2 = oo0o_02.istZauber() ? this.\u00d5o0000().\u00d200000(oo0o_02, this, bl) : this.\u00f8O0000().\u00d200000(oo0o_02, this, bl);
        }
        catch (Stringsuper stringsuper) {
            stringsuper.printStackTrace();
        }
        int n = Math.round(f2);
        if (n == 0 && f2 > 0.0f) {
            n = 1;
        }
        return n;
    }

    @Override
    @Deprecated
    public int \u00d5O0000() {
        return -99;
    }

    public int \u00d4\u00d30000() {
        int n = this.o\u00d30000() - this.\u00d400000();
        return HeldenMath.getStufe40(n);
    }

    public int \u00d5\u00d30000() {
        int n = this.o\u00d30000() - this.\u00d400000();
        return HeldenMath.getStufe41(n);
    }

    @Override
    public T \u00f8O0000() {
        return this.\u00f400000;
    }

    @Override
    public int \u00d300000(oo0o_0 oo0o_02) throws D {
        if (oo0o_02 instanceof KonkreterZauber) {
            return this.\u00d5o0000().\u00d400000((KonkreterZauber)oo0o_02);
        }
        if (oo0o_02 instanceof Zauber) {
            return this.\u00d5o0000().\u00d200000((Zauber)oo0o_02);
        }
        return this.\u00f8O0000().\u00f400000((voidsuper)oo0o_02);
    }

    @Override
    public oooo_1 if() {
        return this.\u00d4o0000;
    }

    @Override
    public ArrayList<I> \u00d3\u00d20000() {
        ArrayList<I> arrayList = new ArrayList<I>();
        Iterator<OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> iterator = this.newnew();
        while (iterator.hasNext()) {
            OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = iterator.next();
            ArrayList<I> arrayList2 = ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.getUngeeigneteVorteile();
            if (arrayList2 == null) continue;
            arrayList.addAll(ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.getUngeeigneteVorteile());
        }
        return arrayList;
    }

    public ArrayList<for> thisObject() {
        ArrayList<for> arrayList = new ArrayList<for>();
        for (OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 : this.StringObject()) {
            arrayList.addAll(ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.getVerbilligteSonderfertigkeiten());
        }
        return arrayList;
    }

    @Override
    public S \u00d4o0000() {
        return this.\u00d600000;
    }

    @Override
    public int \u00d400000() {
        return this.\u00d6O0000;
    }

    @Override
    public int o00000(voidsuper voidsuper2) {
        U u2 = this.Objectsuper.get(voidsuper2);
        return u2.o00000();
    }

    @Override
    public Oo0O \u00d500000() {
        return this.\u00d400000.O\u00d3O000();
    }

    @Override
    public o0oo_1 \u00d4\u00d20000() {
        return this.\u00d400000;
    }

    @Override
    public L \u00d5o0000() {
        return this.floatsuper;
    }

    @Override
    public boolean new() {
        return this.o00000(I.O\u00f60000);
    }

    public boolean privateObject() {
        return this.\u00f800000() instanceof AuelfenSippe || this.\u00f800000() instanceof ElfischeSiedlung || this.\u00f800000() instanceof FirnelfenSippe || this.\u00f800000() instanceof SteppenelfenSippe || this.\u00f800000() instanceof WaldelfenSippe;
    }

    public boolean \u00f4\u00d40000() {
        super super_ = this.\u00d4O0000();
        return super_ instanceof Former || super_ instanceof Bewahrer || super_ instanceof Kaempfer || super_ instanceof Legendensaenger || super_ instanceof Wildnislaeufer || super_ instanceof Zauberweber;
    }

    public boolean nullObject() {
        for (OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 : this.StringObject()) {
            EigeneErweiterungenMoeglich eigeneErweiterungenMoeglich;
            if (!(ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 instanceof EigeneErweiterungenMoeglich) || (eigeneErweiterungenMoeglich = (EigeneErweiterungenMoeglich)((Object)ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2)).istIntern()) continue;
            return true;
        }
        return false;
    }

    public boolean o00000(List<I> list) {
        for (I i2 : list) {
            if (!this.o00000(i2)) continue;
            return true;
        }
        return false;
    }

    public boolean \u00d5\u00d40000() {
        T t = this.\u00f8O0000();
        voidsuper voidsuper2 = t.Oo0000();
        try {
            t.\u00f400000(voidsuper2);
            return true;
        }
        catch (Exception exception) {
            return false;
        }
    }

    public boolean o00000(Setting setting) {
        return this.oO0000().hatSetting(setting);
    }

    public boolean o00000(H h2) {
        return this.\u00f4O0000.\u00d6O0000(h2.toString());
    }

    @Override
    public boolean new(String string) {
        return this.\u00f4O0000.\u00d6O0000(string);
    }

    public boolean \u00f4\u00d30000() {
        Iterator<voidsuper> iterator = this.\u00f8O0000().super();
        while (iterator.hasNext()) {
            helden.framework.OoOO.E e;
            voidsuper voidsuper2 = iterator.next();
            if (!voidsuper2.isKampftalent() || this.o00000((voidsuper)(e = (helden.framework.OoOO.E)voidsuper2)) <= 0 || !e.o\u00d80000()) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean o00000(I i2) {
        return this.\u00d400000.\u00d600000(i2);
    }

    @Override
    public boolean o00000(public public_) {
        return this.\u00d400000.\u00d200000(public_);
    }

    public boolean return(String string) {
        return this.\u00d400000.supersuper(string);
    }

    public boolean new(I i2) {
        if (this.\u00d800000().Object(String._o.\u00d500000).size() == 0) {
            return this.o00000(i2);
        }
        return this.o00000(i2) && !this.\u00d800000().\u00d500000(String._o.\u00d500000).getVorteile().\u00d400000(i2);
    }

    @Override
    public boolean \u00f500000() {
        return this.\u00d3O0000() || this.o00000(I.\u00d8O0000) || this.o00000(helden.framework.D.while.\u00d2\u00f4\u00d4000);
    }

    public boolean \u00d3\u00d40000() {
        super super_ = this.\u00d4O0000();
        return super_ instanceof Aygon || super_ instanceof BaLoa || super_ instanceof Bashide || super_ instanceof Biagha || super_ instanceof Falschgesicht || super_ instanceof Geisterwerker || super_ instanceof LeonirAnimist || super_ instanceof Medizinmann || super_ instanceof Saithyar || super_ instanceof Saithakenner || super_ instanceof Shanwada || super_ instanceof Sherkumar || super_ instanceof Shurhokach || super_ instanceof Sternensaenger || super_ instanceof Thulnail || super_ instanceof Weihertaenzer || super_ instanceof Wellenkind || super_ instanceof Windfluesterer || super_ instanceof Yachzuq || super_ instanceof Zharzhuri || super_ instanceof Zaubertaenzer || super_ instanceof MinotaurenAnimist || super_ instanceof Monddeuter || super_ instanceof SibylleMantiker;
    }

    public boolean \u00d8\u00d40000() {
        Druide druide;
        return this.\u00d800000().hatProfession(Druide.class) != null && (druide = (Druide)this.\u00d800000().hatProfession(Druide.class)).getGewaehlteVarianten() != null && druide.getGewaehlteVarianten().contains(druide.getMehrerderMacht());
    }

    @Override
    public boolean whilenew() {
        return this.\u00f6O0000.contains((Object)classsuper.\u00d300000);
    }

    public boolean o\u00d50000() {
        return this.o\u00d20000() instanceof Auelf || this.o\u00d20000() instanceof Firnelf || this.o\u00d20000() instanceof Waldelf || this.o\u00d20000() instanceof Halbelf && this.o\u00d20000().istVariante(Halbelf.ifStringvoid);
    }

    public boolean newString() {
        helden.framework.int.L l2;
        if (this.\u00d800000().hatProfession(helden.model.profession.Geode.class) != null && (l2 = (helden.model.profession.Geode)this.\u00d800000().hatProfession(helden.model.profession.Geode.class)).getGewaehlteVarianten() != null && l2.getGewaehlteVarianten().contains(((helden.model.profession.Geode)l2).getDienerSumus())) {
            return true;
        }
        return this.\u00d800000().hatProfession(Geode.class) != null && (l2 = (Geode)this.\u00d800000().hatProfession(Geode.class)).getGewaehlteVarianten() != null && l2.getGewaehlteVarianten().contains(((Geode)l2).getDienerSumus());
    }

    @Override
    public boolean \u00d8\u00d20000() {
        return this.\u00d3\u00d30000().\u00d3O0000() > 0;
    }

    public boolean \u00f8\u00d40000() {
        return this.o\u00d20000() instanceof Halbelf && !this.o\u00d20000().istVariante(Halbelf.ifStringvoid);
    }

    @Override
    public boolean oo0000() {
        return this.o00000(I.forsupersuper) || this.o00000(I.\u00f5\u00d8o000) || this.o00000(I.\u00d5\u00d3O000);
    }

    public boolean \u00d8\u00d30000() {
        return this.o00000(I.\u00d5\u00d3O000) && this.o00000(Setting.\u00f600000) && !this.\u00d3O0000();
    }

    @Override
    public boolean \u00d3o0000() {
        return this.\u00d2o0000;
    }

    @Override
    public boolean \u00d3O0000() {
        for (P p2 : this.\u00f5O0000()) {
            if (!p2.\u00f4O0000()) continue;
            return true;
        }
        return false;
    }

    public boolean \u00d300000(P p2) {
        if (p2.\u00f8O0000()) {
            helden.framework.D.K k2 = (helden.framework.D.K)p2;
            for (for for_ : this.thisObject()) {
                if (!for_.o00000() || !for_.Object().equals(k2.o\u00d30000())) continue;
                for (Object t : for_.getAuswahlen()) {
                    if (!t.toString().equals(k2.\u00f5\u00d20000())) continue;
                    return true;
                }
            }
        } else {
            for (for for_ : this.thisObject()) {
                if (!for_.getBezeichner().equals(p2.toString())) continue;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean o00000() {
        return this.o00000(I.O\u00f8o000);
    }

    public void \u00d400000(P p2) {
        this.\u00f4O0000.\u00d200000(p2);
        for (Object object : p2.\u00d5\u00d20000()) {
            if (object instanceof I) {
                this.new(helden.framework.C.K.o00000((I)object));
                continue;
            }
            helden.framework.held.object.oooo_0.\u00f500000("Unbekannter Typ bei addSonderfertigkeit: " + object + "/" + object.toString());
        }
        if (p2.toString().equals(helden.framework.D.while.o\u00d3o000.toString())) {
            for (KonkreterZauber konkreterZauber : this.\u00d5o0000().class(Zauber.nullpublicnew)) {
                if (!konkreterZauber.getVariante().equals("Matrixgeber")) continue;
                this.\u00d5o0000().super(konkreterZauber);
            }
        }
        if (p2.toString().equals(helden.framework.D.while.\u00d2\u00d6\u00f5000.toString())) {
            for (KonkreterZauber konkreterZauber : this.\u00d5o0000().class(Zauber.nullpublicnew)) {
                if (!konkreterZauber.getVariante().equals("Semipermanenz")) continue;
                this.\u00d5o0000().super(konkreterZauber);
            }
        }
    }

    public void new(public public_) {
        this.\u00d400000.Object(public_);
    }

    public void \u00d300000(int n) {
        if (this.\u00f800000 == n) {
            return;
        }
        this.\u00d8o0000.\u00d300000();
        int n2 = this.\u00f800000;
        this.\u00f800000 = n;
        int n3 = this.\u00f800000 - n2;
        this.new(this.\u00d6O0000 + n3);
        this.\u00d800000.firePropertyChange("AP", n2, n);
    }

    public void o00000(Set<classsuper> set) {
        this.\u00f6O0000 = set;
    }

    public void o00000(helden.framework.OoOO.E e, int n) throws oooo_0, D, int {
        this.\u00d8o0000.\u00d300000();
        U u2 = this.Objectsuper.get(e);
        if (u2 == null) {
            this.Objectsuper.put(e, new U(e, this.\u00f8O0000()));
            u2 = this.Objectsuper.get(e);
        }
        u2.o00000(n - this.\u00d3\u00d30000().int(), false);
    }

    public void new(helden.framework.OoOO.E e, int n, boolean bl) throws oooo_0, D, int {
        this.\u00d8o0000.\u00d300000();
        U u2 = this.Objectsuper.get(e);
        if (u2 == null) {
            this.Objectsuper.put(e, new U(e, this.\u00f8O0000()));
            u2 = this.Objectsuper.get(e);
        }
        u2.o00000(n - this.\u00d3\u00d30000().int(), bl);
    }

    @Override
    public void o00000(String string) {
        this.\u00d8o0000.\u00d300000();
        this.\u00f8O0000 = string;
    }

    @Override
    public void \u00f8\u00d20000() {
        this.\u00f6O0000.add(classsuper.\u00d300000);
    }

    public void o00000(Geschlecht geschlecht) {
        this.\u00d8o0000.\u00d300000();
        this.Oo0000 = geschlecht;
    }

    public void \u00d800000(String string) {
        if (string == null && this.\u00d3o0000 == null) {
            return;
        }
        if (string == null || this.\u00d3o0000 == null || !string.equals(this.\u00d3o0000)) {
            this.\u00d8o0000.\u00d300000();
        }
        this.\u00d3o0000 = string;
    }

    public void o00000(do do_) {
        this.\u00d8o0000.\u00d300000();
        this.\u00f4o0000 = do_;
    }

    @Override
    public void o00000(long l2) {
        this.\u00d8o0000.\u00d300000();
        this.publicsuper = l2;
    }

    public void o00000(voidsuper voidsuper2, U u2) {
        this.\u00d8o0000.\u00d300000();
        this.Objectsuper.put(voidsuper2, u2);
    }

    public void o00000(OooO oooO2) {
        this.\u00d8o0000.\u00d300000();
        this.\u00d6o0000 = oooO2;
    }

    public void o00000(oo0o_0 oo0o_02, helden.framework.OoOO.D d2) {
        this.\u00d8o0000.\u00d300000();
        if (oo0o_02 instanceof KonkreterZauber) {
            this.\u00d5o0000().super(oo0o_02, d2);
        } else {
            this.\u00f8O0000().super(oo0o_02, d2);
        }
    }

    public void \u00d500000(String string) {
        if (string.equals(this.\u00f6o0000)) {
            return;
        }
        this.\u00d8o0000.\u00d300000();
        String string2 = this.\u00f6o0000;
        this.\u00f6o0000 = string;
        this.\u00d800000.firePropertyChange("Name", string2, this.\u00f6o0000);
    }

    @Override
    public void o00000(boolean bl) {
        this.\u00d2o0000 = bl;
    }

    public void new(helden.framework.OoOO.E e, int n) throws int, oooo_0 {
        this.\u00d8o0000.\u00d300000();
        U u2 = this.Objectsuper.get(e);
        if (u2 == null) {
            this.Objectsuper.put(e, new U(e, this.\u00f8O0000()));
            u2 = this.Objectsuper.get(e);
        }
        u2.o00000(n - this.\u00d3\u00d30000().\u00d600000());
    }

    public void o00000(helden.framework.OoOO.E e, int n, boolean bl) throws int, oooo_0 {
        this.\u00d8o0000.\u00d300000();
        U u2 = this.Objectsuper.get(e);
        if (u2 == null) {
            this.Objectsuper.put(e, new U(e, this.\u00f8O0000()));
            u2 = this.Objectsuper.get(e);
        }
        u2.o00000(n - this.\u00d3\u00d30000().\u00d600000());
    }

    @Override
    public void o00000(Document document, String string) {
        this.\u00d8o0000.\u00d300000();
        this.interface.put(string, document);
    }

    public void o00000(o0oo_0 o0oo_02) {
        this.\u00d8o0000.\u00d300000();
        this.do = o0oo_02;
    }

    public void o00000(Settings settings) {
        this.\u00d8O0000 = settings;
    }

    public void new(int n) {
        if (this.\u00d6O0000 == n) {
            return;
        }
        int n2 = this.\u00d6O0000;
        this.\u00d6O0000 = n;
        this.\u00d800000.firePropertyChange("FreieAP", n2, this.\u00d6O0000);
    }

    public void o00000(SigTool.VerfiyStatus verfiyStatus, String string) {
        String string2 = Arrays.asList(this.\u00f6O0000.toArray()).toString();
        switch (verfiyStatus) {
            case \u00d300000: {
                String string3;
                this.\u00f6O0000.remove((Object)classsuper.\u00d800000);
                if (Version.versionStringToNummer(string) < 50204) {
                    string3 = "\u00c4nderungskontrolle f\u00fcr Althelden (" + string + ") aktiviert";
                    this.\u00f6O0000.add(classsuper.super);
                } else if (string.equals("5.2.4.devel")) {
                    string3 = "\u00c4nderungskontrolle f\u00fcr Althelden (" + string + ") aktiviert";
                    this.\u00f6O0000.add(classsuper.super);
                } else {
                    string3 = "Kontrollsignatur fehlt. \u00c4nderungskontrolle wieder aktiviert.";
                    this.\u00f6O0000.add(classsuper.class);
                }
                this.\u00d200000.add(new A("\u00c4nderungskontrolle", string3, string2));
                break;
            }
            case \u00d200000: {
                break;
            }
            case \u00d400000: {
                this.\u00f6O0000.remove((Object)classsuper.\u00d800000);
                this.\u00f6O0000.add(classsuper.\u00d400000);
                this.\u00d200000.add(new A("\u00c4nderungskontrolle", "Held wurde extern ver\u00e4ndert. \u00c4nderungskontrolle wieder aktiviert.", string2));
            }
        }
    }

    public boolean o00000(voidsuper voidsuper2, int n) {
        int n2;
        try {
            n2 = this.\u00d300000((oo0o_0)voidsuper2);
        }
        catch (D d2) {
            n2 = -1;
        }
        return n2 < n;
    }

    public String toString() {
        return this.\u00f5o0000();
    }

    public boolean \u00d300000(voidsuper voidsuper2) {
        if (voidsuper2.equals(helden.framework.OoOO.voidsuper.o\u00d2\u00d8000) && this.o00000(helden.framework.OoOO.voidsuper.\u00d4\u00d2\u00d8000, 4)) {
            return true;
        }
        if (voidsuper2.equals(helden.framework.OoOO.voidsuper.returnwhileObject) && this.o00000(helden.framework.OoOO.voidsuper.o\u00d3\u00d6000, 4)) {
            return true;
        }
        if (voidsuper2.equals(helden.framework.OoOO.voidsuper.\u00d5\u00d5\u00d5000) && this.o00000(helden.framework.OoOO.voidsuper.thisinterfaceObject, 4)) {
            return true;
        }
        if (voidsuper2.equals(helden.framework.OoOO.voidsuper.forpublicObject) && !this.o00000(I.OO\u00d2000) && this.\u00f8O0000().Objectsuper() < 6) {
            return true;
        }
        if (voidsuper2.equals(helden.framework.OoOO.voidsuper.StringclassObject) && this.o00000(helden.framework.OoOO.voidsuper.thisinterfaceObject, 4)) {
            return true;
        }
        if (voidsuper2.equals(helden.framework.OoOO.voidsuper.\u00d5\u00d3\u00d8000) && this.\u00d500000().\u00d400000(I.whilereturn)) {
            return true;
        }
        if (voidsuper2.equals(helden.framework.OoOO.voidsuper.whileStringObject) && (this.\u00f8O0000().Objectsuper() < 4 && !this.o00000(I.OO\u00d2000) || this.o00000(helden.framework.OoOO.voidsuper.\u00d3\u00f4\u00d5000, 5) || this.o00000(helden.framework.OoOO.voidsuper.\u00f5\u00d2\u00d6000, 5))) {
            return true;
        }
        if (voidsuper2.equals(G.\u00f50\u00f5000) && this.o00000(helden.framework.OoOO.voidsuper.\u00d5\u00d4\u00d6000, 7)) {
            return true;
        }
        if (voidsuper2.equals(helden.framework.OoOO.voidsuper.\u00d3\u00d8\u00d6000) && (this.\u00f8O0000().Objectsuper() < 6 && !this.o00000(I.OO\u00d2000) || this.o00000(helden.framework.OoOO.voidsuper.\u00f5\u00d2\u00d6000, 6) || this.o00000(helden.framework.OoOO.voidsuper.\u00d5\u00f5\u00d5000, 4) || this.o00000(helden.framework.OoOO.voidsuper.\u00d3\u00f4\u00d5000, 4))) {
            return true;
        }
        if (voidsuper2.equals(helden.framework.OoOO.voidsuper.\u00d3o\u00d8000) && (this.\u00f8O0000().Objectsuper() < 4 && !this.o00000(I.OO\u00d2000) || this.o00000(helden.framework.OoOO.voidsuper.\u00f5\u00d2\u00d6000, 4) || this.o00000(helden.framework.OoOO.voidsuper.\u00d3\u00f4\u00d5000, 4) || this.o00000(helden.framework.OoOO.voidsuper.\u00d3\u00d8\u00d5000, 4) && this.o00000(helden.framework.OoOO.voidsuper.oo\u00d8000, 4))) {
            return true;
        }
        if (voidsuper2.equals(helden.framework.OoOO.voidsuper.\u00f5o\u00d6000) && (this.\u00f8O0000().Objectsuper() < 4 && !this.o00000(I.OO\u00d2000) || this.o00000(helden.framework.OoOO.voidsuper.\u00f5\u00d2\u00d6000, 4))) {
            return true;
        }
        if (voidsuper2.equals(helden.framework.OoOO.voidsuper.forvoidObject) && this.o00000(helden.framework.OoOO.voidsuper.\u00d3\u00d8\u00d5000, 4)) {
            return true;
        }
        if (voidsuper2.equals(helden.framework.OoOO.voidsuper.\u00d4\u00d3\u00d6000) && (this.\u00f8O0000().Objectsuper() < 6 && !this.o00000(I.OO\u00d2000) || this.o00000(helden.framework.OoOO.voidsuper.\u00f4\u00f6\u00d5000, 4) || this.o00000(helden.framework.OoOO.voidsuper.\u00d3\u00f4\u00d5000, 4))) {
            return true;
        }
        if (voidsuper2.equals(helden.framework.OoOO.voidsuper.O\u00d3\u00d6000) && this.o00000(helden.framework.OoOO.voidsuper.thisinterfaceObject, 4)) {
            return true;
        }
        if (voidsuper2.equals(helden.framework.OoOO.voidsuper.o\u00f6\u00d5000) && this.o00000(helden.framework.OoOO.voidsuper.\u00d3\u00f4\u00d5000, 4)) {
            return true;
        }
        if (voidsuper2.equals(helden.framework.OoOO.voidsuper.\u00d5\u00d6\u00d6000) && this.o00000(helden.framework.OoOO.voidsuper.\u00f5\u00d2\u00d6000, 4)) {
            return true;
        }
        if (voidsuper2.equals(helden.framework.OoOO.voidsuper.\u00d8\u00f5\u00d6000) && (this.o00000(helden.framework.OoOO.voidsuper.\u00d3\u00d8\u00d5000, 4) || this.o00000(helden.framework.OoOO.voidsuper.o\u00f6\u00d5000, 4) || this.o00000(helden.framework.OoOO.voidsuper.privateObjectObject, 4))) {
            return true;
        }
        if (voidsuper2.equals(helden.framework.OoOO.voidsuper.\u00f5O\u00d6000) && (this.\u00f8O0000().Objectsuper() < 4 && !this.o00000(I.OO\u00d2000) || this.o00000(helden.framework.OoOO.voidsuper.privateObjectObject, 7))) {
            return true;
        }
        if (voidsuper2.equals(helden.framework.OoOO.voidsuper.ifnullObject) && this.o00000(helden.framework.OoOO.voidsuper.\u00d3\u00f4\u00d5000, 4)) {
            return true;
        }
        if (voidsuper2.equals(helden.framework.OoOO.voidsuper.\u00d8\u00d8\u00d6000) && this.o00000(helden.framework.OoOO.voidsuper.\u00f40\u00d8000, 4)) {
            return true;
        }
        if (voidsuper2.equals(helden.framework.OoOO.voidsuper.\u00f8\u00f8\u00d6000) && this.o00000(helden.framework.OoOO.voidsuper.\u00d50\u00d8000, 4)) {
            return true;
        }
        if (voidsuper2.equals(helden.framework.OoOO.voidsuper.whilewhileObject) && (this.o00000(helden.framework.OoOO.voidsuper.\u00d3\u00d8\u00d5000, 4) || this.o00000(helden.framework.OoOO.voidsuper.\u00d4\u00d4\u00d5000, 4) || this.o00000(helden.framework.OoOO.voidsuper.\u00f5\u00d8\u00d5000, 4))) {
            return true;
        }
        if (voidsuper2.equals(helden.framework.OoOO.voidsuper.whileifObject) && this.o00000(helden.framework.OoOO.voidsuper.\u00d8\u00d8\u00d5000, 4)) {
            return true;
        }
        if (voidsuper2.equals(helden.framework.OoOO.voidsuper.\u00d3\u00f8\u00d6000) && this.o00000(helden.framework.OoOO.voidsuper.\u00d3\u00f4\u00d5000, 4)) {
            return true;
        }
        return voidsuper2.equals(helden.framework.OoOO.voidsuper.\u00d4\u00d5\u00d5000) && this.o00000(helden.framework.OoOO.voidsuper.\u00d8\u00d4\u00d6000, 1);
    }

    public int \u00d300000(String string) {
        int n = 0;
        Iterator<KonkreterZauber> iterator = this.\u00d5o0000().super();
        while (iterator.hasNext()) {
            KonkreterZauber konkreterZauber = iterator.next();
            try {
                if (!konkreterZauber.getRep().toString().equals(string)) continue;
                n += this.\u00d5o0000().\u00d400000(konkreterZauber);
            }
            catch (Exception exception) {}
        }
        return n;
    }

    private void \u00d400000(String string) {
        this.\u00d8o0000.\u00d300000();
        L l2 = this.\u00d5o0000();
        Map<helden.framework.OOoO.K, Integer> map = l2.\u00d400000(Zauber.nullpublicnew);
        for (Map.Entry<helden.framework.OOoO.K, Integer> entry : map.entrySet()) {
            if (entry.getValue() < 14) continue;
            KonkreterZauber konkreterZauber = KonkreterZauber.getZauber(Zauber.nullpublicnew.toString(), entry.getKey(), string);
            l2.super(konkreterZauber, HeldenMath.drittel(entry.getValue()));
        }
    }

    private int return(oo0o_0 oo0o_02) {
        int n = this.o00000(oo0o_02.getTalentprobe().o00000(0));
        int n2 = this.o00000(oo0o_02.getTalentprobe().o00000(1));
        int n3 = this.o00000(oo0o_02.getTalentprobe().o00000(2));
        return Math.max(n, Math.max(n2, n3));
    }

    private int \u00d500000(oo0o_0 oo0o_02) {
        int n;
        int n2;
        int n3 = this.o00000(oo0o_02.getTalentprobe().o00000(0));
        if (n3 == 0) {
            n3 = 999;
        }
        if ((n2 = this.o00000(oo0o_02.getTalentprobe().o00000(1))) == 0) {
            n2 = 999;
        }
        if ((n = this.o00000(oo0o_02.getTalentprobe().o00000(2))) == 0) {
            n = 999;
        }
        return Math.min(n3, Math.min(n2, n));
    }
}

