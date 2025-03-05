/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.object;

import helden.framework.A.A;
import helden.framework.C.A.float;
import helden.framework.C.A.void;
import helden.framework.C.I;
import helden.framework.C.M;
import helden.framework.D.F;
import helden.framework.D.public;
import helden.framework.D.while;
import helden.framework.HeldenMath;
import helden.framework.OOoO.R;
import helden.framework.OOoO.o00O;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.Wuerfel;
import helden.framework.held.C;
import helden.framework.held.D;
import helden.framework.held.J;
import helden.framework.held.K;
import helden.framework.held.OOOo;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.held.P;
import helden.framework.held.Stringsuper;
import helden.framework.held.T;
import helden.framework.held.U;
import helden.framework.held.class;
import helden.framework.held.object.oooo_2;
import helden.framework.held.oooo_0;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.zauber.KonkreterZauber;
import helden.model.rasse.Achaz;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from helden.framework.held.Object.oOOo
 */
public class oooo_1
extends oooo_2 {
    private helden.framework.D.OOOo \u00d500000;

    public oooo_1(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        this((K)oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
    }

    public oooo_1(K k2) {
        super(k2);
    }

    public void o00000(PropertyChangeListener propertyChangeListener) {
        this.\u00d800000().o00000(propertyChangeListener);
    }

    public void o00000(helden.framework.D.P p2) throws oooo_0 {
        Object object;
        int n = p2.o\u00d20000();
        if (n > this.\u00d800000().\u00d400000()) {
            throw new oooo_0("Nicht gen\u00fcgend freie Abenteuerpunkte");
        }
        this.o00000(n);
        this.\u00d300000(p2);
        if (p2 instanceof public) {
            object = (public)p2;
            int n2 = this.\u00d800000().\u00d3\u00d30000().super(b_0.\u00d4\u00f5\u00d2000);
            this.\u00d800000().\u00d3\u00d30000().super(b_0.\u00d4\u00f5\u00d2000, n2 + ((public)object).\u00d3\u00d30000());
        }
        object = new A("Sonderfertigkeit hinzugef\u00fcgt", p2.toString(), "", 0, 0, -n, 0);
        if (p2 instanceof public) {
            public public_ = (public)p2;
            ((A)object).o00000(public_.\u00d3\u00d30000());
        }
        this.\u00d800000().o00000((A)object);
    }

    public void \u00d300000(helden.framework.D.P p2) {
        this.\u00d800000().\u00d500000(p2);
        for (voidsuper voidsuper2 : this.\u00d800000().O\u00d30000().getTalente()) {
            int n = 0;
            n = this.\u00d800000().O\u00d30000().getTalente().\u00d400000(voidsuper2);
            this.o00000(voidsuper2, n);
        }
    }

    public void o00000(oo0o_0 oo0o_02, helden.framework.OOoO.K k2, String string, boolean bl) throws oooo_0 {
        Object object;
        if (oo0o_02 == null) {
            return;
        }
        if (k2 != null && oo0o_02.istZauber()) {
            oo0o_02 = KonkreterZauber.getZauber(oo0o_02.toString(), k2, string);
        }
        int n = 10000;
        try {
            n = oo0o_02.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f8O0000) ? Math.round(this.\u00d800000().\u00d5o0000().super(oo0o_02, this.\u00d800000(), bl, false)) : Math.round(this.\u00d800000().\u00f8O0000().super(oo0o_02, this.\u00d800000(), bl, false));
        }
        catch (Stringsuper stringsuper) {
            throw new RuntimeException(stringsuper);
        }
        if (n > this.\u00d800000().\u00d400000()) {
            throw new oooo_0();
        }
        if (oo0o_02.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f8O0000)) {
            this.\u00d800000().\u00d5o0000().super((KonkreterZauber)oo0o_02, 0);
            object = "";
            if (bl) {
                object = (String)object + "SE";
            }
            this.o00000(n, "Zauber aktivieren", oo0o_02, "", "", "0", (String)object);
        } else {
            this.\u00d800000().\u00f8O0000().super((voidsuper)oo0o_02, 0);
            object = "";
            if (bl) {
                object = (String)object + "SE";
            }
            this.o00000(n, "Talent aktivieren", oo0o_02, "", "", "0", (String)object);
        }
        if (oo0o_02.isKampftalent()) {
            object = (E)oo0o_02;
            this.\u00d800000().o00000((voidsuper)object, new U((E)object, this.\u00d800000().\u00f8O0000()));
        }
    }

    public boolean o00000(KonkreterZauber konkreterZauber) {
        Iterator<helden.framework.C.public> iterator = this.\u00d800000().\u00d500000().\u00d500000();
        while (iterator.hasNext()) {
            helden.framework.C.public public_ = iterator.next();
            if (!public_.equals(I.O\u00d4O000) || !konkreterZauber.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f8O0000)) continue;
            for (o00O o00O2 : ((M)public_).intsuper()) {
                if (!konkreterZauber.hatMerkmal(o00O2) || !this.\u00d800000().\u00d5o0000().super(konkreterZauber.getRep(), this.\u00d800000().\u00f5O0000())) continue;
                return false;
            }
        }
        return true;
    }

    public void o00000(int n, String string, Object object, String string2, String string3, String string4, String string5) {
        this.o00000(n);
        if (string != null) {
            A a2 = new A(string, object, string2, (Integer)0, (Integer)0, (Integer)(-n), (Integer)0, string3, string4);
            a2.\u00d500000(string5);
            this.\u00d800000().o00000(a2);
        }
    }

    public void o00000(Vector<String> vector, Vector<String> vector2, String string) {
        for (int i2 = 0; i2 < vector2.size(); ++i2) {
            if (vector.get(i2).equals(vector2.get(i2))) continue;
            String string2 = vector.get(i2);
            String string3 = vector2.get(i2);
            String string4 = string2.substring(0, string2.indexOf(40) - 1);
            string2 = string2.substring(string4.length() + 3, string2.length() - 2);
            string3 = string3.substring(string4.length() + 3, string3.length() - 2);
            A a2 = new A("Geld", (Object)string4, "", (Integer)0, (Integer)0, (Integer)0, (Integer)0, string2, string3);
            a2.\u00d500000(string);
            this.\u00d800000().o00000(a2);
        }
    }

    public boolean \u00d200000(helden.framework.D.P p2) {
        boolean bl = this.\u00d300000().\u00d800000(p2);
        return bl;
    }

    public void \u00d200000(oo0o_0 oo0o_02) throws D, oooo_0, P, C, OOOo {
        int n = 0;
        if (oo0o_02.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f8O0000)) {
            n = this.\u00d800000().\u00d5o0000().\u00d400000((KonkreterZauber)oo0o_02);
        } else {
            this.o00000(oo0o_02);
            n = this.\u00d800000().\u00f8O0000().\u00f400000((voidsuper)oo0o_02);
        }
        if (oo0o_02 instanceof G) {
            if (n >= ((G)oo0o_02).\u00f5\u00f40000()) {
                throw new C();
            }
            if (oo0o_02.equals(G.thissuperclass) && !(this.\u00d800000().o\u00d20000() instanceof Achaz) && n >= 9) {
                throw new C();
            }
        } else if (n + 1 > this.\u00d800000().\u00d800000(oo0o_02)) {
            throw new P();
        }
        int n2 = 10000;
        n2 = Math.round(this.\u00d800000().o00000(oo0o_02, false));
        if (n2 > this.\u00d800000().\u00d400000()) {
            throw new oooo_0();
        }
        if (oo0o_02.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f8O0000)) {
            KonkreterZauber konkreterZauber = (KonkreterZauber)oo0o_02;
            if (!this.o00000(konkreterZauber)) {
                throw new C();
            }
            this.\u00d800000().\u00d5o0000().class(konkreterZauber);
            String string = "";
            if (this.\u00d800000().\u00d5o0000().\u00d400000(konkreterZauber).booleanValue()) {
                string = string + "SE, ";
            }
            string = string + this.\u00d800000().\u00d400000(konkreterZauber).toString();
            this.o00000(n2, "Zauber steigern", oo0o_02, "", "" + n, "" + (n + 1), string);
            this.\u00d800000().\u00d5o0000().super(konkreterZauber, new Boolean(false));
        } else {
            String string = "";
            if (this.\u00d800000().\u00f8O0000().\u00d400000((voidsuper)oo0o_02).booleanValue()) {
                string = string + "SE, ";
            }
            string = string + this.\u00d800000().\u00d400000(oo0o_02).toString();
            this.\u00d800000().\u00f8O0000().class((voidsuper)oo0o_02);
            this.\u00d800000().\u00f8O0000().super((voidsuper)oo0o_02, new Boolean(false));
            if (oo0o_02.isKampftalent() && ((E)oo0o_02).o\u00d80000()) {
                E e = (E)oo0o_02;
                U u2 = this.\u00d800000().new((voidsuper)e);
                this.o00000(n2, "Nahkampftalent steigern", e, "", "" + n + ";" + u2.\u00d300000() + ";" + u2.String(), "" + (n + 1) + ";" + u2.\u00d300000() + ";" + u2.String(), string);
            } else {
                this.o00000(n2, "Talent steigern", oo0o_02, "", "" + n, "" + (n + 1), string);
            }
        }
        if (oo0o_02.isKampftalent() && n < 0) {
            this.\u00d800000().new((voidsuper)oo0o_02).\u00d200000();
        }
    }

    public int String(int n) {
        float f2 = 1.0f;
        if (this.\u00d800000().o00000(I.\u00d3\u00d60000)) {
            f2 = 0.0f;
        }
        if (n < 7) {
            return Math.round((float)this.\u00d800000().o\u00d20000().getAlterungsStufen().get(n - 1).intValue() * f2);
        }
        int n2 = Math.round((float)this.\u00d800000().o\u00d20000().getAlterungsStufen().get(5).intValue() * f2);
        for (int i2 = 7; i2 <= n; ++i2) {
            n2 += Math.round((float)this.\u00d800000().o\u00d20000().getAlterungsStufen().get(6).intValue() * f2);
        }
        return n2;
    }

    public ArrayList<Integer> o00000(int n, int n2) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        if (this.\u00d800000().o00000(I.\u00f8o0000)) {
            return arrayList;
        }
        int n3 = 1;
        int n4 = this.String(n3);
        while (n4 <= n2) {
            if (n4 > n) {
                arrayList.add(new Integer(n3));
            }
            n4 = this.String(++n3);
        }
        return arrayList;
    }

    public int \u00f800000() {
        if (this.\u00d800000().o00000(I.\u00f5\u00d60000)) {
            float float_ = (float)this.\u00d800000().\u00d500000().\u00d300000(I.\u00f5\u00d60000);
            return float_.classObject();
        }
        if (this.\u00d800000().o00000(I.forinterface)) {
            helden.framework.C.J j2 = (helden.framework.C.J)this.\u00d800000().\u00d500000().\u00d300000(I.forinterface);
            return j2.ObjectString();
        }
        if (this.\u00d800000().new(while.\u00d8\u00d6\u00d5000.toString())) {
            F f2 = (F)this.\u00d800000().\u00f5O0000().o00000(while.\u00d8\u00d6\u00d5000.toString());
            R r = (R)f2.nullObject().iterator().next();
            return (Integer)r.o00000(1);
        }
        return 0;
    }

    public List<Object> \u00d500000(helden.framework.D.P p2) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        if (this.\u00d800000().\u00d500000().\u00d400000(I.newreturn)) {
            if (this.\u00d300000().\u00d500000(p2)) {
                if (p2 instanceof helden.framework.D.K) {
                    arrayList.add(helden.framework.OoOO.D.o00000);
                    arrayList.add(helden.framework.OoOO.D.\u00d500000);
                }
            } else {
                arrayList.add(helden.framework.OoOO.D.\u00d400000);
                arrayList.add(helden.framework.OoOO.D.\u00d200000);
                if (p2 instanceof helden.framework.D.K) {
                    arrayList.add(helden.framework.OoOO.D.\u00d500000);
                }
            }
        } else if (p2 instanceof helden.framework.D.K) {
            arrayList.add(helden.framework.OoOO.D.o00000);
            arrayList.add(helden.framework.OoOO.D.\u00d500000);
        }
        return arrayList;
    }

    @Override
    public helden.framework.D.OOOo o00000(boolean bl) {
        if (this.\u00d500000 == null || bl) {
            ArrayList<oo0o_0> arrayList;
            this.\u00d500000 = this.\u00d300000().o00000(this.\u00d800000().oO0000());
            ArrayList<oo0o_0> arrayList2 = this.\u00d500000();
            if (arrayList2.size() > 0) {
                this.\u00d500000.o00000(helden.framework.D.K.o00000(arrayList2.get(0), ""));
            }
            if ((arrayList = this.\u00d600000()).size() > 0) {
                this.\u00d500000.o00000(helden.framework.D.K.new(arrayList.get(0), "", true));
            }
            this.\u00d300000().\u00d600000(this.\u00d500000);
        }
        return this.\u00d500000;
    }

    public List<voidsuper> \u00f600000() {
        ArrayList<voidsuper> arrayList = new ArrayList<voidsuper>();
        for (voidsuper voidsuper2 : N.floatsuper().\u00d400000()) {
            if (!this.\u00d800000().oO0000().contains(voidsuper2)) continue;
            arrayList.add(voidsuper2);
        }
        return arrayList;
    }

    public int \u00d200000(b_0 b_02) {
        return this.\u00d800000().\u00d3\u00d30000().\u00f800000(b_02);
    }

    public int String(b_0 b_02) {
        return this.\u00d800000().\u00d3\u00d30000().\u00d600000(b_02);
    }

    @Override
    public String String() {
        return "AP";
    }

    public int o00000(int n, boolean bl) throws oooo_0 {
        if (!bl && this.\u00d800000().\u00d400000() < 400 || bl && this.\u00d800000().\u00d400000() < 200) {
            throw new oooo_0();
        }
        b_0 b_02 = this.\u00d800000().while();
        int n2 = this.\u00d800000().o00000(b_02);
        if (this.\u00d800000().new(while.\u00d3\u00d5\u00d6000.toString()) && n2 < this.\u00d800000().o00000(b_0.\u00d5\u00f4\u00d2000)) {
            n2 = this.\u00d800000().o00000(b_0.\u00d5\u00f4\u00d2000);
        }
        int n3 = HeldenMath.drittel(n2);
        this.\u00d800000().\u00d3\u00d30000().\u00d300000(n3 += HeldenMath.zehntel(n));
        if (bl) {
            this.o00000(200, "Grosse Meditation", "", "", "", "", "");
        } else {
            this.o00000(400, "Grosse Meditation", "", "", "", "", "");
        }
        this.\u00d800000().if().o00000().String(n3);
        return n3;
    }

    public boolean String(helden.framework.D.P p2) {
        boolean bl = this.\u00d300000().\u00d200000(p2);
        return bl;
    }

    public int \u00d200000(int n, boolean bl) throws oooo_0 {
        if (this.\u00d800000().\u00d4\u00d40000() < n) {
            throw new IllegalArgumentException();
        }
        int n2 = this.\u00d800000().o00000(b_0.\u00f8\u00f4\u00d2000);
        int n3 = Integer.MAX_VALUE;
        int n4 = -2147483647;
        if (this.\u00f800000() > 0) {
            int n5 = this.\u00f800000();
            switch (n5) {
                case 1: 
                case 2: {
                    n4 = HeldenMath.fuenftel(n2);
                    n3 = 250;
                    break;
                }
                case 3: 
                case 4: {
                    n4 = HeldenMath.viertel(n2);
                    n3 = 300;
                    break;
                }
                case 5: 
                case 6: {
                    n4 = HeldenMath.drittel(n2);
                    n3 = 400;
                    break;
                }
                default: {
                    throw new oooo_0();
                }
            }
        } else if (this.\u00d800000().o00000(I.\u00d3\u00f5O000) || this.\u00d800000().o00000(I.\u00d5\u00f5O000) || this.\u00d800000().o00000(I.\u00d8\u00f8o000) || this.\u00d800000().o00000(I.\u00d4\u00f4O000) || this.\u00d800000().new(while.o\u00d4\u00d4000.toString())) {
            n3 = 300;
            n4 = HeldenMath.viertel(n2);
        } else if (this.\u00d800000().o00000(I.\u00f8\u00d50000) || this.\u00d800000().new(while.\u00d6\u00d8\u00d8000.toString()) || this.\u00d800000().new(while.\u00d3\u00d6O000.toString())) {
            n3 = 250;
            n4 = HeldenMath.fuenftel(n2);
        } else {
            throw new oooo_0();
        }
        if (bl) {
            n3 /= 2;
        }
        if (this.\u00d800000().\u00d400000() < n3) {
            throw new oooo_0();
        }
        this.\u00d800000().\u00d3\u00d30000().class(n4 += HeldenMath.zehntel(n));
        this.o00000(n3, "Karmalqueste", "", "", "", "", "");
        this.\u00d800000().if().o00000().o00000(n4);
        return n4;
    }

    public void for() {
        this.\u00d800000().ifnew().\u00d300000();
    }

    public void o00000(helden.framework.D.OOOo oOOo) {
        this.\u00d300000().\u00d600000(oOOo);
    }

    public void \u00d200000(int n) {
        this.\u00d800000().\u00d300000(n);
    }

    public void \u00d200000(String string) {
        this.\u00d800000().\u00d800000(string);
    }

    public void o00000(oo0o_0 oo0o_02, helden.framework.OoOO.D d2) {
        this.\u00d800000().o00000(oo0o_02, d2);
    }

    public void \u00d500000(int n) throws C {
        J j2 = this.\u00d800000().\u00d3\u00d30000();
        if (n > 21) {
            throw new C("Der maximale Sozialstatus wurde \u00fcberschritten.");
        }
        this.\u00d800000().ifnew().\u00d300000();
        j2.super(b_0.\u00f5\u00f5\u00d2000, n - j2.\u00d200000(b_0.\u00f5\u00f5\u00d2000));
    }

    public void o00000(helden.framework.OoOO.U u2, Boolean bl) {
        boolean bl2;
        if (u2.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.int)) {
            bl2 = this.\u00d800000().\u00d3\u00d30000().\u00d400000((b_0)u2);
            this.\u00d800000().\u00d3\u00d30000().super((b_0)u2, bl);
        } else if (u2.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f8O0000)) {
            bl2 = this.\u00d800000().\u00d5o0000().\u00d400000((KonkreterZauber)u2);
            this.\u00d800000().\u00d5o0000().super((KonkreterZauber)u2, bl);
        } else {
            bl2 = this.\u00d800000().\u00f8O0000().\u00d400000((voidsuper)u2);
            this.\u00d800000().\u00f8O0000().super((voidsuper)u2, bl);
        }
        if (bl2 != bl) {
            this.\u00d800000().ifnew().\u00d300000();
        }
    }

    public int \u00d300000(b_0 b_02) throws oooo_0, C {
        Object object;
        if (this.\u00d800000().o00000(I.\u00d3\u00d3O000) && ((void)(object = (void)this.\u00d800000().\u00d500000().\u00d300000(I.\u00d3\u00d3O000))).\u00d200000(b_02)) {
            throw new C("Nachteil Stubenhocker: \ndiese Eingenschaft darf nicht gesteigert werden");
        }
        object = this.\u00d800000().\u00d3\u00d30000();
        if (((J)object).\u00d4O0000(b_02)) {
            throw new C("Der Maximalwert f\u00fcr diese Eigenschaft wurde erreicht");
        }
        int n = ((class)object).\u00d200000(b_02);
        int n2 = ((class)object).\u00d200000(b_02) + 1;
        int n3 = 0;
        if (!b_02.equals(b_0.\u00f5\u00f5\u00d2000) && (n3 = this.String(b_02)) > this.\u00d800000().\u00d400000()) {
            throw new oooo_0();
        }
        String string = "";
        if (((class)object).\u00d400000(b_02).booleanValue()) {
            string = "SE";
        }
        this.o00000(n3, "Eigenschaft steigern", b_02.toString(), "", "" + n, "" + n2, string);
        ((class)object).super(b_02, n2);
        ((class)object).super(b_02, new Boolean(false));
        return this.\u00d800000().o00000(b_02);
    }

    public void \u00d300000(int n) {
        k_0<b_0> k_02 = new k_0<b_0>();
        ArrayList<b_0> arrayList = new ArrayList<b_0>();
        switch (n) {
            case 1: {
                arrayList.add(b_0.whilewhilesuper);
                k_02.\u00d200000(b_0.\u00d3\u00f4\u00d2000, -1);
                k_02.\u00d200000(b_0.thispublicsuper, -1);
                break;
            }
            case 2: {
                arrayList.add(b_0.\u00f8\u00f4\u00d2000);
                k_02.\u00d200000(b_0.\u00d3\u00f4\u00d2000, -1);
                k_02.\u00d200000(b_0.thispublicsuper, -2);
                k_02.\u00d200000(b_0.\u00f4\u00f4\u00d2000, -1);
                break;
            }
            case 3: {
                arrayList.add(b_0.\u00d5\u00f4\u00d2000);
                k_02.\u00d200000(b_0.\u00d3\u00f4\u00d2000, -1);
                k_02.\u00d200000(b_0.thispublicsuper, -2);
                k_02.\u00d200000(b_0.privatedosuper, -1);
                break;
            }
            case 4: {
                arrayList.add(b_0.whilewhilesuper);
                k_02.\u00d200000(b_0.\u00d3\u00f4\u00d2000, -1);
                k_02.\u00d200000(b_0.thispublicsuper, -2);
                k_02.\u00d200000(b_0.returnwhilesuper, -1);
                k_02.\u00d200000(b_0.O\u00f5\u00d2000, -1);
                break;
            }
            case 5: {
                k_02.\u00d200000(b_0.\u00d3\u00f4\u00d2000, -1);
                k_02.\u00d200000(b_0.thispublicsuper, -2);
                k_02.\u00d200000(b_0.privatedosuper, -1);
                k_02.\u00d200000(b_0.\u00f4\u00f4\u00d2000, -1);
                k_02.\u00d200000(b_0.whilewhilesuper, -1);
                break;
            }
            case 6: {
                k_02.\u00d200000(b_0.\u00d3\u00f4\u00d2000, -1);
                k_02.\u00d200000(b_0.thispublicsuper, -Wuerfel.w3());
                k_02.\u00d200000(b_0.whilewhilesuper, -1);
                k_02.\u00d200000(b_0.newwhilesuper, -1);
                k_02.\u00d200000(b_0.\u00f8\u00f4\u00d2000, -1);
                k_02.\u00d200000(b_0.\u00d5\u00f4\u00d2000, -1);
                k_02.\u00d200000(b_0.O\u00f5\u00d2000, -1);
                k_02.\u00d200000(b_0.\u00f4\u00f4\u00d2000, -1);
                k_02.\u00d200000(b_0.returnwhilesuper, -1);
                k_02.\u00d200000(b_0.privatedosuper, -1);
                break;
            }
            default: {
                k_02.\u00d200000(b_0.\u00d3\u00f4\u00d2000, -Wuerfel.w3());
                k_02.\u00d200000(b_0.thispublicsuper, -Wuerfel.w6());
                k_02.\u00d200000(b_0.whilewhilesuper, -1);
                k_02.\u00d200000(b_0.newwhilesuper, -1);
                k_02.\u00d200000(b_0.\u00f8\u00f4\u00d2000, -1);
                k_02.\u00d200000(b_0.\u00d5\u00f4\u00d2000, -1);
                k_02.\u00d200000(b_0.O\u00f5\u00d2000, -1);
                k_02.\u00d200000(b_0.\u00f4\u00f4\u00d2000, -1);
                k_02.\u00d200000(b_0.returnwhilesuper, -1);
                k_02.\u00d200000(b_0.privatedosuper, -1);
            }
        }
        Integer n2 = A.for();
        for (b_0 b_02 : k_02) {
            int n3 = k_02.\u00d400000(b_02);
            A a2 = new A("Eigenschaft steigern", b_02.toString(), "Altersstufe " + n);
            a2.\u00d200000("" + this.\u00d800000().o00000(b_02));
            a2.\u00d600000("" + (this.\u00d800000().o00000(b_02) + n3));
            a2.o00000(n2, "Altersstufe " + n);
            this.\u00d800000().o00000(a2);
            this.\u00d800000().\u00d3\u00d30000().super(b_02, this.\u00d800000().\u00d3\u00d30000().super(b_02) + n3);
        }
        for (b_0 b_02 : arrayList) {
            this.\u00d800000().\u00d3\u00d30000().super(b_02, true);
        }
    }

    public void o00000(b_0 b_02) throws oooo_0, C {
        if (b_02.equals(b_0.\u00f4\u00f5\u00d2000)) {
            int n = this.\u00d800000().\u00d3\u00d30000().super(b_02);
            if (n >= 0) {
                throw new C("Es k\u00f6nen keine weiteren Punkte zur\u00fcckgekauft werden!");
            }
            int n2 = this.\u00d200000(b_02);
            if (n2 > this.\u00d800000().\u00d400000()) {
                throw new oooo_0();
            }
            this.o00000(n2, "Eigenschaft R\u00fcckkauf", b_02.toString(), "", "" + n, "" + (n + 1), "");
            this.\u00d800000().\u00d3\u00d30000().super(b_02, ++n);
        }
    }

    private void o00000(voidsuper voidsuper2, int n) {
        T t = this.\u00d800000().\u00f8O0000();
        if (!t.\u00d300000(voidsuper2)) {
            this.\u00d800000().ifnew().\u00d300000();
            this.\u00d800000().\u00f8O0000().super(voidsuper2, n);
        }
    }

    private void o00000(int n) {
        int n2 = this.\u00d800000().\u00d400000();
        this.\u00d800000().new(n2 - n);
    }
}

