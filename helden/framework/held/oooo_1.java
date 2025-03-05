/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held;

import helden.framework.A.A;
import helden.framework.D.P;
import helden.framework.D.void;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.D;
import helden.framework.held.K;
import helden.framework.oooo.b_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import java.util.List;

/*
 * Renamed from helden.framework.held.oOoO
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class oooo_1 {
    private K super;

    public oooo_1(K k2) {
        this.super = k2;
    }

    public void o00000(int n) {
        int n2 = this.super.\u00d400000();
        this.super.new(n2 - n);
    }

    public A o00000() {
        int n = this.super.\u00d8O0000().size() - 1;
        return this.super.\u00d8O0000().get(n);
    }

    public void \u00d200000() {
        if (!this.String()) {
            return;
        }
        boolean bl = false;
        int n = 0;
        if (this.o00000().String() != A.\u00f4O0000) {
            bl = true;
            n = this.o00000().String();
        }
        do {
            boolean bl2 = true;
            A a2 = this.o00000();
            String string = a2.\u00d3O0000();
            if (string.equals("Talent steigern") || string.equals("Zauber steigern")) {
                bl2 = this.o00000(a2);
            } else if (string.equals("Talent aktivieren") || string.equals("Zauber aktivieren")) {
                bl2 = this.\u00d200000(a2);
            } else if (string.equals("Nahkampftalent steigern")) {
                bl2 = this.\u00d600000(a2);
            } else if (string.equals("Sonderfertigkeit hinzugef\u00fcgt")) {
                bl2 = this.\u00d500000(a2);
            } else if (string.equals("Eigenschaft steigern")) {
                bl2 = this.String(a2);
            } else if (string.equals("Ereignis eingeben")) {
                bl2 = this.\u00d300000(a2);
            }
            if (bl2) {
                throw new RuntimeException("Fehler beim R\u00fcckg\u00e4ngig machen!");
            }
            this.super.\u00d8O0000().remove(this.o00000());
        } while (bl && this.super.\u00d8O0000().size() > 0 && this.o00000().String() == n);
    }

    public String \u00d300000() {
        int n = this.super.\u00d8O0000().size() - 1;
        A a2 = this.super.\u00d8O0000().get(n);
        return a2.null();
    }

    public boolean String() {
        if (this.super.\u00d8O0000().size() == 0) {
            return false;
        }
        int n = this.super.\u00d8O0000().size() - 1;
        A a2 = this.super.\u00d8O0000().get(n);
        if (a2.\u00d500000()) {
            return false;
        }
        String string = a2.\u00d3O0000();
        return string.equals("Talent steigern") || string.equals("Eigenschaft steigern") || string.equals("Nahkampftalent steigern") || string.equals("Sonderfertigkeit hinzugef\u00fcgt") || string.equals("Zauber steigern") || string.equals("Talent aktivieren") || string.equals("Ereignis eingeben");
    }

    private boolean String(A a2) {
        b_0 b_02 = b_0.\u00f400000(a2.\u00f500000());
        int n = this.super.\u00d3\u00d30000().\u00d200000(b_02) - 1;
        int n2 = this.super.\u00d3\u00d30000().\u00d200000(b_02);
        if (n2 != Integer.valueOf(a2.\u00f600000()) || n != Integer.valueOf(a2.\u00f800000())) {
            return true;
        }
        this.super.\u00d3\u00d30000().super(b_02, n);
        this.o00000(a2.o00000());
        return false;
    }

    private boolean \u00d300000(A a2) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5 = a2.\u00d200000();
        if (n5 != 0 && this.super.\u00d8\u00d20000()) {
            n4 = this.super.\u00d3\u00d30000().super(b_0.\u00d4\u00f5\u00d2000);
            this.super.\u00d3\u00d30000().super(b_0.\u00d4\u00f5\u00d2000, n4 -= n5);
        }
        if ((n3 = a2.\u00d5O0000().intValue()) > 0) {
            n4 = this.super.\u00d3\u00d30000().super(b_0.\u00f4\u00f5\u00d2000);
            this.super.\u00d3\u00d30000().super(b_0.\u00f4\u00f5\u00d2000, n4 -= n3);
        }
        if (n3 < 0) {
            this.super.\u00d3\u00d30000().\u00d300000(-n3);
        }
        if ((n2 = a2.oO0000().intValue()) != 0) {
            n4 = this.super.\u00d3\u00d30000().super(b_0.\u00d3\u00f4\u00d2000);
            this.super.\u00d3\u00d30000().super(b_0.\u00d3\u00f4\u00d2000, n4 -= n2);
        }
        if ((n = a2.o00000().intValue()) != 0) {
            helden.framework.held.object.oooo_1 oooo_12 = new helden.framework.held.object.oooo_1(this.super);
            oooo_12.\u00d200000(this.super.o\u00d30000() - n);
        }
        return false;
    }

    private boolean \u00d600000(A a2) {
        voidsuper voidsuper2 = null;
        int n = 0;
        try {
            voidsuper2 = (voidsuper)a2.\u00d2O0000();
            n = this.super.\u00d300000((oo0o_0)voidsuper2);
        }
        catch (D d2) {
            d2.printStackTrace();
            return true;
        }
        String[] stringArray = a2.\u00f800000().split(";");
        String[] stringArray2 = a2.\u00f600000().split(";");
        if (n != Integer.valueOf(stringArray2[0]) || n - 1 != Integer.valueOf(stringArray[0])) {
            return true;
        }
        int n2 = Integer.valueOf(stringArray[0]);
        try {
            this.super.new(voidsuper2).o00000((int)Integer.valueOf(stringArray[1]), Integer.valueOf(stringArray[2]));
            this.super.\u00f8O0000().super(voidsuper2, n2);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return true;
        }
        this.o00000(a2.o00000());
        return false;
    }

    private boolean \u00d500000(A a2) {
        P p2 = null;
        for (P p3 : this.super.\u00f5O0000()) {
            if (p3 instanceof void) {
                void void_ = (void)p3;
                List list = void_.o\u00d40000();
                for (int i2 = 0; i2 < list.size(); ++i2) {
                    if (!a2.\u00d2O0000().equals(((Object)list.get(i2)).toString())) continue;
                    p2 = list.get(i2);
                }
                continue;
            }
            if (!a2.\u00d2O0000().equals(p3.toString())) continue;
            p2 = p3;
        }
        if (p2 == null) {
            return true;
        }
        this.super.\u00d400000(p2);
        this.o00000(a2.o00000());
        if (a2.\u00d200000() != 0) {
            int n = this.super.\u00d3\u00d30000().super(b_0.\u00d4\u00f5\u00d2000);
            this.super.\u00d3\u00d30000().super(b_0.\u00d4\u00f5\u00d2000, n - a2.\u00d200000());
        }
        return false;
    }

    private boolean \u00d200000(A a2) {
        String string = a2.\u00d3O0000();
        boolean bl = string.equals("Zauber aktivieren");
        oo0o_0 oo0o_02 = null;
        try {
            oo0o_02 = (oo0o_0)a2.\u00d2O0000();
            int n = this.super.\u00d300000(oo0o_02);
            if (n != Integer.valueOf(a2.\u00f600000())) {
                return true;
            }
        }
        catch (D d2) {
            d2.printStackTrace();
            return true;
        }
        if (bl) {
            this.super.\u00d5o0000().super((KonkreterZauber)oo0o_02);
        } else {
            this.super.\u00f8O0000().super((voidsuper)oo0o_02);
        }
        this.o00000(a2.o00000());
        return false;
    }

    private boolean o00000(A a2) {
        int n;
        String string = a2.\u00d3O0000();
        boolean bl = string.equals("Zauber steigern");
        oo0o_0 oo0o_02 = null;
        try {
            oo0o_02 = (oo0o_0)a2.\u00d2O0000();
            n = this.super.\u00d300000(oo0o_02);
            if (n != Integer.valueOf(a2.\u00f600000()) || n - 1 != Integer.valueOf(a2.\u00f800000())) {
                return true;
            }
        }
        catch (D d2) {
            d2.printStackTrace();
            return true;
        }
        n = Integer.valueOf(a2.\u00f800000());
        if (bl) {
            this.super.\u00d5o0000().super((KonkreterZauber)oo0o_02, n);
        } else {
            this.super.\u00f8O0000().super((voidsuper)oo0o_02, n);
        }
        this.o00000(a2.o00000());
        return false;
    }
}

