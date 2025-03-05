/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.Object;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.M;
import helden.framework.C.public;
import helden.framework.D.F;
import helden.framework.D.H;
import helden.framework.D.OoOO.E;
import helden.framework.D.void;
import helden.framework.D.while;
import helden.framework.OOoO.R;
import helden.framework.OOoO.o00O;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.AbstraktBedingung;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.framework.d.oooo_0;
import helden.framework.held.D;
import helden.framework.held.K;
import helden.framework.held.Object.private;
import helden.framework.int.OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.int.P;
import helden.framework.int.super;
import helden.framework.oooo.b_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.MyranischerZauber;
import helden.model.profession.Geweihter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class floatsuper {
    private boolean \u00d400000 = false;
    private K new;
    private ArrayList<Bedingung.BedingungsArten> \u00d300000;
    private List<P> \u00d500000 = null;
    private Map<String, Boolean> o00000 = new HashMap<String, Boolean>();

    public static boolean \u00d200000(AbstraktBedingung abstraktBedingung) {
        Object object;
        if (abstraktBedingung == null) {
            return false;
        }
        if (abstraktBedingung instanceof Bedingung && ((Bedingung)(object = (Bedingung)abstraktBedingung)).getBedingungsArt().equals((Object)Bedingung.BedingungsArten.\u00d300000) && oooo_0.o00000(((Bedingung)object).getSfbezeichner().toString()).new()) {
            return true;
        }
        if (abstraktBedingung instanceof BedingungsVerknuepfung) {
            object = ((BedingungsVerknuepfung)abstraktBedingung).getBedingungen().iterator();
            while (object.hasNext()) {
                if (!floatsuper.\u00d200000((AbstraktBedingung)object.next())) continue;
                return true;
            }
        }
        return false;
    }

    public void o00000(boolean bl) {
        this.\u00d400000 = bl;
    }

    public floatsuper(K k2) {
        this.new = k2;
        this.\u00d300000 = new ArrayList();
        this.\u00d300000.add(Bedingung.BedingungsArten.oo0000);
        this.\u00d300000.add(Bedingung.BedingungsArten.\u00d400000);
        this.\u00d300000.add(Bedingung.BedingungsArten.oO0000);
        this.\u00d300000.add(Bedingung.BedingungsArten.\u00d800000);
        this.\u00d300000.add(Bedingung.BedingungsArten.\u00d5o0000);
        this.\u00d300000.add(Bedingung.BedingungsArten.\u00d5O0000);
        this.\u00d300000.add(Bedingung.BedingungsArten.o00000);
        this.\u00d300000.add(Bedingung.BedingungsArten.\u00f500000);
        this.\u00d300000.add(Bedingung.BedingungsArten.nullsuper);
    }

    public boolean o00000(BedingungsVerknuepfung bedingungsVerknuepfung) {
        this.o00000();
        return this.o00000(bedingungsVerknuepfung, this.\u00d300000) == _o.Object;
    }

    private void o00000() {
        if (this.\u00d400000) {
            return;
        }
        this.o00000.clear();
    }

    public boolean Object(AbstraktBedingung abstraktBedingung) {
        this.o00000();
        if (abstraktBedingung == null) {
            return true;
        }
        if (abstraktBedingung instanceof Bedingung) {
            return this.\u00d200000(new BedingungsVerknuepfung(VerknuepfungsArt.o00000, abstraktBedingung)) == _o.Object;
        }
        return this.\u00d200000((BedingungsVerknuepfung)abstraktBedingung) == _o.Object;
    }

    public boolean Object(BedingungsVerknuepfung bedingungsVerknuepfung) {
        this.o00000();
        if (bedingungsVerknuepfung == null) {
            return true;
        }
        return this.\u00d200000(bedingungsVerknuepfung) == _o.Object;
    }

    public boolean o00000(AbstraktBedingung abstraktBedingung) {
        Object object;
        this.o00000();
        if (abstraktBedingung == null) {
            return false;
        }
        if (abstraktBedingung instanceof Bedingung) {
            object = (Bedingung)abstraktBedingung;
            if (((Bedingung)object).getBedingungsArt().equals((Object)Bedingung.BedingungsArten.\u00d300000) && ((Bedingung)object).getSfbezeichner().toString().equals(while.\u00d8\u00d5\u00d2000.toString())) {
                return true;
            }
            if (((Bedingung)object).getBedingungsArt().equals((Object)Bedingung.BedingungsArten.oo0000) && ((Bedingung)object).getAbstrakteEigenschaft().equals(voidsuper.\u00f5\u00d8\u00d6000)) {
                return true;
            }
        }
        if (abstraktBedingung instanceof BedingungsVerknuepfung) {
            object = ((BedingungsVerknuepfung)abstraktBedingung).getBedingungen().iterator();
            while (object.hasNext()) {
                if (!this.o00000((AbstraktBedingung)object.next())) continue;
                return true;
            }
        }
        return false;
    }

    private boolean o00000(I i2, Object object) {
        Iterator<public> iterator = this.new.\u00d500000().\u00d500000();
        while (iterator.hasNext()) {
            public public_ = iterator.next();
            if (!public_.\u00f4O0000().equals(i2)) continue;
            M m = (M)public_;
            return m.\u00f400000(object);
        }
        return false;
    }

    public void o00000(K k2) {
        this.o00000();
        this.new = k2;
    }

    public _o \u00d200000(BedingungsVerknuepfung bedingungsVerknuepfung) {
        this.o00000();
        Iterator<AbstraktBedingung> iterator = bedingungsVerknuepfung.getBedingungen().iterator();
        _o _o2 = null;
        while (iterator.hasNext()) {
            AbstraktBedingung abstraktBedingung = iterator.next();
            _o _o3 = null;
            if (abstraktBedingung instanceof BedingungsVerknuepfung) {
                _o3 = this.\u00d200000((BedingungsVerknuepfung)abstraktBedingung);
            }
            if (abstraktBedingung instanceof Bedingung) {
                _o3 = this.\u00f500000((Bedingung)abstraktBedingung) ? _o.Object : _o.\u00d400000;
            }
            if (_o2 == null) {
                _o2 = _o3;
            }
            if (bedingungsVerknuepfung.getVerknuepfungsArt().equals((Object)VerknuepfungsArt.\u00d300000)) {
                if (_o3 != _o.Object) continue;
                _o2 = _o.Object;
                break;
            }
            if (!bedingungsVerknuepfung.getVerknuepfungsArt().equals((Object)VerknuepfungsArt.o00000) || _o3 != _o.\u00d400000) continue;
            _o2 = _o.\u00d400000;
            break;
        }
        if (_o2 == null) {
            return _o.Object;
        }
        return _o2;
    }

    private boolean \u00f500000(Bedingung bedingung) {
        String string = bedingung.toString();
        Boolean bl = this.o00000.get(string);
        if (bl == null) {
            bl = this.\u00d600000(bedingung);
            this.o00000.put(string, bl);
        }
        return bl;
    }

    private boolean \u00d600000(Bedingung bedingung) {
        switch (bedingung.getBedingungsArt()) {
            case o00000: {
                Integer n = this.new.o00000(this.new.while());
                if (bedingung.isNegieren()) {
                    return n == null || n < bedingung.getWert();
                }
                return n != null && n >= bedingung.getWert();
            }
            case \u00f400000: {
                boolean bl = bedingung.getGeschlecht().equals((Object)this.new.\u00d300000());
                if (bedingung.isNegieren()) {
                    return !bl;
                }
                return bl;
            }
            case oo0000: {
                Integer n = null;
                oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1 oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12 = bedingung.getAbstrakteEigenschaft().getArt();
                if (oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12.equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.int)) {
                    b_0 b_02 = (b_0)bedingung.getAbstrakteEigenschaft();
                    n = this.new.o00000(b_02);
                } else {
                    try {
                        oo0o_0 oo0o_02 = (oo0o_0)bedingung.getAbstrakteEigenschaft();
                        if (bedingung.getAbstrakteEigenschaft().equals(G.\u00d4\u00f4\u00f5000)) {
                            oo0o_02 = this.new.O\u00d20000();
                        }
                        if (bedingung.getAbstrakteEigenschaft().equals(G.\u00d30\u00f6000)) {
                            oo0o_02 = this.new.\u00f5\u00d20000();
                        }
                        if (oo0o_02 != null) {
                            n = this.new.\u00d300000(oo0o_02);
                        }
                    }
                    catch (D d2) {
                        // empty catch block
                    }
                }
                if (bedingung.isNegieren()) {
                    return n == null || n < bedingung.getWert();
                }
                return n != null && n >= bedingung.getWert();
            }
            case new: {
                boolean bl = this.new.o00000(bedingung.getVorteil());
                if (bl) {
                    J j2 = (J)this.new.\u00d500000().\u00d300000(bedingung.getVorteil());
                    if (bedingung.isNegieren()) {
                        return bedingung.getWert() > j2.ObjectString();
                    }
                    return bedingung.getWert() <= j2.ObjectString();
                }
                return bedingung.isNegieren();
            }
            case \u00f8O0000: {
                boolean bl = this.new.o00000(bedingung.getVorteil());
                if (bedingung.isNegieren()) {
                    bl = !bl;
                }
                return bl;
            }
            case \u00d8o0000: {
                return this.o00000(bedingung);
            }
            case \u00d300000: {
                boolean bl = this.new.new(bedingung.getSfbezeichner().toString());
                if (bedingung.isNegieren()) {
                    bl = !bl;
                }
                return bl;
            }
            case Stringsuper: {
                return this.void(bedingung);
            }
            case \u00f5O0000: {
                boolean bl = this.new.new(bedingung.getSonderfertigkeit().toString());
                if (bedingung.isNegieren()) {
                    bl = !bl;
                }
                return bl;
            }
            case OO0000: {
                return this.Object(bedingung);
            }
            case \u00d800000: {
                boolean bl = false;
                Iterator<voidsuper> iterator = this.new.\u00f8O0000().super();
                while (iterator.hasNext()) {
                    voidsuper voidsuper2 = iterator.next();
                    if (!voidsuper2.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f600000)) continue;
                    try {
                        Integer n = this.new.\u00d300000((oo0o_0)voidsuper2);
                        if (n < bedingung.getWert()) continue;
                        bl = true;
                        break;
                    }
                    catch (D d3) {
                    }
                }
                if (bedingung.isNegieren()) {
                    bl = !bl;
                }
                return bl;
            }
            case \u00f500000: {
                boolean bl = this.new.new(while.\u00d3\u00d6O000.toString());
                boolean bl2 = false;
                Iterator<voidsuper> iterator = this.new.\u00f8O0000().super();
                while (iterator.hasNext()) {
                    voidsuper voidsuper3 = iterator.next();
                    if (!voidsuper3.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d200000) && (!bl || !voidsuper3.equals(voidsuper.o\u00f8\u00d6000))) continue;
                    try {
                        Integer n = this.new.\u00d300000((oo0o_0)voidsuper3);
                        if (n < bedingung.getWert()) continue;
                        bl2 = true;
                        break;
                    }
                    catch (D d4) {
                    }
                }
                if (bedingung.isNegieren()) {
                    bl2 = !bl2;
                }
                return bl2;
            }
            case nullsuper: {
                return this.\u00d500000(bedingung);
            }
            case \u00d400000: {
                return this.\u00d200000(bedingung);
            }
            case oO0000: {
                return this.\u00f600000(bedingung);
            }
            case \u00f800000: {
                boolean bl;
                boolean bl3 = bl = this.new.\u00d800000().hatProfession(bedingung.getProfession()) != null;
                if (bl && bedingung.getVariante() != null) {
                    super super_ = this.new.\u00d800000().hatProfession(bedingung.getProfession());
                    bl = false;
                    for (P p2 : super_.getGewaehlteVarianten()) {
                        if (!p2.toString().equals(bedingung.getVariante())) continue;
                        bl = true;
                        break;
                    }
                }
                if (bedingung.isNegieren()) {
                    bl = !bl;
                }
                return bl;
            }
            case forsuper: {
                boolean bl = this.new.\u00f800000().getID().equals(bedingung.getKultur());
                if (bl && bedingung.getVariante() != null) {
                    bl = false;
                    for (P p3 : this.new.\u00f800000().getGewaehlteVarianten()) {
                        if (!p3.toString().equals(bedingung.getVariante())) continue;
                        bl = true;
                        break;
                    }
                }
                if (bedingung.isNegieren()) {
                    bl = !bl;
                }
                return bl;
            }
            case privatesuper: {
                boolean bl = this.new.o\u00d20000().getID().equals(bedingung.getRasse());
                if (bl && bedingung.getVariante() != null) {
                    bl = false;
                    for (P p4 : this.new.o\u00d20000().getGewaehlteVarianten()) {
                        if (!p4.toString().equals(bedingung.getVariante())) continue;
                        bl = true;
                        break;
                    }
                }
                if (bedingung.isNegieren()) {
                    bl = !bl;
                }
                return bl;
            }
            case \u00f5o0000: {
                return false;
            }
            case \u00d3o0000: {
                Integer n = this.new.o00000(b_0.\u00d4\u00f5\u00d2000);
                if (bedingung.isNegieren()) {
                    return n == null || n <= 0;
                }
                return n != null && n > 0;
            }
            case \u00d5O0000: {
                List<KonkreterZauber> list = this.new.\u00d5o0000().\u00d200000();
                int n = 0;
                for (int i2 = 0; i2 < list.size(); ++i2) {
                    if (list.get(i2).hatMerkmal(bedingung.getMerkmal())) {
                        try {
                            n += this.new.\u00d5o0000().\u00d400000(list.get(i2));
                        }
                        catch (D d5) {
                            private.\u00d200000("Nicht aktive " + d5.getMessage(), "christian");
                        }
                    }
                    if (bedingung.getWert() <= n) break;
                }
                return bedingung.getWert() <= n;
            }
            case \u00d4o0000: {
                boolean bl = this.new.oO0000().hatSetting(bedingung.getSettings());
                if (bedingung.isNegieren()) {
                    bl = !bl;
                }
                return bl;
            }
            case \u00f4O0000: {
                boolean bl;
                E e = bedingung.getMerkmale();
                M m = null;
                M m2 = null;
                m = (M)helden.framework.C.K.o00000(I.\u00f5\u00f6O000);
                m.o00000(e.getWert1());
                m2 = (M)helden.framework.C.K.o00000(I.\u00f5\u00f6O000);
                m2.o00000(e.getWert2());
                boolean bl4 = bl = this.new.new(this.o00000((o00O)e.getWert1()).toString()) || this.new.new(this.o00000((o00O)e.getWert2()).toString()) || this.o00000(I.\u00f5\u00f6O000, e.getWert1()) || this.o00000(I.\u00f5\u00f6O000, e.getWert2());
                if (bedingung.isNegieren()) {
                    bl = !bl;
                }
                return bl;
            }
            case \u00d4O0000: {
                boolean bl = false;
                Iterator<o00O> iterator = o00O.\u00d200000();
                while (iterator.hasNext()) {
                    o00O o00O2 = iterator.next();
                    if (!o00O2.\u00f600000() || !this.o00000(I.\u00f5\u00f6O000, o00O2)) continue;
                    bl = true;
                    break;
                }
                if (bedingung.isNegieren()) {
                    bl = !bl;
                }
                return bl;
            }
            case \u00f4o0000: {
                return this.\u00f400000(bedingung);
            }
            case \u00d500000: {
                return this.\u00d400000(bedingung);
            }
            case \u00d3O0000: {
                return this.float(bedingung);
            }
            case \u00d8O0000: {
                return bedingung.getWert() <= this.\u00d200000(this.new);
            }
            case while: {
                int n = 0;
                for (voidsuper voidsuper4 : this.new.\u00f8O0000().super(bedingung.getWert())) {
                    if (oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.o00000(bedingung.getTalentart(), voidsuper4)) {
                        ++n;
                    }
                    if (n != bedingung.getAnzahl()) continue;
                    return true;
                }
                return false;
            }
            case if: {
                boolean bl;
                int n = 0;
                for (Object object : bedingung.getAuswahlen()) {
                    if (this.new.\u00f8O0000().\u00d800000((voidsuper)object) < bedingung.getWert()) continue;
                    ++n;
                }
                boolean bl5 = bl = n >= bedingung.getAnzahl();
                if (bedingung.isNegieren()) {
                    bl = !bl;
                }
                return bl;
            }
            case return: {
                boolean bl = this.new.\u00d8o0000().new(bedingung.getVariante());
                if (bedingung.isNegieren()) {
                    bl = !bl;
                }
                return bl;
            }
        }
        private.\u00d200000("Bedingungstest fehlt " + (Object)((Object)bedingung.getBedingungsArt()), "sven");
        return true;
    }

    private _o o00000(BedingungsVerknuepfung bedingungsVerknuepfung, ArrayList<Bedingung.BedingungsArten> arrayList) {
        Iterator<AbstraktBedingung> iterator = bedingungsVerknuepfung.getBedingungen().iterator();
        _o _o2 = null;
        while (iterator.hasNext()) {
            AbstraktBedingung abstraktBedingung = iterator.next();
            _o _o3 = null;
            if (abstraktBedingung instanceof BedingungsVerknuepfung) {
                _o3 = this.\u00d200000((BedingungsVerknuepfung)abstraktBedingung);
            }
            if (abstraktBedingung instanceof Bedingung) {
                _o3 = arrayList.contains((Object)((Bedingung)abstraktBedingung).getBedingungsArt()) ? _o.Object : (this.\u00f500000((Bedingung)abstraktBedingung) ? _o.Object : _o.\u00d400000);
            }
            if (_o2 == null) {
                _o2 = _o3;
            }
            if (bedingungsVerknuepfung.getVerknuepfungsArt().equals((Object)VerknuepfungsArt.\u00d300000)) {
                if (_o3 != _o.Object) continue;
                _o2 = _o.Object;
                break;
            }
            if (!bedingungsVerknuepfung.getVerknuepfungsArt().equals((Object)VerknuepfungsArt.o00000) || _o3 != _o.\u00d400000) continue;
            _o2 = _o.\u00d400000;
            break;
        }
        if (_o2 == null) {
            return _o.Object;
        }
        return _o2;
    }

    public _o o00000(BedingungsVerknuepfung bedingungsVerknuepfung, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        this.o00000();
        Iterator<AbstraktBedingung> iterator = bedingungsVerknuepfung.getBedingungen().iterator();
        _o _o2 = null;
        while (iterator.hasNext()) {
            AbstraktBedingung abstraktBedingung = iterator.next();
            _o _o3 = null;
            if (abstraktBedingung instanceof BedingungsVerknuepfung) {
                _o3 = this.o00000((BedingungsVerknuepfung)abstraktBedingung, arrayList, arrayList2);
            }
            if (abstraktBedingung instanceof Bedingung) {
                Bedingung bedingung = (Bedingung)abstraktBedingung;
                if (_o3 == null) {
                    _o3 = this.o00000(arrayList, arrayList2, bedingung);
                }
            }
            if (_o2 == null) {
                _o2 = _o3;
            }
            if (bedingungsVerknuepfung.getVerknuepfungsArt().equals((Object)VerknuepfungsArt.\u00d300000)) {
                if (_o3 == _o.Object) {
                    _o2 = _o.Object;
                    break;
                }
                if (_o3 != _o.o00000) continue;
                _o2 = _o.o00000;
                continue;
            }
            if (!bedingungsVerknuepfung.getVerknuepfungsArt().equals((Object)VerknuepfungsArt.o00000)) continue;
            if (_o3 == _o.\u00d400000) {
                _o2 = _o.\u00d400000;
                break;
            }
            if (_o3 != _o.o00000) continue;
            _o2 = _o.o00000;
        }
        if (_o2 == null) {
            return _o.Object;
        }
        return _o2;
    }

    private Integer \u00d200000(K k2) {
        int n = 0;
        for (helden.framework.D.P p2 : k2.\u00f5O0000().\u00f600000()) {
            if (!p2.\u00f4o0000() && !p2.oo0000() && !p2.\u00d4o0000()) continue;
            n += p2.newnew();
        }
        return n;
    }

    private boolean \u00d500000(Bedingung bedingung) {
        boolean bl = false;
        Iterator<voidsuper> iterator = this.new.\u00f8O0000().super();
        while (iterator.hasNext()) {
            voidsuper voidsuper2 = iterator.next();
            if (!voidsuper2.equals(voidsuper.\u00f8\u00d8\u00d6000) && !voidsuper2.equals(voidsuper.whilereturnObject) && !voidsuper2.equals(voidsuper.\u00f8\u00f6\u00d5000) && !voidsuper2.equals(voidsuper.thisdoObject) && !voidsuper2.equals(voidsuper.\u00d4\u00f4\u00d6000) && !voidsuper2.equals(voidsuper.\u00f4\u00f5\u00d6000) && !voidsuper2.equals(voidsuper.\u00f5\u00d2\u00d8000) && !voidsuper2.equals(voidsuper.O\u00d4\u00d6000) && !voidsuper2.equals(voidsuper.\u00f8\u00f6\u00d6000) && !voidsuper2.equals(voidsuper.\u00d4\u00d3\u00d8000) && !voidsuper2.equals(voidsuper.\u00d4\u00f5\u00d6000) && !voidsuper2.equals(voidsuper.O\u00f8\u00d6000) && !voidsuper2.equals(voidsuper.whileprivateObject) && !voidsuper2.equals(voidsuper.nullinterfaceObject) && !voidsuper2.equals(voidsuper.thispublicObject) && !voidsuper2.equals(voidsuper.\u00f5\u00f8\u00d6000) && !voidsuper2.equals(voidsuper.\u00d8\u00f4\u00d5000) && !voidsuper2.equals(voidsuper.\u00d5\u00f4\u00d6000) && !voidsuper2.equals(voidsuper.\u00d3O\u00d8000) && !voidsuper2.equals(voidsuper.\u00d8O\u00d6000) && !voidsuper2.equals(voidsuper.\u00f5\u00f4\u00d5000)) continue;
            try {
                Integer n = this.new.\u00d300000((oo0o_0)voidsuper2);
                if (n < bedingung.getWert()) continue;
                bl = true;
                break;
            }
            catch (D d2) {
            }
        }
        if (bedingung.isNegieren()) {
            bl = !bl;
        }
        return bl;
    }

    private boolean void(Bedingung bedingung) {
        boolean bl = false;
        for (helden.framework.D.P p2 : this.new.\u00f5O0000().\u00f600000()) {
            void void_;
            if (!p2.\u00f500000().equals(bedingung.getSfbezeichner().toString())) continue;
            if (p2 instanceof F) {
                void_ = (F)p2;
                if (bedingung.getAuswahlen().length == 1 && bedingung.getAuswahlen()[0] instanceof R) {
                    for (Object object : void_.nullObject()) {
                        if (!((R)bedingung.getAuswahlen()[0]).equals(object)) continue;
                        bl = true;
                        break;
                    }
                } else {
                    for (Object object : void_.nullObject()) {
                        if (((R)object).o00000() != bedingung.getAuswahlen().length) {
                            helden.framework.held.object.oooo_0.\u00f500000("Bedingung '" + bedingung.toString() + "' falsch! NTupel hat die falsche L\u00e4nge.\n" + "Bedingung: " + Arrays.toString(bedingung.getAuswahlen()) + "\nMASF Wahl: " + ((R)object).o00000() + " " + ((R)object).toString());
                        } else {
                            boolean bl2 = true;
                            for (int i2 = 0; i2 < ((R)object).o00000(); ++i2) {
                                if (bedingung.getAuswahlen()[i2] == null || ((R)object).o00000(i2).toString().equals(bedingung.getAuswahlen()[i2].toString())) continue;
                                bl2 = false;
                                break;
                            }
                            if (!bl2) continue;
                            bl = true;
                        }
                        break;
                    }
                }
            } else if (p2 instanceof void) {
                Object object;
                void_ = (void)p2;
                if (bedingung.getAuswahlen().length != 1) {
                    helden.framework.held.object.oooo_0.\u00f500000("Bedingung f\u00fcr " + bedingung.getSfbezeichner() + " falsch!");
                    break;
                }
                boolean bl3 = false;
                object = void_.nullObject().iterator();
                while (object.hasNext()) {
                    Object e = object.next();
                    if (!e.toString().equals(bedingung.getAuswahlen()[0].toString())) continue;
                    bl3 = true;
                }
                if (bl3) {
                    bl = true;
                    break;
                }
            }
            if (!bl) continue;
            break;
        }
        if (bedingung.isNegieren()) {
            return !bl;
        }
        return bl;
    }

    private boolean \u00d400000(Bedingung bedingung) {
        Comparable<Object> comparable;
        if (this.\u00d500000 == null) {
            this.\u00d500000 = new ArrayList<P>();
            comparable = new Geweihter(this.new.\u00d300000(), this.new.\u00d800000().getMuttersprache(), this.new.\u00d800000().getMuttersprachenSchrift());
            for (P p2 : ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)comparable).getAlleVarianten()) {
                if (((helden.framework.int.N)p2).getVorteile().\u00d400000(I.\u00d3\u00f5O000) || ((helden.framework.int.N)p2).getVorteile().\u00d400000(I.\u00f8\u00d50000) || ((helden.framework.int.N)p2).getVorteile().\u00d400000(I.\u00d8\u00f8o000) || ((helden.framework.int.N)p2).getVorteile().\u00d400000(I.\u00d4\u00f4O000) || ((helden.framework.int.N)p2).getVorteile().\u00d400000(I.\u00d5\u00f5O000) || ((helden.framework.int.N)p2).getVorteile().\u00d400000(I.iffor)) {
                    this.\u00d500000.add(p2);
                }
                Collections.sort(this.\u00d500000);
            }
        }
        comparable = null;
        for (P p2 : this.\u00d500000) {
            if (!p2.toString().startsWith(bedingung.getVariante())) continue;
            comparable = (helden.framework.int.N)p2;
            break;
        }
        Iterator<Comparable<Object>> iterator = b_0.\u00d4\u00d60000();
        boolean bl = true;
        while (iterator.hasNext()) {
            b_0 b_02 = (b_0)iterator.next();
            if (comparable == null) {
                return true;
            }
            int n = ((helden.framework.int.N)comparable).getMinimalEigenschaftswert(b_02);
            if (b_02.equals(b_0.\u00f5\u00f5\u00d2000) || this.new.o00000(b_02) >= (n += bedingung.getWert().intValue())) continue;
            bl = false;
            break;
        }
        if (bedingung.isNegieren()) {
            return !bl;
        }
        return bl;
    }

    private boolean Object(Bedingung bedingung) {
        boolean bl = false;
        switch (bedingung.getMagielevel()) {
            case \u00d300000: {
                bl = this.new.o00000(I.\u00d5\u00d3O000) || this.new.o00000(I.\u00f5\u00d8o000) || this.new.o00000(I.forsupersuper);
                break;
            }
            case \u00d800000: {
                bl = this.new.o00000(I.\u00f5\u00d8o000) || this.new.o00000(I.forsupersuper);
                break;
            }
            case \u00d500000: {
                bl = this.new.o00000(I.forsupersuper);
                break;
            }
            case o00000: {
                bl = this.new.o00000(I.\u00d3\u00f5O000) || this.new.o00000(I.\u00d5\u00f5O000) || this.new.o00000(I.\u00d8\u00f8o000) || this.new.o00000(I.\u00d4\u00f4O000) || this.new.o00000(I.\u00f8\u00d50000) || this.new.o00000(I.iffor) || this.new.o00000(I.\u00f5\u00d60000) || this.new.new(while.\u00d8\u00d6\u00d5000.toString()) || this.new.o00000(I.forinterface) || this.new.new(while.o\u00d4\u00d4000.toString()) || this.new.new(while.\u00d6\u00d8\u00d8000.toString()) || this.new.new(while.fornewObject.toString()) || this.new.new(while.\u00d8\u00d6\u00d5000.toString()) || this.new.new(while.o\u00d2\u00f4000.toString()) || this.new.new(while.\u00d3\u00d6O000.toString());
                break;
            }
            case \u00d600000: {
                bl = this.new.new(while.\u00d2\u00d3\u00d4000.toString()) || this.new.new(while.\u00d2\u00d4\u00d2000.toString()) || this.new.new(while.\u00f6\u00d30000.toString()) || this.new.new(while.\u00f6\u00d8\u00d2000.toString()) || this.new.new(while.thiswhilesuper.toString()) || this.new.new(while.\u00f6\u00d3\u00d6000.toString()) || this.new.new(while.\u00f8\u00f5\u00d2000.toString()) || this.new.new(while.\u00d80\u00d3000.toString()) || this.new.new(while.\u00d6\u00d2\u00f5000.toString()) || this.new.new(while.\u00d5\u00d6O000.toString()) || this.new.new(while.\u00d3\u00d3\u00d5000.toString());
                break;
            }
            case String: {
                bl = this.new.\u00d3O0000();
                break;
            }
            default: {
                private.\u00d200000("Unbekanntes Magielevel", "sven");
            }
        }
        if (bedingung.isNegieren()) {
            bl = !bl;
        }
        return bl;
    }

    private boolean o00000(Bedingung bedingung) {
        boolean bl = false;
        if (this.new.o00000(bedingung.getVorteil())) {
            for (public public_ : this.new.\u00d500000().o00000().getListe()) {
                helden.framework.C.D d2;
                if (!(public_ instanceof helden.framework.C.D) || !(d2 = (helden.framework.C.D)public_).\u00f5o0000().\u00f4O0000().equals(bedingung.getVorteil()) || !d2.\u00f4o0000().toString().startsWith(bedingung.getVariante())) continue;
                bl = true;
                break;
            }
        }
        if (bedingung.isNegieren()) {
            bl = !bl;
        }
        return bl;
    }

    private boolean \u00d200000(Bedingung bedingung) {
        Integer n = this.new.o00000(this.new.while());
        helden.framework.D.P p2 = bedingung.getSonderfertigkeit();
        Integer n2 = this.new.\u00f5O0000().oO0000();
        boolean bl = this.new.new(p2.toString());
        if (!bl) {
            return n >= this.o00000(n2 + 1);
        }
        if (n >= this.o00000(n2)) {
            return true;
        }
        int n3 = 1;
        for (helden.framework.D.P p3 : this.new.\u00f5O0000()) {
            if (!p3.if()) continue;
            if (p3.o00000(p2)) break;
            ++n3;
        }
        return n >= this.o00000(n3);
    }

    private boolean \u00f400000(Bedingung bedingung) {
        boolean bl = true;
        for (int i2 = 0; i2 < bedingung.getNoetigeTalentWerte().length; ++i2) {
            int n = bedingung.getNoetigeTalentWerte()[i2];
            boolean bl2 = false;
            ArrayList<String> arrayList = new ArrayList<String>();
            for (String string : bedingung.getList()) {
                int n2;
                if (arrayList.contains(string)) continue;
                try {
                    n2 = this.new.\u00d300000((oo0o_0)N.floatsuper().\u00d200000(string));
                }
                catch (D d2) {
                    n2 = 0;
                }
                if (n2 < n) continue;
                bl2 = true;
                arrayList.add(string);
                break;
            }
            if (bl2) continue;
            return false;
        }
        return bl;
    }

    private boolean float(Bedingung bedingung) {
        boolean bl = false;
        for (KonkreterZauber konkreterZauber : this.new.\u00d5o0000().\u00d200000()) {
            if (!(konkreterZauber.getZauber() instanceof MyranischerZauber)) continue;
            MyranischerZauber myranischerZauber = (MyranischerZauber)konkreterZauber.getZauber();
            if (bedingung.getMyrzauberart() != null && !bedingung.getMyrzauberart().equals((Object)myranischerZauber.getZauberArt())) continue;
            if (bedingung.getAuswahlen() != null && bedingung.getAuswahlen().length > 0) {
                boolean bl2 = false;
                block1: for (Object object : bedingung.getAuswahlen()) {
                    if (object instanceof o00O) {
                        if (!myranischerZauber.hatMerkmal((o00O)object, null)) continue;
                        bl2 = true;
                        continue;
                    }
                    for (o00O o00O2 : konkreterZauber.getMerkmale()) {
                        if (!o00O2.void().equals(object)) continue;
                        bl2 = true;
                        continue block1;
                    }
                }
                if (!bl2) continue;
            }
            if (this.new.\u00d5o0000().\u00d800000(konkreterZauber) < bedingung.getWert()) continue;
            bl = true;
            break;
        }
        if (bedingung.isNegieren()) {
            return !bl;
        }
        return bl;
    }

    private boolean \u00f600000(Bedingung bedingung) {
        helden.framework.D.P p2 = bedingung.getSonderfertigkeit();
        if (p2.equals(while.\u00f6\u00f6o000) && this.new.o00000(while.\u00d2\u00f4\u00d4000)) {
            return true;
        }
        boolean bl = this.new.new(p2.toString());
        ArrayList<helden.framework.D.P> arrayList = new ArrayList<helden.framework.D.P>();
        for (super object : this.new.nullsuper()) {
            arrayList.addAll(object.getSonderfertigkeiten().\u00f600000());
        }
        if (arrayList.contains(p2)) {
            return true;
        }
        arrayList.addAll(this.new.\u00d4\u00d20000().getSonderfertigkeiten().\u00f600000());
        if (bl) {
            Vector<helden.framework.D.P> vector = new Vector<helden.framework.D.P>();
            for (helden.framework.D.P n : this.new.\u00f5O0000()) {
                if (!n.\u00f4O0000()) continue;
                if (arrayList.contains(n)) {
                    vector.add(0, n);
                    continue;
                }
                vector.add(n);
            }
            int n = vector.indexOf(p2);
            return this.o00000(n, p2);
        }
        return this.o00000(this.new.\u00f5O0000().\u00f8O0000(), p2);
    }

    private H o00000(o00O o00O2) {
        if (o00O2.equals(o00O.\u00d4\u00d20000)) {
            return while.\u00d3\u00f5\u00d3000;
        }
        if (o00O2.equals(o00O.super)) {
            return while.\u00f8\u00f6\u00d4000;
        }
        if (o00O2.equals(o00O.\u00d2\u00d20000)) {
            return while.\u00f6\u00d8O000;
        }
        if (o00O2.equals(o00O.\u00d800000)) {
            return while.Stringwhilesuper;
        }
        if (o00O2.equals(o00O.\u00f6O0000)) {
            return while.\u00d5\u00f4\u00f4000;
        }
        if (o00O2.equals(o00O.\u00d4O0000)) {
            return while.nullreturnnew;
        }
        return null;
    }

    private Integer o00000(int n) {
        if (n < 2) {
            return 0;
        }
        if (n == 2) {
            return 13;
        }
        return 12 + n;
    }

    private boolean o00000(int n, helden.framework.D.P p2) {
        boolean bl = this.new.o00000(b_0.newwhilesuper) >= 15 && this.new.o00000(b_0.\u00f8\u00f4\u00d2000) >= 15;
        boolean bl2 = this.new.o00000(b_0.newwhilesuper) >= 17 && this.new.o00000(b_0.\u00f8\u00f4\u00d2000) >= 15;
        switch (n) {
            case 0: {
                return this.new.o00000(I.\u00f5\u00d8o000) || this.new.o00000(I.forsupersuper);
            }
            case 1: {
                return bl && this.new.\u00d3O0000() && this.new.\u00d300000(p2.toString().substring(16)) >= 50;
            }
        }
        return bl2 && this.new.\u00d3O0000() && this.new.o00000(I.forsupersuper) && this.new.\u00d300000(p2.toString().substring(16)) >= 50;
    }

    private _o o00000(ArrayList<String> arrayList, ArrayList<String> arrayList2, Bedingung bedingung) {
        _o _o2 = this.\u00d300000.contains((Object)bedingung.getBedingungsArt()) ? _o.Object : (bedingung.getBedingungsArt().equals((Object)Bedingung.BedingungsArten.\u00f8O0000) && bedingung.getVorteil().equals(I.\u00f5\u00d60000) ? _o.Object : (bedingung.getBedingungsArt().equals((Object)Bedingung.BedingungsArten.\u00d300000) ? (arrayList.contains(bedingung.getSfbezeichner().toString()) ? _o.Object : (arrayList2.contains(bedingung.getSfbezeichner().toString()) ? _o.\u00d400000 : _o.o00000)) : (this.\u00f500000(bedingung) ? _o.Object : _o.\u00d400000)));
        return _o2;
    }

    public static enum _o {
        Object,
        o00000,
        \u00d400000;

    }
}

