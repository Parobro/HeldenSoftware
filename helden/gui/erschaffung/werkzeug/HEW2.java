/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.werkzeug;

import helden.comm.CommUtilities;
import helden.framework.A.A;
import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.public;
import helden.framework.Einstellungen;
import helden.framework.Geschlecht;
import helden.framework.HeldenMath;
import helden.framework.OOoO.String;
import helden.framework.OoOO.G;
import helden.framework.held.A.E;
import helden.framework.held.K;
import helden.framework.held.Object.floatsuper;
import helden.framework.held.a.oooo_0;
import helden.framework.held.classsuper;
import helden.framework.int.L;
import helden.framework.int.N;
import helden.framework.int.OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.int.OooO;
import helden.framework.int.P;
import helden.framework.int.Q;
import helden.framework.int.String;
import helden.framework.int.o0oo_0;
import helden.framework.int.super;
import helden.framework.oooo.b_0;
import helden.framework.settings.Settings;
import helden.framework.zauber.KonkreterZauber;
import helden.gui.erschaffung.werkzeug.HEW2Auswahlen;
import helden.gui.erschaffung.werkzeug.HEW2Eigenschaften;
import helden.gui.erschaffung.werkzeug.HEW2Kosten;
import helden.gui.erschaffung.werkzeug.HEW2SF;
import helden.gui.erschaffung.werkzeug.HEW2Talente;
import helden.gui.erschaffung.werkzeug.HEW2Vorteile;
import helden.gui.erschaffung.werkzeug.HEW2Zauber;
import helden.gui.erschaffung.werkzeug.Hinweis;
import helden.gui.erschaffung.werkzeug.KostenArt;
import helden.gui.erschaffung.werkzeug.KostenEntry;
import helden.gui.erschaffung.werkzeug.KostenVerteiler;
import helden.gui.erschaffung.werkzeug.Pruefer;
import helden.gui.erschaffung.werkzeug.Speichern;
import helden.model.DDZRassen.Grolm;
import helden.model.DDZprofessionen.Geode;
import helden.model.KulturFabrik;
import helden.model.ProfessionenFabrik;
import helden.model.RassenFabrik;
import helden.model.profession.Bewahrer;
import helden.model.profession.Former;
import helden.model.profession.Kaempfer;
import helden.model.profession.Legendensaenger;
import helden.model.profession.Schelm;
import helden.model.profession.Wildnislaeufer;
import helden.model.profession.Zauberweber;
import helden.model.rasse.Zwerg;
import java.beans.PropertyChangeSupport;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Vector;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class HEW2 {
    public PHASEN \u00f400000;
    private HEW2Kosten Oo0000;
    protected K \u00d6o0000;
    protected o0oo_0 \u00f800000;
    protected OooO \u00d2o0000;
    protected super \u00d6O0000;
    protected super int;
    protected super \u00d3O0000;
    protected Geschlecht \u00f4O0000 = null;
    protected oooo_0 OO0000;
    private E \u00d8O0000;
    private floatsuper \u00f6O0000;
    private HEW2Talente do;
    private HEW2SF \u00d8o0000;
    private HEW2Vorteile \u00f8O0000;
    private HEW2Eigenschaften \u00d2O0000;
    private HEW2Zauber class;
    private HEW2Auswahlen \u00d300000;
    private boolean voidsuper;
    private PropertyChangeSupport \u00d800000;
    protected boolean \u00d600000;
    protected boolean \u00d200000;
    private java.lang.String floatsuper;
    private ArrayList<String<java.lang.String, java.lang.String, java.lang.String>> \u00d4o0000;
    private Settings \u00d4O0000;
    private int \u00d3o0000;
    private int Objectsuper;
    private int \u00d400000;
    private Pruefer \u00f600000;
    private boolean super;
    private java.lang.String interface = null;

    public HEW2(PropertyChangeSupport propertyChangeSupport) {
        this.\u00d800000 = propertyChangeSupport;
        this.setPhase(PHASEN.class);
        this.\u00f6O0000 = new floatsuper(null);
        this.\u00d600000 = false;
        this.\u00d200000 = false;
        this.OO0000 = new oooo_0();
        this.\u00d4o0000 = new ArrayList();
        this.\u00f600000 = new Pruefer(this);
        this.super = false;
    }

    public void beruecksichtigeSonstigePunkteQuellen() {
        KostenVerteiler kostenVerteiler = new KostenVerteiler(this);
        kostenVerteiler.beruecksichtigeSonstigePunkteQuellen();
    }

    public int bestimmteAlter(K k2) {
        int n = this.getRasse().wurfeleAlter();
        if (k2.o00000(I.O\u00f8o000)) {
            n += 5;
        }
        if (k2.o00000(I.O\u00f60000)) {
            n += 6;
        }
        if (this.getHauptProfession().istZeitaufwendig()) {
            n += 3;
        }
        if (k2.o00000(I.O\u00d80000)) {
            n += HeldenMath.haelfte(k2.\u00d500000().\u00d300000(I.O\u00d80000).supersuper());
        }
        return n;
    }

    public boolean breitgefaechertebildungErlaubt(super super_) {
        boolean bl = super_ instanceof Former || super_ instanceof Bewahrer || super_ instanceof Kaempfer || super_ instanceof Legendensaenger || super_ instanceof Wildnislaeufer || super_ instanceof Zauberweber;
        return !bl;
    }

    public OooO cloneKultur(OooO oooO2, Geschlecht geschlecht) {
        OooO oooO3 = Einstellungen.getInstance().isTestMode() && oooO2.equals(KulturFabrik.getLeerKultur(geschlecht)) ? KulturFabrik.getLeerKultur(geschlecht) : KulturFabrik.getKultur(oooO2, geschlecht);
        oooO3.setSetting(this.getSetting());
        return oooO3;
    }

    public super cloneProfession(super super_, Geschlecht geschlecht, OooO oooO2) {
        super super_2 = Einstellungen.getInstance().isTestMode() && super_.equals(ProfessionenFabrik.getLeerProfession(geschlecht, oooO2.getMuttersprache(), oooO2.getSchrift())) ? ProfessionenFabrik.getLeerProfession(geschlecht, oooO2.getMuttersprache(), oooO2.getSchrift()) : ProfessionenFabrik.getProfession(super_, geschlecht, oooO2);
        super_2.setSetting(this.getSetting());
        return super_2;
    }

    public o0oo_0 cloneRasse(o0oo_0 o0oo_02, Geschlecht geschlecht) {
        o0oo_0 o0oo_03 = Einstellungen.getInstance().isTestMode() && o0oo_02.equals(RassenFabrik.getLeerRasse(geschlecht)) ? RassenFabrik.getLeerRasse(geschlecht) : RassenFabrik.getRasse(o0oo_02, geschlecht);
        o0oo_03.setSetting(this.getSetting());
        return o0oo_03;
    }

    public void fireUpdate() {
        this.\u00d800000.firePropertyChange("ANZEIGE", null, null);
    }

    public void fireUpdateNAVI() {
        this.\u00d800000.firePropertyChange("NAVI", null, null);
    }

    public ArrayList<String<java.lang.String, java.lang.String, java.lang.String>> getAktionen() {
        return this.\u00d4o0000;
    }

    public ArrayList<super> getAlleProfessionen() {
        super super_;
        Object object;
        if (this.\u00d2o0000 == null) {
            return new ArrayList<super>();
        }
        ArrayList<super> arrayList = ProfessionenFabrik.getAlleProfessionen(this.\u00d2o0000.getGeschlecht(), this.\u00d2o0000.getMuttersprache(), this.\u00d2o0000.getSchrift());
        Iterator<super> iterator = arrayList.iterator();
        ArrayList<Object> arrayList2 = new ArrayList<Object>();
        while (iterator.hasNext()) {
            int n;
            int n2;
            b_0 b_02;
            Object object22;
            object = iterator.next();
            int n3 = 0;
            Iterator<P> iterator2 = ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object).getAlleVarianten().iterator();
            Vector<Object> vector = new Vector<Object>();
            while (iterator2.hasNext()) {
                P p2 = iterator2.next();
                ++n3;
                if (!(p2 instanceof N)) continue;
                object22 = (N)p2;
                Iterator<b_0> iterator3 = b_0.\u00d4\u00d60000();
                while (iterator3.hasNext()) {
                    b_02 = iterator3.next();
                    n2 = ((N)object22).getMinimalEigenschaftswert(b_02);
                    n = this.getMaximalEigenschaftswert(b_02);
                    if (n >= n2) continue;
                    vector.add(object22);
                }
                if (((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object).getMoeglicheVarianten().contains(p2)) continue;
                ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object).addMoeglicheVariante(p2);
            }
            for (Object object22 : vector) {
                ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object).removeMoeglicheVariante((P)object22);
            }
            if (n3 > 0 && !((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object).hatVariantenAuswahl() && ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object).getMoeglicheVarianten().size() < 1) {
                arrayList2.add(object);
                continue;
            }
            if (object instanceof L) continue;
            object22 = b_0.\u00d4\u00d60000();
            boolean bl = false;
            while (object22.hasNext()) {
                b_02 = (b_0)object22.next();
                n2 = ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object).getMinimalEigenschaftswert(b_02);
                n = this.getMaximalEigenschaftswert(b_02);
                if (n >= n2) continue;
                bl = true;
            }
            if (!bl) continue;
            arrayList2.add(object);
        }
        arrayList.removeAll(arrayList2);
        object = this.getHeld().nullsuper();
        if (arrayList != null && object != null) {
            arrayList.removeAll((Collection<?>)object);
        }
        if (Einstellungen.getInstance().isTestMode() && (super_ = ProfessionenFabrik.getLeerProfession(this.\u00d2o0000.getGeschlecht(), this.\u00d2o0000.getMuttersprache(), this.\u00d2o0000.getSchrift())) != null) {
            arrayList.add(super_);
        }
        return arrayList;
    }

    public oooo_0 getAngaben() {
        return this.OO0000;
    }

    public super getBGBProfession() {
        if (this.\u00d6o0000 == null || this.\u00d6o0000.\u00d800000().Object(String._o.\u00d500000).size() == 0) {
            return this.int;
        }
        if (this.\u00d6o0000.\u00d800000().\u00d200000(String._o.\u00d500000) == 0) {
            return null;
        }
        return this.\u00d6o0000.\u00d800000().\u00d500000(String._o.\u00d500000);
    }

    public floatsuper getBt() {
        return this.\u00f6O0000;
    }

    public java.lang.String getDateinameEntwurf() {
        return this.interface;
    }

    public Geschlecht getGeschlecht() {
        return this.getHeld().\u00d300000();
    }

    public int getGpmax() {
        return this.\u00d3o0000;
    }

    public super getHauptProfession() {
        if (this.\u00d6o0000 == null || this.\u00d6o0000.\u00d4O0000() == null) {
            return this.\u00d6O0000;
        }
        return this.\u00d6o0000.\u00d4O0000();
    }

    public K getHeld() {
        return this.\u00d6o0000;
    }

    public HEW2Auswahlen getHswAuswahlen() {
        return this.\u00d300000;
    }

    public HEW2Eigenschaften getHswEigenschaften() {
        return this.\u00d2O0000;
    }

    public HEW2Vorteile getHswVorteile() {
        return this.\u00f8O0000;
    }

    public HEW2Zauber getHswZauber() {
        return this.class;
    }

    public HEW2Kosten getKosten() {
        return this.Oo0000;
    }

    public OooO getKultur() {
        if (this.\u00d6o0000 == null || this.\u00d6o0000.\u00f800000() == null) {
            return this.\u00d2o0000;
        }
        return this.\u00d6o0000.\u00f800000();
    }

    public int getMaxeigenschaft() {
        return this.Objectsuper;
    }

    public int getMaxgpeigenschaft() {
        return this.\u00d400000;
    }

    public int getMaximalEigenschaftswert(b_0 b_02) {
        int n = this.getHeld().\u00d3\u00d30000().\u00d200000(b_02);
        if (this.getHeld().o00000(I.\u00d3\u00d3O000) && (b_02.equals(b_0.\u00f4\u00f4\u00d2000) || b_02.equals(b_0.privatedosuper) || b_02.equals(b_0.returnwhilesuper))) {
            int n2 = this.getMaxeigenschaft() + n;
            if (n2 > 11) {
                return 11;
            }
            return n2;
        }
        int n3 = !b_02.equals(b_0.\u00f5\u00f5\u00d2000) ? this.getMaxeigenschaft() + n : this.o00000() + n;
        return n3;
    }

    public ArrayList<super> getMoeglicheProfessionen(boolean bl) {
        super super_;
        Object object;
        ArrayList<super> arrayList;
        if (this.\u00d2o0000 == null) {
            return new ArrayList<super>();
        }
        ArrayList<super> arrayList2 = this.\u00d2o0000.getProfessionen(this.\u00f6O0000);
        if (bl) {
            arrayList = this.getHeld().nullsuper();
            arrayList2.removeAll(arrayList);
            boolean bl2 = this.getHeld().\u00d800000().Objectif().get(0).istZeitaufwendig();
            int n = this.getHeld().\u00d800000().getMinimalEigenschaftswert(b_0.\u00f5\u00f5\u00d2000);
            int n2 = this.getHeld().\u00d800000().getMaximalSozialstatus();
            object = new ArrayList();
            for (super super_2 : arrayList2) {
                if (this.breitgefaechertebildungErlaubt(super_2) && n <= super_2.getMaximalSozialstatus() && n2 >= super_2.getMinimalEigenschaftswert(b_0.\u00f5\u00f5\u00d2000) && !super_2.getVorteile().\u00d400000(I.forsupersuper) && !super_2.getVorteile().\u00d400000(I.\u00f5\u00d8o000) && !super_2.getVorteile().\u00d400000(I.\u00d5\u00f5O000) && !super_2.getVorteile().\u00d400000(I.\u00d8\u00f8o000) && !super_2.getVorteile().\u00d400000(I.\u00d4\u00f4O000) && !super_2.getVorteile().\u00d400000(I.iffor) && !super_2.getVorteile().\u00d400000(I.\u00f8\u00d50000) && !super_2.getVorteile().\u00d400000(I.\u00d3\u00f5O000) && (!bl2 || !super_2.istZeitaufwendig())) continue;
                object.add(super_2);
            }
            if (object.size() > 0) {
                arrayList2.removeAll((Collection<?>)object);
            }
        }
        arrayList = new ArrayList();
        for (super super_3 : arrayList2) {
            Iterator<b_0> iterator = b_0.\u00d4\u00d60000();
            while (iterator.hasNext()) {
                object = iterator.next();
                int n = super_3.getMinimalEigenschaftswert((b_0)object);
                int n3 = this.getMaximalEigenschaftswert((b_0)object);
                if (n3 >= n) continue;
                arrayList.add(super_3);
            }
        }
        arrayList2.removeAll(arrayList);
        if (Einstellungen.getInstance().isTestMode() && (super_ = ProfessionenFabrik.getLeerProfession(this.\u00d2o0000.getGeschlecht(), this.\u00d2o0000.getMuttersprache(), this.\u00d2o0000.getSchrift())) != null) {
            arrayList2.add(super_);
        }
        return arrayList2;
    }

    public java.lang.String getName() {
        return this.floatsuper;
    }

    public PropertyChangeSupport getPcs() {
        return this.\u00d800000;
    }

    public PHASEN getPhase() {
        return this.\u00f400000;
    }

    public Pruefer getPruefer() {
        return this.\u00f600000;
    }

    public o0oo_0 getRasse() {
        if (this.\u00d6o0000 == null || this.\u00d6o0000.o\u00d20000() == null) {
            return this.\u00f800000;
        }
        return this.\u00d6o0000.o\u00d20000();
    }

    public Settings getSetting() {
        return this.\u00d4O0000;
    }

    public HEW2SF getSf() {
        return this.\u00d8o0000;
    }

    public HEW2Talente getTalente() {
        return this.do;
    }

    public boolean getTalentTabErreicht() {
        return this.super;
    }

    public super getVeteranProfession() {
        if (this.\u00d6o0000 == null || this.\u00d6o0000.\u00d4O0000() == null || this.\u00d6o0000.\u00d800000().\u00d200000(String._o.String) == 0) {
            return this.\u00d3O0000;
        }
        return this.\u00d6o0000.\u00d800000().\u00d500000(String._o.String);
    }

    public boolean hatElfischeProfession() {
        super super_ = this.getHauptProfession();
        return this.isElfisch(super_);
    }

    public void heldAbschliessen() {
        KostenArt[] kostenArtArray;
        if (Einstellungen.getInstance().isAutoSaveNachErschaffung()) {
            this.\u00d200000();
        }
        this.getHeld().o00000(new A("EINSTELLUNG", "max GP f\u00fcr Helden: " + this.getGpmax(), ""));
        this.getHeld().o00000(new A("EINSTELLUNG", "max Eigenschafts-GP f\u00fcr Helden: " + this.getMaxgpeigenschaft(), ""));
        this.getHeld().o00000(new A("EINSTELLUNG", "max Eigenschafts-Wert f\u00fcr Helden: " + this.getMaxeigenschaft(), ""));
        for (Hinweis object2 : this.getPruefer().pruefe()) {
            this.getHeld().o00000(new A("Meistergenehmigung notwendig", object2.toString(), ""));
        }
        ArrayList<public> arrayList = this.getHeld().\u00d500000().o00000().getListe();
        Iterator n = arrayList.iterator();
        while (n.hasNext()) {
            public n2 = (public)n.next();
            if (!(n2 instanceof J) || (kostenArtArray = (KostenArt[])n2).ObjectString() != 0) continue;
            this.getHeld().o00000(new A("Vorteil/Nachteil entfernt, da Wert 0 war.", n2, ""));
            this.getHeld().new(n2);
        }
        this.getTalente().initialisiereKampfwerte();
        this.getHeld().thissuper().super(this.getKosten().getVerfuegbarePunkte(KostenArt.int), this.getKosten().getVerfuegbarePunkte(KostenArt.int) - this.getKosten().getKosten(KostenArt.int));
        int n2 = this.getKosten().getVerfuegbarePunkte(KostenArt.\u00f600000) + this.getKosten().getVerfuegbarePunkte(KostenArt.\u00f400000) + this.getKosten().getVerfuegbarePunkte(KostenArt.\u00d300000) + this.getKosten().getVerfuegbarePunkte(KostenArt.\u00f800000);
        int n3 = this.getKosten().getKosten(KostenArt.\u00f600000) + this.getKosten().getKosten(KostenArt.\u00f400000) + this.getKosten().getKosten(KostenArt.\u00d300000) + this.getKosten().getKosten(KostenArt.\u00f800000);
        this.getHeld().\u00d300000(n2);
        this.getHeld().new(n2 - n3);
        KostenArt[] n4 = kostenArtArray = new KostenArt[]{KostenArt.\u00f400000, KostenArt.\u00d300000, KostenArt.\u00f800000};
        int n5 = n4.length;
        boolean string = false;
        while (string < n5) {
            KostenArt kostenArt = n4[string];
            int n6 = this.getKosten().getVerfuegbarePunkte(kostenArt) - this.getKosten().getKosten(kostenArt);
            if (n6 > 0) {
                this.getHeld().o00000(new A("Meistergenehmigung notwendig", n6 + " AP aus " + kostenArt.toString() + " wurden nicht genutzt und dem Helden gem\u00e4\u00df Regeln gut geschrieben", ""));
            }
            ++string;
        }
        int n7 = this.getKosten().getVerfuegbarePunkte(KostenArt.\u00f600000) - this.getKosten().getKosten(KostenArt.\u00f600000);
        if (n7 > 15) {
            this.getHeld().o00000(new A("Meistergenehmigung notwendig", "Eine gr\u00f6\u00dfere Menge (" + n7 + ") AP wurde nicht genutzt " + "und dem Helden gut geschrieben", ""));
        }
        this.getHeld().\u00d3\u00d30000().super(b_0.\u00f4\u00f5\u00d2000, this.getHeld().\u00d800000().getPermanenteASP());
        if (this.floatsuper == null || this.floatsuper.equals("")) {
            this.getHeld().\u00d500000("Kein Name");
        } else {
            this.getHeld().\u00d500000(this.floatsuper);
        }
        for (java.lang.String super_ : this.getKosten().getList().getWerte()) {
            KostenEntry kostenEntry = (KostenEntry)this.getKosten().getList().get(super_);
            this.getHeld().o00000(new A(kostenEntry.getBereich().toString(), (Object)super_, kostenEntry.\u00d400000 + " " + kostenEntry.\u00d500000, (Integer)0, (Integer)0, (Integer)0, (Integer)0, 0, kostenEntry.\u00d600000));
        }
        for (String string2 : this.getAktionen()) {
            this.getHeld().o00000(new A((java.lang.String)string2.\u00d300000(), (Object)"Auswahl", "", (Integer)0, (Integer)0, (Integer)0, (Integer)0, "", (java.lang.String)string2.new()));
        }
        if (this.getHeld().o00000(I.\u00f40O000)) {
            this.getHeld().thissuper().super("wei\u00df");
            this.getHeld().thissuper().class("rot");
        }
        for (super super_ : this.getHeld().\u00d800000().\u00d6oO000()) {
            if (!(super_ instanceof Q)) continue;
            this.getHeld().\u00d800000(((Q)((Object)super_)).getGildenzugehoerigkeit());
        }
        this.getHeld().ifnew().o00000(false);
        this.getHeld().ifnew().\u00d300000();
        this.getHeld().\u00f5\u00d40000().add(classsuper.\u00d800000);
    }

    public boolean isBGB() {
        return this.\u00d600000;
    }

    public boolean isBGBProfession(helden.framework.oOoO.A.Object object) {
        return this.isBGB() && object.equals(this.int);
    }

    public boolean isBGBProfession(helden.framework.oOoO.floatsuper floatsuper2) {
        return this.isBGB() && floatsuper2.equals(this.int);
    }

    public boolean isElfisch(super super_) {
        return super_ instanceof Former || super_ instanceof Bewahrer || super_ instanceof Kaempfer || super_ instanceof Legendensaenger || super_ instanceof Wildnislaeufer || super_ instanceof Zauberweber;
    }

    public boolean isGeschlechtGesetzt() {
        return this.\u00f4O0000 != null;
    }

    public boolean isHauptProfessionGesetzt() {
        return this.\u00d6O0000 != null;
    }

    public boolean isKulturGesetzt() {
        return this.\u00d2o0000 != null;
    }

    public boolean isMagisch(OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ... ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOArray) {
        for (OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 : ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOArray) {
            if (!ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.getVorteile().\u00d400000(I.forsupersuper) && !ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.getVorteile().\u00d400000(I.\u00f5\u00d8o000) && !ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.getVorteile().\u00d400000(I.\u00d5\u00d3O000)) continue;
            return true;
        }
        return false;
    }

    public boolean isNaechstePhaseErlaubt() {
        switch (this.\u00f400000) {
            case \u00d200000: {
                return this.\u00f800000 != null && this.\u00d2o0000 != null && this.\u00d6O0000 != null;
            }
            case \u00d400000: {
                return !this.\u00d300000.hatWeitereAuswahlen();
            }
        }
        return true;
    }

    public boolean isProfessionGesetzt() {
        return this.\u00d6O0000 != null;
    }

    public boolean isRasseGesetzt() {
        return this.\u00f800000 != null;
    }

    public boolean isRecalcRunning() {
        return this.voidsuper;
    }

    public boolean isSonderfallGrolm() {
        if (this.getRasse() == null || this.getHauptProfession() == null) {
            return false;
        }
        return this.getRasse() instanceof Grolm && this.isMagisch(this.getHauptProfession());
    }

    public boolean istSpruchzauberer() {
        for (OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 : this.getHeld().StringObject()) {
            for (helden.framework.D.P p2 : ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.getSonderfertigkeiten()) {
                if (!p2.\u00f4O0000()) continue;
                return true;
            }
        }
        return false;
    }

    public boolean isVeteran() {
        return this.\u00d200000;
    }

    public boolean isZwergMitVollzaubererDerKeinGeodeWerdenWill() {
        return this.getRasse() instanceof Zwerg && this.getHauptProfession().getVorteile().\u00d400000(I.forsupersuper) && this.\u00d6o0000.\u00d800000().hatProfession(helden.model.profession.Geode.class) == null && this.\u00d6o0000.\u00d800000().hatProfession(Geode.class) == null;
    }

    public int magischeAPausGebildet() {
        int n = 0;
        Iterator iterator = this.getKosten().getList().entrySet().iterator();
        while (iterator.hasNext()) {
            boolean bl;
            KostenEntry kostenEntry = (KostenEntry)iterator.next().getValue();
            if (!kostenEntry.getArt().equals(KostenArt.\u00f800000)) continue;
            boolean bl2 = kostenEntry.getKostengegenstand() instanceof KonkreterZauber;
            boolean bl3 = bl = kostenEntry.getKostengegenstand() instanceof helden.framework.D.P && ((helden.framework.D.P)kostenEntry.getKostengegenstand()).privatesuper();
            if (!bl2 && !bl) continue;
            n += kostenEntry.getKosten();
        }
        return n;
    }

    public void naechstePhase() {
        switch (this.\u00f400000) {
            case class: {
                this.setPhase(PHASEN.\u00d200000);
                break;
            }
            case \u00d200000: {
                this.setPhase(PHASEN.\u00d400000);
                break;
            }
            case \u00d400000: {
                this.setPhase(PHASEN.super);
                break;
            }
        }
    }

    public void recalc() {
        if (this.isRecalcRunning()) {
            return;
        }
        helden.framework.held.object.oooo_0.o00000();
        this.setRecalcRunning(true);
        this.\u00d6o0000 = this.recreateHeld();
        this.getHeld().thissuper().super(this.\u00d8O0000);
        this.getHeld().o00000(System.currentTimeMillis());
        this.setRecalcRunning(false);
        helden.framework.held.object.oooo_0.\u00d300000();
        this.fireUpdate();
    }

    public K recreateHeld() {
        K k2 = new K();
        k2.o00000(this.getSetting());
        this.\u00f6O0000.o00000(k2);
        this.Oo0000 = new HEW2Kosten(this);
        if (this.\u00f400000 != PHASEN.class && this.\u00f400000 != PHASEN.\u00d200000) {
            this.getTalente().setHeld(k2);
        }
        k2.o00000(this.\u00f4O0000);
        this.o00000(k2);
        if (this.\u00f400000 != PHASEN.class && this.\u00f400000 != PHASEN.\u00d200000) {
            this.getTalente().initializeBasisTalente();
            this.getTalente().uebernehmeLeittalente();
        }
        Iterator<OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> iterator = this.getHeld().newnew();
        while (iterator.hasNext()) {
            OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = iterator.next();
            ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.resetModifikationen();
        }
        if (this.\u00f400000 != PHASEN.class && this.\u00f400000 != PHASEN.\u00d200000) {
            this.getHswAuswahlen().init(k2);
        }
        this.setzeRKPKosten();
        this.Oo0000.berechneSonderkostenUndGutschriften(k2);
        if (this.\u00f400000 != PHASEN.class && this.\u00f400000 != PHASEN.\u00d200000 && this.\u00f400000 != PHASEN.\u00d400000) {
            this.getHswAuswahlen().setzteGespeicherteAuswahlenListenAuswahl();
        }
        if (this.\u00f400000 != PHASEN.class && this.\u00f400000 != PHASEN.\u00d200000) {
            this.getHswEigenschaften().o00000(k2);
            this.getHswVorteile().init(k2);
            this.getSf().init(k2);
            this.getHswEigenschaften().setzeGueltigeEigenschaftswerte();
            this.getTalente().init();
        }
        if (this.\u00f400000 != PHASEN.class && this.\u00f400000 != PHASEN.\u00d200000 && this.\u00f400000 != PHASEN.\u00d400000) {
            this.getHswAuswahlen().setzteGespeicherteAuswahlenTalente();
        }
        if (this.\u00f400000 != PHASEN.class && this.\u00f400000 != PHASEN.\u00d200000) {
            this.getTalente().restoreTalentwerte();
            this.getHswZauber().init(k2);
            this.getSf().passeKostenFuerVorhandeneSFan();
            this.getSf().passeGenerierungsKostenAn();
        }
        if (this.\u00f400000 != PHASEN.class && this.\u00f400000 != PHASEN.\u00d200000 && this.\u00f400000 != PHASEN.\u00d400000) {
            this.getHswVorteile().berechneGPKostenNeu();
            this.beruecksichtigeSonstigePunkteQuellen();
        }
        if (this.\u00f400000 != PHASEN.class && this.\u00f400000 != PHASEN.\u00d200000) {
            k2.thissuper().\u00d300000(this.getAngaben().getGroesse());
            k2.thissuper().\u00d200000(this.getAngaben().getGewicht(false));
            k2.thissuper().super(this.getAngaben().getHaarFarbe());
            k2.thissuper().class(this.getAngaben().getAugenFarbe());
            k2.thissuper().\u00d400000(this.bestimmteAlter(k2));
        }
        if (this.getName() != null) {
            k2.\u00d500000(this.getName());
        }
        return k2;
    }

    public void restoreSavedErschaffung(K k2) {
        this.\u00d4O0000 = k2.oO0000();
        this.do = new HEW2Talente(this);
        this.class = new HEW2Zauber(this);
        this.\u00d8o0000 = new HEW2SF(this);
        this.\u00f8O0000 = new HEW2Vorteile(this);
        this.\u00d2O0000 = new HEW2Eigenschaften(this);
        this.\u00d300000 = new HEW2Auswahlen(this);
        this.\u00d8O0000 = E.\u00d500000();
        this.\u00d6o0000 = k2;
        this.\u00f4O0000 = k2.\u00d300000();
        this.getHswAuswahlen().\u00d400000 = k2;
        this.getHswEigenschaften().Object = k2;
        this.getSf().supersuper = k2;
        this.getTalente().\u00d300000 = k2;
        this.getHswVorteile().do = k2;
        this.getHswVorteile().restoreAfterLoadedErschaffung();
        this.getHswZauber().\u00d2O0000 = k2;
        this.\u00f800000 = k2.o\u00d20000();
        this.setTalentTabErreicht();
        this.\u00d2o0000 = k2.\u00f800000();
        this.\u00d6O0000 = k2.\u00d4O0000();
        if (k2.\u00d800000().\u00d200000(String._o.String) > 0) {
            this.\u00d3O0000 = k2.\u00d800000().\u00d500000(String._o.String);
            this.\u00d200000 = true;
        }
        if (k2.\u00d800000().\u00d200000(String._o.\u00d500000) > 0) {
            this.int = k2.\u00d800000().\u00d500000(String._o.\u00d500000);
            this.\u00d600000 = true;
        }
        this.setName(k2.\u00f5o0000());
    }

    public void restoreSavedErschaffungPart2() {
        this.\u00f400000 = PHASEN.super;
        this.recalc();
        this.\u00f400000 = PHASEN.class;
    }

    public void setAngaben(oooo_0 oooo_02) {
        this.OO0000 = oooo_02;
    }

    public void setBGB(boolean bl) {
        this.\u00d600000 = bl;
        if (!bl) {
            this.int = null;
        }
        this.fireUpdate();
        this.fireUpdateNAVI();
    }

    public void setDateinameEntwurf(java.lang.String string) {
        this.interface = string;
    }

    public void setGeburtstag(E e) {
        this.getHeld().thissuper().super(e);
    }

    public void setGeschlecht(Geschlecht geschlecht) {
        this.\u00f4O0000 = geschlecht;
    }

    public void setHauptProfession(super super_) {
        this.\u00d6O0000 = super_;
    }

    public void setMaxEigenschaft(int n) {
        this.Objectsuper = n;
    }

    public void setMaxGP(int n) {
        this.\u00d3o0000 = n;
    }

    public void setMaxGPEigenschaft(int n) {
        this.\u00d400000 = n;
    }

    public void setName(java.lang.String string) {
        this.floatsuper = string;
    }

    public void setPhase(PHASEN pHASEN) {
        this.\u00f400000 = pHASEN;
        switch (pHASEN) {
            case class: {
                this.\u00d6o0000 = new K();
                this.Oo0000 = new HEW2Kosten(this);
                this.\u00d6o0000.o00000(this.\u00f4O0000);
                break;
            }
            case \u00d200000: {
                this.\u00d6o0000 = new K();
                this.Oo0000 = new HEW2Kosten(this);
                this.\u00d6o0000.o00000(this.\u00f4O0000);
                break;
            }
            case \u00d400000: {
                this.do = new HEW2Talente(this);
                this.class = new HEW2Zauber(this);
                this.\u00d8o0000 = new HEW2SF(this);
                this.\u00f8O0000 = new HEW2Vorteile(this);
                this.\u00d2O0000 = new HEW2Eigenschaften(this);
                this.\u00d300000 = new HEW2Auswahlen(this);
                this.\u00d8O0000 = E.\u00d500000();
                this.recalc();
                break;
            }
            case super: {
                this.\u00d8o0000.resetMoeglicheSF();
                this.recalc();
                this.\u00f8O0000.setzteWertVorteileZuAuto();
                break;
            }
        }
    }

    public void setRecalcRunning(boolean bl) {
        this.voidsuper = bl;
    }

    public void setSetting(Settings settings) {
        this.\u00d4O0000 = settings;
    }

    public void setTalentTabErreicht() {
        this.super = true;
    }

    public void setVeteran(boolean bl) {
        this.\u00d200000 = bl;
        if (!bl) {
            this.\u00d3O0000 = null;
        }
        this.fireUpdate();
        this.fireUpdateNAVI();
    }

    public void setzeBGBModifizierer(OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, ArrayList<P> arrayList) {
        this.int = this.cloneProfession((super)ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, this.\u00f4O0000, this.\u00d2o0000);
        for (P p2 : arrayList) {
            this.int.waehleVariante(p2.toString());
        }
    }

    public void setzeModifizierer(OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, ArrayList<P> arrayList) {
        if (ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 instanceof o0oo_0) {
            this.\u00f800000 = this.cloneRasse((o0oo_0)ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, this.\u00f4O0000);
            for (P p2 : arrayList) {
                this.\u00f800000.waehleVariante(p2.getBezeichner(this.getGeschlecht()));
            }
        }
        if (ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 instanceof OooO) {
            this.\u00d2o0000 = this.cloneKultur((OooO)ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, this.\u00f4O0000);
            for (P p2 : arrayList) {
                this.\u00d2o0000.waehleVariante(p2.toString());
            }
        }
        if (ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 instanceof super) {
            this.\u00d6O0000 = this.cloneProfession((super)ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, this.\u00f4O0000, this.\u00d2o0000);
            for (P p2 : arrayList) {
                this.\u00d6O0000.waehleVariante(p2.toString());
            }
        }
        this.setzeRKPKosten();
        this.recalc();
        this.fireUpdate();
    }

    public void setzeRKPKosten() {
        this.getKosten().removeAllKostenEntries(KostenEntry.kostenBereich.\u00d400000);
        if (this.\u00f800000 != null) {
            this.Oo0000.put("Rasse: " + this.\u00f800000.toString(), new KostenEntry(KostenEntry.kostenBereich.\u00d400000, KostenArt.int, this.\u00f800000.getGPKosten(), this.\u00f800000));
        }
        if (this.\u00d2o0000 != null) {
            this.Oo0000.put("Kultur: " + this.\u00d2o0000.toString(), new KostenEntry(KostenEntry.kostenBereich.\u00d400000, KostenArt.int, this.\u00d2o0000.getGPKosten(), this.\u00d2o0000));
        }
        if (this.\u00d6O0000 != null) {
            this.Oo0000.put("Profession: " + this.\u00d6O0000.toString(), new KostenEntry(KostenEntry.kostenBereich.\u00d400000, KostenArt.int, this.\u00d6O0000.getGPKosten(), this.\u00d6O0000));
        }
        if (this.isBGB() && this.int != null) {
            this.Oo0000.put("Breitgef\u00e4cherte Bildung: " + this.int.toString(), new KostenEntry(KostenEntry.kostenBereich.\u00d400000, KostenArt.int, 7 + this.int.getGPKosten(), this.int));
        }
        if (this.isVeteran() && this.\u00d3O0000 != null) {
            this.Oo0000.put("Veteran: " + this.\u00d3O0000.toString(), new KostenEntry(KostenEntry.kostenBereich.\u00d400000, KostenArt.int, 3 + this.\u00d3O0000.getGPKosten(), this.\u00d3O0000));
        }
    }

    public void setzeVeteranModifizierer(OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, ArrayList<P> arrayList) {
        this.\u00d3O0000 = this.cloneProfession((super)ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, this.\u00f4O0000, this.\u00d2o0000);
        for (P p2 : arrayList) {
            this.\u00d3O0000.waehleVariante(p2.toString());
        }
    }

    public void updateMutterspracheInProfession(K k2) {
        super super_ = k2.\u00d4O0000();
        boolean bl = super_ instanceof Schelm;
        G g2 = k2.\u00f800000().getMuttersprache();
        G g3 = k2.\u00f800000().getSchrift();
        if (bl) {
            ArrayList<G> arrayList = new ArrayList<G>();
            arrayList.add(g2);
            super_.setZweitLehrsprache(arrayList);
            g2 = G.privatesuperclass;
            g3 = G.\u00d3\u00d2\u00f5000;
        } else {
            super_.setKulturZweitLehrsprache(k2.\u00f800000().getZweitLehrsprache());
        }
        super_.setMuttersprache(g2);
        super_.setMuttersprachenSchrift(g3);
    }

    private void \u00d200000() {
        Object object;
        Object object2 = this.getDateinameEntwurf();
        if (object2 == null) {
            object = "";
            if (this.getName() != null) {
                object = (java.lang.String)object + this.getName() + " ";
            }
            object = (java.lang.String)object + this.getHauptProfession().toString();
            object = (java.lang.String)object + this.getKultur().toString();
            object2 = object = (java.lang.String)object + this.getRasse().toString();
        }
        object = new Date();
        object2 = "AUTOSAVE " + new SimpleDateFormat("dd.MM.yyyy HH.mm").format((Date)object) + " " + (java.lang.String)object2 + ".erschaffung.hld";
        object2 = CommUtilities.replaceAllEvil((java.lang.String)object2);
        File file = new File(Einstellungen.getInstance().getPfade().getPfad("erschaffungsSavesPfad") + File.separatorChar + (java.lang.String)object2);
        Speichern speichern = new Speichern(this);
        speichern.save(file.getAbsolutePath());
    }

    private int o00000() {
        if (this.getHeld().\u00d4O0000() == null) {
            return this.getKultur().getMaximalSozialstatus();
        }
        int n = Math.min(this.getHeld().\u00d800000().getMaximalSozialstatus(), this.getKultur().getMaximalSozialstatus());
        int n2 = this.getHeld().\u00d800000().getMinimalEigenschaftswert(b_0.\u00f5\u00f5\u00d2000);
        n = Math.max(n, n2);
        return n;
    }

    private void o00000(K k2) {
        Object object;
        if (this.\u00f800000 != null) {
            k2.o00000(this.cloneRasse(this.\u00f800000, this.\u00f4O0000));
            for (P iterator : this.\u00f800000.getGewaehlteVarianten()) {
                k2.o\u00d20000().waehleVariante(iterator.toString());
            }
        }
        if (this.\u00d2o0000 != null) {
            k2.o00000(this.cloneKultur(this.\u00d2o0000, this.\u00f4O0000));
            for (P p2 : this.\u00d2o0000.getGewaehlteVarianten()) {
                k2.\u00f800000().waehleVariante(p2.toString());
            }
        }
        if (this.\u00d6O0000 != null) {
            k2.\u00d800000().o00000(String._o.\u00d300000, this.cloneProfession(this.\u00d6O0000, this.\u00f4O0000, this.\u00d2o0000), 0);
            for (P p3 : this.\u00d6O0000.getGewaehlteVarianten()) {
                k2.\u00d4O0000().waehleVariante(p3.toString());
            }
        }
        if (this.isVeteran() && this.\u00d3O0000 != null) {
            object = this.cloneProfession(this.\u00d3O0000, this.\u00f4O0000, this.\u00d2o0000);
            k2.\u00d800000().o00000(String._o.String, (super)object, 0);
            for (P p4 : this.\u00d3O0000.getGewaehlteVarianten()) {
                ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object).waehleVariante(p4.toString());
            }
        }
        if (this.isBGB() && this.int != null) {
            object = this.cloneProfession(this.int, this.\u00f4O0000, this.\u00d2o0000);
            k2.\u00d800000().o00000(String._o.\u00d500000, (super)object, 0);
            for (P p4 : this.int.getGewaehlteVarianten()) {
                ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object).waehleVariante(p4.toString());
            }
        }
    }

    /*
     * Illegal identifiers - consider using --renameillegalidents true
     */
    public static enum PHASEN {
        class,
        \u00d200000,
        \u00d400000,
        super;

    }
}

