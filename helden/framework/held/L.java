/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held;

import helden.framework.C.I;
import helden.framework.C.M;
import helden.framework.C.Oo0O;
import helden.framework.D.J;
import helden.framework.D.OOOo;
import helden.framework.D.OoOO.E;
import helden.framework.D.OoOO.F;
import helden.framework.D.P;
import helden.framework.D.void;
import helden.framework.D.while;
import helden.framework.HeldenMath;
import helden.framework.OOoO.if;
import helden.framework.OoOO.voidsuper;
import helden.framework.gmod.GMod;
import helden.framework.gmod.GModBezeichner;
import helden.framework.gmod.impl.SpaltenVerschiebung;
import helden.framework.held.D;
import helden.framework.held.K;
import helden.framework.held.Object.private;
import helden.framework.held.Object.public;
import helden.framework.held.Stringsuper;
import helden.framework.held.o00O;
import helden.framework.oooo.b_0;
import helden.framework.oooo.o0oo_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooo_4;
import helden.framework.oooo.s_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.TharunZauber;
import helden.framework.zauber.Zauber;
import helden.framework.zauber.ZauberInfos;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class L
extends o00O<KonkreterZauber> {
    private Map<String, ZauberInfos> \u00d2O0000 = new HashMap<String, ZauberInfos>();
    private ArrayList<KonkreterZauber> \u00d4O0000 = new ArrayList();
    private K \u00d3O0000;

    public L(K k2) {
        super(public.o00000());
        this.\u00d3O0000 = k2;
    }

    public void \u00d300000(KonkreterZauber konkreterZauber) {
        if (!this.\u00d4O0000.contains(konkreterZauber)) {
            this.\u00d4O0000.add(konkreterZauber);
        }
    }

    public void \u00d300000(ArrayList<KonkreterZauber> arrayList) {
        for (KonkreterZauber konkreterZauber : arrayList) {
            this.\u00d300000(konkreterZauber);
        }
    }

    public void super(KonkreterZauber konkreterZauber, Integer n) {
        this.\u00d300000(konkreterZauber, n);
    }

    public s_0 \u00d400000(oo0o_0 oo0o_02, K k2, boolean bl) throws Stringsuper {
        s_0 s_02 = this.\u00d300000(oo0o_02, k2, bl);
        KonkreterZauber konkreterZauber = (KonkreterZauber)oo0o_02;
        boolean bl2 = this.\u00d400000(konkreterZauber);
        if (bl2) {
            s_02 = s_02.new();
        }
        if (this.super((oo0o_0)konkreterZauber).equals(helden.framework.OoOO.D.o00000)) {
            s_02 = s_02.new();
        }
        if (this.super((oo0o_0)konkreterZauber).equals(helden.framework.OoOO.D.\u00d500000)) {
            s_02 = s_02.\u00d300000();
            if (this.\u00d400000(konkreterZauber) >= 10) {
                s_02 = s_02.\u00d300000();
            }
        }
        return s_02;
    }

    public s_0 \u00d300000(oo0o_0 oo0o_02, K k2, boolean bl) {
        int n;
        M m;
        Oo0O oo0O = k2.\u00d500000();
        OOOo oOOo = k2.\u00f5O0000();
        KonkreterZauber konkreterZauber = (KonkreterZauber)oo0o_02;
        s_0 s_02 = konkreterZauber.getKategorie(bl);
        switch (k2.oO0000().getHauptSetting()) {
            case \u00f600000: {
                if (!oo0O.\u00d400000(I.\u00f4\u00f5o000)) break;
                s_02 = s_02.\u00d300000();
                break;
            }
            default: {
                if (!oo0O.\u00d400000(I.\u00f4\u00f5o000) || bl || konkreterZauber.getKategorie(bl).compareTo(s_0.Object) < 0) break;
                s_02 = s_02.\u00d300000();
            }
        }
        if (oo0O.\u00d400000(I.\u00f5\u00d6o000)) {
            s_02 = s_02.\u00d300000();
        }
        helden.framework.OOoO.K k3 = konkreterZauber.getRep();
        if (this.\u00d4O0000.contains(konkreterZauber)) {
            s_02 = s_02.new();
        }
        if (this.super(k3, oOOo)) {
            s_02 = s_02.new(2);
            if (oOOo.\u00d200000(while.\u00f8O\u00f6000.toString()) && (k3.equals(helden.framework.OOoO.K.\u00f8O0000) || k3.equals(helden.framework.OOoO.K.\u00d8o0000))) {
                s_02 = s_02.new();
            }
            if (oOOo.\u00d200000(while.\u00d5o\u00d3000.toString()) && k3.equals(helden.framework.OOoO.K.\u00d300000)) {
                s_02 = s_02.new();
            }
            if (oOOo.\u00d200000(while.\u00d5o\u00d3000.toString()) && !k3.equals(helden.framework.OOoO.K.\u00d8o0000)) {
                s_02 = s_02.\u00d300000();
            }
            if (!oOOo.\u00d200000(while.\u00d5o\u00d3000.toString()) && k3.equals(helden.framework.OOoO.K.\u00d8o0000)) {
                s_02 = s_02.\u00d300000();
            }
            if (oOOo.\u00d200000(while.StringwhileString.toString()) && (k3.equals(helden.framework.OOoO.K.\u00d300000) || k3.equals(helden.framework.OOoO.K.thisObject))) {
                s_02 = s_02.new();
            }
            if (oOOo.\u00d200000(while.\u00f6\u00f6o000.toString()) && k3.equals(helden.framework.OOoO.K.\u00f8O0000)) {
                s_02 = s_02.new();
            }
            if (oOOo.\u00d200000(while.StringwhileString.toString()) && k3.equals(helden.framework.OOoO.K.returnnew)) {
                s_02 = s_02.new();
            }
            if (oOOo.\u00d200000(while.StringwhileString.toString()) && k3.equals(helden.framework.OOoO.K.\u00d5\u00d20000)) {
                s_02 = s_02.new();
            }
        }
        if (oo0O.\u00d400000(I.O\u00d6o000) && (m = (M)oo0O.\u00d300000(I.O\u00d6o000)).\u00f400000(konkreterZauber.getZauber())) {
            s_02 = s_02.new();
        }
        s_02 = s_02.\u00d300000(this.\u00d200000(konkreterZauber, oOOo));
        s_02 = s_02.new(this.super(konkreterZauber, oOOo));
        s_02 = s_02.\u00d300000(this.\u00d200000(konkreterZauber, oo0O));
        s_02 = s_02.\u00d300000(this.\u00d300000(konkreterZauber, oOOo));
        s_02 = s_02.new(this.super(konkreterZauber, oo0O, oOOo));
        s_02 = s_02.new(this.super(konkreterZauber, oo0O));
        if (oo0O.\u00d400000(I.nullint)) {
            int n2 = 0;
            for (n = 0; n < 2; ++n) {
                if (!konkreterZauber.getTalentprobe().o00000(n).equals(b_0.whilewhilesuper)) continue;
                ++n2;
            }
            if (n2 > 1) {
                s_02 = s_02.\u00d300000();
            }
        }
        if (oo0O.\u00d400000(I.O\u00f6O000)) {
            int n3 = 0;
            for (n = 0; n < 2; ++n) {
                if (!konkreterZauber.getTalentprobe().o00000(n).equals(b_0.newwhilesuper)) continue;
                ++n3;
            }
            if (n3 > 1) {
                s_02 = s_02.\u00d300000();
            }
        }
        if (oo0O.\u00d400000(I.\u00d8oo000)) {
            int n4 = 0;
            for (n = 0; n < 3; ++n) {
                if (!konkreterZauber.getTalentprobe().o00000(n).equals(b_0.\u00f8\u00f4\u00d2000)) continue;
                ++n4;
            }
            if (n4 > 1) {
                s_02 = s_02.\u00d300000();
            }
        }
        if (k3.equals(helden.framework.OOoO.K.\u00d400000)) {
            s_02 = s_0.\u00f500000;
            if (oo0O.\u00d400000(I.\u00d8\u00f4O000) || oo0O.\u00d400000(I.forObjectsuper)) {
                s_02 = s_02.\u00d300000(this.\u00d200000(konkreterZauber, oo0O));
            }
        }
        if (oo0O.\u00d400000(I.newreturn) && !this.super((oo0o_0)konkreterZauber, oo0O)) {
            s_02 = s_02.\u00d300000();
        }
        return s_02;
    }

    @Override
    public s_0 super(oo0o_0 oo0o_02, K k2, boolean bl) throws Stringsuper {
        SpaltenVerschiebung spaltenVerschiebung;
        KonkreterZauber konkreterZauber = (KonkreterZauber)oo0o_02;
        s_0 s_02 = this.\u00d400000(oo0o_02, k2, bl);
        int n = 0;
        boolean bl2 = true;
        try {
            n = this.\u00d400000(konkreterZauber);
        }
        catch (Stringsuper stringsuper) {
            bl2 = false;
        }
        if (konkreterZauber.getHexalogie() != null) {
            try {
                int n2 = this.\u00d200000(konkreterZauber.getHexalogie());
                if (!(bl2 && n2 <= n || this.super(konkreterZauber, k2.\u00f5O0000()) != 0 || this.super(konkreterZauber, k2.\u00d500000(), k2.\u00f5O0000()) != 0)) {
                    s_02 = s_02.new();
                }
            }
            catch (D d2) {
                // empty catch block
            }
        }
        int n3 = Integer.MIN_VALUE;
        try {
            n3 = this.super(konkreterZauber.getZauber(), null, null);
        }
        catch (D d3) {
            // empty catch block
        }
        if (n3 > n) {
            s_02 = s_02.new();
        }
        if (bl) {
            s_02 = s_02.new(k2.\u00d4O0000().getWaehlbareZauber().getKostenModifizier(konkreterZauber));
        }
        for (GMod gMod : k2.o00000(GModBezeichner.\u00f500000)) {
            spaltenVerschiebung = (SpaltenVerschiebung)gMod;
            if (!spaltenVerschiebung.isAktuellNutzbar(this.\u00d800000(konkreterZauber), konkreterZauber)) continue;
            s_02 = s_02.new(spaltenVerschiebung.getVerschiebung());
        }
        for (GMod gMod : k2.o00000(GModBezeichner.\u00d500000)) {
            spaltenVerschiebung = (SpaltenVerschiebung)gMod;
            if (!spaltenVerschiebung.isAktuellNutzbar(this.\u00d800000(konkreterZauber), konkreterZauber)) continue;
            s_02 = s_02.new(spaltenVerschiebung.getVerschiebung());
        }
        return s_02;
    }

    @Override
    public List<KonkreterZauber> \u00d200000() {
        return super.\u00d200000();
    }

    public ArrayList<KonkreterZauber> class(Zauber zauber) {
        ArrayList<KonkreterZauber> arrayList = new ArrayList<KonkreterZauber>();
        for (KonkreterZauber konkreterZauber : this.\u00d200000()) {
            if (!zauber.equals(konkreterZauber.getZauber())) continue;
            arrayList.add(konkreterZauber);
        }
        return arrayList;
    }

    public KonkreterZauber \u00d300000(String string) {
        for (KonkreterZauber konkreterZauber : this.\u00d200000()) {
            if (!konkreterZauber.toString().equals(string)) continue;
            return konkreterZauber;
        }
        return null;
    }

    public KonkreterZauber \u00d400000(String string) {
        for (KonkreterZauber konkreterZauber : this.\u00d200000()) {
            if (!konkreterZauber.getZauber().toString().equals(string)) continue;
            return konkreterZauber;
        }
        return null;
    }

    public KonkreterZauber super(String string, helden.framework.OOoO.K k2) {
        for (KonkreterZauber konkreterZauber : this.\u00d200000()) {
            if (!konkreterZauber.getZauber().toString().equals(string) || !konkreterZauber.getRep().equals(k2)) continue;
            return konkreterZauber;
        }
        return null;
    }

    public KonkreterZauber super(String string, helden.framework.OOoO.K k2, String string2) {
        for (KonkreterZauber konkreterZauber : this.\u00d200000()) {
            if (!konkreterZauber.getZauber().toString().equals(string) || !konkreterZauber.getRep().equals(k2) || !konkreterZauber.getVariante().equals(string2)) continue;
            return konkreterZauber;
        }
        return null;
    }

    public int super(KonkreterZauber konkreterZauber, Oo0O oo0O, OOOo oOOo) {
        if (!oo0O.\u00d400000(I.\u00f5\u00f6O000)) {
            return 0;
        }
        int n = 0;
        M m = (M)oo0O.\u00d300000(I.\u00f5\u00f6O000);
        for (helden.framework.OOoO.o00O o00O2 : m.intsuper()) {
            if (!o00O2.\u00d400000()) continue;
            for (int i2 = 0; i2 < konkreterZauber.getMerkmale().length; ++i2) {
                helden.framework.OOoO.o00O o00O3 = konkreterZauber.getMerkmale()[i2];
                if (!o00O3.\u00d400000() || !o00O2.equals(o00O3.\u00d500000()) || this.super(o00O3, oOOo)) continue;
                ++n;
            }
        }
        return n;
    }

    public int super(KonkreterZauber konkreterZauber, OOOo oOOo) {
        int n = 0;
        for (int i2 = 0; i2 < konkreterZauber.getMerkmale().length; ++i2) {
            helden.framework.OOoO.o00O o00O2 = konkreterZauber.getMerkmale()[i2];
            if (!o00O2.\u00d400000() || !this.\u00d200000(o00O2, oOOo)) continue;
            ++n;
        }
        return n;
    }

    /*
     * WARNING - void declaration
     */
    public helden.framework.OOoO.K \u00f4O0000() {
        void var3_5;
        HashMap<helden.framework.OOoO.K, Integer> hashMap = new HashMap<helden.framework.OOoO.K, Integer>();
        for (KonkreterZauber object2 : this.\u00d200000()) {
            helden.framework.OOoO.K k2 = object2.getRep();
            Object object = (Integer)hashMap.get(k2);
            if (object == null) {
                object = new Integer(0);
            }
            int n = (Integer)object;
            hashMap.put(k2, new Integer(n + 1));
        }
        Object var3_4 = null;
        int n = 0;
        for (helden.framework.OOoO.K k3 : hashMap.keySet()) {
            int n2 = (Integer)hashMap.get(k3);
            if (n2 <= n) continue;
            helden.framework.OOoO.K k4 = k3;
            n = n2;
        }
        return var3_5;
    }

    @Override
    public int \u00d200000(String string) throws D {
        int n = -999999;
        for (KonkreterZauber konkreterZauber : this.\u00d200000()) {
            int n2;
            if (!string.equals(konkreterZauber.getHexalogie()) || n >= (n2 = this.\u00d400000(konkreterZauber))) continue;
            n = n2;
        }
        if (n == -999999) {
            throw new D("Keine Hexalogie Zauber");
        }
        return n;
    }

    public int super(Zauber zauber, helden.framework.OOoO.K k2, String string) throws D {
        boolean bl = false;
        int n = -9999;
        for (KonkreterZauber konkreterZauber : this.\u00d200000()) {
            if (zauber != null && !konkreterZauber.getZauber().equals(zauber) || k2 != null && !konkreterZauber.getRep().equals(k2) || string != null && !konkreterZauber.getVariante().equals(string)) continue;
            try {
                int n2 = this.\u00d400000(konkreterZauber);
                if (n2 > n) {
                    n = n2;
                }
                bl = true;
            }
            catch (Stringsuper stringsuper) {}
        }
        if (!bl) {
            throw new D("Nicht gefunden!");
        }
        return n;
    }

    public Map<helden.framework.OOoO.K, Integer> \u00d400000(Zauber zauber) {
        HashMap<helden.framework.OOoO.K, Integer> hashMap = new HashMap<helden.framework.OOoO.K, Integer>();
        for (KonkreterZauber konkreterZauber : this.class(zauber)) {
            int n = -99;
            try {
                n = this.\u00d400000(konkreterZauber);
            }
            catch (Exception exception) {
                // empty catch block
            }
            if (hashMap.get(konkreterZauber.getRep()) == null) {
                hashMap.put(konkreterZauber.getRep(), n);
            }
            if (hashMap.get(konkreterZauber.getRep()) >= n) continue;
            hashMap.put(konkreterZauber.getRep(), n);
        }
        return hashMap;
    }

    public String super(K k2, KonkreterZauber konkreterZauber) {
        Zauber zauber = konkreterZauber.getZauber();
        int n = -99;
        try {
            n = this.\u00d200000(zauber);
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (zauber.equals(Zauber.\u00f8\u00f5\u00d4000) || zauber.equals(Zauber.O0\u00d5000) || zauber.equals(Zauber.\u00f8o\u00d5000)) {
            return "" + HeldenMath.fuenftel(k2.o00000(b_0.whilewhilesuper) + k2.o00000(b_0.\u00f8\u00f4\u00d2000) + k2.o00000(b_0.\u00d5\u00f4\u00d2000) + k2.o00000(b_0.\u00d5\u00f4\u00d2000) + n);
        }
        if (zauber.equals(Zauber.\u00f8\u00d5\u00d3000) || zauber.equals(Zauber.\u00d4\u00d6\u00d3000)) {
            return "" + HeldenMath.fuenftel(k2.o00000(b_0.whilewhilesuper) + k2.o00000(b_0.whilewhilesuper) + k2.o00000(b_0.newwhilesuper) + k2.o00000(b_0.\u00d5\u00f4\u00d2000) + n);
        }
        if (zauber.equals(Zauber.\u00f8\u00f4\u00d4000) || zauber.equals(Zauber.\u00f5\u00d4\u00d3000)) {
            return "" + HeldenMath.fuenftel(k2.o00000(b_0.whilewhilesuper) + k2.o00000(b_0.whilewhilesuper) + k2.o00000(b_0.newwhilesuper) + k2.o00000(b_0.\u00d5\u00f4\u00d2000) + n) + " / LO";
        }
        if (zauber.equals(Zauber.nullinterfacesuper)) {
            return "" + HeldenMath.fuenftel(k2.o00000(b_0.whilewhilesuper) + k2.o00000(b_0.\u00f8\u00f4\u00d2000) + k2.o00000(b_0.\u00d5\u00f4\u00d2000) + k2.o00000(b_0.\u00d5\u00f4\u00d2000) + n);
        }
        if (zauber.equals(Zauber.O0\u00d4000)) {
            return "" + HeldenMath.fuenftel(k2.o00000(b_0.whilewhilesuper) + k2.o00000(b_0.whilewhilesuper) + k2.o00000(b_0.newwhilesuper) + k2.o00000(b_0.\u00d5\u00f4\u00d2000) + n) + " / LO";
        }
        if (zauber.equals(Zauber.whilefornew) || zauber.equals(Zauber.newifnew)) {
            return "" + HeldenMath.fuenftel(k2.o00000(b_0.whilewhilesuper) + k2.o00000(b_0.whilewhilesuper) + k2.o00000(b_0.newwhilesuper) + k2.o00000(b_0.\u00d5\u00f4\u00d2000) + n) + " / LO";
        }
        return "";
    }

    @Override
    public float \u00d200000(oo0o_0 oo0o_02, K k2, boolean bl) throws Stringsuper {
        int n = k2.\u00d300000(oo0o_02);
        return this.super(oo0o_02, k2, n, bl);
    }

    public float super(oo0o_0 oo0o_02, K k2, int n, boolean bl) throws Stringsuper {
        float f2;
        if (((KonkreterZauber)oo0o_02).getZauber() instanceof TharunZauber) {
            return 0.0f;
        }
        if (n < 0) {
            f2 = this.super(oo0o_02, k2, false, bl);
        } else {
            s_0 s_02 = this.super(oo0o_02, k2, bl);
            f2 = o0oo_0.super(s_02, n + 1);
            f2 = this.super(oo0o_02, k2, f2);
        }
        f2 = Math.max(1.0f, f2);
        if (!bl && k2.\u00d400000(oo0o_02).equals(helden.framework.OoOO.D.\u00f400000)) {
            f2 = 0.0f;
        }
        return f2;
    }

    public int \u00d400000(KonkreterZauber konkreterZauber) throws D {
        if (konkreterZauber.getZauber() instanceof TharunZauber) {
            return this.super(konkreterZauber);
        }
        return super.\u00f400000(konkreterZauber);
    }

    @Override
    public int \u00d200000(Zauber zauber) throws D {
        boolean bl = false;
        int n = -9999;
        for (KonkreterZauber konkreterZauber : this.\u00d200000()) {
            if (!konkreterZauber.getZauber().equals(zauber)) continue;
            bl = true;
            int n2 = this.\u00d400000(konkreterZauber);
            if (n2 <= n) continue;
            n = n2;
        }
        if (!bl) {
            throw new D("Nicht gefunden!");
        }
        return n;
    }

    public ZauberInfos \u00d600000(KonkreterZauber konkreterZauber) {
        ZauberInfos zauberInfos = this.\u00d2O0000.get(konkreterZauber.toString());
        if (zauberInfos == null) {
            zauberInfos = new ZauberInfos();
            this.\u00d2O0000.put(konkreterZauber.toString(), zauberInfos);
            if (konkreterZauber.getZauber() instanceof TharunZauber) {
                TharunZauber tharunZauber = (TharunZauber)konkreterZauber.getZauber();
                zauberInfos.setKosten(tharunZauber.getAsPKosten() + " AsP");
            }
        }
        return zauberInfos;
    }

    public boolean super(helden.framework.OOoO.o00O o00O2, OOOo oOOo) {
        for (P p2 : oOOo) {
            if (!(p2 instanceof F)) continue;
            F f2 = (F)p2;
            for (E e : f2.nullObject()) {
                if (!o00O2.equals(e.getWert1()) && !o00O2.equals(e.getWert2())) continue;
                return true;
            }
        }
        return false;
    }

    public boolean super(Zauber zauber, helden.framework.OOoO.K k2, String string, int n) {
        int n2 = -9999;
        try {
            n2 = this.super(zauber, k2, string);
        }
        catch (D d2) {
            // empty catch block
        }
        return n2 >= n;
    }

    public boolean \u00d200000(helden.framework.OOoO.o00O o00O2, OOOo oOOo) {
        return oOOo.o00000(o00O2.\u00d500000()) && !this.super(o00O2, oOOo);
    }

    public KonkreterZauber super(Zauber zauber, helden.framework.OOoO.K k2, String string, Integer n) {
        KonkreterZauber konkreterZauber = KonkreterZauber.getZauber(zauber.toString(), k2, string);
        this.super(konkreterZauber, (int)n);
        return konkreterZauber;
    }

    public boolean super(helden.framework.OOoO.K k2, OOOo oOOo) {
        return !oOOo.o00000(k2);
    }

    public final boolean \u00d200000(KonkreterZauber konkreterZauber) {
        return this.\u00d4O0000.contains(konkreterZauber);
    }

    @Override
    public boolean super(oo0o_0 oo0o_02, Oo0O oo0O) {
        KonkreterZauber konkreterZauber = (KonkreterZauber)oo0o_02;
        boolean bl = false;
        if (konkreterZauber.getRep().equals(helden.framework.OOoO.K.\u00f4o0000)) {
            bl = konkreterZauber.getZauber().getVerbreitung(helden.framework.OOoO.K.\u00f4o0000, helden.framework.OOoO.K.\u00f4o0000) > 4;
        }
        return oo0O.\u00d400000(I.newreturn) && (this.OO0000.contains(oo0o_02) || this.\u00d200000((KonkreterZauber)oo0o_02) || bl);
    }

    public boolean \u00d200000(oo0o_0 oo0o_02, Oo0O oo0O) {
        KonkreterZauber konkreterZauber = (KonkreterZauber)oo0o_02;
        boolean bl = false;
        if (konkreterZauber.getRep().equals(helden.framework.OOoO.K.\u00f4o0000)) {
            bl = konkreterZauber.getZauber().getVerbreitung(helden.framework.OOoO.K.\u00f4o0000, helden.framework.OOoO.K.\u00f4o0000) > 4;
        }
        return oo0O.\u00d400000(I.newreturn) && (this.\u00d200000((KonkreterZauber)oo0o_02) || bl);
    }

    @Override
    public Iterator<KonkreterZauber> super() {
        return super.\u00d200000().iterator();
    }

    public void \u00d300000(Zauber zauber) {
        ArrayList<KonkreterZauber> arrayList = new ArrayList<KonkreterZauber>();
        for (KonkreterZauber konkreterZauber : this.\u00d200000()) {
            if (!konkreterZauber.getZauber().equals(zauber)) continue;
            arrayList.add(konkreterZauber);
        }
        for (KonkreterZauber konkreterZauber : arrayList) {
            this.super(konkreterZauber);
        }
    }

    public void \u00d8O0000() {
        ArrayList<KonkreterZauber> arrayList = new ArrayList<KonkreterZauber>();
        arrayList.addAll(this.\u00d200000());
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            this.super(iterator.next());
        }
        this.\u00d4O0000.clear();
    }

    @Override
    public void class(KonkreterZauber konkreterZauber) {
        if (this.\u00d4O0000.contains(konkreterZauber)) {
            this.\u00d4O0000.remove(konkreterZauber);
        }
    }

    @Override
    public void super(Zauber zauber) {
        ArrayList<KonkreterZauber> arrayList = new ArrayList<KonkreterZauber>();
        for (KonkreterZauber konkreterZauber : this.\u00d4O0000) {
            if (!konkreterZauber.getZauber().equals(zauber)) continue;
            arrayList.add(konkreterZauber);
        }
        Iterator<KonkreterZauber> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            this.\u00d4O0000.remove(iterator.next());
        }
    }

    public KonkreterZauber super(KonkreterZauber konkreterZauber, String string) {
        int n = 0;
        try {
            n = this.\u00d400000(konkreterZauber);
        }
        catch (Stringsuper stringsuper) {
            private.\u00d200000(stringsuper.toString() + " in Zauberfertigkeiten.varianteumbenennen", "sven");
        }
        boolean bl = this.\u00d200000(konkreterZauber);
        this.\u00d4O0000.remove(konkreterZauber);
        this.super(konkreterZauber);
        KonkreterZauber konkreterZauber2 = this.super(konkreterZauber.getZauber(), konkreterZauber.getRep(), string, (Integer)n);
        if (bl) {
            this.\u00d300000(konkreterZauber2);
        }
        return konkreterZauber2;
    }

    public int super(helden.framework.OOoO.o00O o00O2) {
        int n = 0;
        for (KonkreterZauber konkreterZauber : this.\u00d200000()) {
            if (!konkreterZauber.hatMerkmal(o00O2)) continue;
            try {
                n += this.\u00d400000(konkreterZauber);
            }
            catch (Exception exception) {}
        }
        return n;
    }

    private int \u00d200000(KonkreterZauber konkreterZauber, Oo0O oo0O) {
        if (!oo0O.\u00d400000(I.\u00f5\u00f6O000)) {
            return 0;
        }
        boolean bl = false;
        boolean bl2 = false;
        int n = 0;
        M m = (M)oo0O.\u00d300000(I.\u00f5\u00f6O000);
        for (helden.framework.OOoO.o00O o00O2 : m.intsuper()) {
            for (int i2 = 0; i2 < konkreterZauber.getMerkmale().length; ++i2) {
                helden.framework.OOoO.o00O o00O3 = konkreterZauber.getMerkmale()[i2];
                if (o00O3.equals(o00O2)) {
                    ++n;
                }
                if (o00O3.\u00d400000() && o00O2.equals(helden.framework.OOoO.o00O.\u00f4\u00d40000)) {
                    bl = true;
                }
                if (!o00O3.\u00f600000() || !o00O2.equals(helden.framework.OOoO.o00O.\u00f8\u00d20000)) continue;
                bl2 = true;
            }
        }
        if (bl) {
            ++n;
        }
        if (bl2) {
            ++n;
        }
        return n;
    }

    private int \u00d200000(KonkreterZauber konkreterZauber, OOOo oOOo) {
        boolean bl = false;
        boolean bl2 = false;
        int n = 0;
        for (int i2 = 0; i2 < konkreterZauber.getMerkmale().length; ++i2) {
            helden.framework.OOoO.o00O o00O2 = konkreterZauber.getMerkmale()[i2];
            if (oOOo.o00000(o00O2)) {
                ++n;
            }
            if (o00O2.\u00d400000() && !bl && oOOo.\u00d200000(while.\u00d5\u00d6\u00d3000.toString())) {
                ++n;
                bl = true;
            }
            if (!o00O2.\u00f600000() || bl2 || !oOOo.\u00d200000(while.o\u00f60000.toString())) continue;
            ++n;
            bl2 = true;
        }
        return n;
    }

    private int super(KonkreterZauber konkreterZauber, Oo0O oo0O) {
        if (!oo0O.\u00d400000(I.O\u00d4O000)) {
            return 0;
        }
        int n = 0;
        M m = (M)oo0O.\u00d300000(I.O\u00d4O000);
        for (helden.framework.OOoO.o00O o00O2 : m.intsuper()) {
            for (int i2 = 0; i2 < konkreterZauber.getMerkmale().length; ++i2) {
                helden.framework.OOoO.o00O o00O3 = konkreterZauber.getMerkmale()[i2];
                if (o00O3.equals(o00O2)) {
                    ++n;
                }
                if (o00O3.\u00d400000() && o00O2.equals(helden.framework.OOoO.o00O.\u00f4\u00d40000)) {
                    ++n;
                }
                if (!o00O3.\u00f600000() || !o00O2.equals(helden.framework.OOoO.o00O.\u00f8\u00d20000)) continue;
                ++n;
            }
        }
        return n;
    }

    private int \u00d300000(KonkreterZauber konkreterZauber, OOOo oOOo) {
        int n = 0;
        for (P p2 : oOOo) {
            if (!J.super(while.\u00d8\u00f6\u00d2000, p2)) continue;
            void void_ = (void)p2;
            for (if if_ : void_.nullObject()) {
                boolean bl = false;
                for (helden.framework.OOoO.o00O o00O2 : konkreterZauber.getMerkmale()) {
                    if (!if_.equals((Object)o00O2.void())) continue;
                    bl = true;
                }
                if (!bl) continue;
                ++n;
            }
        }
        return n;
    }

    private int super(KonkreterZauber konkreterZauber) {
        TharunZauber tharunZauber = (TharunZauber)konkreterZauber.getZauber();
        if (!tharunZauber.isGueltig(this.\u00d3O0000)) {
            return -1;
        }
        int n = 0;
        int n2 = 0;
        for (voidsuper voidsuper2 : this.\u00d3O0000.\u00f8O0000().\u00d200000()) {
            if (!(voidsuper2 instanceof oooo_4)) continue;
            oooo_4 oooo_42 = (oooo_4)voidsuper2;
            for (int i2 = 0; i2 < tharunZauber.runenAnzahl(); ++i2) {
                if (!oooo_42.o\u00d5O000().equals(tharunZauber.getRunen()[i2])) continue;
                ++n;
                n2 += this.\u00d3O0000.\u00f8O0000().\u00d800000(oooo_42);
            }
        }
        if (n != tharunZauber.runenAnzahl()) {
            return -1;
        }
        return HeldenMath.runde(n2 / tharunZauber.runenAnzahl());
    }
}

