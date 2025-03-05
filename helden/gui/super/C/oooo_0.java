/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.c;

import helden.framework.held.oO0O;
import helden.framework.held.object.oooo_1;
import helden.gui.super.C.G;
import helden.gui.super.C.J;
import helden.gui.super.C.O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.super.C.class;
import helden.gui.super.C.float;
import helden.gui.super.super;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/*
 * Renamed from helden.gui.super.C.ooOO
 */
public class oooo_0
implements ActionListener {
    private G o00000;
    private oooo_1 Object;
    private int \u00d500000;
    private super \u00d400000;
    private boolean \u00d200000 = false;

    public oooo_0(G g2, int n, super super_) {
        this.\u00d500000 = n;
        this.o00000 = g2;
        this.\u00d400000 = super_;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (this.Object == null) {
            return;
        }
        String string = ((JButton)actionEvent.getSource()).getName();
        if (string.equals("nkw")) {
            new O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO(this.o00000, this.Object, this.\u00d500000);
        }
        if (string.equals("fkw")) {
            new class(this.o00000, this.Object, this.\u00d500000);
        }
        if (string.equals("schilde")) {
            new float(this.o00000, this.Object, this.\u00d500000);
        }
        if (string.equals("ruestung")) {
            new J(this.o00000, this.Object, this.\u00d500000);
        }
        if (this.\u00d200000 != this.Object.\u00d800000().o00000(this.\u00d500000).\u00d3O0000()) {
            this.\u00d400000.o00000();
            this.\u00d200000 = this.Object.\u00d800000().o00000(this.\u00d500000).\u00d3O0000();
        }
        this.o00000();
    }

    public void o00000(oooo_1 oooo_12) {
        this.Object = oooo_12;
        if (oooo_12 == null) {
            return;
        }
        this.\u00d200000 = oooo_12.\u00d800000().o00000(this.\u00d500000).\u00d3O0000();
        this.o00000();
    }

    private void o00000() {
        oO0O oO0O2 = this.Object.\u00d800000().o00000(this.\u00d500000);
        if (oO0O2.\u00d3O0000(1) != null) {
            this.o00000.\u00d200000("Nahkampfwaffe 1").setText(oO0O2.\u00f8O0000(1).toString() + ", " + oO0O2.\u00d3O0000(1).o00000().O\u00d80000());
        } else {
            this.o00000.\u00d200000("Nahkampfwaffe 1").setText("");
        }
        if (oO0O2.\u00d3O0000(2) != null) {
            this.o00000.\u00d200000("Nahkampfwaffe 2").setText(oO0O2.\u00f8O0000(2).toString() + ", " + oO0O2.\u00d3O0000(2).o00000().O\u00d80000());
        } else {
            this.o00000.\u00d200000("Nahkampfwaffe 2").setText("");
        }
        if (oO0O2.\u00d3O0000(3) != null) {
            this.o00000.\u00d200000("Nahkampfwaffe 3").setText(oO0O2.\u00f8O0000(3).toString() + ", " + oO0O2.\u00d3O0000(3).o00000().O\u00d80000());
        } else {
            this.o00000.\u00d200000("Nahkampfwaffe 3").setText("");
        }
        if (oO0O2.\u00d3O0000(4) != null) {
            this.o00000.\u00d200000("Nahkampfwaffe 4").setText(oO0O2.\u00f8O0000(4).toString() + ", " + oO0O2.\u00d3O0000(4).o00000().O\u00d80000());
        } else {
            this.o00000.\u00d200000("Nahkampfwaffe 4").setText("");
        }
        if (oO0O2.\u00d3O0000(5) != null) {
            this.o00000.\u00d200000("Nahkampfwaffe 5").setText(oO0O2.\u00f8O0000(5).toString() + ", " + oO0O2.\u00d3O0000(5).o00000().O\u00d80000());
        } else {
            this.o00000.\u00d200000("Nahkampfwaffe 5").setText("");
        }
        if (oO0O2.\u00d500000(1) != null) {
            this.o00000.\u00d200000("Fernkampfwaffe 1").setText(oO0O2.\u00d500000(1).OO0000());
        } else {
            this.o00000.\u00d200000("Fernkampfwaffe 1").setText("");
        }
        if (oO0O2.\u00d500000(2) != null) {
            this.o00000.\u00d200000("Fernkampfwaffe 2").setText(oO0O2.\u00d500000(2).OO0000());
        } else {
            this.o00000.\u00d200000("Fernkampfwaffe 2").setText("");
        }
        if (oO0O2.\u00d500000(3) != null) {
            this.o00000.\u00d200000("Fernkampfwaffe 3").setText(oO0O2.\u00d500000(3).OO0000());
        } else {
            this.o00000.\u00d200000("Fernkampfwaffe 3").setText("");
        }
        if (oO0O2.\u00f5O0000(1) != null) {
            this.o00000.\u00d200000("Schild 1").setText(oO0O2.\u00f5O0000(1).OO0000());
        } else {
            this.o00000.\u00d200000("Schild 1").setText("");
        }
        if (oO0O2.\u00f5O0000(2) != null) {
            this.o00000.\u00d200000("Schild 2").setText(oO0O2.\u00f5O0000(2).OO0000());
        } else {
            this.o00000.\u00d200000("Schild 2").setText("");
        }
        if (oO0O2.\u00f800000(1) != null) {
            this.o00000.\u00d200000("R\u00fcstung 1").setText(oO0O2.\u00f800000(1).OO0000());
        } else {
            this.o00000.\u00d200000("R\u00fcstung 1").setText("");
        }
        if (oO0O2.\u00f800000(2) != null) {
            this.o00000.\u00d200000("R\u00fcstung 2").setText(oO0O2.\u00f800000(2).OO0000());
        } else {
            this.o00000.\u00d200000("R\u00fcstung 2").setText("");
        }
        if (oO0O2.\u00f800000(3) != null) {
            this.o00000.\u00d200000("R\u00fcstung 3").setText(oO0O2.\u00f800000(3).OO0000());
        } else {
            this.o00000.\u00d200000("R\u00fcstung 3").setText("");
        }
        if (oO0O2.\u00f800000(4) != null) {
            this.o00000.\u00d200000("R\u00fcstung 4").setText(oO0O2.\u00f800000(4).OO0000());
        } else {
            this.o00000.\u00d200000("R\u00fcstung 4").setText("");
        }
        if (oO0O2.\u00f800000(5) != null) {
            this.o00000.\u00d200000("R\u00fcstung 5").setText(oO0O2.\u00f800000(5).OO0000());
        } else {
            this.o00000.\u00d200000("R\u00fcstung 5").setText("");
        }
    }
}

