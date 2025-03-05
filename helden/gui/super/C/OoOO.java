/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.C;

import helden.framework.E.B;
import helden.framework.E.C.A;
import helden.framework.E.F;
import helden.framework.E.OoOO.D;
import helden.framework.e.oooo_0;
import helden.gui.allgemein.Utils;
import helden.gui.super.C.G;
import helden.gui.super.C.L;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class OoOO
implements ActionListener {
    private L o00000;
    private JDialog new;
    private F \u00d300000;
    private boolean \u00d400000 = false;

    public OoOO(G g2, F f2, oooo_0 oooo_02) {
        this.\u00d300000 = f2;
        this.o00000 = new L(this);
        this.o00000(oooo_02);
        this.new = new JDialog(Utils.getFrame(g2), "Waffenwerte bearbeiten", true);
        this.new.getContentPane().add(this.o00000);
        this.new.setSize(300, 200);
        Utils.zentriere(this.new);
        this.new.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == this.o00000.String()) {
            int n = (Integer)this.o00000.\u00f500000().getModel().getValue();
            int n2 = (Integer)this.o00000.\u00d600000().getModel().getValue();
            if (n2 > n) {
                JOptionPane.showConfirmDialog(this.o00000, "Das Minimum darf nicht gr\u00f6\u00dfer dem aktuellen Wert sein", "Minimum > Aktuell", -1);
            } else {
                D d2 = ((A)this.\u00d300000.o00000(B.\u00d400000, 0)).o00000();
                d2.o00000(n);
                d2.new(n2);
                this.\u00d400000 = true;
                this.new.setVisible(false);
            }
        }
        if (actionEvent.getSource() == this.o00000.\u00d200000()) {
            this.new.setVisible(false);
        }
    }

    public boolean o00000() {
        return this.\u00d400000;
    }

    public oooo_0 \u00d200000() {
        return (oooo_0)this.o00000.\u00d800000().getSelectedItem();
    }

    private void o00000(oooo_0 oooo_02) {
        this.o00000.o00000().setText(this.\u00d300000.OO0000());
        A a2 = (A)this.\u00d300000.o00000(B.\u00d400000, 0);
        this.o00000.\u00f500000().setModel(new SpinnerNumberModel(a2.o00000().\u00d300000(), -10, 13, 1));
        this.o00000.\u00d600000().setModel(new SpinnerNumberModel(a2.o00000().\u00d400000(), -10, 13, 1));
        ArrayList<oooo_0> arrayList = oooo_0.o00000(this.\u00d300000);
        HashSet<oooo_0> hashSet = new HashSet<oooo_0>(arrayList);
        for (Object object : hashSet.toArray()) {
            oooo_0 oooo_03 = (oooo_0)object;
            this.o00000.\u00d800000().addItem(oooo_03);
        }
        if (oooo_02 != null) {
            this.o00000.\u00d800000().setSelectedItem(oooo_02);
        }
    }
}

