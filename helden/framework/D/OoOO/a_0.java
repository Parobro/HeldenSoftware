/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.d.oooo;

import helden.framework.D.F;
import helden.framework.D.K;
import helden.framework.D.oOOO.B;
import helden.framework.D.while;
import helden.framework.E.C.A;
import helden.framework.E.G;
import helden.framework.E.O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.OOoO.R;
import helden.framework.OoOO.E;
import helden.framework.OoOO.N;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.framework.d.oooo.oooo_4;
import helden.framework.oooo.b_0;
import java.util.ArrayList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from helden.framework.D.oOOO.A
 */
public class a_0
extends F {
    public static ArrayList<R> \u00d5\u00d60000() {
        ArrayList<R> arrayList = new ArrayList<R>();
        for (helden.framework.E.F f2 : O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d400000().o00000()) {
            G g2;
            int n;
            for (n = 0; n < f2.Object(helden.framework.E.B.\u00d400000); ++n) {
                g2 = (A)f2.o00000(helden.framework.E.B.\u00d400000, n);
                if (((A)g2).\u00d2\u00d50000()) continue;
                for (E e : ((A)g2).\u00f6\u00d40000()) {
                    arrayList.add(new R(f2, e));
                }
            }
            for (n = 0; n < f2.Object(helden.framework.E.B.class); ++n) {
                g2 = (helden.framework.E.C.E)f2.o00000(helden.framework.E.B.class, n);
                if (((helden.framework.E.C.E)g2).thisnew()) continue;
                for (E e : ((helden.framework.E.C.E)g2).\u00f5o0000()) {
                    arrayList.add(new R(f2, e));
                }
            }
        }
        return arrayList;
    }

    public a_0() {
        super(while.\u00d3\u00d4\u00f6000.toString(), 2, a_0.\u00d5\u00d60000());
        this.o00000(2);
    }

    @Override
    public R new(ArrayList arrayList) {
        R r = new R(arrayList.size());
        r.\u00d200000(0, O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d400000().o00000((String)arrayList.get(0)));
        r.\u00d200000(1, N.floatsuper().\u00d200000((String)arrayList.get(1)));
        for (int i2 = 2; i2 < arrayList.size(); ++i2) {
            ArrayList arrayList2 = (ArrayList)arrayList.get(i2);
            Object object = arrayList2.get(2);
            if (object instanceof ArrayList) {
                object = new R(((ArrayList)arrayList2.get(2)).toArray());
            }
            oooo_4 oooo_42 = oooo_4.o00000((String)arrayList2.get(0));
            R r2 = new R(new Object[]{oooo_42, arrayList2.get(1) == null ? null : Integer.valueOf(Integer.parseInt((String)arrayList2.get(1))), object, arrayList2.get(3).toString(), Integer.parseInt((String)arrayList2.get(4))});
            r2.o00000(new B());
            r.\u00d200000(i2, r2);
        }
        return r;
    }

    @Override
    public int o00000(R r) {
        return 400;
    }

    protected BedingungsVerknuepfung o\u00d20000(R r) {
        if (r.o00000() == 1) {
            R r2 = (R)r.o00000(0);
            return this.o00000((E)r2.o00000(1), r2.o00000(0).toString());
        }
        if (r.o00000() > 2 && r.o00000(1) instanceof E) {
            return this.o00000((E)r.o00000(1), r.o00000(0).toString());
        }
        return this.\u00f5o0000();
    }

    private BedingungsVerknuepfung o00000(E e, String string) {
        int n = 2500;
        if (e.classclass()) {
            n = 1500;
        }
        BedingungsVerknuepfung bedingungsVerknuepfung = new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.hat(e, (Integer)18), Bedingung.hat(b_0.\u00f4\u00f4\u00d2000, (Integer)13), Bedingung.hatKampfSF(n));
        if (e.hatSpezialisierungen()) {
            bedingungsVerknuepfung.addBedingung(Bedingung.hat(K.o00000(e, string)));
        }
        return bedingungsVerknuepfung;
    }
}

