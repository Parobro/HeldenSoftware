/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.werkzeug;

import helden.framework.C.I;
import helden.framework.C.public;
import helden.framework.D.H;
import helden.framework.D.J;
import helden.framework.D.OOOo;
import helden.framework.D.OoOO.D;
import helden.framework.D.OoOO.U;
import helden.framework.D.OoOO.whilesuper;
import helden.framework.D.P;
import helden.framework.D.Q;
import helden.framework.D.for;
import helden.framework.D.void;
import helden.framework.D.while;
import helden.framework.OOoO.K;
import helden.framework.OOoO.oO0O;
import helden.framework.OoOO.voidsuper;
import helden.framework.d.oooo_0;
import helden.framework.held.Object.T;
import helden.framework.held.Object.floatsuper;
import helden.framework.held.Object.private;
import helden.framework.int.L;
import helden.framework.int.OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.int.String;
import helden.framework.int.super;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import helden.gui.erschaffung.werkzeug.DoppelteSfCounter;
import helden.gui.erschaffung.werkzeug.HEW2;
import helden.gui.erschaffung.werkzeug.Hinweis;
import helden.gui.erschaffung.werkzeug.KostenArt;
import helden.gui.erschaffung.werkzeug.KostenEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class HEW2SF {
    public static final String[] Object = new String[]{"Allgemein", "Elfenlied", "Gel\u00e4ndekunde", "Geweiht", "Liturgie", "Fernkampf", "Nahkampf", "Man\u00f6ver", "Magisch", "Merkmalskenntnis", "Objektritual", "Schamanenritual", "Repr\u00e4sentation", "Ritualkenntnis", "Sonstiges", "DSA 4.0"};
    private static Vector<Long> \u00d500000 = new Vector();
    private static Vector<String> oO0000 = new Vector();
    private HEW2 \u00d400000;
    private T \u00d200000;
    private OOOo \u00d6O0000;
    private OOOo \u00d4O0000;
    protected HashMap<P, KostenArt> public;
    private ArrayList<String> \u00d600000;
    private ArrayList<P> OO0000;
    private DoppelteSfCounter float;
    private ArrayList<for> \u00f400000;
    private OOOo \u00f500000;
    protected ArrayList<P> o00000;
    protected helden.framework.held.K supersuper;
    private ArrayList<P> \u00f600000;
    private ArrayList<oo0o_0> \u00d2O0000;
    private HashMap<P, KostenArt> void;
    private floatsuper \u00d5O0000;

    public HEW2SF(HEW2 hEW2) {
        this.\u00d400000 = hEW2;
    }

    public void add(P p2, KostenArt kostenArt) {
        if (!this.\u00d200000().new(p2.toString())) {
            this.\u00d200000().\u00d500000(p2);
            this.o00000.add(p2);
            this.setzeKostenArt(p2, kostenArt);
            this.resetMoeglicheSF();
            this.passeKostenAn();
            this.passeGenerierungsKostenAn();
        }
    }

    public void addVerbilligte(P p2, KostenArt kostenArt) {
        if (!this.OO0000.contains(p2)) {
            this.OO0000.add(p2);
            if (!(p2 instanceof helden.framework.D.K)) {
                this.getMoeglicheVerbilligteSonderfertigkeiten().private().addExclude(p2);
            }
            this.setzeKostenArtVerbilligteSF(p2, kostenArt);
            for (for for_ : for.o00000(p2)) {
                this.supersuper.\u00d4O0000().waehleVerbilligteSonderfertigkeit(for_);
            }
            this.passeGenerierungsKostenAn();
        }
    }

    public ArrayList<String> getDoppelteSonderfertigkeiten() {
        return this.\u00d600000;
    }

    public HashMap<P, KostenArt> getKostenArtFuerSf() {
        return this.public;
    }

    public HashMap<P, KostenArt> getKostenArtFuerVerbilligteSf() {
        return this.void;
    }

    public List<Object> getMoeglicheAuswahlen(P p2) {
        if (p2 instanceof helden.framework.D.K) {
            return this.\u00d400000.getSf().getTalentListeFuerTalentspezialisierungen();
        }
        void void_ = (void)p2;
        List<Object> list = void_.o00000(this.\u00d400000.getSetting());
        if (void_.o00000(this.\u00d5O0000) >= 4) {
            return list;
        }
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (Object object : list) {
            Q q = (Q)object;
            if (q.o\u00d20000() >= q.\u00d4\u00d30000().o\u00d20000()) continue;
            arrayList.add(q);
        }
        if (arrayList.size() == 0) {
            private.\u00d200000("Fehler bei der bestimmen der M\u00f6glichkeiten Auswahlen f\u00fcr " + void_.\u00f500000(), "alle");
            return list;
        }
        return arrayList;
    }

    public List<Object> getMoeglicheKostenArten(P p2) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add(KostenArt.int);
        arrayList.add(KostenArt.\u00f600000);
        if (!(this.\u00d400000.getKosten().getVerfuegbarePunkte(KostenArt.\u00f800000) <= 0 || p2.\u00f400000() || p2.\u00d300000() || p2.\u00f5O0000())) {
            arrayList.add(KostenArt.\u00f800000);
        }
        if (this.\u00d400000.getKosten().getVerfuegbarePunkte(KostenArt.\u00d300000) > 0 && this.istInProfesisonEnthalten(this.\u00d400000.getVeteranProfession(), p2)) {
            arrayList.add(KostenArt.\u00d300000);
        }
        if (this.\u00d400000.getKosten().getVerfuegbarePunkte(KostenArt.\u00f400000) > 0 && this.istInProfesisonEnthalten(this.\u00d400000.getBGBProfession(), p2)) {
            arrayList.add(KostenArt.\u00f400000);
        }
        if (this.float.getAllg() > 0 || p2 instanceof Q && ((Q)p2).\u00d4\u00d30000() instanceof D && this.float.getOrtskenntnis() > 0 || p2 instanceof U && this.float.getKulterkunde() > 0 || p2.\u00d400000() == 1 && this.float.getGelaendekunden() > 0) {
            arrayList.add(KostenArt.\u00d600000);
        }
        for (KostenArt kostenArt : this.\u00d400000.getKosten().getRKPKostenArten()) {
            if (!kostenArt.darfGenutztWerden(p2, KostenEntry.kostenBereich.class)) continue;
            arrayList.add(kostenArt);
        }
        return arrayList;
    }

    public List<Object> getMoeglicheKostenArtenVerbilligt(P p2) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (KostenArt kostenArt : this.\u00d400000.getKosten().getRKPKostenArten()) {
            if (!kostenArt.darfGenutztWerden(p2, KostenEntry.kostenBereich.\u00d800000)) continue;
            arrayList.add(kostenArt);
        }
        return arrayList;
    }

    public OOOo getMoeglicheSonderfertigkeiten() {
        if (this.\u00d6O0000 == null && this.getSonderfertigkeitVermittler() != null) {
            oO0000.add("preMoeg");
            \u00d500000.add(System.currentTimeMillis());
            this.\u00d6O0000 = this.getSonderfertigkeitVermittler().o00000(false);
            oO0000.add("moeglicheErstellen#");
            \u00d500000.add(System.currentTimeMillis());
            this.\u00d6O0000.o00000(helden.framework.D.K.o00000(voidsuper.\u00d8\u00d5\u00d5000, ""));
            if (this.\u00d200000().\u00d3O0000() && this.\u00d200000().\u00d5o0000().\u00d200000().size() > 0) {
                this.\u00d6O0000.o00000(helden.framework.D.K.new(KonkreterZauber.getZauber(Zauber.\u00d8\u00d6\u00d3000, K.\u00f8O0000, ""), "", true));
            }
            this.\u00d6O0000.private().clearExclude();
            this.\u00d6O0000.private().addExclude(this.\u00d400000.getSetting());
            oO0000.add("Setting exlcude");
            \u00d500000.add(System.currentTimeMillis());
            for (P p2 : this.supersuper.\u00f5O0000().private().getListe()) {
                if (p2 instanceof Q || p2 instanceof void) continue;
                this.\u00d6O0000.private().addExclude(p2);
            }
            oO0000.add("Vorhanden Exclude");
            \u00d500000.add(System.currentTimeMillis());
        }
        return this.\u00d6O0000;
    }

    public OOOo getMoeglicheVerbilligteSonderfertigkeiten() {
        if (this.\u00d4O0000 == null) {
            this.\u00d4O0000 = new OOOo();
            block0: for (P p2 : this.getSonderfertigkeitVermittler().\u00d200000()) {
                if (!this.\u00d400000.getSetting().contains(p2)) continue;
                for (KostenArt kostenArt : this.\u00d400000.getKosten().getRKPKostenArten()) {
                    if (!kostenArt.darfGenutztWerden(p2, KostenEntry.kostenBereich.\u00d800000)) continue;
                    this.\u00d4O0000.o00000(p2);
                    continue block0;
                }
            }
        }
        return this.\u00d4O0000;
    }

    public T getSonderfertigkeitVermittler() {
        return this.\u00d200000;
    }

    public ArrayList<oo0o_0> getTalentListeFuerTalentspezialisierungen() {
        if (this.\u00d2O0000 == null) {
            this.\u00d2O0000 = new ArrayList();
            for (voidsuper voidsuper2 : this.\u00d200000().\u00f8O0000().\u00d200000()) {
                if (!voidsuper2.istEchtesTalent() || !voidsuper2.isSpezialisierungenErlaubt()) continue;
                this.\u00d2O0000.add(voidsuper2);
            }
            Collections.sort(this.\u00d2O0000);
        }
        return this.\u00d2O0000;
    }

    public ArrayList<P> getVerbilligteSFausPoolPunkten() {
        return this.OO0000;
    }

    public ArrayList<for> getVerbilligtUndAutomatischeSonderfertigkeiten() {
        return this.\u00f400000;
    }

    public boolean hatWahreNamen() {
        Iterator<P> iterator = this.\u00d200000().\u00f5O0000().\u00d3o0000();
        while (iterator.hasNext()) {
            P p2 = iterator.next();
            if (!(p2 instanceof Q) || !(((Q)p2).\u00d4\u00d30000() instanceof whilesuper)) continue;
            return true;
        }
        return false;
    }

    public void init(helden.framework.held.K k2) {
        Object object;
        Object object2;
        \u00d500000.clear();
        oO0000.clear();
        \u00d500000.add(System.currentTimeMillis());
        oO0000.add("Start");
        this.setHeld(k2);
        this.\u00d5O0000 = new floatsuper(k2);
        this.\u00f600000 = new ArrayList();
        if (this.o00000 != null) {
            this.\u00f600000.addAll(this.o00000);
        }
        this.o00000 = new ArrayList();
        if (this.OO0000 == null) {
            this.OO0000 = new ArrayList();
        }
        for (P object32 : this.OO0000) {
            for (for for_ : for.o00000(object32)) {
                this.supersuper.\u00d4O0000().waehleVerbilligteSonderfertigkeit(for_);
            }
        }
        this.\u00d600000 = new ArrayList();
        this.float = new DoppelteSfCounter();
        this.\u00f400000 = new ArrayList();
        this.\u00f500000 = new OOOo();
        this.\u00d2O0000 = null;
        if (this.public == null) {
            this.public = new HashMap();
        }
        if (this.void == null) {
            this.void = new HashMap();
        }
        this.\u00d200000 = new T(this.supersuper, true, this);
        this.float.clear();
        for (OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 : this.\u00d200000().StringObject()) {
            this.o00000(ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
        }
        for (public public_ : this.\u00d200000().\u00d500000().o00000().getListe()) {
            if (public_.o00000(this.\u00d5O0000) == null) {
                helden.framework.held.object.oooo_0.\u00f500000("Vorteil " + public_.toString() + " getsf ist null!" + public_.getClass());
                continue;
            }
            for (oO0O oO0O2 : public_.o00000(this.\u00d5O0000)) {
                if (public_.\u00f4O0000().equals(I.thisvoid) && this.\u00d200000().\u00f5O0000().\u00d200000(((P)oO0O2.\u00d300000()).toString()) || this.isRKPAuto(this.supersuper, (P)oO0O2.\u00d300000())) continue;
                this.o00000((P)oO0O2.\u00d300000());
            }
        }
        if (this.\u00d200000().o00000(I.\u00f5\u00d80000)) {
            this.\u00d200000().\u00d400000(oooo_0.o00000(P.privatenullObject));
        }
        if (this.\u00d400000.isSonderfallGrolm()) {
            this.\u00d200000().\u00d400000(oooo_0.o00000(P.\u00d2o\u00d4000));
        }
        this.resetMoeglicheSF();
        oO0000.add("SF reset Moegliche");
        \u00d500000.add(System.currentTimeMillis());
        this.passeKostenAn(this.getMoeglicheSonderfertigkeiten());
        oO0000.add("SF passeKostenAn");
        \u00d500000.add(System.currentTimeMillis());
        ArrayList arrayList = new ArrayList();
        Iterator<P> iterator = this.getMoeglicheSonderfertigkeiten().null();
        while (iterator.hasNext()) {
            object2 = iterator.next();
            if (object2 instanceof Q || !this.\u00f600000.contains(object2)) continue;
            arrayList.add(object2);
            this.\u00f600000.remove(object2);
        }
        for (P p2 : this.\u00f600000) {
            if (p2 instanceof helden.framework.D.K) {
                arrayList.add(p2);
            }
            if (!(p2 instanceof Q) || !(((Q)(object = (Q)p2)).\u00d4\u00d30000() instanceof void)) continue;
            arrayList.add(((Q)object).\u00d4\u00d30000().\u00d300000(((Q)object).\u00d8\u00d30000()));
        }
        object2 = arrayList.iterator();
        while (object2.hasNext()) {
            P p3 = object2.next();
            object = this.public.get(p3);
            if (object == null) {
                object = KostenArt.\u00f600000;
            }
            this.add(p3, (KostenArt)object);
        }
        oO0000.add("SF post 1");
        \u00d500000.add(System.currentTimeMillis());
        this.passeGenerierungsKostenAn();
        oO0000.add("SF post 2");
        \u00d500000.add(System.currentTimeMillis());
    }

    public boolean isAuto(P p2) {
        if (this.o00000().\u00d200000(p2.toString())) {
            return true;
        }
        for (P p3 : this.supersuper.\u00f5O0000()) {
            for (H h2 : p3.O\u00d20000()) {
                if (!h2.equals(p2.toString())) continue;
                return true;
            }
        }
        return false;
    }

    public boolean isRKPAuto(helden.framework.held.K k2, P p2) {
        ArrayList<OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> arrayList = new ArrayList<OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO>();
        if (k2.o\u00d20000() != null) {
            arrayList.add(k2.o\u00d20000());
        }
        if (k2.\u00f800000() != null) {
            arrayList.add(k2.\u00f800000());
        }
        if (k2.\u00d800000().Object(String._o.\u00d300000).size() > 0) {
            arrayList.add(k2.\u00d800000());
        }
        for (OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 : arrayList) {
            for (P p3 : ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.getSonderfertigkeiten().\u00f600000()) {
                if (!p3.o00000(p2)) continue;
                return true;
            }
        }
        return false;
    }

    public boolean istInProfesisonEnthalten(super super_, P p2) {
        L l2;
        if (super_ instanceof L && (l2 = (L)super_).getGewaehlteSonderfertigkeiten().\u00d200000(p2.toString())) {
            return true;
        }
        return super_.getSonderfertigkeiten().\u00d200000(p2.toString()) || this.istVerbilligt(super_, p2);
    }

    public boolean istVerbilligt(super super_, P p2) {
        Object object;
        ArrayList<for> arrayList = new ArrayList<for>();
        arrayList.addAll(super_.getVerbilligteSonderfertigkeiten());
        if (super_ instanceof L && ((L)(object = (L)super_)).getGewaehlteVerbilligteSonderfertigkeiten() != null) {
            arrayList.addAll(((L)object).getGewaehlteVerbilligteSonderfertigkeiten());
        }
        if (p2.\u00f8O0000()) {
            object = (helden.framework.D.K)p2;
            for (for for_ : arrayList) {
                if (!for_.o00000() || !for_.Object().equals(((helden.framework.D.K)object).o\u00d30000())) continue;
                for (Object t : for_.getAuswahlen()) {
                    if (!t.toString().equals(((helden.framework.D.K)object).\u00f5\u00d20000())) continue;
                    return true;
                }
            }
        } else {
            for (for for_ : arrayList) {
                if (!J.super(for_, p2)) continue;
                return true;
            }
        }
        return false;
    }

    public void passeGenerierungsKostenAn() {
        this.\u00d400000.getKosten().removeAllKostenEntries(KostenEntry.kostenBereich.class);
        Iterator<P> iterator = this.\u00d200000().\u00f5O0000().\u00d3o0000();
        while (iterator.hasNext()) {
            P p2 = iterator.next();
            if (this.isAuto(p2)) continue;
            KostenArt object = this.getKostenArtFuerSf().get(p2);
            if (object == null) {
                private.\u00d200000("Keine Kosteneintrag f\u00fcr " + p2.toString(), "alle");
                continue;
            }
            if (object.equals(KostenArt.int)) {
                this.\u00d400000.getKosten().addKosten(p2.toString(), new KostenEntry(KostenEntry.kostenBereich.class, KostenArt.int, p2.nullsuper(), p2));
                continue;
            }
            if (object.verbilligteSFKostennutzen().booleanValue()) {
                this.\u00d400000.getKosten().addKosten(p2.toString(), new KostenEntry(KostenEntry.kostenBereich.class, object, p2.o\u00d20000(), p2));
                continue;
            }
            this.\u00d400000.getKosten().addKosten(p2.toString(), new KostenEntry(KostenEntry.kostenBereich.class, object, p2.newnew(), p2));
        }
        this.\u00d400000.getKosten().removeAllKostenEntries(KostenEntry.kostenBereich.\u00d800000);
        for (P p2 : this.getVerbilligteSFausPoolPunkten()) {
            KostenArt kostenArt = this.getKostenArtFuerVerbilligteSf().get(p2);
            if (kostenArt == null) {
                private.\u00d200000("Keine Kosteneintrag f\u00fcr " + p2.toString(), "alle");
                continue;
            }
            this.\u00d400000.getKosten().addKosten(p2.toString(), new KostenEntry(KostenEntry.kostenBereich.\u00d800000, kostenArt, p2.newnew(), p2));
        }
    }

    public void passeKostenAn() {
        this.getSonderfertigkeitVermittler().\u00d600000(this.getMoeglicheSonderfertigkeiten());
        this.passeKostenFuerVorhandeneSFan();
    }

    public void passeKostenAn(OOOo oOOo) {
        this.getSonderfertigkeitVermittler().\u00d600000(oOOo);
    }

    public void passeKostenFuerVorhandeneSFan() {
        Object object;
        OOOo oOOo = this.\u00d200000().\u00f5O0000();
        ArrayList<P> arrayList = new ArrayList<P>();
        for (P p2 : oOOo.\u00d3O0000()) {
            if (p2 instanceof Q) {
                object = (Q)p2;
                if (!this.getMoeglicheSonderfertigkeiten().\u00d200000(((Q)object).\u00d4\u00d30000().\u00f500000())) {
                    helden.framework.held.object.oooo_0.\u00f500000("SF nicht bei den m\u00f6glichen gefunden: " + ((Q)object).\u00d4\u00d30000().\u00f500000());
                    continue;
                }
                void void_ = (void)this.getMoeglicheSonderfertigkeiten().o00000(((Q)object).\u00d4\u00d30000().\u00f500000());
                p2.new(void_.return(((Q)object).\u00d8\u00d30000()));
                continue;
            }
            if (!(p2 instanceof helden.framework.D.K)) continue;
            arrayList.add(p2);
        }
        for (P p2 : arrayList) {
            oOOo.\u00d200000(p2);
        }
        for (P p2 : arrayList) {
            object = new OOOo();
            ((OOOo)object).o00000(p2);
            this.passeKostenAn((OOOo)object);
            oOOo.o00000(p2);
        }
    }

    public ArrayList<Hinweis> pruefe(KostenEntry.kostenBereich kostenBereich2) {
        Object object;
        ArrayList<Hinweis> arrayList = new ArrayList<Hinweis>();
        if (kostenBereich2.equals((Object)KostenEntry.kostenBereich.\u00d800000)) {
            if (this.OO0000.size() > 0) {
                String string = "Es wurden verbilligte SF gew\u00e4hlt. Die Auswahl unterliegt der Meistergenehimgung.";
                arrayList.add(new Hinweis(string, Hinweis.HinweisArt.\u00d200000));
            }
        } else if (kostenBereich2.equals((Object)KostenEntry.kostenBereich.class)) {
            Object object2;
            if (this.hatWahreNamen()) {
                String string = "Bitte die Anforderungen bzgl. Verbreitung bei den wahren Namen beachten.";
                arrayList.add(new Hinweis(string, Hinweis.HinweisArt.\u00d200000));
            }
            arrayList.addAll(this.\u00d400000.getPruefer().pruefeGebildetMagisch());
            int n = 0;
            DoppelteSfCounter object3 = new DoppelteSfCounter();
            object = this.\u00d400000.getKosten().getList().values().iterator();
            while (object.hasNext()) {
                object2 = (KostenEntry)object.next();
                if (!((KostenEntry)object2).\u00d500000.equals(KostenArt.\u00d600000)) continue;
                ++n;
                P p2 = (P)((KostenEntry)object2).getKostengegenstand();
                if (p2 instanceof U) {
                    object3.addKulterkunde();
                    continue;
                }
                if (p2.\u00d400000() == 1) {
                    object3.addGelaendekunden();
                    continue;
                }
                if (p2 instanceof Q && ((Q)p2).\u00d4\u00d30000() instanceof D) {
                    object3.addOrtskenntnis();
                    continue;
                }
                object3.addAllg();
            }
            if (n > this.\u00d600000.size()) {
                arrayList.add(new Hinweis("Es wurden zuviele Sonderfertigkeiten als Ersatz f\u00fcr die doppelten Sonderfertigkeiten ausgew\u00e4hlt."));
            } else if (n > 0) {
                int n2 = n;
                n2 -= Math.min(object3.getKulterkunde(), this.float.getKulterkunde());
                n2 -= Math.min(object3.getOrtskenntnis(), this.float.getOrtskenntnis());
                if ((n2 -= Math.min(object3.getGelaendekunden(), this.float.getGelaendekunden())) > this.float.getAllg()) {
                    object2 = "Die Verteilung der Ersatz-Sonderfertigkeiten stimmt nicht. Es d\u00fcrfen gew\u00e4hlt werden: \n";
                    if (this.float.getGelaendekunden() > 0) {
                        object2 = (String)object2 + this.float.getGelaendekunden() + "x Gel\u00e4ndekunde\n";
                    }
                    if (this.float.getOrtskenntnis() > 0) {
                        object2 = (String)object2 + this.float.getOrtskenntnis() + "x Ortskenntnis\n";
                    }
                    if (this.float.getKulterkunde() > 0) {
                        object2 = (String)object2 + this.float.getKulterkunde() + "x Kulturkunde\n";
                    }
                    if (this.float.getAllg() > 0) {
                        object2 = (String)object2 + this.float.getKulterkunde() + "x beliebige Sonderfertigkeiten\n";
                    }
                    arrayList.add(new Hinweis((String)object2));
                }
            }
            if (this.\u00d400000.getSf().getDoppelteSonderfertigkeiten().size() > 0) {
                object = "Folgende Sonderfertigkeiten wurden doppelt vergeben:\n";
                for (String string : this.\u00d400000.getSf().getDoppelteSonderfertigkeiten()) {
                    object = (String)object + string + "\n";
                }
                object = (String)object + "\nNach R\u00fccksprache mit dem Meister ";
                object = this.\u00d400000.getSf().getDoppelteSonderfertigkeiten().size() == 1 ? (String)object + "kann eine Sonderfertigkeit " : (String)object + "k\u00f6nnen " + this.\u00d400000.getSf().getDoppelteSonderfertigkeiten().size() + " Sonderfertigkeiten ";
                object = (String)object + " als Ersatz gew\u00e4hlt werden.";
                arrayList.add(new Hinweis((String)object, Hinweis.HinweisArt.\u00d200000));
            }
        }
        for (KostenArt kostenArt : this.\u00d400000.getKosten().getRKPKostenArten()) {
            if (!kostenArt.getNutzbareBereiche().contains((Object)kostenBereich2) || (object = kostenArt.pruefen()) == null) continue;
            arrayList.addAll((Collection<Hinweis>)object);
        }
        return arrayList;
    }

    public void remove(P p2) {
        this.public.remove(p2);
        System.out.println(this.getKostenArtFuerSf().get(p2));
        this.getKostenArtFuerSf().remove(p2);
        this.\u00d200000().\u00d400000(p2);
        this.o00000.remove(p2);
        this.resetMoeglicheSF();
        this.passeKostenAn();
        this.passeGenerierungsKostenAn();
    }

    public void removeVerbilligt(P p2) {
        this.OO0000.remove(p2);
        this.getMoeglicheVerbilligteSonderfertigkeiten().private().removeExclude(p2);
        for (for for_ : for.o00000(p2)) {
            this.supersuper.\u00d4O0000().getVerbilligteSonderfertigkeiten().remove(for_);
        }
        this.passeGenerierungsKostenAn();
    }

    public void resetMoeglicheSF() {
        this.\u00d6O0000 = null;
        this.\u00d4O0000 = null;
        this.getMoeglicheSonderfertigkeiten();
        this.getMoeglicheVerbilligteSonderfertigkeiten();
    }

    public void setHeld(helden.framework.held.K k2) {
        this.supersuper = k2;
    }

    public void setzeKostenArt(P p2, KostenArt kostenArt) {
        this.getKostenArtFuerSf().put(p2, kostenArt);
        this.passeGenerierungsKostenAn();
    }

    public void setzeKostenArtVerbilligteSF(P p2, KostenArt kostenArt) {
        this.getKostenArtFuerVerbilligteSf().put(p2, kostenArt);
    }

    private OOOo o00000() {
        return this.\u00f500000;
    }

    private helden.framework.held.K \u00d200000() {
        return this.supersuper;
    }

    private void o00000(P p2) {
        if (this.\u00d400000.isSonderfallGrolm() && (p2.toString().equals(while.\u00f6\u00f6\u00d2000.toString()) || p2.toString().equals(while.o0\u00f5000.toString()))) {
            return;
        }
        for (for for_ : this.\u00d200000().thisObject()) {
            if (!J.super(for_, p2)) continue;
            this.getVerbilligtUndAutomatischeSonderfertigkeiten().add(for_);
        }
        if (this.\u00d200000().\u00f5O0000().\u00d200000(p2.toString())) {
            this.getDoppelteSonderfertigkeiten().add(p2.toString());
            if (p2 instanceof U) {
                this.float.addKulterkunde();
            } else if (p2.\u00d400000() == 1) {
                this.float.addGelaendekunden();
            } else if (p2 instanceof D) {
                this.float.addOrtskenntnis();
            } else {
                this.float.addAllg();
            }
        } else {
            this.\u00d200000().\u00d500000(p2);
            try {
                this.\u00f500000.o00000((P)p2.clone());
            }
            catch (CloneNotSupportedException cloneNotSupportedException) {
                this.\u00f500000.o00000(p2);
            }
            p2.new(0);
        }
    }

    private void o00000(OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        OOOo oOOo = ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.getSonderfertigkeiten();
        for (P p2 : oOOo) {
            this.o00000(p2);
        }
    }
}

