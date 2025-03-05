/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.werkzeug;

import helden.framework.C.A.J;
import helden.framework.C.D;
import helden.framework.C.I;
import helden.framework.C.M;
import helden.framework.C.Oo0O;
import helden.framework.C.OoOO.A;
import helden.framework.C.o0OO;
import helden.framework.C.private;
import helden.framework.C.public;
import helden.framework.C.void;
import helden.framework.D.F;
import helden.framework.D.OOOo;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.E.O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.E.super.thissuper;
import helden.framework.Filter;
import helden.framework.Geschlecht;
import helden.framework.HeldenMath;
import helden.framework.OOoO.R;
import helden.framework.OOoO.o00O;
import helden.framework.OOoO.o0Oo;
import helden.framework.OOoO.oO0O;
import helden.framework.OoOO.U;
import helden.framework.bedingungen.AbstraktBedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.held.K;
import helden.framework.held.Object.floatsuper;
import helden.framework.held.object.oooo_0;
import helden.framework.int.L;
import helden.framework.int.OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.int.OooO;
import helden.framework.int.String;
import helden.framework.int.o0oo_0;
import helden.framework.int.super;
import helden.framework.oooo.b_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.settings.Setting;
import helden.framework.settings.Settings;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import helden.framework.zauber.ZauberFabrik;
import helden.gui.erschaffung.werkzeug.HEW2;
import helden.gui.erschaffung.werkzeug.Hinweis;
import helden.gui.erschaffung.werkzeug.KategorienArrayList;
import helden.gui.erschaffung.werkzeug.KostenArt;
import helden.gui.erschaffung.werkzeug.KostenEntry;
import helden.model.DDZRassen.Grolm;
import helden.model.kultur.Darna;
import helden.model.kultur.Dschungelstaemme;
import helden.model.kultur.Miniwatu;
import helden.model.kultur.Tocamuyac;
import helden.model.kultur.Trollzacken;
import helden.model.kultur.VerloreneStaemme;
import helden.model.kultur.WaldinselUtulus;
import helden.model.myranor.kultur.BasisMyranorKultur;
import helden.model.profession.Druide;
import helden.model.profession.Hexe;
import helden.model.profession.Krieger;
import helden.model.profession.Kristallomant;
import helden.model.profession.Lehrmeister;
import helden.model.profession.Magier;
import helden.model.profession.Schamane;
import helden.model.profession.Scharlatan;
import helden.model.profession.Schelm;
import helden.model.profession.Zibilja;
import helden.model.profession.schamane.GoblinSchamane;
import helden.model.profession.varianten.FerkinaBesessener;
import helden.model.rasse.Achaz;
import helden.model.rasse.Halbelf;
import helden.model.rasse.Nivese;
import helden.model.rasse.Zwerg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class HEW2Vorteile {
    private Oo0O OO0000;
    private Oo0O \u00d4O0000;
    protected K do;
    protected Settings \u00d3O0000;
    private KategorienArrayList<public> \u00f800000;
    private Oo0O \u00d400000;
    private HEW2 \u00d600000;
    private int int = 0;
    private int \u00d300000 = 0;
    private ArrayList<public> class;
    private ArrayList<I> super;
    private ArrayList<I> \u00f400000;
    private Filter \u00d800000;
    private int \u00d2O0000;
    private ArrayList<I> \u00f600000;
    private FerkinaBesessener \u00d200000;

    public HEW2Vorteile(HEW2 hEW2) {
        if (this.\u00f600000 == null) {
            this.\u00f600000 = new ArrayList();
            this.\u00f600000.add(I.O\u00d6o000);
            this.\u00f600000.add(I.\u00f4Oo000);
            this.\u00f600000.add(I.\u00f5OO000);
            this.\u00f600000.add(I.\u00d5\u00d50000);
            this.\u00f600000.add(I.returnprivate);
            this.\u00f600000.add(I.o0\u00d2000);
            this.\u00f600000.add(I.returnStringsuper);
            this.\u00f600000.add(I.ifStringsuper);
            this.\u00f600000.add(I.Ooo000);
            this.\u00f600000.add(I.O\u00d2o000);
            this.\u00f600000.add(I.\u00d8\u00f8O000);
            this.\u00f600000.add(I.OO\u00d2000);
            this.\u00f600000.add(I.Oo0000);
        }
        this.\u00d2O0000 = 0;
        this.\u00d800000 = Filter.\u00d600000;
        this.\u00d600000 = hEW2;
        this.OO0000 = helden.framework.C.K.\u00f400000();
        Iterator<public> iterator = this.OO0000.\u00d500000();
        while (iterator.hasNext()) {
            public public_ = iterator.next();
            if (public_ instanceof helden.framework.C.J) {
                ((helden.framework.C.J)public_).OO0000();
                continue;
            }
            if (public_ instanceof D) {
                ((D)public_).OO0000();
                continue;
            }
            public_.OO0000();
        }
        this.\u00d200000 = new FerkinaBesessener();
    }

    public void addAutomatischerVorteil(public public_) {
        public public_2;
        public public_3;
        try {
            public_3 = (public)public_.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            public_3 = public_;
        }
        this.\u00d4O0000.\u00d300000(public_3);
        if (public_ instanceof D) {
            public_2 = (D)public_;
            ((private)public_2).\u00d200000(((D)public_2).\u00f4o0000(), 0);
        }
        if (public_ instanceof M) {
            public_2 = (M)public_;
            Iterator iterator = ((private)public_2).intsuper().iterator();
            while (iterator.hasNext()) {
                ((private)public_2).\u00d200000(iterator.next(), 0);
            }
        }
        if (public_ instanceof helden.framework.C.J) {
            public_2 = (helden.framework.C.J)public_;
            ((helden.framework.C.J)public_2).interfaceObject();
        }
        if (public_ instanceof void) {
            public_2 = (void)public_;
            ((void)public_2).\u00f5\u00d50000();
        }
        public_.o00000(0);
        this.o00000().o00000(public_, true);
    }

    public void addVorteil(public public_) {
        this.addVorteil(public_, true);
    }

    public void addVorteil(public public_, boolean bl) {
        oooo_0.\u00d300000("addVorteil " + public_.toString());
        if (this.\u00f800000 != null && !(public_ instanceof D)) {
            this.\u00f800000.addExclude(public_);
        }
        this.o00000().o00000(public_, false);
        if (public_.equals(I.whilewhile)) {
            if (this.isAuto(this.OO0000.\u00d300000(I.o\u00f4o000))) {
                this.remove(this.OO0000.\u00d300000(I.o\u00f4o000));
                public_.o00000(this.OO0000.\u00d300000(I.o\u00f4o000));
            } else {
                try {
                    this.\u00d200000((public)this.OO0000.\u00d300000(I.thisclass).clone());
                }
                catch (CloneNotSupportedException cloneNotSupportedException) {
                    oooo_0.o00000(cloneNotSupportedException);
                }
            }
        }
        for (I i2 : public_.void()) {
            try {
                if (i2 instanceof public) {
                    this.\u00d200000((public)((public)i2).clone());
                    continue;
                }
                this.\u00d200000((public)this.OO0000.\u00d300000(i2).clone());
            }
            catch (CloneNotSupportedException cloneNotSupportedException) {
                oooo_0.o00000(cloneNotSupportedException);
            }
        }
        for (public public_2 : this.o00000().\u00d500000().o00000().getListe()) {
            if (public_2.float() == null || !public_2.float().contains(public_)) continue;
            public_.o00000(public_2);
            this.o00000().new(public_2);
        }
        if (bl) {
            this.berechneGPKostenNeu();
        }
        if (public_.equals(I.\u00f5\u00d60000)) {
            this.\u00d600000.getSf().resetMoeglicheSF();
        }
    }

    public void berechneGPKostenNeu() {
        this.passeKostenAn(this.getMoeglicheAsMenge(), true);
        this.\u00d600000.getKosten().removeAllKostenEntries(KostenEntry.kostenBereich.\u00f400000);
        this.\u00d2O0000 = 0;
        this.int = 0;
        this.\u00d300000 = 0;
        for (public public_ : this.class) {
            int n = -public_.supersuper();
            if (public_.equals(I.forsupersuper)) {
                n = -6;
            } else if (public_.equals(I.\u00f5\u00d8o000)) {
                n = -3;
            } else if (public_.equals(I.\u00d5\u00d3O000)) {
                n = -2;
            }
            if (this.do.\u00f800000() instanceof BasisMyranorKultur && ((BasisMyranorKultur)this.do.\u00f800000()).isOptimatSelected()) {
                n = -1;
                this.\u00d600000.getKosten().addKosten("Optimat mit magischer Profession", new KostenEntry(KostenEntry.kostenBereich.\u00f400000, KostenArt.int, n, public_));
            } else {
                this.\u00d600000.getKosten().addKosten("Doppelter oder ersetzter Vor-/Nachteil: " + public_.oO0000(), new KostenEntry(KostenEntry.kostenBereich.\u00f400000, KostenArt.int, n, public_));
            }
            this.\u00d2O0000 += n;
        }
        for (public public_ : this.getVorteile()) {
            if (public_ instanceof D) {
                D d2 = (D)public_;
                M m = d2.\u00f5o0000();
                if (m instanceof A && ((A)((Object)m)).O\u00d20000() && public_.supersuper() < 0) {
                    this.int -= public_.supersuper();
                }
            } else if (public_ instanceof A && ((A)((Object)public_)).O\u00d20000() && public_.supersuper() < 0) {
                this.int -= public_.supersuper();
            }
            this.\u00d600000.getKosten().addKosten(public_.oO0000(), new KostenEntry(KostenEntry.kostenBereich.\u00f400000, KostenArt.int, public_.supersuper(), public_));
            if (!public_.\u00d500000() || public_.equals(I.\u00f8\u00f6O000) || public_.supersuper() >= 0) continue;
            this.\u00d300000 -= public_.supersuper();
        }
        this.\u00d600000.fireUpdate();
    }

    public void createMoeglicheVorteile() {
        this.\u00d400000 = this.filtereAlleVorteile(this.\u00d800000);
        this.\u00d400000.o00000(0);
        this.passeKostenAn(this.\u00d400000, true);
        this.\u00f800000 = new KategorienArrayList<public>(){

            @Override
            public int getAnzahlListen() {
                return 2;
            }

            public int o00000(public public_) {
                if (public_.\u00d500000()) {
                    return 1;
                }
                return 0;
            }
        };
        Iterator<public> iterator = this.\u00d400000.\u00d500000();
        while (iterator.hasNext()) {
            public public_ = iterator.next();
            this.\u00f800000.add(public_);
        }
    }

    public Oo0O filtereAlleVorteile(Filter filter) {
        boolean bl;
        Object public_;
        Object object;
        Cloneable cloneable;
        Oo0O oo0O = new Oo0O(this.OO0000, this.do.oO0000());
        Iterator<public> iterator = oo0O.\u00d500000();
        while (iterator.hasNext()) {
            iterator.next().\u00f600000();
        }
        if (!filter.equals((Object)Filter.o00000)) {
            oo0O.o00000(this.do.\u00d500000());
            oo0O.o00000(this.\u00d600000.getBt());
            oo0O.\u00d300000(this.OO0000.\u00d300000(I.\u00d5\u00d3O000));
            oo0O.\u00d300000(this.OO0000.\u00d300000(I.\u00f4\u00d6O000));
        }
        for (I object3 : this.do.\u00f4\u00d20000()) {
            if (oo0O.\u00d400000(object3)) continue;
            cloneable = this.OO0000.\u00d300000(object3);
            oo0O.\u00d300000((public)cloneable);
        }
        if (!filter.equals((Object)Filter.o00000) && !filter.equals((Object)Filter.\u00d200000)) {
            Iterator<OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> bl2 = this.do.newnew();
            while (bl2.hasNext()) {
                cloneable = bl2.next().getUngeeigneteVorteile();
                if (cloneable == null) continue;
                object = ((ArrayList)cloneable).iterator();
                while (object.hasNext()) {
                    public_ = (I)object.next();
                    if (this.do.o00000((I)public_)) continue;
                    oo0O.new((I)public_);
                }
            }
        }
        if (!this.do.o00000(I.\u00f4\u00f6o000)) {
            oo0O.new(I.O\u00d8O000);
            oo0O.new(I.\u00d3\u00f6O000);
        }
        if (this.do.\u00d800000().hatProfession(Lehrmeister.class) != null) {
            oo0O.\u00d300000(this.OO0000.\u00d300000(I.\u00d50\u00d2000));
        }
        if (!filter.equals((Object)Filter.o00000)) {
            if (!this.isAuto(helden.framework.C.K.o00000(I.\u00f50O000))) {
                oo0O.new(I.\u00d5O0000);
            }
            if (!this.do.oo0000()) {
                oo0O.new(I.\u00f8oO000);
                oo0O.new(I.\u00d8\u00f6O000);
                oo0O.new(I.\u00d3\u00d80000);
                oo0O.new(I.while);
                oo0O.new(I.\u00d4Oo000);
                oo0O.new(I.\u00d8o\u00d2000);
                oo0O.new(I.returnStringsuper);
                oo0O.new(I.\u00d5\u00f4O000);
                oo0O.new(I.\u00f400000);
                oo0O.new(I.\u00f8\u00d6o000);
                oo0O.new(I.O\u00d2o000);
                oo0O.new(I.\u00d4o0000);
                oo0O.new(I.\u00f8\u00d6O000);
                oo0O.new(I.\u00f8\u00d5O000);
                oo0O.new(I.\u00f8\u00f5o000);
                oo0O.new(I.O\u00d3O000);
                oo0O.new(I.whileStringsuper);
            } else {
                oo0O.new(I.Stringsuper);
            }
            if (!this.do.o00000(I.forsupersuper) && !this.do.o00000(I.\u00f5\u00d8o000)) {
                oo0O.new(I.o\u00d60000);
                oo0O.new(I.\u00f5\u00f6O000);
                oo0O.new(I.O\u00d6o000);
                oo0O.new(I.o0\u00d2000);
                oo0O.new(I.returnprivate);
                oo0O.new(I.\u00f5\u00f50000);
                oo0O.new(I.privatedo);
                oo0O.new(I.\u00f4\u00d3O000);
                oo0O.new(I.whileString);
                oo0O.new(I.\u00d5\u00f8o000);
                oo0O.new(I.\u00d3\u00d2o000);
                oo0O.new(I.O\u00d4O000);
                oo0O.new(I.o\u00d3o000);
                oo0O.new(I.\u00d8\u00f40000);
                oo0O.new(I.nullint);
            }
            if (!this.\u00d600000.istSpruchzauberer()) {
                oo0O.new(I.O\u00f6O000);
                oo0O.new(I.O\u00d4O000);
                oo0O.new(I.\u00d8oo000);
            }
            if (!(this.do.o\u00d20000() instanceof Achaz) && !this.do.o00000(I.\u00d5\u00f6o000)) {
                oo0O.new(I.\u00d40o000);
            }
            if (this.do.\u00d800000().hatProfession(Magier.class) != null && oo0O.\u00d400000(I.o\u00d3o000)) {
                oo0O.new(I.o\u00d3o000);
            }
            if (this.do.\u00d800000().hatProfession(Schelm.class) != null && oo0O.\u00d400000(I.\u00f5\u00f50000)) {
                oo0O.new(I.\u00f5\u00f50000);
            }
            if (this.do.\u00d800000().hatProfession(Magier.class) == null && this.do.\u00d800000().hatProfession(Hexe.class) == null && this.do.\u00d800000().hatProfession(Kristallomant.class) == null && this.do.\u00d800000().hatProfession(Scharlatan.class) == null) {
                oo0O.new(I.\u00d3\u00f4O000);
            }
            if (this.do.\u00d800000().hatProfession(Hexe.class) == null || this.do.\u00d300000().equals((Object)Geschlecht.\u00d400000)) {
                oo0O.new(I.\u00f4\u00d6O000);
            }
            if (!this.do.o00000(I.\u00d5\u00d3O000) && !(this.do.o\u00d20000() instanceof Grolm)) {
                oo0O.new(I.\u00f5\u00f4o000);
            }
            if (!this.do.o00000(I.\u00d5\u00d3O000)) {
                oo0O.new(I.\u00d8O0000);
                oo0O.new(I.\u00f8\u00f6O000);
            }
            if (this.do.newString() || this.do.\u00d800000().hatProfession(Druide.class) != null || this.do.\u00d800000().hatProfession(helden.model.DDZprofessionen.Druide.class) != null) {
                oo0O.new(I.\u00d3\u00d80000);
            }
            if (!this.do.oo0000() || !(this.do.o\u00d20000() instanceof Nivese) && !(this.do.o\u00d20000() instanceof Halbelf)) {
                oo0O.new(I.nullfloat);
            }
            if (!(this.do.o\u00d20000() instanceof Halbelf)) {
                oo0O.new(I.nullpublic);
            }
            if (this.do.\u00d800000().hatProfession(Schamane.class) == null) {
                oo0O.new(I.o\u00f50000);
                oo0O.new(I.\u00d4oO000);
            }
            if (this.do.\u00d800000().hatProfession(Hexe.class) == null && !this.do.newString() && this.do.\u00d800000().hatProfession(GoblinSchamane.class) == null && this.do.\u00d800000().hatProfession(Zibilja.class) == null) {
                oo0O.new(I.\u00d4o0000);
                oo0O.new(I.\u00f4\u00d60000);
            }
            if (this.do.o00000(b_0.\u00f4\u00f4\u00d2000) < 14) {
                oo0O.new(I.whilereturnsuper);
            }
            if (this.do.o00000(b_0.\u00f5\u00f5\u00d2000) < 7) {
                oo0O.new(I.whilethissuper);
                oo0O.new(I.whilenewsuper);
                oo0O.new(I.\u00d5\u00f6O000);
                oo0O.new(I.\u00d30o000);
            }
            if (this.do.o00000(b_0.\u00f5\u00f5\u00d2000) > 7) {
                oo0O.new(I.\u00f4oO000);
            }
            if (this.do.o00000(b_0.\u00f5\u00f5\u00d2000) > 8) {
                oo0O.new(I.\u00f4\u00f8o000);
            }
            if (this.do.o00000(b_0.\u00f5\u00f5\u00d2000) > 3) {
                oo0O.new(I.\u00f8oo000);
            }
            if (!oo0O.\u00d400000(I.\u00d8Oo000)) {
                oo0O.new(I.O\u00f5o000);
            }
        }
        oo0O.new(I.O\u00f60000);
        oo0O.new(I.O\u00f8o000);
        oo0O.new(I.O\u00d4o000);
        if (this.do.o\u00d50000() || this.do.o\u00d20000() instanceof Zwerg) {
            oo0O.new(I.\u00d3\u00d60000);
        }
        if (!this.do.\u00d8\u00d20000()) {
            oo0O.new(I.\u00d3oo000);
        }
        if (!this.do.o\u00d50000()) {
            oo0O.new(I.whilewhile);
            oo0O.new(I.\u00f5\u00d80000);
        }
        if (this.do.o\u00d50000() && oo0O.\u00d400000(I.\u00d3\u00f50000)) {
            oo0O.new(I.\u00d3\u00f50000);
        }
        if (!this.do.o\u00d50000() && oo0O.\u00d400000(I.whilewhile)) {
            oo0O.new(I.whilewhile);
        }
        if (this.do.o00000(I.forsupersuper) || this.do.o00000(I.\u00f5\u00d8o000)) {
            oo0O.new(I.\u00d5\u00d3O000);
        }
        boolean bl3 = bl = this.isRKPAuto(I.forsupersuper) || this.isRKPAuto(I.\u00f5\u00d8o000) || this.isRKPAuto(I.\u00d5\u00d3O000);
        if (bl && oo0O.\u00d400000(I.\u00d8\u00f4O000)) {
            oo0O.new(I.\u00d8\u00f4O000);
        }
        if (!bl && oo0O.\u00d400000(I.forObjectsuper)) {
            oo0O.new(I.forObjectsuper);
        }
        if (this.\u00d3O0000.hatSetting(Setting.\u00f600000)) {
            if (bl) {
                oo0O.new(I.forclass);
            } else {
                oo0O.new(I.Stringclasssuper);
            }
            if (this.isRKPAuto(I.\u00f8O\u00d2000)) {
                oo0O.new(I.\u00d5\u00f50000);
                oo0O.new(I.O\u00d20000);
                oo0O.new(I.\u00f50\u00d2000);
                oo0O.new(I.o\u00f6o000);
            } else if (this.isRKPAuto(I.\u00f8\u00f6o000)) {
                oo0O.new(I.O\u00d20000);
                oo0O.new(I.\u00f50\u00d2000);
                oo0O.new(I.o\u00f6o000);
            } else if (this.isRKPAuto(I.O\u00d20000)) {
                oo0O.new(I.\u00f8O\u00d2000);
                oo0O.new(I.\u00f8\u00f6o000);
                oo0O.new(I.o\u00f6o000);
            } else if (this.isRKPAuto(I.\u00f50\u00d2000)) {
                oo0O.new(I.\u00f8O\u00d2000);
                oo0O.new(I.\u00f8\u00f6o000);
                oo0O.new(I.\u00d5\u00f50000);
            } else if (this.isRKPAuto(I.o\u00f6o000)) {
                oo0O.new(I.\u00f50\u00d2000);
                oo0O.new(I.o\u00f6o000);
            } else {
                oo0O.new(I.\u00f8O\u00d2000);
                oo0O.new(I.\u00f50\u00d2000);
                oo0O.new(I.o\u00f6o000);
            }
        }
        if (oo0O.\u00d400000(I.forpublic) && this.isAuto(oo0O.\u00d300000(I.forpublic))) {
            cloneable = (helden.framework.C.J)oo0O.\u00d300000(I.forpublic);
            ((helden.framework.C.J)cloneable).\u00f400000(2);
        }
        if (oo0O.\u00d400000(I.\u00d8O0000)) {
            cloneable = ZauberFabrik.getInstance().getUebernatuerlicheZauber(this.do);
            if (cloneable != null && ((ArrayList)cloneable).size() > 0) {
                object = (M)oo0O.\u00d300000(I.\u00d8O0000);
                ((M)object).o00000(new TreeMap());
                public_ = ((ArrayList)cloneable).iterator();
                while (public_.hasNext()) {
                    KonkreterZauber konkreterZauber = KonkreterZauber.getZauber(((Zauber)public_.next()).toString(), helden.framework.OOoO.K.\u00d400000, "");
                    if (((private)object).\u00d5o0000().contains(konkreterZauber)) continue;
                    ((private)object).o00000(konkreterZauber, 1);
                }
            } else {
                oo0O.new(I.\u00d8O0000);
            }
        }
        cloneable = b_0.\u00d4\u00d60000();
        while (cloneable.hasNext()) {
            object = (b_0)cloneable.next();
            if (object.equals(b_0.\u00f5\u00f5\u00d2000)) continue;
            int n = this.do.\u00d3\u00d30000().\u00d200000(object);
            if (n < this.\u00d600000.getMaxeigenschaft() || this.do.o00000(I.\u00d3\u00d3O000) && (object.equals(b_0.\u00f4\u00f4\u00d2000) || object.equals(b_0.privatedosuper) || object.equals(b_0.returnwhilesuper))) {
                oo0O.o00000("Herausragende Eigenschaft: " + object);
            }
            if ((n = this.do.\u00d3\u00d30000().\u00d200000(object)) <= 8) continue;
            oo0O.o00000("Miserable Eigenschaft: " + object);
        }
        oo0O.new(I.oO\u00d2000);
        oo0O.new(I.returnreturn);
        oo0O.new(I.\u00d3\u00d4O000);
        oo0O.new(I.privateinterface);
        oo0O.new(I.o0o000);
        oo0O.new(I.\u00d3\u00d8O000);
        oo0O.new(I.\u00f5\u00d2o000);
        oo0O.new(I.returnthissuper);
        oo0O.new(I.\u00f5\u00d3o000);
        oo0O.new(I.newnewsuper);
        oo0O.new(I.Stringpublic);
        oo0O.new(I.\u00d8\u00f5O000);
        oo0O.new(I.\u00f8\u00d8o000);
        oo0O.new(I.\u00f8\u00f50000);
        oo0O.new(I.\u00d8\u00d5o000);
        oo0O.new(I.ooo000);
        oo0O.new(I.O\u00d8o000);
        oo0O.new(I.O\u00d50000);
        oo0O.new(I.fordo);
        object = oo0O.\u00d500000();
        while (object.hasNext()) {
            public public_2 = object.next();
            if (!(public_2 instanceof M)) continue;
            ((M)public_2).\u00d500000(1);
        }
        return oo0O;
    }

    public ArrayList<I> getEmpfohlen() {
        return this.super;
    }

    public int getGPausDoppeltenVorteilen() {
        return this.\u00d2O0000;
    }

    public int getGPNachteile() {
        return this.\u00d300000;
    }

    public int getGPSchlechteEigenschaften() {
        return this.int;
    }

    public int getMaxGPNachteile() {
        if (this.\u00d600000.getHswVorteile().getGPausDoppeltenVorteilen() > 0) {
            return 50 + this.\u00d600000.getHswVorteile().getGPausDoppeltenVorteilen();
        }
        return 50;
    }

    public int getMaxGPSchlechteEigenschaften() {
        if (this.\u00d600000.getHswVorteile().getGPausDoppeltenVorteilen() > 0) {
            return 30 + this.\u00d600000.getHswVorteile().getGPausDoppeltenVorteilen();
        }
        return 30;
    }

    public int getMinimalWert(helden.framework.C.J j2) {
        return j2.o\u00d50000();
    }

    public KategorienArrayList<public> getMoegliche() {
        return this.\u00f800000;
    }

    public Oo0O getMoeglicheAsMenge() {
        if (this.\u00d400000 == null) {
            this.createMoeglicheVorteile();
        }
        return this.\u00d400000;
    }

    public ArrayList<I> getUngeeignet() {
        return this.\u00f400000;
    }

    public ArrayList<public> getVorteile() {
        return this.do.\u00d500000().o00000().getListe();
    }

    public String getVorteilsBemerkung(public public_) {
        String string;
        if (public_ instanceof D) {
            D d2 = (D)public_;
            string = d2.\u00f5o0000().\u00f6O0000();
        } else {
            string = public_.\u00f6O0000();
        }
        return string;
    }

    public void init(K k2) {
        public public_2;
        Object object;
        oooo_0.o00000();
        this.\u00f800000 = null;
        K k3 = this.o00000();
        if (k3 != null && k3.\u00d500000() != null) {
            k3.\u00d500000().\u00f400000();
        }
        this.class = new ArrayList();
        this.setHeld(k2);
        this.\u00d4O0000 = new Oo0O();
        this.o00000().\u00d4\u00d20000().\u00d2\u00d3O000();
        ArrayList<I> arrayList = this.o00000().\u00d4O0000().getEntfernteKutlurVorteile();
        ArrayList<I> arrayList2 = new ArrayList<I>();
        if (this.\u00d600000.isZwergMitVollzaubererDerKeinGeodeWerdenWill()) {
            arrayList.add(I.Stringsuper);
            object = (helden.framework.C.J)helden.framework.C.K.o00000(I.whilenull);
            ((helden.framework.C.J)object).oO0000(3);
            this.addAutomatischerVorteil((public)object);
            this.addAutomatischerVorteil(helden.framework.C.K.o00000(I.\u00d3\u00d80000));
        }
        object = this.o00000().newnew();
        while (object.hasNext()) {
            OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = (OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object.next();
            if (ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 instanceof OooO || ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 instanceof o0oo_0) {
                this.o00000(ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, arrayList);
                continue;
            }
            this.o00000(ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, arrayList2);
        }
        if (this.o00000().\u00d800000().\u00d200000(String._o.\u00d500000) > 0) {
            this.o00000(this.o00000().\u00d800000().\u00d500000(String._o.\u00d500000), new ArrayList<I>());
            this.addAutomatischerVorteil(helden.framework.C.K.o00000(I.O\u00f60000));
        }
        if (this.o00000().\u00d800000().\u00d200000(String._o.String) > 0) {
            this.addAutomatischerVorteil(helden.framework.C.K.o00000(I.O\u00f8o000));
        }
        for (public object2 : this.o00000().\u00d500000().o00000().getListe()) {
            if (object2 instanceof helden.framework.C.J) {
                ((helden.framework.C.J)object2).interfaceObject();
            }
            if (!(object2 instanceof void)) continue;
            public_2 = (void)object2;
            ((void)public_2).\u00f5\u00d50000();
        }
        if (k3 != null) {
            for (int i2 = 0; i2 < 2; ++i2) {
                block3: for (public public_2 : k3.\u00d500000().o00000().getListe()) {
                    public public_3;
                    if (i2 == 0 && public_2.void().size() == 0 || i2 == 1 && public_2.void().size() > 0) continue;
                    if (!this.isAuto(public_2) && !this.do.o00000(public_2)) {
                        this.addVorteil(this.liefereAktuelleInstanz(public_2), false);
                    }
                    if (public_2 instanceof helden.framework.C.J && this.o00000().o00000(public_2)) {
                        int n = ((helden.framework.C.J)public_2).ObjectString();
                        public_3 = (helden.framework.C.J)this.o00000().\u00d500000().\u00d300000((I)public_2);
                        ((helden.framework.C.J)public_3).oO0000(n);
                    }
                    if (!(public_2 instanceof void) || !this.isAuto(public_2)) continue;
                    R r = (R)((void)public_2).\u00f4o0000();
                    public_3 = (o0OO)this.o00000().\u00d500000().\u00d300000((I)public_2);
                    for (R r2 : ((private)public_3).intsuper()) {
                        if (!r.o00000(1).equals(r2.o00000(1)) || r.o00000(0).equals(r2.o00000(0))) continue;
                        ((M)public_3).\u00d500000(r2);
                        ((helden.framework.C.A)public_3).o00000(r2.o00000(0, r.o00000(0)));
                        continue block3;
                    }
                }
            }
        }
        this.do.\u00d500000().\u00f400000();
        this.createMoeglicheVorteile();
        this.\u00f800000.clearExclude();
        for (public public_4 : this.o00000().\u00d500000().o00000().getListe()) {
            if (public_4.\u00f4O0000().equals(I.OOo000)) {
                public_2 = (D)public_4;
                helden.framework.E.F f2 = O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d400000().o00000(thissuper.o00000((o0Oo)((D)public_2).\u00f4o0000()));
                this.do.\u00d8o0000().new(f2);
            }
            if (public_4 instanceof D) continue;
            this.\u00f800000.addExclude(public_4);
        }
        this.berechneGPKostenNeu();
        this.super = this.do.\u00f4\u00d20000();
        this.\u00f400000 = this.do.\u00d3\u00d20000();
        oooo_0.\u00d300000();
    }

    public boolean isAuto(public public_) {
        if (public_ instanceof M) {
            M m = (M)public_;
            if (m.\u00d2\u00d20000() != 1) {
                helden.framework.held.Object.private.\u00d200000("MehrAuswahlVorteil in isAuto " + public_.oO0000(), "alle");
            }
            return this.isAuto(m.\u00d200000(true).get(0));
        }
        if (public_ instanceof void) {
            void void_ = (void)public_;
            for (public public_2 : this.\u00d4O0000.o00000().getListe()) {
                if (!(public_2 instanceof void)) continue;
                void void_2 = (void)public_2;
                if (!void_.\u00f4O0000().equals(void_2.\u00f4O0000())) continue;
                R r = (R)void_.\u00f4o0000();
                R r2 = (R)void_2.\u00f4o0000();
                if (!r.o00000(1).equals(r2.o00000(1))) continue;
                return true;
            }
            return false;
        }
        if (public_ instanceof D) {
            D d2 = (D)public_;
            for (public public_3 : this.\u00d4O0000.o00000().getListe()) {
                if (!(public_3 instanceof D)) continue;
                D d3 = (D)public_3;
                if (!d2.\u00f4O0000().equals(d3.\u00f4O0000()) || d2.\u00f4o0000() == null || !d2.\u00f4o0000().equals(d3.\u00f4o0000())) continue;
                return true;
            }
            return false;
        }
        return this.\u00d4O0000.o00000(public_);
    }

    public boolean isRKPAuto(I i2) {
        ArrayList<OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> arrayList = new ArrayList<OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO>();
        if (this.do.o\u00d20000() != null) {
            arrayList.add(this.do.o\u00d20000());
        }
        if (this.do.\u00f800000() != null) {
            arrayList.add(this.do.\u00f800000());
        }
        if (this.do.\u00d800000().Object(String._o.\u00d300000).size() > 0) {
            arrayList.add(this.do.\u00d800000());
        }
        for (OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 : arrayList) {
            if (!ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.getVorteile().\u00d400000(i2)) continue;
            return true;
        }
        return false;
    }

    public public liefereAktuelleInstanz(public public_) {
        public public_2 = this.OO0000.\u00d300000((I)public_);
        if (public_ instanceof helden.framework.C.J) {
            ((helden.framework.C.J)public_2).oO0000(((helden.framework.C.J)public_).ObjectString());
        } else if (public_ instanceof D) {
            try {
                if (public_2 instanceof helden.framework.C.A) {
                    helden.framework.C.A a2 = (helden.framework.C.A)public_2;
                    a2.\u00d2o0000();
                    R r = (R)((D)public_).\u00f4o0000();
                    a2.o00000(r);
                    public_2 = a2.\u00d200000(true).get(0);
                } else if (public_2 instanceof M) {
                    M m = (M)public_2;
                    m.\u00d2o0000();
                    m.o00000(((D)public_).\u00f4o0000());
                    public_2 = m.\u00d200000(true).get(0);
                } else {
                    ((D)public_2).o00000(((D)public_).\u00f4o0000());
                    public_2 = (public)public_2.clone();
                }
            }
            catch (Exception exception) {
                helden.framework.held.Object.private.\u00d200000("Cannot clone " + public_.toString() + ": " + exception.toString(), "alle");
                exception.printStackTrace();
                Thread.dumpStack();
            }
        }
        return public_2;
    }

    public boolean needRecalc(public public_) {
        return public_.toString().equals(I.\u00d5\u00d3O000.toString()) || public_.toString().equals(I.\u00d8\u00f4O000.toString()) || public_.toString().equals(I.forObjectsuper.toString()) || public_.toString().equals(I.\u00f4\u00d6O000.toString()) || public_.toString().equals(I.whilewhile.toString()) || public_.toString().equals(I.\u00d4oo000.toString()) || public_.toString().equals(I.\u00d5o\u00d2000.toString()) || public_.equals(I.\u00d5\u00d6O000.toString()) || public_.toString().equals(I.whilethissuper.toString()) || public_.equals(I.\u00d5\u00f6O000.toString()) || public_.toString().equals(I.\u00d30o000.toString()) || public_.equals(I.\u00f4O\u00d2000.toString()) || public_.toString().equals(I.\u00d3\u00d3O000.toString()) || public_.\u00f4O0000().toString().equals(I.\u00f5\u00d60000.toString()) || public_.toString().startsWith("Miserable Eigenschaft: ") || public_.toString().startsWith("Herausragende Eigenschaft: ") || public_.toString().startsWith("\u00dcbernat\u00fcrliche Begabung") || public_.toString().equals(I.Stringclasssuper.toString()) || public_.toString().equals(I.\u00d3\u00d5o000.toString()) || public_.void().size() > 0;
    }

    public void passeKostenAn(Oo0O oo0O, boolean bl) {
        boolean bl2;
        SortedMap sortedMap;
        boolean bl3;
        Comparable<Object> comparable;
        Object object;
        Object object2;
        Object object4;
        Iterator<public> iterator = oo0O.\u00d500000();
        int n = 0;
        int n2 = 0;
        while (iterator.hasNext()) {
            object4 = iterator.next();
            ((public)object4).\u00f600000();
            if (((public)object4).o00000(this.\u00d600000.getBt()) != null) {
                for (oO0O<P, AbstraktBedingung, Integer> object32 : ((public)object4).o00000(this.\u00d600000.getBt())) {
                    if (!this.\u00d600000.getSf().isRKPAuto(this.do, object32.\u00d300000())) continue;
                    ((public)object4).o00000(((public)object4).supersuper() - object32.o00000());
                }
            }
            if (object4 instanceof M) {
                ++n;
                continue;
            }
            ++n2;
        }
        if (n > 0) {
            helden.framework.held.Object.private.\u00d200000("WARNUNG! passeKosten an MAV: " + n + " AV: " + n2, "alle");
        }
        if (oo0O.\u00d400000(I.\u00d8\u00f6O000) && this.\u00d600000.getSf().getMoeglicheSonderfertigkeiten() != null) {
            object4 = this.\u00d600000.getSf().getMoeglicheSonderfertigkeiten();
            D d2 = (D)oo0O.\u00d300000(I.\u00d8\u00f6O000);
            ArrayList arrayList = new ArrayList(d2.\u00d6o0000().keySet());
            object2 = arrayList.iterator();
            while (object2.hasNext()) {
                object = (P)object2.next();
                if (object instanceof F || !((OOOo)object4).\u00d200000(((P)object).toString())) continue;
                comparable = ((OOOo)object4).o00000(((P)object).toString());
                bl3 = false;
                if (((P)comparable).\u00d8o0000() != null) {
                    for (String string : ((P)comparable).\u00d8o0000()) {
                        if (!string.contains("BEGABUNG F\u00dcR RITUAL")) continue;
                        bl3 = true;
                    }
                }
                sortedMap = HeldenMath.durchFuenfzig(((P)comparable).o\u00d20000());
                if (bl3) {
                    sortedMap = HeldenMath.durchFuenfzig(((P)comparable).o\u00d20000() * 2);
                }
                if (((P)comparable).o\u00d20000() > 0 && (Integer)((Object)sortedMap) == 0) {
                    sortedMap = 1;
                }
                d2.\u00d6o0000().put(object, (Integer)((Object)sortedMap));
            }
        }
        int n3 = Math.max(7, this.do.\u00d4O0000().getMinimalEigenschaftswert(b_0.\u00f5\u00f5\u00d2000));
        if (oo0O.\u00d400000(I.\u00f40O000) && this.do.o00000(b_0.\u00f5\u00f5\u00d2000) > n3) {
            int n4 = this.do.o00000(b_0.\u00f5\u00f5\u00d2000);
            this.setGP(oo0O, I.\u00f40O000, -7 + n4 - n3);
        }
        if ((this.do.o\u00d50000() || this.do.\u00d800000().hatProfession(Kristallomant.class) != null) && oo0O.\u00d400000(I.O\u00f6O000)) {
            helden.framework.C.J j2 = (helden.framework.C.J)oo0O.\u00d300000(I.O\u00f6O000);
            j2.\u00d2O0000(2);
        }
        if (this.do.o00000(I.\u00d4\u00f80000) || this.do.o00000(I.\u00d4\u00f80000)) {
            this.setGP(oo0O, I.\u00d4\u00f4o000, -10);
        }
        if (!this.do.oo0000()) {
            this.setGP(oo0O, I.thisintsuper, 2);
        }
        if (oo0O.\u00d400000(I.o\u00f60000)) {
            int n5 = 2;
            if (this.do.oo0000()) {
                n5 = 5;
            }
            D d3 = (D)oo0O.\u00d300000(I.o\u00f60000);
            object2 = d3.\u00d5o0000().iterator();
            while (object2.hasNext()) {
                object = (R)object2.next();
                comparable = (Integer)((R)object).o00000(1);
                d3.\u00d200000(object, (Integer)comparable * n5);
            }
        }
        if (this.do.o00000(I.\u00d5\u00d3O000)) {
            this.setGP(oo0O, I.\u00f8\u00d6o000, -5);
        }
        if (oo0O.\u00d400000(I.forpublic) && this.isAuto(oo0O.\u00d300000(I.forpublic))) {
            helden.framework.C.J j3 = (helden.framework.C.J)oo0O.\u00d300000(I.forpublic);
            j3.\u00f400000(2);
        }
        if (this.do.\u00d3O0000() || this.do.\u00d8\u00d20000() || this.do.\u00d800000().hatProfession(Schamane.class) != null) {
            this.setGP(oo0O, I.\u00d4\u00d5o000, 12);
        } else if (this.\u00d3O0000.hatSetting(Setting.\u00f600000)) {
            this.setGP(oo0O, I.OO\u00d2000, 20);
        }
        if (oo0O.\u00d400000(I.\u00d50O000) && !this.do.oo0000() && !this.do.\u00d8\u00d20000()) {
            this.setGP(oo0O, I.\u00d50O000, 3);
        }
        if (this.do.o00000(I.\u00f5\u00d8o000)) {
            this.setGP(oo0O, I.while, 3);
        }
        if (this.do.o00000(I.forsupersuper)) {
            this.setGP(oo0O, I.while, 5);
        }
        if (this.do.oO0000().getHauptSetting().equals((Object)Setting.\u00f8O0000)) {
            if (oo0O.\u00d400000(I.\u00f5\u00f40000)) {
                helden.framework.C.J j4 = (helden.framework.C.J)oo0O.\u00d300000(I.\u00f5\u00f40000);
                j4.\u00d2O0000(2);
            }
            if (oo0O.\u00d400000(I.\u00f8oO000)) {
                helden.framework.C.J j5 = (helden.framework.C.J)oo0O.\u00d300000(I.\u00f8oO000);
                j5.\u00d2O0000(2);
            }
            if (oo0O.\u00d400000(I.\u00f8\u00f5o000)) {
                helden.framework.C.J j6 = (helden.framework.C.J)oo0O.\u00d300000(I.\u00d8\u00f50000);
                j6.\u00d2O0000(2);
            }
            this.setGP(oo0O, I.\u00f8\u00d6o000, -5);
        }
        if (this.do.new(while.StringwhileString.toString()) || this.do.new(while.\u00f8O\u00f6000.toString()) || this.do.new(while.thisnewnew.toString()) || this.do.new(while.o\u00d3\u00d2000.toString())) {
            this.setGP(oo0O, I.newreturnsuper, -15);
        }
        for (public public_ : this.\u00d4O0000.o00000().getListe()) {
            if (public_.float() == null || !oo0O.\u00d400000(public_.float().get(0)) || this.isAuto((public)(object2 = oo0O.\u00d300000(public_.float().get(0))))) continue;
            object = oo0O.\u00d300000((I)public_);
            ((public)object2).o00000(((public)object2).supersuper() - ((public)object).supersuper());
        }
        if (oo0O.\u00d400000(I.\u00d8\u00f60000)) {
            helden.framework.C.J j7 = (helden.framework.C.J)oo0O.\u00d300000(I.\u00d8\u00f60000);
            if (this.do.o00000(I.\u00d4oo000)) {
                j7.OO0000(5);
            }
            j7.\u00f4\u00d40000();
        }
        boolean bl4 = bl2 = this.do.o00000(I.\u00d5\u00d6O000) || this.do.o00000(I.\u00f4O\u00d2000) || this.do.o00000(I.whilethissuper) || this.do.o00000(I.\u00d5\u00f6O000) || this.do.o00000(I.\u00d30o000) || this.do.o00000(I.forclass) || this.do.o00000(I.Stringclasssuper) || this.do.o00000(I.\u00d4\u00d2O000) || this.do.o00000(I.\u00d3\u00d5o000);
        if (oo0O.\u00d400000(I.\u00f4O0000)) {
            Iterator<String> iterator2 = this.do.\u00d800000().getBesondererBesitzMoeglichkeiten().iterator();
            object2 = (D)oo0O.\u00d300000(I.\u00f4O0000);
            if (iterator2 != null && iterator2.hasNext()) {
                while (iterator2.hasNext()) {
                    ((private)object2).o00000(iterator2.next(), (int)new Integer(7));
                }
            }
            ((D)object2).OO0000();
            int n4 = 7;
            int n5 = 0;
            if (this.do.o00000(I.whilethissuper) || this.do.o00000(I.\u00d30o000)) {
                n5 = 1;
            }
            boolean bl5 = bl3 = this.\u00d600000.isBGB() || this.\u00d600000.isVeteran();
            if (bl2 && bl3) {
                n4 = 2;
            } else if (bl2) {
                n4 = 3;
            } else if (bl3) {
                n4 = 5;
            }
            sortedMap = ((private)object2).\u00d6o0000();
            TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
            for (String string : sortedMap.keySet()) {
                Integer n6 = (Integer)sortedMap.get(string);
                int n7 = n6 / 7;
                treeMap.put(string, (n7 - n5) * n4);
            }
            ((D)object2).o00000(treeMap);
        }
        if (oo0O.\u00d400000(I.\u00d5o\u00d2000)) {
            helden.framework.C.J j2 = (helden.framework.C.J)oo0O.\u00d300000(I.\u00d5o\u00d2000);
            j2.\u00f400000(this.do.o00000(b_0.\u00f5\u00f5\u00d2000));
        }
        if (this.do.oO0000().getHauptSetting().equals((Object)Setting.\u00f600000)) {
            this.setGP(oo0O, I.\u00f50\u00d2000, -8);
            this.setGP(oo0O, I.\u00d5\u00f4O000, 5);
        }
        if (bl) {
            this.\u00d200000(oo0O);
        }
    }

    public ArrayList<Hinweis> pruefe() {
        Object object6;
        Object object2;
        Object object3;
        OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO222;
        ArrayList<Hinweis> arrayList = new ArrayList<Hinweis>();
        if (this.getGPNachteile() > this.getMaxGPNachteile()) {
            arrayList.add(new Hinweis("Zuviele GPs in Nachteilen"));
        }
        if (this.getGPSchlechteEigenschaften() > this.getMaxGPSchlechteEigenschaften()) {
            arrayList.add(new Hinweis("Zuviele GPs in schlechten Eigenschaften"));
        }
        if (!(!this.o00000().\u00f800000().adeligVoraussetzung() && !this.o00000().\u00d4O0000().adeligVoraussetzung() || this.o00000().\u00d500000().\u00d400000(I.\u00d5\u00d6O000) || this.o00000().\u00d500000().\u00d400000(I.whilethissuper) || this.o00000().\u00d500000().\u00d400000(I.\u00f4O\u00d2000) || this.o00000().\u00d500000().\u00d400000(I.oo0000) || this.o00000().\u00d500000().\u00d400000(I.\u00d5\u00f6O000) || this.o00000().\u00d500000().\u00d400000(I.\u00d30o000))) {
            arrayList.add(new Hinweis("Kultur oder Profession erfordert den Vorteil Adelig"));
        }
        floatsuper floatsuper2 = new floatsuper(this.do);
        for (OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO222 : this.do.StringObject()) {
            BedingungsVerknuepfung bedingungsVerknuepfung = ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO222.getNotwendigeVoraussetzungen();
            if (floatsuper2.Object(bedingungsVerknuepfung)) continue;
            arrayList.add(new Hinweis("Voraussetzungen f\u00fcr " + ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO222.toString() + " nicht erf\u00fcllt:\n" + bedingungsVerknuepfung.toStringFormatiert()));
        }
        super super_ = this.do.\u00d800000().Object(String._o.\u00d300000).get(0);
        if (super_.getClass().equals(Krieger.class) && super_.istVariante(((Krieger)super_).getNeersand()) && !this.do.o00000(I.\u00d5\u00d6O000) && !this.do.o00000(I.whilethissuper) && !this.do.o00000(I.\u00d5\u00f6O000) && !this.do.o00000(I.\u00d30o000)) {
            arrayList.add(new Hinweis("Ein Krieger aus Neersand muss adlig sein."));
        }
        if (((ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO222 = this.do.\u00f800000()).getClass().equals(Darna.class) || ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO222.getClass().equals(Dschungelstaemme.class) || ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO222.getClass().equals(VerloreneStaemme.class) || ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO222.getClass().equals(WaldinselUtulus.class) || ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO222.getClass().equals(Miniwatu.class) || ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO222.getClass().equals(Tocamuyac.class) || ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO222.getClass().equals(Trollzacken.class)) && this.do.o00000(I.\u00d8\u00f8O000) && ((private)(object3 = (M)this.do.\u00d500000().\u00d300000(I.\u00d8\u00f8O000))).intsuper().contains(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.OO0000.toString())) {
            arrayList.add(new Hinweis("Unf\u00e4higkeit f\u00fcr Natur ungeeignet f\u00fcr Natur-Kulturen"));
        }
        if (this.do.\u00d800000().Object(String._o.\u00d500000).size() > 0 && (((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)(object3 = this.do.\u00d800000().Object(String._o.\u00d500000).get(0))).getVorteile().\u00d400000(I.ifprivate) || ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object3).getVorteile().\u00d400000(I.\u00d3\u00d3o000) || ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object3).getVorteile().\u00d400000(I.o\u00d6o000) || ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object3).getVorteile().\u00d400000(I.\u00d50\u00d2000))) {
            arrayList.add(new Hinweis("Regel-Interpretation: Die in der zweiten Profession enthaltene Akademische Ausbildung gibt keine Steigerungserleichterung.", Hinweis.HinweisArt.Object));
        }
        if (this.do.o00000(I.\u00d4\u00d80000)) {
            boolean bl;
            boolean bl2 = bl = this.do.o00000(while.oo\u00f6000) || this.do.o00000(while.\u00d30\u00f5000) || this.do.o00000(while.\u00d8\u00d2\u00d8000);
            if (!bl) {
                arrayList.add(new Hinweis("Bedingungen f\u00fcr Morguaiverfall nicht erf\u00fcllt."));
            }
        }
        if (this.do.\u00d500000().\u00d400000(I.whilereturnsuper) && this.do.\u00d500000().\u00d300000("Herausragende Eigenschaft: " + b_0.privatedosuper)) {
            arrayList.add(new Hinweis("Schlangemensch und Herausragende Eigenschaft: " + b_0.privatedosuper));
        }
        String string = "";
        for (public public_ : this.getVorteile()) {
            boolean bl;
            if (this.o00000(public_)) {
                arrayList.add(new Hinweis("Vorteil/Nachteil " + public_.toString() + " ist ungeeignet.", Hinweis.HinweisArt.\u00d200000));
            }
            boolean bl3 = bl = !this.getMoegliche().getListe().contains(public_) && !this.isAuto(public_);
            if (bl && public_ instanceof D) {
                object2 = (D)public_;
                for (public public_2 : this.getMoegliche().getListe()) {
                    if (!(public_2 instanceof D) || !((public)(object6 = (D)public_2)).\u00f4O0000().equals(((public)object2).\u00f4O0000())) continue;
                    if (((D)object6).interfacesuper()) {
                        bl = false;
                        continue;
                    }
                    if (!((private)object6).\u00d5o0000().contains(((D)object2).\u00f4o0000())) continue;
                    bl = false;
                }
            }
            if (!bl) continue;
            arrayList.add(new Hinweis("Bedingungen f\u00fcr '" + public_.toString() + "' nicht mehr erf\u00fcllt."));
        }
        Iterator<public> iterator = this.do.\u00d500000().\u00d500000();
        while (iterator.hasNext()) {
            o00O[] o00OArray;
            List<I> list;
            public public_;
            public_ = iterator.next();
            if (public_ instanceof M && !this.o00000((M)public_, arrayList)) continue;
            if (public_.equals(I.\u00d5o0000) && (((M)public_).\u00f400000(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d8O0000.toString()) || ((M)public_).\u00f400000(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.super.toString())) && this.do.o00000(I.\u00f4\u00f5o000)) {
                arrayList.add(new Hinweis("Der Vorteil Begabung f\u00fcr Talentgruppe Wissen oder Handwerk\nund der Nachteil Unstet darf nicht gleichzeitig  gew\u00e4hlt werden"));
            }
            if ((list = public_.float()) != null && this.do.o00000(list)) {
                object2 = "vorteil";
                if (public_.\u00d500000()) {
                    object2 = "nachteil";
                }
                arrayList.add(new Hinweis("Der Basis" + (String)object2 + " " + public_.toString() + " kann nicht gleichzeitig\nmit seiner " + "Erweiterung " + list.toString() + " gew\u00e4hlt werden"));
            }
            for (I i2 : public_.\u00f5O0000()) {
                if (!this.do.o00000(i2)) continue;
                arrayList.add(new Hinweis(public_.toString() + " und " + i2.toString() + "\nd\u00fcrfen nicht gleichzeitig gew\u00e4hlt werden."));
            }
            if (public_.equals(I.ifif) && this.do.o00000(I.O\u00d40000)) {
                M m = (M)public_;
                M m2 = (M)this.do.\u00d500000().\u00d300000(I.O\u00d40000);
                object6 = m.intsuper().iterator();
                while (object6.hasNext()) {
                    if (!m2.\u00f400000(object6.next())) continue;
                    arrayList.add(new Hinweis(m.oO0000() + " und\n " + m2.oO0000() + "\nd\u00fcrfen nicht gleichzeitig gew\u00e4hlt " + "werden."));
                }
            }
            if (public_.equals(I.\u00d5o0000) && this.do.o00000(I.\u00f4\u00d20000)) {
                M m = (M)public_;
                M m3 = (M)this.do.\u00d500000().\u00d300000(I.\u00f4\u00d20000);
                for (Object object4 : m.intsuper()) {
                    o00OArray = oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.o00000((String)object4);
                    for (oo0o_0 oo0o_02 : m3.intsuper()) {
                        if (!oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.o00000((oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1)o00OArray, oo0o_02)) continue;
                        arrayList.add(new Hinweis("Begabung f\u00fcr ein Talent und eine Talentgruppe geht nur,\nwenn das Talent aus einer anderen Gruppe stammt.\n" + oo0o_02 + "/" + o00OArray));
                    }
                }
            }
            if (public_.equals(I.\u00d5o0000) && this.do.o00000(I.\u00d8\u00f8O000)) {
                M m = (M)public_;
                M m4 = (M)this.do.\u00d500000().\u00d300000(I.\u00d8\u00f8O000);
                object6 = m.intsuper().iterator();
                while (object6.hasNext()) {
                    if (!m4.\u00f400000(object6.next())) continue;
                    arrayList.add(new Hinweis("Begabung und Unf\u00e4higkeit geht nicht f\u00fcr die gleiche Talentgruppe.\n"));
                }
            }
            if (public_.equals(I.\u00f4\u00d20000) && this.do.o00000(I.fordo)) {
                M m = (M)public_;
                M m5 = (M)this.do.\u00d500000().\u00d300000(I.fordo);
                object6 = m.intsuper().iterator();
                while (object6.hasNext()) {
                    if (!m5.\u00f400000(object6.next())) continue;
                    arrayList.add(new Hinweis("Begabung und Unf\u00e4higkeit geht nicht f\u00fcr das gleiche Talent"));
                }
            }
            if (public_.equals(I.\u00d8\u00f8O000) && this.do.o00000(I.fordo)) {
                M m = (M)public_;
                M m6 = (M)this.do.\u00d500000().\u00d300000(I.fordo);
                for (Object object4 : m.intsuper()) {
                    for (Object object5 : m6.intsuper()) {
                        if (!((String)object4).equals(((U)object5).getArt().toString())) continue;
                        arrayList.add(new Hinweis("Unf\u00e4higkeit f\u00fcr ein Talent und eine  Talentgruppe geht nur,\nwenn das Talent aus einer anderen Gruppe stammt"));
                    }
                }
            }
            if (public_.equals(I.O\u00d6o000) && this.do.o00000(I.\u00f5\u00f6O000)) {
                M m = (M)public_;
                M m7 = (M)this.do.\u00d500000().\u00d300000(I.\u00f5\u00f6O000);
                for (Object object4 : m.intsuper()) {
                    o00OArray = ((Zauber)object4).getMerkmale(null);
                    for (o00O o00O2 : o00OArray) {
                        if (!m7.\u00f400000(o00O2)) continue;
                        arrayList.add(new Hinweis("Begabung f\u00fcr " + ((U)object4).toString() + " und Begabung f\u00fcr " + o00O2.toString() + " geht nicht gleichzeitig."));
                    }
                }
            }
            if (public_.equals(I.\u00f5\u00f6O000) && !this.do.new(while.\u00d6\u00d2\u00f4000.toString())) {
                M m = (M)this.do.\u00d500000().\u00d300000(I.\u00f5\u00f6O000);
                for (Object object6 : m.intsuper()) {
                    if (((o00O)object6).\u00d400000() && m.\u00f400000(((o00O)object6).\u00d500000())) {
                        arrayList.add(new Hinweis("Begabung f\u00fcr " + ((o00O)object6).toString() + "\nund Begabung f\u00fcr das" + " Gegenelement " + ((o00O)object6).\u00d500000().toString() + "\ngeht nicht gleichzeitig."));
                    }
                    if (!((o00O)object6).\u00d400000() || !this.do.new("Merkmalskenntnis: " + ((o00O)object6).\u00d500000().toString())) continue;
                    arrayList.add(new Hinweis("Begabung f\u00fcr " + ((o00O)object6).toString() + "\nund Merkmalskenntnis f\u00fcr das" + " Gegenelement " + ((o00O)object6).\u00d500000().toString() + "\ngeht nicht gleichzeitig."));
                }
            }
            if (!this.\u00f600000.contains(public_) || this.isAuto(public_)) continue;
            string = string + public_.toString() + " ";
        }
        if (string.length() > 0) {
            arrayList.add(new Hinweis("Die folgenden Vor- bzw. Nachteile unterliegen der Meistergenehmigung: " + string, Hinweis.HinweisArt.\u00d200000));
        }
        if (this.do.o00000(I.O\u00f5o000) && !this.do.o00000(I.\u00d8Oo000)) {
            arrayList.add(new Hinweis("Ger\u00e4uschhexerei erfordert Koboldfreund"));
        }
        if (this.\u00d600000.getHeld().\u00f8\u00d40000() && !this.\u00d600000.getHauptProfession().istMagiedilletantErlaubt()) {
            arrayList.add(new Hinweis("Bei dieser Profession kann es sein, dass der Vorteil Viertelzauberer des Halbelfen nicht mehr genutzt werden darf! (siehe WDH 258)", Hinweis.HinweisArt.\u00d200000));
        }
        if (this.do.o00000(I.\u00d5\u00d3O000) && !this.isAuto(this.do.\u00d500000().\u00d300000(I.\u00d5\u00d3O000)) && !this.\u00d600000.getHauptProfession().istMagiedilletantErlaubt()) {
            arrayList.add(new Hinweis("Viertelzauberer darf evtl. nicht zusammen mit dieser Profession gew\u00e4hlt werden.", Hinweis.HinweisArt.\u00d200000));
        }
        if (this.\u00d600000.getHswVorteile().getGPausDoppeltenVorteilen() != 0) {
            if (this.\u00d600000.getHswVorteile().getGPausDoppeltenVorteilen() > 0) {
                arrayList.add(new Hinweis("Wegen doppelter oder ersetzter Vor-/Nachteile m\u00fcssen Nachteile im Wert von insgesamt " + this.\u00d600000.getHswVorteile().getGPausDoppeltenVorteilen() + " GP gew\u00e4hlt werden." + "Bitte WDH S.12 bzw. die Anmerkungen bei den jeweiligen RKP beachten.", Hinweis.HinweisArt.\u00d200000));
            } else {
                arrayList.add(new Hinweis("Wegen doppelter, ersetzter Vor-/Nachteile oder anderen Sonderregeln wurden " + this.\u00d600000.getHswVorteile().getGPausDoppeltenVorteilen() + " GP frei. " + "Bitte WDH S.12 bzw. die Anmerkungen bei den jeweiligen RKP beachten.", Hinweis.HinweisArt.\u00d200000));
            }
        }
        return arrayList;
    }

    private boolean o00000(M<?> m, ArrayList<Hinweis> arrayList) {
        int n = m.\u00f5\u00d20000();
        int n2 = m.\u00d2\u00d20000();
        if (!m.\u00d4\u00d20000()) {
            n2 = 0;
            for (D<?> d2 : m.\u00d200000(true)) {
                if (this.isAuto(d2)) continue;
                ++n2;
            }
        }
        if (n2 > n) {
            if ((m.\u00f4O0000().equals(I.while) || m.\u00f4O0000().equals(I.\u00d8O0000)) && this.do.\u00d4O0000() instanceof L && ((L)this.do.\u00d4O0000()).hatVariante(FerkinaBesessener.getName())) {
                return true;
            }
            arrayList.add(new Hinweis("Vor- bzw. Nachteil " + m.toString() + " darf maximal " + m.\u00f5\u00d20000() + "-mal gew\u00e4hlt werden."));
            return false;
        }
        return true;
    }

    public void remove(public public_) {
        oooo_0.\u00d300000("Remove " + public_.toString());
        if (this.\u00f800000 != null) {
            this.\u00f800000.removeExclude(public_);
        }
        if (public_ instanceof D) {
            I i2;
            D d2 = (D)public_;
            if (public_.equals(I.\u00d8O0000)) {
                i2 = (D)public_;
                for (Object object : ((private)i2).intsuper()) {
                    this.\u00d600000.getHswZauber().deAktivierte((KonkreterZauber)object);
                }
            }
            if (d2.interfacesuper() && d2.\u00f5o0000() instanceof J) {
                i2 = new J();
                D d3 = (D)public_;
                for (R r : d3.intsuper()) {
                    this.\u00d600000.getHswZauber().deAktivierte(((J)i2).oO0000(r));
                }
            }
        }
        this.o00000().\u00d4\u00d20000().o00000(public_, (Boolean)false);
        if (public_.\u00d4O0000() != null) {
            this.o00000().o00000(public_.\u00d4O0000(), this.isAuto(public_.\u00d4O0000()));
        }
        for (I i2 : public_.void()) {
            try {
                if (i2 instanceof public) {
                    this.o00000().\u00d4\u00d20000().o00000((public)((public)i2).clone(), (Boolean)false);
                    continue;
                }
                this.o00000().\u00d4\u00d20000().Object((public)this.OO0000.\u00d300000(i2).clone());
            }
            catch (CloneNotSupportedException cloneNotSupportedException) {
                oooo_0.o00000(cloneNotSupportedException);
            }
        }
        this.berechneGPKostenNeu();
    }

    public void removeAutomatischerVorteil(public public_) {
        this.o00000().new(public_);
    }

    public void restoreAfterLoadedErschaffung() {
        KategorienArrayList<public> kategorienArrayList = this.do.\u00d500000().o00000();
        this.do.\u00d4\u00d20000().o\u00d3O000();
        for (public public_ : kategorienArrayList.getListe()) {
            public public_2 = this.liefereAktuelleInstanz(public_);
            this.do.\u00d500000().\u00d300000(public_2);
        }
    }

    public void setGP(Oo0O oo0O, I i2, int n) {
        if (oo0O.\u00d400000(i2)) {
            public public_ = oo0O.\u00d300000(i2);
            if (public_ instanceof D) {
                ((D)public_).\u00d200000(n);
            } else {
                public_.o00000(n);
            }
        }
    }

    public void setHeld(K k2) {
        this.do = k2;
        this.\u00d3O0000 = k2.oO0000();
    }

    public void setzeFilterForMoeglicheVorteile(Filter filter) {
        this.\u00d800000 = filter;
        this.createMoeglicheVorteile();
    }

    public void setzteWertVorteileZuAuto() {
        for (public public_ : this.do.\u00d500000().o00000().getListe()) {
            if (!(public_ instanceof helden.framework.C.J)) continue;
            int n = ((helden.framework.C.J)public_).\u00f4\u00d50000();
            ((helden.framework.C.J)public_).oO0000(n);
        }
    }

    private void \u00d200000(Oo0O oo0O) {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (public public_ : this.o00000().\u00d500000().o00000().getListe()) {
            public public_2;
            public public_3;
            if (public_ instanceof D && ((D)public_).\u00f5o0000() instanceof J) {
                public_3 = (D)public_;
                public_2 = (J)((D)public_3).\u00f5o0000();
                int n = 0;
                for (oO0O<P, AbstraktBedingung, Integer> oO0O2 : ((D)public_3).o00000(this.\u00d600000.getBt())) {
                    if (arrayList.contains(oO0O2.\u00d300000().toString())) {
                        n += oO0O2.o00000().intValue();
                        continue;
                    }
                    arrayList.add(oO0O2.\u00d300000().toString());
                }
                String string = ((J)public_2).oO0000((R)((D)public_3).\u00f4o0000()).toString();
                if (arrayList.contains(string)) {
                    ++n;
                } else {
                    arrayList.add(string);
                }
                if (n > 0) {
                    public_.o00000(public_.supersuper() - n);
                }
            }
            if (public_ instanceof helden.framework.C.J) {
                public_3 = (helden.framework.C.J)public_;
                if (oo0O.o00000(public_)) {
                    public_2 = (helden.framework.C.J)oo0O.\u00d300000((I)public_);
                    if (((helden.framework.C.J)public_2).\u00d2\u00d50000() != ((helden.framework.C.J)public_3).\u00d2\u00d50000()) {
                        ((helden.framework.C.J)public_3).OO0000(((helden.framework.C.J)public_2).\u00d2\u00d50000());
                        ((helden.framework.C.J)public_3).\u00f4\u00d40000();
                    }
                    ((helden.framework.C.J)public_3).\u00f400000(Math.max(((helden.framework.C.J)public_3).\u00f5\u00d40000(), ((helden.framework.C.J)public_2).\u00f5\u00d40000()));
                }
            }
            if (this.isAuto(public_)) continue;
            if (public_ instanceof D) {
                if (((D)public_).interfacesuper() || !oo0O.o00000(public_3 = (D)public_)) continue;
                public_2 = (D)oo0O.\u00d300000(public_3.\u00f4O0000());
                for (Map.Entry entry : ((private)public_2).\u00d6o0000().entrySet()) {
                    ((private)public_3).\u00d6o0000().put(entry.getKey(), entry.getValue());
                }
                if (((D)public_3).\u00f4o0000() == null) {
                    helden.framework.held.Object.private.\u00d200000("ausgew\u00e4hltes objekt is null", "alle");
                    continue;
                }
                Integer n = (Integer)((private)public_2).\u00d6o0000().get(((D)public_3).\u00f4o0000());
                ((D)public_3).\u00d200000(n);
                continue;
            }
            if (public_ instanceof helden.framework.C.J) {
                public_3 = (helden.framework.C.J)public_;
                if (!oo0O.o00000(public_) || (public_2 = (helden.framework.C.J)oo0O.\u00d300000((I)public_)) == null) continue;
                ((helden.framework.C.J)public_2).oO0000(((helden.framework.C.J)public_3).ObjectString());
                continue;
            }
            if (!oo0O.o00000(public_)) continue;
            public_.o00000(oo0O.\u00d300000((I)public_).supersuper());
        }
        this.o00000(oo0O);
    }

    private void o00000(Oo0O oo0O) {
        ArrayList arrayList;
        D d2;
        HashMap<I, ArrayList> hashMap = new HashMap<I, ArrayList>();
        for (public public_ : this.\u00d4O0000.o00000().getListe()) {
            if (!(public_ instanceof D)) continue;
            d2 = (D)public_;
            arrayList = (ArrayList)hashMap.get(d2.\u00f4O0000());
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(d2.\u00f4o0000());
            hashMap.put(d2.\u00f4O0000(), arrayList);
        }
        for (public public_ : this.o00000().\u00d500000().o00000().getListe()) {
            if (!(public_ instanceof D) || (arrayList = (ArrayList)hashMap.get((d2 = (D)public_).\u00f4O0000())) == null || !arrayList.contains(d2.\u00f4o0000())) continue;
            d2.\u00d200000(d2.\u00f4o0000(), 0);
        }
    }

    private void \u00d200000(public public_) {
        Object object;
        if (this.o00000().return(public_.toString())) {
            if (public_ instanceof M) {
                this.addAutomatischerVorteil(public_);
            } else if (public_ instanceof helden.framework.C.J) {
                object = (helden.framework.C.J)this.o00000().\u00d500000().new(public_.toString());
                helden.framework.C.J j2 = (helden.framework.C.J)public_;
                ((helden.framework.C.J)object).oO0000(((helden.framework.C.J)object).ObjectString() + j2.ObjectString());
            } else if (public_.float() != null && public_.\u00f500000()) {
                this.removeAutomatischerVorteil(public_);
                this.addAutomatischerVorteil(helden.framework.C.K.o00000(public_.float().get(0)));
            } else {
                this.class.add(public_);
            }
        } else if (public_.float() != null && this.o00000().o00000(public_.float())) {
            this.class.add(public_);
        } else {
            for (public public_2 : this.\u00d4O0000.o00000().getListe()) {
                if (public_2.float() == null || !public_2.float().contains(public_)) continue;
                this.o00000().\u00d500000().new(public_2);
                public_.o00000(public_2);
                this.class.add(this.OO0000.\u00d300000((I)public_2));
                break;
            }
            this.addAutomatischerVorteil(public_);
        }
        if (public_.public() != null) {
            object = this.o00000().Stringsuper().o00000(public_.toString());
            if (object == null) {
                object = "";
            }
            object = (String)object + public_.public();
            this.o00000().Stringsuper().o00000(public_.toString(), (String)object);
        }
    }

    private K o00000() {
        return this.do;
    }

    private boolean o00000(public public_) {
        if (this.getUngeeignet().contains(public_)) {
            return true;
        }
        if (public_ instanceof D) {
            D d2 = (D)public_;
            for (I i2 : this.getUngeeignet()) {
                if (!(i2 instanceof M)) continue;
                M m = (M)i2;
                if (!d2.\u00f4O0000().equals(m.\u00f4O0000()) || !m.intsuper().contains(d2.\u00f4o0000())) continue;
                return true;
            }
        }
        return false;
    }

    private void o00000(OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, ArrayList<I> arrayList) {
        Iterator<public> iterator = ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.getVorteile().\u00d500000();
        while (iterator.hasNext()) {
            public public_;
            public public_2 = iterator.next();
            if (arrayList.contains(public_2)) {
                arrayList.remove(public_2);
                continue;
            }
            try {
                public_ = (public)public_2.clone();
            }
            catch (CloneNotSupportedException cloneNotSupportedException) {
                public_ = public_2;
            }
            this.\u00d200000(public_);
        }
    }
}

