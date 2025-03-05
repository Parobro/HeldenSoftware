/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.oOoO.B;

import helden.framework.held.object.oooo_1;
import helden.gui.A;
import helden.gui.components.JScrollPaneFast;
import helden.gui.super.oOoO.B.ooOO;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class String
extends JPanel
implements ActionListener {
    private oooo_1 \u00d300000;
    private ooOO o00000;
    private A \u00d200000;

    public String(A a2) {
        this.\u00d200000 = a2;
        this.setLayout(new BorderLayout());
        JLabel jLabel = new JLabel("Sonderfertigkeiten:");
        this.add((Component)jLabel, "North");
        JScrollPaneFast jScrollPaneFast = new JScrollPaneFast(this.o00000());
        jScrollPaneFast.getVerticalScrollBar().setUnitIncrement(10);
        jScrollPaneFast.getHorizontalScrollBar().setUnitIncrement(10);
        this.add((Component)jScrollPaneFast, "Center");
        JButton jButton = new JButton("Hinzuf\u00fcgen");
        jButton.addActionListener(this);
        this.add((Component)jButton, "South");
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (this.\u00d300000 != null) {
            new helden.gui.super.oOoO.oOOO.A(this.\u00d300000, this);
            this.new();
            this.\u00d200000.\u00d800000();
        }
    }

    public void o00000(oooo_1 oooo_12) {
        this.\u00d300000 = oooo_12;
        this.new();
    }

    private ooOO o00000() {
        if (this.o00000 == null) {
            this.o00000 = new ooOO();
        }
        return this.o00000;
    }

    private void new() {
        this.o00000().o00000(this.\u00d300000.\u00d800000());
    }
}

