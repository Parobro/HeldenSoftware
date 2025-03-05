/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.Object;

import helden.framework.C.public;
import helden.framework.D.P;
import helden.framework.OoOO.D;
import helden.framework.OoOO.E;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.K;
import helden.framework.held.U;
import helden.framework.held.object.oooo_2;
import helden.framework.int.OooO;
import helden.framework.int.o0oo_0;
import helden.framework.int.super;
import helden.framework.oooo.b_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.settings.Settings;
import helden.framework.zauber.KonkreterZauber;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class H
extends oooo_2 {
    private HashMap<String, String> return;
    private List<String> \u00d800000 = new ArrayList<String>();

    public H(K k2) {
        super(k2);
        this.return = new HashMap();
    }

    public void \u00d300000(String string) {
        this.\u00d800000.add(string);
    }

    public void o00000(P p2, boolean bl) {
        this.\u00d800000().o00000(p2, bl);
    }

    public void o00000(public public_) {
        this.\u00d800000().o00000(public_, false);
    }

    public HashMap<String, String> \u00d2O0000() {
        return this.return;
    }

    public List<String> oO0000() {
        return this.\u00d800000;
    }

    public void \u00d3O0000() {
        Iterator<voidsuper> iterator = this.\u00d800000().\u00f8O0000().super();
        while (iterator.hasNext()) {
            voidsuper voidsuper2 = iterator.next();
            if (!voidsuper2.isKampftalent()) continue;
            E e = (E)voidsuper2;
            this.\u00d800000().o00000(voidsuper2, new U(e, this.\u00d800000().\u00f8O0000()));
        }
    }

    public void \u00d600000(int n) {
        this.\u00d800000().\u00d300000(n);
    }

    public void \u00d200000(b_0 b_02, int n) {
        this.\u00d800000().\u00d3\u00d30000().super(b_02, n);
    }

    @Override
    public void o00000(b_0 b_02, int n) {
        this.\u00d800000().\u00d3\u00d30000().super(b_02, n);
    }

    public void \u00d300000(b_0 b_02, int n) {
        this.\u00d800000().\u00d3\u00d30000().\u00d200000(b_02, n);
    }

    public void o00000(OooO oooO2) {
        this.\u00d800000().o00000(oooO2);
    }

    public void \u00d200000(oo0o_0 oo0o_02, D d2) {
        this.\u00d800000().o00000(oo0o_02, d2);
    }

    @Deprecated
    public void o00000(super super_) {
        throw new RuntimeException();
    }

    public void o00000(o0oo_0 o0oo_02) {
        this.\u00d800000().o00000(o0oo_02);
    }

    public void o00000(Settings settings) {
        this.\u00d800000().o00000(settings);
    }

    public void \u00d800000(int n) {
        this.\u00d800000().new(n);
    }

    public void \u00d200000(helden.framework.OoOO.U u2, Boolean bl) {
        if (u2.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.int)) {
            this.\u00d800000().\u00d3\u00d30000().super((b_0)u2, bl);
        } else if (u2.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f8O0000)) {
            this.\u00d800000().\u00d5o0000().super((KonkreterZauber)u2, bl);
        } else {
            this.\u00d800000().\u00f8O0000().super((voidsuper)u2, bl);
        }
    }
}

