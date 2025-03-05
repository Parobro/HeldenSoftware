/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held;

import helden.framework.C.A.B;
import helden.framework.C.A.void;
import helden.framework.C.I;
import helden.framework.C.public;
import helden.framework.D.while;
import helden.framework.HeldenMath;
import helden.framework.OOoO.R;
import helden.framework.gmod.GMod;
import helden.framework.gmod.GModBezeichner;
import helden.framework.gmod.impl.EigenschaftenSpaltenVerschiebung;
import helden.framework.gmod.impl.EigenschaftenWertModifizierer;
import helden.framework.gmod.impl.SpaltenVerschiebung;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.held.class;
import helden.framework.oooo.b_0;
import helden.framework.oooo.o0oo_0;
import helden.framework.oooo.s_0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class J
extends class<b_0> {
    private Map<b_0, Integer> \u00f600000;
    private Map<b_0, Integer> int;
    private OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO \u00f400000;
    private int \u00d600000;
    private int \u00f800000;
    private ArrayList<b_0> \u00d800000;

    public J(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        this.\u00f400000 = oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2;
        this.do();
        this.\u00f600000 = new HashMap<b_0, Integer>();
        this.int = new HashMap<b_0, Integer>();
        this.\u00d800000 = new ArrayList();
    }

    public void \u00d300000(int n) {
        this.\u00d600000 += n;
    }

    public void class(int n) {
        this.\u00f800000 += n;
    }

    public void \u00d300000(b_0 b_02) {
        this.\u00d800000.add(b_02);
    }

    @Override
    public void super(ArrayList<b_0> arrayList) {
        this.\u00d800000.addAll(arrayList);
    }

    public int \u00d3O0000(b_0 b_02) {
        int n;
        int n2 = 0;
        if (b_02.equals(b_0.\u00d3\u00f4\u00d2000)) {
            n = 2 * this.do(b_0.returnwhilesuper) + this.do(b_0.privatedosuper);
            n2 = HeldenMath.haelfte(n);
        }
        if (b_02.equals(b_0.thispublicsuper)) {
            n = this.do(b_0.whilewhilesuper) + this.do(b_0.returnwhilesuper) + this.do(b_0.\u00f4\u00f4\u00d2000);
            n2 = HeldenMath.haelfte(n);
        }
        if (b_02.equals(b_0.\u00f8\u00d8\u00d2000)) {
            n = this.do(b_0.whilewhilesuper) + this.do(b_0.\u00f4\u00f4\u00d2000) + this.do(b_0.privatedosuper);
            n2 = HeldenMath.fuenftel(n);
        }
        if (b_02.equals(b_0.ifwhilesuper)) {
            n = this.do(b_0.\u00f8\u00f4\u00d2000) + this.do(b_0.\u00f4\u00f4\u00d2000) + this.do(b_0.privatedosuper);
            n2 = HeldenMath.fuenftel(n);
        }
        if (b_02.equals(b_0.\u00f5\u00f4\u00d2000)) {
            n = this.do(b_0.\u00f8\u00f4\u00d2000) + this.do(b_0.O\u00f5\u00d2000) + this.do(b_0.privatedosuper);
            n2 = HeldenMath.fuenftel(n);
        }
        if (b_02.equals(b_0.\u00f4\u00d8\u00d2000)) {
            n = 2 * this.do(b_0.whilewhilesuper) + this.do(b_0.\u00f8\u00f4\u00d2000) + this.do(b_0.\u00f4\u00f4\u00d2000);
            n2 = HeldenMath.fuenftel(n);
        }
        if (b_02.equals(b_0.\u00d8\u00f5\u00d2000)) {
            n = this.do(b_0.whilewhilesuper) + this.do(b_0.newwhilesuper) + this.do(b_0.returnwhilesuper);
            n2 = HeldenMath.fuenftel(n);
        }
        if (b_02.equals(b_0.\u00f4\u00f5\u00d2000)) {
            n = this.do(b_0.whilewhilesuper) + this.do(b_0.\u00f8\u00f4\u00d2000) + this.do(b_0.\u00d5\u00f4\u00d2000);
            if (this.\u00f400000.new(while.\u00d3\u00d5\u00d6000.toString())) {
                n += this.do(b_0.\u00d5\u00f4\u00d2000);
            }
            n2 = HeldenMath.haelfte(n);
        }
        if (b_02.equals(b_0.O\u00f4\u00d2000) && b_02.equals(b_0.O\u00f4\u00d2000)) {
            n2 = 8;
            if (this.\u00f400000.o00000(b_0.\u00f4\u00f4\u00d2000) >= 16) {
                ++n2;
            }
            if (this.\u00f400000.o00000(b_0.\u00f4\u00f4\u00d2000) <= 10) {
                --n2;
            }
        }
        if (b_02.equals(b_0.\u00d5\u00f5\u00d2000)) {
            return HeldenMath.haelfte(this.\u00f400000.o00000(b_0.returnwhilesuper));
        }
        return n2;
    }

    public int interface() {
        return this.do(b_0.\u00f4\u00f5\u00d2000);
    }

    public int int() {
        return this.do(b_0.\u00f8\u00d8\u00d2000);
    }

    public int \u00d2O0000() {
        return this.do(b_0.thispublicsuper);
    }

    public int \u00f600000() {
        return this.do(b_0.\u00f5\u00f4\u00d2000);
    }

    public int do(b_0 b_02) {
        if (b_02.equals(b_0.o\u00f5\u00d2000)) {
            return 0;
        }
        if (b_02.equals(b_0.\u00f5\u00d8\u00d2000)) {
            return 1000;
        }
        int n = 0;
        if (!b_02.equals(b_0.O\u00f4\u00d2000) && !b_02.equals(b_0.\u00d5\u00f5\u00d2000)) {
            n = this.\u00d200000(b_02);
        }
        n += this.\u00d200000(b_02);
        n += this.\u00d3O0000(b_02);
        if (b_02.equals(b_0.thispublicsuper) && this.\u00f400000.o00000(I.\u00f8\u00d2o000)) {
            n = HeldenMath.haelfte(n);
        }
        if (b_02.equals(b_0.\u00f4\u00f5\u00d2000) && !this.\u00f400000.oo0000()) {
            n = 0;
        }
        return n;
    }

    public int \u00d4O0000() {
        return this.\u00d600000;
    }

    public int \u00f400000() {
        return this.do(b_0.\u00f4\u00d8\u00d2000);
    }

    public int \u00d3O0000() {
        return this.do(b_0.\u00d4\u00f5\u00d2000);
    }

    public int class() {
        return this.\u00f800000;
    }

    public int OO0000() {
        return this.do(b_0.\u00d3\u00f4\u00d2000);
    }

    public ArrayList<b_0> \u00d400000() {
        return this.\u00d800000;
    }

    public int \u00f800000() {
        return this.do(b_0.\u00d8\u00f5\u00d2000);
    }

    public int \u00d800000(b_0 b_02) {
        if (b_02.publicString()) {
            void void_;
            int n;
            int n2 = this.OO0000(b_02);
            int n3 = n = HeldenMath.anderthalbGerundet(n2 += this.\u00d200000(b_02));
            if (this.\u00f400000.o00000(I.\u00d3\u00d3O000) && (void_ = (void)this.\u00f400000.\u00d500000().\u00d300000(I.\u00d3\u00d3O000)).\u00d200000(b_02)) {
                n3 = Math.min(11, n3);
            }
            if (this.\u00f400000.o00000(I.\u00f8\u00d2o000) && (b_02.equals(b_0.\u00f4\u00f4\u00d2000) || b_02.equals(b_0.O\u00f5\u00d2000))) {
                n3 = Math.min(n3, n - 4);
            }
            if (this.\u00f400000.o00000(I.whilereturnsuper) && b_02.equals(b_0.privatedosuper)) {
                n3 -= 2;
            }
            return n3;
        }
        if (b_02.equals(b_0.\u00f4\u00f5\u00d2000)) {
            int n = this.do(b_0.\u00d5\u00f4\u00d2000);
            return n + this.\u00d200000(b_0.\u00f4\u00f5\u00d2000) + this.\u00d3O0000(b_0.\u00f4\u00f5\u00d2000);
        }
        if (b_02.equals(b_0.\u00d3\u00f4\u00d2000)) {
            return HeldenMath.haelfte(this.do(b_0.returnwhilesuper)) + this.\u00d200000(b_0.\u00d3\u00f4\u00d2000) + this.\u00d3O0000(b_0.\u00d3\u00f4\u00d2000);
        }
        if (b_02.equals(b_0.\u00d8\u00f5\u00d2000)) {
            return HeldenMath.haelfte(this.do(b_0.whilewhilesuper)) + this.\u00d200000(b_0.\u00d8\u00f5\u00d2000) + this.\u00d3O0000(b_0.\u00d8\u00f5\u00d2000);
        }
        if (b_02.equals(b_0.thispublicsuper)) {
            return this.do(b_0.returnwhilesuper) + this.\u00d200000(b_0.thispublicsuper) + this.\u00d3O0000(b_0.thispublicsuper);
        }
        if (b_02.equals(b_0.\u00d4\u00f5\u00d2000)) {
            return this.do(b_0.\u00f8\u00f4\u00d2000) + this.\u00d200000(b_0.\u00d4\u00f5\u00d2000) + this.\u00d3O0000(b_0.\u00d4\u00f5\u00d2000);
        }
        return 0;
    }

    public int interface(b_0 b_02) {
        int n = b_02.equals(b_0.thispublicsuper) && this.\u00f400000.o00000(I.\u00f8\u00d2o000) ? this.\u00d800000(b_02) - 2 * this.do(b_02) : this.\u00d800000(b_02) - this.do(b_02);
        return n;
    }

    @Override
    public int \u00d200000(b_0 b_02) {
        int n = this.\u00f400000(b_02) + this.int(b_02) + this.\u00d2O0000(b_02) + this.\u00f600000(b_02);
        if (b_02.equals(b_0.\u00f4\u00f5\u00d2000)) {
            n += this.\u00d600000;
            if (this.\u00f400000.o00000(I.\u00d4\u00d80000)) {
                helden.framework.C.J j2 = (helden.framework.C.J)this.\u00f400000.\u00d500000().\u00d300000(I.\u00d4\u00d80000);
                n += j2.ObjectString();
            }
        }
        if (b_02.equals(b_0.\u00d4\u00f5\u00d2000)) {
            n += this.\u00f800000;
        }
        return n += this.super(b_02);
    }

    public int \u00f600000(b_0 b_02) {
        int n = 0;
        for (GMod gMod : this.\u00f400000.o00000(GModBezeichner.\u00d300000)) {
            EigenschaftenWertModifizierer eigenschaftenWertModifizierer = (EigenschaftenWertModifizierer)gMod;
            if (!eigenschaftenWertModifizierer.isAktuellNutzbar(b_02)) continue;
            n += eigenschaftenWertModifizierer.getWert().intValue();
        }
        return n;
    }

    public int \u00f400000(b_0 b_02) {
        int n = 0;
        if (this.\u00f400000.o\u00d20000() != null) {
            n += this.\u00f400000.o\u00d20000().getModifikator(b_02);
        }
        if (this.\u00f400000.\u00f800000() != null) {
            n += this.\u00f400000.\u00f800000().getModifikator(b_02);
        }
        if (this.\u00f400000.\u00d800000() != null) {
            int n2 = this.\u00f400000.\u00d800000().getModifikator(b_02);
            n += n2;
        }
        return n;
    }

    public int int(b_0 b_02) {
        if (this.\u00f400000.O\u00d30000() != null) {
            return this.\u00f400000.O\u00d30000().getModifikator(b_02);
        }
        return 0;
    }

    public int \u00d2O0000(b_0 b_02) {
        if (this.\u00f400000.\u00d4\u00d20000() != null) {
            return this.\u00f400000.\u00d4\u00d20000().getModifikator(b_02);
        }
        return 0;
    }

    public int \u00d600000() {
        return this.do(b_0.ifwhilesuper);
    }

    public int super(b_0 b_02) {
        Integer n = this.int.get(b_02);
        if (n == null) {
            return 0;
        }
        return n;
    }

    public int \u00f800000(b_0 b_02) {
        int n = 0;
        if (b_02.equals(b_0.\u00f4\u00f5\u00d2000)) {
            n = 50;
            if (this.\u00f400000.new(while.\u00f6\u00d6\u00f5000.toString())) {
                n = 40;
            }
            if (this.\u00f400000.new(while.whilesuperclass.toString())) {
                n = 30;
            }
        }
        return n;
    }

    public int OO0000(b_0 b_02) {
        if (b_02.equals(b_0.\u00d5\u00f5\u00d2000)) {
            return this.\u00f400000.\u00d3\u00d30000().OO0000(b_0.returnwhilesuper) / 2;
        }
        if (b_02.equals(b_0.\u00d3\u00f4\u00d2000)) {
            return (this.\u00f400000.\u00d3\u00d30000().OO0000(b_0.returnwhilesuper) * 2 + this.\u00f400000.\u00d3\u00d30000().OO0000(b_0.privatedosuper) + 1) / 2;
        }
        if (b_02.equals(b_0.thispublicsuper)) {
            return (this.\u00f400000.\u00d3\u00d30000().OO0000(b_0.whilewhilesuper) + this.\u00f400000.\u00d3\u00d30000().OO0000(b_0.returnwhilesuper) + this.\u00f400000.\u00d3\u00d30000().OO0000(b_0.\u00f4\u00f4\u00d2000) + 1) / 2;
        }
        if (b_02.equals(b_0.\u00f4\u00f5\u00d2000)) {
            if (this.\u00f400000.oo0000()) {
                return (this.\u00f400000.\u00d3\u00d30000().OO0000(b_0.whilewhilesuper) + this.\u00f400000.\u00d3\u00d30000().OO0000(b_0.\u00f8\u00f4\u00d2000) + this.\u00f400000.\u00d3\u00d30000().OO0000(b_0.\u00d5\u00f4\u00d2000) + 1) / 2;
            }
            return 0;
        }
        if (b_02.equals(b_0.\u00d4\u00f5\u00d2000)) {
            return 0;
        }
        if (b_02.equals(b_0.\u00d8\u00f5\u00d2000)) {
            return (this.\u00f400000.\u00d3\u00d30000().OO0000(b_0.whilewhilesuper) + this.\u00f400000.\u00d3\u00d30000().OO0000(b_0.newwhilesuper) + this.\u00f400000.\u00d3\u00d30000().OO0000(b_0.returnwhilesuper) + 2) / 5;
        }
        if (b_02.equals(b_0.\u00f4\u00d8\u00d2000)) {
            return (this.\u00f400000.\u00d3\u00d30000().OO0000(b_0.whilewhilesuper) + this.\u00f400000.\u00d3\u00d30000().OO0000(b_0.whilewhilesuper) + this.\u00f400000.\u00d3\u00d30000().OO0000(b_0.\u00f8\u00f4\u00d2000) + this.\u00f400000.\u00d3\u00d30000().OO0000(b_0.\u00f4\u00f4\u00d2000) + 2) / 5;
        }
        if (b_02.equals(b_0.\u00f8\u00d8\u00d2000)) {
            return (this.\u00f400000.\u00d3\u00d30000().OO0000(b_0.whilewhilesuper) + this.\u00f400000.\u00d3\u00d30000().OO0000(b_0.\u00f4\u00f4\u00d2000) + this.\u00f400000.\u00d3\u00d30000().OO0000(b_0.privatedosuper) + 2) / 5;
        }
        if (b_02.equals(b_0.ifwhilesuper)) {
            return (this.\u00f400000.\u00d3\u00d30000().OO0000(b_0.\u00f8\u00f4\u00d2000) + this.\u00f400000.\u00d3\u00d30000().OO0000(b_0.\u00f4\u00f4\u00d2000) + this.\u00f400000.\u00d3\u00d30000().OO0000(b_0.privatedosuper) + 2) / 5;
        }
        if (b_02.equals(b_0.\u00f5\u00f4\u00d2000)) {
            return (this.\u00f400000.\u00d3\u00d30000().OO0000(b_0.\u00f8\u00f4\u00d2000) + this.\u00f400000.\u00d3\u00d30000().OO0000(b_0.O\u00f5\u00d2000) + this.\u00f400000.\u00d3\u00d30000().OO0000(b_0.privatedosuper) + 2) / 5;
        }
        if (b_02.equals(b_0.O\u00f4\u00d2000)) {
            int n = 8;
            if (this.\u00f400000.o00000(b_0.\u00f4\u00f4\u00d2000) >= 16) {
                ++n;
            }
            if (this.\u00f400000.o00000(b_0.\u00f4\u00f4\u00d2000) <= 10) {
                --n;
            }
            return n;
        }
        return this.\u00f600000.get(b_02);
    }

    public Map<b_0, Integer> \u00d800000() {
        return this.\u00f600000;
    }

    public int \u00d600000(b_0 b_02) {
        int n = this.do(b_02);
        if (this.class(b_02)) {
            n = this.\u00d200000(b_02);
        }
        return this.\u00d300000(b_02, n);
    }

    public int \u00d300000(b_0 b_02, int n) {
        Object object2;
        int n2 = n + 1;
        s_0 s_02 = b_02.\u00d2\u00d60000();
        if (b_02.equals(b_0.\u00d5\u00f4\u00d2000) && this.\u00f400000.o00000(I.\u00f4\u00d6O000)) {
            s_02 = s_02.new();
        }
        if (this.\u00f400000.o00000(I.Oo0000)) {
            B b = (B)this.\u00f400000.\u00d500000().\u00d300000(I.Oo0000);
            for (Object object2 : b.intsuper()) {
                if (!b_02.equals(b.\u00d400000((R)object2))) continue;
                s_02 = s_02.new();
            }
        }
        if (this.\u00d400000(b_02).booleanValue()) {
            s_02 = s_02.new();
        }
        for (GMod gMod : this.\u00f400000.o00000(GModBezeichner.if)) {
            object2 = (EigenschaftenSpaltenVerschiebung)gMod;
            if (!((SpaltenVerschiebung)object2).isAktuellNutzbar(n, b_02)) continue;
            s_02 = s_02.new(((SpaltenVerschiebung)object2).getVerschiebung());
        }
        int n3 = o0oo_0.super(s_02, n2);
        Iterator<public> iterator = this.\u00f400000.\u00d500000().\u00d500000();
        while (iterator.hasNext()) {
            object2 = iterator.next();
            if (!((public)object2).toString().equals("Miserable Eigenschaft: " + b_02.toString())) continue;
            n3 *= 2;
        }
        return n3;
    }

    public boolean \u00d400000(b_0 b_02) {
        return this.\u00d800000.contains(b_02);
    }

    public boolean \u00d4O0000(b_0 b_02) {
        return this.do(b_02) >= this.\u00d800000(b_02);
    }

    public void \u00d400000(int n) {
        this.\u00d600000 = n;
    }

    public void \u00d600000(int n) {
        this.\u00f800000 = n;
    }

    @Override
    public void super(b_0 b_02, int n) {
        this.int.put(b_02, n);
    }

    public void \u00d200000(b_0 b_02, int n) {
        this.\u00f600000.put(b_02, new Integer(n));
    }

    public boolean class(b_0 b_02) {
        return b_02.equals(b_0.\u00f4\u00f5\u00d2000) || b_02.equals(b_0.thispublicsuper) || b_02.equals(b_0.\u00d4\u00f5\u00d2000) || b_02.equals(b_0.\u00d8\u00f5\u00d2000) || b_02.equals(b_0.\u00d3\u00f4\u00d2000);
    }

    private void do() {
        this.super(b_0.whilewhilesuper, 0);
        this.super(b_0.newwhilesuper, 0);
        this.super(b_0.\u00f8\u00f4\u00d2000, 0);
        this.super(b_0.\u00d5\u00f4\u00d2000, 0);
        this.super(b_0.O\u00f5\u00d2000, 0);
        this.super(b_0.\u00f4\u00f4\u00d2000, 0);
        this.super(b_0.returnwhilesuper, 0);
        this.super(b_0.privatedosuper, 0);
        this.super(b_0.\u00f5\u00f5\u00d2000, 0);
        this.super(b_0.\u00d3\u00f4\u00d2000, 0);
        this.super(b_0.thispublicsuper, 0);
        this.super(b_0.\u00f4\u00f5\u00d2000, 0);
        this.super(b_0.\u00d8\u00f5\u00d2000, 0);
        this.super(b_0.\u00f8\u00d8\u00d2000, 0);
        this.super(b_0.ifwhilesuper, 0);
        this.super(b_0.\u00f5\u00f4\u00d2000, 0);
        this.super(b_0.\u00f4\u00d8\u00d2000, 0);
        this.super(b_0.\u00d4\u00f5\u00d2000, 0);
    }
}

