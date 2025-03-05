/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.object;

import helden.framework.C.I;
import helden.framework.Geschlecht;
import helden.framework.HeldenMath;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.D;
import helden.framework.held.K;
import helden.framework.held.OOOo;
import helden.framework.held.Object.floatsuper;
import helden.framework.held.T;
import helden.framework.held.int;
import helden.framework.held.oooo_0;
import helden.framework.int.OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.oooo.b_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.model.kultur.ElfischeSiedlung;
import java.util.ArrayList;
import java.util.HashMap;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from helden.framework.held.Object.oOoO
 */
public abstract class oooo_2 {
    private helden.framework.held.Object.T o00000;
    private K \u00d400000;
    protected helden.framework.D.OOOo \u00d300000 = new helden.framework.D.OOOo();
    private floatsuper new;

    public oooo_2(K k2) {
        this.\u00d400000 = k2;
        this.new = new floatsuper(k2);
    }

    public int o00000() {
        int n = this.\u00d800000().o\u00d20000().wurfeleAlter();
        if (this.\u00d800000().o00000(I.O\u00f8o000)) {
            n += 5;
        }
        if (this.\u00d800000().o00000(I.O\u00f60000)) {
            n += 6;
        }
        if (this.\u00d800000().\u00d4O0000().istZeitaufwendig()) {
            n += 3;
        }
        if (this.\u00d800000().o00000(I.O\u00d80000)) {
            n += HeldenMath.haelfte(this.\u00d800000().\u00d500000().\u00d300000(I.O\u00d80000).supersuper());
        }
        return n;
    }

    public floatsuper null() {
        return this.new;
    }

    public K \u00d800000() {
        return this.\u00d400000;
    }

    public helden.framework.D.OOOo o00000(boolean bl) {
        throw new IllegalStateException("Falsches Werkzeug");
    }

    public WaehlbareZauber \u00f500000() {
        if (this.\u00d400000.o\u00d50000() && !this.\u00d400000.\u00f4\u00d40000() && !this.\u00d800000().oo0000()) {
            ElfischeSiedlung elfischeSiedlung = new ElfischeSiedlung();
            return ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)elfischeSiedlung).getWaehlbareZauber();
        }
        WaehlbareZauber waehlbareZauber = new WaehlbareZauber();
        waehlbareZauber.addAll(this.\u00d800000().\u00d4O0000().getWaehlbareZauber());
        waehlbareZauber.addAll(this.\u00d800000().\u00f800000().getWaehlbareZauber());
        return waehlbareZauber;
    }

    public helden.framework.held.Object.T \u00d300000() {
        if (this.o00000 == null) {
            this.o00000 = new helden.framework.held.Object.T(this.\u00d800000(), this.\u00d200000());
        }
        return this.o00000;
    }

    public ArrayList<oo0o_0> \u00d500000() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        HashMap<oo0o_0, ArrayList<String>> hashMap = this.\u00d800000().\u00f5O0000().\u00d500000();
        for (voidsuper voidsuper2 : this.\u00d800000().\u00f8O0000().super(7)) {
            int n;
            if (!voidsuper2.istEchtesTalent() || !voidsuper2.isSpezialisierungenErlaubt() || !this.\u00d800000().oO0000().contains(voidsuper2)) continue;
            int n2 = this.\u00d800000().\u00f8O0000().\u00d800000(voidsuper2);
            int n3 = 0;
            if (hashMap.get(voidsuper2) != null) {
                n3 = hashMap.get(voidsuper2).size();
            }
            if ((n = (int)Math.floor((double)n2 / 7.0)) <= n3) continue;
            arrayList.add(voidsuper2);
        }
        return arrayList;
    }

    public ArrayList<oo0o_0> \u00d600000() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        HashMap<oo0o_0, ArrayList<String>> hashMap = this.\u00d800000().\u00f5O0000().\u00d500000();
        for (KonkreterZauber konkreterZauber : this.\u00d800000().\u00d5o0000().super(7)) {
            int n;
            int n2 = this.\u00d800000().\u00d5o0000().\u00d800000(konkreterZauber);
            int n3 = 0;
            if (hashMap.get(konkreterZauber) != null) {
                n3 = hashMap.get(konkreterZauber).size();
            }
            if ((n = (int)Math.floor((double)n2 / 7.0)) <= n3) continue;
            arrayList.add(konkreterZauber);
        }
        return arrayList;
    }

    public String String() {
        throw new IllegalStateException("Falsches Werkzeug");
    }

    public boolean \u00d200000() {
        return false;
    }

    public void \u00d200000(E e, int n) throws oooo_0, D, int {
        this.\u00d200000(e, n, false);
    }

    public void \u00d200000(E e, int n, boolean bl) throws oooo_0, D, int {
        this.\u00d800000().new(e, n, bl);
    }

    public void o00000(b_0 b_02, int n) {
        this.\u00d800000().\u00d3\u00d30000().super(b_02, n);
    }

    public void o00000(Geschlecht geschlecht) {
        this.\u00d800000().o00000(geschlecht);
    }

    public void o00000(String string) {
        this.\u00d800000().\u00d500000(string);
    }

    public void o00000(E e, int n) throws int, oooo_0 {
        this.o00000(e, n, false);
    }

    public void o00000(E e, int n, boolean bl) throws int, oooo_0 {
        this.\u00d800000().o00000(e, n, bl);
    }

    public void o00000(oo0o_0 oo0o_02) throws OOOo, D {
        T t = this.\u00d800000().\u00f8O0000();
        int n = t.\u00f400000((voidsuper)oo0o_02);
        int n2 = this.\u00d400000.\u00f8O0000().Objectsuper();
        if (oo0o_02 == voidsuper.whilenewObject && n >= 9 && t.\u00d200000(voidsuper.thisinterfaceObject, 4)) {
            throw new OOOo("Menschenkenntnis zu niedrig");
        }
        if (oo0o_02 == voidsuper.\u00d8\u00d5\u00d6000 && n >= 9 && t.\u00d200000(voidsuper.thisinterfaceObject, 4)) {
            throw new OOOo("Menschenkenntnis zu niedrig");
        }
        if (oo0o_02 == voidsuper.newnullObject && n >= 9) {
            if (t.\u00d200000(voidsuper.O0\u00d6000, 4)) {
                throw new OOOo("Etikette zu niedrig");
            }
            if (t.\u00d200000(voidsuper.forclassObject, 4)) {
                throw new OOOo("Sich verkleiden zu niedrig");
            }
            if (t.\u00d200000(voidsuper.newnewObject, 4)) {
                throw new OOOo("Singen zu niedrig");
            }
            if (t.\u00d200000(voidsuper.\u00d30\u00d8000, 4)) {
                throw new OOOo("\u00dcberreden zu niedrig");
            }
            if (t.\u00d200000(voidsuper.StringclassObject, 4)) {
                throw new OOOo("\u00dcberzeugen zu niedrig");
            }
        }
        if (oo0o_02 == voidsuper.\u00d30\u00d8000 && n >= 9 && t.\u00d200000(voidsuper.thisinterfaceObject, 4)) {
            throw new OOOo("Menschenkenntnis zu niedrig");
        }
        if (oo0o_02 == voidsuper.\u00d5\u00d6\u00d5000 && n >= 9 && t.\u00d200000(voidsuper.\u00d3\u00f4\u00d6000, 4)) {
            throw new OOOo("Wildnisleben zu niedrig");
        }
        if (oo0o_02 == voidsuper.\u00f5\u00f5\u00d5000 && n >= 9 && n2 < 6) {
            throw new OOOo("L/S zu niedrig");
        }
        if (oo0o_02 == voidsuper.\u00d5\u00d4\u00d6000 && n >= 9 && n2 < 6) {
            throw new OOOo("L/S zu niedrig");
        }
        if (oo0o_02 == voidsuper.\u00f4\u00f6\u00d5000 && n >= 9) {
            if (n2 < 6) {
                throw new OOOo("L/S zu niedrig");
            }
            if (t.\u00d200000(voidsuper.\u00d3\u00f4\u00d5000, 6)) {
                throw new OOOo("Malen/Zeichnen zu niedrig");
            }
            if (t.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 6)) {
                throw new OOOo("Rechnen zu niedrig");
            }
        }
        if (oo0o_02 == voidsuper.\u00d3\u00d6\u00d5000 && n >= 9) {
            if (n2 < 6) {
                throw new OOOo("L/S zu niedrig");
            }
            if (t.\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 6)) {
                throw new OOOo("Rechnen zu niedrig");
            }
            if (t.\u00d200000(voidsuper.o\u00d3\u00d6000, 6)) {
                throw new OOOo("Sinnensch\u00e4rfe zu niedrig");
            }
        }
        if (oo0o_02 == voidsuper.\u00d8\u00d5\u00d5000 && n >= 9 && t.\u00d200000(voidsuper.\u00d4\u00f6\u00d6000, 4)) {
            throw new OOOo("Tierkunde zu niedrig");
        }
        if (oo0o_02 == voidsuper.forObjectObject && n >= 9 && t.\u00d200000(voidsuper.\u00d50\u00d8000, 4)) {
            throw new OOOo("Gesteinskunde zu niedrig");
        }
        if (oo0o_02 == voidsuper.StringfloatObject && n >= 9 && t.\u00d200000(voidsuper.\u00d50\u00d8000, 4)) {
            throw new OOOo("Gesteinskunde zu niedrig");
        }
        if (oo0o_02 == voidsuper.oo\u00d8000 && n >= 9 && t.\u00d200000(voidsuper.\u00d3\u00d8\u00d5000, 4)) {
            throw new OOOo("Holzbearbeitung zu niedrig");
        }
        if (oo0o_02 == G.\u00f50\u00f5000 && t.\u00d200000(voidsuper.\u00d5\u00d4\u00d6000, 7)) {
            throw new OOOo("Geschichtswissen zu niedrig");
        }
    }
}

