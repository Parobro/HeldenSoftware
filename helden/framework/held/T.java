/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held;

import helden.framework.C.A.void;
import helden.framework.C.I;
import helden.framework.C.M;
import helden.framework.C.Oo0O;
import helden.framework.C.private;
import helden.framework.D.OOOo;
import helden.framework.D.while;
import helden.framework.OOoO.o0Oo;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.X;
import helden.framework.OoOO.voidsuper;
import helden.framework.gmod.GMod;
import helden.framework.gmod.GModBezeichner;
import helden.framework.gmod.impl.TalenteSpaltenVerschiebung;
import helden.framework.held.D;
import helden.framework.held.K;
import helden.framework.held.Object.floatsuper;
import helden.framework.held.Stringsuper;
import helden.framework.held.o00O;
import helden.framework.int.String;
import helden.framework.oooo.o0oo_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooo_4;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.oooo.s_0;
import helden.model.kultur.Gjalskerlaender;
import helden.model.kultur.Thorwal;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class T
extends o00O<voidsuper> {
    private ArrayList<voidsuper> \u00d8O0000 = new ArrayList();
    private ArrayList<voidsuper> \u00f4O0000 = new ArrayList();
    private String \u00d6O0000 = new Thorwal().getID();
    private String interface = new Gjalskerlaender().getID();

    @Override
    public void super(T t) {
        for (voidsuper voidsuper2 : t.\u00d200000()) {
            this.super(voidsuper2, t.\u00d800000(voidsuper2));
        }
    }

    public void \u00d400000(voidsuper voidsuper2) {
        this.\u00f4O0000.add(voidsuper2);
    }

    @Override
    public void class(ArrayList<voidsuper> arrayList) {
        this.\u00f4O0000.addAll(arrayList);
    }

    public void \u00d200000(voidsuper voidsuper2) {
        this.\u00d8O0000.add(voidsuper2);
    }

    public void \u00d400000(ArrayList<voidsuper> arrayList) {
        this.\u00d8O0000.addAll(arrayList);
    }

    @Override
    public s_0 super(oo0o_0 oo0o_02, K k2, boolean bl) throws Stringsuper {
        voidsuper voidsuper2 = (voidsuper)oo0o_02;
        boolean bl2 = this.\u00d400000(voidsuper2);
        s_0 s_02 = this.class(oo0o_02, k2, bl);
        if (bl2) {
            s_02 = s_02.new();
        }
        if (this.super((oo0o_0)voidsuper2).equals(helden.framework.OoOO.D.o00000)) {
            s_02 = s_02.new();
        }
        if (this.super((oo0o_0)voidsuper2).equals(helden.framework.OoOO.D.\u00d200000)) {
            if (this.super((oo0o_0)voidsuper2, k2.\u00d500000())) {
                s_02 = s_02.new();
            } else {
                s_02 = s_02.new();
                s_02 = s_02.new();
            }
        }
        if (this.super((oo0o_0)voidsuper2).equals(helden.framework.OoOO.D.\u00d500000)) {
            s_02 = s_02.\u00d300000();
            if (this.\u00f400000(voidsuper2) >= 10) {
                s_02 = s_02.\u00d300000();
            }
        }
        return s_02;
    }

    public s_0 class(oo0o_0 oo0o_02, K k2, boolean bl) {
        boolean bl2;
        void void_;
        Object object;
        M m;
        M m2;
        int n;
        oooo_4 object22;
        Object object3;
        Oo0O oo0O = k2.\u00d500000();
        OOOo oOOo = k2.\u00f5O0000();
        voidsuper voidsuper2 = (voidsuper)oo0o_02;
        int n2 = -1;
        try {
            n2 = this.\u00f400000(voidsuper2);
        }
        catch (D d2) {
            // empty catch block
        }
        int n22 = n2 + 1;
        s_0 s_02 = voidsuper2.getKategorie(bl);
        if (voidsuper2 == voidsuper.\u00d8\u00f8\u00d6000 || voidsuper2 == voidsuper.o\u00d3\u00d8000 || voidsuper2 == voidsuper.\u00d8\u00d4\u00d6000) {
            s_02 = s_0.o00000;
        }
        if (voidsuper2 == voidsuper.\u00f4\u00d5\u00d5000 && !oOOo.\u00d200000(while.\u00d3\u00d2\u00d5000.toString()) || voidsuper2 == voidsuper.\u00d5\u00d8\u00d6000 && !oOOo.\u00d200000(while.\u00f8\u00f5\u00d3000.toString()) || voidsuper2 == voidsuper.nullpublicObject && !oOOo.\u00d200000(while.\u00f8\u00d80000.toString()) || voidsuper2 == voidsuper.\u00f5\u00d8\u00d6000 && !oOOo.\u00d200000(while.StringwhileString.toString()) || voidsuper2 == voidsuper.\u00d8\u00f8\u00d6000 && !oOOo.\u00d200000(while.\u00f8O\u00f6000.toString()) || voidsuper2 == voidsuper.\u00f4\u00f4\u00d5000 && !oOOo.\u00d200000(while.ifsupernew.toString()) || voidsuper2 == voidsuper.\u00d3\u00f5\u00d6000 && !oOOo.\u00d200000(while.Stringreturnsuper.toString()) || voidsuper2 == voidsuper.o\u00d6\u00d6000 && !oOOo.\u00d200000(while.\u00f8\u00d5o000.toString()) || voidsuper2 == voidsuper.\u00f8\u00f5\u00d6000 && !oOOo.\u00d200000(while.o\u00d3\u00d2000.toString()) || voidsuper2 == voidsuper.newthisString && !oOOo.\u00d200000(while.\u00f6\u00f6\u00d2000.toString()) || voidsuper2 == voidsuper.\u00f8\u00d4\u00d5000 && !oOOo.\u00d200000(while.\u00f6\u00f4\u00d2000.toString()) || voidsuper2 == voidsuper.O0\u00d8000 && !oOOo.\u00d200000(while.thisnewnew.toString()) || voidsuper2 == voidsuper.ifnewObject && !oOOo.\u00d200000(while.\u00d3\u00f4\u00d2000.toString()) || voidsuper2 == voidsuper.nullintObject && !oOOo.\u00d200000(while.o\u00d4\u00f4000.toString())) {
            s_02 = s_02.new(2);
        }
        if (voidsuper2.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d800000)) {
            floatsuper floatsuper2 = new floatsuper(k2);
            object3 = (oooo_4)voidsuper2;
            if (!floatsuper2.Object(((oooo_4)object3).\u00d2\u00d5O000())) {
                s_02 = s_02.new(2);
            }
            if (floatsuper2.Object(((oooo_4)object3).publicfor())) {
                s_02 = s_02.new();
            }
        }
        int n3 = 0;
        if (oo0O.\u00d400000(I.\u00f4\u00d20000) && ((M)(object3 = (M)oo0O.\u00d300000(I.\u00f4\u00d20000))).\u00f400000(voidsuper2)) {
            ++n3;
        }
        if (voidsuper2 instanceof oooo_4 && oo0O.\u00d400000(I.\u00d3\u00d2O000) && ((M)(object3 = (M)oo0O.\u00d300000(I.\u00d3\u00d2O000))).\u00f400000((o0Oo)(object22 = (oooo_4)voidsuper2).o\u00d5O000())) {
            ++n3;
        }
        if (oo0O.\u00d400000(I.\u00d5o0000)) {
            object3 = (M)oo0O.\u00d300000(I.\u00d5o0000);
            Iterator n5 = ((private)object3).intsuper().iterator();
            while (n5.hasNext()) {
                if (!oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.o00000(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.o00000((String)n5.next()), voidsuper2)) continue;
                ++n3;
            }
        }
        for (GMod gMod : k2.o00000(GModBezeichner.\u00f400000)) {
            TalenteSpaltenVerschiebung void_2 = (TalenteSpaltenVerschiebung)gMod;
            if (!void_2.isAktuellNutzbar(n2, voidsuper2)) continue;
            s_02 = s_02.new(void_2.getVerschiebung());
        }
        int n4 = 0;
        if (oo0O.\u00d400000(I.whilereturnsuper) && (voidsuper2.equals(E.newnewString) || voidsuper2.equals(voidsuper.o\u00d2\u00d8000) || voidsuper2.equals(voidsuper.OO\u00d6000) || voidsuper2.equals(voidsuper.\u00d4\u00d2\u00d8000) || voidsuper2.equals(voidsuper.returnforObject) || voidsuper2.equals(voidsuper.thisvoidObject) || voidsuper2.equals(voidsuper.\u00d4\u00d8\u00d6000) || voidsuper2.equals(voidsuper.\u00d5\u00f6\u00d5000))) {
            ++n4;
        }
        int n5 = 10;
        if (oo0O.\u00d400000(I.O\u00f8o000)) {
            int n6 = 15;
        }
        if (oo0O.\u00d400000(I.O\u00f60000)) {
            int g2 = 0;
            try {
                g2 = k2.\u00d800000().\u00d500000(String._o.\u00d500000).getTalente().\u00d400000(voidsuper2);
            }
            catch (X x) {
                // empty catch block
            }
            if (g2 > 0 || voidsuper2.\u00f5\u00d60000()) {
                n = 15;
            }
        }
        if (bl && n22 <= n) {
            boolean bl3;
            boolean bl22 = k2.new(I.ifprivate) || k2.new(I.\u00d50\u00d2000);
            boolean bl4 = bl3 = voidsuper2.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000) || voidsuper2.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f600000) || voidsuper2.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d8O0000);
            if (bl22 && bl3) {
                ++n4;
            }
            if ((k2.new(I.o\u00d6o000) || k2.new(I.\u00d3\u00d3o000) || k2.new(I.returnfor)) && voidsuper2.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f400000)) {
                n4 += 2;
            }
        }
        s_02 = s_02.\u00d300000(Math.max(n4, n3));
        if (oo0O.\u00d400000(I.fordo) && (m2 = (M)oo0O.\u00d300000(I.fordo)).\u00f400000(voidsuper2)) {
            s_02 = s_02.\u00d300000();
        }
        if (voidsuper2 instanceof oooo_4 && oo0O.\u00d400000(I.newString) && (m = (M)oo0O.\u00d300000(I.newString)).\u00f400000(((oooo_4)(object = (oooo_4)voidsuper2)).o\u00d5O000())) {
            s_02 = s_02.\u00d300000();
        }
        if (oo0O.\u00d400000(I.\u00d8\u00f8O000)) {
            M m3 = (M)oo0O.\u00d300000(I.\u00d8\u00f8O000);
            object = m3.intsuper().iterator();
            while (object.hasNext()) {
                if (!oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.o00000(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.o00000((String)object.next()), voidsuper2)) continue;
                s_02 = s_02.\u00d300000();
            }
        }
        if (oo0O.\u00d400000(I.\u00d3\u00d3O000) && (void_ = (void)oo0O.\u00d300000(I.\u00d3\u00d3O000)).o00000(voidsuper2.getArt())) {
            s_02 = s_02.\u00d300000();
        }
        switch (k2.oO0000().getHauptSetting()) {
            case \u00f600000: {
                if (!oo0O.\u00d400000(I.\u00f4\u00f5o000) || !voidsuper2.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d8O0000) && !voidsuper2.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.super)) break;
                s_02 = s_02.\u00d300000();
                break;
            }
            default: {
                if (!oo0O.\u00d400000(I.\u00f4\u00f5o000) || bl || !voidsuper2.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d8O0000) && !voidsuper2.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.super)) break;
                s_02 = s_02.\u00d300000();
            }
        }
        if (oo0O.\u00d400000(I.\u00f5\u00d6o000) && !voidsuper2.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.Oo0000) && !voidsuper2.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f400000)) {
            s_02 = s_02.\u00d300000();
        }
        if (oo0O.\u00d400000(I.newreturn) && !this.super((oo0o_0)voidsuper2, oo0O)) {
            s_02 = s_02.\u00d300000();
        }
        if (!bl && voidsuper2.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000)) {
            boolean bl5;
            G g2 = (G)voidsuper2;
            object = k2.O\u00d20000();
            boolean bl6 = g2.equals(object);
            boolean bl7 = g2.\u00d200000((G)object);
            boolean bl8 = k2.\u00d800000().getZweitLehrsprache().contains(g2) || k2.\u00f800000().getZweitLehrsprache().contains(g2);
            boolean bl9 = bl5 = g2.equals(G.o\u00f8\u00f5000) || g2.equals(G.StringdoString) || g2.equals(G.\u00f4\u00d8\u00f5000);
            if (!(bl6 || bl7 || bl8 || bl5)) {
                s_02 = s_02.\u00d300000();
            }
            if (k2.O\u00d20000().equals(G.\u00d8\u00d3\u00f5000) && k2.\u00f800000().getID().equals(this.\u00d6O0000) && voidsuper2.equals(G.whilewhileString)) {
                s_02 = s_02.new();
            }
            if (k2.O\u00d20000().equals(G.whilewhileString) && voidsuper2.equals(G.\u00d8\u00d3\u00f5000)) {
                s_02 = s_02.new();
            }
            if (k2.O\u00d20000().equals(G.\u00f8\u00f6\u00f5000) && voidsuper2.equals(G.\u00d8\u00d3\u00f5000)) {
                s_02 = s_02.new();
            }
            if (k2.O\u00d20000().equals(G.\u00d8\u00d3\u00f5000) && k2.\u00f800000().getID().equals(this.interface) && voidsuper2.equals(G.\u00f8\u00f6\u00f5000)) {
                s_02 = s_02.new();
            }
            if (k2.O\u00d20000().equals(G.whilewhileString) && (voidsuper2.equals(G.o\u00d8\u00f5000) || voidsuper2.equals(G.\u00d4\u00d6\u00f5000))) {
                s_02 = s_02.new();
            }
            if (k2.O\u00d20000().equals(G.nullsuperclass) && (voidsuper2.equals(G.\u00f5\u00d5\u00f5000) || voidsuper2.equals(G.O\u00d6\u00f5000))) {
                s_02 = s_02.new();
            }
        }
        if (!bl && voidsuper2.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f600000) && !(bl2 = k2.O\u00d20000().\u00f6\u00f40000().contains(voidsuper2))) {
            s_02 = s_02.\u00d300000();
        }
        return s_02;
    }

    public voidsuper \u00d200000(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1 oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12) {
        int n = -9999;
        voidsuper voidsuper2 = null;
        for (voidsuper voidsuper3 : this.\u00d200000()) {
            int n2;
            if (!oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.o00000(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12, voidsuper3) || (n2 = this.\u00d800000(voidsuper3)) <= n) continue;
            n = n2;
            voidsuper2 = voidsuper3;
        }
        return voidsuper2;
    }

    public voidsuper \u00d2o0000() {
        Iterator<voidsuper> iterator = this.super();
        while (iterator.hasNext()) {
            voidsuper voidsuper2 = iterator.next();
            if (!voidsuper2.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d200000)) continue;
            return voidsuper2;
        }
        return null;
    }

    public ArrayList<voidsuper> \u00f8O0000() {
        return this.\u00f4O0000;
    }

    public ArrayList<voidsuper> voidsuper() {
        return this.\u00d8O0000;
    }

    public voidsuper Oo0000() {
        ArrayList<voidsuper> arrayList = new ArrayList<voidsuper>(3);
        Iterator<voidsuper> iterator = this.super();
        while (iterator.hasNext()) {
            voidsuper voidsuper2 = iterator.next();
            if (!voidsuper2.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d300000)) continue;
            arrayList.add(voidsuper2);
        }
        if (arrayList.size() == 0) {
            return null;
        }
        if (arrayList.size() == 1) {
            return (voidsuper)arrayList.get(0);
        }
        int n = 0;
        voidsuper voidsuper3 = null;
        for (voidsuper voidsuper4 : arrayList) {
            try {
                if (this.\u00f400000(voidsuper4) < n) continue;
                n = this.\u00f400000(voidsuper4);
                voidsuper3 = voidsuper4;
            }
            catch (D d2) {
                throw new RuntimeException(d2);
            }
        }
        return voidsuper3;
    }

    public voidsuper \u00f6O0000() {
        voidsuper voidsuper2 = null;
        int n = -1;
        try {
            Iterator<voidsuper> iterator = this.super();
            while (iterator.hasNext()) {
                voidsuper voidsuper3 = iterator.next();
                if (!voidsuper3.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f600000) || this.\u00f400000(voidsuper3) < n) continue;
                n = this.\u00f400000(voidsuper3);
                voidsuper2 = voidsuper3;
            }
        }
        catch (D d2) {
            throw new RuntimeException(d2);
        }
        return voidsuper2;
    }

    public int Objectsuper() {
        int n;
        try {
            voidsuper voidsuper2 = this.\u00f6O0000();
            n = voidsuper2 != null ? this.\u00f400000(voidsuper2) : -1;
        }
        catch (D d2) {
            n = -1;
        }
        return n;
    }

    @Override
    public float \u00d200000(oo0o_0 oo0o_02, K k2, boolean bl) throws Stringsuper {
        int n = k2.\u00d300000(oo0o_02);
        return this.\u00d200000(oo0o_02, k2, n, bl);
    }

    public float \u00d200000(oo0o_0 oo0o_02, K k2, int n, boolean bl) throws Stringsuper {
        float f2;
        s_0 s_02 = this.super(oo0o_02, k2, bl);
        if (n == -1 && oo0o_02 instanceof voidsuper && !((voidsuper)oo0o_02).\u00f5\u00d60000()) {
            f2 = this.super(oo0o_02, k2, false, bl) * 2;
        } else if (n < 0) {
            f2 = this.super(oo0o_02, k2, false, bl);
        } else {
            f2 = o0oo_0.super(s_02, n + 1);
            f2 = this.super(oo0o_02, k2, f2);
        }
        f2 = Math.max(1.0f, f2);
        if (!bl && k2.\u00d400000(oo0o_02).equals(helden.framework.OoOO.D.\u00f400000)) {
            f2 = 0.0f;
        }
        return f2;
    }

    @Override
    public boolean super(oo0o_0 oo0o_02, Oo0O oo0O) {
        return oo0O.\u00d400000(I.newreturn) && (this.OO0000.contains(oo0o_02) || oo0o_02.istEchtesTalent() && ((voidsuper)oo0o_02).\u00f4\u00d60000() || oo0o_02.istGabe());
    }

    public boolean super(voidsuper voidsuper2) {
        return this.\u00f4O0000.contains(voidsuper2);
    }

    @Override
    public boolean \u00d300000(voidsuper voidsuper2) {
        return this.\u00d8O0000.contains(voidsuper2);
    }

    @Override
    public Iterator<voidsuper> super() {
        return super.super();
    }
}

