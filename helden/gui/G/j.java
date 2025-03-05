/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.G;

import helden.framework.held.J;
import helden.framework.held.Object.O0OO;
import helden.framework.held.object.oooo_1;
import helden.framework.oooo.b_0;
import helden.gui.G.D;
import helden.gui.G.OOoO;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class j
extends D
implements ChangeListener {
    private OOoO o\u00d20000;
    private boolean \u00d3\u00d20000;
    private oooo_1 newnew;

    public j(O0OO o0OO2) {
        super(o0OO2);
        this.newnew = new oooo_1(o0OO2.\u00d800000());
        ArrayList<b_0> arrayList = new ArrayList<b_0>();
        Iterator<b_0> iterator = b_0.\u00d4\u00d60000();
        while (iterator.hasNext()) {
            arrayList.add(iterator.next());
        }
        arrayList.add(b_0.thispublicsuper);
        arrayList.add(b_0.\u00d3\u00f4\u00d2000);
        arrayList.add(b_0.\u00d8\u00f5\u00d2000);
        if (o0OO2.\u00d800000().oo0000()) {
            arrayList.add(b_0.\u00f4\u00f5\u00d2000);
        }
        if (o0OO2.\u00d800000().\u00d8\u00d20000()) {
            arrayList.add(b_0.\u00d4\u00f5\u00d2000);
        }
        this.o\u00d20000 = new OOoO(this, o0OO2, arrayList);
        for (b_0 b_02 : arrayList) {
            this.super(b_02);
        }
    }

    @Override
    public String \u00d200000() {
        return "<html>Setze die Eigenschaftswerte<br>Bitte die erste (Startwert) und letzte Spalte (Aktueller Wert) pr\u00fcfen";
    }

    @Override
    public JPanel super() {
        return this.o\u00d20000;
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        if (!this.\u00d3\u00d20000 && changeEvent.getSource() instanceof JSpinner) {
            JSpinner jSpinner = (JSpinner)changeEvent.getSource();
            J j2 = this.\u00d300000().\u00d3\u00d30000();
            String string = this.o\u00d20000.o00000((JSpinner)changeEvent.getSource());
            String string2 = string.substring(string.indexOf("-") + 1);
            b_0 b_02 = b_0.\u00f400000(string.substring(0, string.indexOf("-")));
            int n = (Integer)jSpinner.getValue();
            if (string2.equals("perm")) {
                if (b_02.equals(b_0.\u00f4\u00f5\u00d2000)) {
                    if (n <= 0) {
                        this.\u00d300000().\u00d3\u00d30000().super(b_02, n);
                    }
                } else {
                    this.\u00d300000().\u00d3\u00d30000().super(b_02, n);
                }
            } else if (string2.equals("gekauft") && n >= 0 && (j2.interface(b_02) > 0 || j2.\u00d200000(b_02) > n)) {
                this.\u00d300000().\u00d3\u00d30000().super(b_02, n);
            } else if (string2.equals("start")) {
                if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
                    if (n >= 1 && n <= 14) {
                        this.\u00d300000().\u00d3\u00d30000().\u00d200000(b_02, n);
                    }
                } else if (n >= 7 && n <= 16) {
                    this.\u00d300000().\u00d3\u00d30000().\u00d200000(b_02, n);
                }
            } else if (string2.equals("medi") && n >= 0) {
                if (b_02.equals(b_0.\u00f4\u00f5\u00d2000)) {
                    this.\u00d300000().\u00d3\u00d30000().\u00d400000(n);
                } else {
                    this.\u00d300000().\u00d3\u00d30000().\u00d600000(n);
                }
            }
            this.super(b_02);
            this.super(b_0.thispublicsuper);
            this.super(b_0.\u00d8\u00f5\u00d2000);
            this.super(b_0.\u00d3\u00f4\u00d2000);
            if (this.newnew.\u00d800000().oo0000()) {
                this.super(b_0.\u00f4\u00f5\u00d2000);
            }
        }
    }

    public void super(b_0 b_02) {
        this.\u00d3\u00d20000 = true;
        J j2 = this.\u00d300000().\u00d3\u00d30000();
        int n = j2.\u00f400000(b_02) + j2.int(b_02) + j2.\u00d2O0000(b_02);
        if (this.o\u00d20000.o00000(b_02.toString() + "-modi") != null) {
            this.o\u00d20000.o00000(b_02.toString() + "-modi").setValue(n);
            this.o\u00d20000.o00000(b_02.toString() + "-modi").setEnabled(false);
        }
        n = j2.\u00d3O0000(b_02);
        if (this.o\u00d20000.o00000(b_02.toString() + "-basis") != null) {
            this.o\u00d20000.o00000(b_02.toString() + "-basis").setValue(n);
            this.o\u00d20000.o00000(b_02.toString() + "-basis").setEnabled(false);
        }
        n = j2.do(b_02);
        this.o\u00d20000.o00000(b_02.toString() + "-akt").setValue(n);
        this.o\u00d20000.o00000(b_02.toString() + "-akt").setEnabled(false);
        n = j2.OO0000(b_02);
        this.o\u00d20000.o00000(b_02.toString() + "-start").setValue(n);
        n = j2.super(b_02);
        this.o\u00d20000.o00000(b_02.toString() + "-perm").setValue(n);
        this.o\u00d20000.o00000(b_02.toString() + "-gekauft").setEnabled(false);
        this.o\u00d20000.o00000(b_02.toString() + "-medi").setEnabled(false);
        n = j2.\u00d200000(b_02);
        JSpinner jSpinner = this.o\u00d20000.o00000(b_02.toString() + "-gekauft");
        jSpinner.setEnabled(true);
        jSpinner.setValue(n);
        jSpinner = this.o\u00d20000.o00000(b_02.toString() + "-medi");
        jSpinner.setEnabled(false);
        if (b_02.equals(b_0.\u00f4\u00f5\u00d2000)) {
            n = j2.\u00d4O0000();
            jSpinner.setEnabled(true);
            jSpinner.setValue(n);
        }
        if (b_02.equals(b_0.\u00d4\u00f5\u00d2000)) {
            n = j2.class();
            jSpinner.setEnabled(true);
            jSpinner.setValue(n);
        }
        this.o\u00d20000.new().repaint();
        this.\u00d3\u00d20000 = false;
    }

    @Override
    public boolean \u00d400000() {
        boolean bl = true;
        return bl;
    }
}

