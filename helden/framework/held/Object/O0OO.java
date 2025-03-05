/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.Object;

import helden.framework.C.D;
import helden.framework.C.I;
import helden.framework.C.M;
import helden.framework.C.Oo0O;
import helden.framework.C.ooOO;
import helden.framework.C.private;
import helden.framework.C.public;
import helden.framework.D.OOOo;
import helden.framework.D.P;
import helden.framework.Monat;
import helden.framework.OoOO.E;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.K;
import helden.framework.held.L;
import helden.framework.held.Object.H;
import helden.framework.held.Object.floatsuper;
import helden.framework.held.Object.for;
import helden.framework.held.T;
import helden.framework.held.U;
import helden.framework.held.a.oooo_2;
import helden.framework.int.OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.int.String;
import helden.framework.int.super;
import helden.framework.int.void;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.settings.Settings;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import helden.framework.zauber.ZauberFabrik;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class O0OO
extends H {
    private boolean while;
    private floatsuper OO0000;
    private for if;
    private Boolean \u00f800000;
    private Oo0O \u00f500000;
    private Oo0O \u00f400000;
    private OOOo oO0000;

    public O0OO(K k2) {
        super(k2);
        this.OO0000 = new floatsuper(k2);
        this.while = true;
        this.\u00f800000 = false;
    }

    @Override
    public void o00000(P p2, boolean bl) {
        throw new IllegalStateException("Falsches Werkzeug");
    }

    public void \u00d800000(P p2) {
        this.\u00d800000().\u00d500000(p2);
        for (oo0o_0 oo0o_02 : this.\u00d600000(p2)) {
            if (this.\u00d800000().\u00f8O0000().\u00d300000((voidsuper)oo0o_02)) continue;
            this.\u00d800000().o00000(oo0o_02, 0);
        }
        this.\u00d5O0000();
    }

    @Override
    public void o00000(public public_) {
        public public_2;
        this.\u00d800000().o00000(public_, false);
        this.\u00d6o0000().o00000(public_, true);
        if (public_.equals(I.\u00d8O0000)) {
            public_2 = (D)public_;
            this.\u00d800000().\u00d5o0000().\u00d300000(((D)public_2).\u00f4o0000(), 0);
        }
        if (public_ instanceof ooOO) {
            public_2 = (ooOO)public_;
            this.\u00d800000().\u00f8O0000().super(((ooOO)public_2).oo0000(), 3);
        }
        if (public_.equals(I.O\u00f50000)) {
            public_2 = (D)public_;
            for (helden.framework.OoOO.U u2 : ((private)public_2).intsuper()) {
                this.\u00d800000().\u00f8O0000().super(N.floatsuper().super((voidsuper)u2), 3);
            }
        }
        if (public_.equals(I.o\u00d40000)) {
            public_2 = (D)public_;
            for (helden.framework.OoOO.U u2 : ((private)public_2).intsuper()) {
                this.\u00d800000().\u00f8O0000().super(N.floatsuper().super((b_0)u2), 3);
            }
        }
    }

    public Oo0O \u00d3o0000() {
        if (this.\u00f400000 == null) {
            Object object;
            this.\u00f500000 = helden.framework.C.K.\u00d400000();
            Iterator<public> iterator = this.\u00f500000.\u00d500000();
            while (iterator.hasNext()) {
                object = iterator.next();
                if (!(object instanceof M)) continue;
                ((M)object).\u00d500000(1);
            }
            this.\u00f500000.o00000(0);
            this.\u00f400000 = new Oo0O();
            object = this.\u00d800000().oO0000();
            Iterator<public> iterator2 = this.\u00f500000.\u00d500000();
            while (iterator2.hasNext()) {
                public public_ = iterator2.next();
                if (!((Settings)object).contains(public_)) continue;
                if (public_.\u00f4O0000().equals(I.\u00d8O0000)) {
                    D d2 = (D)public_;
                    ArrayList<Zauber> arrayList = ZauberFabrik.getInstance().getUebernatuerlicheZauber(this.\u00d800000());
                    Iterator<Zauber> iterator3 = arrayList.iterator();
                    while (iterator3.hasNext()) {
                        KonkreterZauber konkreterZauber = KonkreterZauber.getZauber(iterator3.next().toString(), helden.framework.OOoO.K.\u00d400000, "");
                        if (d2.\u00d5o0000().contains(konkreterZauber)) continue;
                        d2.o00000(konkreterZauber, 1);
                    }
                }
                this.\u00f400000.\u00d300000(public_);
            }
        }
        return this.\u00f400000;
    }

    public super newsuper() {
        ArrayList<super> arrayList = this.\u00d800000().\u00d800000().Object(String._o.\u00d500000);
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList.get(0);
    }

    public super oo0000() {
        return this.\u00d800000().\u00d4O0000();
    }

    @Override
    public OOOo o00000(boolean bl) {
        if (this.oO0000 == null || bl) {
            this.oO0000 = new OOOo();
            this.oO0000.o00000(this.\u00d300000().o00000(this.\u00d800000().oO0000(), this.returnsuper()));
        }
        return this.oO0000;
    }

    public Settings \u00f5O0000() {
        return this.\u00d800000().oO0000();
    }

    public for \u00d6o0000() {
        if (this.if == null) {
            this.if = new for(this.\u00d800000());
            Iterator<public> iterator = this.\u00d800000().\u00d500000().\u00d500000();
            while (iterator.hasNext()) {
                this.if.o00000(iterator.next(), false);
            }
        }
        return this.if;
    }

    public boolean private() {
        Iterator<public> iterator = this.\u00d800000().\u00d500000().\u00d500000();
        while (iterator.hasNext()) {
            public public_ = iterator.next();
            if (!public_.toString().startsWith("G\u00f6ttergeschenk")) continue;
            return true;
        }
        return false;
    }

    public void \u00f6O0000() {
        Iterator<b_0> iterator = b_0.\u00d4\u00d60000();
        while (iterator.hasNext()) {
            b_0 b_02 = iterator.next();
            if (!b_02.publicString() || this.\u00d800000().\u00d3\u00d30000().\u00d800000().get(b_02) != null) continue;
            this.\u00d200000(b_02, 8);
            this.\u00d300000(b_02, 8);
            this.o00000(b_02, 0);
        }
        for (voidsuper object : N.floatsuper().\u00d3O0000()) {
            if (!object.\u00f5\u00d60000() || this.\u00d800000().\u00f8O0000().\u00d300000(object)) continue;
            this.\u00d800000().\u00f8O0000().super(object, 0);
        }
        if (this.\u00d800000().\u00f4O0000() == null) {
            helden.framework.held.A.E e = new helden.framework.held.A.E(1, Monat.public, 0, oooo_2.\u00d800000);
            this.\u00d800000().thissuper().super(e);
        }
    }

    @Override
    public void \u00d3O0000() {
        Iterator<voidsuper> iterator = this.\u00d800000().\u00f8O0000().super();
        while (iterator.hasNext()) {
            voidsuper voidsuper2 = iterator.next();
            if (!voidsuper2.isKampftalent()) continue;
            E e = (E)voidsuper2;
            if (this.\u00d800000().new((voidsuper)e) != null && this.\u00d800000().o00000((voidsuper)e) >= 0) continue;
            this.\u00d800000().o00000(voidsuper2, new U(e, this.\u00d800000().\u00f8O0000()));
        }
    }

    public Boolean \u00f8O0000() {
        return this.\u00f800000;
    }

    public boolean returnsuper() {
        return this.while;
    }

    public void \u00d8O0000() {
        this.\u00d800000().\u00d800000().Object(String._o.\u00d200000).clear();
    }

    public void \u00d6O0000() {
        this.\u00d800000().\u00d800000().Object(String._o.\u00d500000).clear();
    }

    public void ifsuper() {
        ArrayList<public> arrayList = new ArrayList<public>();
        Iterator<public> iterator = this.\u00d800000().\u00d500000().\u00d500000();
        while (iterator.hasNext()) {
            public public_ = iterator.next();
            if (!public_.toString().startsWith("G\u00f6ttergeschenk")) continue;
            arrayList.add(public_);
        }
        iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            this.\u00d800000().new(iterator.next());
        }
    }

    public void \u00f500000(P p2) {
        this.\u00d800000().\u00d400000(p2);
        for (oo0o_0 oo0o_02 : this.\u00d600000(p2)) {
            if (!this.\u00d800000().\u00f8O0000().\u00d300000((voidsuper)oo0o_02)) continue;
            this.\u00d800000().\u00f8O0000().super((voidsuper)oo0o_02);
        }
        this.\u00d5O0000();
    }

    public void \u00d200000(public public_) {
        public public_2;
        this.\u00d800000().new(public_);
        if (public_.equals(I.\u00d8O0000)) {
            public_2 = (D)public_;
            this.\u00d800000().\u00d5o0000().super(((D)public_2).\u00f4o0000());
        }
        if (public_ instanceof ooOO) {
            public_2 = (ooOO)public_;
            this.\u00d800000().\u00f8O0000().super(((ooOO)public_2).oo0000());
        }
    }

    public void \u00d5O0000() {
        this.oO0000 = null;
    }

    public void \u00d200000(super super_) {
        this.\u00d800000().\u00d800000().o00000(String._o.\u00d500000, super_, 0);
    }

    public void o00000(Boolean bl) {
        this.\u00f800000 = bl;
    }

    public void \u00d300000(super super_) {
        if (this.\u00d800000().\u00d800000().Object(String._o.\u00d300000).size() == 0) {
            this.\u00d800000().\u00d800000().Object(String._o.\u00d300000).add(super_);
        } else {
            this.\u00d800000().\u00d800000().Object(String._o.\u00d300000).set(0, super_);
        }
    }

    public void \u00d200000(Settings settings) {
        this.\u00d800000().o00000(settings);
    }

    public void \u00d200000(boolean bl) {
        if (this.while != bl) {
            this.\u00d5O0000();
            this.while = bl;
        }
    }

    public void String(super super_) {
        this.\u00d800000().\u00d800000().o00000(String._o.\u00d200000, super_, 0);
    }

    public void \u00d2o0000() {
        Iterator<OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> iterator = this.\u00d800000().newnew();
        while (iterator.hasNext()) {
            OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = iterator.next();
            this.\u00d200000(ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.getTalente());
            this.\u00d200000(ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.getZauberfertigkeiten());
        }
    }

    public void \u00d5o0000() {
        Iterator<OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> iterator = this.\u00d800000().newnew();
        while (iterator.hasNext()) {
            OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = iterator.next();
            this.o00000(ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.getTalente());
            this.o00000(ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.getZauberfertigkeiten());
        }
    }

    public boolean null(P p2) {
        return this.OO0000.Object(p2.\u00f5o0000());
    }

    private void o00000(oo0o_0 oo0o_02, int n) {
        if (oo0o_02.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f8O0000)) {
            L l2 = this.\u00d800000().\u00d5o0000();
            try {
                int n2 = l2.\u00d400000((KonkreterZauber)oo0o_02);
                l2.super((KonkreterZauber)oo0o_02, n2 + n);
            }
            catch (Exception exception) {
                l2.super((KonkreterZauber)oo0o_02, n);
            }
        } else {
            T t = this.\u00d800000().\u00f8O0000();
            try {
                int n3 = t.\u00f400000((voidsuper)oo0o_02);
                t.super((voidsuper)oo0o_02, n3 + n);
            }
            catch (Exception exception) {
                t.super((voidsuper)oo0o_02, n);
            }
        }
    }

    private ArrayList<oo0o_0> \u00d600000(P p2) {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        void void_ = new void(null);
        void_.o00000(p2, true);
        void_.setzeModifikationen();
        Iterator<oo0o_0> iterator = void_.getTalente().iterator();
        while (iterator.hasNext()) {
            arrayList.add(iterator.next());
        }
        return arrayList;
    }

    private void \u00d200000(OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, k_0 k_02) {
        for (oo0o_0 oo0o_02 : k_02) {
            int n = 0;
            n = k_02.\u00d400000(oo0o_02);
            if (oo0o_02.istZauber()) {
                if (!(oo0o_02 instanceof KonkreterZauber) || this.\u00d800000().\u00d5o0000().\u00d300000((KonkreterZauber)oo0o_02)) continue;
                this.\u00d800000().\u00d5o0000().super((KonkreterZauber)oo0o_02, (Integer)n);
                continue;
            }
            if (this.\u00d800000().\u00f8O0000().\u00d300000((voidsuper)oo0o_02)) continue;
            this.o00000(oo0o_02, n);
        }
    }

    private void o00000(OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, k_0 k_02) {
        for (oo0o_0 oo0o_02 : k_02) {
            int n = 0;
            n = k_02.\u00d400000(oo0o_02);
            if (oo0o_02.istZauber()) {
                this.\u00d800000().\u00d5o0000().super((KonkreterZauber)oo0o_02, (Integer)n);
                continue;
            }
            this.o00000(oo0o_02, n);
        }
    }
}

