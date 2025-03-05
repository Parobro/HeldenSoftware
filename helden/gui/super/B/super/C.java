/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.B.super;

import helden.framework.E.A;
import helden.framework.E.B;
import helden.framework.E.F;
import helden.gui.super.B.super.G;
import helden.gui.super.B.super.M;
import helden.gui.super.B.super.O;
import helden.gui.super.B.super.OO0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.super.B.super.OOOo;
import helden.gui.super.B.super.Objectsuper;
import helden.gui.super.B.super.Q;
import helden.gui.super.B.super.class;
import helden.gui.super.B.super.if;
import helden.gui.super.B.super.null;
import helden.gui.super.b.super.oooo_0;
import helden.gui.super.b.super.oooo_1;
import helden.gui.super.b.super.oooo_2;
import helden.gui.super.b.super.oooo_3;
import java.util.HashMap;
import javax.swing.JTabbedPane;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class C
extends JTabbedPane {
    private O \u00f500000;
    private HashMap<Integer, M> while;
    private OO0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO return;
    private oooo_0 OO0000;
    private if oO0000;
    private Q \u00d500000;
    private Objectsuper if;
    private G \u00d300000;
    private OOOo new;
    private class \u00d800000;
    private null \u00f400000;
    private oooo_3 \u00d400000;
    private oooo_1 \u00f800000;
    private oooo_2 o00000;

    public C(F f2, helden.framework.held.object.oooo_1 oooo_12) {
        this.super(f2, oooo_12);
    }

    public O \u00d300000() {
        return this.\u00f500000;
    }

    public OO0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO \u00d200000() {
        return this.return;
    }

    public oooo_0 super() {
        return this.OO0000;
    }

    public if \u00d400000() {
        return this.oO0000;
    }

    public boolean super(F f2) {
        boolean bl = true;
        bl = this.\u00d500000.\u00d200000();
        if (bl && f2.o00000(B.class, 0) != null) {
            bl = this.\u00f500000.float();
        }
        if (bl) {
            for (int i2 = 0; i2 < f2.Object(B.\u00d400000); ++i2) {
                if (f2.o00000(B.\u00d400000, i2) == null || this.while.get(i2) == null) continue;
                bl = this.while.get(i2).\u00d4O0000();
            }
        }
        if (bl && f2.o00000(B.\u00f800000, 0) != null) {
            bl = this.return.super();
        }
        if (bl && (f2.o00000(B.OO0000, 0) != null || f2.o00000(B.\u00d600000, 0) != null)) {
            bl = this.OO0000.\u00d2O0000();
        }
        if (bl && f2.o00000(B.\u00d300000, 0) != null) {
            bl = this.oO0000.o00000();
        }
        if (bl && f2.o00000(B.\u00d200000, 0) != null) {
            boolean bl2 = bl = this.if.o00000() && this.\u00d300000.OO0000() && this.\u00d800000.return() && this.new.\u00f8O0000() && this.\u00f800000.O\u00d50000();
        }
        if (bl && f2.o00000(B.super, 0) != null) {
            bl = this.\u00f400000.thissuper();
        }
        if (bl && f2.o00000(B.int, 0) != null) {
            bl = this.o00000.o00000();
        }
        return bl;
    }

    private void super(F f2, helden.framework.held.object.oooo_1 oooo_12) {
        this.setSize(400, 600);
        this.\u00d500000 = new Q(f2);
        this.addTab("Allgemein", this.\u00d500000);
        this.while = new HashMap();
        if (f2.o00000(B.class, 0) != null) {
            this.\u00f500000 = new O(f2, oooo_12);
            this.addTab("Fernkampfwaffe", this.\u00f500000);
        }
        if (f2.o00000(B.\u00d400000, 0) != null) {
            for (int i2 = 0; i2 < f2.Object(B.\u00d400000); ++i2) {
                this.while.put(i2, new M(f2, i2, oooo_12));
                this.addTab("Nahkampfwaffe " + (i2 + 1), this.while.get(i2));
            }
        }
        if (f2.o00000(B.\u00f800000, 0) != null) {
            this.return = new OO0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO(f2);
            this.addTab("Munition", this.return);
        }
        if (f2.o00000(B.OO0000, 0) != null || f2.o00000(B.\u00d600000, 0) != null) {
            this.OO0000 = new oooo_0(f2);
            this.addTab("R\u00fcstung", this.OO0000);
        }
        if (f2.o00000(B.\u00d300000, 0) != null) {
            this.oO0000 = new if(f2);
            this.addTab("Schild", this.oO0000);
        }
        if (f2.o00000(B.\u00d200000, 0) != null) {
            this.if = new Objectsuper(f2);
            this.addTab("Eigenschaften", this.if);
            this.\u00d300000 = new G(f2);
            this.addTab("SF / Besondere Kampfregeln", this.\u00d300000.getPanel());
            this.new = new OOOo(f2);
            this.addTab("Vor- und Nachteile", this.new.getPanel());
            this.\u00d800000 = new class(f2);
            this.addTab("Angriffe", this.\u00d800000.getPanel());
            this.\u00f800000 = new oooo_1(f2);
            this.addTab("Talente", this.\u00f800000.getPanel());
        }
        if (f2.o00000(A.OO0000, 0) != null) {
            this.\u00d400000 = new oooo_3();
            this.addTab("Buch", this.\u00d400000);
        }
        if (f2.o00000(B.super, 0) != null) {
            this.\u00f400000 = new null(f2, oooo_12.\u00d800000().oO0000());
            this.addTab("Helden Modifizierer", this.\u00f400000.getPanel());
        }
        if (f2.o00000(B.int, 0) != null) {
            this.o00000 = new oooo_2(f2);
            this.addTab("Runen", this.o00000);
        }
    }
}

